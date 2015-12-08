// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.pub;

import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteChecker;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;
import java.util.HashSet;

public class AutoSnapPrerequisiteChecker
    implements FeaturePrerequisiteChecker
{

    private final HashSet allowedCpus;
    private final FeaturePrerequisiteCheckerUtil checkerUtil;
    private final String modelBlacklist;

    public AutoSnapPrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, String s)
    {
        this(featureprerequisitecheckerutil, FeaturePrerequisiteCheckerUtil.NATIVE_CPU_ABIS, s);
    }

    protected AutoSnapPrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, HashSet hashset, String s)
    {
        checkerUtil = featureprerequisitecheckerutil;
        allowedCpus = hashset;
        modelBlacklist = s;
    }

    public boolean check()
    {
        return checkerUtil.modelOK(modelBlacklist) && checkerUtil.cpuAbiOK(allowedCpus);
    }
}
