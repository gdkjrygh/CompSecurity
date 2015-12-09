// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.decorator;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.collection.model.policy.Policy;

public class UpdateModel
    implements JacksonModel
{

    public String items[];
    public Policy policy;

    public UpdateModel(String as[], Policy policy1)
    {
        items = as;
        policy = policy1;
    }
}
