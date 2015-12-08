// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BufferType, Pulse3DView, Log, 
//            BufferResource, Pulse3DJavaScriptInterface, BufferViewIterator

class DeclareBufferFromData extends NativeCommandProcessor
{

    int byteLength_;
    int byteOffset_;
    int handle_;
    BufferType type_;
    Pulse3DView viewController_;

    DeclareBufferFromData(Pulse3DView pulse3dview, BufferType buffertype)
    {
        viewController_ = pulse3dview;
        type_ = buffertype;
        handle_ = 0;
    }

    void execute()
    {
        int i;
        if (type_ != BufferType.INDEX_BUFFER)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        i = 0;
        Object obj2 = viewController_.resources.get(handle_);
        Object obj = null;
        byte abyte0[] = new byte[byteLength_];
        if (!(obj2 instanceof float[])) goto _L2; else goto _L1
_L1:
        Log.d("BinInterpreter", "im a float array!");
_L3:
        int j;
        abyte0 = new BufferResource();
        abyte0.o = obj;
        viewController_.resources.add(abyte0);
        j = viewController_.resources.indexOf(abyte0);
        i = j;
_L4:
        viewController_.jsInterface3D.reportBackToJS(serial_, true, (new StringBuilder()).append("").append(i).toString());
        return;
_L2:
label0:
        {
            if (!(obj2 instanceof short[]))
            {
                break label0;
            }
            abyte0 = (short[])(short[])obj2;
            obj = ByteBuffer.allocateDirect(abyte0.length * 2);
            ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
            obj = ((ByteBuffer) (obj)).asShortBuffer();
            ((ShortBuffer) (obj)).put(abyte0);
            ((ShortBuffer) (obj)).position(0);
        }
          goto _L3
        System.arraycopy((byte[])(byte[])obj2, byteOffset_, abyte0, 0, byteLength_);
        obj = ByteBuffer.allocateDirect(byteLength_);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        ((ByteBuffer) (obj)).put(abyte0);
        ((ByteBuffer) (obj)).position(0);
        obj = ((ByteBuffer) (obj)).asShortBuffer();
        ((ShortBuffer) (obj)).position(0);
          goto _L3
        Exception exception;
        exception;
        Log.e("BinInterpreter", (new StringBuilder()).append("declareIBFromData").append(exception.getMessage()).toString());
          goto _L4
        i = 0;
        Object obj1 = viewController_.resources.get(handle_);
        exception = null;
        if (!(obj1 instanceof float[])) goto _L6; else goto _L5
_L5:
        obj1 = (float[])(float[])obj1;
        exception = ByteBuffer.allocateDirect(obj1.length * 4);
        exception.order(ByteOrder.nativeOrder());
        exception = exception.asFloatBuffer();
        exception.put(((float []) (obj1)));
        exception.position(0);
_L7:
        obj1 = new BufferResource();
        obj1.o = exception;
        viewController_.resources.add(obj1);
        j = viewController_.resources.indexOf(obj1);
        i = j;
_L8:
        viewController_.jsInterface3D.reportBackToJS(serial_, true, (new StringBuilder()).append("").append(i).toString());
        return;
_L6:
        if (!(obj1 instanceof short[]))
        {
            break MISSING_BLOCK_LABEL_467;
        }
        Log.d("BinInterpreter", "im a shorts array!");
          goto _L7
        exception;
        Log.e("BinInterpreter", (new StringBuilder()).append("declareIBFromData").append(exception.getMessage()).toString());
          goto _L8
        exception = new byte[byteLength_];
        System.arraycopy((byte[])(byte[])obj1, byteOffset_, exception, 0, byteLength_);
        obj1 = ByteBuffer.allocateDirect(byteLength_);
        ((ByteBuffer) (obj1)).order(ByteOrder.nativeOrder());
        ((ByteBuffer) (obj1)).put(exception);
        ((ByteBuffer) (obj1)).position(0);
        exception = ((ByteBuffer) (obj1)).asFloatBuffer();
        exception.position(0);
          goto _L7
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        handle_ = bufferviewiterator.parseInt();
        byteOffset_ = bufferviewiterator.parseInt();
        byteLength_ = bufferviewiterator.parseInt();
    }
}
