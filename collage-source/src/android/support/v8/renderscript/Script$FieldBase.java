// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Script, Allocation, Element, Type, 
//            RenderScript

public static class 
{

    protected Allocation mAllocation;
    protected Element mElement;

    public Allocation getAllocation()
    {
        return mAllocation;
    }

    public Element getElement()
    {
        return mElement;
    }

    public Type getType()
    {
        return mAllocation.getType();
    }

    protected void init(RenderScript renderscript, int i)
    {
        mAllocation = Allocation.createSized(renderscript, mElement, i, 1);
    }

    protected void init(RenderScript renderscript, int i, int j)
    {
        mAllocation = Allocation.createSized(renderscript, mElement, i, j | 1);
    }

    public void updateAllocation()
    {
    }

    protected ()
    {
    }
}
