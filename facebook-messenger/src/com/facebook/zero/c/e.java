// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.c;

import android.content.Context;
import android.preference.Preference;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.zero.annotations.IsZeroRatingFeatureEnabled;
import javax.inject.a;

public class e extends Preference
{

    private final a a;

    public e(Context context)
    {
        super(context);
        a = t.a(context).b(java/lang/Boolean, com/facebook/zero/annotations/IsZeroRatingFeatureEnabled);
        setTitle(o.preference_zero_rating_available_title);
        if (((Boolean)a.b()).booleanValue())
        {
            setSummary(o.preference_zero_rating_available_yes);
            return;
        } else
        {
            setSummary(o.preference_zero_rating_available_no);
            return;
        }
    }
}
