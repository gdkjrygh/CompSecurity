// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MutableMessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSetLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class WireProto
{
    public static final class ClassifierOverride extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final ClassifierOverride defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private Object label_;
        private int memoizedSerializedSize;
        private Object modelId_;
        private float threshold_;
        private int type_;

        public static ClassifierOverride getDefaultInstance()
        {
            return defaultInstance;
        }

        private Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final String getModelId()
        {
            Object obj = modelId_;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (ByteString)obj;
            String s = ((ByteString) (obj)).toStringUtf8();
            if (((ByteString) (obj)).isValidUtf8())
            {
                modelId_ = s;
            }
            return s;
        }

        public final float getThreshold()
        {
            return threshold_;
        }

        public final WobType getType()
        {
            WobType wobtype1 = WobType.valueOf(type_);
            WobType wobtype = wobtype1;
            if (wobtype1 == null)
            {
                wobtype = WobType.UNKNOWN;
            }
            return wobtype;
        }

        public final boolean hasLabel()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasModelId()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasThreshold()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasType()
        {
            return (bitField0_ & 1) == 1;
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static ClassifierOverride parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new ClassifierOverride(codedinputstream, extensionregistrylite);
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
            defaultInstance = new ClassifierOverride(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/WireProto$ClassifierOverride, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$3602(ClassifierOverride classifieroverride, UnknownFieldSetLite unknownfieldsetlite)
        {
            classifieroverride.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static int access$3702(ClassifierOverride classifieroverride, int i)
        {
            classifieroverride.type_ = i;
            return i;
        }

*/



/*
        static Object access$3802(ClassifierOverride classifieroverride, Object obj)
        {
            classifieroverride.modelId_ = obj;
            return obj;
        }

*/


/*
        static float access$3902(ClassifierOverride classifieroverride, float f)
        {
            classifieroverride.threshold_ = f;
            return f;
        }

*/



/*
        static Object access$4002(ClassifierOverride classifieroverride, Object obj)
        {
            classifieroverride.label_ = obj;
            return obj;
        }

*/


/*
        static int access$4102(ClassifierOverride classifieroverride, int i)
        {
            classifieroverride.bitField0_ = i;
            return i;
        }

*/


        private ClassifierOverride(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            type_ = 0;
            modelId_ = "";
            threshold_ = 0.0F;
            label_ = "";
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L11:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 5: default 291
        //                       0: 294
        //                       8: 117
        //                       18: 210
        //                       29: 235
        //                       34: 256;
               goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = codedinputstream.readEnum();
            if (WobType.valueOf(i) == null)
            {
                builder.mergeVarintField(1, i);
                continue; /* Loop/switch isn't completed */
            }
              goto _L9
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder.build();
            throw codedinputstream;
_L9:
            bitField0_ = bitField0_ | 1;
            type_ = i;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L6:
            String s = codedinputstream.readString();
            bitField0_ = bitField0_ | 2;
            modelId_ = s;
            continue; /* Loop/switch isn't completed */
_L7:
            bitField0_ = bitField0_ | 4;
            threshold_ = codedinputstream.readFloat();
            continue; /* Loop/switch isn't completed */
_L8:
            String s1 = codedinputstream.readString();
            bitField0_ = bitField0_ | 8;
            label_ = s1;
            continue; /* Loop/switch isn't completed */
_L2:
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L11; else goto _L10
_L10:
        }

    }

    public static final class ClassifierOverride.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private Object label_;
        private Object modelId_;
        private float threshold_;
        private int type_;

        private ClassifierOverride buildPartial()
        {
            ClassifierOverride classifieroverride = new ClassifierOverride(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            classifieroverride.unknownFields.getThreshold = <no variable>;
            int k = bitField0_;
            int j = 0;
            if ((k & 1) == 1)
            {
                j = 1;
            }
            classifieroverride.type_ = type_;
            int i = j;
            if ((k & 2) == 2)
            {
                i = j | 2;
            }
            classifieroverride.modelId_ = modelId_;
            j = i;
            if ((k & 4) == 4)
            {
                j = i | 4;
            }
            classifieroverride.threshold_ = threshold_;
            i = j;
            if ((k & 8) == 8)
            {
                i = j | 8;
            }
            classifieroverride.label_ = label_;
            classifieroverride.bitField0_ = i;
            return classifieroverride;
        }

        private ClassifierOverride.Builder setThreshold(float f)
        {
            bitField0_ = bitField0_ | 4;
            threshold_ = f;
            return this;
        }

        private ClassifierOverride.Builder setType(WobType wobtype)
        {
            if (wobtype == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 1;
                type_ = wobtype.getNumber();
                return this;
            }
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final ClassifierOverride.Builder mergeFrom(ClassifierOverride classifieroverride)
        {
            if (classifieroverride == ClassifierOverride.getDefaultInstance())
            {
                return this;
            }
            if (classifieroverride.hasType())
            {
                setType(classifieroverride.getType());
            }
            if (classifieroverride.hasModelId())
            {
                bitField0_ = bitField0_ | 2;
                modelId_ = classifieroverride.modelId_;
            }
            if (classifieroverride.hasThreshold())
            {
                setThreshold(classifieroverride.getThreshold());
            }
            if (classifieroverride.hasLabel())
            {
                bitField0_ = bitField0_ | 8;
                label_ = classifieroverride.label_;
            }
            mergeUnknownFields(((getThreshold) (classifieroverride)).getThreshold);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((ClassifierOverride)generatedmessagelite);
        }

        private ClassifierOverride.Builder()
        {
            super(ClassifierOverride.defaultInstance);
            type_ = 0;
            modelId_ = "";
            label_ = "";
        }

    }

    public static final class ClientInfo extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final ClientInfo defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private Object appVersion_;
        private int bitField0_;
        private int featureLevel_;
        private int memoizedSerializedSize;

        public static ClientInfo getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder(ClientInfo clientinfo)
        {
            return defaultInstance.toBuilder().mergeFrom(clientinfo);
        }

        public final FeatureLevel getFeatureLevel()
        {
            FeatureLevel featurelevel1 = FeatureLevel.valueOf(featureLevel_);
            FeatureLevel featurelevel = featurelevel1;
            if (featurelevel1 == null)
            {
                featurelevel = FeatureLevel.UNKNOWN_FEATURE_LEVEL;
            }
            return featurelevel;
        }

        public final boolean hasAppVersion()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasFeatureLevel()
        {
            return (bitField0_ & 2) == 2;
        }

        public final Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static ClientInfo parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new ClientInfo(codedinputstream, extensionregistrylite);
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
            defaultInstance = new ClientInfo(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/WireProto$ClientInfo, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$2002(ClientInfo clientinfo, UnknownFieldSetLite unknownfieldsetlite)
        {
            clientinfo.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static Object access$2102(ClientInfo clientinfo, Object obj)
        {
            clientinfo.appVersion_ = obj;
            return obj;
        }

*/


/*
        static int access$2202(ClientInfo clientinfo, int i)
        {
            clientinfo.featureLevel_ = i;
            return i;
        }

*/


/*
        static int access$2302(ClientInfo clientinfo, int i)
        {
            clientinfo.bitField0_ = i;
            return i;
        }

*/


        private ClientInfo(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedSerializedSize = -1;
            appVersion_ = "";
            featureLevel_ = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L9:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 220
        //                       0: 223
        //                       10: 93
        //                       16: 143;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            String s = codedinputstream.readString();
            bitField0_ = bitField0_ | 1;
            appVersion_ = s;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            i = codedinputstream.readEnum();
            if (FeatureLevel.valueOf(i) == null)
            {
                builder.mergeVarintField(2, i);
                continue; /* Loop/switch isn't completed */
            }
              goto _L7
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            bitField0_ = bitField0_ | 2;
            featureLevel_ = i;
            continue; /* Loop/switch isn't completed */
_L2:
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L9; else goto _L8
_L8:
        }

    }

    public static final class ClientInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private Object appVersion_;
        private int bitField0_;
        private int featureLevel_;

        private ClientInfo.Builder setFeatureLevel(ClientInfo.FeatureLevel featurelevel)
        {
            if (featurelevel == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 2;
                featureLevel_ = featurelevel.getNumber();
                return this;
            }
        }

        public final ClientInfo buildPartial()
        {
            ClientInfo clientinfo = new ClientInfo(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final ClientInfo.Builder mergeFrom(ClientInfo clientinfo)
        {
            if (clientinfo == ClientInfo.getDefaultInstance())
            {
                return this;
            }
            if (clientinfo.hasAppVersion())
            {
                bitField0_ = bitField0_ | 1;
                appVersion_ = clientinfo.appVersion_;
            }
            if (clientinfo.hasFeatureLevel())
            {
                setFeatureLevel(clientinfo.getFeatureLevel());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((ClientInfo)generatedmessagelite);
        }

        private ClientInfo.Builder()
        {
            super(ClientInfo.defaultInstance);
            appVersion_ = "";
            featureLevel_ = 0;
        }

    }

    public static final class ClientInfo.FeatureLevel extends Enum
    {

        private static final ClientInfo.FeatureLevel $VALUES[];
        public static final ClientInfo.FeatureLevel DOGFOOD;
        public static final ClientInfo.FeatureLevel FISHFOOD;
        public static final ClientInfo.FeatureLevel RELEASE;
        public static final ClientInfo.FeatureLevel UNKNOWN_FEATURE_LEVEL;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static ClientInfo.FeatureLevel valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return UNKNOWN_FEATURE_LEVEL;

            case 1: // '\001'
                return FISHFOOD;

            case 2: // '\002'
                return DOGFOOD;

            case 3: // '\003'
                return RELEASE;
            }
        }

        public static ClientInfo.FeatureLevel valueOf(String s)
        {
            return (ClientInfo.FeatureLevel)Enum.valueOf(com/google/commerce/ocr/definitions/WireProto$ClientInfo$FeatureLevel, s);
        }

        public static ClientInfo.FeatureLevel[] values()
        {
            return (ClientInfo.FeatureLevel[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            UNKNOWN_FEATURE_LEVEL = new FeatureLevel("UNKNOWN_FEATURE_LEVEL", 0, 0, 0);
            FISHFOOD = new FeatureLevel("FISHFOOD", 1, 1, 1);
            DOGFOOD = new FeatureLevel("DOGFOOD", 2, 2, 2);
            RELEASE = new FeatureLevel("RELEASE", 3, 3, 3);
            $VALUES = (new ClientInfo.FeatureLevel[] {
                UNKNOWN_FEATURE_LEVEL, FISHFOOD, DOGFOOD, RELEASE
            });
        }

        private ClientInfo.FeatureLevel(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class DebugRequestInfo extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final DebugRequestInfo defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private List classifierOverride_;
        private int memoizedSerializedSize;
        private boolean returnFlatVssText_;

        public static DebugRequestInfo getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(DebugRequestInfo debugrequestinfo)
        {
            return defaultInstance.toBuilder().mergeFrom(debugrequestinfo);
        }

        public final List getClassifierOverrideList()
        {
            return classifierOverride_;
        }

        public final boolean getReturnFlatVssText()
        {
            return returnFlatVssText_;
        }

        public final boolean hasReturnFlatVssText()
        {
            return (bitField0_ & 1) == 1;
        }

        public final Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static DebugRequestInfo parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new DebugRequestInfo(codedinputstream, extensionregistrylite);
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
            defaultInstance = new DebugRequestInfo(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/WireProto$DebugRequestInfo, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$2802(DebugRequestInfo debugrequestinfo, UnknownFieldSetLite unknownfieldsetlite)
        {
            debugrequestinfo.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static List access$2902(DebugRequestInfo debugrequestinfo, List list)
        {
            debugrequestinfo.classifierOverride_ = list;
            return list;
        }

*/


/*
        static boolean access$3002(DebugRequestInfo debugrequestinfo, boolean flag)
        {
            debugrequestinfo.returnFlatVssText_ = flag;
            return flag;
        }

*/


/*
        static int access$3102(DebugRequestInfo debugrequestinfo, int i)
        {
            debugrequestinfo.bitField0_ = i;
            return i;
        }

*/


        private DebugRequestInfo(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            boolean flag2;
            memoizedSerializedSize = -1;
            classifierOverride_ = Collections.emptyList();
            returnFlatVssText_ = false;
            flag = false;
            builder = UnknownFieldSetLite.newBuilder();
            flag2 = false;
_L10:
            if (flag2) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag3;
            boolean flag4;
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 348
        //                       0: 351
        //                       42: 121
        //                       48: 247;
               goto _L3 _L4 _L5 _L6
_L3:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag2 = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = ((flag) ? 1 : 0);
            if ((flag & true)) goto _L8; else goto _L7
_L7:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            classifierOverride_ = new ArrayList();
            i = flag | true;
_L8:
            flag3 = i;
            flag1 = i;
            flag4 = i;
            classifierOverride_.add(codedinputstream.readMessage(ClassifierOverride.PARSER, extensionregistrylite));
            flag = i;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            flag1 = flag3;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((flag1 & true))
            {
                classifierOverride_ = Collections.unmodifiableList(classifierOverride_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            bitField0_ = bitField0_ | 1;
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            returnFlatVssText_ = codedinputstream.readBool();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            flag1 = flag4;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
            if ((flag & true))
            {
                classifierOverride_ = Collections.unmodifiableList(classifierOverride_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag2 = true;
            if (true) goto _L10; else goto _L9
_L9:
        }

    }

    public static final class DebugRequestInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private List classifierOverride_;
        private boolean returnFlatVssText_;

        private void ensureClassifierOverrideIsMutable()
        {
            if ((bitField0_ & 1) != 1)
            {
                classifierOverride_ = new ArrayList(classifierOverride_);
                bitField0_ = bitField0_ | 1;
            }
        }

        public final DebugRequestInfo buildPartial()
        {
            DebugRequestInfo debugrequestinfo = new DebugRequestInfo(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final DebugRequestInfo.Builder mergeFrom(DebugRequestInfo debugrequestinfo)
        {
            if (debugrequestinfo == DebugRequestInfo.getDefaultInstance())
            {
                return this;
            }
            if (!debugrequestinfo.classifierOverride_.isEmpty())
            {
                if (classifierOverride_.isEmpty())
                {
                    classifierOverride_ = debugrequestinfo.classifierOverride_;
                    bitField0_ = bitField0_ & -2;
                } else
                {
                    ensureClassifierOverrideIsMutable();
                    classifierOverride_.addAll(debugrequestinfo.classifierOverride_);
                }
            }
            if (debugrequestinfo.hasReturnFlatVssText())
            {
                setReturnFlatVssText(debugrequestinfo.getReturnFlatVssText());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((DebugRequestInfo)generatedmessagelite);
        }

        public final DebugRequestInfo.Builder setReturnFlatVssText(boolean flag)
        {
            bitField0_ = bitField0_ | 2;
            returnFlatVssText_ = flag;
            return this;
        }

        private DebugRequestInfo.Builder()
        {
            super(DebugRequestInfo.defaultInstance);
            classifierOverride_ = Collections.emptyList();
        }

    }

    public static final class DebugResponseInfo extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final DebugResponseInfo defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private List experimentalInstance_;
        private Object flatVssText_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;

        public static DebugResponseInfo getDefaultInstance()
        {
            return defaultInstance;
        }

        private RecognizedInstance getExperimentalInstance(int i)
        {
            return (RecognizedInstance)experimentalInstance_.get(i);
        }

        private int getExperimentalInstanceCount()
        {
            return experimentalInstance_.size();
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(DebugResponseInfo debugresponseinfo)
        {
            return defaultInstance.toBuilder().mergeFrom(debugresponseinfo);
        }

        public final List getExperimentalInstanceList()
        {
            return experimentalInstance_;
        }

        public final String getFlatVssText()
        {
            Object obj = flatVssText_;
            if (obj instanceof String)
            {
                return (String)obj;
            }
            obj = (ByteString)obj;
            String s = ((ByteString) (obj)).toStringUtf8();
            if (((ByteString) (obj)).isValidUtf8())
            {
                flatVssText_ = s;
            }
            return s;
        }

        public final boolean hasFlatVssText()
        {
            return (bitField0_ & 1) == 1;
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
            for (int i = 0; i < getExperimentalInstanceCount(); i++)
            {
                if (!getExperimentalInstance(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            memoizedIsInitialized = 1;
            return true;
        }

        public final Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static DebugResponseInfo parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new DebugResponseInfo(codedinputstream, extensionregistrylite);
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
            defaultInstance = new DebugResponseInfo(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/WireProto$DebugResponseInfo, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$4602(DebugResponseInfo debugresponseinfo, UnknownFieldSetLite unknownfieldsetlite)
        {
            debugresponseinfo.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/



/*
        static List access$4702(DebugResponseInfo debugresponseinfo, List list)
        {
            debugresponseinfo.experimentalInstance_ = list;
            return list;
        }

*/



/*
        static Object access$4802(DebugResponseInfo debugresponseinfo, Object obj)
        {
            debugresponseinfo.flatVssText_ = obj;
            return obj;
        }

*/


/*
        static int access$4902(DebugResponseInfo debugresponseinfo, int i)
        {
            debugresponseinfo.bitField0_ = i;
            return i;
        }

*/


        private DebugResponseInfo(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            boolean flag2;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            experimentalInstance_ = Collections.emptyList();
            flatVssText_ = "";
            flag = false;
            builder = UnknownFieldSetLite.newBuilder();
            flag2 = false;
_L10:
            if (flag2) goto _L2; else goto _L1
_L1:
            boolean flag1;
            boolean flag3;
            boolean flag4;
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 368
        //                       0: 371
        //                       18: 125
        //                       26: 251;
               goto _L3 _L4 _L5 _L6
_L3:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
            {
                flag2 = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = ((flag) ? 1 : 0);
            if ((flag & true)) goto _L8; else goto _L7
_L7:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            experimentalInstance_ = new ArrayList();
            i = flag | true;
_L8:
            flag3 = i;
            flag1 = i;
            flag4 = i;
            experimentalInstance_.add(codedinputstream.readMessage(RecognizedInstance.PARSER, extensionregistrylite));
            flag = i;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            flag1 = flag3;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((flag1 & true))
            {
                experimentalInstance_ = Collections.unmodifiableList(experimentalInstance_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            String s = codedinputstream.readString();
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            bitField0_ = bitField0_ | 1;
            flag3 = flag;
            flag1 = flag;
            flag4 = flag;
            flatVssText_ = s;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            flag1 = flag4;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
            if ((flag & true))
            {
                experimentalInstance_ = Collections.unmodifiableList(experimentalInstance_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag2 = true;
            if (true) goto _L10; else goto _L9
_L9:
        }

    }

    public static final class DebugResponseInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private List experimentalInstance_;
        private Object flatVssText_;

        private void ensureExperimentalInstanceIsMutable()
        {
            if ((bitField0_ & 1) != 1)
            {
                experimentalInstance_ = new ArrayList(experimentalInstance_);
                bitField0_ = bitField0_ | 1;
            }
        }

        public final DebugResponseInfo.Builder addAllExperimentalInstance(Iterable iterable)
        {
            ensureExperimentalInstanceIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(iterable, experimentalInstance_);
            return this;
        }

        public final DebugResponseInfo buildPartial()
        {
            DebugResponseInfo debugresponseinfo = new DebugResponseInfo(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            debugresponseinfo.unknownFields.mergeFrom = <no variable>;
            int j = bitField0_;
            int i = 0;
            if ((bitField0_ & 1) == 1)
            {
                experimentalInstance_ = Collections.unmodifiableList(experimentalInstance_);
                bitField0_ = bitField0_ & -2;
            }
            debugresponseinfo.experimentalInstance_ = experimentalInstance_;
            if ((j & 2) == 2)
            {
                i = 1;
            }
            debugresponseinfo.flatVssText_ = flatVssText_;
            debugresponseinfo.bitField0_ = i;
            return debugresponseinfo;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final DebugResponseInfo.Builder mergeFrom(DebugResponseInfo debugresponseinfo)
        {
            if (debugresponseinfo == DebugResponseInfo.getDefaultInstance())
            {
                return this;
            }
            if (!debugresponseinfo.experimentalInstance_.isEmpty())
            {
                if (experimentalInstance_.isEmpty())
                {
                    experimentalInstance_ = debugresponseinfo.experimentalInstance_;
                    bitField0_ = bitField0_ & -2;
                } else
                {
                    ensureExperimentalInstanceIsMutable();
                    experimentalInstance_.addAll(debugresponseinfo.experimentalInstance_);
                }
            }
            if (debugresponseinfo.hasFlatVssText())
            {
                bitField0_ = bitField0_ | 2;
                flatVssText_ = debugresponseinfo.flatVssText_;
            }
            mergeUnknownFields(((DebugResponseInfo.Builder) (debugresponseinfo)).mergeFrom);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((DebugResponseInfo)generatedmessagelite);
        }

        private DebugResponseInfo.Builder()
        {
            super(DebugResponseInfo.defaultInstance);
            experimentalInstance_ = Collections.emptyList();
            flatVssText_ = "";
        }

    }

    public static final class RecognizedInstance extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final RecognizedInstance defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private List barcode_;
        private int bitField0_;
        private PrimitivesProto.Path bounds_;
        private GiftCardProto.GiftCardData giftCardData_;
        private LoyaltyProto.LoyaltyCardData loyaltyCardData_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List ocrSystemIdAttribution_;
        private float ocrSystemIdScore_;
        private Object ocrSystemId_;
        private Object subtypeId_;
        private List textField_;
        private List validationResult_;
        private int wobType_;

        private PrimitivesProto.RecognizedBarcode getBarcode(int i)
        {
            return (PrimitivesProto.RecognizedBarcode)barcode_.get(i);
        }

        private int getBarcodeCount()
        {
            return barcode_.size();
        }

        public static RecognizedInstance getDefaultInstance()
        {
            return defaultInstance;
        }

        private PrimitivesProto.RecognizedText getTextField(int i)
        {
            return (PrimitivesProto.RecognizedText)textField_.get(i);
        }

        private int getTextFieldCount()
        {
            return textField_.size();
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        private Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder();
            } else
            {
                return (new Builder()).mergeFrom(this);
            }
        }

        public final List getBarcodeList()
        {
            return barcode_;
        }

        public final PrimitivesProto.Path getBounds()
        {
            if (bounds_ == null)
            {
                return PrimitivesProto.Path.getDefaultInstance();
            } else
            {
                return bounds_;
            }
        }

        public final GiftCardProto.GiftCardData getGiftCardData()
        {
            if (giftCardData_ == null)
            {
                return GiftCardProto.GiftCardData.getDefaultInstance();
            } else
            {
                return giftCardData_;
            }
        }

        public final LoyaltyProto.LoyaltyCardData getLoyaltyCardData()
        {
            if (loyaltyCardData_ == null)
            {
                return LoyaltyProto.LoyaltyCardData.getDefaultInstance();
            } else
            {
                return loyaltyCardData_;
            }
        }

        public final float getOcrSystemIdScore()
        {
            return ocrSystemIdScore_;
        }

        public final List getTextFieldList()
        {
            return textField_;
        }

        public final WobType getWobType()
        {
            WobType wobtype1 = WobType.valueOf(wobType_);
            WobType wobtype = wobtype1;
            if (wobtype1 == null)
            {
                wobtype = WobType.UNKNOWN;
            }
            return wobtype;
        }

        public final boolean hasBounds()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasGiftCardData()
        {
            return (bitField0_ & 0x40) == 64;
        }

        public final boolean hasLoyaltyCardData()
        {
            return (bitField0_ & 0x20) == 32;
        }

        public final boolean hasOcrSystemId()
        {
            return (bitField0_ & 4) == 4;
        }

        public final boolean hasOcrSystemIdScore()
        {
            return (bitField0_ & 8) == 8;
        }

        public final boolean hasSubtypeId()
        {
            return (bitField0_ & 0x10) == 16;
        }

        public final boolean hasWobType()
        {
            return (bitField0_ & 1) == 1;
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
            for (int i = 0; i < getTextFieldCount(); i++)
            {
                if (!getTextField(i).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            for (int j = 0; j < getBarcodeCount(); j++)
            {
                if (!getBarcode(j).isInitialized())
                {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }

            if (hasBounds() && !getBounds().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasLoyaltyCardData() && !getLoyaltyCardData().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasGiftCardData() && !getGiftCardData().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            } else
            {
                memoizedIsInitialized = 1;
                return true;
            }
        }

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static RecognizedInstance parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new RecognizedInstance(codedinputstream, extensionregistrylite);
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
            defaultInstance = new RecognizedInstance(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/WireProto$RecognizedInstance, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static List access$1002(RecognizedInstance recognizedinstance, List list)
        {
            recognizedinstance.ocrSystemIdAttribution_ = list;
            return list;
        }

*/



/*
        static List access$1102(RecognizedInstance recognizedinstance, List list)
        {
            recognizedinstance.validationResult_ = list;
            return list;
        }

*/



/*
        static Object access$1202(RecognizedInstance recognizedinstance, Object obj)
        {
            recognizedinstance.subtypeId_ = obj;
            return obj;
        }

*/


/*
        static LoyaltyProto.LoyaltyCardData access$1302(RecognizedInstance recognizedinstance, LoyaltyProto.LoyaltyCardData loyaltycarddata)
        {
            recognizedinstance.loyaltyCardData_ = loyaltycarddata;
            return loyaltycarddata;
        }

*/


/*
        static GiftCardProto.GiftCardData access$1402(RecognizedInstance recognizedinstance, GiftCardProto.GiftCardData giftcarddata)
        {
            recognizedinstance.giftCardData_ = giftcarddata;
            return giftcarddata;
        }

*/


/*
        static int access$1502(RecognizedInstance recognizedinstance, int i)
        {
            recognizedinstance.bitField0_ = i;
            return i;
        }

*/




/*
        static UnknownFieldSetLite access$302(RecognizedInstance recognizedinstance, UnknownFieldSetLite unknownfieldsetlite)
        {
            recognizedinstance.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static int access$402(RecognizedInstance recognizedinstance, int i)
        {
            recognizedinstance.wobType_ = i;
            return i;
        }

*/



/*
        static List access$502(RecognizedInstance recognizedinstance, List list)
        {
            recognizedinstance.textField_ = list;
            return list;
        }

*/



/*
        static List access$602(RecognizedInstance recognizedinstance, List list)
        {
            recognizedinstance.barcode_ = list;
            return list;
        }

*/


/*
        static PrimitivesProto.Path access$702(RecognizedInstance recognizedinstance, PrimitivesProto.Path path)
        {
            recognizedinstance.bounds_ = path;
            return path;
        }

*/



/*
        static Object access$802(RecognizedInstance recognizedinstance, Object obj)
        {
            recognizedinstance.ocrSystemId_ = obj;
            return obj;
        }

*/


/*
        static float access$902(RecognizedInstance recognizedinstance, float f)
        {
            recognizedinstance.ocrSystemIdScore_ = f;
            return f;
        }

*/

        private RecognizedInstance(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            int i;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            wobType_ = 0;
            textField_ = Collections.emptyList();
            barcode_ = Collections.emptyList();
            ocrSystemId_ = "";
            ocrSystemIdScore_ = 0.0F;
            ocrSystemIdAttribution_ = Collections.emptyList();
            validationResult_ = Collections.emptyList();
            subtypeId_ = "";
            i = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L39:
            if (flag) goto _L2; else goto _L1
_L1:
            int j;
            int k;
            int l;
            k = i;
            j = i;
            l = i;
            int i1 = codedinputstream.readTag();
            i1;
            JVM INSTR lookupswitch 12: default 1490
        //                       0: 1493
        //                       16: 238
        //                       34: 483
        //                       42: 561
        //                       50: 639
        //                       58: 780
        //                       69: 839
        //                       74: 885
        //                       82: 966
        //                       90: 1050
        //                       16002: 1110
        //                       16010: 1254;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L3:
            k = i;
            j = i;
            l = i;
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            k = i;
            j = i;
            l = i;
            i1 = codedinputstream.readEnum();
            k = i;
            j = i;
            l = i;
            if (WobType.valueOf(i1) != null) goto _L17; else goto _L16
_L16:
            k = i;
            j = i;
            l = i;
            builder.mergeVarintField(2, i1);
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = k;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            if ((j & 2) == 2)
            {
                textField_ = Collections.unmodifiableList(textField_);
            }
            if ((j & 4) == 4)
            {
                barcode_ = Collections.unmodifiableList(barcode_);
            }
            if ((j & 0x40) == 64)
            {
                ocrSystemIdAttribution_ = Collections.unmodifiableList(ocrSystemIdAttribution_);
            }
            if ((j & 0x80) == 128)
            {
                validationResult_ = Collections.unmodifiableList(validationResult_);
            }
            unknownFields = builder.build();
            throw codedinputstream;
_L17:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 1;
            k = i;
            j = i;
            l = i;
            wobType_ = i1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            j = l;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L6:
            i1 = i;
            if ((i & 2) == 2) goto _L19; else goto _L18
_L18:
            k = i;
            j = i;
            l = i;
            textField_ = new ArrayList();
            i1 = i | 2;
_L19:
            k = i1;
            j = i1;
            l = i1;
            textField_.add(codedinputstream.readMessage(PrimitivesProto.RecognizedText.PARSER, extensionregistrylite));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L7:
            i1 = i;
            if ((i & 4) == 4) goto _L21; else goto _L20
_L20:
            k = i;
            j = i;
            l = i;
            barcode_ = new ArrayList();
            i1 = i | 4;
_L21:
            k = i1;
            j = i1;
            l = i1;
            barcode_.add(codedinputstream.readMessage(PrimitivesProto.RecognizedBarcode.PARSER, extensionregistrylite));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L8:
            Object obj;
            obj = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 2) != 2) goto _L23; else goto _L22
_L22:
            k = i;
            j = i;
            l = i;
            obj = bounds_.toBuilder();
_L23:
            k = i;
            j = i;
            l = i;
            bounds_ = (PrimitivesProto.Path)codedinputstream.readMessage(PrimitivesProto.Path.PARSER, extensionregistrylite);
            if (obj == null) goto _L25; else goto _L24
_L24:
            k = i;
            j = i;
            l = i;
            ((PrimitivesProto.Path.Builder) (obj)).mergeFrom(bounds_);
            k = i;
            j = i;
            l = i;
            bounds_ = ((PrimitivesProto.Path.Builder) (obj)).buildPartial();
_L25:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
_L9:
            k = i;
            j = i;
            l = i;
            obj = codedinputstream.readString();
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 4;
            k = i;
            j = i;
            l = i;
            ocrSystemId_ = obj;
            continue; /* Loop/switch isn't completed */
_L10:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 8;
            k = i;
            j = i;
            l = i;
            ocrSystemIdScore_ = codedinputstream.readFloat();
            continue; /* Loop/switch isn't completed */
_L11:
            i1 = i;
            if ((i & 0x40) == 64) goto _L27; else goto _L26
_L26:
            k = i;
            j = i;
            l = i;
            ocrSystemIdAttribution_ = new ArrayList();
            i1 = i | 0x40;
_L27:
            k = i1;
            j = i1;
            l = i1;
            ocrSystemIdAttribution_.add(codedinputstream.readMessage(PrimitivesProto.Attribution.PARSER, extensionregistrylite));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L12:
            i1 = i;
            if ((i & 0x80) == 128) goto _L29; else goto _L28
_L28:
            k = i;
            j = i;
            l = i;
            validationResult_ = new ArrayList();
            i1 = i | 0x80;
_L29:
            k = i1;
            j = i1;
            l = i1;
            validationResult_.add(codedinputstream.readMessage(PrimitivesProto.ValidationResult.PARSER, extensionregistrylite));
            i = i1;
            continue; /* Loop/switch isn't completed */
_L13:
            k = i;
            j = i;
            l = i;
            obj = codedinputstream.readString();
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 0x10;
            k = i;
            j = i;
            l = i;
            subtypeId_ = obj;
            continue; /* Loop/switch isn't completed */
_L14:
            obj = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 0x20) != 32) goto _L31; else goto _L30
_L30:
            k = i;
            j = i;
            l = i;
            obj = loyaltyCardData_.toBuilder();
_L31:
            k = i;
            j = i;
            l = i;
            loyaltyCardData_ = (LoyaltyProto.LoyaltyCardData)codedinputstream.readMessage(LoyaltyProto.LoyaltyCardData.PARSER, extensionregistrylite);
            if (obj == null) goto _L33; else goto _L32
_L32:
            k = i;
            j = i;
            l = i;
            ((LoyaltyProto.LoyaltyCardData.Builder) (obj)).mergeFrom(loyaltyCardData_);
            k = i;
            j = i;
            l = i;
            loyaltyCardData_ = ((LoyaltyProto.LoyaltyCardData.Builder) (obj)).buildPartial();
_L33:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 0x20;
            continue; /* Loop/switch isn't completed */
_L15:
            obj = null;
            k = i;
            j = i;
            l = i;
            if ((bitField0_ & 0x40) != 64) goto _L35; else goto _L34
_L34:
            k = i;
            j = i;
            l = i;
            obj = giftCardData_.toBuilder();
_L35:
            k = i;
            j = i;
            l = i;
            giftCardData_ = (GiftCardProto.GiftCardData)codedinputstream.readMessage(GiftCardProto.GiftCardData.PARSER, extensionregistrylite);
            if (obj == null) goto _L37; else goto _L36
_L36:
            k = i;
            j = i;
            l = i;
            ((GiftCardProto.GiftCardData.Builder) (obj)).mergeFrom(giftCardData_);
            k = i;
            j = i;
            l = i;
            giftCardData_ = ((GiftCardProto.GiftCardData.Builder) (obj)).buildPartial();
_L37:
            k = i;
            j = i;
            l = i;
            bitField0_ = bitField0_ | 0x40;
            continue; /* Loop/switch isn't completed */
_L2:
            if ((i & 2) == 2)
            {
                textField_ = Collections.unmodifiableList(textField_);
            }
            if ((i & 4) == 4)
            {
                barcode_ = Collections.unmodifiableList(barcode_);
            }
            if ((i & 0x40) == 64)
            {
                ocrSystemIdAttribution_ = Collections.unmodifiableList(ocrSystemIdAttribution_);
            }
            if ((i & 0x80) == 128)
            {
                validationResult_ = Collections.unmodifiableList(validationResult_);
            }
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L39; else goto _L38
_L38:
        }

    }

    public static final class RecognizedInstance.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private List barcode_;
        private int bitField0_;
        private PrimitivesProto.Path bounds_;
        private GiftCardProto.GiftCardData giftCardData_;
        private LoyaltyProto.LoyaltyCardData loyaltyCardData_;
        private List ocrSystemIdAttribution_;
        private float ocrSystemIdScore_;
        private Object ocrSystemId_;
        private Object subtypeId_;
        private List textField_;
        private List validationResult_;
        private int wobType_;

        private RecognizedInstance buildPartial()
        {
            RecognizedInstance recognizedinstance = new RecognizedInstance(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            recognizedinstance.unknownFields.getDefaultInstance = <no variable>;
            int k = bitField0_;
            int j = 0;
            if ((k & 1) == 1)
            {
                j = 1;
            }
            recognizedinstance.wobType_ = wobType_;
            if ((bitField0_ & 2) == 2)
            {
                textField_ = Collections.unmodifiableList(textField_);
                bitField0_ = bitField0_ & -3;
            }
            recognizedinstance.textField_ = textField_;
            if ((bitField0_ & 4) == 4)
            {
                barcode_ = Collections.unmodifiableList(barcode_);
                bitField0_ = bitField0_ & -5;
            }
            recognizedinstance.barcode_ = barcode_;
            int i = j;
            if ((k & 8) == 8)
            {
                i = j | 2;
            }
            recognizedinstance.bounds_ = bounds_;
            j = i;
            if ((k & 0x10) == 16)
            {
                j = i | 4;
            }
            recognizedinstance.ocrSystemId_ = ocrSystemId_;
            i = j;
            if ((k & 0x20) == 32)
            {
                i = j | 8;
            }
            recognizedinstance.ocrSystemIdScore_ = ocrSystemIdScore_;
            if ((bitField0_ & 0x40) == 64)
            {
                ocrSystemIdAttribution_ = Collections.unmodifiableList(ocrSystemIdAttribution_);
                bitField0_ = bitField0_ & 0xffffffbf;
            }
            recognizedinstance.ocrSystemIdAttribution_ = ocrSystemIdAttribution_;
            if ((bitField0_ & 0x80) == 128)
            {
                validationResult_ = Collections.unmodifiableList(validationResult_);
                bitField0_ = bitField0_ & 0xffffff7f;
            }
            recognizedinstance.validationResult_ = validationResult_;
            j = i;
            if ((k & 0x100) == 256)
            {
                j = i | 0x10;
            }
            recognizedinstance.subtypeId_ = subtypeId_;
            i = j;
            if ((k & 0x200) == 512)
            {
                i = j | 0x20;
            }
            recognizedinstance.loyaltyCardData_ = loyaltyCardData_;
            j = i;
            if ((k & 0x400) == 1024)
            {
                j = i | 0x40;
            }
            recognizedinstance.giftCardData_ = giftCardData_;
            recognizedinstance.bitField0_ = j;
            return recognizedinstance;
        }

        private void ensureBarcodeIsMutable()
        {
            if ((bitField0_ & 4) != 4)
            {
                barcode_ = new ArrayList(barcode_);
                bitField0_ = bitField0_ | 4;
            }
        }

        private void ensureOcrSystemIdAttributionIsMutable()
        {
            if ((bitField0_ & 0x40) != 64)
            {
                ocrSystemIdAttribution_ = new ArrayList(ocrSystemIdAttribution_);
                bitField0_ = bitField0_ | 0x40;
            }
        }

        private void ensureTextFieldIsMutable()
        {
            if ((bitField0_ & 2) != 2)
            {
                textField_ = new ArrayList(textField_);
                bitField0_ = bitField0_ | 2;
            }
        }

        private void ensureValidationResultIsMutable()
        {
            if ((bitField0_ & 0x80) != 128)
            {
                validationResult_ = new ArrayList(validationResult_);
                bitField0_ = bitField0_ | 0x80;
            }
        }

        private RecognizedInstance.Builder mergeBounds(PrimitivesProto.Path path)
        {
            if ((bitField0_ & 8) == 8 && bounds_ != null && bounds_ != PrimitivesProto.Path.getDefaultInstance())
            {
                bounds_ = PrimitivesProto.Path.newBuilder(bounds_).mergeFrom(path).buildPartial();
            } else
            {
                bounds_ = path;
            }
            bitField0_ = bitField0_ | 8;
            return this;
        }

        private RecognizedInstance.Builder mergeGiftCardData(GiftCardProto.GiftCardData giftcarddata)
        {
            if ((bitField0_ & 0x400) == 1024 && giftCardData_ != null && giftCardData_ != GiftCardProto.GiftCardData.getDefaultInstance())
            {
                giftCardData_ = GiftCardProto.GiftCardData.newBuilder(giftCardData_).mergeFrom(giftcarddata).buildPartial();
            } else
            {
                giftCardData_ = giftcarddata;
            }
            bitField0_ = bitField0_ | 0x400;
            return this;
        }

        private RecognizedInstance.Builder mergeLoyaltyCardData(LoyaltyProto.LoyaltyCardData loyaltycarddata)
        {
            if ((bitField0_ & 0x200) == 512 && loyaltyCardData_ != null && loyaltyCardData_ != LoyaltyProto.LoyaltyCardData.getDefaultInstance())
            {
                loyaltyCardData_ = LoyaltyProto.LoyaltyCardData.newBuilder(loyaltyCardData_).mergeFrom(loyaltycarddata).buildPartial();
            } else
            {
                loyaltyCardData_ = loyaltycarddata;
            }
            bitField0_ = bitField0_ | 0x200;
            return this;
        }

        private RecognizedInstance.Builder setOcrSystemIdScore(float f)
        {
            bitField0_ = bitField0_ | 0x20;
            ocrSystemIdScore_ = f;
            return this;
        }

        public final RecognizedInstance.Builder addBarcode(PrimitivesProto.RecognizedBarcode recognizedbarcode)
        {
            if (recognizedbarcode == null)
            {
                throw new NullPointerException();
            } else
            {
                ensureBarcodeIsMutable();
                barcode_.add(recognizedbarcode);
                return this;
            }
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final RecognizedInstance.Builder mergeFrom(RecognizedInstance recognizedinstance)
        {
            if (recognizedinstance == RecognizedInstance.getDefaultInstance())
            {
                return this;
            }
            if (recognizedinstance.hasWobType())
            {
                setWobType(recognizedinstance.getWobType());
            }
            if (!recognizedinstance.textField_.isEmpty())
            {
                if (textField_.isEmpty())
                {
                    textField_ = recognizedinstance.textField_;
                    bitField0_ = bitField0_ & -3;
                } else
                {
                    ensureTextFieldIsMutable();
                    textField_.addAll(recognizedinstance.textField_);
                }
            }
            if (!recognizedinstance.barcode_.isEmpty())
            {
                if (barcode_.isEmpty())
                {
                    barcode_ = recognizedinstance.barcode_;
                    bitField0_ = bitField0_ & -5;
                } else
                {
                    ensureBarcodeIsMutable();
                    barcode_.addAll(recognizedinstance.barcode_);
                }
            }
            if (recognizedinstance.hasBounds())
            {
                mergeBounds(recognizedinstance.getBounds());
            }
            if (recognizedinstance.hasOcrSystemId())
            {
                bitField0_ = bitField0_ | 0x10;
                ocrSystemId_ = recognizedinstance.ocrSystemId_;
            }
            if (recognizedinstance.hasOcrSystemIdScore())
            {
                setOcrSystemIdScore(recognizedinstance.getOcrSystemIdScore());
            }
            if (!recognizedinstance.ocrSystemIdAttribution_.isEmpty())
            {
                if (ocrSystemIdAttribution_.isEmpty())
                {
                    ocrSystemIdAttribution_ = recognizedinstance.ocrSystemIdAttribution_;
                    bitField0_ = bitField0_ & 0xffffffbf;
                } else
                {
                    ensureOcrSystemIdAttributionIsMutable();
                    ocrSystemIdAttribution_.addAll(recognizedinstance.ocrSystemIdAttribution_);
                }
            }
            if (!recognizedinstance.validationResult_.isEmpty())
            {
                if (validationResult_.isEmpty())
                {
                    validationResult_ = recognizedinstance.validationResult_;
                    bitField0_ = bitField0_ & 0xffffff7f;
                } else
                {
                    ensureValidationResultIsMutable();
                    validationResult_.addAll(recognizedinstance.validationResult_);
                }
            }
            if (recognizedinstance.hasSubtypeId())
            {
                bitField0_ = bitField0_ | 0x100;
                subtypeId_ = recognizedinstance.subtypeId_;
            }
            if (recognizedinstance.hasLoyaltyCardData())
            {
                mergeLoyaltyCardData(recognizedinstance.getLoyaltyCardData());
            }
            if (recognizedinstance.hasGiftCardData())
            {
                mergeGiftCardData(recognizedinstance.getGiftCardData());
            }
            mergeUnknownFields(((PrimitivesProto.Path) (recognizedinstance)).getDefaultInstance);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((RecognizedInstance)generatedmessagelite);
        }

        public final RecognizedInstance.Builder setGiftCardData(GiftCardProto.GiftCardData.Builder builder)
        {
            giftCardData_ = (GiftCardProto.GiftCardData)builder.build();
            bitField0_ = bitField0_ | 0x400;
            return this;
        }

        public final RecognizedInstance.Builder setLoyaltyCardData(LoyaltyProto.LoyaltyCardData.Builder builder)
        {
            loyaltyCardData_ = (LoyaltyProto.LoyaltyCardData)builder.build();
            bitField0_ = bitField0_ | 0x200;
            return this;
        }

        public final RecognizedInstance.Builder setWobType(WobType wobtype)
        {
            if (wobtype == null)
            {
                throw new NullPointerException();
            } else
            {
                bitField0_ = bitField0_ | 1;
                wobType_ = wobtype.getNumber();
                return this;
            }
        }

        private RecognizedInstance.Builder()
        {
            super(RecognizedInstance.defaultInstance);
            wobType_ = 0;
            textField_ = Collections.emptyList();
            barcode_ = Collections.emptyList();
            bounds_ = null;
            ocrSystemId_ = "";
            ocrSystemIdAttribution_ = Collections.emptyList();
            validationResult_ = Collections.emptyList();
            subtypeId_ = "";
            loyaltyCardData_ = null;
            giftCardData_ = null;
        }

    }

    public static final class WobType extends Enum
    {

        private static final WobType $VALUES[];
        public static final WobType GIFTCARD;
        public static final WobType LOYALTY;
        public static final WobType UNKNOWN;
        public static final WobType US_LICENSE;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static WobType valueOf(int i)
        {
            switch (i)
            {
            case 3: // '\003'
            default:
                return null;

            case 0: // '\0'
                return UNKNOWN;

            case 1: // '\001'
                return LOYALTY;

            case 2: // '\002'
                return GIFTCARD;

            case 4: // '\004'
                return US_LICENSE;
            }
        }

        public static WobType valueOf(String s)
        {
            return (WobType)Enum.valueOf(com/google/commerce/ocr/definitions/WireProto$WobType, s);
        }

        public static WobType[] values()
        {
            return (WobType[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            UNKNOWN = new WobType("UNKNOWN", 0, 0, 0);
            LOYALTY = new WobType("LOYALTY", 1, 1, 1);
            GIFTCARD = new WobType("GIFTCARD", 2, 2, 2);
            US_LICENSE = new WobType("US_LICENSE", 3, 3, 4);
            $VALUES = (new WobType[] {
                UNKNOWN, LOYALTY, GIFTCARD, US_LICENSE
            });
        }

        private WobType(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

}
