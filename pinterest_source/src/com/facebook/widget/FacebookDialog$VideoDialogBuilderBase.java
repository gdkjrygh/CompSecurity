// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.FacebookException;
import java.io.File;

abstract class  extends 
{

    private String place;
    private String videoAttachmentUrl;

    public  addVideoFile(File file)
    {
        videoAttachmentUrl = addVideoAttachmentFile(file);
        return this;
    }

    protected Bundle getMethodArguments()
    {
        Bundle bundle = new Bundle();
        putExtra(bundle, "PLACE", place);
        bundle.putString("VIDEO", videoAttachmentUrl);
        return bundle;
    }

    public videoAttachmentUrl setPlace(String s)
    {
        place = s;
        return this;
    }

    public place setVideoUrl(String s)
    {
        videoAttachmentUrl = s;
        return this;
    }

    void validate()
    {
        super.videoAttachmentUrl();
        if (videoAttachmentUrl == null || videoAttachmentUrl.isEmpty())
        {
            throw new FacebookException("Must specify at least one video.");
        } else
        {
            return;
        }
    }

    public (Activity activity)
    {
        super(activity);
    }
}
