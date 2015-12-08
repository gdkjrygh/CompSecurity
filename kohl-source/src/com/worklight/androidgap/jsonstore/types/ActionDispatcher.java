// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.types;

import org.apache.cordova.PluginResult;
import org.json.JSONArray;

public interface ActionDispatcher
{

    public abstract PluginResult dispatch(JSONArray jsonarray)
        throws Throwable;

    public abstract String getName();
}
