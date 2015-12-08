// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.controller.iface;


public interface IViewControllerListener
{

    public abstract void notifyViewOnFailure(Object obj);

    public abstract void notifyViewOnSuccess(Object obj);
}
