// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.model.Timestamped;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.model.UserHolder;

interface ApiActivity
    extends Timestamped, UserHolder
{

    public abstract Urn getUserUrn();
}
