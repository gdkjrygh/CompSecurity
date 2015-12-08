// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class  extends 
{

    private boolean a[];
    private int b;
    private int c;

    public final void a(adQ adq)
    {
        if (((adN) (adq)).b.a == 3)
        {
            int i = ((aep) ((aen)((adL) (adq)).a)).b;
            boolean aflag[] = a;
            boolean flag;
            if (a[0] && i + (b - c) == ((adN) (adq)).d.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aflag[0] = flag;
        }
    }

    (boolean aflag[], int i, int j)
    {
        a = aflag;
        b = i;
        c = j;
        super();
    }
}
