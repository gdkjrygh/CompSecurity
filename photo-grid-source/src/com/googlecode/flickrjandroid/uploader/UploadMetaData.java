// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.uploader;

import java.util.Collection;

public class UploadMetaData
{

    private boolean async;
    private String contentType;
    private String description;
    private boolean familyFlag;
    private boolean friendFlag;
    private Boolean hidden;
    private boolean publicFlag;
    private String safetyLevel;
    private Collection tags;
    private String title;

    public UploadMetaData()
    {
        publicFlag = true;
        async = false;
    }

    public String getContentType()
    {
        return contentType;
    }

    public String getDescription()
    {
        return description;
    }

    public String getSafetyLevel()
    {
        return safetyLevel;
    }

    public Collection getTags()
    {
        return tags;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isAsync()
    {
        return async;
    }

    public boolean isFamilyFlag()
    {
        return familyFlag;
    }

    public boolean isFriendFlag()
    {
        return friendFlag;
    }

    public Boolean isHidden()
    {
        return hidden;
    }

    public boolean isPublicFlag()
    {
        return publicFlag;
    }

    public void setAsync(boolean flag)
    {
        async = flag;
    }

    public void setContentType(String s)
    {
        contentType = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setFamilyFlag(boolean flag)
    {
        familyFlag = flag;
    }

    public void setFriendFlag(boolean flag)
    {
        friendFlag = flag;
    }

    public void setHidden(Boolean boolean1)
    {
        hidden = boolean1;
    }

    public void setPublicFlag(boolean flag)
    {
        publicFlag = flag;
    }

    public void setSafetyLevel(String s)
    {
        safetyLevel = s;
    }

    public void setTags(Collection collection)
    {
        tags = collection;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
