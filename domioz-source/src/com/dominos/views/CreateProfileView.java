// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.dominos.android.sdk.common.FontManager;

public class CreateProfileView extends LinearLayout
{

    private CreateProfileViewListener mListener;

    public CreateProfileView(Context context)
    {
        super(context);
    }

    void onAfterViews()
    {
        FontManager.applyDominosFont(this);
    }

    void onCreateProfileCheckBoxClicked(View view)
    {
        if (mListener != null)
        {
            mListener.onCreateProfileCheckBoxSelected((CheckBox)view);
        }
    }

    public void setListener(CreateProfileViewListener createprofileviewlistener)
    {
        mListener = createprofileviewlistener;
    }

    private class CreateProfileViewListener
    {

        public abstract void onCreateProfileCheckBoxSelected(CheckBox checkbox);
    }

}
