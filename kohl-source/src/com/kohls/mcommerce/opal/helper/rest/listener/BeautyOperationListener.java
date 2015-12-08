// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.rest.listener;

import com.kohls.mcommerce.opal.helper.error.Error;

public interface BeautyOperationListener
{

    public abstract void createNewList(String s);

    public abstract void getListItems(String s);

    public abstract void getUserLists();

    public abstract void onFailure(Error error);

    public abstract void onSuccess(Object obj);

    public abstract void postItems(String s);

    public abstract void postUser();
}
