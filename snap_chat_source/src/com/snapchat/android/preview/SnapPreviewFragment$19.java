// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import Pv;
import android.content.Context;
import android.net.Uri;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.util.eventbus.SnapCaptureContext;
import com.snapchat.android.util.save.SaveMediaNotificationsToShow;
import java.io.File;
import vv;
import wG;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class SaveSnapContext extends Pv
{

    private SnapPreviewFragment a;

    public final void a()
    {
        super.a();
        if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
        {
            SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
            File file = new File(mUri.getPath());
            SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, file.length());
        }
    }

    public final void a(Boolean boolean1)
    {
        super.a(boolean1);
        SnapPreviewFragment.I(a);
    }

    public final void b()
    {
        super.b();
        if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
        {
            SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
        }
    }

    public final void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    public final void onPreExecute()
    {
        super.onPreExecute();
        if (SnapPreviewFragment.J(a) == SnapCaptureContext.DISCOVER)
        {
            SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
        }
    }

    sToShow(SnapPreviewFragment snappreviewfragment, Context context, Uri uri, com.snapchat.android.analytics.veSnapContext vesnapcontext, SaveMediaNotificationsToShow savemedianotificationstoshow)
    {
        a = snappreviewfragment;
        super(context, uri, vesnapcontext, savemedianotificationstoshow);
    }
}
