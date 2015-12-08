// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            a

private static final class h
{

    int a;
    int b;
    float c;
    float d;
    long e;
    long f;
    int g;
    int h;
    long i;
    float j;
    int k;

    final float a(long l)
    {
        if (l < e)
        {
            return 0.0F;
        }
        if (i < 0L || l < i)
        {
            return android.support.v4.widget.a.a((float)(l - e) / (float)a) * 0.5F;
        } else
        {
            long l1 = i;
            float f1 = j;
            float f2 = j;
            return android.support.v4.widget.a.a((float)(l - l1) / (float)k) * f2 + (1.0F - f1);
        }
    }

    public ()
    {
        e = 0x8000000000000000L;
        i = -1L;
        f = 0L;
        g = 0;
        h = 0;
    }
}
