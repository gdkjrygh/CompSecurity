// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import org.json.JSONObject;

public interface Response
{

    public abstract JSONObject getData();

    public abstract String getErrorCode();

    public abstract String getErrorMessage();

    public abstract String getRawResponse();

    public abstract boolean isError();

    public abstract void parse(String s);
}
