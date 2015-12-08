// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.mdxcontroller;

import org.json.JSONObject;

public interface SessionController
{

    public abstract void endSession(int i);

    public abstract String getLastMessageName(int i);

    public abstract long sendMessage(int i, String s, JSONObject jsonobject);

    public abstract void startSession(String s);
}
