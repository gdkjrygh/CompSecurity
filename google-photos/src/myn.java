// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class myn
    implements mym
{

    private final Context a;
    private final myj b;
    private final ArrayList c = new ArrayList();

    myn(Context context)
    {
        a = context;
        b = new myj(context);
    }

    private String a(phy aphy[])
    {
        boolean flag = false;
        if (aphy == null || aphy.length == 0)
        {
            return "";
        }
        byte abyte0[];
        qlp qlp1;
        int i;
        int j;
        try
        {
            j = qlp.b(aphy.length) + 0;
        }
        // Misplaced declaration of an exception variable
        catch (phy aphy[])
        {
            Log.e("ExperimentLoader", "Failed to serialize experiment data", aphy);
            return "";
        }
        i = 0;
        if (i >= aphy.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j += qlp.b(aphy[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_27;
_L1:
        abyte0 = new byte[j];
        qlp1 = qlp.a(abyte0, 0, abyte0.length);
        qlp1.a(aphy.length);
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= aphy.length)
        {
            break; /* Loop/switch isn't completed */
        }
        qlp1.a(aphy[i]);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        aphy = Base64.encodeToString(abyte0, 0);
        return aphy;
    }

    private static phy[] b(String s)
    {
        int i = 0;
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        phy aphy[];
        qlo qlo1;
        int j;
        try
        {
            s = Base64.decode(s, 0);
            qlo1 = qlo.a(s, 0, s.length);
            j = qlo1.i();
            aphy = new phy[j];
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("ExperimentLoader", "Unable to parse experiments", s);
            return null;
        }
        s = aphy;
        if (i >= j) goto _L4; else goto _L3
_L3:
        s = new phy();
        qlo1.a(s);
        aphy[i] = s;
        i++;
        break MISSING_BLOCK_LABEL_43;
    }

    public final Map a(String s)
    {
        s = b.a().getString(myj.a(s), null);
        phy aphy[];
        HashMap hashmap;
        phy phy1;
        int i;
        int j;
        int k;
        if (s != null)
        {
            aphy = b(s);
        } else
        {
            aphy = null;
        }
        if (aphy == null)
        {
            return null;
        }
        j = aphy.length;
        hashmap = new HashMap(j);
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        phy1 = aphy[i];
        k = phy1.b;
        if (k == 0x80000000 || k == 1)
        {
            s = "true";
        } else
        if (k == 4)
        {
            if (phy1.c != null)
            {
                s = phy1.c.c;
            } else
            {
                s = null;
            }
        } else
        if (k == 3)
        {
            if (phy1.c == null || phy1.c.b == null)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            s = Double.toString(phy1.c.b.doubleValue());
        } else
        {
            if (k != 2 || phy1.c == null || phy1.c.a == null)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            s = Long.toString(phy1.c.a.longValue());
        }
_L4:
        if (s != null)
        {
            hashmap.put(phy1.a, s);
        }
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_50;
_L1:
        return hashmap;
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(String s, phy aphy[])
    {
        aphy = a(aphy);
        myj myj1 = b;
        Object obj = myj1.a();
        String s1 = myj.a(s);
        if (!TextUtils.equals(((SharedPreferences) (obj)).getString(s1, null), aphy))
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString(s1, aphy);
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
        long l = ((muz)olm.a(myj1.a, muz)).a();
        aphy = myj1.a();
        s = myj.b(s);
        aphy = aphy.edit();
        aphy.putLong(s, l);
        aphy.apply();
        for (s = c.iterator(); s.hasNext(); ((myd)s.next()).a()) { }
    }

    public final void a(myd myd1)
    {
        c.add(myd1);
    }

    public final boolean a(List list, String s)
    {
        list = new myx(a, new nyg(s, null), list);
        list.d();
        try
        {
            list.e("ExperimentLoader");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return false;
        }
        a(s, ((pbg)list.t()).a.a);
        return true;
    }
}
