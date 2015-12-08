// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
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

        private List Uv;
        private String mName;

        static String a(Builder builder)
        {
            return builder.mName;
        }

        static List b(Builder builder)
        {
            return builder.Uv;
        }

        public Builder addField(Field field)
        {
            if (!Uv.contains(field))
            {
                Uv.add(field);
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
            jx.b(flag, "Invalid name specified");
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
            jx.a(flag, "Must set the name");
            if (!Uv.isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder()
        {
            Uv = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final int CK;
    private final List Uv;
    private final String mName;

    DataTypeCreateRequest(int j, String s, List list)
    {
        CK = j;
        mName = s;
        Uv = Collections.unmodifiableList(list);
    }

    private DataTypeCreateRequest(Builder builder)
    {
        CK = 1;
        mName = Builder.a(builder);
        Uv = Collections.unmodifiableList(Builder.b(builder));
    }


    private boolean a(DataTypeCreateRequest datatypecreaterequest)
    {
        return jv.equal(mName, datatypecreaterequest.mName) && jv.equal(Uv, datatypecreaterequest.Uv);
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
        return Uv;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            mName, Uv
        });
    }

    public String toString()
    {
        return jv.h(this).a("name", mName).a("fields", Uv).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
