// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.pm.PackageManager;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;

public class AddWobsModule
{

    public AddWobsModule()
    {
    }

    static ImageCapturePrerequisiteChecker getImageCapturePrerequisiteChecker(PackageManager packagemanager)
    {
        return new ImageCapturePrerequisiteChecker(new FeaturePrerequisiteCheckerUtil(packagemanager));
    }
}
