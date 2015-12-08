// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.configuration;

import android.content.Context;
import com.appboy.configuration.CachedConfigurationProvider;

public class XmlUIConfigurationProvider extends CachedConfigurationProvider
{

    private static final String APPLICATION_ICON_KEY = "application_icon";
    private final Context mContext;

    public XmlUIConfigurationProvider(Context context)
    {
        super(context);
        mContext = context;
    }
}
