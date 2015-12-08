// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge;

import org.json.JSONObject;

public interface NrdpObject
{

    public static final int NEED_FURTHER_HANDLE = 0;
    public static final int NEED_PUBLISH = -1;
    public static final int NO_MORE_HANDLE = 1;

    public abstract String getName();

    public abstract String getPath();

    public abstract int processUpdate(JSONObject jsonobject);
}
