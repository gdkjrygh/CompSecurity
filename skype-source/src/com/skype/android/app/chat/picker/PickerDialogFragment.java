// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.mediacontent.MediaContentRoster;

public abstract class PickerDialogFragment extends SkypeDialogFragment
{

    private View contentView;
    MediaContentRoster mediaContentRoster;

    public PickerDialogFragment()
    {
    }

    protected abstract int getAlignment();

    protected View getContentView()
    {
        return contentView;
    }

    protected abstract int getLayoutId();

    protected abstract int getRootViewId();

    protected abstract int getWindowHeight();

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new Dialog(getActivity(), 0x7f090174);
        contentView = LayoutInflater.from(getActivity()).inflate(getLayoutId(), null, false);
        bundle.setContentView(contentView);
        onViewCreated(contentView);
        Window window = bundle.getWindow();
        android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
        layoutparams.gravity = getAlignment();
        View view = contentView.findViewById(getRootViewId());
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        layoutparams1.height = getWindowHeight();
        view.setLayoutParams(layoutparams1);
        layoutparams.height = layoutparams1.height;
        window.clearFlags(2);
        window.addFlags(8);
        window.setAttributes(layoutparams);
        return bundle;
    }

    protected abstract void onViewCreated(View view);
}
