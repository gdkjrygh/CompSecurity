// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.util.gfx.ImageLoader;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            LoggingImageView, PressedStateHandler

public class AdvancedImageView extends LoggingImageView
{

    private static final String TAG = "AdvancedImageView";
    private PressedStateHandler pressedHandler;

    public AdvancedImageView(Context context)
    {
        super(context);
        init();
    }

    public AdvancedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public AdvancedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        pressedHandler = new PressedStateHandler(this);
    }

    protected void dispatchSetPressed(boolean flag)
    {
        if (shouldDispatchToPressHandler())
        {
            pressedHandler.handleSetPressed(flag);
        }
        super.dispatchSetPressed(flag);
    }

    protected String getLogTag()
    {
        return "AdvancedImageView";
    }

    public String getUrlTag()
    {
        return (String)getTag(0x7f070034);
    }

    public void refreshImageIfNecessary()
    {
        ImageLoader imageloader = NetflixActivity.getImageLoader(getContext());
        if (imageloader != null)
        {
            imageloader.refreshImgIfNecessary(this, null);
        }
    }

    public void setPressedStateHandlerEnabled(boolean flag)
    {
        pressedHandler.setEnabled(flag);
    }

    public void setUrlTag(String s)
    {
        setTag(0x7f070034, s);
    }

    protected boolean shouldDispatchToPressHandler()
    {
        return true;
    }
}
