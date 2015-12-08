// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.widget.DatePicker;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            eb, ea

class et
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final ea a;
    final eb b;

    et(eb eb1, ea ea1)
    {
        b = eb1;
        a = ea1;
        super();
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        b.f = i;
        b.g = j;
        b.h = k;
        for (datepicker = b.j.iterator(); datepicker.hasNext(); ((eb.a)datepicker.next()).a(a.a(), b.f, b.g, b.h)) { }
        eb.a(b, true);
    }
}
