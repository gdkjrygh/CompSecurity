// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.database.Cursor;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.activities.ActivityKind;
import com.soundcloud.android.activities.ActivityProperty;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            Activity

public class AffiliationActivity extends Activity
{

    private PublicApiUser user;

    public AffiliationActivity()
    {
    }

    public AffiliationActivity(Cursor cursor)
    {
        super(cursor);
        user = SoundCloudApplication.sModelManager.getCachedUserFromActivityCursor(cursor);
    }

    public void cacheDependencies()
    {
        user = SoundCloudApplication.sModelManager.cache(user, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.MINI);
    }

    public Playable getPlayable()
    {
        return null;
    }

    public Refreshable getRefreshableResource()
    {
        return user;
    }

    public Activity.Type getType()
    {
        return Activity.Type.AFFILIATION;
    }

    public PublicApiUser getUser()
    {
        return user;
    }

    public boolean isIncomplete()
    {
        return user == null || user.isIncomplete();
    }

    public void setUser(PublicApiUser publicapiuser)
    {
        user = publicapiuser;
    }

    public PropertySet toPropertySet()
    {
        return super.toPropertySet().put(ActivityProperty.KIND, ActivityKind.USER_FOLLOW).put(ActivityProperty.USER_NAME, user.getUsername());
    }
}
