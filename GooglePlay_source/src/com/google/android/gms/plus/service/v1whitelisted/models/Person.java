// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import com.google.android.gms.common.data.Freezable;

public interface Person
    extends Freezable
{
    public static interface Emails
        extends Freezable
    {
    }

    public static interface Image
        extends Freezable
    {

        public abstract String getUrl();
    }

    public static interface Name
        extends Freezable
    {
    }

    public static interface StatusForViewer
        extends Freezable
    {
    }


    public abstract String getDisplayName();

    public abstract String getId();

    public abstract Image getImage();

    public abstract String getObjectType();

    public abstract String getSuggestionId();
}
