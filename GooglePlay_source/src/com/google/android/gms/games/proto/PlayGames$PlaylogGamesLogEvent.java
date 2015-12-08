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

public static final class clear extends MessageNano
{

    public dActionEvent backgroundAction;
    public t click;
    public vent deepLink;
    public nEvent impression;
    public nt search;
    public int uiSource;

    public final clear clear()
    {
        impression = null;
        click = null;
        backgroundAction = null;
        search = null;
        deepLink = null;
        uiSource = 1;
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (impression != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, impression);
        }
        j = i;
        if (click != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, click);
        }
        i = j;
        if (backgroundAction != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, backgroundAction);
        }
        j = i;
        if (search != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, search);
        }
        i = j;
        if (deepLink != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, deepLink);
        }
        j = i;
        if (uiSource != 1)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, uiSource);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof uiSource))
            {
                return false;
            }
            obj = (uiSource)obj;
            if (impression == null)
            {
                if (((impression) (obj)).impression != null)
                {
                    return false;
                }
            } else
            if (!impression.equals(((nEvent.equals) (obj)).impression))
            {
                return false;
            }
            if (click == null)
            {
                if (((click) (obj)).click != null)
                {
                    return false;
                }
            } else
            if (!click.equals(((t.equals) (obj)).click))
            {
                return false;
            }
            if (backgroundAction == null)
            {
                if (((backgroundAction) (obj)).backgroundAction != null)
                {
                    return false;
                }
            } else
            if (!backgroundAction.equals(((dActionEvent.equals) (obj)).backgroundAction))
            {
                return false;
            }
            if (search == null)
            {
                if (((search) (obj)).search != null)
                {
                    return false;
                }
            } else
            if (!search.equals(((nt.equals) (obj)).search))
            {
                return false;
            }
            if (deepLink == null)
            {
                if (((deepLink) (obj)).deepLink != null)
                {
                    return false;
                }
            } else
            if (!deepLink.equals(((vent.equals) (obj)).deepLink))
            {
                return false;
            }
            if (uiSource != ((uiSource) (obj)).uiSource)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j1 = getClass().getName().hashCode();
        int i;
        int j;
        int k;
        int l;
        if (impression == null)
        {
            i = 0;
        } else
        {
            i = impression.hashCode();
        }
        if (click == null)
        {
            j = 0;
        } else
        {
            j = click.hashCode();
        }
        if (backgroundAction == null)
        {
            k = 0;
        } else
        {
            k = backgroundAction.hashCode();
        }
        if (search == null)
        {
            l = 0;
        } else
        {
            l = search.hashCode();
        }
        if (deepLink != null)
        {
            i1 = deepLink.hashCode();
        }
        return ((((((j1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + uiSource;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 80
    //                   10: 82
    //                   18: 111
    //                   26: 140
    //                   34: 169
    //                   42: 198
    //                   48: 227;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (impression == null)
        {
            impression = new nEvent();
        }
        codedinputbytebuffernano.readMessage(impression);
          goto _L9
_L4:
        if (click == null)
        {
            click = new t();
        }
        codedinputbytebuffernano.readMessage(click);
          goto _L9
_L5:
        if (backgroundAction == null)
        {
            backgroundAction = new dActionEvent();
        }
        codedinputbytebuffernano.readMessage(backgroundAction);
          goto _L9
_L6:
        if (search == null)
        {
            search = new nt();
        }
        codedinputbytebuffernano.readMessage(search);
          goto _L9
_L7:
        if (deepLink == null)
        {
            deepLink = new vent();
        }
        codedinputbytebuffernano.readMessage(deepLink);
          goto _L9
_L8:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            uiSource = j;
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (impression != null)
        {
            codedoutputbytebuffernano.writeMessage(1, impression);
        }
        if (click != null)
        {
            codedoutputbytebuffernano.writeMessage(2, click);
        }
        if (backgroundAction != null)
        {
            codedoutputbytebuffernano.writeMessage(3, backgroundAction);
        }
        if (search != null)
        {
            codedoutputbytebuffernano.writeMessage(4, search);
        }
        if (deepLink != null)
        {
            codedoutputbytebuffernano.writeMessage(5, deepLink);
        }
        if (uiSource != 1)
        {
            codedoutputbytebuffernano.writeInt32(6, uiSource);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public nt()
    {
        clear();
    }
}
