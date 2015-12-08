// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.EnumSet;
import java.util.List;

public final class fce
    implements fcb
{

    private static final EnumSet a;
    private final mmv b;
    private final fbz c;
    private final npk d;
    private final fcg e;
    private final fbk f;
    private final fcl g;
    private final noz h;
    private final noz i;

    public fce(Context context, mmv mmv1, fbz fbz1, npk npk1, fcg fcg1, fbk fbk1, fcl fcl1)
    {
        b = mmv1;
        c = fbz1;
        d = npk1;
        e = fcg1;
        f = fbk1;
        g = fcl1;
        h = noz.a(context, 5, "PhotosDeviceMgmt", new String[0]);
        i = noz.a(context, 3, "PhotosDeviceMgmt", new String[0]);
    }

    public final fcx a()
    {
        fcx fcx1;
        int j;
        fcx1 = new fcx();
        boolean flag = d.a();
        if (i.a())
        {
            (new StringBuilder(17)).append("hasNetwork: ").append(flag);
        }
        if (!flag)
        {
            return fcx1;
        }
        Object obj = b.a(new String[] {
            "logged_in"
        });
        if (!((List) (obj)).isEmpty())
        {
            obj = b.a(((Integer)((List) (obj)).get(0)).intValue()).b("account_name");
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = f.a(((String) (obj)));
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        j = b.a(((String) (obj)));
        if (!b.d(j)) goto _L2; else goto _L3
_L3:
        if (i.a())
        {
            noy.a(j);
        }
        if (j == -1)
        {
            return fcx1;
        }
        fcx1.c = j;
        boolean flag1 = c.a(j);
        if (i.a())
        {
            (new StringBuilder(25)).append("isFeatureAvailable: ").append(flag1);
        }
        if (!flag1)
        {
            return fcx1;
        }
        flag1 = c.c(j);
        if (i.a())
        {
            noy.a("value", Boolean.valueOf(flag1));
        }
        if (flag1)
        {
            return fcx1;
        }
        fcy fcy1 = e.a();
        if (i.a())
        {
            noy.a("threshold", fcy1);
        }
        fcx1.b = fcy1;
        if (!a.contains(fcy1))
        {
            return fcx1;
        }
        fcm fcm1 = g.a(j);
        if (fcm1 != null && fcm1.c.equals(fcy1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i.a())
        {
            noy.a("threshold", fcy1);
            noy.a("batch exists", Boolean.valueOf(flag1));
        }
        if (flag1)
        {
            return fcx1;
        } else
        {
            fcx1.a = true;
            return fcx1;
        }
_L2:
        j = -1;
        if (true) goto _L3; else goto _L4
_L4:
    }

    static 
    {
        a = EnumSet.of(fcy.c, fcy.d);
    }
}
