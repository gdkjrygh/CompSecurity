// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.common.base.Function;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.commerce.ocr.pub:
//            FeaturePrerequisiteCheckerUtil, CreditCardOcrPrerequisiteChecker, LoyaltyCardOcrPrerequisiteChecker

public class PrerequisiteChecker
{

    private final Set allowedCpuAbis;
    private final Set defaultCreditCardOcrModelBlacklist;
    private final FeaturePrerequisiteCheckerUtil featurePrerequisiteCheckerUtil;

    protected PrerequisiteChecker(int i, String s, Set set, Function function, Set set1, PackageManager packagemanager)
    {
        allowedCpuAbis = set;
        defaultCreditCardOcrModelBlacklist = set1;
        featurePrerequisiteCheckerUtil = new FeaturePrerequisiteCheckerUtil(i, s, function, packagemanager);
    }

    public PrerequisiteChecker(PackageManager packagemanager)
    {
        this(android.os.Build.VERSION.SDK_INT, Build.MODEL, ((Set) (FeaturePrerequisiteCheckerUtil.NATIVE_CPU_ABIS)), FeaturePrerequisiteCheckerUtil.getCameraInfoFunction(), ((Set) (CreditCardOcrPrerequisiteChecker.DEFAULT_CREDIT_CARD_OCR_MODEL_BLACKLIST)), packagemanager);
    }

    public boolean creditCardPrerequisitesOK(String s)
    {
        return creditCardPrerequisitesOK(((Set) (FeaturePrerequisiteCheckerUtil.split(s))));
    }

    public boolean creditCardPrerequisitesOK(Set set)
    {
        HashSet hashset = new HashSet(defaultCreditCardOcrModelBlacklist);
        hashset.addAll(set);
        return (new CreditCardOcrPrerequisiteChecker(featurePrerequisiteCheckerUtil, hashset, new HashSet(allowedCpuAbis))).check();
    }

    public boolean loyaltyCardPrerequisitesOK(Context context, String s, String s1)
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        context = (TelephonyManager)context.getSystemService("phone");
        return (new LoyaltyCardOcrPrerequisiteChecker(featurePrerequisiteCheckerUtil, s, new HashSet(allowedCpuAbis), connectivitymanager, context, s1)).check();
    }
}
