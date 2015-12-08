// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.tinder.e.ag;
import com.tinder.enums.ReportCause;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.c:
//            ah

final class init>
    implements android.view.OnClickListener
{

    final ah a;

    public final void onClick(View view)
    {
        ad.a(a.f.getWindowToken(), (Activity)a.a);
        ah.a(a);
        ah.b(a).a(ReportCause.OTHER, a.e.getText().toString());
    }

    tText(ah ah1)
    {
        a = ah1;
        super();
    }
}
