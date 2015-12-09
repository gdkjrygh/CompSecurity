// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

final class A extends AbstractParser
{

    private static A parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        throws InvalidProtocolBufferException
    {
        try
        {
            codedinputstream = new nit>(codedinputstream, extensionregistrylite, null);
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

    A()
    {
    }
}
