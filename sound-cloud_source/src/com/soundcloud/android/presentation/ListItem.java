// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;

public interface ListItem
{

    public abstract Urn getEntityUrn();

    public abstract ListItem update(PropertySet propertyset);
}
