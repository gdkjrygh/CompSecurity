// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;


// Referenced classes of package net.simonvt.numberpicker:
//            SnapchatTimePicker

final class <init>
{

    performAction a;

    public final void a(int i, int j)
    {
        if (a != null)
        {
            a.a(i, j);
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

    private (SnapchatTimePicker snapchattimepicker)
    {
        if (android.os. >= 16)
        {
            a = new <init>(snapchattimepicker);
        }
    }

    <init>(SnapchatTimePicker snapchattimepicker, byte byte0)
    {
        this(snapchattimepicker);
    }
}
