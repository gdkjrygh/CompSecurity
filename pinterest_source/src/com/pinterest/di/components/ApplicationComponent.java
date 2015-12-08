// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.pinterest.activity.contacts.InviterManager;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.network.api.CommerceApiService;

public interface ApplicationComponent
{

    public abstract ApiServices apiServices();

    public abstract Application application();

    public abstract CommerceApiService commerceApiService();

    public abstract Context context();

    public abstract Gson gson();

    public abstract InviterManager inviterManager();

    public abstract Resources resources();
}
