// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.profile;

import com.digby.localpoint.sdk.core.ILPError;
import java.util.Map;

public interface ILPAttributeListener
{

    public abstract void onUpdateFailure(Map map, ILPError ilperror);

    public abstract void onUpdateSuccess(Map map);
}
