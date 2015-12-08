// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        private int HF;
        private HashMap abt;

        public Builder dR(int i)
        {
            HF = i;
            return this;
        }

        public RequestUpdateOutcomes ly()
        {
            return new RequestUpdateOutcomes(HF, abt);
        }

        public Builder x(String s, int i)
        {
            if (RequestUpdateResultOutcome.isValid(i))
            {
                abt.put(s, Integer.valueOf(i));
            }
            return this;
        }

        public Builder()
        {
            abt = new HashMap();
            HF = 0;
        }
    }


    private static final String abs[] = {
        "requestId", "outcome"
    };
    private final int HF;
    private final HashMap abt;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        HF = i;
        abt = hashmap;
    }


    public static RequestUpdateOutcomes V(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.dR(dataholder.getStatusCode());
        int j = dataholder.getCount();
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.ar(i);
            builder.x(dataholder.c("requestId", i, k), dataholder.b("outcome", i, k));
        }

        return builder.ly();
    }

    public Set getRequestIds()
    {
        return abt.keySet();
    }

    public int getRequestOutcome(String s)
    {
        o.b(abt.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)abt.get(s)).intValue();
    }

}
