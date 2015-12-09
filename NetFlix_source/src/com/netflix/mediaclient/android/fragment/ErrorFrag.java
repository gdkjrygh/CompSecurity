// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.netflix.mediaclient.android.fragment:
//            NetflixFrag, ErrorView

public class ErrorFrag extends NetflixFrag
{

    public ErrorFrag()
    {
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return ErrorView.create(layoutinflater, new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

            final ErrorFrag this$0;

            public void onRetryRequested()
            {
                ((com.netflix.mediaclient.android.widget.ErrorWrapper.Callback)getActivity()).onRetryRequested();
            }

            
            {
                this$0 = ErrorFrag.this;
                super();
            }
        });
    }
}
