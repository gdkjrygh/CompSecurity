// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            CallbackManager, FacebookCallback

public interface FacebookDialog
{

    public abstract boolean canShow(Object obj);

    public abstract void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback);

    public abstract void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i);

    public abstract void show(Object obj);
}
