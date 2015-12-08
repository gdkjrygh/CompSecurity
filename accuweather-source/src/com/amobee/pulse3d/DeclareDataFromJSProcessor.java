// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DJavaScriptInterface, BufferViewIterator

class DeclareDataFromJSProcessor extends NativeCommandProcessor
{

    static final boolean $assertionsDisabled;
    int arraySize_;
    float floatData_[];
    short uInt16data_[];
    int uInt32data_[];
    byte uInt8data_[];
    Pulse3DView viewController_;

    public DeclareDataFromJSProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
        uInt8data_ = null;
        uInt16data_ = null;
        uInt32data_ = null;
        floatData_ = null;
    }

    void execute()
    {
        float af[] = null;
        if (floatData_ == null) goto _L2; else goto _L1
_L1:
        if (!$assertionsDisabled && arraySize_ != floatData_.length)
        {
            throw new AssertionError();
        }
        af = floatData_;
_L4:
        viewController_.resources.add(af);
        int i = viewController_.resources.indexOf(af);
        viewController_.jsInterface3D.reportBackToJS(serial_, true, (new StringBuilder()).append("").append(i).toString());
        return;
_L2:
        if (uInt8data_ != null)
        {
            if (!$assertionsDisabled && arraySize_ != uInt8data_.length)
            {
                throw new AssertionError();
            }
            af = uInt8data_;
        } else
        if (uInt16data_ != null)
        {
            if (!$assertionsDisabled && arraySize_ != uInt16data_.length)
            {
                throw new AssertionError();
            }
            af = uInt16data_;
        } else
        if (uInt32data_ != null)
        {
            if (!$assertionsDisabled && arraySize_ != uInt32data_.length)
            {
                throw new AssertionError();
            }
            af = uInt32data_;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void parse(BufferViewIterator bufferviewiterator)
    {
        int i = bufferviewiterator.parseInt();
        uInt8data_ = null;
        uInt16data_ = null;
        uInt32data_ = null;
        floatData_ = null;
        if (i == 32)
        {
            floatData_ = bufferviewiterator.parseFloatBufferWithByteLength();
            arraySize_ = floatData_.length;
        } else
        {
            if (i == 16)
            {
                uInt16data_ = bufferviewiterator.parseInt16BufferWithByteLength();
                arraySize_ = uInt16data_.length;
                return;
            }
            if (i == 31)
            {
                uInt32data_ = bufferviewiterator.parseIntBufferWithByteLength();
                arraySize_ = uInt32data_.length;
                return;
            }
            if (i == 8)
            {
                uInt8data_ = bufferviewiterator.parseInt8BufferWithByteLength();
                arraySize_ = uInt8data_.length;
                return;
            }
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
        }
    }

    static 
    {
        boolean flag;
        if (!com/amobee/pulse3d/DeclareDataFromJSProcessor.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
