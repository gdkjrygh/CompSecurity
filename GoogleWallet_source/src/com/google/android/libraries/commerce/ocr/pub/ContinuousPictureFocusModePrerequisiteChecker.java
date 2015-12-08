// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.commerce.ocr.pub:
//            FeaturePrerequisiteChecker, FeaturePrerequisiteCheckerUtil

public class ContinuousPictureFocusModePrerequisiteChecker
    implements FeaturePrerequisiteChecker
{

    private static final HashSet DEFAULT_BLACKLIST = FeaturePrerequisiteCheckerUtil.newHashSet(new String[] {
        "SM-G900A", "SM-G900F", "SM-G900H", "SM-G900I", "SM-G900K", "SM-G900L", "SM-G900M", "SM-G900R4", "SM-G900RZWAUSC", "SM-G900S", 
        "SM-G900T", "SM-G900V"
    });
    private final FeaturePrerequisiteCheckerUtil checkerUtil;
    private final HashSet modelBlacklist;

    public ContinuousPictureFocusModePrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, String s)
    {
        this(featureprerequisitecheckerutil, DEFAULT_BLACKLIST, ((Set) (FeaturePrerequisiteCheckerUtil.split(s))));
    }

    protected ContinuousPictureFocusModePrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, HashSet hashset, Set set)
    {
        checkerUtil = featureprerequisitecheckerutil;
        modelBlacklist = new HashSet(hashset);
        modelBlacklist.addAll(set);
    }

    public boolean check()
    {
        return checkerUtil.modelOK(modelBlacklist);
    }

}
