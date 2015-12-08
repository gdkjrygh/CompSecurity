// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            g

public class ChallengeUserParticipantStatus
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e[];

    public ChallengeUserParticipantStatus()
    {
    }

    static int a(ChallengeUserParticipantStatus challengeuserparticipantstatus, int i)
    {
        challengeuserparticipantstatus.b = i;
        return i;
    }

    static boolean a(ChallengeUserParticipantStatus challengeuserparticipantstatus, boolean flag)
    {
        challengeuserparticipantstatus.a = flag;
        return flag;
    }

    static int[] a(ChallengeUserParticipantStatus challengeuserparticipantstatus, int ai[])
    {
        challengeuserparticipantstatus.e = ai;
        return ai;
    }

    static int b(ChallengeUserParticipantStatus challengeuserparticipantstatus, int i)
    {
        challengeuserparticipantstatus.c = i;
        return i;
    }

    static int c(ChallengeUserParticipantStatus challengeuserparticipantstatus, int i)
    {
        challengeuserparticipantstatus.d = i;
        return i;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(boolean flag)
    {
        a = flag;
    }

    public void a(int ai[])
    {
        e = ai;
    }

    public boolean a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public void b(int i)
    {
        c = i;
    }

    public int c()
    {
        return c;
    }

    public void c(int i)
    {
        d = i;
    }

    public float d(int i)
    {
        float f2 = 0.0F;
        int ai[] = e();
        float f1 = f2;
        if (i >= 0)
        {
            f1 = f2;
            if (i < ai.length)
            {
                f1 = (float)ai[i] / (float)c();
            }
        }
        return f1;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int[] e()
    {
        return e;
    }

    public float f()
    {
        return d(b());
    }

    public boolean g()
    {
        boolean flag1 = false;
        int i;
        boolean flag;
        if (e != null)
        {
            i = e.length;
        } else
        {
            i = 0;
        }
        flag = flag1;
        if (b >= 0)
        {
            flag = flag1;
            if (b < i)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.fitbit.data.domain.challenges.g.a(parcel, Boolean.valueOf(a));
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeIntArray(e);
    }


    /* member class not found */
    class _cls1 {}

}
