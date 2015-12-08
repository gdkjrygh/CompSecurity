// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import com.google.android.gms.internal.fq;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        private int Ah;
        private HashMap LO;

        public Builder bm(int i)
        {
            Ah = i;
            return this;
        }

        public RequestUpdateOutcomes hB()
        {
            return new RequestUpdateOutcomes(Ah, LO);
        }

        public Builder s(String s1, int i)
        {
            if (RequestUpdateResultOutcome.isValid(i))
            {
                LO.put(s1, Integer.valueOf(i));
            }
            return this;
        }

        public Builder()
        {
            LO = new HashMap();
            Ah = 0;
        }
    }


    private static final String LN[] = {
        "requestId", "outcome"
    };
    private final int Ah;
    private final HashMap LO;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        Ah = i;
        LO = hashmap;
    }


    public static RequestUpdateOutcomes J(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.bm(dataholder.getStatusCode());
        int j = dataholder.getCount();
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.G(i);
            builder.s(dataholder.getString("requestId", i, k), dataholder.getInteger("outcome", i, k));
        }

        return builder.hB();
    }

    public Set getRequestIds()
    {
        return LO.keySet();
    }

    public int getRequestOutcome(String s)
    {
        fq.b(LO.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)LO.get(s)).intValue();
    }

}
