// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.translate.widget:
//            h, g, HandwritingInputView

final class j
    implements android.content.DialogInterface.OnClickListener
{

    final h a;

    j(h h1)
    {
        a = h1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        HandwritingInputView.c(a.c.a);
        a.b.putExtra("skip_download_dialog", true);
        a.c.a.getContext().startActivity(a.b);
    }
}
