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
import com.facebook.login.a;
import com.facebook.p;
import com.facebook.q;
import com.facebook.s;
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
//            U, O

public final class N
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

        public static boolean a(Context context, String s1)
        {
            String s2;
            int i;
            s2 = Build.BRAND;
            i = context.getApplicationInfo().flags;
            if (!s2.startsWith("generic") || (i & 2) == 0) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            int j;
            int k;
            try
            {
                context = context.getPackageManager().getPackageInfo(s1, 64);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            context = ((PackageInfo) (context)).signatures;
            k = context.length;
            j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= k)
                    {
                        break label1;
                    }
                    s1 = com.facebook.internal.U.a(context[j].toByteArray());
                    if (b.contains(s1))
                    {
                        break label0;
                    }
                    j++;
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
            a = com.facebook.internal.N.a(this);
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

    public static int a(String s1, int ai[])
    {
        return a((List)c.get(s1), ai);
    }

    private static int a(List list, int ai[])
    {
        b();
        if (list != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        list = list.iterator();
_L4:
        if (!list.hasNext()) goto _L1; else goto _L3
_L3:
        int i;
        Object obj = (c)list.next();
        if (((c) (obj)).a == null)
        {
            ((c) (obj)).a(false);
        }
        obj = ((c) (obj)).a;
        int k = a();
        i = ai.length;
        obj = ((TreeSet) (obj)).descendingIterator();
        int j = -1;
        i--;
        int l;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_164;
            }
            l = ((Integer)((Iterator) (obj)).next()).intValue();
            j = Math.max(j, l);
            for (; i >= 0 && ai[i] > l; i--) { }
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_164;
            }
        } while (ai[i] != l);
        if (i % 2 == 0)
        {
            i = Math.min(j, k);
        } else
        {
            i = -1;
        }
