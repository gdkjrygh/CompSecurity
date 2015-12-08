// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import com.fitbit.data.bl.exceptions.SearchEntityException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.r;
import com.fitbit.ui.choose.c;
import java.util.List;
import org.json.JSONException;

public class i extends c
{

    private static final String a = "SearchFoodLoader";

    public i(Context context, String s)
    {
        super(context, s);
    }

    protected List a(String s)
        throws ServerCommunicationException, JSONException, SearchEntityException
    {
        return r.a().a(s);
    }

    protected String b()
    {
        return "SearchFoodLoader";
    }
}
