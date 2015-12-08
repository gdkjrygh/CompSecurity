// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.android.play.playlog.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wireless.android.play.playlog.proto:
//            ClientAnalytics

public static final class cachedSize extends ExtendableMessageNano
{

    public String androidPackageName;
    public int appType;
    public String version;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (appType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, appType);
        }
        j = i;
        if (!androidPackageName.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, androidPackageName);
        }
        i = j;
        if (!version.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, version);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof version))
            {
                return false;
            }
            obj = (version)obj;
            if (appType != ((appType) (obj)).appType)
            {
                return false;
            }
            if (androidPackageName == null)
            {
                if (((androidPackageName) (obj)).androidPackageName != null)
                {
                    return false;
                }
            } else
            if (!androidPackageName.equals(((androidPackageName) (obj)).androidPackageName))
            {
                return false;
            }
            if (version == null)
            {
                if (((version) (obj)).version != null)
                {
                    return false;
                }
            } else
            if (!version.equals(((version) (obj)).version))
            {
                return false;
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                if (((unknownFieldData) (obj)).unknownFieldData != null && !((unknownFieldData) (obj)).unknownFieldData.isEmpty())
                {
                    return false;
                }
            } else
            {
                return unknownFieldData.equals(((unknownFieldData) (obj)).unknownFieldData);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int l = getClass().getName().hashCode();
        int i1 = appType;
        int i;
        int j;
        int k;
        if (androidPackageName == null)
        {
            i = 0;
        } else
        {
            i = androidPackageName.hashCode();
        }
        if (version == null)
        {
            j = 0;
        } else
        {
            j = version.hashCode();
        }
        k = ((flag) ? 1 : 0);
        if (unknownFieldData != null)
        {
            if (unknownFieldData.isEmpty())
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = unknownFieldData.hashCode();
            }
        }
        return ((((l + 527) * 31 + i1) * 31 + i) * 31 + j) * 31 + k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 199
    //                   26: 210;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
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
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            appType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        androidPackageName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        version = codedinputbytebuffernano.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (appType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, appType);
        }
        if (!androidPackageName.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, androidPackageName);
        }
        if (!version.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, version);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        appType = 0;
        androidPackageName = "";
        version = "";
        unknownFieldData = null;
        cachedSize = -1;
    }
}
