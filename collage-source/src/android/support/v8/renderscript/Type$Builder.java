// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Type, Element, RSInvalidStateException, RenderScript, 
//            RSIllegalArgumentException

public static class mElement
{

    boolean mDimFaces;
    boolean mDimMipmaps;
    int mDimX;
    int mDimY;
    int mDimZ;
    Element mElement;
    RenderScript mRS;
    int mYuv;

    public Type create()
    {
        if (mDimZ > 0)
        {
            if (mDimX < 1 || mDimY < 1)
            {
                throw new RSInvalidStateException("Both X and Y dimension required when Z is present.");
            }
            if (mDimFaces)
            {
                throw new RSInvalidStateException("Cube maps not supported with 3D types.");
            }
        }
        if (mDimY > 0 && mDimX < 1)
        {
            throw new RSInvalidStateException("X dimension required when Y is present.");
        }
        if (mDimFaces && mDimY < 1)
        {
            throw new RSInvalidStateException("Cube maps require 2D Types.");
        }
        if (mYuv != 0 && (mDimZ != 0 || mDimFaces || mDimMipmaps))
        {
            throw new RSInvalidStateException("YUV only supports basic 2D.");
        } else
        {
            Type type = new Type(mRS.nTypeCreate(mElement.getID(mRS), mDimX, mDimY, mDimZ, mDimMipmaps, mDimFaces, mYuv), mRS);
            type.mElement = mElement;
            type.mDimX = mDimX;
            type.mDimY = mDimY;
            type.mDimZ = mDimZ;
            type.mDimMipmaps = mDimMipmaps;
            type.mDimFaces = mDimFaces;
            type.mDimYuv = mYuv;
            type.calcElementCount();
            return type;
        }
    }

    public entCount setFaces(boolean flag)
    {
        mDimFaces = flag;
        return this;
    }

    public mDimFaces setMipmaps(boolean flag)
    {
        mDimMipmaps = flag;
        return this;
    }

    public mDimMipmaps setX(int i)
    {
        if (i < 1)
        {
            throw new RSIllegalArgumentException("Values of less than 1 for Dimension X are not valid.");
        } else
        {
            mDimX = i;
            return this;
        }
    }

    public mDimX setY(int i)
    {
        if (i < 1)
        {
            throw new RSIllegalArgumentException("Values of less than 1 for Dimension Y are not valid.");
        } else
        {
            mDimY = i;
            return this;
        }
    }

    public mDimY setYuvFormat(int i)
    {
        switch (i)
        {
        default:
            throw new RSIllegalArgumentException("Only NV21 and YV12 are supported..");

        case 17: // '\021'
        case 842094169: 
            mYuv = i;
            break;
        }
        return this;
    }

    public mYuv setZ(int i)
    {
        if (i < 1)
        {
            throw new RSIllegalArgumentException("Values of less than 1 for Dimension Z are not valid.");
        } else
        {
            mDimZ = i;
            return this;
        }
    }

    public mentException(RenderScript renderscript, Element element)
    {
        mDimX = 1;
        element.checkValid();
        mRS = renderscript;
        mElement = element;
    }
}
