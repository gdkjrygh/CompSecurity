// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public nAppAction destApp;
    public ificationAction genericNotification;
    public on inGame;
    public ction iosAction;
    public ion latency;
    public ion logflowEvent;
    public lesAction modifyCircles;
    public nsSession nearbyConnectionsSession;
    public erAction nearbyPlayer;
    public onActionDeprecated notification;
    public onActionDeprecated plusUpgrade;
    public o requestInfo;
    public n rtmpSession;
    public Session rtmpWaitingRoomSession;
    public ayers selectedPlayers;
    public on signIn;
    public tion snapshot;
    public cAction sync;
    public s systemStats;
    public n video;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, requestInfo);
        }
        j = i;
        if (signIn != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, signIn);
        }
        i = j;
        if (inGame != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, inGame);
        }
        j = i;
        if (destApp != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, destApp);
        }
        i = j;
        if (notification != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, notification);
        }
        j = i;
        if (genericNotification != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, genericNotification);
        }
        i = j;
        if (iosAction != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, iosAction);
        }
        j = i;
        if (modifyCircles != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(8, modifyCircles);
        }
        i = j;
        if (sync != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, sync);
        }
        j = i;
        if (rtmpSession != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(10, rtmpSession);
        }
        i = j;
        if (snapshot != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, snapshot);
        }
        j = i;
        if (rtmpWaitingRoomSession != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(12, rtmpWaitingRoomSession);
        }
        i = j;
        if (nearbyPlayer != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(13, nearbyPlayer);
        }
        j = i;
        if (selectedPlayers != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(14, selectedPlayers);
        }
        i = j;
        if (logflowEvent != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(15, logflowEvent);
        }
        j = i;
        if (systemStats != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(16, systemStats);
        }
        i = j;
        if (nearbyConnectionsSession != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(17, nearbyConnectionsSession);
        }
        j = i;
        if (plusUpgrade != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(18, plusUpgrade);
        }
        i = j;
        if (video != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(19, video);
        }
        j = i;
        if (latency != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(20, latency);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof latency))
        {
            return false;
        }
        obj = (latency)obj;
        if (requestInfo == null)
        {
            if (((requestInfo) (obj)).requestInfo != null)
            {
                return false;
            }
        } else
        if (!requestInfo.equals(((o.equals) (obj)).requestInfo))
        {
            return false;
        }
        if (signIn == null)
        {
            if (((signIn) (obj)).signIn != null)
            {
                return false;
            }
        } else
        if (!signIn.equals(((on.equals) (obj)).signIn))
        {
            return false;
        }
        if (inGame == null)
        {
            if (((inGame) (obj)).inGame != null)
            {
                return false;
            }
        } else
        if (!inGame.equals(((on.equals) (obj)).inGame))
        {
            return false;
        }
        if (destApp == null)
        {
            if (((destApp) (obj)).destApp != null)
            {
                return false;
            }
        } else
        if (!destApp.equals(((nAppAction.equals) (obj)).destApp))
        {
            return false;
        }
        if (notification == null)
        {
            if (((notification) (obj)).notification != null)
            {
                return false;
            }
        } else
        if (!notification.equals(((onActionDeprecated.equals) (obj)).notification))
        {
            return false;
        }
        if (genericNotification == null)
        {
            if (((genericNotification) (obj)).genericNotification != null)
            {
                return false;
            }
        } else
        if (!genericNotification.equals(((ificationAction.equals) (obj)).genericNotification))
        {
            return false;
        }
        if (iosAction == null)
        {
            if (((iosAction) (obj)).iosAction != null)
            {
                return false;
            }
        } else
        if (!iosAction.equals(((ction.equals) (obj)).iosAction))
        {
            return false;
        }
        if (modifyCircles == null)
        {
            if (((modifyCircles) (obj)).modifyCircles != null)
            {
                return false;
            }
        } else
        if (!modifyCircles.equals(((lesAction.equals) (obj)).modifyCircles))
        {
            return false;
        }
        if (sync == null)
        {
            if (((sync) (obj)).sync != null)
            {
                return false;
            }
        } else
        if (!sync.equals(((cAction.equals) (obj)).sync))
        {
            return false;
        }
        if (rtmpSession == null)
        {
            if (((rtmpSession) (obj)).rtmpSession != null)
            {
                return false;
            }
        } else
        if (!rtmpSession.equals(((n.equals) (obj)).rtmpSession))
        {
            return false;
        }
        if (snapshot == null)
        {
            if (((snapshot) (obj)).snapshot != null)
            {
                return false;
            }
        } else
        if (!snapshot.equals(((tion.equals) (obj)).snapshot))
        {
            return false;
        }
        if (rtmpWaitingRoomSession == null)
        {
            if (((rtmpWaitingRoomSession) (obj)).rtmpWaitingRoomSession != null)
            {
                return false;
            }
        } else
        if (!rtmpWaitingRoomSession.equals(((Session.equals) (obj)).rtmpWaitingRoomSession))
        {
            return false;
        }
        if (nearbyPlayer == null)
        {
            if (((nearbyPlayer) (obj)).nearbyPlayer != null)
            {
                return false;
            }
        } else
        if (!nearbyPlayer.equals(((erAction.equals) (obj)).nearbyPlayer))
        {
            return false;
        }
        if (selectedPlayers == null)
        {
            if (((selectedPlayers) (obj)).selectedPlayers != null)
            {
                return false;
            }
        } else
        if (!selectedPlayers.equals(((ayers.equals) (obj)).selectedPlayers))
        {
            return false;
        }
        if (logflowEvent == null)
        {
            if (((logflowEvent) (obj)).logflowEvent != null)
            {
                return false;
            }
        } else
        if (!logflowEvent.quals(((quals) (obj)).logflowEvent))
        {
            return false;
        }
        if (systemStats == null)
        {
            if (((systemStats) (obj)).systemStats != null)
            {
                return false;
            }
        } else
        if (!systemStats.equals(((s.equals) (obj)).systemStats))
        {
            return false;
        }
        if (nearbyConnectionsSession == null)
        {
            if (((nearbyConnectionsSession) (obj)).nearbyConnectionsSession != null)
            {
                return false;
            }
        } else
        if (!nearbyConnectionsSession.equals(((nsSession.equals) (obj)).nearbyConnectionsSession))
        {
            return false;
        }
        if (plusUpgrade == null)
        {
            if (((plusUpgrade) (obj)).plusUpgrade != null)
            {
                return false;
            }
        } else
        if (!plusUpgrade.als(((als) (obj)).plusUpgrade))
        {
            return false;
        }
        if (video == null)
        {
            if (((video) (obj)).video != null)
            {
                return false;
            }
        } else
        if (!video.equals(((n.equals) (obj)).video))
        {
            return false;
        }
        if (latency != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((latency) (obj)).latency == null) goto _L1; else goto _L3
