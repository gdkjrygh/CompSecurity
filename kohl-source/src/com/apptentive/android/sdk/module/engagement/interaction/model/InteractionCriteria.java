// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.module.engagement.logic.Predicate;
import org.json.JSONException;
import org.json.JSONObject;

public class InteractionCriteria extends JSONObject
{

    public InteractionCriteria(String s)
        throws JSONException
    {
        super(s);
    }

    public boolean isMet(Context context)
    {
        boolean flag;
        try
        {
            flag = Predicate.parse(null, this).apply(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Error parsing and running InteractionCriteria predicate logic.", context, new Object[0]);
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Error parsing and running InteractionCriteria predicate logic.", context, new Object[0]);
            return false;
        }
        return flag;
    }
}
