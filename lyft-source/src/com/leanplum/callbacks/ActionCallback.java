// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.callbacks;

import com.leanplum.ActionContext;

public abstract class ActionCallback
{

    public ActionCallback()
    {
    }

    public abstract boolean onResponse(ActionContext actioncontext);
}
