// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.protobuf:
//            AbstractMessageLite, UnknownFieldSetLite, CodedInputStream, ExtensionRegistryLite, 
//            Parser

public abstract class GeneratedMessageLite extends AbstractMessageLite
    implements Serializable
{
    public static abstract class Builder extends AbstractMessageLite.Builder
    {

        private final GeneratedMessageLite defaultInstance;
        protected UnknownFieldSetLite unknownFields;

        private Builder clone()
        {
            Builder builder = getDefaultInstanceForType().newBuilderForType();
            builder.mergeFrom(buildPartial());
            return builder;
        }

        private GeneratedMessageLite getDefaultInstanceForType()
        {
            return defaultInstance;
        }

        public final GeneratedMessageLite build()
        {
            GeneratedMessageLite generatedmessagelite = buildPartial();
            if (!generatedmessagelite.isInitialized())
            {
                throw newUninitializedMessageException(generatedmessagelite);
            } else
            {
                return generatedmessagelite;
            }
        }

        public abstract GeneratedMessageLite buildPartial();

        public final volatile AbstractMessageLite.Builder clone()
        {
            return clone();
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public abstract Builder mergeFrom(GeneratedMessageLite generatedmessagelite);

        protected final Builder mergeUnknownFields(UnknownFieldSetLite unknownfieldsetlite)
        {
            unknownFields = UnknownFieldSetLite.concat(unknownFields, unknownfieldsetlite);
            return this;
        }

        protected Builder(GeneratedMessageLite generatedmessagelite)
        {
            unknownFields = UnknownFieldSetLite.getDefaultInstance();
            defaultInstance = generatedmessagelite;
        }
    }

    public static final class PrototypeHolder
    {

        private final GeneratedMessageLite defaultInstance;
        private final Parser parser;

        public final Builder newBuilderForType()
        {
            return (Builder)defaultInstance.toBuilder();
        }

        public PrototypeHolder(GeneratedMessageLite generatedmessagelite, Parser parser1)
        {
            defaultInstance = generatedmessagelite;
            parser = parser1;
        }
    }


    private static final Map PROTOTYPE_MAP = new ConcurrentHashMap();
    protected UnknownFieldSetLite unknownFields;

    public GeneratedMessageLite()
    {
    }

    protected static void onLoad(Class class1, PrototypeHolder prototypeholder)
    {
        PROTOTYPE_MAP.put(class1, prototypeholder);
    }

    protected static boolean parseUnknownField(CodedInputStream codedinputstream, UnknownFieldSetLite.Builder builder, ExtensionRegistryLite extensionregistrylite, int i)
        throws IOException
    {
        return builder.mergeFieldFrom(i, codedinputstream);
    }

    public boolean isInitialized()
    {
        return true;
    }

    public final Builder newBuilderForType()
    {
        return ((PrototypeHolder)PROTOTYPE_MAP.get(getClass())).newBuilderForType();
    }

}
