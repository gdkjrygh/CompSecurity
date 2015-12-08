// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.media.AudioManager;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.fitbit.runtrack:
//            SpeechService, h

class a
    implements Observer
{

    final SpeechService a;

    public void update(Observable observable, Object obj)
    {
        observable = (h)observable;
        ((AudioManager)a.getSystemService("audio")).abandonAudioFocus(observable);
        observable.deleteObservers();
    }

    (SpeechService speechservice)
    {
        a = speechservice;
        super();
    }
}
