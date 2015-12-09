// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;

public class SharingDialogFrag extends NetflixDialogFrag
    implements com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag.MdxMiniPlayerDialog
{

    public SharingDialogFrag()
    {
    }

    public static SharingDialogFrag newInstance()
    {
        SharingDialogFrag sharingdialogfrag = new SharingDialogFrag();
        sharingdialogfrag.setStyle(1, 0x7f0d00cb);
        return sharingdialogfrag;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03007c, viewgroup, false);
        layoutinflater.findViewById(0x7f070198).setOnClickListener(new android.view.View.OnClickListener() {

            final SharingDialogFrag this$0;

            public void onClick(View view)
            {
                ((NetflixActivity)getActivity()).getMdxMiniPlayerFrag().unshareVideo();
                dismiss();
            }

            
            {
                this$0 = SharingDialogFrag.this;
                super();
            }
        });
        return layoutinflater;
    }
}
