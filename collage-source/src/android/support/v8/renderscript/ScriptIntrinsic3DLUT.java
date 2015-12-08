// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, Element, RSIllegalArgumentException, RenderScript, 
//            Allocation, Type

public class ScriptIntrinsic3DLUT extends ScriptIntrinsic
{

    private static final int INTRINSIC_API_LEVEL = 19;
    private Element mElement;
    private Allocation mLUT;

    protected ScriptIntrinsic3DLUT(long l, RenderScript renderscript, Element element)
    {
        super(l, renderscript);
        mElement = element;
    }

    public static ScriptIntrinsic3DLUT create(RenderScript renderscript, Element element)
    {
        if (!element.isCompatible(Element.U8_4(renderscript)))
        {
            throw new RSIllegalArgumentException("Element must be compatible with uchar4.");
        }
        boolean flag;
        if (renderscript.isUseNative() && android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        renderscript = new ScriptIntrinsic3DLUT(renderscript.nScriptIntrinsicCreate(8, element.getID(renderscript), flag), renderscript, element);
        renderscript.setIncSupp(flag);
        return renderscript;
    }

    public void forEach(Allocation allocation, Allocation allocation1)
    {
        forEach(0, allocation, allocation1, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 3, null, null);
    }

    public void setLUT(Allocation allocation)
    {
        Type type = allocation.getType();
        if (type.getZ() == 0)
        {
            throw new RSIllegalArgumentException("LUT must be 3d.");
        }
        if (!type.getElement().isCompatible(mElement))
        {
            throw new RSIllegalArgumentException("LUT element type must match.");
        } else
        {
            mLUT = allocation;
            setVar(0, mLUT);
            return;
        }
    }
}
