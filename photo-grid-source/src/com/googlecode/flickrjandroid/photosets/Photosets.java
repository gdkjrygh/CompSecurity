// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photosets;

import java.util.Collection;

public class Photosets
{

    private static final long serialVersionUID = 12L;
    private boolean canCreate;
    private Collection photosets;

    public Photosets()
    {
    }

    public Collection getPhotosets()
    {
        return photosets;
    }

    public boolean isCanCreate()
    {
        return canCreate;
    }

    public void setCanCreate(boolean flag)
    {
        canCreate = flag;
    }

    public void setPhotosets(Collection collection)
    {
        photosets = collection;
    }
}
