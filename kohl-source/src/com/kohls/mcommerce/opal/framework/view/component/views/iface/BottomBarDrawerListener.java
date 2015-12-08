// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.component.views.iface;


public interface BottomBarDrawerListener
{

    public abstract void onCollapsing();

    public abstract void onExpanding();

    public abstract void onHidden();

    public abstract void onMoving(int i);
}
