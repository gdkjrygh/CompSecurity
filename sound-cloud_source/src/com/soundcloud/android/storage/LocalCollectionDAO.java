// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.UriUtils;

// Referenced classes of package com.soundcloud.android.storage:
//            BaseDAO

public class LocalCollectionDAO extends BaseDAO
{

    public LocalCollectionDAO(ContentResolver contentresolver)
    {
        super(contentresolver);
    }

    public boolean deleteUri(Uri uri)
    {
        return resolver.delete(getContent().uri, "uri = ?", new String[] {
            UriUtils.clearQueryParams(uri).toString()
        }) == 1;
    }

    public LocalCollection fromContentUri(Uri uri, boolean flag)
    {
        Uri uri1 = UriUtils.clearQueryParams(uri);
        Object obj = resolver.query(getContent().uri, null, "uri = ?", new String[] {
            uri1.toString()
        }, null);
        if (obj != null && ((Cursor) (obj)).moveToFirst())
        {
            uri = new LocalCollection(((Cursor) (obj)));
        } else
        {
            uri = null;
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = uri;
        if (uri == null)
        {
            obj = uri;
            if (flag)
            {
                obj = new LocalCollection(uri1);
                create(((com.soundcloud.android.api.legacy.model.behavior.Identifiable) (obj)));
            }
        }
        return ((LocalCollection) (obj));
    }

    public Content getContent()
    {
        return Content.COLLECTIONS;
    }
}
