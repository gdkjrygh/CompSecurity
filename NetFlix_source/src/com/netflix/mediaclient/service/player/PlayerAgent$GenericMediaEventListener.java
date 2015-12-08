// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.media.AudioTrackChanged;
import com.netflix.mediaclient.event.nrdp.media.BufferRange;
import com.netflix.mediaclient.event.nrdp.media.Buffering;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.GenericMediaEvent;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.event.nrdp.media.RemoveSubtitle;
import com.netflix.mediaclient.event.nrdp.media.ShowSubtitle;
import com.netflix.mediaclient.event.nrdp.media.Statechanged;
import com.netflix.mediaclient.event.nrdp.media.SubtitleData;
import com.netflix.mediaclient.event.nrdp.media.UpdatePts;
import com.netflix.mediaclient.event.nrdp.media.Warning;
import com.netflix.mediaclient.javabridge.ui.EventListener;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

private class <init>
    implements EventListener
{

    final PlayerAgent this$0;

    public void received(UIEvent uievent)
    {
        Log.d(PlayerAgent.access$1400(), "Received a media event ");
        if (uievent instanceof GenericMediaEvent)
        {
            PlayerAgent.access$3200(PlayerAgent.this, (GenericMediaEvent)uievent);
            return;
        }
        if (uievent instanceof NccpError)
        {
            PlayerAgent.access$3300(PlayerAgent.this, (NccpError)uievent);
            return;
        }
        if (uievent instanceof GenericMediaEvent)
        {
            PlayerAgent.access$3200(PlayerAgent.this, (GenericMediaEvent)uievent);
            return;
        }
        if (uievent instanceof Buffering)
        {
            PlayerAgent.access$3400(PlayerAgent.this, (Buffering)uievent);
            return;
        }
        if (uievent instanceof RemoveSubtitle)
        {
            PlayerAgent.access$3500(PlayerAgent.this, (RemoveSubtitle)uievent);
            return;
        }
        if (uievent instanceof ShowSubtitle)
        {
            PlayerAgent.access$3600(PlayerAgent.this, (ShowSubtitle)uievent);
            return;
        }
        if (uievent instanceof SubtitleData)
        {
            PlayerAgent.access$3700(PlayerAgent.this, (SubtitleData)uievent);
            return;
        }
        if (uievent instanceof AudioTrackChanged)
        {
            PlayerAgent.access$3800(PlayerAgent.this, (AudioTrackChanged)uievent);
            return;
        }
        if (uievent instanceof Statechanged)
        {
            PlayerAgent.access$3900(PlayerAgent.this, (Statechanged)uievent);
            return;
        }
        if (uievent instanceof BufferRange)
        {
            PlayerAgent.access$4000(PlayerAgent.this, (BufferRange)uievent);
            return;
        }
        if (uievent instanceof UpdatePts)
        {
            uievent = (UpdatePts)uievent;
            PlayerAgent.access$4100(PlayerAgent.this, uievent.getPts());
            return;
        }
        if (uievent instanceof Error)
        {
            PlayerAgent.access$4200(PlayerAgent.this, (Error)uievent);
            return;
        }
        if (uievent instanceof Warning)
        {
            PlayerAgent.access$4300(PlayerAgent.this, (Warning)uievent);
            return;
        } else
        {
            Log.e(PlayerAgent.access$1400(), (new StringBuilder()).append("Uknown event: ").append(uievent.getType()).toString());
            return;
        }
    }

    private ()
    {
        this$0 = PlayerAgent.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
