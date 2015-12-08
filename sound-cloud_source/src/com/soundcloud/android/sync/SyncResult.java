// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.events.UrnEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SyncResult
    implements Parcelable, UrnEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String action;
    private final List entitiesSynced;
    private final Exception exception;
    private final boolean wasChanged;

    private SyncResult(Parcel parcel)
    {
        action = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wasChanged = flag;
        exception = (Exception)parcel.readSerializable();
        entitiesSynced = new ArrayList();
        parcel.readTypedList(entitiesSynced, Urn.CREATOR);
    }

    SyncResult(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private SyncResult(String s, boolean flag, Exception exception1, List list)
    {
        action = s;
        wasChanged = flag;
        exception = exception1;
        entitiesSynced = list;
    }

    public static SyncResult failure(String s, Exception exception1)
    {
        return new SyncResult(s, false, exception1, Collections.emptyList());
    }

    public static SyncResult success(String s, boolean flag)
    {
        return new SyncResult(s, flag, null, Collections.emptyList());
    }

    public static SyncResult success(String s, boolean flag, Urn urn)
    {
        return new SyncResult(s, flag, null, Arrays.asList(new Urn[] {
            urn
        }));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof SyncResult))
            {
                return false;
            }
            obj = (SyncResult)obj;
            if (!MoreObjects.equal(Boolean.valueOf(wasChanged), Boolean.valueOf(((SyncResult) (obj)).wasChanged)) || !MoreObjects.equal(action, ((SyncResult) (obj)).action) || !MoreObjects.equal(exception, ((SyncResult) (obj)).exception) || !MoreObjects.equal(entitiesSynced, ((SyncResult) (obj)).entitiesSynced))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAction()
    {
        return action;
    }

    public final Exception getException()
    {
        return exception;
    }

    public final Urn getFirstUrn()
    {
        return (Urn)entitiesSynced.iterator().next();
    }

    public final Boolean hasChangedEntities()
    {
        boolean flag;
        if (!entitiesSynced.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            Boolean.valueOf(wasChanged), action, exception, entitiesSynced
        });
    }

    public final boolean wasChanged()
    {
        return wasChanged;
    }

    public final boolean wasSuccess()
    {
        return exception == null;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(action);
        byte byte0;
        if (wasChanged)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeSerializable(exception);
        parcel.writeTypedList(entitiesSynced);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final SyncResult createFromParcel(Parcel parcel)
        {
            return new SyncResult(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final SyncResult[] newArray(int i)
        {
            return new SyncResult[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
