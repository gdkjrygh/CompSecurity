// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;


// Referenced classes of package jp.co.cyberagent.android.a:
//            k, o, g, t

public final class ac extends k
{

    public ac()
    {
        super(null);
        b(-1, -1);
    }

    public ac(int i, int j)
    {
        super(null);
        b(i, j);
    }

    private void b(int i, int j)
    {
        float f;
        f = 1.0F;
        a(new o());
        a(new g());
        if (i != -1 && j != -1) goto _L2; else goto _L1
_L1:
        f = 4F;
_L4:
        a(new t(f));
        return;
_L2:
        float f1 = (4F * (float)Math.min(i, j)) / 640F;
        if (f1 >= 1.0F)
        {
            f = f1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
