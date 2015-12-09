// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptIntrinsic, RenderScript, Element, Allocation

public class ScriptIntrinsicYuvToRGB extends ScriptIntrinsic
{

    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;

    ScriptIntrinsicYuvToRGB(long l, RenderScript renderscript)
    {
        super(l, renderscript);
    }

    public static ScriptIntrinsicYuvToRGB create(RenderScript renderscript, Element element)
    {
        boolean flag;
        if (renderscript.isUseNative() && android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        renderscript = new ScriptIntrinsicYuvToRGB(renderscript.nScriptIntrinsicCreate(6, element.getID(renderscript), flag), renderscript);
        renderscript.setIncSupp(flag);
        return renderscript;
    }

    public void forEach(Allocation allocation)
    {
        forEach(0, null, allocation, null);
    }

    public Script.FieldID getFieldID_Input()
    {
        return createFieldID(0, null);
    }

    public Script.KernelID getKernelID()
    {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation)
    {
        mInput = allocation;
        setVar(0, allocation);
    }
}
