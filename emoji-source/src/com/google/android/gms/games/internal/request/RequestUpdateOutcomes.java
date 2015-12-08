// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import com.google.android.gms.internal.hm;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        private int CT;
        private HashMap So;

        public Builder cw(int i)
        {
            CT = i;
            return this;
        }

        public RequestUpdateOutcomes iy()
        {
            return new RequestUpdateOutcomes(CT, So);
        }

        public Builder v(String s, int i)
        {
            if (RequestUpdateResultOutcome.isValid(i))
            {
                So.put(s, Integer.valueOf(i));
            }
            return this;
        }

        public Builder()
        {
            So = new HashMap();
            CT = 0;
        }
    }


    private static final String Sn[] = {
        "requestId", "outcome"
    };
    private final int CT;
    private final HashMap So;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        CT = i;
        So = hashmap;
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

        return builder.iy();
    }

    public Set getRequestIds()
    {
        return So.keySet();
    }

    public int getRequestOutcome(String s)
    {
        hm.b(So.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)So.get(s)).intValue();
    }

}
