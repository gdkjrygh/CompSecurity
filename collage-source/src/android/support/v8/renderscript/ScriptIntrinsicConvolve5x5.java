// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, Element, RSIllegalArgumentException, RenderScript, 
//            Allocation, FieldPacker

public class ScriptIntrinsicConvolve5x5 extends ScriptIntrinsic
{

    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float mValues[] = new float[25];

    ScriptIntrinsicConvolve5x5(long l, RenderScript renderscript)
    {
        super(l, renderscript);
    }

    public static ScriptIntrinsicConvolve5x5 create(RenderScript renderscript, Element element)
    {
        if (!element.isCompatible(Element.U8(renderscript)) && !element.isCompatible(Element.U8_2(renderscript)) && !element.isCompatible(Element.U8_3(renderscript)) && !element.isCompatible(Element.U8_4(renderscript)) && !element.isCompatible(Element.F32(renderscript)) && !element.isCompatible(Element.F32_2(renderscript)) && !element.isCompatible(Element.F32_3(renderscript)) && !element.isCompatible(Element.F32_4(renderscript)))
        {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
        boolean flag;
        if (renderscript.isUseNative() && android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        renderscript = new ScriptIntrinsicConvolve5x5(renderscript.nScriptIntrinsicCreate(4, element.getID(renderscript), flag), renderscript);
        renderscript.setIncSupp(flag);
        return renderscript;
    }

    public void forEach(Allocation allocation)
    {
        forEach(0, null, allocation, null);
    }

    public void forEach(Allocation allocation, Script.LaunchOptions launchoptions)
    {
        forEach(0, (Allocation)null, allocation, null, launchoptions);
    }

    public Script.FieldID getFieldID_Input()
    {
        return createFieldID(1, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 2, null, null);
    }

    public void setCoefficients(float af[])
    {
        FieldPacker fieldpacker = new FieldPacker(100);
        for (int i = 0; i < mValues.length; i++)
        {
            mValues[i] = af[i];
            fieldpacker.addF32(mValues[i]);
        }

        setVar(0, fieldpacker);
    }

    public void setInput(Allocation allocation)
    {
        mInput = allocation;
        setVar(1, allocation);
    }
}
