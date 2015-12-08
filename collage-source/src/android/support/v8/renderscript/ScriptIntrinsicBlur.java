// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, Element, RSIllegalArgumentException, RenderScript, 
//            Allocation

public class ScriptIntrinsicBlur extends ScriptIntrinsic
{

    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float mValues[] = new float[9];

    protected ScriptIntrinsicBlur(long l, RenderScript renderscript)
    {
        super(l, renderscript);
    }

    public static ScriptIntrinsicBlur create(RenderScript renderscript, Element element)
    {
        if (!element.isCompatible(Element.U8_4(renderscript)) && !element.isCompatible(Element.U8(renderscript)))
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
        renderscript = new ScriptIntrinsicBlur(renderscript.nScriptIntrinsicCreate(5, element.getID(renderscript), flag), renderscript);
        renderscript.setIncSupp(flag);
        renderscript.setRadius(5F);
        return renderscript;
    }

    public void forEach(Allocation allocation)
    {
        forEach(0, null, allocation, null);
    }

    public Script.FieldID getFieldID_Input()
    {
        return createFieldID(1, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation)
    {
        mInput = allocation;
        setVar(1, allocation);
    }

    public void setRadius(float f)
    {
        if (f <= 0.0F || f > 25F)
        {
            throw new RSIllegalArgumentException("Radius out of range (0 < r <= 25).");
        } else
        {
            setVar(0, f);
            return;
        }
    }
}
