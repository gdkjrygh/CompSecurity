// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Joiner;

public class KycTeachingDialog extends DialogFragment
{

    private final FragmentManager fragmentManager;
    private final String tag;

    public KycTeachingDialog(FragmentManager fragmentmanager, String s)
    {
        fragmentManager = fragmentmanager;
        tag = s;
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(com.google.android.libraries.commerce.ocr.kyc.R.layout.kyc_ocr_teaching_card, null);
        TextView textview = (TextView)view.findViewById(com.google.android.libraries.commerce.ocr.kyc.R.id.teaching_description);
        String as[] = getResources().getStringArray(com.google.android.libraries.commerce.ocr.kyc.R.array.kyc_ocr_user_added_image_teaching_paragraphs);
        textview.setText(Joiner.on(System.getProperty("line.separator")).join(as));
        return bundle.setView(view).setPositiveButton(com.google.android.libraries.commerce.ocr.kyc.R.string.kyc_ocr_teaching_card_proceed, null).create();
    }

    public final void show()
    {
        show(fragmentManager, tag);
    }
}
