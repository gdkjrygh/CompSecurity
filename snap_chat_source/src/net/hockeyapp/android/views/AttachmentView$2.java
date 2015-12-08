// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

final class a
    implements android.view.ner
{

    private AttachmentView a;

    public final void onClick(View view)
    {
        view = a;
        ((AttachmentView) (view)).a.removeView(view);
    }

    (AttachmentView attachmentview)
    {
        a = attachmentview;
        super();
    }
}
