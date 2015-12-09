// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import android.util.Log;
import java.util.HashSet;

// Referenced classes of package com.google.android.libraries.commerce.ocr.pub:
//            FeaturePrerequisiteChecker, FeaturePrerequisiteCheckerUtil

public class CreditCardOcrPrerequisiteChecker
    implements FeaturePrerequisiteChecker
{

    public static final HashSet DEFAULT_CREDIT_CARD_OCR_MODEL_BLACKLIST = FeaturePrerequisiteCheckerUtil.newHashSet(new String[] {
        "SCH-S738C", "ALCATEL-ONE-TOUCH-Fierce", "LG-VM696", "GT-P3113", "SM-T217S", "LG-LS840", "SPH-M840", "Huawei-Y301A1", "SCH-R740C", "C5155", 
        "Event", "SPH-M830", "ALCATEL-ONE-TOUCH-5020N", "LGMS500", "C5215", "Z992", "GT-N8013", "SGH-M919N", "LG-VS410PP", "ALCATEL-ONE-TOUCH-5020T", 
        "HTCEVOV4G", "N9510", "XT897", "LG-MS870", "N8000-USA-Cricket", "H866C", "LG-MS695", "N9810", "C6522N"
    });
    private static final String TAG = "CreditCardPrerequisiteChecker";
    private final HashSet allowedCpus;
    private final FeaturePrerequisiteCheckerUtil checkerUtil;
    private final HashSet modelBlacklist;

    public CreditCardOcrPrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, HashSet hashset, HashSet hashset1)
    {
        this(featureprerequisitecheckerutil, DEFAULT_CREDIT_CARD_OCR_MODEL_BLACKLIST, hashset, hashset1);
    }

    protected CreditCardOcrPrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, HashSet hashset, HashSet hashset1, HashSet hashset2)
    {
        checkerUtil = featureprerequisitecheckerutil;
        allowedCpus = hashset2;
        modelBlacklist = new HashSet(hashset);
        modelBlacklist.addAll(hashset1);
    }

    public boolean check()
    {
        if (checkerUtil.buildVersionOK() && checkerUtil.modelOK(modelBlacklist) && checkerUtil.cpuAbiOK(allowedCpus) && checkerUtil.cameraOK() && checkerUtil.orientationOk())
        {
            Log.d("CreditCardPrerequisiteChecker", "All prerequisites OK.");
            return true;
        } else
        {
            return false;
        }
    }

}
