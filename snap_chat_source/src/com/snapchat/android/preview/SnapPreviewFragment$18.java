// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import Pw;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;
import java.io.File;
import vv;
import wG;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class SaveSnapContext extends Pw
{

    private SnapPreviewFragment a;

    public final void a()
    {
        super.a();
        if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
        {
            SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        SnapPreviewFragment.I(a);
    }

    protected final void b()
    {
        super.b();
        if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
        {
            SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
            SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, mNewLocation.length());
        }
    }

    protected final void c()
    {
        super.c();
        if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
        {
            SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
        }
    }

    sToShow(SnapPreviewFragment snappreviewfragment, Context context, Uri uri, boolean flag, Bitmap bitmap,  , int i, 
            boolean flag1, double d, com.snapchat.android.analytics.veSnapContext vesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        a = snappreviewfragment;
        super(context, uri, flag, bitmap, , i, flag1, d, vesnapcontext, savemedianotificationstoshow);
    }
}
