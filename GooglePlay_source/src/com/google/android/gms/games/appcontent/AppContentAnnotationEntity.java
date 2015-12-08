// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotation, AppContentAnnotationEntityCreator

public final class AppContentAnnotationEntity
    implements SafeParcelable, AppContentAnnotation
{

    public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();
    final String mDescription;
    final String mId;
    final String mImageDefaultId;
    final int mImageHeight;
    final Uri mImageUri;
    final int mImageWidth;
    final String mLayoutSlot;
    private final Bundle mModifiers;
    final String mTitle;
    final int mVersionCode;

    AppContentAnnotationEntity(int i, String s, Uri uri, String s1, String s2, String s3, String s4, 
            int j, int k, Bundle bundle)
    {
        mVersionCode = i;
        mDescription = s;
        mId = s2;
        mImageDefaultId = s4;
        mImageHeight = j;
        mImageUri = uri;
        mImageWidth = k;
        mLayoutSlot = s3;
        mModifiers = bundle;
        mTitle = s1;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appcontentannotation)
    {
        mVersionCode = 4;
        mDescription = appcontentannotation.getDescription();
        mId = appcontentannotation.getId();
        mImageDefaultId = appcontentannotation.getImageDefaultId();
        mImageHeight = appcontentannotation.getImageHeight();
        mImageUri = appcontentannotation.getImageUri();
        mImageWidth = appcontentannotation.getImageWidth();
        mLayoutSlot = appcontentannotation.getLayoutSlot();
        mModifiers = appcontentannotation.getModifiers();
        mTitle = appcontentannotation.getTitle();
    }

    static boolean equals(AppContentAnnotation appcontentannotation, Object obj)
    {
        if (obj instanceof AppContentAnnotation)
        {
            if (appcontentannotation == obj)
            {
                return true;
            }
            obj = (AppContentAnnotation)obj;
            if (Objects.equal(((AppContentAnnotation) (obj)).getDescription(), appcontentannotation.getDescription()) && Objects.equal(((AppContentAnnotation) (obj)).getId(), appcontentannotation.getId()) && Objects.equal(((AppContentAnnotation) (obj)).getImageDefaultId(), appcontentannotation.getImageDefaultId()) && Objects.equal(Integer.valueOf(((AppContentAnnotation) (obj)).getImageHeight()), Integer.valueOf(appcontentannotation.getImageHeight())) && Objects.equal(((AppContentAnnotation) (obj)).getImageUri(), appcontentannotation.getImageUri()) && Objects.equal(Integer.valueOf(((AppContentAnnotation) (obj)).getImageWidth()), Integer.valueOf(appcontentannotation.getImageWidth())) && Objects.equal(((AppContentAnnotation) (obj)).getLayoutSlot(), appcontentannotation.getLayoutSlot()) && Objects.equal(((AppContentAnnotation) (obj)).getModifiers(), appcontentannotation.getModifiers()) && Objects.equal(((AppContentAnnotation) (obj)).getTitle(), appcontentannotation.getTitle()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(AppContentAnnotation appcontentannotation)
    {
        return Arrays.hashCode(new Object[] {
            appcontentannotation.getDescription(), appcontentannotation.getId(), appcontentannotation.getImageDefaultId(), Integer.valueOf(appcontentannotation.getImageHeight()), appcontentannotation.getImageUri(), Integer.valueOf(appcontentannotation.getImageWidth()), appcontentannotation.getLayoutSlot(), appcontentannotation.getModifiers(), appcontentannotation.getTitle()
        });
    }

    static String toString(AppContentAnnotation appcontentannotation)
    {
        return Objects.toStringHelper(appcontentannotation).add("Description", appcontentannotation.getDescription()).add("Id", appcontentannotation.getId()).add("ImageDefaultId", appcontentannotation.getImageDefaultId()).add("ImageHeight", Integer.valueOf(appcontentannotation.getImageHeight())).add("ImageUri", appcontentannotation.getImageUri()).add("ImageWidth", Integer.valueOf(appcontentannotation.getImageWidth())).add("LayoutSlot", appcontentannotation.getLayoutSlot()).add("Modifiers", appcontentannotation.getModifiers()).add("Title", appcontentannotation.getTitle()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((AppContentAnnotation) (this)), obj);
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

    public final int hashCode()
    {
        return hashCode(((AppContentAnnotation) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((AppContentAnnotation) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppContentAnnotationEntityCreator.writeToParcel(this, parcel, i);
    }

}
