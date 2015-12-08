// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            g

public class SessionStopResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int BR;
    private final Status CM;
    private final List Ul;

    SessionStopResult(int i, Status status, List list)
    {
        BR = i;
        CM = status;
        Ul = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List list)
    {
        BR = 3;
        CM = status;
        Ul = Collections.unmodifiableList(list);
    }

    public static SessionStopResult I(Status status)
    {
        return new SessionStopResult(status, Collections.emptyList());
    }

    private boolean b(SessionStopResult sessionstopresult)
    {
        return CM.equals(sessionstopresult.CM) && n.equal(Ul, sessionstopresult.Ul);
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
        return Ul;
    }

    public Status getStatus()
    {
        return CM;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            CM, Ul
        });
    }

    public String toString()
    {
        return n.h(this).a("status", CM).a("sessions", Ul).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
