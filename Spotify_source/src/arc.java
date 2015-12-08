// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.SessionDefaultAudience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;

public final class arc
{

    private static final arf a;
    private static List b;
    private static Map c;
    private static final List d = Arrays.asList(new Integer[] {
        Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), Integer.valueOf(0x133060d)
    });

    public static final int a()
    {
        return ((Integer)d.get(0)).intValue();
    }

    public static int a(Context context, int i)
    {
        return a(context, b, new int[] {
            i
        });
    }

    private static int a(Context context, arf arf1, int ai[])
    {
        context = context.getContentResolver();
        arf1 = Uri.parse((new StringBuilder("content://")).append(arf1.a()).append(".provider.PlatformProvider/versions").toString());
        context = context.query(arf1, new String[] {
            "version"
        }, null, null, null);
        if (context != null) goto _L2; else goto _L1
_L1:
        if (context != null)
        {
            context.close();
        }
_L5:
        return -1;
_L2:
        arf1 = new TreeSet();
        for (; context.moveToNext(); arf1.add(Integer.valueOf(context.getInt(context.getColumnIndex("version"))))) { }
          goto _L3
        ai;
        arf1 = context;
        context = ai;
_L13:
        if (arf1 != null)
        {
            arf1.close();
        }
        throw context;
_L3:
        int i;
        int j;
        i = ai.length - 1;
        arf1 = arf1.descendingIterator();
        j = a();
_L7:
        int k;
        if (!arf1.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = ((Integer)arf1.next()).intValue();
        do
        {
            if (i < 0)
            {
                break;
            }
            int l = ai[i];
            if (l <= k)
            {
                break;
            }
            i--;
        } while (true);
        if (i >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (context == null) goto _L5; else goto _L4
_L4:
        context.close();
        return -1;
        if (ai[i] != k) goto _L7; else goto _L6
_L6:
        if (i % 2 != 0) goto _L9; else goto _L8
_L8:
        i = Math.min(k, j);
_L11:
        if (context != null)
        {
            context.close();
        }
        return i;
_L9:
        i = -1;
        if (true) goto _L11; else goto _L10
_L10:
        if (context == null) goto _L5; else goto _L12
_L12:
        context.close();
        return -1;
        context;
        arf1 = null;
          goto _L13
    }

    public static int a(Context context, String s, int ai[])
    {
        return a(context, (List)c.get(s), ai);
    }

    private static int a(Context context, List list, int ai[])
    {
        if (list == null)
        {
            return -1;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            int i = a(context, (arf)list.next(), ai);
            if (i != -1)
            {
                return i;
            }
        }

        return -1;
    }

    public static Intent a(Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (arf)iterator.next();
            obj = b(context, (new Intent()).setClassName(((arf) (obj)).a(), "com.facebook.katana.platform.TokenRefreshService"));
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
            if (!arf.a(context, resolveinfo.activityInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    public static Intent a(Context context, String s, String s1, int i, Bundle bundle)
    {
        Object obj = (List)c.get(s1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        if (obj == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        Iterator iterator = ((List) (obj)).iterator();
        obj = null;
        Intent intent;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (arf)iterator.next();
            intent = a(context, (new Intent()).setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(((arf) (obj)).a()).addCategory("android.intent.category.DEFAULT"));
            obj = intent;
        } while (intent == null);
        obj = intent;
        if (true) goto _L4; else goto _L3
_L3:
        context = arp.a(context);
        ((Intent) (obj)).putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", s1).putExtra("com.facebook.platform.extra.APPLICATION_ID", context);
        if (a(i))
        {
            context = new Bundle();
            context.putString("action_id", s);
            context.putString("app_name", null);
            ((Intent) (obj)).putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", context);
            context = bundle;
            if (bundle == null)
            {
                context = new Bundle();
            }
            ((Intent) (obj)).putExtra("com.facebook.platform.protocol.METHOD_ARGS", context);
        } else
        {
            ((Intent) (obj)).putExtra("com.facebook.platform.protocol.CALL_ID", s);
            ((Intent) (obj)).putExtra("com.facebook.platform.extra.APPLICATION_NAME", null);
            ((Intent) (obj)).putExtras(bundle);
        }
        return ((Intent) (obj));
    }

    public static Intent a(Context context, String s, List list, String s1, boolean flag, SessionDefaultAudience sessiondefaultaudience)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (arf)iterator.next();
            obj = (new Intent()).setClassName(((arf) (obj)).a(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s);
            if (!arp.a(list))
            {
                ((Intent) (obj)).putExtra("scope", TextUtils.join(",", list));
            }
            if (!arp.a(s1))
            {
                ((Intent) (obj)).putExtra("e2e", s1);
            }
            ((Intent) (obj)).putExtra("response_type", "token");
            ((Intent) (obj)).putExtra("return_scopes", "true");
            ((Intent) (obj)).putExtra("default_audience", sessiondefaultaudience.nativeProtocolAudience);
            if (!aph.h())
            {
                ((Intent) (obj)).putExtra("legacy_override", "v2.1");
                if (flag)
                {
                    ((Intent) (obj)).putExtra("auth_type", "rerequest");
                }
            }
            obj = a(context, ((Intent) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Exception a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        String s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        bundle = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        if (s != null && s.equalsIgnoreCase("UserCanceled"))
        {
            return new FacebookOperationCanceledException(bundle);
        } else
        {
            return new FacebookException(bundle);
        }
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

    public static boolean a(int i)
    {
        return d.contains(Integer.valueOf(i)) && i >= 0x133529d;
    }

    public static Intent b(Context context)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            Object obj = (arf)iterator.next();
            obj = b(context, (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((arf) (obj)).a()).addCategory("android.intent.category.DEFAULT"));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    private static Intent b(Context context, Intent intent)
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
            if (!arf.a(context, resolveinfo.serviceInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    public static Bundle b(Intent intent)
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

    public static boolean c(Intent intent)
    {
        Bundle bundle = e(intent);
        if (bundle != null)
        {
            return bundle.containsKey("error");
        } else
        {
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
    }

    public static Bundle d(Intent intent)
    {
        if (!c(intent))
        {
            return null;
        }
        Bundle bundle = e(intent);
        if (bundle != null)
        {
            return bundle.getBundle("error");
        } else
        {
            return intent.getExtras();
        }
    }

    private static Bundle e(Intent intent)
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
        a = new ard((byte)0);
        Object obj = new ArrayList();
        ((List) (obj)).add(a);
        ((List) (obj)).add(new arg((byte)0));
        b = ((List) (obj));
        obj = new HashMap();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new are((byte)0));
        ((Map) (obj)).put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.FEED_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.LIKE_DIALOG", b);
        ((Map) (obj)).put("com.facebook.platform.action.request.MESSAGE_DIALOG", arraylist);
        ((Map) (obj)).put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arraylist);
        c = ((Map) (obj));
    }
}
