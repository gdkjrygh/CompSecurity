// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.Intent;

class ActivityResult
{

    public final Intent intent;
    public final int requestCode;
    public final int resultCode;

    ActivityResult(int i, int j, Intent intent1)
    {
        requestCode = i;
        resultCode = j;
        intent = intent1;
    }

    static ActivityResult empty()
    {
        return new ActivityResult(-1, -1, new Intent());
    }
}
