// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.date;

import java.util.Formatter;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.widgets.date:
//            SimpleDatePicker

final class builder
    implements android.widget.ter
{

    final StringBuilder builder = new StringBuilder();
    final Formatter fmt;

    public final String format(int i)
    {
        builder.delete(0, builder.length());
        fmt.format("%02d", new Object[] {
            Integer.valueOf(i)
        });
        return fmt.toString();
    }

    ()
    {
        fmt = new Formatter(builder, Locale.getDefault());
    }
}
