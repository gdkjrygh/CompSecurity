// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            no

public final class he
{

    public final int a;
    public final no b;

    public he(int i, no no)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("address < 0");
        }
        if (no == null)
        {
            throw new NullPointerException("position == null");
        } else
        {
            a = i;
            b = no;
            return;
        }
    }
}
