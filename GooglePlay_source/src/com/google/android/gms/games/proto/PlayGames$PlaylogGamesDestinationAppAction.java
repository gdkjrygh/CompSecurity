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

    public String experimentIds;
    public ion gameAction;
    public Info gameTabInfo;
    public ingAction onboardingEvent;
    public  oneTouchCirclesAction;
    public int pageType;
    public ction playerAction;
    public abInfo playerTabInfo;
    public sAction settingsAction;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (pageType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, pageType);
        }
        j = i;
        if (gameTabInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, gameTabInfo);
        }
        i = j;
        if (gameAction != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, gameAction);
        }
        j = i;
        if (settingsAction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, settingsAction);
        }
        i = j;
        if (playerTabInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, playerTabInfo);
        }
        j = i;
        if (playerAction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, playerAction);
        }
        i = j;
        if (onboardingEvent != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, onboardingEvent);
        }
        j = i;
        if (!experimentIds.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, experimentIds);
        }
        i = j;
        if (oneTouchCirclesAction != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, oneTouchCirclesAction);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof oneTouchCirclesAction))
        {
            return false;
        }
        obj = (oneTouchCirclesAction)obj;
        if (pageType != ((pageType) (obj)).pageType)
        {
            return false;
        }
        if (gameTabInfo == null)
        {
            if (((gameTabInfo) (obj)).gameTabInfo != null)
            {
                return false;
            }
        } else
        if (!gameTabInfo.equals(((Info.equals) (obj)).gameTabInfo))
        {
            return false;
        }
        if (gameAction == null)
        {
            if (((gameAction) (obj)).gameAction != null)
            {
                return false;
            }
        } else
        if (!gameAction.equals(((ion.equals) (obj)).gameAction))
        {
            return false;
        }
        if (settingsAction == null)
        {
            if (((settingsAction) (obj)).settingsAction != null)
            {
                return false;
            }
        } else
        if (!settingsAction.equals(((sAction.equals) (obj)).settingsAction))
        {
            return false;
        }
        if (playerTabInfo == null)
        {
            if (((playerTabInfo) (obj)).playerTabInfo != null)
            {
                return false;
            }
        } else
        if (!playerTabInfo.equals(((abInfo.equals) (obj)).playerTabInfo))
        {
            return false;
        }
        if (playerAction == null)
        {
            if (((playerAction) (obj)).playerAction != null)
            {
                return false;
            }
        } else
        if (!playerAction.equals(((ction.equals) (obj)).playerAction))
        {
            return false;
        }
        if (onboardingEvent == null)
        {
            if (((onboardingEvent) (obj)).onboardingEvent != null)
            {
                return false;
            }
        } else
        if (!onboardingEvent.equals(((ingAction.equals) (obj)).onboardingEvent))
        {
            return false;
        }
        if (experimentIds == null)
        {
            if (((experimentIds) (obj)).experimentIds != null)
            {
                return false;
            }
        } else
        if (!experimentIds.equals(((experimentIds) (obj)).experimentIds))
        {
            return false;
        }
        if (oneTouchCirclesAction != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((oneTouchCirclesAction) (obj)).oneTouchCirclesAction == null) goto _L1; else goto _L3
_L3:
        return false;
        if (oneTouchCirclesAction.equals(((.equals) (obj)).oneTouchCirclesAction)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int l1 = 0;
        int i2 = getClass().getName().hashCode();
        int j2 = pageType;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (gameTabInfo == null)
        {
            i = 0;
        } else
        {
            i = gameTabInfo.hashCode();
        }
        if (gameAction == null)
        {
            j = 0;
        } else
        {
            j = gameAction.hashCode();
        }
        if (settingsAction == null)
        {
            k = 0;
        } else
        {
            k = settingsAction.hashCode();
        }
        if (playerTabInfo == null)
        {
            l = 0;
        } else
        {
            l = playerTabInfo.hashCode();
        }
        if (playerAction == null)
        {
            i1 = 0;
        } else
        {
            i1 = playerAction.hashCode();
        }
        if (onboardingEvent == null)
        {
            j1 = 0;
        } else
        {
            j1 = onboardingEvent.hashCode();
        }
        if (experimentIds == null)
        {
            k1 = 0;
        } else
        {
            k1 = experimentIds.hashCode();
        }
        if (oneTouchCirclesAction != null)
        {
            l1 = oneTouchCirclesAction.hashCode();
        }
        return (((((((((i2 + 527) * 31 + j2) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 104
    //                   8: 106
    //                   18: 187
    //                   26: 216
    //                   34: 245
    //                   42: 274
    //                   50: 303
    //                   58: 332
    //                   66: 361
    //                   74: 372;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            pageType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (gameTabInfo == null)
        {
            gameTabInfo = new Info();
        }
        codedinputbytebuffernano.readMessage(gameTabInfo);
        continue; /* Loop/switch isn't completed */
_L5:
        if (gameAction == null)
        {
            gameAction = new ion();
        }
        codedinputbytebuffernano.readMessage(gameAction);
        continue; /* Loop/switch isn't completed */
_L6:
        if (settingsAction == null)
        {
            settingsAction = new sAction();
        }
        codedinputbytebuffernano.readMessage(settingsAction);
        continue; /* Loop/switch isn't completed */
_L7:
        if (playerTabInfo == null)
        {
            playerTabInfo = new abInfo();
        }
        codedinputbytebuffernano.readMessage(playerTabInfo);
        continue; /* Loop/switch isn't completed */
_L8:
        if (playerAction == null)
        {
            playerAction = new ction();
        }
        codedinputbytebuffernano.readMessage(playerAction);
        continue; /* Loop/switch isn't completed */
_L9:
        if (onboardingEvent == null)
        {
            onboardingEvent = new ingAction();
        }
        codedinputbytebuffernano.readMessage(onboardingEvent);
        continue; /* Loop/switch isn't completed */
_L10:
        experimentIds = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L11:
        if (oneTouchCirclesAction == null)
        {
            oneTouchCirclesAction = new ();
        }
        codedinputbytebuffernano.readMessage(oneTouchCirclesAction);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (pageType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, pageType);
        }
        if (gameTabInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, gameTabInfo);
        }
        if (gameAction != null)
        {
            codedoutputbytebuffernano.writeMessage(3, gameAction);
        }
        if (settingsAction != null)
        {
            codedoutputbytebuffernano.writeMessage(4, settingsAction);
        }
        if (playerTabInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(5, playerTabInfo);
        }
        if (playerAction != null)
        {
            codedoutputbytebuffernano.writeMessage(6, playerAction);
        }
        if (onboardingEvent != null)
        {
            codedoutputbytebuffernano.writeMessage(7, onboardingEvent);
        }
        if (!experimentIds.equals(""))
        {
            codedoutputbytebuffernano.writeString(8, experimentIds);
        }
        if (oneTouchCirclesAction != null)
        {
            codedoutputbytebuffernano.writeMessage(9, oneTouchCirclesAction);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public sAction()
    {
        pageType = 0;
        gameTabInfo = null;
        gameAction = null;
        settingsAction = null;
        playerTabInfo = null;
        playerAction = null;
        onboardingEvent = null;
        experimentIds = "";
        oneTouchCirclesAction = null;
        cachedSize = -1;
    }
}
