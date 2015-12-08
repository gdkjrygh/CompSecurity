// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.strings.Strings;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Association, UserHolder, ScModelManager, PublicApiUser, 
//            Playable

public class UserAssociation extends Association
    implements UserHolder
{
    public static final class LocalState extends Enum
    {

        private static final LocalState $VALUES[];
        public static final LocalState NONE;
        public static final LocalState PENDING_ADDITION;
        public static final LocalState PENDING_REMOVAL;

        public static LocalState valueOf(String s)
        {
            return (LocalState)Enum.valueOf(com/soundcloud/android/api/legacy/model/UserAssociation$LocalState, s);
        }

        public static LocalState[] values()
        {
            return (LocalState[])$VALUES.clone();
        }

        static 
        {
            NONE = new LocalState("NONE", 0);
            PENDING_ADDITION = new LocalState("PENDING_ADDITION", 1);
            PENDING_REMOVAL = new LocalState("PENDING_REMOVAL", 2);
            $VALUES = (new LocalState[] {
                NONE, PENDING_ADDITION, PENDING_REMOVAL
            });
        }

        private LocalState(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls3();
    public static final Predicate HAS_TOKEN_PREDICATE = new _cls2();
    public static final Function TO_TOKEN_FUNCTION = new _cls1();
    private Date addedAt;
    private Date removedAt;
    private String token;
    private final PublicApiUser user;

    public UserAssociation(Cursor cursor)
    {
        super(cursor);
        user = SoundCloudApplication.sModelManager.getCachedUserFromCursor(cursor, "_id");
        addedAt = convertDirtyDate(cursor.getLong(cursor.getColumnIndex("user_association_added_at")));
        removedAt = convertDirtyDate(cursor.getLong(cursor.getColumnIndex("user_association_removed_at")));
        token = cursor.getString(cursor.getColumnIndex("user_association_token"));
    }

    public UserAssociation(Parcel parcel)
    {
        super(parcel);
        user = (PublicApiUser)parcel.readParcelable(ClassLoader.getSystemClassLoader());
        addedAt = (Date)parcel.readSerializable();
        removedAt = (Date)parcel.readSerializable();
        token = parcel.readString();
    }

    public UserAssociation(Association.Type type, PublicApiUser publicapiuser)
    {
        super(type.collectionType);
        user = publicapiuser;
    }

    private Date convertDirtyDate(long l)
    {
        if (l <= 0L)
        {
            return null;
        } else
        {
            return new Date(l);
        }
    }

    private void setLocalSyncState(LocalState localstate)
    {
        switch (_cls4..SwitchMap.com.soundcloud.android.api.legacy.model.UserAssociation.LocalState[localstate.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown newState: ")).append(localstate.name()).toString());

        case 1: // '\001'
            addedAt = new Date(System.currentTimeMillis());
            removedAt = null;
            return;

        case 2: // '\002'
            removedAt = new Date(System.currentTimeMillis());
            addedAt = null;
            token = null;
            return;

        case 3: // '\003'
            removedAt = null;
            break;
        }
        addedAt = null;
        token = null;
    }

    public ContentValues buildContentValues()
    {
        Object obj = null;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("target_id", Long.valueOf(getItemId()));
        contentvalues.put("owner_id", Long.valueOf(SoundCloudApplication.instance.getAccountOperations().getLoggedInUserId()));
        contentvalues.put("association_type", Integer.valueOf(associationType));
        contentvalues.put("resource_type", Integer.valueOf(getResourceType()));
        contentvalues.put("created_at", Long.valueOf(created_at.getTime()));
        Long long1;
        if (addedAt == null)
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(addedAt.getTime());
        }
        contentvalues.put("added_at", long1);
        if (removedAt == null)
        {
            long1 = obj;
        } else
        {
            long1 = Long.valueOf(removedAt.getTime());
        }
        contentvalues.put("removed_at", long1);
        contentvalues.put("token", token);
        return contentvalues;
    }

    public void clearLocalSyncState()
    {
        setLocalSyncState(LocalState.NONE);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserAssociation))
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (UserAssociation)obj;
            if (addedAt == null ? ((UserAssociation) (obj)).addedAt != null : !addedAt.equals(((UserAssociation) (obj)).addedAt))
            {
                return false;
            }
            if (removedAt == null ? ((UserAssociation) (obj)).removedAt != null : !removedAt.equals(((UserAssociation) (obj)).removedAt))
            {
                return false;
            }
            if (!user.equals(((UserAssociation) (obj)).user))
            {
                return false;
            }
        }
        return true;
    }

    public Uri getBulkInsertUri()
    {
        return Content.USER_ASSOCIATIONS.uri;
    }

    public long getItemId()
    {
        return user.getId();
    }

    public long getListItemId()
    {
        return getUser().getId() << associationType + 32;
    }

    public LocalState getLocalSyncState()
    {
        if (addedAt != null)
        {
            return LocalState.PENDING_ADDITION;
        }
        if (removedAt != null)
        {
            return LocalState.PENDING_REMOVAL;
        } else
        {
            return LocalState.NONE;
        }
    }

    public Playable getPlayable()
    {
        return null;
    }

    public Refreshable getRefreshableResource()
    {
        return user;
    }

    public int getResourceType()
    {
        return 0;
    }

    public String getToken()
    {
        return token;
    }

    public PublicApiUser getUser()
    {
        return user;
    }

    public boolean hasToken()
    {
        return Strings.isNotBlank(token);
    }

    public int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int l = user.hashCode();
        int i;
        if (addedAt != null)
        {
            i = addedAt.hashCode();
        } else
        {
            i = 0;
        }
        if (removedAt != null)
        {
            j = removedAt.hashCode();
        }
        return (i + (k * 31 + l) * 31) * 31 + j;
    }

    public UserAssociation markForAddition()
    {
        return markForAddition(null);
    }

    public UserAssociation markForAddition(String s)
    {
        setLocalSyncState(LocalState.PENDING_ADDITION);
        user.addAFollower();
        token = s;
        return this;
    }

    public UserAssociation markForRemoval()
    {
        setLocalSyncState(LocalState.PENDING_REMOVAL);
        user.removeAFollower();
        return this;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        super.putDependencyValues(bulkinsertmap);
        user.putFullContentValues(bulkinsertmap);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(user, 0);
        parcel.writeSerializable(addedAt);
        parcel.writeSerializable(removedAt);
        parcel.writeString(token);
    }


    private class _cls4
    {

        static final int $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState = new int[LocalState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[LocalState.PENDING_ADDITION.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[LocalState.PENDING_REMOVAL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[LocalState.NONE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements Function
    {

        public final volatile Object apply(Object obj)
        {
            return apply((UserAssociation)obj);
        }

        public final String apply(UserAssociation userassociation)
        {
            return userassociation.getToken();
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Predicate
    {

        public final boolean apply(UserAssociation userassociation)
        {
            return userassociation.hasToken();
        }

        public final volatile boolean apply(Object obj)
        {
            return apply((UserAssociation)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements android.os.Parcelable.Creator
    {

        public final UserAssociation createFromParcel(Parcel parcel)
        {
            return new UserAssociation(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UserAssociation[] newArray(int i)
        {
            return new UserAssociation[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls3()
        {
        }
    }

}
