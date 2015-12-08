// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.DialogInterface;
import com.google.android.libraries.translate.core.b;

// Referenced classes of package com.google.android.apps.translate.widget:
//            PhrasebookView

final class ao
    implements android.content.DialogInterface.OnClickListener
{

    final PhrasebookView a;

    ao(PhrasebookView phrasebookview)
    {
        a = phrasebookview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        b.c(a.getContext(), i);
        PhrasebookView.d(a);
        dialoginterface.dismiss();
    }
}
