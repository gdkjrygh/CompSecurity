// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

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
import com.facebook.l;
import com.facebook.login.a;
import com.facebook.m;
import com.facebook.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            an, aq, ao, ap, 
//            aw

public final class am
{

    private static final ap a;
    private static List b;
    private static Map c;
    private static final List d = Arrays.asList(new Integer[] {
        Integer.valueOf(0x13354a2), Integer.valueOf(0x1335433), Integer.valueOf(0x13353e4), Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), 
        Integer.valueOf(0x133060d)
    });

    public static final int a()
    {
        return ((Integer)d.get(0)).intValue();
    }

    public static int a(int i)
    {
        return a(b, new int[] {
            i
        });
    }

    public static int a(String s, int ai[])
    {
        return a((List)c.get(s), ai);
    }

    private static int a(List list, int ai[])
    {
        if (list != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        list = list.iterator();
_L4:
        if (!list.hasNext()) goto _L1; else goto _L3
_L3:
        int i;
        Object obj = a((ap)list.next());
        int k = a();
        i = ai.length;
        obj = ((TreeSet) (obj)).descendingIterator();
        int j = -1;
        i--;
        int i1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_147;
            }
            i1 = ((Integer)((Iterator) (obj)).next()).intValue();
            j = Math.max(j, i1);
            for (; i >= 0 && ai[i] > i1; i--) { }
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_147;
            }
        } while (ai[i] != i1);
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
            Object obj = (ap)iterator.next();
            obj = a(context, (new Intent()).setClassName(((ap) (obj)).a(), "com.facebook.katana.platform.TokenRefreshService"));
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
            ResolveInfo resolveinfo = context.getPackageManager().resolveService(intent, 0);
            if (resolveinfo == null)
            {
                return null;
            }
            if (!com.facebook.internal.ap.a(context, resolveinfo.serviceInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    public static Intent a(Context context, String s, Collection collection, String s1, boolean flag, a a1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (ap)iterator.next();
            obj = (new Intent()).setClassName(((ap) (obj)).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s);
            if (!com.facebook.internal.aw.a(collection))
            {
                ((Intent) (obj)).putExtra("scope", TextUtils.join(",", collection));
            }
            if (!com.facebook.internal.aw.a(s1))
            {
                ((Intent) (obj)).putExtra("e2e", s1);
            }
            ((Intent) (obj)).putExtra("response_type", "token,signed_request");
            ((Intent) (obj)).putExtra("return_scopes", "true");
            ((Intent) (obj)).putExtra("default_audience", a1.a());
            ((Intent) (obj)).putExtra("legacy_override", "v2.3");
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
                if (!com.facebook.internal.ap.a(context, resolveinfo.activityInfo.packageName))
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

    public static Intent a(Intent intent, Bundle bundle, l l1)
    {
        Object obj;
        Intent intent1;
        Bundle bundle2;
        obj = null;
        UUID uuid = c(intent);
        if (uuid == null)
        {
            return null;
        }
        intent1 = new Intent();
        intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
        bundle2 = new Bundle();
        bundle2.putString("action_id", uuid.toString());
        if (l1 == null) goto _L2; else goto _L1
_L1:
        if (l1 != null) goto _L4; else goto _L3
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
        bundle1.putString("error_description", l1.toString());
        intent = bundle1;
        if (l1 instanceof m)
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

    public static l a(Bundle bundle)
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
            return new m(s1);
        } else
        {
            return new l(s1);
        }
    }

    private static TreeSet a(ap ap1)
    {
        Object obj;
        ContentResolver contentresolver;
        obj = new TreeSet();
        contentresolver = q.f().getContentResolver();
        ap1 = Uri.parse((new StringBuilder("content://")).append(ap1.a()).append(".provider.PlatformProvider/versions").toString());
        ap1 = contentresolver.query(ap1, new String[] {
            "version"
        }, null, null, null);
        if (ap1 == null) goto _L2; else goto _L1
_L1:
        for (; ap1.moveToNext(); ((TreeSet) (obj)).add(Integer.valueOf(ap1.getInt(ap1.getColumnIndex("version"))))) { }
          goto _L2
        Exception exception;
        exception;
        obj = ap1;
        ap1 = exception;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw ap1;
_L2:
        if (ap1 != null)
        {
            ap1.close();
        }
        return ((TreeSet) (obj));
        ap1;
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Intent b(Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (ap)iterator.next();
            obj = a(context, (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((ap) (obj)).a()).addCategory("android.intent.category.DEFAULT"));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    private static boolean b(int i)
    {
        return d.contains(Integer.valueOf(i)) && i >= 0x133529d;
    }

    public static boolean b(Intent intent)
    {
        Bundle bundle;
        if (!b(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)))
        {
            bundle = null;
        } else
        {
            bundle = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
        if (bundle != null)
        {
            return bundle.containsKey("error");
        } else
        {
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
    }

    private static UUID c(Intent intent)
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

    static 
    {
        a = new an((byte)0);
        Object obj = new ArrayList();
        ((List) (obj)).add(a);
        ((List) (obj)).add(new aq((byte)0));
        b = ((List) (obj));
        obj = new HashMap();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ao((byte)0));
        ((Map) (obj)).put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.FEED_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.LIKE_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.APPINVITES_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.MESSAGE_DIALOG", arraylist);
        ((Map) (obj)).put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arraylist);
        c = ((Map) (obj));
    }
}
