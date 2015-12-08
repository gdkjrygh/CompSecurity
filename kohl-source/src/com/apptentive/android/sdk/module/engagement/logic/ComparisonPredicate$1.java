// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            ComparisonPredicate

static class lueSubFilterType
{

    static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[];
    static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueFilterType[];
    static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[];
    static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[];

    static 
    {
        $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation = new int[lues().length];
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[t.dinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[te.dinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[q.dinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[e.dinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[te.dinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[t.dinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[xists.dinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[ontains.dinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[tarts_with.dinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[nds_with.dinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType = new int[eryType.values().length];
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.application_version.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.application_build.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.current_time.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.is_update.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.time_since_install.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.interactions.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.code_point.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.person.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.device.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.app_release.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[eryType.sdk.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueFilterType = new int[lueFilterType.values().length];
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueFilterType[lueFilterType.invokes.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType = new int[lueSubFilterType.values().length];
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[lueSubFilterType.version.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[lueSubFilterType.build.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[lueSubFilterType.total.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[lueSubFilterType.time_ago.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
