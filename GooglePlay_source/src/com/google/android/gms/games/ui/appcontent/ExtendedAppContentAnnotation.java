// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.appcontent.AppContentAnnotation;

public class ExtendedAppContentAnnotation
    implements AppContentAnnotation
{

    private String mDescription;
    private String mId;
    private String mImageDefaultId;
    private int mImageHeight;
    private Uri mImageUri;
    private int mImageWidth;
    public String mLayoutSlot;
    Bundle mModifiers;
    String mTitle;

    public ExtendedAppContentAnnotation()
    {
        mDescription = "";
        mId = "";
        mImageDefaultId = "";
        mImageHeight = 1;
        mImageWidth = 1;
        mImageUri = null;
        mLayoutSlot = "";
        mTitle = "";
        mModifiers = new Bundle();
    }

    public ExtendedAppContentAnnotation(AppContentAnnotation appcontentannotation)
    {
        mDescription = appcontentannotation.getDescription();
        mId = appcontentannotation.getId();
        mImageDefaultId = appcontentannotation.getImageDefaultId();
        mImageHeight = appcontentannotation.getImageHeight();
        mImageWidth = appcontentannotation.getImageWidth();
        mImageUri = appcontentannotation.getImageUri();
        mLayoutSlot = appcontentannotation.getLayoutSlot();
        mTitle = appcontentannotation.getTitle();
        mModifiers = appcontentannotation.getModifiers();
    }

    public int describeContents()
    {
        return 0;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final String getId()
    {
        return mId;
    }

    public final String getImageDefaultId()
    {
        return mImageDefaultId;
    }

    public final int getImageHeight()
    {
        return mImageHeight;
    }

    public final Uri getImageUri()
    {
        return mImageUri;
    }

    public final int getImageWidth()
    {
        return mImageWidth;
    }

    public final String getLayoutSlot()
    {
        return mLayoutSlot;
    }

    public final Bundle getModifiers()
    {
        return mModifiers;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }
}
