// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;


// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

final class <init>
{

    performAction a;

    public final void a(int i, int k)
    {
        if (a != null)
        {
            a.a(i, k);
        }
    }

    public final boolean a(int i)
    {
        if (a != null)
        {
            return a.performAction(i, 64, null);
        } else
        {
            return false;
        }
    }

    private (NumberPicker numberpicker)
    {
        if (android.os.DK_INT >= 16)
        {
            a = new <init>(numberpicker);
        }
    }

    <init>(NumberPicker numberpicker, byte byte0)
    {
        this(numberpicker);
    }
}
