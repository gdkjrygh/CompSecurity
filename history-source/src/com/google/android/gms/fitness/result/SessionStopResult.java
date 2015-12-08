// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            g

public class SessionStopResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int CK;
    private final Status Eb;
    private final List VI;

    SessionStopResult(int i, Status status, List list)
    {
        CK = i;
        Eb = status;
        VI = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List list)
    {
        CK = 3;
        Eb = status;
        VI = Collections.unmodifiableList(list);
    }

    public static SessionStopResult H(Status status)
    {
        return new SessionStopResult(status, Collections.emptyList());
    }

    private boolean b(SessionStopResult sessionstopresult)
    {
        return Eb.equals(sessionstopresult.Eb) && jv.equal(VI, sessionstopresult.VI);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionStopResult) && b((SessionStopResult)obj);
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
            Eb, VI
        });
    }

    public String toString()
    {
        return jv.h(this).a("status", Eb).a("sessions", VI).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
