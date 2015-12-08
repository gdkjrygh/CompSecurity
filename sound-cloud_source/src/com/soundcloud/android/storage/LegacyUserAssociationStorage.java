// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.UserAssociation;
import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.storage:
//            UserAssociationDAO

public class LegacyUserAssociationStorage
{

    private final UserAssociationDAO followingsDAO;
    private final ContentResolver resolver;
    private final R scheduler;
    private final UserAssociationDAO userAssociationDAO;

    public LegacyUserAssociationStorage(Context context)
    {
        this(ScSchedulers.HIGH_PRIO_SCHEDULER, context.getContentResolver());
    }

    public LegacyUserAssociationStorage(R r, ContentResolver contentresolver)
    {
        scheduler = r;
        resolver = contentresolver;
        userAssociationDAO = new UserAssociationDAO(resolver);
        followingsDAO = UserAssociationDAO.forContent(Content.ME_FOLLOWINGS, resolver);
    }

    private static String getWhereInClause(String s, int i)
    {
        s = (new StringBuilder(s)).append(" IN (?");
        for (int j = 1; j < i; j++)
        {
            s.append(",?");
        }

        s.append(')');
        return s.toString();
    }

    private static List idCursorToList(Cursor cursor)
    {
        if (cursor == null)
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(cursor.getCount());
        for (; cursor.moveToNext(); arraylist.add(Long.valueOf(cursor.getLong(0)))) { }
        cursor.close();
        return arraylist;
    }

    private static String[] longListToStringArr(Collection collection)
    {
        String as[] = new String[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            as[i] = String.valueOf((Long)collection.next());
        }

        return as;
    }

    private UserAssociation queryFollowingByTargetUserId(long l)
    {
        return (UserAssociation)followingsDAO.buildQuery().where("_id = ? AND association_type = ?", new String[] {
            String.valueOf(l), String.valueOf(com.soundcloud.android.api.legacy.model.Association.Type.FOLLOWING.collectionType)
        }).first();
    }

    public void clear()
    {
        UserAssociationDAO.forContent(Content.USER_ASSOCIATIONS, resolver).deleteAll();
    }

    public List deleteAssociations(Uri uri, List list)
    {
        if (!list.isEmpty())
        {
            for (int i = 0; i < list.size(); i += 500)
            {
                List list1 = list.subList(i, Math.min(i + 500, list.size()));
                resolver.delete(uri, getWhereInClause("target_id", list1.size()), longListToStringArr(list1));
            }

        }
        return list;
    }

    public boolean deleteFollowings(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            UserAssociation userassociation = (UserAssociation)collection.next();
            if (!followingsDAO.delete(userassociation))
            {
                return false;
            }
        }

