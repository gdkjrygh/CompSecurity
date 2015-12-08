// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.view.CommerceFormView;

public interface CommerceFormBaseController
{

    public abstract void onDestroyView();

    public abstract void onViewCreated(CommerceFormView commerceformview);
}
