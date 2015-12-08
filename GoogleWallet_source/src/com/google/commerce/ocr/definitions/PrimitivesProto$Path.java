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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

public static final class <init> extends GeneratedMessageLite
{
    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private List constraint_;
        private List pathComponent_;
        private Point startPoint_;

        private void ensureConstraintIsMutable()
        {
            if ((bitField0_ & 4) != 4)
            {
                constraint_ = new ArrayList(constraint_);
                bitField0_ = bitField0_ | 4;
            }
        }

        private void ensurePathComponentIsMutable()
        {
            if ((bitField0_ & 2) != 2)
            {
                pathComponent_ = new ArrayList(pathComponent_);
                bitField0_ = bitField0_ | 2;
            }
        }

        private Builder mergeStartPoint(Point point)
        {
            if ((bitField0_ & 1) == 1 && startPoint_ != null && startPoint_ != Point.getDefaultInstance())
            {
                startPoint_ = Point.newBuilder(startPoint_).mergeFrom(point).buildPartial();
            } else
            {
                startPoint_ = point;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        public final Builder addConstraint(Constraint constraint)
        {
            if (constraint == null)
            {
                throw new NullPointerException();
            } else
            {
                ensureConstraintIsMutable();
                constraint_.add(Integer.valueOf(constraint.getNumber()));
                return this;
            }
        }

        public final Builder addPathComponent(PathComponent pathcomponent)
        {
            if (pathcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                ensurePathComponentIsMutable();
                pathComponent_.add(pathcomponent);
                return this;
            }
        }

        public final PrimitivesProto.Path buildPartial()
        {
            PrimitivesProto.Path path = new PrimitivesProto.Path(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            path.unknownFields.access$5500 = <no variable>;
            int j = bitField0_;
            int i = 0;
            if ((j & 1) == 1)
            {
                i = 1;
            }
            path.startPoint_ = startPoint_;
            if ((bitField0_ & 2) == 2)
            {
                pathComponent_ = Collections.unmodifiableList(pathComponent_);
                bitField0_ = bitField0_ & -3;
            }
            path.pathComponent_ = pathComponent_;
            if ((bitField0_ & 4) == 4)
            {
                constraint_ = Collections.unmodifiableList(constraint_);
                bitField0_ = bitField0_ & -5;
            }
            path.constraint_ = constraint_;
            path.bitField0_ = i;
            return path;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final Builder mergeFrom(PrimitivesProto.Path path)
        {
            if (path == PrimitivesProto.Path.getDefaultInstance())
            {
                return this;
            }
            if (path.hasStartPoint())
            {
                mergeStartPoint(path.getStartPoint());
            }
            if (!path.pathComponent_.isEmpty())
            {
                if (pathComponent_.isEmpty())
                {
                    pathComponent_ = path.pathComponent_;
                    bitField0_ = bitField0_ & -3;
                } else
                {
                    ensurePathComponentIsMutable();
                    pathComponent_.addAll(path.pathComponent_);
                }
            }
            if (!path.constraint_.isEmpty())
            {
                if (constraint_.isEmpty())
                {
                    constraint_ = path.constraint_;
                    bitField0_ = bitField0_ & -5;
                } else
                {
                    ensureConstraintIsMutable();
                    constraint_.addAll(path.constraint_);
                }
            }
            mergeUnknownFields(path.access$5500);
            return this;
        }

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((PrimitivesProto.Path)generatedmessagelite);
        }

        public final Builder setStartPoint(Point point)
        {
            if (point == null)
            {
                throw new NullPointerException();
            } else
            {
                startPoint_ = point;
                bitField0_ = bitField0_ | 1;
                return this;
            }
        }

        private Builder()
        {
            super(PrimitivesProto.Path.defaultInstance);
            startPoint_ = null;
            pathComponent_ = Collections.emptyList();
            constraint_ = Collections.emptyList();
        }

        Builder(PrimitivesProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class Constraint extends Enum
    {

        private static final Constraint $VALUES[];
        public static final Constraint CONSTRAINT_BOX;
        public static final Constraint CONSTRAINT_LINEAR;
        public static final Constraint CONSTRAINT_QUADRATIC;
        private static com.google.protobuf.Internal.EnumLiteMap internalValueMap = new com.google.protobuf.Internal.EnumLiteMap() {

        };
        private final int value;

        public static Constraint valueOf(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 1: // '\001'
                return CONSTRAINT_BOX;

            case 2: // '\002'
                return CONSTRAINT_LINEAR;

            case 3: // '\003'
                return CONSTRAINT_QUADRATIC;
            }
        }

        public static Constraint valueOf(String s)
        {
            return (Constraint)Enum.valueOf(com/google/commerce/ocr/definitions/PrimitivesProto$Path$Constraint, s);
        }

        public static Constraint[] values()
        {
            return (Constraint[])$VALUES.clone();
        }

        public final int getNumber()
        {
            return value;
        }

        static 
        {
            CONSTRAINT_BOX = new Constraint("CONSTRAINT_BOX", 0, 0, 1);
            CONSTRAINT_LINEAR = new Constraint("CONSTRAINT_LINEAR", 1, 1, 2);
            CONSTRAINT_QUADRATIC = new Constraint("CONSTRAINT_QUADRATIC", 2, 2, 3);
            $VALUES = (new Constraint[] {
                CONSTRAINT_BOX, CONSTRAINT_LINEAR, CONSTRAINT_QUADRATIC
            });
        }

        private Constraint(String s, int i, int j, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PathComponent extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final PathComponent defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private Point endPoint_;
        private Point firstControlPoint_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Point secondControlPoint_;

        public static PathComponent getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        private Builder toBuilder()
        {
            if (this == defaultInstance)
            {
                return new Builder(null);
            } else
            {
                return (new Builder(null)).mergeFrom(this);
            }
        }

        public final Point getEndPoint()
        {
            if (endPoint_ == null)
            {
                return Point.getDefaultInstance();
            } else
            {
                return endPoint_;
            }
        }

        public final Point getFirstControlPoint()
        {
            if (firstControlPoint_ == null)
            {
                return Point.getDefaultInstance();
            } else
            {
                return firstControlPoint_;
            }
        }

        public final Point getSecondControlPoint()
        {
            if (secondControlPoint_ == null)
            {
                return Point.getDefaultInstance();
            } else
            {
                return secondControlPoint_;
            }
        }

        public final boolean hasEndPoint()
        {
            return (bitField0_ & 1) == 1;
        }

        public final boolean hasFirstControlPoint()
        {
            return (bitField0_ & 2) == 2;
        }

        public final boolean hasSecondControlPoint()
        {
            return (bitField0_ & 4) == 4;
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
            if (hasEndPoint() && !getEndPoint().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasFirstControlPoint() && !getFirstControlPoint().isInitialized())
            {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasSecondControlPoint() && !getSecondControlPoint().isInitialized())
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

                private static PathComponent parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                    throws InvalidProtocolBufferException
                {
                    try
                    {
                        codedinputstream = new PathComponent(codedinputstream, extensionregistrylite, null);
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
            defaultInstance = new PathComponent(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path$PathComponent, new com.google.protobuf.GeneratedMessageLite.PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$3402(PathComponent pathcomponent, UnknownFieldSetLite unknownfieldsetlite)
        {
            pathcomponent.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static Point access$3502(PathComponent pathcomponent, Point point)
        {
            pathcomponent.endPoint_ = point;
            return point;
        }

*/


/*
        static Point access$3602(PathComponent pathcomponent, Point point)
        {
            pathcomponent.firstControlPoint_ = point;
            return point;
        }

*/


/*
        static Point access$3702(PathComponent pathcomponent, Point point)
        {
            pathcomponent.secondControlPoint_ = point;
            return point;
        }

*/


/*
        static int access$3802(PathComponent pathcomponent, int i)
        {
            pathcomponent.bitField0_ = i;
            return i;
        }

*/


        private PathComponent(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder1;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            builder1 = UnknownFieldSetLite.newBuilder();
            flag = false;
_L15:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 4: default 361
        //                       0: 364
        //                       10: 94
        //                       18: 189
        //                       26: 282;
               goto _L3 _L4 _L5 _L6 _L7
_L3:
            if (!parseUnknownField(codedinputstream, builder1, extensionregistrylite, i))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            Point.Builder builder = null;
            if ((bitField0_ & 1) == 1)
            {
                builder = endPoint_.toBuilder();
            }
            endPoint_ = (Point)codedinputstream.readMessage(Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L9; else goto _L8
_L8:
            builder.mergeFrom(endPoint_);
            endPoint_ = builder.buildPartial();
_L9:
            bitField0_ = bitField0_ | 1;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
            codedinputstream;
            unknownFields = builder1.build();
            throw codedinputstream;
_L6:
            builder = null;
            if ((bitField0_ & 2) == 2)
            {
                builder = firstControlPoint_.toBuilder();
            }
            firstControlPoint_ = (Point)codedinputstream.readMessage(Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L11; else goto _L10
_L10:
            builder.mergeFrom(firstControlPoint_);
            firstControlPoint_ = builder.buildPartial();
_L11:
            bitField0_ = bitField0_ | 2;
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
            builder = null;
            if ((bitField0_ & 4) == 4)
            {
                builder = secondControlPoint_.toBuilder();
            }
            secondControlPoint_ = (Point)codedinputstream.readMessage(Point.PARSER, extensionregistrylite);
            if (builder == null) goto _L13; else goto _L12
_L12:
            builder.mergeFrom(secondControlPoint_);
            secondControlPoint_ = builder.buildPartial();
_L13:
            bitField0_ = bitField0_ | 4;
            continue; /* Loop/switch isn't completed */
_L2:
            unknownFields = builder1.build();
            return;
_L4:
            flag = true;
            if (true) goto _L15; else goto _L14
_L14:
        }

        PathComponent(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, PrimitivesProto._cls1 _pcls1)
        {
            this(codedinputstream, extensionregistrylite);
        }
    }

    public static final class PathComponent.Builder extends com.google.protobuf.GeneratedMessageLite.Builder
    {

        private int bitField0_;
        private Point endPoint_;
        private Point firstControlPoint_;
        private Point secondControlPoint_;

        private PathComponent buildPartial()
        {
            PathComponent pathcomponent = new PathComponent(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry(), null);
            
// JavaClassFileOutputException: get_constant: invalid tag

        private PathComponent.Builder mergeEndPoint(Point point)
        {
            if ((bitField0_ & 1) == 1 && endPoint_ != null && endPoint_ != Point.getDefaultInstance())
            {
                endPoint_ = Point.newBuilder(endPoint_).mergeFrom(point).buildPartial();
            } else
            {
                endPoint_ = point;
            }
            bitField0_ = bitField0_ | 1;
            return this;
        }

        private PathComponent.Builder mergeFirstControlPoint(Point point)
        {
            if ((bitField0_ & 2) == 2 && firstControlPoint_ != null && firstControlPoint_ != Point.getDefaultInstance())
            {
                firstControlPoint_ = Point.newBuilder(firstControlPoint_).mergeFrom(point).buildPartial();
            } else
            {
                firstControlPoint_ = point;
            }
            bitField0_ = bitField0_ | 2;
            return this;
        }

        private PathComponent.Builder mergeSecondControlPoint(Point point)
        {
            if ((bitField0_ & 4) == 4 && secondControlPoint_ != null && secondControlPoint_ != Point.getDefaultInstance())
            {
                secondControlPoint_ = Point.newBuilder(secondControlPoint_).mergeFrom(point).buildPartial();
            } else
            {
                secondControlPoint_ = point;
            }
            bitField0_ = bitField0_ | 4;
            return this;
        }

        public final volatile GeneratedMessageLite buildPartial()
        {
            return buildPartial();
        }

        public final PathComponent.Builder mergeFrom(PathComponent pathcomponent)
        {
            if (pathcomponent == PathComponent.getDefaultInstance())
            {
                return this;
            }
            if (pathcomponent.hasEndPoint())
            {
                mergeEndPoint(pathcomponent.getEndPoint());
            }
            if (pathcomponent.hasFirstControlPoint())
            {
                mergeFirstControlPoint(pathcomponent.getFirstControlPoint());
            }
            if (pathcomponent.hasSecondControlPoint())
            {
                mergeSecondControlPoint(pathcomponent.getSecondControlPoint());
            }
            mergeUnknownFields(
// JavaClassFileOutputException: get_constant: invalid tag

        public final volatile com.google.protobuf.GeneratedMessageLite.Builder mergeFrom(GeneratedMessageLite generatedmessagelite)
        {
            return mergeFrom((PathComponent)generatedmessagelite);
        }

        public final PathComponent.Builder setEndPoint(Point point)
        {
            if (point == null)
            {
                throw new NullPointerException();
            } else
            {
                endPoint_ = point;
                bitField0_ = bitField0_ | 1;
                return this;
            }
        }

        private PathComponent.Builder()
        {
            super(PathComponent.defaultInstance);
            endPoint_ = null;
            firstControlPoint_ = null;
            secondControlPoint_ = null;
        }

        PathComponent.Builder(PrimitivesProto._cls1 _pcls1)
        {
            this();
        }
    }

    public static final class Point extends GeneratedMessageLite
    {

        public static final Parser PARSER;
        private static final Point defaultInstance;
        private static volatile MutableMessageLite mutableDefault = null;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int x_;
        private int y_;

        public static Point getDefaultInstance()
        {
            return defaultInstance;
        }

        public static Builder newBuilder()
        {
            return defaultInstance.toBuilder();
        }

        public static Builder newBuilder(Point point)
        {
            return defaultInstance.toBuilder().mergeFrom(point);
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

        public final volatile com.google.protobuf.MessageLite.Builder toBuilder()
        {
            return toBuilder();
        }

        static 
        {
            PARSER = new AbstractParser() {

                private static Point parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
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
            defaultInstance = new Point(Internal.EMPTY_CODED_INPUT_STREAM, ExtensionRegistryLite.getEmptyRegistry());
            GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path$Point, new PrototypeHolder(defaultInstance, PARSER));
        }



/*
        static UnknownFieldSetLite access$4302(Point point, UnknownFieldSetLite unknownfieldsetlite)
        {
            point.unknownFields = unknownfieldsetlite;
            return unknownfieldsetlite;
        }

*/


/*
        static int access$4402(Point point, int i)
        {
            point.x_ = i;
            return i;
        }

*/


/*
        static int access$4502(Point point, int i)
        {
            point.y_ = i;
            return i;
        }

*/


/*
        static int access$4602(Point point, int i)
        {
            point.bitField0_ = i;
            return i;
        }

*/


        private Point(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
        {
            com.google.protobuf.UnknownFieldSetLite.Builder builder;
            boolean flag;
            memoizedIsInitialized = -1;
            memoizedSerializedSize = -1;
            x_ = 0;
            y_ = 0;
            builder = UnknownFieldSetLite.newBuilder();
            flag = false;
_L8:
            if (flag) goto _L2; else goto _L1
_L1:
            int i = codedinputstream.readTag();
            i;
            JVM INSTR lookupswitch 3: default 197
        //                       0: 200
        //                       8: 97
        //                       16: 143;
               goto _L3 _L4 _L5 _L6
_L3:
            if (!parseUnknownField(codedinputstream, builder, extensionregistrylite, i))
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
            unknownFields = builder.build();
            throw codedinputstream;
_L6:
            bitField0_ = bitField0_ | 2;
            y_ = codedinputstream.readInt32();
            continue; /* Loop/switch isn't completed */
            codedinputstream;
            throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L2:
            unknownFields = builder.build();
            return;
_L4:
            flag = true;
            if (true) goto _L8; else goto _L7
_L7:
        }

        Point(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, PrimitivesProto._cls1 _pcls1)
        {
            this(codedinputstream, extensionregistrylite);
        }
    }


    public static final Parser PARSER;
    private static final com.google.protobuf.Converter constraint_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter() {

        private static Constraint convert(Integer integer)
        {
            Constraint constraint = Constraint.valueOf(integer.intValue());
            integer = constraint;
            if (constraint == null)
            {
                integer = Constraint.CONSTRAINT_BOX;
            }
            return integer;
        }

        public final volatile Object convert(Object obj)
        {
            return convert((Integer)obj);
        }

    };
    private static final _cls2.convert defaultInstance;
    private static volatile MutableMessageLite mutableDefault = null;
    private int bitField0_;
    private List constraint_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List pathComponent_;
    private Point startPoint_;

    public static y getDefaultInstance()
    {
        return defaultInstance;
    }

    private PathComponent getPathComponent(int i)
    {
        return (PathComponent)pathComponent_.get(i);
    }

    private int getPathComponentCount()
    {
        return pathComponent_.size();
    }

    public static Builder newBuilder()
    {
        return defaultInstance.toBuilder();
    }

    public static Builder newBuilder(toBuilder tobuilder)
    {
        return defaultInstance.toBuilder().mergeFrom(tobuilder);
    }

    public final Point getStartPoint()
    {
        if (startPoint_ == null)
        {
            return Point.getDefaultInstance();
        } else
        {
            return startPoint_;
        }
    }

    public final boolean hasStartPoint()
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
        if (hasStartPoint() && !getStartPoint().isInitialized())
        {
            memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < getPathComponentCount(); i++)
        {
            if (!getPathComponent(i).isInitialized())
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
            return new Builder(null);
        } else
        {
            return (new Builder(null)).mergeFrom(this);
        }
    }

    public final volatile com.google.protobuf.tivesProto.Path toBuilder()
    {
        return toBuilder();
    }

    static 
    {
        PARSER = new AbstractParser() {

            private static PrimitivesProto.Path parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
                throws InvalidProtocolBufferException
            {
                try
                {
                    codedinputstream = new Path(codedinputstream, extensionregistrylite, null);
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
        GeneratedMessageLite.onLoad(com/google/commerce/ocr/definitions/PrimitivesProto$Path, new PrototypeHolder(defaultInstance, PARSER));
    }



/*
    static UnknownFieldSetLite access$5002(Builder builder, UnknownFieldSetLite unknownfieldsetlite)
    {
        builder.unknownFields = unknownfieldsetlite;
        return unknownfieldsetlite;
    }

*/


/*
    static Point access$5102(Point point, Point point1)
    {
        point.startPoint_ = point1;
        return point1;
    }

*/



/*
    static List access$5202(startPoint_ startpoint_, List list)
    {
        startpoint_.pathComponent_ = list;
        return list;
    }

*/



/*
    static List access$5302(pathComponent_ pathcomponent_, List list)
    {
        pathcomponent_.constraint_ = list;
        return list;
    }

*/


/*
    static int access$5402(constraint_ constraint_1, int i)
    {
        constraint_1.bitField0_ = i;
        return i;
    }

*/


    private Point(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
    {
        com.google.protobuf.uilder uilder;
        int i;
        boolean flag;
        memoizedIsInitialized = -1;
        memoizedSerializedSize = -1;
        pathComponent_ = Collections.emptyList();
        constraint_ = Collections.emptyList();
        i = 0;
        uilder = UnknownFieldSetLite.newBuilder();
        flag = false;
_L26:
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
        JVM INSTR lookupswitch 5: default 845
    //                   0: 848
    //                   10: 146
    //                   18: 355
    //                   24: 461
    //                   26: 598;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        k = i;
        j = i;
        l = i;
        if (!parseUnknownField(codedinputstream, uilder, extensionregistrylite, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        Point.Builder builder;
        builder = null;
        k = i;
        j = i;
        l = i;
        if ((bitField0_ & 1) != 1) goto _L10; else goto _L9
_L9:
        k = i;
        j = i;
        l = i;
        builder = startPoint_.toBuilder();
_L10:
        k = i;
        j = i;
        l = i;
        startPoint_ = (Point)codedinputstream.readMessage(Point.PARSER, extensionregistrylite);
        if (builder == null) goto _L12; else goto _L11
_L11:
        k = i;
        j = i;
        l = i;
        builder.mergeFrom(startPoint_);
        k = i;
        j = i;
        l = i;
        startPoint_ = builder.buildPartial();
_L12:
        k = i;
        j = i;
        l = i;
        bitField0_ = bitField0_ | 1;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        j = k;
        throw new RuntimeException(codedinputstream.setUnfinishedMessage(this));
        codedinputstream;
        if ((j & 2) == 2)
        {
            pathComponent_ = Collections.unmodifiableList(pathComponent_);
        }
        if ((j & 4) == 4)
        {
            constraint_ = Collections.unmodifiableList(constraint_);
        }
        unknownFields = uilder.build();
        throw codedinputstream;
_L6:
        i1 = i;
        if ((i & 2) == 2) goto _L14; else goto _L13
_L13:
        k = i;
        j = i;
        l = i;
        pathComponent_ = new ArrayList();
        i1 = i | 2;
_L14:
        k = i1;
        j = i1;
        l = i1;
        pathComponent_.add(codedinputstream.readMessage(PathComponent.PARSER, extensionregistrylite));
        i = i1;
        continue; /* Loop/switch isn't completed */
        codedinputstream;
        j = l;
        throw new RuntimeException((new InvalidProtocolBufferException(codedinputstream.getMessage())).setUnfinishedMessage(this));
_L7:
        k = i;
        j = i;
        l = i;
        int j1 = codedinputstream.readEnum();
        k = i;
        j = i;
        l = i;
        if (Constraint.valueOf(j1) != null) goto _L16; else goto _L15
_L15:
        k = i;
        j = i;
        l = i;
        uilder.mergeVarintField(3, j1);
        continue; /* Loop/switch isn't completed */
_L16:
        i1 = i;
        if ((i & 4) == 4) goto _L18; else goto _L17
_L17:
        k = i;
        j = i;
        l = i;
        constraint_ = new ArrayList();
        i1 = i | 4;
_L18:
        k = i1;
        j = i1;
        l = i1;
        constraint_.add(Integer.valueOf(j1));
        i = i1;
        continue; /* Loop/switch isn't completed */
_L8:
        k = i;
        j = i;
        l = i;
        j1 = codedinputstream.pushLimit(codedinputstream.readRawVarint32());
_L24:
        k = i;
        j = i;
        l = i;
        if (codedinputstream.getBytesUntilLimit() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        j = i;
        l = i;
        int k1 = codedinputstream.readEnum();
        k = i;
        j = i;
        l = i;
        if (Constraint.valueOf(k1) != null) goto _L20; else goto _L19
_L19:
        k = i;
        j = i;
        l = i;
        uilder.mergeVarintField(3, k1);
        continue; /* Loop/switch isn't completed */
_L20:
        i1 = i;
        if ((i & 4) == 4) goto _L22; else goto _L21
_L21:
        k = i;
        j = i;
        l = i;
        constraint_ = new ArrayList();
        i1 = i | 4;
_L22:
        k = i1;
        j = i1;
        l = i1;
        constraint_.add(Integer.valueOf(k1));
        i = i1;
        if (true) goto _L24; else goto _L23
_L23:
        k = i;
        j = i;
        l = i;
        codedinputstream.popLimit(j1);
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i & 2) == 2)
        {
            pathComponent_ = Collections.unmodifiableList(pathComponent_);
        }
        if ((i & 4) == 4)
        {
            constraint_ = Collections.unmodifiableList(constraint_);
        }
        unknownFields = uilder.build();
        return;
_L4:
        flag = true;
        if (true) goto _L26; else goto _L25
_L25:
    }

    unknownFields(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, unknownFields unknownfields)
    {
        this(codedinputstream, extensionregistrylite);
    }
}
