// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, Matrix4f, RenderScript, Element, 
//            Allocation, RSIllegalArgumentException

public class ScriptIntrinsicLUT extends ScriptIntrinsic
{

    private static final int INTRINSIC_API_LEVEL = 19;
    private final byte mCache[] = new byte[1024];
    private boolean mDirty;
    private final Matrix4f mMatrix = new Matrix4f();
    private Allocation mTables;

    protected ScriptIntrinsicLUT(long l, RenderScript renderscript)
    {
        super(l, renderscript);
        mDirty = true;
    }

    public static ScriptIntrinsicLUT create(RenderScript renderscript, Element element)
    {
        boolean flag;
        if (renderscript.isUseNative() && android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        element = new ScriptIntrinsicLUT(renderscript.nScriptIntrinsicCreate(3, element.getID(renderscript), flag), renderscript);
        element.setIncSupp(flag);
        element.mTables = Allocation.createSized(renderscript, Element.U8(renderscript), 1024);
        for (int i = 0; i < 256; i++)
        {
            ((ScriptIntrinsicLUT) (element)).mCache[i] = (byte)i;
            ((ScriptIntrinsicLUT) (element)).mCache[i + 256] = (byte)i;
            ((ScriptIntrinsicLUT) (element)).mCache[i + 512] = (byte)i;
            ((ScriptIntrinsicLUT) (element)).mCache[i + 768] = (byte)i;
        }

        element.setVar(0, ((ScriptIntrinsicLUT) (element)).mTables);
        return element;
    }

    private void validate(int i, int j)
    {
        if (i < 0 || i > 255)
        {
            throw new RSIllegalArgumentException("Index out of range (0-255).");
        }
        if (j < 0 || j > 255)
        {
            throw new RSIllegalArgumentException("Value out of range (0-255).");
        } else
        {
            return;
        }
    }

    public void forEach(Allocation allocation, Allocation allocation1)
    {
        if (mDirty)
        {
            mDirty = false;
            mTables.copyFromUnchecked(mCache);
        }
        forEach(0, allocation, allocation1, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 3, null, null);
    }

    public void setAlpha(int i, int j)
    {
        validate(i, j);
        mCache[i + 768] = (byte)j;
        mDirty = true;
    }

    public void setBlue(int i, int j)
    {
        validate(i, j);
        mCache[i + 512] = (byte)j;
        mDirty = true;
    }

    public void setGreen(int i, int j)
    {
        validate(i, j);
        mCache[i + 256] = (byte)j;
        mDirty = true;
    }

    public void setRed(int i, int j)
    {
        validate(i, j);
        mCache[i] = (byte)j;
        mDirty = true;
    }
}
