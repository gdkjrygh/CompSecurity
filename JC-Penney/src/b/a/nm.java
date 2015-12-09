// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            mu, ph

public final class nm
{

    public final mu a;
    public final int b;
    public ph c[];
    public ph d;

    public nm(mu mu)
    {
        if (mu == null)
        {
            throw new NullPointerException("blocks == null");
        } else
        {
            a = mu;
            b = 0;
            c = null;
            d = null;
            return;
        }
    }
}
