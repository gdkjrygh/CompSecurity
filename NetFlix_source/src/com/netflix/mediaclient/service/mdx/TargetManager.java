// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.mdx.pair.PairingDeletedEvent;
import com.netflix.mediaclient.event.nrdp.mdx.pair.PairingResponseEvent;
import com.netflix.mediaclient.event.nrdp.mdx.pair.RegPairResponseEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.MessageDeliveredEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.MessageEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.MessagingErrorEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.SessionEndedEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.StartSessionResponseEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import com.netflix.mediaclient.service.mdx.message.controller.DialogResponse;
import com.netflix.mediaclient.service.mdx.message.controller.GetAudioSubtitles;
import com.netflix.mediaclient.service.mdx.message.controller.PinCancelled;
import com.netflix.mediaclient.service.mdx.message.controller.PinConfirmed;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerChangeMetaData;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerGetCapabilities;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerGetCurrentState;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerPause;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerPlay;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerResume;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerSetAutoAdvance;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerSetCurrentTime;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerSetVolume;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerSkip;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerStop;
import com.netflix.mediaclient.service.mdx.message.controller.SetAudioSubtitles;
import com.netflix.mediaclient.util.StringUtils;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            CommandInterface, TargetContext, NotifierInterface

public class TargetManager
    implements EventListener, CommandInterface
{

    private static final String TAG = "nf_mdx";
    private MdxController mController;
    private String mEsn;
    private NotifierInterface mNotify;
    private AtomicLong mRecentMessageTime;
    private TargetContext mTarget;

    TargetManager(NotifierInterface notifierinterface, MdxController mdxcontroller, String s)
    {
        mRecentMessageTime = new AtomicLong();
        mNotify = notifierinterface;
        mController = mdxcontroller;
        mEsn = s;
        mRecentMessageTime.set(System.currentTimeMillis());
    }

    public long getTimeOfMostRecentIncomingMessage()
    {
        return mRecentMessageTime.get();
    }

    public com.netflix.mediaclient.util.WebApiUtils.VideoIds getVideoIds()
    {
        if (mTarget != null)
        {
            return mTarget.getVideoIds();
        } else
        {
            return null;
        }
    }

    public boolean hasActiveSession()
    {
        if (mTarget != null)
        {
            return mTarget.hasActiveSession();
        } else
        {
            return false;
        }
    }

    public boolean isTargetHaveContext(String s)
    {
        if (mTarget != null)
        {
            return mTarget.isThisTargetUuid(s);
        } else
        {
            return false;
        }
    }

    public void pinCancelled(String s)
    {
        if (mTarget != null)
        {
            s = new PinCancelled();
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void pinConfirmed(String s)
    {
        if (mTarget != null)
        {
            s = new PinConfirmed();
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerAutoAdvance(String s, int i)
    {
        if (mTarget != null)
        {
            s = new PlayerSetAutoAdvance(mTarget.getTargetPlaybackSessionToken(), i);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerChangeMetaData(String s, String s1, String s2, String s3)
    {
        if (mTarget != null)
        {
            s = new PlayerChangeMetaData(s1, s2, s3);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerDialogReponse(String s, String s1, String s2)
    {
        if (mTarget != null)
        {
            s = new DialogResponse(s1, s2);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerGetAudioSubtitle(String s)
    {
        if (mTarget != null)
        {
            s = new GetAudioSubtitles();
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerGetCapability(String s)
    {
        if (mTarget != null)
        {
            s = new PlayerGetCapabilities();
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerGetCurrentState(String s)
    {
        if (mTarget != null)
        {
            s = new PlayerGetCurrentState();
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerPause(String s)
    {
        if (mTarget != null)
        {
            s = new PlayerPause(mTarget.getTargetPlaybackSessionToken());
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerPlay(String s, String s1, int i, String s2, int j)
    {
        if (mTarget != null)
        {
            s = new PlayerPlay(s1, i, mEsn, s2, Integer.valueOf(j));
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerResume(String s)
    {
        if (mTarget != null)
        {
            s = new PlayerResume(mTarget.getTargetPlaybackSessionToken());
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerSeek(String s, int i)
    {
        if (mTarget != null)
        {
            s = new PlayerSetCurrentTime(mTarget.getTargetPlaybackSessionToken(), i);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerSetAudioSubtitle(String s, String s1, String s2)
    {
        if (mTarget != null)
        {
            s = new SetAudioSubtitles(s1, s2);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerSetVolume(String s, int i)
    {
        if (mTarget != null)
        {
            s = new PlayerSetVolume(mTarget.getTargetPlaybackSessionToken(), i);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerSkip(String s, int i)
    {
        if (mTarget != null)
        {
            s = new PlayerSkip(mTarget.getTargetPlaybackSessionToken(), i);
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void playerStop(String s)
    {
        if (mTarget != null)
        {
            s = new PlayerStop(mTarget.getTargetPlaybackSessionToken());
            mTarget.sendCommand(s.messageName(), s.messageObject());
        }
    }

    public void received(UIEvent uievent)
    {
        if (mTarget != null) goto _L2; else goto _L1
_L1:
        Log.d("nf_mdx", "TargetManager: no active target for event");
_L4:
        return;
_L2:
        mRecentMessageTime.set(System.currentTimeMillis());
        if (!(uievent instanceof PairingResponseEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = (PairingResponseEvent)uievent;
        String s = uievent.getRemoteDevice();
        if (mTarget.isThisTargetUuid(s))
        {
            if (StringUtils.isNotEmpty(uievent.getPairingContext()) && (StringUtils.isEmpty(uievent.getErrorCode()) || "0".equals(uievent.getErrorCode())))
            {
                Log.d("nf_mdx", "TargetManager: pairingSucceed");
                mTarget.pairingSucceed(uievent.getPairingContext());
                return;
            } else
            {
                Log.d("nf_mdx", "TargetManager: pairingFail");
                mTarget.pairingFail(uievent.getErrorCode(), uievent.getErrorDesc());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(uievent instanceof RegPairResponseEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = (RegPairResponseEvent)uievent;
        String s1 = uievent.getRemoteDevice();
        if (mTarget.isThisTargetUuid(s1))
        {
            if (StringUtils.isNotEmpty(uievent.getPairingContext()) && (StringUtils.isEmpty(uievent.getErrorCode()) || "0".equals(uievent.getErrorCode())))
            {
                mTarget.pairingSucceed(uievent.getPairingContext());
                return;
            } else
            {
                mTarget.pairingFail(uievent.getErrorCode(), uievent.getErrorDesc());
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!(uievent instanceof PairingDeletedEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = ((PairingDeletedEvent)uievent).getPairingContext();
        if (mTarget.isThisTargetPairingContext(uievent))
        {
            mTarget.pairingDeleted();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!(uievent instanceof StartSessionResponseEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = (StartSessionResponseEvent)uievent;
        String s2 = uievent.getPairingContext();
        if (mTarget.isThisTargetPairingContext(s2))
        {
            mTarget.sessionStarted(uievent.getSid());
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (!(uievent instanceof MessageDeliveredEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = (MessageDeliveredEvent)uievent;
        String s3 = uievent.getPairingContext();
        if (mTarget.isThisTargetPairingContext(s3))
        {
            mTarget.messageDelivered(uievent.getTransactionId());
            return;
        }
        if (true) goto _L4; else goto _L8
_L8:
        if (!(uievent instanceof MessageEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = (MessageEvent)uievent;
        String s4 = uievent.getPairingContext();
        if (mTarget.isThisTargetPairingContext(s4))
        {
            mTarget.messageReceived(uievent.getSid(), uievent.getType(), uievent.getMsgObject());
            return;
        }
        if (true) goto _L4; else goto _L9
_L9:
        if (!(uievent instanceof MessagingErrorEvent))
        {
            break; /* Loop/switch isn't completed */
        }
        uievent = (MessagingErrorEvent)uievent;
        String s5 = uievent.getPairingContext();
        if (mTarget.isThisTargetPairingContext(s5))
        {
            mTarget.messageError(uievent.getTransactionId(), uievent.getError().toString(), new String());
            return;
        }
        if (true) goto _L4; else goto _L10
_L10:
        if (uievent instanceof SessionEndedEvent)
        {
            uievent = (SessionEndedEvent)uievent;
            if (mTarget.isThisSession(uievent.getSid()))
            {
                mTarget.sessionEnd();
                return;
            }
        } else
        {
            Log.e("nf_mdx", (new StringBuilder()).append("unexpected event ").append(uievent).toString());
            return;
        }
        if (true) goto _L4; else goto _L11
_L11:
    }

    public void targetFound(RemoteDevice remotedevice)
    {
        if (mTarget == null)
        {
            mTarget = new TargetContext(mController, mNotify, remotedevice, false);
            return;
        }
        if (mTarget.isThisTargetUuid(remotedevice.uuid) || mTarget.isThisTargetUuid(remotedevice.dialUuid))
        {
            Log.d("nf_mdx", "TargetManager: targetFound same target");
            synchronized (mTarget)
            {
                mTarget.updateTargetProperty(remotedevice);
            }
            return;
        } else
        {
            Log.e("nf_mdx", "TargetManager: targetFound different target");
            return;
        }
        remotedevice;
        targetcontext;
        JVM INSTR monitorexit ;
        throw remotedevice;
    }

    public void targetGone(String s)
    {
        if (mTarget != null)
        {
            mTarget.destroy();
            mTarget = null;
        }
    }

    public void targetLaunched(String s, boolean flag)
    {
        if (mTarget == null)
        {
            Log.e("nf_mdx", "no active target for targetLaunched");
            return;
        } else
        {
            mTarget.launchResult(flag);
            return;
        }
    }

    public void targetSelected(RemoteDevice remotedevice)
    {
        if (remotedevice == null)
        {
            Log.e("nf_mdx", "TargetManager: targetSelected is null");
            return;
        }
        if (mTarget != null)
        {
            if (mTarget.isThisTargetUuid(remotedevice.uuid) || mTarget.isThisTargetUuid(remotedevice.dialUuid))
            {
                Log.d("nf_mdx", "TargetManager: targetSelected same target");
            } else
            {
                Log.d("nf_mdx", "TargetManager: targetSelected new target");
            }
        }
        if (mTarget != null)
        {
            mTarget.destroy();
        }
        mTarget = new TargetContext(mController, mNotify, remotedevice, true);
    }
}
