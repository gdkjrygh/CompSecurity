// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            ResourceLoadedListener, DefaultMediaPlayer

class this._cls0
    implements ResourceLoadedListener
{

    final DefaultMediaPlayer this$0;

    public void onLoaded()
    {
        DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#endLoadResource").toString(), (new StringBuilder()).append("Loading of media resource is complete. [").append(DefaultMediaPlayer.access$1500(DefaultMediaPlayer.this)).append("].").toString());
    }

    r()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