_L5:
        if (i != -1)
        {
            return i;
        }
          goto _L4
          goto _L1
        i = -1;
          goto _L5
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
                if (!com.facebook.internal.c.a(context, resolveinfo.serviceInfo.packageName))
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

    private static Intent a(Context context, Intent intent)
    {
        if (intent == null)
        {
            intent = null;
        } else
        {
            ResolveInfo resolveinfo = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveinfo == null)
            {
                return null;
            }
            if (!com.facebook.internal.c.a(context, resolveinfo.activityInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    public static Intent a(Context context, String s1, String s2, int i, Bundle bundle)
    {
        Object obj = (List)c.get(s2);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        Intent intent;
        Iterator iterator;
        if (obj == null)
        {
            return null;
        } else
        {
            a(((Intent) (obj)), s1, s2, i, bundle);
            return ((Intent) (obj));
        }
_L2:
        iterator = ((List) (obj)).iterator();
        obj = null;
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj = (c)iterator.next();
        intent = a(context, (new Intent()).setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(((c) (obj)).a()).addCategory("android.intent.category.DEFAULT"));
        obj = intent;
        if (intent == null) goto _L6; else goto _L5
_L5:
        obj = intent;
          goto _L4
    }

    public static Intent a(Context context, String s1, Collection collection, String s2, boolean flag, boolean flag1, com.facebook.login.a a1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (c)iterator.next();
            obj = (new Intent()).setClassName(((c) (obj)).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s1);
            if (!com.facebook.internal.U.a(collection))
            {
                ((Intent) (obj)).putExtra("scope", TextUtils.join(",", collection));
            }
            if (!com.facebook.internal.U.a(s2))
            {
                ((Intent) (obj)).putExtra("e2e", s2);
            }
            ((Intent) (obj)).putExtra("response_type", "token,signed_request");
            ((Intent) (obj)).putExtra("return_scopes", "true");
            if (flag1)
            {
                ((Intent) (obj)).putExtra("default_audience", a1.e);
            }
            ((Intent) (obj)).putExtra("legacy_override", "v2.4");
            if (flag)
            {
                ((Intent) (obj)).putExtra("auth_type", "rerequest");
            }
            obj = a(context, ((Intent) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Intent a(Intent intent, Bundle bundle, p p1)
    {
        UUID uuid = a(intent);
        if (uuid == null)
        {
            intent = null;
        } else
        {
            Intent intent1 = new Intent();
            intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
            intent = new Bundle();
            intent.putString("action_id", uuid.toString());
            if (p1 != null)
            {
                intent.putBundle("error", a(p1));
            }
            intent1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", intent);
            intent = intent1;
            if (bundle != null)
            {
                intent1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                return intent1;
            }
        }
        return intent;
    }

    public static Bundle a(p p1)
    {
        Bundle bundle;
        if (p1 == null)
        {
            bundle = null;
        } else
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("error_description", p1.toString());
            bundle = bundle1;
            if (p1 instanceof q)
            {
                bundle1.putString("error_type", "UserCanceled");
                return bundle1;
            }
        }
        return bundle;
    }

    public static p a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        String s2 = bundle.getString("error_type");
        String s1 = s2;
        if (s2 == null)
        {
            s1 = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String s3 = bundle.getString("error_description");
        s2 = s3;
        if (s3 == null)
        {
            s2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (s1 != null && s1.equalsIgnoreCase("UserCanceled"))
        {
            return new q(s2);
        } else
        {
            return new p(s2);
        }
    }

    static TreeSet a(c c1)
    {
        return b(c1);
    }

    public static UUID a(Intent intent)
    {
        if (intent != null)
        {
            if (a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
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

    public static void a(Intent intent, String s1, String s2, int i, Bundle bundle)
    {
        String s4 = s.h();
        String s3 = s.i();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", s2).putExtra("com.facebook.platform.extra.APPLICATION_ID", s4);
        if (a(i))
        {
            s2 = new Bundle();
            s2.putString("action_id", s1);
            com.facebook.internal.U.a(s2, "app_name", s3);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", s2);
            s1 = bundle;
            if (bundle == null)
            {
                s1 = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", s1);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", s1);
        if (!com.facebook.internal.U.a(s3))
        {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", s3);
        }
        intent.putExtras(bundle);
    }

    public static boolean a(int i)
    {
        return e.contains(Integer.valueOf(i)) && i >= 0x133529d;
    }

    public static int b(int i)
    {
        return a(b, new int[] {
            i
        });
    }

    public static Bundle b(Intent intent)
    {
        if (!a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
        {
            return intent.getExtras();
        } else
        {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        }
    }

    private static TreeSet b(c c1)
    {
        Object obj;
        Object obj1;
        TreeSet treeset;
        Uri uri;
        obj1 = null;
        treeset = new TreeSet();
        obj = s.f().getContentResolver();
        uri = Uri.parse((new StringBuilder("content://")).append(c1.a()).append(".provider.PlatformProvider/versions").toString());
        if (s.f().getPackageManager().resolveContentProvider((new StringBuilder()).append(c1.a()).append(".provider.PlatformProvider").toString(), 0) == null) goto _L2; else goto _L1
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

    public static void b()
    {
        if (!d.compareAndSet(false, true))
        {
            return;
        } else
        {
            s.d().execute(new O());
            return;
        }
    }

    public static Bundle c(Intent intent)
    {
        int i = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        intent = intent.getExtras();
        if (!a(i) || intent == null)
        {
            return intent;
        } else
        {
            return intent.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        }
    }

    static List c()
    {
        return b;
    }

    static AtomicBoolean d()
    {
        return d;
    }

    public static boolean d(Intent intent)
    {
        Bundle bundle = f(intent);
        if (bundle != null)
        {
            return bundle.containsKey("error");
        } else
        {
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
    }

    public static Bundle e(Intent intent)
    {
        if (!d(intent))
        {
            return null;
        }
        Bundle bundle = f(intent);
        if (bundle != null)
        {
            return bundle.getBundle("error");
        } else
        {
            return intent.getExtras();
        }
    }

    private static Bundle f(Intent intent)
    {
        if (!a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
        {
            return null;
        } else
        {
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
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
