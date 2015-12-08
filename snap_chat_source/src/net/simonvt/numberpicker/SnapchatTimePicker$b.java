// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;


// Referenced classes of package net.simonvt.numberpicker:
//            SnapchatTimePicker

final class b
    implements Runnable
{

    private boolean a;
    private SnapchatTimePicker b;

    static void a(b b1, boolean flag)
    {
        b1.a = flag;
    }

    public final void run()
    {
        SnapchatTimePicker.a(b, a);
        b.postDelayed(this, SnapchatTimePicker.h(b));
    }

    (SnapchatTimePicker snapchattimepicker)
    {
        b = snapchattimepicker;
        super();
    }
}