        return true;
    }

    public b follow(final PublicApiUser user)
    {
        return b.create(new _cls1()).subscribeOn(scheduler);
    }

    public List getFollowingsNeedingSync()
    {
        return followingsDAO.buildQuery().where("user_association_added_at IS NOT NULL OR user_association_removed_at IS NOT NULL", new String[0]).queryAll();
    }

    public List getStoredIds(Uri uri)
    {
        String s;
        if (Content.ME_FOLLOWINGS.uri.equals(uri))
        {
            s = "removed_at IS NULL AND added_at IS NULL";
        } else
        {
            s = null;
        }
        return idCursorToList(resolver.query(uri.buildUpon().appendQueryParameter("idsOnly", "1").build(), null, s, null, null));
    }

    public boolean hasFollowingsNeedingSync()
    {
        return userAssociationDAO.count("association_type = ? AND (added_at IS NOT NULL OR removed_at IS NOT NULL )", new String[] {
            String.valueOf(com.soundcloud.android.api.legacy.model.Association.Type.FOLLOWING.collectionType)
        }) > 0;
    }

    public int insertAssociations(List list, Uri uri, long l)
    {
        BulkInsertMap bulkinsertmap = new BulkInsertMap();
        for (int i = 0; i < list.size(); i++)
        {
            PublicApiResource publicapiresource = (PublicApiResource)list.get(i);
            if (publicapiresource != null)
            {
                publicapiresource.putFullContentValues(bulkinsertmap);
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("position", Integer.valueOf(i));
                contentvalues.put("target_id", Long.valueOf(publicapiresource.getId()));
                contentvalues.put("owner_id", Long.valueOf(l));
                bulkinsertmap.add(uri, contentvalues);
            }
        }

        return bulkinsertmap.insert(resolver);
    }

    public void insertInBatches(long l, List list, int i, int j)
    {
        boolean flag = false;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < list.size(); i += j)
        {
            List list1 = list.subList(i, Math.min(i + j, list.size()));
            ContentValues acontentvalues[] = new ContentValues[list1.size()];
            for (int i1 = 0; i1 < list1.size(); i1++)
            {
                long l1 = ((Long)list1.get(i1)).longValue();
                acontentvalues[i1] = new ContentValues();
                acontentvalues[i1].put("position", Integer.valueOf(k + i1));
                acontentvalues[i1].put("target_id", Long.valueOf(l1));
                acontentvalues[i1].put("owner_id", Long.valueOf(l));
            }

            k += list1.size();
            resolver.bulkInsert(Content.ME_FOLLOWINGS.uri, acontentvalues);
        }

    }

    public boolean setFollowingAsSynced(UserAssociation userassociation)
    {
        userassociation = queryFollowingByTargetUserId(userassociation.getUser().getId());
        if (userassociation == null) goto _L2; else goto _L1
_L1:
        _cls4..SwitchMap.com.soundcloud.android.api.legacy.model.UserAssociation.LocalState[userassociation.getLocalSyncState().ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 50
    //                   2 63;
           goto _L2 _L3 _L4
_L2:
        return false;
_L3:
        userassociation.clearLocalSyncState();
        return userAssociationDAO.update(userassociation);
_L4:
        userassociation.clearLocalSyncState();
        return followingsDAO.delete(userassociation);
    }

    public b setFollowingsAsSynced(final Collection userAssociations)
    {
        return b.create(new _cls3());
    }

    public b unfollow(final PublicApiUser user)
    {
        return b.create(new _cls2()).subscribeOn(scheduler);
    }





    private class _cls1
        implements rx.b.f
    {

        final LegacyUserAssociationStorage this$0;
        final PublicApiUser val$user;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            UserAssociation userassociation;
label0:
            {
                UserAssociation userassociation1 = queryFollowingByTargetUserId(user.getId());
                if (userassociation1 != null)
                {
                    userassociation = userassociation1;
                    if (userassociation1.getLocalSyncState() != com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.PENDING_REMOVAL)
                    {
                        break label0;
                    }
                }
                userassociation = (new UserAssociation(com.soundcloud.android.api.legacy.model.Association.Type.FOLLOWING, user)).markForAddition();
                followingsDAO.create(userassociation);
            }
            x.onNext(userassociation);
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = LegacyUserAssociationStorage.this;
            user = publicapiuser;
            super();
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState = new int[com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.PENDING_ADDITION.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.PENDING_REMOVAL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements rx.b.f
    {

        final LegacyUserAssociationStorage this$0;
        final Collection val$userAssociations;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            for (Iterator iterator = userAssociations.iterator(); iterator.hasNext(); ((UserAssociation)iterator.next()).clearLocalSyncState()) { }
            followingsDAO.createCollection(userAssociations);
            x.onNext(userAssociations);
            x.onCompleted();
        }

        _cls3()
        {
            this$0 = LegacyUserAssociationStorage.this;
            userAssociations = collection;
            super();
        }
    }


    private class _cls2
        implements rx.b.f
    {

        final LegacyUserAssociationStorage this$0;
        final PublicApiUser val$user;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            UserAssociation userassociation = (new UserAssociation(com.soundcloud.android.api.legacy.model.Association.Type.FOLLOWING, user)).markForRemoval();
            if (userAssociationDAO.update(userassociation))
            {
                (new UserDAO(resolver)).update(user);
                x.onNext(userassociation);
                x.onCompleted();
                return;
            } else
            {
                x.onError(new Exception("Update failed"));
                return;
            }
        }

        _cls2()
        {
            this$0 = LegacyUserAssociationStorage.this;
            user = publicapiuser;
            super();
        }
    }

}
