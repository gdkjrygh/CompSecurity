// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.web;

import android.content.Context;
import com.skype.android.config.ApplicationConfig;
import org.json.JSONException;

public interface ConfigParser
{

    public abstract String getKey();

    public abstract boolean isArray();

    public abstract void parse(Context context, ApplicationConfig applicationconfig, Object obj)
        throws JSONException;
}
