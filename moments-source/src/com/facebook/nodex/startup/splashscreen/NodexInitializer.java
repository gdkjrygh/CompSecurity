// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.DexDiagnostics;
import com.facebook.common.dextricks.DexErrorRecoveryInfo;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.nodex.resources.NodexResources;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.nodex.startup.splashscreen:
//            NodexError

public class NodexInitializer
{

    private static final String a = com/facebook/nodex/startup/splashscreen/NodexInitializer.getSimpleName();
    private final Context b;
    private final NodexResources c;
    private final PackageManager d;
    private final String e;
    private final List f;
    private DexErrorRecoveryInfo g;

    public NodexInitializer(Context context)
    {
        b = context;
        c = new NodexResources(b);
        d = context.getPackageManager();
        e = context.getPackageName();
        g = null;
        context = new ArrayList();
        context.add(new NoDiskSpaceDexExceptionHandler());
        context.add(new PermissionDeniedDexExceptionHandler());
        context.add(new DataDirectoryNotOwnedByUserDexExceptionHandler());
        context.add(new ReadOnlyFileSystemDexExceptionHandler());
        context.add(new CorruptedApplicationStateExceptionHandler());
        context.add(new UnsatisfiedLinkErrorDexExceptionHandler());
        context.add(new CorruptedXzDexExceptionHandler());
        context.add(new NativeCodeBrokenExceptionHandler());
        f = Collections.unmodifiableList(context);
    }

    static Context a(NodexInitializer nodexinitializer)
    {
        return nodexinitializer.b;
    }

    private static String a(String s)
    {
        if ("armeabi-v7a".equals(s))
        {
            return "armv7";
        }
        if ("armeabi".equals(s))
        {
            return "arm";
        } else
        {
            return null;
        }
    }

    static String[] a(String as[])
    {
        return b(as);
    }

    static String b(NodexInitializer nodexinitializer)
    {
        return nodexinitializer.e();
    }

    private static String[] b(String as[])
    {
        String as1[] = as;
        if (as[0].equals("x86"))
        {
            as1 = (new String[] {
                as[0]
            });
        }
        return as1;
    }

    static NodexResources c(NodexInitializer nodexinitializer)
    {
        return nodexinitializer.c;
    }

    static String c()
    {
        return a;
    }

    private static boolean d()
    {
        String as1[] = BuildConstants.f().split(",");
        String as[];
        int k;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            as = LollipopCpuArchitectures.a();
        } else
        {
            as = b(new String[] {
                Build.CPU_ABI, Build.CPU_ABI2
            });
        }
        k = as1.length;
        for (int i = 0; i < k; i++)
        {
            String s = as1[i];
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s1 = as[j];
                if (s.equals(s1) || s.equals(a(s1)))
                {
                    return false;
                }
            }

        }

        return true;
    }

    private String e()
    {
        String s = f();
        if (s != null)
        {
            return b.getString(c.c("nodex_uninstall_message_store_string"), new Object[] {
                s
            });
        } else
        {
            return b.getString(c.c("nodex_uninstall_message_string"));
        }
    }

    private String f()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("com.android.vending", Integer.valueOf(1));
        hashmap.put("com.google.market", Integer.valueOf(2));
        hashmap.put("com.amazon.venezia", Integer.valueOf(3));
        Object obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("market://details?id=")).append(e).toString()));
        List list = d.queryIntentActivities(((Intent) (obj)), 0x10000);
        obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("amzn://apps/android?p=")).append(e).toString()));
        list.addAll(d.queryIntentActivities(((Intent) (obj)), 0x10000));
        if (list.isEmpty())
        {
            return null;
        }
        obj = (ResolveInfo)list.get(0);
        Iterator iterator = list.iterator();
        int i = 0x7fffffff;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
            Integer integer = (Integer)hashmap.get(resolveinfo.activityInfo.packageName);
            if (integer != null && integer.intValue() < i)
            {
                i = integer.intValue();
                obj = resolveinfo;
            }
        } while (true);
        return ((ResolveInfo) (obj)).loadLabel(d).toString();
    }

    public final NodexError a()
    {
        g = null;
        DexDiagnostics dexdiagnostics = new DexDiagnostics(b.getApplicationContext());
        if (android.os.Build.VERSION.SDK_INT == 11)
        {
            return NodexError.b(b).a("nodex_cannot_launch_fb_app_string").c("nodex_unsupported_android_version_string").a(new Exception("Unsupported android version (Honeycomb 3.0)")).a(NodexErrorActivity.Action.NONE).a();
        }
        if (d())
        {
            return NodexError.b(b).a("nodex_cannot_launch_fb_app_string").c("nodex_unsupported_cpu_architecture_string").a(new Exception("Unsupported CPU architecture")).a(NodexErrorActivity.Action.UNINSTALL).a();
        }
        if (!dexdiagnostics.a())
        {
            return NodexError.b(b).a("nodex_cannot_launch_fb_app_string").b(e()).a(new IOException("Directory owner uid does not match process uid")).a(NodexErrorActivity.Action.UNINSTALL).a();
        }
        try
        {
            g = DexLibLoader.a(b, BuildConstants.c());
        }
        catch (Throwable throwable)
        {
            for (Iterator iterator = f.iterator(); iterator.hasNext();)
            {
                NodexError nodexerror = ((EnsureDexExceptionHandler)iterator.next()).a(throwable);
                if (nodexerror != null)
                {
                    return nodexerror;
                }
            }

            throw new RuntimeException("Failed to ensure dexs.", throwable);
        }
        return null;
    }

    public final boolean b()
    {
        return g != null && g.c;
    }


    private class NoDiskSpaceDexExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            long l;
            long l1;
            l1 = 0x7fffffffffffffffL;
            l = l1;
            StatFs statfs = new StatFs(NodexInitializer.a(a).getFilesDir().getAbsolutePath());
            l = l1;
            long l2 = statfs.getAvailableBlocks();
            l = l1;
            l1 = (long)statfs.getBlockSize() * l2;
            l = l1;
            NodexInitializer.c();
            l = l1;
