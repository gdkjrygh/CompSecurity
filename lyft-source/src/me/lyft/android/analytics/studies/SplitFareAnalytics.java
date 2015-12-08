// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class SplitFareAnalytics
{

    private static final String REASON_CONTACTS_TO_SPLIT_WITH = "no contacts to split with";
    private static final String REASON_NO_VALID_CHARGE_ACCOUNT = "no valid charge account";
    private static final String REASON_USER_ACCEPTED = "user accepted";
    private static final String REASON_USER_REJECTED = "user rejected";
    private static final AsyncActionAnalytics loadContactsAction;
    private static final AsyncActionAnalytics requestAction;
    private static final AsyncActionAnalytics responseAction;

    public SplitFareAnalytics()
    {
    }

    public static void trackSplitLoadContactsAttempt()
    {
        loadContactsAction.trackRequest();
    }

    public static void trackSplitLoadContactsFailure()
    {
        loadContactsAction.trackResponseFailure("no contacts to split with");
    }

    public static void trackSplitLoadContactsSuccess(int i)
    {
        if (i <= 300) goto _L2; else goto _L1
_L1:
        int j = 300;
_L4:
        String s = String.format("at least %d", new Object[] {
            Integer.valueOf(j)
        });
        loadContactsAction.trackResponseSuccess(s);
        return;
_L2:
        if (i >= 100)
        {
            j = 100;
        } else
        if (i >= 50)
        {
            j = 50;
        } else
        if (i >= 10)
        {
            j = 10;
        } else
        {
            j = i;
            if (i >= 1)
            {
                j = 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void trackSplitRequestAttempt()
    {
        requestAction.trackRequest();
    }

    public static void trackSplitRequestCancel()
    {
        UiAnalytics.trackDismiss(UiElement.SPLIT_FARE_INVITE_DISMISS, Category.SPLIT_FARE);
    }

    public static void trackSplitRequestFailure(Throwable throwable)
    {
        requestAction.trackResponseFailure(throwable);
    }

    public static void trackSplitRequestSuccess(int i)
    {
        String s = String.format("split with %d", new Object[] {
            Integer.valueOf(i)
        });
        requestAction.trackResponseSuccess(s);
    }

    public static void trackSplitResponseAttempt()
    {
        responseAction.trackRequest();
    }

    public static void trackSplitResponseFailure(Throwable throwable)
    {
        responseAction.trackResponseFailure(throwable);
    }

    public static void trackSplitResponseNoValidChargeAccount()
    {
        responseAction.trackRequest();
        responseAction.trackResponseFailure("no valid charge account");
    }

    public static void trackSplitResponseSuccess(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "user accepted";
        } else
        {
            s = "user rejected";
        }
        responseAction.trackResponseSuccess(s);
    }

    static 
    {
        loadContactsAction = new AsyncActionAnalytics(ActionName.SPLIT_FARE_LOAD_CONTACTS, Category.SPLIT_FARE);
        requestAction = new AsyncActionAnalytics(ActionName.SPLIT_FARE_REQUEST, Category.SPLIT_FARE);
        responseAction = new AsyncActionAnalytics(ActionName.SPLIT_FARE_RESPONSE, Category.SPLIT_FARE);
    }
}
