// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

// Referenced classes of package com.nielsen.app.sdk:
//            AppNuid, a, b, c

class h extends AppNuid
    implements Closeable
{

    protected static final String b = "aa";
    protected static final byte c = 1;
    protected static final byte d = 2;
    protected static final byte e = 3;
    protected static final byte f = 8;
    public static final String g = "nielsenappsdk://1";
    public static final String h = "nielsenappsdk://0";
    private static final String i = (new StringBuilder("aa.")).append(Integer.toString(1)).append(".").append(Integer.toString(2)).append(".").append(Integer.toString(3)).toString();
    private static final String j = (new StringBuilder("aa.")).append(Integer.toString(1)).append(".").append(Integer.toString(2)).append(".").append(Integer.toString(3)).append(".").append(Integer.toString(8)).toString();
    private static h t = null;
    private final long k = 1283L;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private long q;
    private b r;
    private Context s;
    private String u;

    private h(Context context)
    {
        super(context);
        l = "";
        m = "nielsenappsdk://0";
        n = "false";
        o = "false";
        p = "false";
        q = 0L;
        r = null;
        s = null;
        u = "";
        s = context;
        r = com.nielsen.app.sdk.a.u();
        n = r.b("nol_appdisable", "false");
        p = r.b("sdk_appdisablesent", "false");
        q = Long.parseLong(r.b("sdk_appdisablets", "0"));
        o = r.b("sdk_useroptoutsent", "false");
        m = r.b("nol_useroptout", "nielsenappsdk://0");
        u = r.b("nol_useroptUrl", "");
    }

    public static int a(int i1, int j1)
    {
        Random random = new Random();
        random.setSeed(h());
        int l1 = i1;
        int k1 = j1;
        if (j1 <= i1)
        {
            l1 = 0;
            k1 = 0x7fffffff;
        }
        return random.nextInt(k1 - l1) + l1;
    }

    public static h a(Context context)
    {
        if (t == null)
        {
            t = new h(context);
        }
        return t;
    }

    public static long g()
    {
        return Calendar.getInstance().getTimeInMillis() / 1000L;
    }

    public static long h()
    {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static String m()
    {
        return (new StringBuilder("ANDROID.")).append(android.os.Build.VERSION.RELEASE).toString();
    }

    public static String n()
    {
        return UUID.randomUUID().toString();
    }

    public static String p()
    {
        return i;
    }

    public static String q()
    {
        return j;
    }

    public static int s()
    {
        return a(0, 0);
    }

    String a(String s1, byte byte0, byte byte1, boolean flag)
    {
        String s2 = s1;
        if (flag)
        {
            s1 = Uri.decode(s1);
            s2 = s1;
            if (s1 == null)
            {
                return null;
            }
        }
        s1 = new StringBuilder(s2);
        int i1 = 0;
        while (i1 < s1.length()) 
        {
            byte byte2 = (byte)s1.charAt(i1);
            byte byte3 = (byte)((byte)(~byte1 & byte2) | (byte)((byte2 ^ byte0) & byte1));
            if (byte3 != 0)
            {
                byte2 = byte3;
            }
            s1.setCharAt(i1, Character.valueOf((char)byte2).charValue());
            i1++;
        }
        if (flag)
        {
            return s1.toString();
        } else
        {
            return Uri.encode(s1.toString());
        }
    }

    public void a(boolean flag)
    {
        if (flag != a())
        {
            String s1;
            if (flag)
            {
                s1 = "true";
            } else
            {
                s1 = "false";
            }
            n = s1;
            q = g();
            r.a("nol_appdisable", n);
            r.a("sdk_appdisablets", Long.toString(q));
        }
    }

    public boolean a()
    {
        return n.compareToIgnoreCase("true") == 0;
    }

    public boolean a(String s1)
    {
        return m.compareToIgnoreCase(s1) != 0;
    }

    public long b()
    {
        return q;
    }

    public void b(String s1)
    {
        if (a(s1))
        {
            m = s1;
            r.a("nol_useroptout", m);
        }
    }

    public void b(boolean flag)
    {
        if (flag != c())
        {
            String s1;
            if (flag)
            {
                s1 = "true";
            } else
            {
                s1 = "false";
            }
            p = s1;
            r.a("sdk_appdisablesent", p);
        }
    }

    public void c(String s1)
    {
        if (u.compareToIgnoreCase(s1) == 0)
        {
            return;
        } else
        {
            u = s1;
            r.a("nol_useroptUrl", u);
            return;
        }
    }

    public void c(boolean flag)
    {
        if (flag != e())
        {
            if (flag)
            {
                o = "true";
            } else
            {
                o = "false";
            }
            r.a("sdk_useroptoutsent", o);
        }
    }

    public boolean c()
    {
        return p.compareToIgnoreCase("true") == 0;
    }

    public void close()
    {
    }

    protected String d(String s1)
    {
        try
        {
            s1 = new SimpleDateFormat(s1, Locale.getDefault());
            Date date = new Date();
            date.setTime(h());
            s1 = s1.format(date);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return "";
        }
        return s1;
    }

    public boolean d()
    {
        return m.compareToIgnoreCase("nielsenappsdk://1") == 0;
    }

    public boolean e()
    {
        return o.compareToIgnoreCase("true") == 0;
    }

    public boolean e(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        s1 = s1.split(".");
        if (s1.length <= 0)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        i1 = Integer.parseInt(s1[0]);
_L9:
        int j1;
        if (s1.length <= 1)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        j1 = Integer.parseInt(s1[1]);
_L8:
        int k1;
        if (s1.length <= 2)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        k1 = Integer.parseInt(s1[2]);
_L7:
        int l1;
        int i2;
        int j2;
        j2 = k1;
        i2 = j1;
        l1 = i1;
        if (s1.length <= 3) goto _L4; else goto _L3
_L3:
        l1 = Integer.parseInt(s1[3]);
        i2 = i1;
        i1 = l1;
_L5:
        if ((long)(i1 + (k1 + (j1 + i2 * 10) * 10) * 10) < 1283L)
        {
            return true;
        }
          goto _L1
        s1;
        k1 = 0;
        j1 = 0;
        i1 = 0;
_L6:
        Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: isSystemVersionAtLeast - ")).append(s1.getMessage()).toString());
        l1 = i1;
        i2 = j1;
        j2 = k1;
_L4:
        i1 = 0;
        k1 = j2;
        j1 = i2;
        i2 = l1;
          goto _L5
        s1;
        k1 = 0;
        j1 = 0;
          goto _L6
        s1;
        k1 = 0;
          goto _L6
        s1;
          goto _L6
        k1 = 0;
          goto _L7
        j1 = 0;
          goto _L8
        i1 = 0;
          goto _L9
    }

    public String f()
    {
        return u;
    }

    public boolean f(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        s1 = s1.split(".");
        if (s1.length <= 0)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        i1 = Integer.parseInt(s1[0]);
_L9:
        int j1;
        if (s1.length <= 1)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        j1 = Integer.parseInt(s1[1]);
_L8:
        int k1;
        if (s1.length <= 2)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        k1 = Integer.parseInt(s1[2]);
_L7:
        int l1;
        int i2;
        int j2;
        j2 = k1;
        i2 = j1;
        l1 = i1;
        if (s1.length <= 3) goto _L4; else goto _L3
_L3:
        l1 = Integer.parseInt(s1[3]);
        i2 = i1;
        i1 = l1;
_L5:
        if ((long)(i1 + (k1 + (j1 + i2 * 10) * 10) * 10) >= 1283L)
        {
            return true;
        }
          goto _L1
        s1;
        k1 = 0;
        j1 = 0;
        i1 = 0;
_L6:
        Log.d("AppSdk", (new StringBuilder("Nielsen AppSDK: isSystemVersionAtLeast - ")).append(s1.getMessage()).toString());
        l1 = i1;
        i2 = j1;
        j2 = k1;
_L4:
        i1 = 0;
        k1 = j2;
        j1 = i2;
        i2 = l1;
          goto _L5
        s1;
        k1 = 0;
        j1 = 0;
          goto _L6
        s1;
        k1 = 0;
          goto _L6
        s1;
          goto _L6
        k1 = 0;
          goto _L7
        j1 = 0;
          goto _L8
        i1 = 0;
          goto _L9
    }

    long g(String s1)
    {
        if (!h(s1))
        {
            if (i(s1))
            {
                return Long.parseLong(s1, 10);
            }
            if (j(s1))
            {
                return Long.parseLong(s1, 16);
            }
        }
        return 0x7fffffffL;
    }

    public String getDeviceId()
    {
        String s2 = null;
        String s1 = s2;
        String s3;
        try
        {
            s3 = r.b("nol_deviceId", "");
        }
        catch (Exception exception)
        {
            return s1;
        }
        s1 = s2;
        s2 = super.getDeviceId();
        s1 = s2;
        r.a("nol_deviceId", s2);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1 = s2;
        if (s2.isEmpty() || s3 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1 = s2;
        if (s3.isEmpty())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1 = s2;
        if (s3.compareToIgnoreCase(s2) == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s1 = s2;
        com.nielsen.app.sdk.c.a(14, 'E', "The device Id changed from (%s) to (%s)", new Object[] {
            s3, s2
        });
        return s2;
    }

    public String getNuid()
    {
        String s1;
        String s2;
        s2 = null;
        s1 = s2;
        Object obj;
        if (r != null)
        {
            s1 = s2;
            try
            {
                obj = r.b("nol_nuid", "");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return s1;
            }
        } else
        {
            obj = null;
        }
        s1 = s2;
        s2 = super.getNuid();
        s1 = s2;
        if (r == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        s1 = s2;
        r.a("nol_nuid", s2);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = s2;
        if (((String) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = s2;
        if (((String) (obj)).compareToIgnoreCase(s2) == 0)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = s2;
        com.nielsen.app.sdk.c.a(15, 'E', "The NUID changed from (%s) to (%s)", new Object[] {
            obj, s2
        });
        return s2;
    }

    public boolean h(String s1)
    {
        return s1.trim().matches("-?\\d+(\\.\\d+)?");
    }

    protected String i()
    {
        return d("yyyy-MM-dd HH:mm:ss.SSS");
    }

    public boolean i(String s1)
    {
        return s1.trim().matches("-?\\d+");
    }

    protected String j()
    {
        return d("EE");
    }

    public boolean j(String s1)
    {
label0:
        {
            String s2 = s1.trim();
            if (!s2.startsWith("0x"))
            {
                s1 = s2;
                if (!s2.startsWith("0X"))
                {
                    break label0;
                }
            }
            s1 = s2.substring(2);
        }
        return s1.matches("^\\s*[0-9A-Fa-f]\\s*$");
    }

    protected String k()
    {
        return d("yyyy-MM-dd");
    }

    public String k(String s1)
    {
        String s2 = "";
        int i1 = 0;
        while (i1 < s1.length()) 
        {
            char c1 = s1.charAt(i1);
            if (Character.isLetterOrDigit(c1) || c1 == '-' || c1 == '_' || c1 == '.' || c1 == '~')
            {
                s2 = (new StringBuilder()).append(s2).append(c1).toString();
            } else
            if (c1 == ' ')
            {
                s2 = (new StringBuilder()).append(s2).append("%20").toString();
            } else
            {
                s2 = (new StringBuilder()).append(s2).append("%").append(String.format("%02X", new Object[] {
                    Integer.valueOf(c1)
                })).toString();
            }
            i1++;
        }
        return s2;
    }

    public String l()
    {
        return d("'GMT'Z");
    }

    public String o()
    {
        boolean flag = false;
        if (l.equals(""))
        {
            String s1 = Build.MANUFACTURER;
            s1.trim();
            char ac[] = s1.toCharArray();
            int k1 = ac.length;
            int i1 = 0;
            s1 = "";
            for (; i1 < k1; i1++)
            {
                char c3 = ac[i1];
                char c1 = c3;
                if (Character.isWhitespace(c3))
                {
                    c1 = '-';
                }
                s1 = (new StringBuilder()).append(s1).append(c1).toString();
            }

            String s2 = Build.MODEL;
            s2.trim();
            char ac1[] = s2.toCharArray();
            k1 = ac1.length;
            s2 = "";
            for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
            {
                char c4 = ac1[j1];
                char c2 = c4;
                if (Character.isWhitespace(c4))
                {
                    c2 = '-';
                }
                s2 = (new StringBuilder()).append(s2).append(c2).toString();
            }

            if (s2.startsWith(s1))
            {
                l = s2;
            } else
            {
                l = (new StringBuilder()).append(s1).append("-").append(s2).toString();
            }
        }
        return l;
    }

    boolean r()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)s.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

}
