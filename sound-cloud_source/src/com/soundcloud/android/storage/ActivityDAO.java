// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.activities.Activities;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.storage:
//            BaseDAO

class ActivityDAO extends BaseDAO
{

    public ActivityDAO(ContentResolver contentresolver)
    {
        super(contentresolver);
    }

    public Content getContent()
    {
        return Content.ME_ALL_ACTIVITIES;
    }

    public int insert(Content content, Activities activities)
    {
        Object obj1 = new HashSet();
        Iterator iterator = activities.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            try
            {
                ((Set) (obj1)).addAll(activity.getDependentModels());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                AccountOperations accountoperations = SoundCloudApplication.instance.getAccountOperations();
                ErrorUtils.handleSilentException(new Exception((new StringBuilder("Failed dependency lookup for Activity ")).append(activity).append("; content=").append(content).append("; token=").append(accountoperations.getSoundCloudToken()).append("; next_href=").append(activities.next_href).toString()));
                throw obj1;
            }
        } while (true);
        Object obj = new HashMap();
        PublicApiResource publicapiresource;
        Uri uri;
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List)((Map) (obj)).get(uri)).add(publicapiresource.buildContentValues()))
        {
            publicapiresource = (PublicApiResource)((Iterator) (obj1)).next();
            uri = publicapiresource.getBulkInsertUri();
            if (((Map) (obj)).get(uri) == null)
            {
                ((Map) (obj)).put(uri, new ArrayList());
            }
        }

        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); resolver.bulkInsert((Uri)entry.getKey(), (ContentValues[])((List)entry.getValue()).toArray(new ContentValues[((List)entry.getValue()).size()])))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return resolver.bulkInsert(content.uri, activities.buildContentValues(content.id));
    }

    protected Activity objFromCursor(Cursor cursor)
    {
        return com.soundcloud.android.api.legacy.model.activities.Activity.Type.fromString(cursor.getString(cursor.getColumnIndex("type"))).fromCursor(cursor);
    }

    protected volatile Identifiable objFromCursor(Cursor cursor)
    {
        return objFromCursor(cursor);
    }
}
