// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, RSIllegalArgumentException, Type, Element, 
//            RenderScript, RSRuntimeException, RSInvalidStateException, FieldPacker

public class Allocation extends BaseObj
{
    public static final class MipmapControl extends Enum
    {

        private static final MipmapControl $VALUES[];
        public static final MipmapControl MIPMAP_FULL;
        public static final MipmapControl MIPMAP_NONE;
        public static final MipmapControl MIPMAP_ON_SYNC_TO_TEXTURE;
        int mID;

        public static MipmapControl valueOf(String s)
        {
            return (MipmapControl)Enum.valueOf(android/support/v8/renderscript/Allocation$MipmapControl, s);
        }

        public static MipmapControl[] values()
        {
            return (MipmapControl[])$VALUES.clone();
        }

        static 
        {
            MIPMAP_NONE = new MipmapControl("MIPMAP_NONE", 0, 0);
            MIPMAP_FULL = new MipmapControl("MIPMAP_FULL", 1, 1);
            MIPMAP_ON_SYNC_TO_TEXTURE = new MipmapControl("MIPMAP_ON_SYNC_TO_TEXTURE", 2, 2);
            $VALUES = (new MipmapControl[] {
                MIPMAP_NONE, MIPMAP_FULL, MIPMAP_ON_SYNC_TO_TEXTURE
            });
        }

        private MipmapControl(String s, int i, int j)
        {
            super(s, i);
            mID = j;
        }
    }


    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_SHARED = 128;
    static android.graphics.BitmapFactory.Options mBitmapOptions;
    Allocation mAdaptedAllocation;
    boolean mAutoPadding;
    Bitmap mBitmap;
    boolean mConstrainedFace;
    boolean mConstrainedLOD;
    boolean mConstrainedY;
    boolean mConstrainedZ;
    int mCurrentCount;
    int mCurrentDimX;
    int mCurrentDimY;
    int mCurrentDimZ;
    boolean mIncAllocDestroyed;
    long mIncCompatAllocation;
    boolean mReadAllowed;
    Type.CubemapFace mSelectedFace;
    int mSelectedLOD;
    int mSelectedY;
    int mSelectedZ;
    int mSize;
    Type mType;
    int mUsage;
    boolean mWriteAllowed;

