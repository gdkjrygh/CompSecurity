// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.fitbit.util.service.b;
import java.util.Arrays;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, t, an

public class SaveGoals extends b
{
    public static class Goal
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        public com.fitbit.data.domain.Goal.GoalType a;
        public double b;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(a.ordinal());
            parcel.writeDouble(b);
        }


        private Goal(Parcel parcel)
        {
            a = com.fitbit.data.domain.Goal.GoalType.values()[parcel.readInt()];
            b = parcel.readDouble();
        }

        Goal(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        public Goal(com.fitbit.data.domain.Goal.GoalType goaltype, double d)
        {
            a = goaltype;
            b = d;
        }

        /* block-local class not found */
        class _cls1 {}

    }


    static final String a = "com.fitbit.data.bl.SaveGoals.ACTION";
    private static final String b = "com.fitbit.data.bl.SaveGoals.EXTRA_GOALS";

    public SaveGoals()
    {
    }

    public static Intent a(Context context, Goal agoal[])
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SaveGoals.ACTION");
        context.putExtra("com.fitbit.data.bl.SaveGoals.EXTRA_GOALS", agoal);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        intent = intent.getExtras().getParcelableArray("com.fitbit.data.bl.SaveGoals.EXTRA_GOALS");
        intent = (Goal[])Arrays.copyOf(intent, intent.length, [Lcom/fitbit/data/bl/SaveGoals$Goal;);
        int j = intent.length;
        for (int i = 0; i < j; i++)
        {
            resultreceiver = intent[i];
            t.a().a(((Goal) (resultreceiver)).a, ((Goal) (resultreceiver)).b);
        }

        com.fitbit.widget.b.a(syncservice);
    }

    public boolean b()
    {
        return an.a().j();
    }
}
