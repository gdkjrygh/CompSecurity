// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.q;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            f

public class SessionReadResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int CK;
    private final Status Eb;
    private final List VI;
    private final List Wv;

    SessionReadResult(int i, List list, List list1, Status status)
    {
        CK = i;
        VI = list;
        Wv = Collections.unmodifiableList(list1);
        Eb = status;
    }

    public SessionReadResult(List list, List list1, Status status)
    {
        CK = 3;
        VI = list;
        Wv = Collections.unmodifiableList(list1);
        Eb = status;
    }

    public static SessionReadResult G(Status status)
    {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    private boolean b(SessionReadResult sessionreadresult)
    {
        return Eb.equals(sessionreadresult.Eb) && jv.equal(VI, sessionreadresult.VI) && jv.equal(Wv, sessionreadresult.Wv);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionReadResult) && b((SessionReadResult)obj);
    }

    public List getDataSet(Session session)
    {
        jx.b(VI.contains(session), "Attempting to read data for session %s which was not returned", new Object[] {
            session
        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = Wv.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            q q1 = (q)iterator.next();
            if (jv.equal(session, q1.getSession()))
            {
                arraylist.add(q1.jH());
            }
        } while (true);
        return arraylist;
    }

    public List getDataSet(Session session, DataType datatype)
    {
        jx.b(VI.contains(session), "Attempting to read data for session %s which was not returned", new Object[] {
            session
        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = Wv.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            q q1 = (q)iterator.next();
            if (jv.equal(session, q1.getSession()) && datatype.equals(q1.jH().getDataType()))
            {
                arraylist.add(q1.jH());
            }
        } while (true);
        return arraylist;
    }

    public List getSessions()
    {
        return VI;
    }

    public Status getStatus()
    {
        return Eb;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Eb, VI, Wv
        });
    }

    public List kv()
    {
        return Wv;
    }

    public String toString()
    {
        return jv.h(this).a("status", Eb).a("sessions", VI).a("sessionDataSets", Wv).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
