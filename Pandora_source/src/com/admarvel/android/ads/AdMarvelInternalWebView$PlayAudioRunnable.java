// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.Bundle;
import com.admarvel.android.util.Logging;
import com.admarvel.speechkit.speech.AudioPlayer;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

private class data
    implements Runnable
{

    Bundle data;
    final AdMarvelInternalWebView this$0;

    public void run()
    {
        if (data != null)
        {
            String s = data.getString("expand_url");
            if (s != null)
            {
                s.indexOf("http");
            }
            Logging.log("playAudioImpl(), getting audioPlayer");
            if (AdMarvelInternalWebView.access$0(AdMarvelInternalWebView.this) == null)
            {
                AdMarvelInternalWebView.access$1(AdMarvelInternalWebView.this, new AudioPlayer(getContext(), AdMarvelInternalWebView.this));
            }
            AdMarvelInternalWebView.access$0(AdMarvelInternalWebView.this).loadContent(data);
            AdMarvelInternalWebView.access$0(AdMarvelInternalWebView.this).playAudio();
        }
    }

    public (Bundle bundle)
    {
        this$0 = AdMarvelInternalWebView.this;
        super();
        data = null;
        data = bundle;
    }
}
