// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.pinterest.pinit.assets.Assets;

// Referenced classes of package com.pinterest.pinit:
//            PinIt, PinItListener

public class PinItButton extends ImageView
{

    private PinIt _pinIt;

    public PinItButton(Context context)
    {
        this(context, null);
    }

    public PinItButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1030014);
    }

    public PinItButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static String getPartnerId()
    {
        return PinIt.getPartnerId();
    }

    private void init()
    {
        _pinIt = new PinIt();
        setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        setImageDrawable(Assets.getPinItDrawable(getContext()));
        setOnClickListener(new _cls1());
    }

    public static boolean isDebugMode()
    {
        return PinIt.isDebugMode();
    }

    public static boolean meetsRequirements()
    {
        return PinIt.meetsRequirements();
    }

    public static void setDebugMode(boolean flag)
    {
        PinIt.setDebugMode(flag);
    }

    public static void setPartnerId(String s)
    {
        PinIt.setPartnerId(s);
    }

    public String getDescription()
    {
        return _pinIt.getDescription();
    }

    public Uri getImageUri()
    {
        return _pinIt.getImageUri();
    }

    public String getImageUrl()
    {
        return _pinIt.getImageUrl();
    }

    public PinItListener getListener()
    {
        return _pinIt.getListener();
    }

    public String getUrl()
    {
        return _pinIt.getUrl();
    }

    public void reset()
    {
        _pinIt.reset();
    }

    public void setDescription(String s)
    {
        _pinIt.setDescription(s);
    }

    public void setImageUri(Uri uri)
    {
        _pinIt.setImageUri(uri);
    }

    public void setImageUrl(String s)
    {
        _pinIt.setImageUrl(s);
    }

    public void setListener(PinItListener pinitlistener)
    {
        _pinIt.setListener(pinitlistener);
    }

    public void setUrl(String s)
    {
        _pinIt.setUrl(s);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinItButton this$0;

        public void onClick(View view)
        {
            if (view != null)
            {
                _pinIt.doPinIt(view.getContext());
            }
        }

        _cls1()
        {
            this$0 = PinItButton.this;
            super();
        }
    }

}
