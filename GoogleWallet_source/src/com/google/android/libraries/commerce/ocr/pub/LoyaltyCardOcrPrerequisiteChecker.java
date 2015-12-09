// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.libraries.commerce.ocr.pub:
//            FeaturePrerequisiteChecker, FeaturePrerequisiteCheckerUtil

public class LoyaltyCardOcrPrerequisiteChecker
    implements FeaturePrerequisiteChecker
{

    private static final String TAG = "LoyaltyCardOcrPrerequisiteChecker";
    private final HashSet allowedCpus;
    private final HashSet blockedMobileNetworkTypes;
    private final FeaturePrerequisiteCheckerUtil checkerUtil;
    private final ConnectivityManager connectivityManager;
    private final HashSet modelBlacklist;
    private final TelephonyManager telephonyManager;

    public LoyaltyCardOcrPrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, String s, HashSet hashset, ConnectivityManager connectivitymanager, TelephonyManager telephonymanager, String s1)
    {
        this(featureprerequisitecheckerutil, FeaturePrerequisiteCheckerUtil.split(s), hashset, connectivitymanager, telephonymanager, convertBlockedMobileNetworkTypes(s1));
    }

    protected LoyaltyCardOcrPrerequisiteChecker(FeaturePrerequisiteCheckerUtil featureprerequisitecheckerutil, HashSet hashset, HashSet hashset1, ConnectivityManager connectivitymanager, TelephonyManager telephonymanager, HashSet hashset2)
    {
        checkerUtil = featureprerequisitecheckerutil;
        allowedCpus = hashset1;
        modelBlacklist = hashset;
        connectivityManager = connectivitymanager;
        telephonyManager = telephonymanager;
        blockedMobileNetworkTypes = hashset2;
    }

    private static HashSet convertBlockedMobileNetworkTypes(String s)
    {
        Object obj = FeaturePrerequisiteCheckerUtil.split(s);
        s = new HashSet(((HashSet) (obj)).size());
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(Integer.valueOf((String)((Iterator) (obj)).next()))) { }
        return s;
    }

    public boolean check()
    {
        if (checkerUtil.buildVersionOK() && checkerUtil.modelOK(modelBlacklist) && checkerUtil.cpuAbiOK(allowedCpus) && checkerUtil.cameraOK() && checkerUtil.orientationOk() && checkerUtil.isConnectionOK(blockedMobileNetworkTypes, connectivityManager, telephonyManager))
        {
            Log.d("LoyaltyCardOcrPrerequisiteChecker", "All prerequisites OK.");
            return true;
        } else
        {
            return false;
        }
    }
}
