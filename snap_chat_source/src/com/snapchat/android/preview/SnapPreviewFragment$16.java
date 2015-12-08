// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.content.Context;
import android.graphics.Bitmap;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;
import java.io.File;
import vv;
import wG;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class SaveSnapContext extends SaveImageToGalleryTask
{

    private SnapPreviewFragment a;

    public final void a()
    {
        super.a();
        SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
    }

    public final void a(String s)
    {
        super.a(s);
        SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
        s = new File(s);
        SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, s.length());
    }

    public final void b(String s)
    {
        super.b(s);
        SnapPreviewFragment.I(a);
    }

    public final void onPostExecute(Object obj)
    {
        b((String)obj);
    }

    public final void onPreExecute()
    {
        super.onPreExecute();
        SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
    }

    sToShow(SnapPreviewFragment snappreviewfragment, Context context, Bitmap bitmap, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        a = snappreviewfragment;
        super(context, bitmap, null, savemedianotificationstoshow);
    }
}
