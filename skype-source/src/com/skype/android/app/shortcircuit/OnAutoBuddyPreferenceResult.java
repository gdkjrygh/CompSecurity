// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import android.text.TextUtils;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            AutoBuddyPreferenceResult

public class OnAutoBuddyPreferenceResult
{

    String message;
    AutoBuddyPreferenceResult result;

    public OnAutoBuddyPreferenceResult(AutoBuddyPreferenceResult autobuddypreferenceresult)
    {
        result = autobuddypreferenceresult;
    }

    public OnAutoBuddyPreferenceResult(String s)
    {
        message = s;
    }

    public AutoBuddyPreferenceResult getResult()
    {
        return result;
    }

    public boolean isSuccess()
    {
        return TextUtils.isEmpty(message);
    }
}
