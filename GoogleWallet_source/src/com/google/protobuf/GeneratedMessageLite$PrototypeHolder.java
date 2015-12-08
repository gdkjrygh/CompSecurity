// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//            GeneratedMessageLite, Parser

public static final class parser
{

    private final GeneratedMessageLite defaultInstance;
    private final Parser parser;

    public final parser newBuilderForType()
    {
        return (parser)defaultInstance.toBuilder();
    }

    public (GeneratedMessageLite generatedmessagelite, Parser parser1)
    {
        defaultInstance = generatedmessagelite;
        parser = parser1;
    }
}
