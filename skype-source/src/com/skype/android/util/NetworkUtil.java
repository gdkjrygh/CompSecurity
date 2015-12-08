// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionUtil;
import java.util.Locale;

// Referenced classes of package com.skype.android.util:
//            ContactUtil, CountryCode

public class NetworkUtil
{
    public static final class NetworkType extends Enum
    {

        public static final NetworkType a;
        public static final NetworkType b;
        public static final NetworkType c;
        public static final NetworkType d;
        public static final NetworkType e;
        public static final NetworkType f;
        private static final NetworkType g[];

        public static NetworkType valueOf(String s)
        {
            return (NetworkType)Enum.valueOf(com/skype/android/util/NetworkUtil$NetworkType, s);
        }

        public static NetworkType[] values()
        {
            return (NetworkType[])g.clone();
        }

        static 
        {
            a = new NetworkType("NONE", 0);
            b = new NetworkType("WIFI", 1);
            c = new NetworkType("MOBILE_2G", 2);
            d = new NetworkType("MOBILE_3G", 3);
            e = new NetworkType("MOBILE_4G", 4);
            f = new NetworkType("UNKNOWN", 5);
            g = (new NetworkType[] {
                a, b, c, d, e, f
            });
        }

        private NetworkType(String s, int i1)
        {
            super(s, i1);
        }
    }


    private ConnectivityManager a;
    private TelephonyManager b;
    private Context c;
    private PermissionUtil d;

    public NetworkUtil(Application application)
    {
        c = application;
        a = (ConnectivityManager)application.getSystemService("connectivity");
        b = (TelephonyManager)application.getSystemService("phone");
        d = new PermissionUtil(application);
    }

    private static boolean a(NetworkInfo networkinfo)
    {
        return networkinfo != null && networkinfo.isConnected();
    }

    private static boolean b(NetworkInfo networkinfo)
    {
        if (networkinfo != null)
        {
            return networkinfo.getType() == 1;
        } else
        {
            return false;
        }
    }

    public final CountryCode a(ContactUtil contactutil, Account account)
    {
        String s1 = b.getSimCountryIso();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = b.getNetworkCountryIso();
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = account.getCountryProp();
        }
        return contactutil.g(s1);
    }

    public final boolean a()
    {
        return a(a.getActiveNetworkInfo());
    }

    public final String b(ContactUtil contactutil, Account account)
    {
        contactutil = a(contactutil, account);
        String s;
        String s1;
        String s2;
        String s3;
        if (contactutil == null)
        {
            contactutil = "";
        } else
        {
            contactutil = contactutil.b();
        }
        account = Build.BRAND;
        s = Build.MANUFACTURER;
        s1 = Build.MODEL;
        s2 = android.os.Build.VERSION.RELEASE;
        s3 = h();
        return String.format(Locale.US, "%s|%s|%s|%s|%s|%s", (Object[])(new String[] {
            contactutil, account, s, s1, s2, s3
        }));
    }

    public final boolean b()
    {
        NetworkInfo networkinfo = a.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnectedOrConnecting();
    }

    public final boolean c()
    {
        return android.provider.Settings.System.getInt(c.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public final boolean d()
    {
        return b(a.getActiveNetworkInfo());
    }

    public final NetworkType e()
    {
        NetworkInfo networkinfo = a.getActiveNetworkInfo();
        if (!a(networkinfo))
        {
            return NetworkType.a;
        }
        if (b(networkinfo))
        {
            return NetworkType.b;
        }
        boolean flag;
        if (networkinfo != null && networkinfo.getType() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            switch (b.getNetworkType())
            {
            case 13: // '\r'
            default:
                return NetworkType.e;

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 7: // '\007'
            case 11: // '\013'
            case 14: // '\016'
                return NetworkType.c;

            case 5: // '\005'
            case 6: // '\006'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 12: // '\f'
            case 15: // '\017'
                return NetworkType.d;
            }
        } else
        {
            return NetworkType.f;
        }
    }

    public final boolean f()
    {
        return b.getPhoneType() != 2;
    }

    public final boolean g()
    {
        NetworkInfo networkinfo;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        networkinfo = a.getActiveNetworkInfo();
        flag2 = flag3;
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        flag2 = flag3;
        if (!networkinfo.isConnected()) goto _L2; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        int j1;
        int i1 = b.getPhoneType();
        if (i1 != 0 && i1 != 3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = b.getNetworkType();
        flag1 = false;
        flag = flag1;
        switch (j1)
        {
        default:
            flag = flag1;
            break;

        case 3: // '\003'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
        case 15: // '\017'
            break MISSING_BLOCK_LABEL_197;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 11: // '\013'
        case 12: // '\f'
        case 14: // '\016'
            break;
        }
_L8:
        if (networkinfo.getType() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (networkinfo.getType() == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        flag2 = flag3;
        if (!i1) goto _L2; else goto _L4
_L4:
        if (flag1) goto _L6; else goto _L5
_L5:
        flag2 = flag3;
        if (!j1) goto _L2; else goto _L7
_L7:
        flag2 = flag3;
        if (!flag) goto _L2; else goto _L6
_L6:
        flag2 = true;
_L2:
        return flag2;
        flag = true;
          goto _L8
    }

    public final String h()
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[NetworkType.values().length];
                try
                {
                    a[NetworkType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[NetworkType.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[NetworkType.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[NetworkType.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[NetworkType.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[e().ordinal()])
        {
        default:
            return "UNKNOWN";

        case 1: // '\001'
            return "2G";

        case 2: // '\002'
            return "3G";

        case 3: // '\003'
            return "4G";

        case 4: // '\004'
            return "WIFI";

        case 5: // '\005'
            return "NONE";
        }
    }

    public final String i()
    {
        String s = null;
        if (d.a(Permission.f))
        {
            s = b.getLine1Number();
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public final int j()
    {
        NetworkInfo networkinfo;
        byte byte0;
        byte0 = -1;
        networkinfo = a.getActiveNetworkInfo();
        if (networkinfo != null) goto _L2; else goto _L1
_L1:
        byte0 = 0;
_L4:
        return byte0;
_L2:
        switch (networkinfo.getSubtype())
        {
        case 8: // '\b'
        default:
            return 1;

        case 1: // '\001'
            return 71;

        case 9: // '\t'
            return 6;

        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String k()
    {
        NetworkInfo networkinfo = a.getActiveNetworkInfo();
        if (networkinfo != null)
        {
            return networkinfo.getSubtypeName();
        } else
        {
            return "";
        }
    }

    public final String l()
    {
        return b.getNetworkOperatorName();
    }
}
