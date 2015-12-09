// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class f
{
    private class a
    {

        final f a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private boolean l;

        private String a()
        {
            String s;
            try
            {
                s = f.a(a).getPackageManager().getPackageInfo(f.a(a).getPackageName(), 0).versionName;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                return null;
            }
            return s;
        }

        static String a(a a1)
        {
            return a1.d;
        }

        private String b()
        {
            return "android";
        }

        static String b(a a1)
        {
            return a1.e;
        }

        private String c()
        {
            return android.os.Build.VERSION.RELEASE;
        }

        static String c(a a1)
        {
            return a1.f;
        }

        private String d()
        {
            return Build.BRAND;
        }

        static String d(a a1)
        {
            return a1.g;
        }

        private String e()
        {
            return Build.MANUFACTURER;
        }

        static String e(a a1)
        {
            return a1.h;
        }

        private String f()
        {
            return Build.MODEL;
        }

        static String f(a a1)
        {
            return a1.i;
        }

        private String g()
        {
            return ((TelephonyManager)f.a(a).getSystemService("phone")).getNetworkOperatorName();
        }

        static String g(a a1)
        {
            return a1.j;
        }

        private String h()
        {
            String s = i();
            if (TextUtils.isEmpty(s))
            {
                String s1 = j();
                s = s1;
                if (TextUtils.isEmpty(s1))
                {
                    return k();
                }
            }
            return s;
        }

        static String h(a a1)
        {
            return a1.c;
        }

        private String i()
        {
            Object obj;
            if (!a.o())
            {
                return null;
            }
            obj = a.n();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            obj = a.p().getFromLocation(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude(), 1);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            obj = ((List) (obj)).iterator();
            Address address;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_86;
                }
                address = (Address)((Iterator) (obj)).next();
            } while (address == null);
            obj = address.getCountryCode();
            return ((String) (obj));
            Object obj1;
            obj1;
_L2:
            return null;
            obj1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        static String i(a a1)
        {
            return a1.k;
        }

        private String j()
        {
            Object obj;
            obj = (TelephonyManager)f.a(a).getSystemService("phone");
            if (((TelephonyManager) (obj)).getPhoneType() == 2)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            obj = ((TelephonyManager) (obj)).getNetworkCountryIso();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            obj = ((String) (obj)).toUpperCase(Locale.US);
            return ((String) (obj));
            Exception exception;
            exception;
            return null;
        }

        static String j(a a1)
        {
            return a1.b;
        }

        private String k()
        {
            return Locale.getDefault().getCountry();
        }

        static boolean k(a a1)
        {
            return a1.l;
        }

        private String l()
        {
            return Locale.getDefault().getLanguage();
        }

        private String m()
        {
            Object obj;
            Boolean boolean1;
            obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(null, new Object[] {
                f.a(a)
            });
            boolean1 = (Boolean)obj.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0]);
            if (boolean1 == null)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            if (!boolean1.booleanValue())
            {
                break MISSING_BLOCK_LABEL_115;
            }
            boolean flag = true;
_L1:
            try
            {
                l = flag;
                b = (String)obj.getClass().getMethod("getId", new Class[0]).invoke(obj, new Object[0]);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                Log.w("com.amplitude.api.DeviceInfo", "Google Play Services SDK not found!");
            }
            catch (Exception exception)
            {
                Log.e("com.amplitude.api.DeviceInfo", "Encountered an error connecting to Google Play Services", exception);
            }
            return b;
            flag = false;
              goto _L1
        }

        private a()
        {
            a = f.this;
            super();
            b = m();
            d = a();
            e = b();
            f = c();
            g = d();
            h = e();
            i = f();
            j = g();
            c = h();
            k = l();
        }

    }


    private boolean a;
    private Context b;
    private a c;

    public f(Context context)
    {
        a = true;
        b = context;
    }

    static Context a(f f1)
    {
        return f1.b;
    }

    private a q()
    {
        if (c == null)
        {
            c = new a();
        }
        return c;
    }

    public void a()
    {
        q();
    }

    public String b()
    {
        return UUID.randomUUID().toString();
    }

    public String c()
    {
        return a.a(q());
    }

    public String d()
    {
        return a.b(q());
    }

    public String e()
    {
        return a.c(q());
    }

    public String f()
    {
        return a.d(q());
    }

    public String g()
    {
        return a.e(q());
    }

    public String h()
    {
        return a.f(q());
    }

    public String i()
    {
        return a.g(q());
    }

    public String j()
    {
        return a.h(q());
    }

    public String k()
    {
        return a.i(q());
    }

    public String l()
    {
        return a.j(q());
    }

    public boolean m()
    {
        return a.k(q());
    }

    public Location n()
    {
        Object obj;
        Object obj1;
        if (o())
        {
            if ((obj = (LocationManager)b.getSystemService("location")) != null && (obj1 = ((LocationManager) (obj)).getProviders(true)) != null)
            {
                ArrayList arraylist = new ArrayList();
                obj1 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    Location location1 = ((LocationManager) (obj)).getLastKnownLocation((String)((Iterator) (obj1)).next());
                    if (location1 != null)
                    {
                        arraylist.add(location1);
                    }
                } while (true);
                obj1 = arraylist.iterator();
                long l1 = -1L;
                obj = null;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    Location location = (Location)((Iterator) (obj1)).next();
                    if (location.getTime() > l1)
                    {
                        l1 = location.getTime();
                        obj = location;
                    }
                } while (true);
                return ((Location) (obj));
            }
        }
        return null;
    }

    public boolean o()
    {
        return a;
    }

    protected Geocoder p()
    {
        return new Geocoder(b, Locale.ENGLISH);
    }
}
