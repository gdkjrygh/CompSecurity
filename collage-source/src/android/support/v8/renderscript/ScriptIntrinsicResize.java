// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, RenderScript, RSIllegalArgumentException, Allocation, 
//            Element

public class ScriptIntrinsicResize extends ScriptIntrinsic
{

    private static final int INTRINSIC_API_LEVEL = 21;
    private Allocation mInput;

    protected ScriptIntrinsicResize(long l, RenderScript renderscript)
    {
        super(l, renderscript);
    }

    public static ScriptIntrinsicResize create(RenderScript renderscript)
    {
        boolean flag;
        if (renderscript.isUseNative() && android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        renderscript = new ScriptIntrinsicResize(renderscript.nScriptIntrinsicCreate(12, 0L, flag), renderscript);
        renderscript.setIncSupp(flag);
        return renderscript;
    }

    public void forEach_bicubic(Allocation allocation)
    {
        if (allocation == mInput)
        {
            throw new RSIllegalArgumentException("Output cannot be same as Input.");
        } else
        {
            forEach_bicubic(allocation, null);
            return;
        }
    }

    public void forEach_bicubic(Allocation allocation, Script.LaunchOptions launchoptions)
    {
        forEach(0, (Allocation)null, allocation, null, launchoptions);
    }

    public Script.FieldID getFieldID_Input()
    {
        return createFieldID(0, null);
    }

    public Script.KernelID getKernelID_bicubic()
    {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation)
    {
        Element element = allocation.getElement();
        if (!element.isCompatible(Element.U8(mRS)) && !element.isCompatible(Element.U8_2(mRS)) && !element.isCompatible(Element.U8_3(mRS)) && !element.isCompatible(Element.U8_4(mRS)) && !element.isCompatible(Element.F32(mRS)) && !element.isCompatible(Element.F32_2(mRS)) && !element.isCompatible(Element.F32_3(mRS)) && !element.isCompatible(Element.F32_4(mRS)))
        {
            throw new RSIllegalArgumentException("Unsuported element type.");
        } else
        {
            mInput = allocation;
            setVar(0, allocation);
            return;
        }
    }
}
