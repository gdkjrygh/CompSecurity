// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cct extends cbg
{

    public cct()
    {
    }

    public final float v(cba cba1)
    {
        if (cba1.i == cnt.d && cba1.k != null && cba1.k == cnt.e)
        {
            long l = cba1.e - cba1.d;
            long l1 = Math.min(0x493e0L, cba1.e);
            if (l < l1)
            {
                return (float)l / (float)l1;
            }
        }
        return 1.0F;
    }
}
