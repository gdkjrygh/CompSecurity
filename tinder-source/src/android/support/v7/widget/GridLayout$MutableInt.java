// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class value
{

    public int value;

    public final void reset()
    {
        value = 0x80000000;
    }

    public final String toString()
    {
        return Integer.toString(value);
    }

    public ()
    {
        reset();
    }

    public reset(int i)
    {
        value = i;
    }
}
