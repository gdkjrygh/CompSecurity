// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.widget.EditText;

// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

final class c
    implements Runnable
{

    private int a;
    private int b;
    private NumberPicker c;

    static int a(c c1, int j)
    {
        c1.a = j;
        return j;
    }

    static int b(a a1, int j)
    {
        a1.b = j;
        return j;
    }

    public final void run()
    {
        NumberPicker.b(c).setSelection(a, b);
    }

    (NumberPicker numberpicker)
    {
        c = numberpicker;
        super();
    }
}
