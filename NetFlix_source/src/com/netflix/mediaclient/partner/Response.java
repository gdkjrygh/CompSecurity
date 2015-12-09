// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;
import org.json.JSONException;
import org.json.JSONObject;

public interface Response
{

    public abstract String getId();

    public abstract ComponentName getResponder();

    public abstract String getService();

    public abstract JSONObject toJson()
        throws JSONException;
}
