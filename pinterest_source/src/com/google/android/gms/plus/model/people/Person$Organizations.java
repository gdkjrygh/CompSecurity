// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public interface 
    extends Freezable
{

    public abstract String getDepartment();

    public abstract String getDescription();

    public abstract String getEndDate();

    public abstract String getLocation();

    public abstract String getName();

    public abstract String getStartDate();

    public abstract String getTitle();

    public abstract int getType();

    public abstract boolean hasDepartment();

    public abstract boolean hasDescription();

    public abstract boolean hasEndDate();

    public abstract boolean hasLocation();

    public abstract boolean hasName();

    public abstract boolean hasPrimary();

    public abstract boolean hasStartDate();

    public abstract boolean hasTitle();

    public abstract boolean hasType();

    public abstract boolean isPrimary();
}
