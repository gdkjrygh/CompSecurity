// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import com.google.android.libraries.commerce.ocr.loyalty.ui.TeachingDialog;
import com.google.common.base.Joiner;

public class UserAddedImageTeachingDialog extends TeachingDialog
{

    private UserAddedImageTeachingDialog(int i, String s, String s1, FragmentManager fragmentmanager, String s2)
    {
        super(i, s, s1, fragmentmanager, s2);
    }

    public static UserAddedImageTeachingDialog create(Resources resources, FragmentManager fragmentmanager, String s)
    {
        String as[] = resources.getStringArray(com.google.android.libraries.commerce.ocr.wobs.R.array.user_added_image_teaching_paragraphs);
        return new UserAddedImageTeachingDialog(com.google.android.libraries.commerce.ocr.wobs.R.drawable.img_camera_tutorial, resources.getString(com.google.android.libraries.commerce.ocr.wobs.R.string.user_added_image_teaching_title), Joiner.on(System.getProperty("line.separator")).join(as), fragmentmanager, s);
    }
}
