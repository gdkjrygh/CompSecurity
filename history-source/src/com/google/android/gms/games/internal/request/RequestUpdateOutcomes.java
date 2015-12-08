// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        private int Iv;
        private HashMap adm;

        public Builder ek(int i)
        {
            Iv = i;
            return this;
        }

        public RequestUpdateOutcomes mF()
        {
            return new RequestUpdateOutcomes(Iv, adm);
        }

        public Builder z(String s, int i)
        {
            if (RequestUpdateResultOutcome.isValid(i))
            {
                adm.put(s, Integer.valueOf(i));
            }
            return this;
        }

        public Builder()
        {
            adm = new HashMap();
            Iv = 0;
        }
    }


    private static final String adl[] = {
        "requestId", "outcome"
    };
    private final int Iv;
    private final HashMap adm;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        Iv = i;
        adm = hashmap;
    }


    public static RequestUpdateOutcomes W(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.ek(dataholder.getStatusCode());
        int j = dataholder.getCount();
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.au(i);
            builder.z(dataholder.c("requestId", i, k), dataholder.b("outcome", i, k));
        }

        return builder.mF();
    }

    public Set getRequestIds()
    {
        return adm.keySet();
    }

    public int getRequestOutcome(String s)
    {
        jx.b(adm.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)adm.get(s)).intValue();
    }

}
