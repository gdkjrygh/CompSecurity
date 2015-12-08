// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Strings;

public class TeachingDialog extends DialogFragment
{

    private final String description;
    private android.content.DialogInterface.OnDismissListener dismissListener;
    private final FragmentManager fragmentManager;
    private String imageDescription;
    private final int imageResourceId;
    private android.content.DialogInterface.OnClickListener proceedListener;
    private final String tag;
    private final String title;

    public TeachingDialog(int i, String s, String s1, FragmentManager fragmentmanager, String s2)
    {
        imageResourceId = i;
        title = s;
        description = s1;
        fragmentManager = fragmentmanager;
        tag = s2;
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(com.google.android.libraries.commerce.ocr.loyalty.R.layout.teaching_card, null);
        ImageView imageview = (ImageView)view.findViewById(com.google.android.libraries.commerce.ocr.loyalty.R.id.teaching_image);
        imageview.setImageResource(imageResourceId);
        if (!Strings.isNullOrEmpty(imageDescription))
        {
            imageview.setContentDescription(imageDescription);
        }
        if (!Strings.isNullOrEmpty(title))
        {
            ((TextView)view.findViewById(com.google.android.libraries.commerce.ocr.loyalty.R.id.teaching_title)).setText(title);
        }
        if (!Strings.isNullOrEmpty(description))
        {
            ((TextView)view.findViewById(com.google.android.libraries.commerce.ocr.loyalty.R.id.teaching_description)).setText(description);
        }
        return bundle.setView(view).setPositiveButton(com.google.android.libraries.commerce.ocr.loyalty.R.string.teaching_card_proceed, proceedListener).create();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (dismissListener != null)
        {
            dismissListener.onDismiss(dialoginterface);
        }
    }

    public final void show()
    {
        show(fragmentManager, tag);
    }
}
