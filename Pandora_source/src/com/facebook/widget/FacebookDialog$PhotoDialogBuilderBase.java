// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

private static abstract class imageAttachmentUrls extends imageAttachmentUrls
{

    static int MAXIMUM_PHOTO_COUNT = 6;
    private ArrayList friends;
    private ArrayList imageAttachmentUrls;
    private String place;

    public imageAttachmentUrls addPhotoFiles(Collection collection)
    {
        imageAttachmentUrls.addAll(addImageAttachmentFiles(collection));
        return this;
    }

    public addImageAttachmentFiles addPhotos(Collection collection)
    {
        imageAttachmentUrls.addAll(addImageAttachments(collection));
        return this;
    }

    abstract int getMaximumNumberOfPhotos();

    protected Bundle getMethodArguments()
    {
        Bundle bundle = new Bundle();
        putExtra(bundle, "PLACE", place);
        bundle.putStringArrayList("PHOTOS", imageAttachmentUrls);
        if (!Utility.isNullOrEmpty(friends))
        {
            bundle.putStringArrayList("FRIENDS", friends);
        }
        return bundle;
    }

    protected Bundle setBundleExtras(Bundle bundle)
    {
        putExtra(bundle, "com.facebook.platform.extra.APPLICATION_ID", applicationId);
        putExtra(bundle, "com.facebook.platform.extra.APPLICATION_NAME", applicationName);
        putExtra(bundle, "com.facebook.platform.extra.PLACE", place);
        bundle.putStringArrayList("com.facebook.platform.extra.PHOTOS", imageAttachmentUrls);
        if (!Utility.isNullOrEmpty(friends))
        {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", friends);
        }
        return bundle;
    }

    public friends setFriends(List list)
    {
        friends = new ArrayList(list);
        return this;
    }

    public friends setPlace(String s)
    {
        place = s;
        return this;
    }

    void validate()
    {
        super.place();
        if (imageAttachmentUrls.isEmpty())
        {
            throw new FacebookException("Must specify at least one photo.");
        }
        if (imageAttachmentUrls.size() > getMaximumNumberOfPhotos())
        {
            throw new FacebookException(String.format("Cannot add more than %d photos.", new Object[] {
                Integer.valueOf(getMaximumNumberOfPhotos())
            }));
        } else
        {
            return;
        }
    }


    public (Activity activity)
    {
        super(activity);
        imageAttachmentUrls = new ArrayList();
    }
}
