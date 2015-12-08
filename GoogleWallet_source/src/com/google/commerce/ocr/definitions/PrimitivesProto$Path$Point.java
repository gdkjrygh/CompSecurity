// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MutableMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSetLite;
import java.io.IOException;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends GeneratedMessageLite
{

    public static final Parser PARSER;
    private static final PARSER defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int x_;
    private int y_;

    public static <init> getDefaultInstance()
    {
        return defaultInstance;
    }

    public static Builder newBuilder()
    {
        return defaultInstance.toBuilder();
    }

    public static Builder newBuilder(toBuilder tobuilder)
    {
        return defaultInstance.toBuilder().mergeFrom(tobuilder);
    }

    public final int getX()
    {
        return x_;
    }

    public final int getY()
    {
        return y_;
    }

    public final boolean hasX()
    {
        return (bitField0_ & 1) == 1;
    }

    public final boolean hasY()
    {
        return (bitField0_ & 2) == 2;
    }

    public final boolean isInitialized()
    {
        byte byte0 = memoizedIsInitialized;
        if (byte0 == 1)
        {
            return true;
        }
        if (byte0 == 0)
        {
            return false;
        }
        if (!hasX())
        {
            memoizedIsInitialized = 0;
            return false;
        }
        if (!hasY())
        {
            memoizedIsInitialized = 0;
            return false;
        } else
        {
            memoizedIsInitialized = 1;
            return true;
        }
    }

    public final Builder toBuilder()
    {
        if (this == defaultInstance)
        {
            return new Builder(null);
        } else
        {
            return (new Builder(null)).mergeFrom(this);
        }
    }

    public final volatile com.google.protobuf.roto.Path.Point toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static PrimitivesProto.Path.Point parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new Point(codedinputstream, extensionregistrylite, null);
                }
                // Misplaced declaration of an exception variable
                catch (CodedInputStream codedinputstream)
                {
                    if (codedinputstream.getCause() instanceof InvalidProtocolBufferException)
                    {
                        throw (InvalidProtocolBufferException)codedinputstream.getCause();
                    } else
                    {
                        throw codedinputstream;
                    }
                }
                return codedinputstream;
            }

            public final volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                return parsePartialFrom(codedinputstream, extensionregistrylite);
            }

        };
        defaultInstance = new <init>(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path$Point, new ypeHolder(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$4302(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/


/*
    static int access$4402(unknownFields unknownfields, int i)
    {
        unknownfields.x_ = i;
        return i;
    }

*/


/*
    static int access$4502(x_ x_1, int i)
    {
        x_1.y_ = i;
        return i;
    }

*/


/*
    static int access$4602(y_ y_1, int i)
    {
        y_1.bitField0_ = i;
        return i;
    }

*/


    private _cls1(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf. ;
        boolean flag;
        memoizedIsInitialized = -1;
        memoizedSerializedSize = -1;
        x_ = 0;
        y_ = 0;
         = UnknownFieldSetLite.newBuilder();
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int i = codedinputstream.readTag();
        i;
        JVM INSTR lookupswitch 3: default 197
    //                   0: 200
    //                   8: 97
    //                   16: 143;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!parseUnknownField(codedinputstream, , extensionregistrylite, i))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        bitField0_ = bitField0_ | 1;
        x_ = codedinputstream.readInt32();
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
        codedinputstream;
        unknownFields = .build();
        throw codedinputstream;
_L6:
        bitField0_ = bitField0_ | 2;
        y_ = codedinputstream.readInt32();
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
        unknownFields = .build();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
