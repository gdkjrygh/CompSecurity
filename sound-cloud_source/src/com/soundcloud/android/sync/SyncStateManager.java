// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.android.storage.LocalCollectionDAO;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.android.utils.UriUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.b;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncContent, ApiSyncResult

public class SyncStateManager
{
    class ChangeObserver extends ContentObserver
    {

        private final com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener listener;
        private final LocalCollection syncState;
        final SyncStateManager this$0;

        public boolean deliverSelfNotifications()
        {
            return true;
        }

        public com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener getListener()
        {
            return listener;
        }

        public void onChange(boolean flag)
        {
            (new SyncStateQueryHandler(syncState, listener)).startQuery(0, null, Content.COLLECTIONS.uri, null, "_id = ?", new String[] {
                String.valueOf(syncState.getId())
            }, null);
        }

        public ChangeObserver(LocalCollection localcollection, com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener onchangelistener)
        {
            this$0 = SyncStateManager.this;
            super(new Handler(Looper.getMainLooper()));
            syncState = localcollection;
            listener = onchangelistener;
        }
    }

    private class SyncStateQueryHandler extends AsyncQueryHandler
    {

        private final com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener listener;
        private final LocalCollection localCollection;
        final SyncStateManager this$0;

        protected void onQueryComplete(int i, Object obj, Cursor cursor)
        {
            onCollectionAsyncQueryReturn(cursor, localCollection, listener);
        }

        public SyncStateQueryHandler(LocalCollection localcollection, com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener onchangelistener)
        {
            this$0 = SyncStateManager.this;
            super(resolver);
            localCollection = localcollection;
            listener = onchangelistener;
        }
    }


    private final Map contentObservers;
    private final LocalCollectionDAO localCollectionDao;
    private final ContentResolver resolver;

    public SyncStateManager(ContentResolver contentresolver, LocalCollectionDAO localcollectiondao)
    {
        resolver = contentresolver;
        localCollectionDao = localcollectiondao;
        contentObservers = new HashMap();
    }

    public SyncStateManager(Context context)
    {
        this(context.getApplicationContext().getContentResolver(), new LocalCollectionDAO(context.getApplicationContext().getContentResolver()));
    }

    public void addChangeListener(LocalCollection localcollection, com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener onchangelistener)
    {
        onchangelistener = new ChangeObserver(localcollection, onchangelistener);
        contentObservers.put(Long.valueOf(localcollection.getId()), onchangelistener);
        if (localcollection.getId() > 0L)
        {
            localcollection = Content.COLLECTIONS.uri.buildUpon().appendPath(String.valueOf(localcollection.getId())).build();
            resolver.registerContentObserver(localcollection, true, onchangelistener);
        }
    }

    public void clear()
    {
        localCollectionDao.deleteAll();
    }

    public boolean delete(Content content)
    {
        return localCollectionDao.deleteUri(content.uri);
    }

    public Boolean forceToStale(Content content)
    {
        content = fromContent(content.uri);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("last_sync", Integer.valueOf(0));
        contentvalues.put("last_sync_attempt", Integer.valueOf(0));
        return Boolean.valueOf(localCollectionDao.update(content.getId(), contentvalues));
    }

    public b forceToStaleAsync(final Content content)
    {
        return b.create(new _cls1()).subscribeOn(ScSchedulers.HIGH_PRIO_SCHEDULER);
    }

    public LocalCollection fromContent(Uri uri)
    {
        return localCollectionDao.fromContentUri(uri, true);
    }

    public LocalCollection fromContent(Content content)
    {
        return fromContent(content.uri);
    }

    public LocalCollection fromContentAsync(Uri uri, com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener onchangelistener)
    {
        uri = UriUtils.clearQueryParams(uri);
        LocalCollection localcollection = new LocalCollection(uri);
        (new SyncStateQueryHandler(localcollection, onchangelistener)).startQuery(0, null, Content.COLLECTIONS.uri, null, "uri = ?", new String[] {
            uri.toString()
        }, null);
        return localcollection;
    }

    public List getCollectionsDueForSync(EnumSet enumset, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        enumset = enumset.iterator();
        do
        {
            if (!enumset.hasNext())
            {
                break;
            }
            SyncContent synccontent = (SyncContent)enumset.next();
            if (flag || isContentDueForSync(synccontent))
            {
                arraylist.add(synccontent.content.uri);
            }
        } while (true);
        return arraylist;
    }