    Allocation(long l, RenderScript renderscript, Type type, int i)
    {
        super(l, renderscript);
        mReadAllowed = true;
        mWriteAllowed = true;
        mAutoPadding = false;
        mSelectedFace = Type.CubemapFace.POSITIVE_X;
        if ((i & 0xffffff1c) != 0)
        {
            throw new RSIllegalArgumentException("Unknown usage specified.");
        }
        if ((i & 0x20) != 0)
        {
            mWriteAllowed = false;
            if ((i & 0xffffffdc) != 0)
            {
                throw new RSIllegalArgumentException("Invalid usage combination.");
            }
        }
        mType = type;
        mUsage = i;
        mIncCompatAllocation = 0L;
        mIncAllocDestroyed = false;
        if (type != null)
        {
            mSize = mType.getCount() * mType.getElement().getBytesSize();
            updateCacheInfo(type);
        }
        if (!RenderScript.sUseGCHooks)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, new Object[] {
            Integer.valueOf(mSize)
        });
        return;
        renderscript;
        Log.e("RenderScript_jni", (new StringBuilder()).append("Couldn't invoke registerNativeAllocation:").append(renderscript).toString());
        throw new RSRuntimeException((new StringBuilder()).append("Couldn't invoke registerNativeAllocation:").append(renderscript).toString());
    }

    private void copy1DRangeFromUnchecked(int i, int j, Object obj, Element.DataType datatype, int k)
    {
        int l = mType.mElement.getBytesSize() * j;
        boolean flag1 = false;
        boolean flag = flag1;
        if (mAutoPadding)
        {
            flag = flag1;
            if (mType.getElement().getVectorSize() == 3)
            {
                flag = true;
            }
        }
        data1DChecks(i, j, k * datatype.mSize, l, flag);
        mRS.nAllocationData1D(getIDSafe(), i, mSelectedLOD, j, obj, l, datatype, mType.mElement.mType.mSize, flag);
    }

    private void copy1DRangeToUnchecked(int i, int j, Object obj, Element.DataType datatype, int k)
    {
        int l = mType.mElement.getBytesSize() * j;
        boolean flag1 = false;
        boolean flag = flag1;
        if (mAutoPadding)
        {
            flag = flag1;
            if (mType.getElement().getVectorSize() == 3)
            {
                flag = true;
            }
        }
        data1DChecks(i, j, k * datatype.mSize, l, flag);
        mRS.nAllocationRead1D(getIDSafe(), i, mSelectedLOD, j, obj, l, datatype, mType.mElement.mType.mSize, flag);
    }

    private void copy3DRangeFromUnchecked(int i, int j, int k, int l, int i1, int j1, Object obj, 
            Element.DataType datatype, int k1)
    {
        mRS.validate();
        validate3DRange(i, j, k, l, i1, j1);
        int l1 = mType.mElement.getBytesSize() * l * i1 * j1;
        boolean flag = false;
        k1 = datatype.mSize * k1;
        if (mAutoPadding && mType.getElement().getVectorSize() == 3)
        {
            if ((l1 / 4) * 3 > k1)
            {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            flag = true;
            k1 = l1;
        } else
        if (l1 > k1)
        {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        mRS.nAllocationData3D(getIDSafe(), i, j, k, mSelectedLOD, l, i1, j1, obj, k1, datatype, mType.mElement.mType.mSize, flag);
    }

    private void copyFromUnchecked(Object obj, Element.DataType datatype, int i)
    {
        mRS.validate();
        if (mCurrentDimZ > 0)
        {
            copy3DRangeFromUnchecked(0, 0, 0, mCurrentDimX, mCurrentDimY, mCurrentDimZ, obj, datatype, i);
            return;
        }
        if (mCurrentDimY > 0)
        {
            copy2DRangeFromUnchecked(0, 0, mCurrentDimX, mCurrentDimY, obj, datatype, i);
            return;
        } else
        {
            copy1DRangeFromUnchecked(0, mCurrentCount, obj, datatype, i);
            return;
        }
    }

    private void copyTo(Object obj, Element.DataType datatype, int i)
    {
        mRS.validate();
        boolean flag1 = false;
        boolean flag = flag1;
        if (mAutoPadding)
        {
            flag = flag1;
            if (mType.getElement().getVectorSize() == 3)
            {
                flag = true;
            }
        }
        if (flag)
        {
            if (datatype.mSize * i < (mSize / 4) * 3)
            {
                throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
            }
        } else
        if (datatype.mSize * i < mSize)
        {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
        }
        mRS.nAllocationRead(getID(mRS), obj, datatype, mType.mElement.mType.mSize, flag);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderscript, Bitmap bitmap)
    {
        return createCubemapFromBitmap(renderscript, bitmap, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderscript, Bitmap bitmap, MipmapControl mipmapcontrol, int i)
    {
        boolean flag1 = true;
        renderscript.validate();
        int k = bitmap.getHeight();
        int j = bitmap.getWidth();
        if (j % 6 != 0)
        {
            throw new RSIllegalArgumentException("Cubemap height must be multiple of 6");
        }
        if (j / 6 != k)
        {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
        }
        boolean flag;
        if ((k - 1 & k) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
        }
        Element element = elementFromBitmap(renderscript, bitmap);
        Object obj = new Type.Builder(renderscript, element);
        ((Type.Builder) (obj)).setX(k);
        ((Type.Builder) (obj)).setY(k);
        ((Type.Builder) (obj)).setFaces(true);
        long l;
        if (mipmapcontrol != MipmapControl.MIPMAP_FULL)
        {
            flag1 = false;
        }
        ((Type.Builder) (obj)).setMipmaps(flag1);
        obj = ((Type.Builder) (obj)).create();
        l = renderscript.nAllocationCubeCreateFromBitmap(((Type) (obj)).getID(renderscript), mipmapcontrol.mID, bitmap, i);
        if (l == 0L)
        {
            throw new RSRuntimeException((new StringBuilder()).append("Load failed for bitmap ").append(bitmap).append(" element ").append(element).toString());
        } else
        {
            return new Allocation(l, renderscript, ((Type) (obj)), i);
        }
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderscript, Bitmap bitmap, Bitmap bitmap1, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5)
    {
        return createCubemapFromCubeFaces(renderscript, bitmap, bitmap1, bitmap2, bitmap3, bitmap4, bitmap5, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderscript, Bitmap bitmap, Bitmap bitmap1, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, MipmapControl mipmapcontrol, 
            int i)
    {
        return null;
    }

    public static Allocation createFromBitmap(RenderScript renderscript, Bitmap bitmap)
    {
        return createFromBitmap(renderscript, bitmap, MipmapControl.MIPMAP_NONE, 131);
    }

    public static Allocation createFromBitmap(RenderScript renderscript, Bitmap bitmap, MipmapControl mipmapcontrol, int i)
    {
        renderscript.validate();
        if (bitmap.getConfig() == null)
        {
            if ((i & 0x80) != 0)
            {
                throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
            } else
            {
                Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                (new Canvas(bitmap1)).drawBitmap(bitmap, 0.0F, 0.0F, null);
                return createFromBitmap(renderscript, bitmap1, mipmapcontrol, i);
            }
        }
        Type type = typeFromBitmap(renderscript, bitmap, mipmapcontrol);
        if (mipmapcontrol == MipmapControl.MIPMAP_NONE && type.getElement().isCompatible(Element.RGBA_8888(renderscript)) && i == 131)
        {
            long l = renderscript.nAllocationCreateBitmapBackedAllocation(type.getID(renderscript), mipmapcontrol.mID, bitmap, i);
            if (l == 0L)
            {
                throw new RSRuntimeException("Load failed.");
            } else
            {
                renderscript = new Allocation(l, renderscript, type, i);
                renderscript.setBitmap(bitmap);
                return renderscript;
            }
        }
        long l1 = renderscript.nAllocationCreateFromBitmap(type.getID(renderscript), mipmapcontrol.mID, bitmap, i);
        if (l1 == 0L)
        {
            throw new RSRuntimeException("Load failed.");
        } else
        {
            return new Allocation(l1, renderscript, type, i);
        }
    }

    public static Allocation createFromBitmapResource(RenderScript renderscript, Resources resources, int i)
    {
        return createFromBitmapResource(renderscript, resources, i, MipmapControl.MIPMAP_NONE, 3);
    }

    public static Allocation createFromBitmapResource(RenderScript renderscript, Resources resources, int i, MipmapControl mipmapcontrol, int j)
    {
        renderscript.validate();
        if ((j & 0xe0) != 0)
        {
            throw new RSIllegalArgumentException("Unsupported usage specified.");
        } else
        {
            resources = BitmapFactory.decodeResource(resources, i);
            renderscript = createFromBitmap(renderscript, resources, mipmapcontrol, j);
            resources.recycle();
            return renderscript;
        }
    }

    public static Allocation createFromString(RenderScript renderscript, String s, int i)
    {
        renderscript.validate();
        try
        {
            s = s.getBytes("UTF-8");
            renderscript = createSized(renderscript, Element.U8(renderscript), s.length, i);
            renderscript.copyFrom(s);
        }
        // Misplaced declaration of an exception variable
        catch (RenderScript renderscript)
        {
            throw new RSRuntimeException("Could not convert string to utf-8.");
        }
        return renderscript;
    }

    public static Allocation createSized(RenderScript renderscript, Element element, int i)
    {
        return createSized(renderscript, element, i, 1);
    }

    public static Allocation createSized(RenderScript renderscript, Element element, int i, int j)
    {
        renderscript.validate();
        element = new Type.Builder(renderscript, element);
        element.setX(i);
        element = element.create();
        long l = renderscript.nAllocationCreateTyped(element.getID(renderscript), MipmapControl.MIPMAP_NONE.mID, j, 0L);
        if (l == 0L)
        {
            throw new RSRuntimeException("Allocation creation failed.");
        } else
        {
            return new Allocation(l, renderscript, element, j);
        }
    }

    public static Allocation createTyped(RenderScript renderscript, Type type)
    {
        return createTyped(renderscript, type, MipmapControl.MIPMAP_NONE, 1);
    }

    public static Allocation createTyped(RenderScript renderscript, Type type, int i)
    {
        return createTyped(renderscript, type, MipmapControl.MIPMAP_NONE, i);
    }

    public static Allocation createTyped(RenderScript renderscript, Type type, MipmapControl mipmapcontrol, int i)
    {
        renderscript.validate();
        if (type.getID(renderscript) == 0L)
        {
            throw new RSInvalidStateException("Bad Type");
        }
        if (!renderscript.usingIO() && (i & 0x20) != 0)
        {
            throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
        }
        long l = renderscript.nAllocationCreateTyped(type.getID(renderscript), mipmapcontrol.mID, i, 0L);
        if (l == 0L)
        {
            throw new RSRuntimeException("Allocation creation failed.");
        } else
        {
            return new Allocation(l, renderscript, type, i);
        }
    }

    private void data1DChecks(int i, int j, int k, int l, boolean flag)
    {
        mRS.validate();
        if (i < 0)
        {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
        if (j < 1)
        {
            throw new RSIllegalArgumentException("Count must be >= 1.");
        }
        if (i + j > mCurrentCount)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Overflow, Available count ").append(mCurrentCount).append(", got ").append(j).append(" at offset ").append(i).append(".").toString());
        }
        if (flag)
        {
            if (k < (l / 4) * 3)
            {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else
        if (k < l)
        {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
    }

    static Element elementFromBitmap(RenderScript renderscript, Bitmap bitmap)
    {
        bitmap = bitmap.getConfig();
        if (bitmap == android.graphics.Bitmap.Config.ALPHA_8)
        {
            return Element.A_8(renderscript);
        }
        if (bitmap == android.graphics.Bitmap.Config.ARGB_4444)
        {
            return Element.RGBA_4444(renderscript);
        }
        if (bitmap == android.graphics.Bitmap.Config.ARGB_8888)
        {
            return Element.RGBA_8888(renderscript);
        }
        if (bitmap == android.graphics.Bitmap.Config.RGB_565)
        {
            return Element.RGB_565(renderscript);
        } else
        {
            throw new RSInvalidStateException((new StringBuilder()).append("Bad bitmap type: ").append(bitmap).toString());
        }
    }

    private long getIDSafe()
    {
        if (mAdaptedAllocation != null)
        {
            return mAdaptedAllocation.getID(mRS);
        } else
        {
            return getID(mRS);
        }
    }

    private void setBitmap(Bitmap bitmap)
    {
        mBitmap = bitmap;
    }

    static Type typeFromBitmap(RenderScript renderscript, Bitmap bitmap, MipmapControl mipmapcontrol)
    {
        renderscript = new Type.Builder(renderscript, elementFromBitmap(renderscript, bitmap));
        renderscript.setX(bitmap.getWidth());
        renderscript.setY(bitmap.getHeight());
        boolean flag;
        if (mipmapcontrol == MipmapControl.MIPMAP_FULL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        renderscript.setMipmaps(flag);
        return renderscript.create();
    }

    private void updateCacheInfo(Type type)
    {
        mCurrentDimX = type.getX();
        mCurrentDimY = type.getY();
        mCurrentDimZ = type.getZ();
        mCurrentCount = mCurrentDimX;
        if (mCurrentDimY > 1)
        {
            mCurrentCount = mCurrentCount * mCurrentDimY;
        }
        if (mCurrentDimZ > 1)
        {
            mCurrentCount = mCurrentCount * mCurrentDimZ;
        }
    }

    private void validate2DRange(int i, int j, int k, int l)
    {
        if (mAdaptedAllocation == null)
        {
            if (i < 0 || j < 0)
            {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            }
            if (l < 0 || k < 0)
            {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            }
            if (i + k > mCurrentDimX || j + l > mCurrentDimY)
            {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }

    private void validate3DRange(int i, int j, int k, int l, int i1, int j1)
    {
        if (mAdaptedAllocation == null)
        {
            if (i < 0 || j < 0 || k < 0)
            {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            }
            if (i1 < 0 || l < 0 || j1 < 0)
            {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            }
            if (i + l > mCurrentDimX || j + i1 > mCurrentDimY || k + j1 > mCurrentDimZ)
            {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }

    private void validateBitmapFormat(Bitmap bitmap)
    {
        bitmap = bitmap.getConfig();
        if (bitmap == null)
        {
            throw new RSIllegalArgumentException("Bitmap has an unsupported format for this operation");
        }
        static class _cls1
        {

            static final int $SwitchMap$android$graphics$Bitmap$Config[];

            static 
            {
                $SwitchMap$android$graphics$Bitmap$Config = new int[android.graphics.Bitmap.Config.values().length];
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.android.graphics.Bitmap.Config[bitmap.ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 61
    //                   2 162
    //                   3 277
    //                   4 392;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        if (mType.getElement().mKind != Element.DataKind.PIXEL_A)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Allocation kind is ").append(mType.getElement().mKind).append(", type ").append(mType.getElement().mType).append(" of ").append(mType.getElement().getBytesSize()).append(" bytes, passed bitmap was ").append(bitmap).toString());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || mType.getElement().getBytesSize() != 4)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Allocation kind is ").append(mType.getElement().mKind).append(", type ").append(mType.getElement().mType).append(" of ").append(mType.getElement().getBytesSize()).append(" bytes, passed bitmap was ").append(bitmap).toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mType.getElement().mKind != Element.DataKind.PIXEL_RGB || mType.getElement().getBytesSize() != 2)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Allocation kind is ").append(mType.getElement().mKind).append(", type ").append(mType.getElement().mType).append(" of ").append(mType.getElement().getBytesSize()).append(" bytes, passed bitmap was ").append(bitmap).toString());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || mType.getElement().getBytesSize() != 2)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Allocation kind is ").append(mType.getElement().mKind).append(", type ").append(mType.getElement().mType).append(" of ").append(mType.getElement().getBytesSize()).append(" bytes, passed bitmap was ").append(bitmap).toString());
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void validateBitmapSize(Bitmap bitmap)
    {
        if (mCurrentDimX != bitmap.getWidth() || mCurrentDimY != bitmap.getHeight())
        {
            throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
        } else
        {
            return;
        }
    }

    private void validateIsFloat32()
    {
        if (mType.mElement.mType == Element.DataType.FLOAT_32)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("32 bit float source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private void validateIsFloat64()
    {
        if (mType.mElement.mType == Element.DataType.FLOAT_64)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("64 bit float source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private void validateIsInt16()
    {
        if (mType.mElement.mType == Element.DataType.SIGNED_16 || mType.mElement.mType == Element.DataType.UNSIGNED_16)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("16 bit integer source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private void validateIsInt32()
    {
        if (mType.mElement.mType == Element.DataType.SIGNED_32 || mType.mElement.mType == Element.DataType.UNSIGNED_32)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("32 bit integer source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private void validateIsInt64()
    {
        if (mType.mElement.mType == Element.DataType.SIGNED_64 || mType.mElement.mType == Element.DataType.UNSIGNED_64)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("64 bit integer source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private void validateIsInt8()
    {
        if (mType.mElement.mType == Element.DataType.SIGNED_8 || mType.mElement.mType == Element.DataType.UNSIGNED_8)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("8 bit integer source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private void validateIsObject()
    {
        if (mType.mElement.mType == Element.DataType.RS_ELEMENT || mType.mElement.mType == Element.DataType.RS_TYPE || mType.mElement.mType == Element.DataType.RS_ALLOCATION || mType.mElement.mType == Element.DataType.RS_SAMPLER || mType.mElement.mType == Element.DataType.RS_SCRIPT)
        {
            return;
        } else
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Object source does not match allocation type ").append(mType.mElement.mType).toString());
        }
    }

    private Element.DataType validateObjectIsPrimitiveArray(Object obj, boolean flag)
    {
        obj = obj.getClass();
        if (!((Class) (obj)).isArray())
        {
            throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
        }
        obj = ((Class) (obj)).getComponentType();
        if (!((Class) (obj)).isPrimitive())
        {
            throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
        }
        if (obj == Long.TYPE)
        {
            if (flag)
            {
                validateIsInt64();
                return mType.mElement.mType;
            } else
            {
                return Element.DataType.SIGNED_64;
            }
        }
        if (obj == Integer.TYPE)
        {
            if (flag)
            {
                validateIsInt32();
                return mType.mElement.mType;
            } else
            {
                return Element.DataType.SIGNED_32;
            }
        }
        if (obj == Short.TYPE)
        {
            if (flag)
            {
                validateIsInt16();
                return mType.mElement.mType;
            } else
            {
                return Element.DataType.SIGNED_16;
            }
        }
        if (obj == Byte.TYPE)
        {
            if (flag)
            {
                validateIsInt8();
                return mType.mElement.mType;
            } else
            {
                return Element.DataType.SIGNED_8;
            }
        }
        if (obj == Float.TYPE)
        {
            if (flag)
            {
                validateIsFloat32();
            }
            return Element.DataType.FLOAT_32;
        }
        if (obj == Double.TYPE)
        {
            if (flag)
            {
                validateIsFloat64();
            }
            return Element.DataType.FLOAT_64;
        } else
        {
            return null;
        }
    }

    public void copy1DRangeFrom(int i, int j, Allocation allocation, int k)
    {
        mRS.nAllocationData2D(getIDSafe(), i, 0, mSelectedLOD, mSelectedFace.mID, j, 1, allocation.getID(mRS), k, 0, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }

    public void copy1DRangeFrom(int i, int j, Object obj)
    {
        copy1DRangeFromUnchecked(i, j, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeFrom(int i, int j, byte abyte0[])
    {
        validateIsInt8();
        copy1DRangeFromUnchecked(i, j, abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copy1DRangeFrom(int i, int j, float af[])
    {
        validateIsFloat32();
        copy1DRangeFromUnchecked(i, j, af, Element.DataType.FLOAT_32, af.length);
    }

    public void copy1DRangeFrom(int i, int j, int ai[])
    {
        validateIsInt32();
        copy1DRangeFromUnchecked(i, j, ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copy1DRangeFrom(int i, int j, short aword0[])
    {
        validateIsInt16();
        copy1DRangeFromUnchecked(i, j, aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copy1DRangeFromUnchecked(int i, int j, Object obj)
    {
        copy1DRangeFromUnchecked(i, j, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeFromUnchecked(int i, int j, byte abyte0[])
    {
        copy1DRangeFromUnchecked(i, j, abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copy1DRangeFromUnchecked(int i, int j, float af[])
    {
        copy1DRangeFromUnchecked(i, j, af, Element.DataType.FLOAT_32, af.length);
    }

    public void copy1DRangeFromUnchecked(int i, int j, int ai[])
    {
        copy1DRangeFromUnchecked(i, j, ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copy1DRangeFromUnchecked(int i, int j, short aword0[])
    {
        copy1DRangeFromUnchecked(i, j, aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copy1DRangeTo(int i, int j, Object obj)
    {
        copy1DRangeToUnchecked(i, j, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i, int j, byte abyte0[])
    {
        validateIsInt8();
        copy1DRangeToUnchecked(i, j, abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copy1DRangeTo(int i, int j, float af[])
    {
        validateIsFloat32();
        copy1DRangeToUnchecked(i, j, af, Element.DataType.FLOAT_32, af.length);
    }

    public void copy1DRangeTo(int i, int j, int ai[])
    {
        validateIsInt32();
        copy1DRangeToUnchecked(i, j, ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copy1DRangeTo(int i, int j, short aword0[])
    {
        validateIsInt16();
        copy1DRangeToUnchecked(i, j, aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copy1DRangeToUnchecked(int i, int j, Object obj)
    {
        copy1DRangeToUnchecked(i, j, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeToUnchecked(int i, int j, byte abyte0[])
    {
        copy1DRangeToUnchecked(i, j, abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copy1DRangeToUnchecked(int i, int j, float af[])
    {
        copy1DRangeToUnchecked(i, j, af, Element.DataType.FLOAT_32, af.length);
    }

    public void copy1DRangeToUnchecked(int i, int j, int ai[])
    {
        copy1DRangeToUnchecked(i, j, ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copy1DRangeToUnchecked(int i, int j, short aword0[])
    {
        copy1DRangeToUnchecked(i, j, aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, Allocation allocation, int i1, int j1)
    {
        mRS.validate();
        validate2DRange(i, j, k, l);
        mRS.nAllocationData2D(getIDSafe(), i, j, mSelectedLOD, mSelectedFace.mID, k, l, allocation.getID(mRS), i1, j1, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, Object obj)
    {
        copy2DRangeFromUnchecked(i, j, k, l, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, byte abyte0[])
    {
        validateIsInt8();
        copy2DRangeFromUnchecked(i, j, k, l, abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, float af[])
    {
        validateIsFloat32();
        copy2DRangeFromUnchecked(i, j, k, l, af, Element.DataType.FLOAT_32, af.length);
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, int ai[])
    {
        validateIsInt32();
        copy2DRangeFromUnchecked(i, j, k, l, ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copy2DRangeFrom(int i, int j, int k, int l, short aword0[])
    {
        validateIsInt16();
        copy2DRangeFromUnchecked(i, j, k, l, aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copy2DRangeFrom(int i, int j, Bitmap bitmap)
    {
        mRS.validate();
        if (bitmap.getConfig() == null)
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap1)).drawBitmap(bitmap, 0.0F, 0.0F, null);
            copy2DRangeFrom(i, j, bitmap1);
            return;
        } else
        {
            validateBitmapFormat(bitmap);
            validate2DRange(i, j, bitmap.getWidth(), bitmap.getHeight());
            mRS.nAllocationData2D(getIDSafe(), i, j, mSelectedLOD, mSelectedFace.mID, bitmap);
            return;
        }
    }

    void copy2DRangeFromUnchecked(int i, int j, int k, int l, Object obj, Element.DataType datatype, int i1)
    {
        mRS.validate();
        validate2DRange(i, j, k, l);
        int j1 = mType.mElement.getBytesSize() * k * l;
        boolean flag = false;
        i1 = datatype.mSize * i1;
        if (mAutoPadding && mType.getElement().getVectorSize() == 3)
        {
            if ((j1 / 4) * 3 > i1)
            {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            flag = true;
            i1 = j1;
        } else
        if (j1 > i1)
        {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        mRS.nAllocationData2D(getIDSafe(), i, j, mSelectedLOD, mSelectedFace.mID, k, l, obj, i1, datatype, mType.mElement.mType.mSize, flag);
    }

    public void copy2DRangeTo(int i, int j, int k, int l, Object obj)
    {
        copy2DRangeToUnchecked(i, j, k, l, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeTo(int i, int j, int k, int l, byte abyte0[])
    {
        validateIsInt8();
        copy2DRangeToUnchecked(i, j, k, l, abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copy2DRangeTo(int i, int j, int k, int l, float af[])
    {
        validateIsFloat32();
        copy2DRangeToUnchecked(i, j, k, l, af, Element.DataType.FLOAT_32, af.length);
    }

    public void copy2DRangeTo(int i, int j, int k, int l, int ai[])
    {
        validateIsInt32();
        copy2DRangeToUnchecked(i, j, k, l, ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copy2DRangeTo(int i, int j, int k, int l, short aword0[])
    {
        validateIsInt16();
        copy2DRangeToUnchecked(i, j, k, l, aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    void copy2DRangeToUnchecked(int i, int j, int k, int l, Object obj, Element.DataType datatype, int i1)
    {
        mRS.validate();
        validate2DRange(i, j, k, l);
        int j1 = mType.mElement.getBytesSize() * k * l;
        boolean flag = false;
        i1 = datatype.mSize * i1;
        if (mAutoPadding && mType.getElement().getVectorSize() == 3)
        {
            if ((j1 / 4) * 3 > i1)
            {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            flag = true;
            i1 = j1;
        } else
        if (j1 > i1)
        {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        mRS.nAllocationRead2D(getIDSafe(), i, j, mSelectedLOD, mSelectedFace.mID, k, l, obj, i1, datatype, mType.mElement.mType.mSize, flag);
    }

    public void copy3DRangeFrom(int i, int j, int k, int l, int i1, int j1, Allocation allocation, 
            int k1, int l1, int i2)
    {
        mRS.validate();
        validate3DRange(i, j, k, l, i1, j1);
        mRS.nAllocationData3D(getIDSafe(), i, j, k, mSelectedLOD, l, i1, j1, allocation.getID(mRS), k1, l1, i2, allocation.mSelectedLOD);
    }

    public void copy3DRangeFrom(int i, int j, int k, int l, int i1, int j1, Object obj)
    {
        copy3DRangeFromUnchecked(i, j, k, l, i1, j1, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyFrom(Bitmap bitmap)
    {
        mRS.validate();
        if (bitmap.getConfig() == null)
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap1)).drawBitmap(bitmap, 0.0F, 0.0F, null);
            copyFrom(bitmap1);
            return;
        } else
        {
            validateBitmapSize(bitmap);
            validateBitmapFormat(bitmap);
            mRS.nAllocationCopyFromBitmap(getID(mRS), bitmap);
            return;
        }
    }

    public void copyFrom(Allocation allocation)
    {
        mRS.validate();
        if (!mType.equals(allocation.getType()))
        {
            throw new RSIllegalArgumentException("Types of allocations must match.");
        } else
        {
            copy2DRangeFrom(0, 0, mCurrentDimX, mCurrentDimY, allocation, 0, 0);
            return;
        }
    }

    public void copyFrom(Object obj)
    {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyFrom(byte abyte0[])
    {
        validateIsInt8();
        copyFromUnchecked(abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copyFrom(float af[])
    {
        validateIsFloat32();
        copyFromUnchecked(af, Element.DataType.FLOAT_32, af.length);
    }

    public void copyFrom(int ai[])
    {
        validateIsInt32();
        copyFromUnchecked(ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copyFrom(BaseObj abaseobj[])
    {
        mRS.validate();
        validateIsObject();
        if (abaseobj.length != mCurrentCount)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Array size mismatch, allocation sizeX = ").append(mCurrentCount).append(", array length = ").append(abaseobj.length).toString());
        }
        if (RenderScript.sPointerSize == 8)
        {
            long al[] = new long[abaseobj.length * 4];
            for (int i = 0; i < abaseobj.length; i++)
            {
                al[i * 4] = abaseobj[i].getID(mRS);
            }

            copy1DRangeFromUnchecked(0, mCurrentCount, al);
            return;
        }
        int ai[] = new int[abaseobj.length];
        for (int j = 0; j < abaseobj.length; j++)
        {
            ai[j] = (int)abaseobj[j].getID(mRS);
        }

        copy1DRangeFromUnchecked(0, mCurrentCount, ai);
    }

    public void copyFrom(short aword0[])
    {
        validateIsInt16();
        copyFromUnchecked(aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copyFromUnchecked(Object obj)
    {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copyFromUnchecked(byte abyte0[])
    {
        copyFromUnchecked(abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copyFromUnchecked(float af[])
    {
        copyFromUnchecked(af, Element.DataType.FLOAT_32, af.length);
    }

    public void copyFromUnchecked(int ai[])
    {
        copyFromUnchecked(ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copyFromUnchecked(short aword0[])
    {
        copyFromUnchecked(aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void copyTo(Bitmap bitmap)
    {
        mRS.validate();
        validateBitmapFormat(bitmap);
        validateBitmapSize(bitmap);
        mRS.nAllocationCopyToBitmap(getID(mRS), bitmap);
    }

    public void copyTo(Object obj)
    {
        copyTo(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyTo(byte abyte0[])
    {
        validateIsInt8();
        copyTo(abyte0, Element.DataType.SIGNED_8, abyte0.length);
    }

    public void copyTo(float af[])
    {
        validateIsFloat32();
        copyTo(af, Element.DataType.FLOAT_32, af.length);
    }

    public void copyTo(int ai[])
    {
        validateIsInt32();
        copyTo(ai, Element.DataType.SIGNED_32, ai.length);
    }

    public void copyTo(short aword0[])
    {
        validateIsInt16();
        copyTo(aword0, Element.DataType.SIGNED_16, aword0.length);
    }

    public void destroy()
    {
        boolean flag = true;
        if (mIncCompatAllocation == 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (mIncAllocDestroyed)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        mIncAllocDestroyed = true;
_L3:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readlock = mRS.mRWLock.readLock();
            readlock.lock();
            if (mRS.isAlive())
            {
                mRS.nIncObjDestroy(mIncCompatAllocation);
            }
            readlock.unlock();
            mIncCompatAllocation = 0L;
        }
_L2:
        if ((mUsage & 0x60) != 0)
        {
            setSurface(null);
        }
        super.destroy();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L3
    }

    protected void finalize()
        throws Throwable
    {
        if (RenderScript.sUseGCHooks)
        {
            RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, new Object[] {
                Integer.valueOf(mSize)
            });
        }
        super.finalize();
    }

    public void generateMipmaps()
    {
        mRS.nAllocationGenerateMipmaps(getID(mRS));
    }

    public int getBytesSize()
    {
        if (mType.mDimYuv != 0)
        {
            return (int)Math.ceil((double)(mType.getCount() * mType.getElement().getBytesSize()) * 1.5D);
        } else
        {
            return mType.getCount() * mType.getElement().getBytesSize();
        }
    }

    public Element getElement()
    {
        return mType.getElement();
    }

    public long getIncAllocID()
    {
        return mIncCompatAllocation;
    }

    public Type getType()
    {
        return mType;
    }

    public int getUsage()
    {
        return mUsage;
    }

    public void ioReceive()
    {
        if ((mUsage & 0x20) == 0)
        {
            throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
        } else
        {
            mRS.validate();
            mRS.nAllocationIoReceive(getID(mRS));
            return;
        }
    }

    public void ioSend()
    {
        if ((mUsage & 0x40) == 0)
        {
            throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
        } else
        {
            mRS.validate();
            mRS.nAllocationIoSend(getID(mRS));
            return;
        }
    }

    public void ioSendOutput()
    {
        ioSend();
    }

    public void setAutoPadding(boolean flag)
    {
        mAutoPadding = flag;
    }

    public void setFromFieldPacker(int i, int j, FieldPacker fieldpacker)
    {
        mRS.validate();
        if (j >= mType.mElement.mElements.length)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Component_number ").append(j).append(" out of range.").toString());
        }
        if (i < 0)
        {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
        byte abyte0[] = fieldpacker.getData();
        int k = fieldpacker.getPos();
        int l = mType.mElement.mElements[j].getBytesSize() * mType.mElement.mArraySizes[j];
        if (k != l)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Field packer sizelength ").append(k).append(" does not match component size ").append(l).append(".").toString());
        } else
        {
            mRS.nAllocationElementData1D(getIDSafe(), i, mSelectedLOD, j, abyte0, k);
            return;
        }
    }

    public void setFromFieldPacker(int i, FieldPacker fieldpacker)
    {
        mRS.validate();
        int j = mType.mElement.getBytesSize();
        byte abyte0[] = fieldpacker.getData();
        int k = fieldpacker.getPos();
        int l = k / j;
        if (j * l != k)
        {
            throw new RSIllegalArgumentException((new StringBuilder()).append("Field packer length ").append(k).append(" not divisible by element size ").append(j).append(".").toString());
        } else
        {
            copy1DRangeFromUnchecked(i, l, abyte0);
            return;
        }
    }

    public void setIncAllocID(long l)
    {
        mIncCompatAllocation = l;
    }

    public void setSurface(Surface surface)
    {
        mRS.validate();
        if ((mUsage & 0x40) == 0)
        {
            throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
        } else
        {
            mRS.nAllocationSetSurface(getID(mRS), surface);
            return;
        }
    }

    public void syncAll(int i)
    {
        switch (i)
        {
        default:
            throw new RSIllegalArgumentException("Source must be exactly one usage type.");

        case 1: // '\001'
        case 2: // '\002'
            mRS.validate();
            break;
        }
        mRS.nAllocationSyncAll(getIDSafe(), i);
    }

    static 
    {
        mBitmapOptions = new android.graphics.BitmapFactory.Options();
        mBitmapOptions.inScaled = false;
    }
}
