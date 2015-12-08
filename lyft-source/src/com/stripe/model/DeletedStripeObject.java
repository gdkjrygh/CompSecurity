// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


public interface DeletedStripeObject
{

    public abstract Boolean getDeleted();

    public abstract String getId();

    public abstract void setDeleted(Boolean boolean1);

    public abstract void setId(String s);
}
