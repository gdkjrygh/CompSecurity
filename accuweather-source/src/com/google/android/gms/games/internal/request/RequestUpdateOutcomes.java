// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import com.google.android.gms.internal.hn;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        private int CQ;
        private HashMap Sl;

        public Builder cw(int i)
        {
            CQ = i;
            return this;
        }

        public RequestUpdateOutcomes it()
        {
            return new RequestUpdateOutcomes(CQ, Sl);
        }

        public Builder v(String s, int i)
        {
            if (RequestUpdateResultOutcome.isValid(i))
            {
                Sl.put(s, Integer.valueOf(i));
            }
            return this;
        }

        public Builder()
        {
            Sl = new HashMap();
            CQ = 0;
        }
    }


    private static final String Sk[] = {
        "requestId", "outcome"
    };
    private final int CQ;
    private final HashMap Sl;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        CQ = i;
        Sl = hashmap;
    }


    public static RequestUpdateOutcomes U(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.cw(dataholder.getStatusCode());
        int j = dataholder.getCount();
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.ae(i);
            builder.v(dataholder.c("requestId", i, k), dataholder.b("outcome", i, k));
        }

        return builder.it();
    }

    public Set getRequestIds()
    {
        return Sl.keySet();
    }

    public int getRequestOutcome(String s)
    {
        hn.b(Sl.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)Sl.get(s)).intValue();
    }

}
