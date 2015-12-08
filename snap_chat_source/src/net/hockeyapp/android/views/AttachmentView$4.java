// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

final class a
    implements android.view.ner
{

    private boolean a;
    private AttachmentView b;

    public final void onClick(View view)
    {
        if (!a)
        {
            return;
        } else
        {
            view = new Intent();
            view.setAction("android.intent.action.VIEW");
            view.setDataAndType(AttachmentView.c(b), "*/*");
            AttachmentView.d(b).startActivity(view);
            return;
        }
    }

    (AttachmentView attachmentview, boolean flag)
    {
        b = attachmentview;
        a = flag;
        super();
    }
}
