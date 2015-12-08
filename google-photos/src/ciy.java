// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ciy extends ciw
    implements ded
{

    public final cin c;
    public final float d[] = new float[16];
    public int e;

    public ciy(cin cin1)
    {
        e = 0;
        c = (cin)b.a(cin1, "texture", null);
    }

    public final void a()
    {
        int i = e;
        e = i - 1;
        if (i > 0)
        {
            return;
        } else
        {
            dee.a(c);
            return;
        }
    }
}
