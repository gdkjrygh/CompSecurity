// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

public static class init> extends init>
{

    public volatile init> addPhotoFiles(Collection collection)
    {
        return super.ddPhotoFiles(collection);
    }

    public volatile ddPhotoFiles addPhotos(Collection collection)
    {
        return super.ddPhotos(collection);
    }

    protected EnumSet getDialogFeatures()
    {
        return EnumSet.of(_DIALOG, S);
    }

    int getMaximumNumberOfPhotos()
    {
        return MAXIMUM_PHOTO_COUNT;
    }

    public volatile MAXIMUM_PHOTO_COUNT setFriends(List list)
    {
        return super.etFriends(list);
    }

    public volatile etFriends setPlace(String s)
    {
        return super.etPlace(s);
    }

    public (Activity activity)
    {
        super(activity);
    }
}
