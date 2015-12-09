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

    public boolean canResolve;
    public int minVersion;
    public boolean newEnough;
    public String packageName;
    public int resolvedType;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (resolvedType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, resolvedType);
        }
        j = i;
        if (!packageName.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, packageName);
        }
        i = j;
        if (minVersion != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, minVersion);
        }
        j = i;
        if (newEnough)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
        }
        i = j;
        if (canResolve)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(5) + 1);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof canResolve))
            {
                return false;
            }
            obj = (canResolve)obj;
            if (resolvedType != ((resolvedType) (obj)).resolvedType)
            {
                return false;
            }
            if (packageName == null)
            {
                if (((packageName) (obj)).packageName != null)
                {
                    return false;
                }
            } else
            if (!packageName.equals(((packageName) (obj)).packageName))
            {
                return false;
            }
            if (minVersion != ((minVersion) (obj)).minVersion)
            {
                return false;
            }
            if (newEnough != ((newEnough) (obj)).newEnough)
            {
                return false;
            }
            if (canResolve != ((canResolve) (obj)).canResolve)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int j = getClass().getName().hashCode();
        int k = resolvedType;
        int i;
        char c;
        int l;
        if (packageName == null)
        {
            i = 0;
        } else
        {
            i = packageName.hashCode();
        }
        l = minVersion;
        if (newEnough)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!canResolve)
        {
            c1 = '\u04D5';
        }
        return (((((j + 527) * 31 + k) * 31 + i) * 31 + l) * 31 + c) * 31 + c1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 72
    //                   8: 74
    //                   18: 151
    //                   24: 162
    //                   32: 173
    //                   40: 184;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
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
            resolvedType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        packageName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        minVersion = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L6:
        newEnough = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L7:
        canResolve = codedinputbytebuffernano.readBool();
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (resolvedType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, resolvedType);
        }
        if (!packageName.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, packageName);
        }
        if (minVersion != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, minVersion);
        }
        if (newEnough)
        {
            codedoutputbytebuffernano.writeBool(4, newEnough);
        }
        if (canResolve)
        {
            codedoutputbytebuffernano.writeBool(5, canResolve);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        resolvedType = 0;
        packageName = "";
        minVersion = 0;
        newEnough = false;
        canResolve = false;
        cachedSize = -1;
    }
}
