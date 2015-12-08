// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;


public interface VariantItemView
{

    public abstract void setAvailable(boolean flag);

    public abstract void setPrice(String s);

    public abstract void setRowClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract void setTitle(String s);
}
