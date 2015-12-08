// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.api.legacy.model.behavior.Persisted;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.UriUtils;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.storage:
//            DAOException

public abstract class BaseDAO
{
    public final class QueryBuilder
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
                uri = contentUri.buildUpon().appendQueryParameter("limit", String.valueOf(limit)).build();
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

        public final QueryBuilder limit(int i)
        {
            limit = i;
            return this;
        }

        public final QueryBuilder order(String s)
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

        public final transient QueryBuilder select(String as[])
        {
            projection = as;
            return this;
        }

        public final transient QueryBuilder where(String s, String as[])
        {
            selection.append(s);
            selectionArgs.addAll(Arrays.asList(as));
            return this;
        }

        public final QueryBuilder whereIn(String s, List list)
        {
            selection.append(s).append(" IN (");
            s = Collections.nCopies(list.size(), "?");
            Strings.joinOn(",").appendTo(selection, s);
            selection.append(") ");
            selectionArgs.addAll(list);
            return this;
        }

        public final transient QueryBuilder whereIn(String s, String as[])
        {
            return whereIn(s, Arrays.asList(as));
        }

        public QueryBuilder(Uri uri)
        {
            this$0 = BaseDAO.this;
            super();
            contentUri = uri;
        }
    }


    public static final int RESOLVER_BATCH_SIZE = 500;
    protected final ContentResolver resolver;

    public BaseDAO(ContentResolver contentresolver)
    {
        resolver = contentresolver;
    }

    public QueryBuilder buildQuery()
    {
        return buildQuery(getContent().uri);
    }

    public QueryBuilder buildQuery(Uri uri)
    {
        return new QueryBuilder(uri);
    }

    public transient int count(String s, String as[])
    {
        s = resolver.query(getContent().uri, null, s, as, null);
        if (s == null)
        {
            return 0;
        }
        int i = s.getCount();
        s.close();
        return i;
        as;
        s.close();
        throw as;
    }

    public long create(ContentValues contentvalues)
    {
        Uri uri = resolver.insert(getContent().uri, contentvalues);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        Long long1;
        long l;
        try
        {
            long1 = contentvalues.getAsLong("_id");
        }
        // Misplaced declaration of an exception variable
        catch (ContentValues contentvalues)
        {
            throw new DAOException(contentvalues);
        }
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        contentvalues = long1;
        if (long1.longValue() > 0L)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        contentvalues = Long.valueOf(Long.parseLong(uri.getLastPathSegment()));
        l = contentvalues.longValue();
        return l;
        throw new DAOException();
    }

    public long create(Identifiable identifiable)
    {
        createDependencies(identifiable);
        long l = create(((Persisted)identifiable).buildContentValues());
        identifiable.setId(l);
        return l;
    }

    public int createCollection(Collection collection)
    {
        BulkInsertMap bulkinsertmap = new BulkInsertMap();
        for (collection = collection.iterator(); collection.hasNext(); ((Persisted)(Identifiable)collection.next()).putFullContentValues(bulkinsertmap)) { }
        return bulkinsertmap.insert(resolver);
    }

    protected void createDependencies(Identifiable identifiable)
    {
        BulkInsertMap bulkinsertmap = new BulkInsertMap();
        ((Persisted)identifiable).putDependencyValues(bulkinsertmap);
        bulkinsertmap.insert(resolver);
    }

    public long createOrUpdate(long l, ContentValues contentvalues)
    {
        if (queryById(l) == null)
        {
            return create(contentvalues);
        } else
        {
            update(l, contentvalues);
            return l;
        }
    }

    protected transient boolean delete(Uri uri, String s, String as[])
    {
        return resolver.delete(uri, s, as) == 1;
    }

    public boolean delete(Identifiable identifiable)
    {
        return delete(((Persisted)identifiable).toUri(), null, new String[0]);
    }

    public boolean deleteAll()
    {
        return delete(getContent().uri, null, new String[0]);
    }

    public abstract Content getContent();

    ContentResolver getContentResolver()
    {
        return resolver;
    }

    public Class getModelClass()
    {
        Class class1 = getContent().modelType;
        if (class1 == null)
        {
            throw new DAOException("No modelclass defined");
        } else
        {
            return class1;
        }
    }

    protected Identifiable objFromCursor(Cursor cursor)
    {
        try
        {
            cursor = (Identifiable)getModelClass().getConstructor(new Class[] {
                android/database/Cursor
            }).newInstance(new Object[] {
                cursor
            });
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw new AssertionError("Could not find constructor for resource.");
        }
        return cursor;
    }

    public List queryAll()
    {
        return queryAllByUri(getContent().uri);
    }

    protected List queryAllByUri(Uri uri)
    {
        return (new QueryBuilder(uri)).queryAll();
    }

    public Identifiable queryById(long l)
    {
        Cursor cursor;
        Uri uri;
        uri = getContent().forId(l);
        cursor = resolver.query(uri, null, null, null, null);
        if (cursor == null)
        {
            return null;
        }
        Identifiable identifiable;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        identifiable = objFromCursor(cursor);
        cursor.close();
        return identifiable;
        cursor.close();
        return null;
        Throwable throwable;
        throwable;
        ErrorUtils.handleSilentException((new StringBuilder("query_uri=")).append(uri).toString(), throwable);
        cursor.close();
        return null;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public Identifiable queryByUri(Uri uri)
    {
        return queryById(UriUtils.getLastSegmentAsLong(uri));
    }

    public boolean update(long l, ContentValues contentvalues)
    {
        return resolver.update(getContent().forId(l), contentvalues, null, null) == 1;
    }

    public boolean update(Identifiable identifiable)
    {
        return update(identifiable.getId(), ((Persisted)identifiable).buildContentValues());
    }
}
