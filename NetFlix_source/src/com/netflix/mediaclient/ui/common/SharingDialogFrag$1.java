// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            SharingDialogFrag

class this._cls0
    implements android.view.
{

    final SharingDialogFrag this$0;

    public void onClick(View view)
    {
        ((NetflixActivity)getActivity()).getMdxMiniPlayerFrag().unshareVideo();
        dismiss();
    }

    ty()
    {
        this$0 = SharingDialogFrag.this;
        super();
    }
}
