// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//            InvalidProtocolBufferException, CodedInputStream, ExtensionRegistryLite

public interface Parser
{

    public abstract Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        throws InvalidProtocolBufferException;
}
