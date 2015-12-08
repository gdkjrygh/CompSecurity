// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.content.Context;
import android.graphics.Bitmap;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class SaveSnapContext extends SaveImageToGalleryTask
{

    private SnapPreviewFragment a;

    public final void b(String s)
    {
        super.b(s);
        SnapPreviewFragment.I(a);
    }

    public final void onPostExecute(Object obj)
    {
        b((String)obj);
    }

    sToShow(SnapPreviewFragment snappreviewfragment, Context context, Bitmap bitmap, com.snapchat.android.analytics.veSnapContext vesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        a = snappreviewfragment;
        super(context, bitmap, vesnapcontext, savemedianotificationstoshow);
    }
}
