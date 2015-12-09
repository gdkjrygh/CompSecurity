// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.a;
import com.facebook.m;
import com.facebook.n;
import com.facebook.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.b:
//            ac, ae, al, ab, 
//            af, ad

public final class aa
{

    private static final ae a = new ac(null);
    private static List b = e();
    private static Map c = f();
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static final List e = Arrays.asList(new Integer[] {
        Integer.valueOf(0x13354a2), Integer.valueOf(0x1335433), Integer.valueOf(0x13353e4), Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), 
        Integer.valueOf(0x133060d)
    });

    public static final int a()
    {
        return ((Integer)e.get(0)).intValue();
    }

    public static int a(Intent intent)
    {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    private static int a(List list, int ai[])
    {
        b();
        if (list == null)
        {
            return -1;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            int i = a(((ae)list.next()).b(), a(), ai);
            if (i != -1)
            {
                return i;
            }
        }

        return -1;
    }

    public static int a(TreeSet treeset, int i, int ai[])
    {
        int j;
        int k;
        j = ai.length;
        treeset = treeset.descendingIterator();
        k = -1;
        j--;
_L2:
        int l;
        if (treeset.hasNext())
        {
            l = ((Integer)treeset.next()).intValue();
            k = Math.max(k, l);
            for (; j >= 0 && ai[j] > l; j--) { }
            if (j >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        return -1;
        if (ai[j] != l) goto _L2; else goto _L1
_L1:
        if (j % 2 == 0)
        {
            return Math.min(k, i);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static Intent a(Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (ae)iterator.next();
            obj = b(context, (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((ae) (obj)).a()).addCategory("android.intent.category.DEFAULT"), ((ae) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    static Intent a(Context context, Intent intent, ae ae1)
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
            if (!ae1.a(context, resolveinfo.activityInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    public static Intent a(Context context, String s1, Collection collection, String s2, boolean flag, boolean flag1, a a1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (ae)iterator.next();
            Intent intent = (new Intent()).setClassName(((ae) (obj)).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s1);
            if (!com.facebook.b.al.a(collection))
            {
                intent.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!com.facebook.b.al.a(s2))
            {
                intent.putExtra("e2e", s2);
            }
            intent.putExtra("response_type", "token,signed_request");
            intent.putExtra("return_scopes", "true");
            if (flag1)
            {
                intent.putExtra("default_audience", a1.a());
            }
            intent.putExtra("legacy_override", "v2.3");
            if (flag)
            {
                intent.putExtra("auth_type", "rerequest");
            }
            obj = a(context, intent, ((ae) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Intent a(Intent intent, Bundle bundle, m m1)
    {
        UUID uuid = b(intent);
        if (uuid == null)
        {
            intent = null;
        } else
        {
            Intent intent1 = new Intent();
            intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", a(intent));
            intent = new Bundle();
            intent.putString("action_id", uuid.toString());
            if (m1 != null)
            {
                intent.putBundle("error", a(m1));
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

    public static Bundle a(m m1)
    {
        Bundle bundle;
        if (m1 == null)
        {
            bundle = null;
        } else
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("error_description", m1.toString());
            bundle = bundle1;
            if (m1 instanceof n)
            {
                bundle1.putString("error_type", "UserCanceled");
                return bundle1;
            }
        }
        return bundle;
    }

    public static m a(Bundle bundle)
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
            return new n(s2);
        } else
        {
            return new m(s2);
        }
    }

    static TreeSet a(ae ae1)
    {
        return b(ae1);
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

    static Intent b(Context context, Intent intent, ae ae1)
    {
        if (intent == null)
        {
            intent = null;
        } else
        {
            ResolveInfo resolveinfo = context.getPackageManager().resolveService(intent, 0);
            if (resolveinfo == null)
            {
                return null;
            }
            if (!ae1.a(context, resolveinfo.serviceInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    private static TreeSet b(ae ae1)
    {
        Object obj;
        Object obj1;
        TreeSet treeset;
        Uri uri;
        obj1 = null;
        treeset = new TreeSet();
        obj = s.f().getContentResolver();
        uri = c(ae1);
        if (s.f().getPackageManager().resolveContentProvider((new StringBuilder()).append(ae1.a()).append(".provider.PlatformProvider").toString(), 0) == null) goto _L2; else goto _L1
_L1:
        ae1 = ((ContentResolver) (obj)).query(uri, new String[] {
            "version"
        }, null, null, null);
        obj = ae1;
        if (ae1 == null) goto _L4; else goto _L3
_L3:
        obj = ae1;
        if (!ae1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        treeset.add(Integer.valueOf(ae1.getInt(ae1.getColumnIndex("version"))));
        if (true) goto _L3; else goto _L4
        obj;
_L6:
        if (ae1 != null)
        {
            ae1.close();
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
        ae1 = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static UUID b(Intent intent)
    {
        if (intent != null)
        {
            if (a(a(intent)))
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
            s.d().execute(new ab());
            return;
        }
    }

    private static Uri c(ae ae1)
    {
        return Uri.parse((new StringBuilder()).append("content://").append(ae1.a()).append(".provider.PlatformProvider/versions").toString());
    }

    public static Bundle c(Intent intent)
    {
        if (!a(a(intent)))
        {
            return intent.getExtras();
        } else
        {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
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

    private static List e()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a);
        arraylist.add(new af(null));
        return arraylist;
    }

    private static Map f()
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ad(null));
        hashmap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
        hashmap.put("com.facebook.platform.action.request.FEED_DIALOG", b);
        hashmap.put("com.facebook.platform.action.request.LIKE_DIALOG", b);
        hashmap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
        hashmap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arraylist);
        hashmap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arraylist);
        return hashmap;
    }

}
