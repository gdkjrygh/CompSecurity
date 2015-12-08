// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        public HashMap mOutcomeMap;
        public int mStatusCode;

        public final Builder addRequestOutcome(String s, int i)
        {
            i;
            JVM INSTR tableswitch 0 3: default 32
        //                       0 53
        //                       1 53
        //                       2 53
        //                       3 53;
               goto _L1 _L2 _L2 _L2 _L2
_L1:
            boolean flag = false;
_L4:
            if (flag)
            {
                mOutcomeMap.put(s, Integer.valueOf(i));
            }
            return this;
_L2:
            flag = true;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final RequestUpdateOutcomes build()
        {
            return new RequestUpdateOutcomes(mStatusCode, mOutcomeMap, (byte)0);
        }

        public Builder()
        {
            mOutcomeMap = new HashMap();
            mStatusCode = 0;
        }
    }


    private static final String COLUMNS[] = {
        "requestId", "outcome"
    };
    public final HashMap mOutcomeMap;
    private final int mStatusCode;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        mStatusCode = i;
        mOutcomeMap = hashmap;
    }

    RequestUpdateOutcomes(int i, HashMap hashmap, byte byte0)
    {
        this(i, hashmap);
    }

    public static RequestUpdateOutcomes fromDataHolder(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.mStatusCode = dataholder.mStatusCode;
        int j = dataholder.mRowCount;
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.getWindowIndex(i);
            builder.addRequestOutcome(dataholder.getString("requestId", i, k), dataholder.getInteger("outcome", i, k));
        }

        return builder.build();
    }

    public static DataHolder toDataHolder(RequestUpdateOutcomes requestupdateoutcomes)
    {
        com.google.android.gms.common.data.DataHolder.Builder builder = DataHolder.builder(COLUMNS);
        Object obj;
        for (Iterator iterator = requestupdateoutcomes.mOutcomeMap.entrySet().iterator(); iterator.hasNext(); builder.withRow(((ContentValues) (obj))))
        {
            obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            int i = ((Integer)((java.util.Map.Entry) (obj)).getValue()).intValue();
            obj = new ContentValues();
            ((ContentValues) (obj)).put("requestId", s);
            ((ContentValues) (obj)).put("outcome", Integer.valueOf(i));
        }

        return builder.build(requestupdateoutcomes.mStatusCode);
    }

}
