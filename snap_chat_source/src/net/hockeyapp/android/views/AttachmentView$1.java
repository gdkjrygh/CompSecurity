// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.graphics.Bitmap;
import android.os.AsyncTask;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

final class a extends AsyncTask
{

    private AttachmentView a;

    protected final Object doInBackground(Object aobj[])
    {
        return AttachmentView.a(a);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (obj != null)
        {
            AttachmentView.a(a, ((Bitmap) (obj)));
            return;
        } else
        {
            AttachmentView.b(a);
            return;
        }
    }

    (AttachmentView attachmentview)
    {
        a = attachmentview;
        super();
    }
}