_L2:
            if (NodexExceptionUtil.a(throwable, java/io/IOException, "No space left on device") != null || l < 0x600000L)
            {
                String s = "nodex_not_enough_space_string";
                if ((new SDInstallChecker(NodexInitializer.a(a), new SDInstallCheckerDeps())).a())
                {
                    s = "nodex_not_enough_space_promote_sd_move_string";
                }
                return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").c(s).a(throwable).a(NodexErrorActivity.Action.APP_SETTINGS).a();
            } else
            {
                return null;
            }
            Throwable throwable1;
            throwable1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        NoDiskSpaceDexExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class PermissionDeniedDexExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            if (NodexExceptionUtil.a(throwable, java/io/FileNotFoundException, "Permission denied") != null)
            {
                return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").b(NodexInitializer.b(a)).a(throwable).a(NodexErrorActivity.Action.UNINSTALL).a();
            } else
            {
                return null;
            }
        }

        PermissionDeniedDexExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class DataDirectoryNotOwnedByUserDexExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            if (NodexExceptionUtil.a(throwable, java/lang/IllegalArgumentException, "is not owned by the current user") != null)
            {
                return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").b(NodexInitializer.b(a)).a(throwable).a(NodexErrorActivity.Action.UNINSTALL).a();
            } else
            {
                return null;
            }
        }

        DataDirectoryNotOwnedByUserDexExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class ReadOnlyFileSystemDexExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            if (NodexExceptionUtil.a(throwable, java/io/FileNotFoundException, "Read-only file system") != null)
            {
                return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").c("nodex_reboot_string").a(throwable).a(NodexErrorActivity.Action.NONE).a();
            } else
            {
                return null;
            }
        }

        ReadOnlyFileSystemDexExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class CorruptedApplicationStateExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            Throwable throwable1;
            Object obj = null;
            throwable1 = NodexExceptionUtil.a(throwable, com/facebook/common/dextricks/CorruptedApplicationStateException, null);
            throwable = obj;
            if (throwable1 == null) goto _L2; else goto _L1
_L1:
            NodexErrorActivity.Action action;
            throwable = (CorruptedApplicationStateException)throwable1;
            action = NodexErrorActivity.Action.NONE;
            _cls1.a[throwable.a().ordinal()];
            JVM INSTR tableswitch 1 2: default 60
        //                       1 98
        //                       2 113;
               goto _L3 _L4 _L5
_L3:
            throwable = null;
_L7:
            throwable = NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").b(throwable).a(throwable1.getCause()).a(action).a();
_L2:
            return throwable;
_L4:
            action = NodexErrorActivity.Action.UNINSTALL;
            throwable = NodexInitializer.b(a);
            continue; /* Loop/switch isn't completed */
_L5:
            action = NodexErrorActivity.Action.NONE;
            int i = NodexInitializer.c(a).c("nodex_reboot_string");
            throwable = NodexInitializer.a(a).getString(i);
            if (true) goto _L7; else goto _L6
_L6:
        }

        CorruptedApplicationStateExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }

        private class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.values().length];
                try
                {
                    a[com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REINSTALL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REBOOT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class UnsatisfiedLinkErrorDexExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            if (NodexExceptionUtil.a(throwable, java/lang/UnsatisfiedLinkError, "xzdecoder") != null)
            {
                return NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").b(NodexInitializer.b(a)).a(throwable).a(NodexErrorActivity.Action.UNINSTALL).a();
            } else
            {
                return null;
            }
        }

        UnsatisfiedLinkErrorDexExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class CorruptedXzDexExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            NodexError nodexerror = null;
            if (NodexExceptionUtil.a(throwable, org/tukaani/xz/XZIOException, null) != null)
            {
                nodexerror = NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").b(NodexInitializer.b(a)).a(throwable).a(NodexErrorActivity.Action.UNINSTALL).a();
            }
            return nodexerror;
        }

        CorruptedXzDexExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class NativeCodeBrokenExceptionHandler
        implements EnsureDexExceptionHandler
    {

        final NodexInitializer a;

        public final NodexError a(Throwable throwable)
        {
            NodexError nodexerror = null;
            if (NodexExceptionUtil.a(throwable, com/facebook/common/dextricks/DexLibLoader$NativeCodeBrokenException, null) != null)
            {
                nodexerror = NodexError.b(NodexInitializer.a(a)).a("nodex_cannot_launch_fb_app_string").c("nodex_unsupported_android_version_string").a(throwable).a(NodexErrorActivity.Action.NONE).a();
            }
            return nodexerror;
        }

        NativeCodeBrokenExceptionHandler()
        {
            a = NodexInitializer.this;
            super();
        }
    }


    private class LollipopCpuArchitectures
    {

        static String[] a()
        {
            return b();
        }

        private static String[] b()
        {
            return NodexInitializer.a(Build.SUPPORTED_32_BIT_ABIS);
        }

        private LollipopCpuArchitectures()
        {
        }
    }


    private class EnsureDexExceptionHandler
    {

        public abstract NodexError a(Throwable throwable);
    }

}
