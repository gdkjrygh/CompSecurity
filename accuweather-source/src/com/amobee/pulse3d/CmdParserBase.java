// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            BufferViewIterator, BufferView, Pulse3DView, CommandBase

abstract class CmdParserBase
{
    public class GlArg
    {

        byte buffer[];
        float floatVal[];
        int handle;
        int intVal[];
        boolean isHandle;
        String stringVal;
        final CmdParserBase this$0;
        int type_;
        BufferView view;

        public GlArg()
        {
            this$0 = CmdParserBase.this;
            super();
            intVal = new int[16];
            floatVal = new float[16];
        }
    }

    static class JsArgType
    {

        public static final int ARRAY_OF_HANDLE = 13;
        public static final int JT_BYTE_BUFFER_HANDLE = 10;
        public static final int JT_FLOAT = 3;
        public static final int JT_FLOAT_BUFFER_HANDLE = 11;
        public static final int JT_INT = 2;
        public static final int JT_INT_BUFFER_HANDLE = 12;
        public static final int JT_MAT2 = 6;
        public static final int JT_MAT3 = 5;
        public static final int JT_MAT4 = 4;
        public static final int JT_NOARG = 0;
        public static final int JT_RETURNED_BYTE_ARRAY = 14;
        public static final int JT_STRING = 1;
        public static final int JT_VEC2 = 9;
        public static final int JT_VEC3 = 8;
        public static final int JT_VEC4 = 7;

        public static boolean isFloat(int i)
        {
            return i > 2 && i < 10;
        }

        JsArgType()
        {
        }
    }


    static final boolean $assertionsDisabled;
    static int GlTypeSize[] = {
        0, 4, 4, 4, 64, 36, 16, 16, 12, 8, 
        4, 4, 4, 4, 0
    };

    CmdParserBase()
    {
    }

    public abstract CommandBase parse(BufferViewIterator bufferviewiterator, Pulse3DView pulse3dview)
        throws InstantiationException, IllegalAccessException;

    void parseArgs(BufferViewIterator bufferviewiterator, int ai[], GlArg aglarg[])
    {
        int i = 0;
        while (i < ai.length) 
        {
            if (ai[i] != 14 && ai[i] != 13 && ai[i] != 0)
            {
                if (ai[i] == 1)
                {
                    GlArg glarg = new GlArg();
                    glarg.type_ = ai[i];
                    glarg.stringVal = bufferviewiterator.parseAlignedASCIIStringWithLength();
                    aglarg[i] = glarg;
                } else
                if (ai[i] == 12 || ai[i] == 11 || ai[i] == 10)
                {
                    int j = bufferviewiterator.parseInt();
                    GlArg glarg1 = new GlArg();
                    glarg1.type_ = ai[i];
                    if (j == 0)
                    {
                        glarg1.isHandle = false;
                        glarg1.buffer = bufferviewiterator.parseInt8BufferWithByteLength();
                        glarg1.view = new BufferView(glarg1.buffer);
                    } else
                    {
                        if (!$assertionsDisabled && j != 1)
                        {
                            throw new AssertionError();
                        }
                        glarg1.isHandle = true;
                        glarg1.handle = bufferviewiterator.parseInt();
                    }
                    aglarg[i] = glarg1;
                } else
                {
                    int k = GlTypeSize[ai[i]];
                    GlArg glarg2 = new GlArg();
                    glarg2.type_ = ai[i];
                    if (JsArgType.isFloat(ai[i]))
                    {
                        if (k == 4)
                        {
                            glarg2.floatVal[0] = bufferviewiterator.parseFloat();
                        } else
                        {
                            glarg2.floatVal = bufferviewiterator.parseFloatArray(k >> 2);
                        }
                    } else
                    if (k == 4)
                    {
                        glarg2.intVal[0] = bufferviewiterator.parseInt();
                    } else
                    {
                        glarg2.intVal = bufferviewiterator.parseIntArray(k >> 2);
                    }
                    aglarg[i] = glarg2;
                }
            }
            i++;
        }
    }

    static 
    {
        boolean flag;
        if (!com/amobee/pulse3d/CmdParserBase.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
