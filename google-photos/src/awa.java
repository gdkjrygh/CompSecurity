// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

public final class awa
    implements anj
{

    private final avp a;
    private final aqp b;

    public awa(avp avp1, aqp aqp)
    {
        a = avp1;
        b = aqp;
    }

    private aqa a(InputStream inputstream, int i, int j, ani ani)
    {
        bab bab1;
        boolean flag;
        bae bae1;
        awb awb1;
        if (inputstream instanceof avy)
        {
            inputstream = (avy)inputstream;
            flag = false;
        } else
        {
            inputstream = new avy(inputstream, b);
            flag = true;
        }
        bab1 = bab.a(inputstream);
        bae1 = new bae(bab1);
        awb1 = new awb(inputstream, bab1);
        ani = a.a(bae1, i, j, ani, awb1);
        bab1.a();
        if (flag)
        {
            inputstream.b();
        }
        return ani;
        ani;
        bab1.a();
        if (flag)
        {
            inputstream.b();
        }
        throw ani;
    }

    public final volatile aqa a(Object obj, int i, int j, ani ani)
    {
        return a((InputStream)obj, i, j, ani);
    }

    public final boolean a(Object obj, ani ani)
    {
        obj = (InputStream)obj;
        return avp.a();
    }
}
