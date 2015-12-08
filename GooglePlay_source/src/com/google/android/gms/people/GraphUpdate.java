// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.List;

public interface GraphUpdate
{
    public static interface AddPeopleToCircleResult
        extends Result
    {
    }

    public static interface UpdatePersonCircleResult
        extends Result
    {
    }


    public abstract PendingResult addPeopleToCircle$6bf529d6(GoogleApiClient googleapiclient, String s, String s1, List list);

    public abstract PendingResult updatePersonCircles$50c1611b(GoogleApiClient googleapiclient, String s, String s1, List list);
}
