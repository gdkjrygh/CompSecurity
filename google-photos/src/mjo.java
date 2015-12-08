// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class mjo
    implements atm, mjy
{

    final atm a;
    final mjx b;
    private final atj c = new atj(2000);
    private final mjz d;

    mjo(atm atm1, mjz mjz1, mjx mjx1)
    {
        a = atm1;
        d = mjz1;
        b = mjx1;
        if (mjx1 != null)
        {
            mjx1.a(this);
        }
    }

    ata a(mjn mjn1, int i, int j)
    {
        Object obj = mjn1.b;
        if (!((mjw) (obj)).b)
        {
            if (d != null)
            {
                i = d.a(i, j);
                obj = ((mjw) (obj)).a(mjn1.a, i, i);
            } else
            {
                obj = ((mjw) (obj)).a(mjn1.a, i, j);
            }
        } else
        {
            obj = ((mjw) (obj)).a(mjn1.a, i, j);
        }
        if (b == null)
        {
            mjn1 = atb.a;
        } else
        {
            mjn1 = b.a(mjn1);
        }
        return new ata(((String) (obj)), mjn1);
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        mjn mjn1 = (mjn)obj;
        Object obj1 = (ata)c.a(mjn1, i, j);
        obj = obj1;
        if (obj1 == null)
        {
            obj = a(mjn1, i, j);
            c.a(mjn1, i, j, obj);
        }
        if (Log.isLoggable("FifeModelLoader", 2))
        {
            obj1 = String.valueOf("Loading fife model, url: ");
            String s = String.valueOf(obj);
            String s1 = String.valueOf(mjn1);
            (new StringBuilder(String.valueOf(obj1).length() + 50 + String.valueOf(s).length() + String.valueOf(s1).length())).append(((String) (obj1))).append(s).append(", model: ").append(s1).append(", width: ").append(i).append(", height: ").append(j);
        }
        obj1 = a.a(obj, i, j, ani);
        if (obj1 != null)
        {
            if (b == null)
            {
                ani = ((atn) (obj1)).c;
            } else
            {
                ani = new mjp(this, ((atn) (obj1)).c, mjn1, i, j, ani);
            }
            return new atn(new mjv(((ata) (obj))), ani);
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        c.a.a();
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