    public long getLastSyncAttempt(Uri uri)
    {
        uri = localCollectionDao.fromContentUri(uri, false);
        if (uri == null)
        {
            return -1L;
        } else
        {
            return ((LocalCollection) (uri)).last_sync_attempt;
        }
    }

    public long getLastSyncSuccess(Uri uri)
    {
        uri = localCollectionDao.fromContentUri(uri, false);
        if (uri == null)
        {
            return -1L;
        } else
        {
            return ((LocalCollection) (uri)).last_sync_success;
        }
    }

    ChangeObserver getObserverById(long l)
    {
        return (ChangeObserver)contentObservers.get(Long.valueOf(l));
    }

    boolean hasObservers()
    {
        return contentObservers != null && !contentObservers.isEmpty();
    }

    public int incrementSyncMiss(Uri uri)
    {
        uri = fromContent(uri);
        ContentValues contentvalues = new ContentValues();
        int i = uri.syncMisses() + 1;
        contentvalues.put("extra", Integer.valueOf(i));
        if (localCollectionDao.update(uri.getId(), contentvalues))
        {
            return i;
        } else
        {
            return -1;
        }
    }

    public boolean isContentDueForSync(SyncContent synccontent)
    {
        LocalCollection localcollection = fromContent(synccontent.content);
        return synccontent.shouldSync(localcollection.syncMisses(), localcollection.last_sync_success);
    }

    void onCollectionAsyncQueryReturn(Cursor cursor, LocalCollection localcollection, com.soundcloud.android.api.legacy.model.LocalCollection.OnChangeListener onchangelistener)
    {
        boolean flag = localcollection.hasNotBeenRegistered();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        localcollection.setFromCursor(cursor);
_L5:
        if (!flag || onchangelistener == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        addChangeListener(localcollection, onchangelistener);
        IOUtils.close(cursor);
        if (onchangelistener != null)
        {
            onchangelistener.onLocalCollectionChanged(localcollection);
        }
        return;
_L2:
        localcollection = new LocalCollection(localcollection.getUri());
        localCollectionDao.create(localcollection);
        if (true) goto _L5; else goto _L4
_L4:
        localcollection;
        IOUtils.close(cursor);
        throw localcollection;
    }

    public boolean onSyncComplete(ApiSyncResult apisyncresult, LocalCollection localcollection)
    {
        if (apisyncresult == null)
        {
            return false;
        }
        if (apisyncresult.synced_at > 0L)
        {
            localcollection.last_sync_success = apisyncresult.synced_at;
        }
        localcollection.size = apisyncresult.new_size;
        localcollection.extra = apisyncresult.extra;
        localcollection.sync_state = 0;
        return localCollectionDao.update(localcollection);
    }

    public void removeChangeListener(LocalCollection localcollection)
    {
        localcollection = (ContentObserver)contentObservers.remove(Long.valueOf(localcollection.getId()));
        if (localcollection != null)
        {
            resolver.unregisterContentObserver(localcollection);
        }
    }

    public boolean resetSyncMisses(Uri uri)
    {
        uri = fromContent(uri);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("extra", Integer.valueOf(0));
        return localCollectionDao.update(uri.getId(), contentvalues);
    }

    public boolean updateLastSyncSuccessTime(Uri uri, long l)
    {
        uri = fromContent(uri);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("last_sync", Long.valueOf(l));
        return localCollectionDao.update(uri.getId(), contentvalues);
    }

    public boolean updateLastSyncSuccessTime(Content content, long l)
    {
        return updateLastSyncSuccessTime(content.uri, l);
    }

    public boolean updateSyncState(long l, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sync_state", Integer.valueOf(i));
        if (i == 2 || i == 1)
        {
            contentvalues.put("last_sync_attempt", Long.valueOf(System.currentTimeMillis()));
        }
        return localCollectionDao.update(l, contentvalues);
    }


    private class _cls1
        implements rx.b.f
    {

        final SyncStateManager this$0;
        final Content val$content;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(forceToStale(content));
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = SyncStateManager.this;
            content = content1;
            super();
        }
    }

}
