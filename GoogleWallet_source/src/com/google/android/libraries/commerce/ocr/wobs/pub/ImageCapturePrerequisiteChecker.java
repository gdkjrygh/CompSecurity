// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.pub;

import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteChecker;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;

public class ImageCapturePrerequisiteChecker
    implements FeaturePrerequisiteChecker
{

    private final FeaturePrerequisiteCheckerUtil checkerUtil;

    public ImageCapturePrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil)
    {
        checkerUtil = featureprerequisitecheckerutil;
    }

    public boolean check()
    {
        return checkerUtil.cameraOK();
    }
}
