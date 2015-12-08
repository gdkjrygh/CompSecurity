// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.webkit.WebSettings;

class API7WebSettings
{

    public API7WebSettings(WebSettings websettings)
    {
        try
        {
            websettings.setLoadWithOverviewMode(true);
            websettings.setAllowFileAccess(true);
            websettings.setDomStorageEnabled(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSettings websettings)
        {
            return;
        }
    }
}