_L3:
        return false;
        if (latency.equals(((ion.equals) (obj)).latency)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int l4 = 0;
        int i5 = getClass().getName().hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        if (requestInfo == null)
        {
            i = 0;
        } else
        {
            i = requestInfo.hashCode();
        }
        if (signIn == null)
        {
            j = 0;
        } else
        {
            j = signIn.hashCode();
        }
        if (inGame == null)
        {
            k = 0;
        } else
        {
            k = inGame.hashCode();
        }
        if (destApp == null)
        {
            l = 0;
        } else
        {
            l = destApp.hashCode();
        }
        if (notification == null)
        {
            i1 = 0;
        } else
        {
            i1 = notification.hashCode();
        }
        if (genericNotification == null)
        {
            j1 = 0;
        } else
        {
            j1 = genericNotification.hashCode();
        }
        if (iosAction == null)
        {
            k1 = 0;
        } else
        {
            k1 = iosAction.hashCode();
        }
        if (modifyCircles == null)
        {
            l1 = 0;
        } else
        {
            l1 = modifyCircles.hashCode();
        }
        if (sync == null)
        {
            i2 = 0;
        } else
        {
            i2 = sync.hashCode();
        }
        if (rtmpSession == null)
        {
            j2 = 0;
        } else
        {
            j2 = rtmpSession.hashCode();
        }
        if (snapshot == null)
        {
            k2 = 0;
        } else
        {
            k2 = snapshot.hashCode();
        }
        if (rtmpWaitingRoomSession == null)
        {
            l2 = 0;
        } else
        {
            l2 = rtmpWaitingRoomSession.hashCode();
        }
        if (nearbyPlayer == null)
        {
            i3 = 0;
        } else
        {
            i3 = nearbyPlayer.hashCode();
        }
        if (selectedPlayers == null)
        {
            j3 = 0;
        } else
        {
            j3 = selectedPlayers.hashCode();
        }
        if (logflowEvent == null)
        {
            k3 = 0;
        } else
        {
            k3 = logflowEvent.ashCode();
        }
        if (systemStats == null)
        {
            l3 = 0;
        } else
        {
            l3 = systemStats.hashCode();
        }
        if (nearbyConnectionsSession == null)
        {
            i4 = 0;
        } else
        {
            i4 = nearbyConnectionsSession.hashCode();
        }
        if (plusUpgrade == null)
        {
            j4 = 0;
        } else
        {
            j4 = plusUpgrade.hCode();
        }
        if (video == null)
        {
            k4 = 0;
        } else
        {
            k4 = video.hashCode();
        }
        if (latency != null)
        {
            l4 = latency.hashCode();
        }
        return ((((((((((((((((((((i5 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (requestInfo == null)
                {
                    requestInfo = new o();
                }
                codedinputbytebuffernano.readMessage(requestInfo);
                break;

            case 18: // '\022'
                if (signIn == null)
                {
                    signIn = new on();
                }
                codedinputbytebuffernano.readMessage(signIn);
                break;

            case 26: // '\032'
                if (inGame == null)
                {
                    inGame = new on();
                }
                codedinputbytebuffernano.readMessage(inGame);
                break;

            case 34: // '"'
                if (destApp == null)
                {
                    destApp = new nAppAction();
                }
                codedinputbytebuffernano.readMessage(destApp);
                break;

            case 42: // '*'
                if (notification == null)
                {
                    notification = new onActionDeprecated();
                }
                codedinputbytebuffernano.readMessage(notification);
                break;

            case 50: // '2'
                if (genericNotification == null)
                {
                    genericNotification = new ificationAction();
                }
                codedinputbytebuffernano.readMessage(genericNotification);
                break;

            case 58: // ':'
                if (iosAction == null)
                {
                    iosAction = new ction();
                }
                codedinputbytebuffernano.readMessage(iosAction);
                break;

            case 66: // 'B'
                if (modifyCircles == null)
                {
                    modifyCircles = new lesAction();
                }
                codedinputbytebuffernano.readMessage(modifyCircles);
                break;

            case 74: // 'J'
                if (sync == null)
                {
                    sync = new cAction();
                }
                codedinputbytebuffernano.readMessage(sync);
                break;

            case 82: // 'R'
                if (rtmpSession == null)
                {
                    rtmpSession = new n();
                }
                codedinputbytebuffernano.readMessage(rtmpSession);
                break;

            case 90: // 'Z'
                if (snapshot == null)
                {
                    snapshot = new tion();
                }
                codedinputbytebuffernano.readMessage(snapshot);
                break;

            case 98: // 'b'
                if (rtmpWaitingRoomSession == null)
                {
                    rtmpWaitingRoomSession = new Session();
                }
                codedinputbytebuffernano.readMessage(rtmpWaitingRoomSession);
                break;

            case 106: // 'j'
                if (nearbyPlayer == null)
                {
                    nearbyPlayer = new erAction();
                }
                codedinputbytebuffernano.readMessage(nearbyPlayer);
                break;

            case 114: // 'r'
                if (selectedPlayers == null)
                {
                    selectedPlayers = new ayers();
                }
                codedinputbytebuffernano.readMessage(selectedPlayers);
                break;

            case 122: // 'z'
                if (logflowEvent == null)
                {
                    logflowEvent = new init>();
                }
                codedinputbytebuffernano.readMessage(logflowEvent);
                break;

            case 130: 
                if (systemStats == null)
                {
                    systemStats = new s();
                }
                codedinputbytebuffernano.readMessage(systemStats);
                break;

            case 138: 
                if (nearbyConnectionsSession == null)
                {
                    nearbyConnectionsSession = new nsSession();
                }
                codedinputbytebuffernano.readMessage(nearbyConnectionsSession);
                break;

            case 146: 
                if (plusUpgrade == null)
                {
                    plusUpgrade = new it>();
                }
                codedinputbytebuffernano.readMessage(plusUpgrade);
                break;

            case 154: 
                if (video == null)
                {
                    video = new n();
                }
                codedinputbytebuffernano.readMessage(video);
                break;

            case 162: 
                if (latency == null)
                {
                    latency = new ion();
                }
                codedinputbytebuffernano.readMessage(latency);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (requestInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(1, requestInfo);
        }
        if (signIn != null)
        {
            codedoutputbytebuffernano.writeMessage(2, signIn);
        }
        if (inGame != null)
        {
            codedoutputbytebuffernano.writeMessage(3, inGame);
        }
        if (destApp != null)
        {
            codedoutputbytebuffernano.writeMessage(4, destApp);
        }
        if (notification != null)
        {
            codedoutputbytebuffernano.writeMessage(5, notification);
        }
        if (genericNotification != null)
        {
            codedoutputbytebuffernano.writeMessage(6, genericNotification);
        }
        if (iosAction != null)
        {
            codedoutputbytebuffernano.writeMessage(7, iosAction);
        }
        if (modifyCircles != null)
        {
            codedoutputbytebuffernano.writeMessage(8, modifyCircles);
        }
        if (sync != null)
        {
            codedoutputbytebuffernano.writeMessage(9, sync);
        }
        if (rtmpSession != null)
        {
            codedoutputbytebuffernano.writeMessage(10, rtmpSession);
        }
        if (snapshot != null)
        {
            codedoutputbytebuffernano.writeMessage(11, snapshot);
        }
        if (rtmpWaitingRoomSession != null)
        {
            codedoutputbytebuffernano.writeMessage(12, rtmpWaitingRoomSession);
        }
        if (nearbyPlayer != null)
        {
            codedoutputbytebuffernano.writeMessage(13, nearbyPlayer);
        }
        if (selectedPlayers != null)
        {
            codedoutputbytebuffernano.writeMessage(14, selectedPlayers);
        }
        if (logflowEvent != null)
        {
            codedoutputbytebuffernano.writeMessage(15, logflowEvent);
        }
        if (systemStats != null)
        {
            codedoutputbytebuffernano.writeMessage(16, systemStats);
        }
        if (nearbyConnectionsSession != null)
        {
            codedoutputbytebuffernano.writeMessage(17, nearbyConnectionsSession);
        }
        if (plusUpgrade != null)
        {
            codedoutputbytebuffernano.writeMessage(18, plusUpgrade);
        }
        if (video != null)
        {
            codedoutputbytebuffernano.writeMessage(19, video);
        }
        if (latency != null)
        {
            codedoutputbytebuffernano.writeMessage(20, latency);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public n()
    {
        requestInfo = null;
        signIn = null;
        inGame = null;
        destApp = null;
        notification = null;
        genericNotification = null;
        iosAction = null;
        modifyCircles = null;
        sync = null;
        rtmpSession = null;
        snapshot = null;
        rtmpWaitingRoomSession = null;
        nearbyPlayer = null;
        selectedPlayers = null;
        logflowEvent = null;
        systemStats = null;
        nearbyConnectionsSession = null;
        plusUpgrade = null;
        video = null;
        latency = null;
        cachedSize = -1;
    }
}
