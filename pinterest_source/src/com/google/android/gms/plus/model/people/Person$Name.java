// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public interface 
    extends Freezable
{

    public abstract String getFamilyName();

    public abstract String getFormatted();

    public abstract String getGivenName();

    public abstract String getHonorificPrefix();

    public abstract String getHonorificSuffix();

    public abstract String getMiddleName();

    public abstract boolean hasFamilyName();

    public abstract boolean hasFormatted();

    public abstract boolean hasGivenName();

    public abstract boolean hasHonorificPrefix();

    public abstract boolean hasHonorificSuffix();

    public abstract boolean hasMiddleName();
}
