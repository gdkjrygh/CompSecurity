// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.storage:
//            BaseDAO

public final class contentUri
{

    private static final int INITIAL_SELECTION_CAPACITY = 200;
    private final Uri contentUri;
    private int limit;
    private String order;
    private String projection[];
    private final StringBuilder selection = new StringBuilder(200);
    private final List selectionArgs = new LinkedList();
    final BaseDAO this$0;

    private Uri resolveContentUri()
    {
        Uri uri = contentUri;
        if (limit > 0)
        {
            uri = contentUri.buildUpon().ryParameter("limit", String.valueOf(limit)).limit();
        }
        return uri;
    }

    private String resolveSelection()
    {
        String s = null;
        if (!TextUtils.isEmpty(selection))
        {
            s = selection.toString().trim();
        }
        return s;
    }

    private String[] resolveSelectionArgs()
    {
        String as[] = null;
        if (!selectionArgs.isEmpty())
        {
            as = (String[])Iterables.toArray(selectionArgs, java/lang/String);
        }
        return as;
    }

    public final Identifiable first()
    {
        List list = limit(1).queryAll();
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (Identifiable)list.get(0);
        }
    }

    public final ntifiable limit(int i)
    {
        limit = i;
        return this;
    }

    public final limit order(String s)
    {
        order = s;
        return this;
    }

    public final List queryAll()
    {
        Object obj;
        obj = resolveContentUri();
        String s = resolveSelection();
        String as[] = resolveSelectionArgs();
        obj = resolver.query(((Uri) (obj)), projection, s, as, order);
        if (obj == null)
        {
            return Collections.emptyList();
        }
        Object obj1;
        obj1 = new ArrayList(((Cursor) (obj)).getCount());
        for (; ((Cursor) (obj)).moveToNext(); ((List) (obj1)).add(objFromCursor(((Cursor) (obj))))) { }
        break MISSING_BLOCK_LABEL_95;
        obj1;
        ((Cursor) (obj)).close();
        throw obj1;
        ((Cursor) (obj)).close();
        return ((List) (obj1));
    }

    public final List queryIds()
    {
        Object obj;
        obj = resolveContentUri();
        String s = resolveSelection();
        String as[] = resolveSelectionArgs();
        obj = resolver.query(((Uri) (obj)), new String[] {
            "_id"
        }, s, as, null);
        if (obj == null)
        {
            return Collections.emptyList();
        }
        Object obj1;
        obj1 = new ArrayList(((Cursor) (obj)).getCount());
        for (; ((Cursor) (obj)).moveToNext(); ((List) (obj1)).add(Long.valueOf(((Cursor) (obj)).getLong(0)))) { }
        break MISSING_BLOCK_LABEL_99;
        obj1;
        ((Cursor) (obj)).close();
        throw obj1;
        ((Cursor) (obj)).close();
        return ((List) (obj1));
    }

    public final transient resolveSelectionArgs select(String as[])
    {
        projection = as;
        return this;
    }

    public final transient projection where(String s, String as[])
    {
        selection.append(s);
        selectionArgs.addAll(Arrays.asList(as));
        return this;
    }

    public final selectionArgs whereIn(String s, List list)
    {
        selection.append(s).append(" IN (");
        s = Collections.nCopies(list.size(), "?");
        Strings.joinOn(",").appendTo(selection, s);
        selection.append(") ");
        selectionArgs.addAll(list);
        return this;
    }

    public final transient selectionArgs whereIn(String s, String as[])
    {
        return whereIn(s, Arrays.asList(as));
    }

    public ntifiable(Uri uri)
    {
        this$0 = BaseDAO.this;
        super();
        contentUri = uri;
    }
}
