// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.tinder.e.ap;
import com.tinder.enums.ReportCause;

// Referenced classes of package com.tinder.c:
//            an

final class init>
    implements android.view.OnClickListener
{

    final an a;

    public final void onClick(View view)
    {
        String s = null;
        String s1;
        ap ap1;
        if (a.p.isChecked())
        {
            view = ReportCause.ABUSIVE_CONTENT;
        } else
        if (a.q.isChecked())
        {
            view = ReportCause.INAPPROPRIATE_PHOTOS;
        } else
        if (a.r.isChecked())
        {
            view = ReportCause.OFFLINE_BEHAVIOR;
        } else
        if (a.s.isChecked())
        {
            view = ReportCause.SPAM;
        } else
        if (a.t.isChecked())
        {
            view = ReportCause.OTHER;
        } else
        {
            view = null;
        }
        s1 = a.e.getText().toString();
        ap1 = an.a(a);
        if (a.t.isChecked())
        {
            s = s1;
        }
        ap1.a(view, s);
        a.dismiss();
    }

    tText(an an1)
    {
        a = an1;
        super();
    }
}
