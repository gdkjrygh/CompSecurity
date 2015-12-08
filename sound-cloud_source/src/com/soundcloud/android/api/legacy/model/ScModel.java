// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.model.Urn;
import java.util.List;

public class ScModel
    implements Parcelable, Identifiable
{

    public static final String EXTRA_ID = "id";
    public static final int NOT_SET = -1;
    private long id;
    protected Urn urn;

    public ScModel()
    {
        id = -1L;
    }

    public ScModel(long l)
    {
        id = -1L;
        setId(l);
    }

    public ScModel(Parcel parcel)
    {
        id = -1L;
        id = parcel.readLong();
        if (parcel.readByte() == 1)
        {
            urn = new Urn(parcel.readString());
        }
    }

    public ScModel(Urn urn1)
    {
        id = -1L;
        urn = urn1;
        setId(idFromUrn());
    }

    public ScModel(String s)
    {
        id = -1L;
        urn = new Urn(s);
        setId(idFromUrn());
    }

    public static long[] getIdList(List list)
    {
        long al[] = new long[list.size()];
        for (int i = 0; i < al.length; i++)
        {
            al[i] = ((ScModel)list.get(i)).getId();
        }

        return al;
    }

    private long idFromUrn()
    {
        if (urn != null)
        {
            return urn.getNumericId();
        } else
        {
            return -1L;
        }
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        if (getId() != -1L)
        {
            contentvalues.put("_id", Long.valueOf(getId()));
        }
        return contentvalues;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ScModel)
        {
            if (getId() == ((ScModel) (obj = (ScModel)obj)).getId())
            {
                return true;
            }
        }
        return false;
    }

    public long getId()
    {
        if (id != -1L)
        {
            return id;
        } else
        {
            return idFromUrn();
        }
    }

    public long getListItemId()
    {
        return getId();
    }

    public Urn getUrn()
    {
        return urn;
    }

    public int hashCode()
    {
        return Long.valueOf(getId()).hashCode();
    }

    public void setId(long l)
    {
        id = l;
    }

    public final void setUrn(String s)
    {
        urn = new Urn(s);
        id = idFromUrn();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(id);
        if (urn == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
        if (urn != null)
        {
            parcel.writeString(urn.toString());
        }
    }
}
