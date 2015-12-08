// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.session;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.view.ViewManager;
import com.auditude.ads.view.model.AdViewSource;

// Referenced classes of package com.auditude.ads.session:
//            GroupManager

public class ChapterManager extends GroupManager
{

    private int position;

    public ChapterManager(APIBridge apibridge, ViewManager viewmanager, AdSettings adsettings)
    {
        super(apibridge, viewmanager, adsettings);
        position = 0;
    }

    public final int getPosition()
    {
        return position;
    }

    protected void groupEnd()
    {
    }

    public final boolean isHandlingChapter()
    {
        return isHandlingGroup();
    }

    public final void pause()
    {
    }

    public final void resume()
    {
    }

    public final void setPosition(int i)
    {
        position = i;
    }

    protected void showAdSource(AdViewSource adviewsource)
    {
    }
}
