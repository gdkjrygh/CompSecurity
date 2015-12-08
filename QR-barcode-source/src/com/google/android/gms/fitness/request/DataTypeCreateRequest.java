// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            i

public class DataTypeCreateRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private List SY;
        private String mName;

        static String a(Builder builder)
        {
            return builder.mName;
        }

        static List b(Builder builder)
        {
            return builder.SY;
        }

        public Builder addField(Field field)
        {
            if (!SY.contains(field))
            {
                SY.add(field);
            }
            return this;
        }

        public Builder addField(String s, int j)
        {
            boolean flag;
            if (s != null || !s.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Invalid name specified");
            return addField(new Field(s, j));
        }

        public DataTypeCreateRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (mName != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must set the name");
            if (!SY.isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder()
        {
            SY = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final int BR;
    private final List SY;
    private final String mName;

    DataTypeCreateRequest(int j, String s, List list)
    {
        BR = j;
        mName = s;
        SY = Collections.unmodifiableList(list);
    }

    private DataTypeCreateRequest(Builder builder)
    {
        BR = 1;
        mName = Builder.a(builder);
        SY = Collections.unmodifiableList(Builder.b(builder));
    }


    private boolean a(DataTypeCreateRequest datatypecreaterequest)
    {
        return n.equal(mName, datatypecreaterequest.mName) && n.equal(SY, datatypecreaterequest.SY);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataTypeCreateRequest) && a((DataTypeCreateRequest)obj);
    }

    public List getFields()
    {
        return SY;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            mName, SY
        });
    }

    public String toString()
    {
        return n.h(this).a("name", mName).a("fields", SY).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
