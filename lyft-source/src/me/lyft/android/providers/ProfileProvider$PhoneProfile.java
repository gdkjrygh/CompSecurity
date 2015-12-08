// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.net.Uri;
import me.lyft.android.common.Objects;

public class 
{

    private String firstName;
    private String lastName;
    private Uri photoUri;

    public String getFirstName()
    {
        return (String)Objects.firstNonNull(firstName, "");
    }

    public String getLastName()
    {
        return (String)Objects.firstNonNull(lastName, "");
    }

    public Uri getPhotoUri()
    {
        return photoUri;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setPhotoUri(Uri uri)
    {
        photoUri = uri;
    }

    public ()
    {
    }
}
