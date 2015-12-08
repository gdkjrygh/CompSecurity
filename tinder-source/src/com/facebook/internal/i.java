// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.g;
import com.facebook.login.DefaultAudience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//            m

public final class i
{
    private static final class a extends c
    {

        protected final String a()
        {
            return "com.facebook.katana";
        }

        private a()
        {
            super((byte)0);
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b extends c
    {

        protected final String a()
        {
            return "com.facebook.orca";
        }

        private b()
        {
            super((byte)0);
        }

        b(byte byte0)
        {
            this();
        }
    }

    private static abstract class c
    {

        private static final HashSet b;
        TreeSet a;

        static void a(c c1)
        {
            c1.a(true);
        }

        public static boolean a(Context context, String s)
        {
            String s1;
            int j;
            s1 = Build.BRAND;
            j = context.getApplicationInfo().flags;
            if (!s1.startsWith("generic") || (j & 2) == 0) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            int k;
            int l;
            try
            {
                context = context.getPackageManager().getPackageInfo(s, 64);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            context = ((PackageInfo) (context)).signatures;
            l = context.length;
            k = 0;
label0:
            do
            {
label1:
                {
                    if (k >= l)
                    {
                        break label1;
                    }
                    s = m.a(context[k].toByteArray());
                    if (b.contains(s))
                    {
                        break label0;
                    }
                    k++;
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            return false;
        }

        protected abstract String a();

        final void a(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_13;
            }
            if (a != null)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            a = i.a(this);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        static 
        {
            HashSet hashset = new HashSet();
            hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
            hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
            hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
            b = hashset;
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }

    private static final class d extends c
    {

        protected final String a()
        {
            return "com.facebook.wakizashi";
        }

        private d()
        {
            super((byte)0);
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final c a;
    private static List b;
    private static Map c;
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static final List e = Arrays.asList(new Integer[] {
        Integer.valueOf(0x13354a2), Integer.valueOf(0x1335433), Integer.valueOf(0x13353e4), Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), 
        Integer.valueOf(0x133060d)
    });

    public static final int a()
    {
        return ((Integer)e.get(0)).intValue();
    }

    public static int a(int j)
    {
        int ai[];
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = b;
        ai = new int[1];
        ai[0] = j;
        b();
        j = byte0;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L8:
        Object obj1;
        int k;
        int l;
        j = byte0;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (c)((Iterator) (obj)).next();
        if (((c) (obj1)).a == null)
        {
            ((c) (obj1)).a(false);
        }
        obj1 = ((c) (obj1)).a;
        l = a();
        obj1 = ((TreeSet) (obj1)).descendingIterator();
        k = -1;
        j = 0;
_L7:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = ((Integer)((Iterator) (obj1)).next()).intValue();
        k = Math.max(k, i1);
        for (; j >= 0 && ai[j] > i1; j--) { }
        if (j < 0) goto _L4; else goto _L5
_L5:
        if (ai[j] != i1) goto _L7; else goto _L6
_L6:
        if (j % 2 == 0)
        {
            j = Math.min(k, l);
        } else
        {
            j = -1;
        }
_L9:
        if (j == -1) goto _L8; else goto _L2
_L2:
        return j;
_L4:
        j = -1;
          goto _L9
        if (true) goto _L8; else goto _L10
_L10:
    }

    public static Intent a(Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (c)iterator.next();
            obj = (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((c) (obj)).a()).addCategory("android.intent.category.DEFAULT");
            if (obj == null)
            {
                obj = null;
            } else
            {
                ResolveInfo resolveinfo = context.getPackageManager().resolveService(((Intent) (obj)), 0);
                if (resolveinfo == null)
                {
                    obj = null;
                } else
                if (!c.a(context, resolveinfo.serviceInfo.packageName))
                {
                    obj = null;
                }
            }
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Intent a(Context context, String s, Collection collection, String s1, boolean flag, boolean flag1, DefaultAudience defaultaudience)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (c)iterator.next();
            obj = (new Intent()).setClassName(((c) (obj)).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s);
            if (!m.a(collection))
            {
                ((Intent) (obj)).putExtra("scope", TextUtils.join(",", collection));
            }
            if (!m.a(s1))
            {
                ((Intent) (obj)).putExtra("e2e", s1);
            }
            ((Intent) (obj)).putExtra("response_type", "token,signed_request");
            ((Intent) (obj)).putExtra("return_scopes", "true");
            if (flag1)
            {
                ((Intent) (obj)).putExtra("default_audience", defaultaudience.e);
            }
            ((Intent) (obj)).putExtra("legacy_override", "v2.4");
            if (flag)
            {
                ((Intent) (obj)).putExtra("auth_type", "rerequest");
            }
            if (obj == null)
            {
                obj = null;
            } else
            {
                ResolveInfo resolveinfo = context.getPackageManager().resolveActivity(((Intent) (obj)), 0);
                if (resolveinfo == null)
                {
                    obj = null;
                } else
                if (!c.a(context, resolveinfo.activityInfo.packageName))
                {
                    obj = null;
                }
            }
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Intent a(Intent intent, Bundle bundle, FacebookException facebookexception)
    {
        Object obj;
        Intent intent1;
        Bundle bundle2;
        obj = null;
        UUID uuid = b(intent);
        if (uuid == null)
        {
            return null;
        }
        intent1 = new Intent();
        intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
        bundle2 = new Bundle();
        bundle2.putString("action_id", uuid.toString());
        if (facebookexception == null) goto _L2; else goto _L1
_L1:
        if (facebookexception != null) goto _L4; else goto _L3
_L3:
        intent = obj;
_L6:
        bundle2.putBundle("error", intent);
_L2:
        intent1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null)
        {
            intent1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent1;
_L4:
        Bundle bundle1 = new Bundle();
        bundle1.putString("error_description", facebookexception.toString());
        intent = bundle1;
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            bundle1.putString("error_type", "UserCanceled");
            intent = bundle1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Bundle a(Intent intent)
    {
        if (!b(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
        {
            return intent.getExtras();
        } else
        {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        }
    }

    public static FacebookException a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        String s1 = bundle.getString("error_type");
        String s = s1;
        if (s1 == null)
        {
            s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String s2 = bundle.getString("error_description");
        s1 = s2;
        if (s2 == null)
        {
            s1 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (s != null && s.equalsIgnoreCase("UserCanceled"))
        {
            return new FacebookOperationCanceledException(s1);
        } else
        {
            return new FacebookException(s1);
        }
    }

    static TreeSet a(c c1)
    {
        return b(c1);
    }

    private static TreeSet b(c c1)
    {
        Object obj;
        Object obj1;
        TreeSet treeset;
        Uri uri;
        obj1 = null;
        treeset = new TreeSet();
        obj = g.g().getContentResolver();
        uri = Uri.parse((new StringBuilder("content://")).append(c1.a()).append(".provider.PlatformProvider/versions").toString());
        if (g.g().getPackageManager().resolveContentProvider((new StringBuilder()).append(c1.a()).append(".provider.PlatformProvider").toString(), 0) == null) goto _L2; else goto _L1
_L1:
        c1 = ((ContentResolver) (obj)).query(uri, new String[] {
            "version"
        }, null, null, null);
        obj = c1;
        if (c1 == null) goto _L4; else goto _L3
_L3:
        obj = c1;
        if (!c1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        treeset.add(Integer.valueOf(c1.getInt(c1.getColumnIndex("version"))));
        if (true) goto _L3; else goto _L4
        obj;
_L6:
        if (c1 != null)
        {
            c1.close();
        }
        throw obj;
_L2:
        obj = null;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return treeset;
        obj;
        c1 = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static UUID b(Intent intent)
    {
        if (intent != null)
        {
            if (b(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
            {
                intent = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (intent != null)
                {
                    intent = intent.getString("action_id");
                } else
                {
                    intent = null;
                }
            } else
            {
                intent = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (intent != null)
            {
                try
                {
                    intent = UUID.fromString(intent);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    return null;
                }
                return intent;
            }
        }
        return null;
    }

    public static void b()
    {
        if (!d.compareAndSet(false, true))
        {
            return;
        } else
        {
            g.e().execute(new Runnable() {

                public final void run()
                {
                    for (Iterator iterator = i.c().iterator(); iterator.hasNext(); c.a((c)iterator.next())) { }
                    break MISSING_BLOCK_LABEL_43;
                    Exception exception;
                    exception;
                    i.d().set(false);
                    throw exception;
                    i.d().set(false);
                    return;
                }

            });
            return;
        }
    }

    private static boolean b(int j)
    {
        return e.contains(Integer.valueOf(j)) && j >= 0x133529d;
    }

    static List c()
    {
        return b;
    }

    static AtomicBoolean d()
    {
        return d;
    }

    static 
    {
        a = new a((byte)0);
        Object obj = new ArrayList();
        ((List) (obj)).add(a);
        ((List) (obj)).add(new d((byte)0));
        b = ((List) (obj));
        obj = new HashMap();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new b((byte)0));
        ((Map) (obj)).put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.FEED_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.LIKE_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.MESSAGE_DIALOG", arraylist);
        ((Map) (obj)).put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arraylist);
        c = ((Map) (obj));
    }
}
