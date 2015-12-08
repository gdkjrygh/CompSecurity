// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, RenderScript, Allocation, RSDriverException, 
//            RSIllegalArgumentException, FieldPacker, Type, Element

public class Script extends BaseObj
{
    public static class Builder
    {

        RenderScript mRS;

        Builder(RenderScript renderscript)
        {
            mRS = renderscript;
        }
    }

    public static class FieldBase
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

        protected FieldBase()
        {
        }
    }

    public static final class FieldID extends BaseObj
    {

        android.renderscript.FieldID mN;
        Script mScript;
        int mSlot;

        FieldID(long l, RenderScript renderscript, Script script, int i)
        {
            super(l, renderscript);
            mScript = script;
            mSlot = i;
        }
    }

    public static final class InvokeID extends BaseObj
    {

        Script mScript;
        int mSlot;

        InvokeID(long l, RenderScript renderscript, Script script, int i)
        {
            super(l, renderscript);
            mScript = script;
            mSlot = i;
        }
    }

    public static final class KernelID extends BaseObj
    {

        android.renderscript.KernelID mN;
        Script mScript;
        int mSig;
        int mSlot;

        KernelID(long l, RenderScript renderscript, Script script, int i, int j)
        {
            super(l, renderscript);
            mScript = script;
            mSlot = i;
            mSig = j;
        }
    }

    public static final class LaunchOptions
    {

        private int strategy;
        private int xend;
        private int xstart;
        private int yend;
        private int ystart;
        private int zend;
        private int zstart;

        public int getXEnd()
        {
            return xend;
        }

        public int getXStart()
        {
            return xstart;
        }

        public int getYEnd()
        {
            return yend;
        }

        public int getYStart()
        {
            return ystart;
        }

        public int getZEnd()
        {
            return zend;
        }

        public int getZStart()
        {
            return zstart;
        }

        public LaunchOptions setX(int i, int j)
        {
            if (i < 0 || j <= i)
            {
                throw new RSIllegalArgumentException("Invalid dimensions");
            } else
            {
                xstart = i;
                xend = j;
                return this;
            }
        }

        public LaunchOptions setY(int i, int j)
        {
            if (i < 0 || j <= i)
            {
                throw new RSIllegalArgumentException("Invalid dimensions");
            } else
            {
                ystart = i;
                yend = j;
                return this;
            }
        }

        public LaunchOptions setZ(int i, int j)
        {
            if (i < 0 || j <= i)
            {
                throw new RSIllegalArgumentException("Invalid dimensions");
            } else
            {
                zstart = i;
                zend = j;
                return this;
            }
        }







        public LaunchOptions()
        {
            xstart = 0;
            ystart = 0;
            xend = 0;
            yend = 0;
            zstart = 0;
            zend = 0;
        }
    }


    private final SparseArray mFIDs = new SparseArray();
    private final SparseArray mIIDs = new SparseArray();
    private final SparseArray mKIDs = new SparseArray();
    private boolean mUseIncSupp;

    Script(long l, RenderScript renderscript)
    {
        super(l, renderscript);
        mUseIncSupp = false;
    }

    public void bindAllocation(Allocation allocation, int i)
    {
        mRS.validate();
        if (allocation != null)
        {
            mRS.nScriptBindAllocation(getID(mRS), allocation.getID(mRS), i, mUseIncSupp);
            return;
        } else
        {
            mRS.nScriptBindAllocation(getID(mRS), 0L, i, mUseIncSupp);
            return;
        }
    }

    protected FieldID createFieldID(int i, Element element)
    {
        element = (FieldID)mFIDs.get(i);
        if (element != null)
        {
            return element;
        }
        long l = mRS.nScriptFieldIDCreate(getID(mRS), i, mUseIncSupp);
        if (l == 0L)
        {
            throw new RSDriverException("Failed to create FieldID");
        } else
        {
            element = new FieldID(l, mRS, this, i);
            mFIDs.put(i, element);
            return element;
        }
    }

    protected InvokeID createInvokeID(int i)
    {
        InvokeID invokeid = (InvokeID)mIIDs.get(i);
        if (invokeid != null)
        {
            return invokeid;
        }
        long l = mRS.nScriptInvokeIDCreate(getID(mRS), i);
        if (l == 0L)
        {
            throw new RSDriverException("Failed to create KernelID");
        } else
        {
            InvokeID invokeid1 = new InvokeID(l, mRS, this, i);
            mIIDs.put(i, invokeid1);
            return invokeid1;
        }
    }

    protected KernelID createKernelID(int i, int j, Element element, Element element1)
    {
        element = (KernelID)mKIDs.get(i);
        if (element != null)
        {
            return element;
        }
        long l = mRS.nScriptKernelIDCreate(getID(mRS), i, j, mUseIncSupp);
        if (l == 0L)
        {
            throw new RSDriverException("Failed to create KernelID");
        } else
        {
            element = new KernelID(l, mRS, this, i, j);
            mKIDs.put(i, element);
            return element;
        }
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation1, FieldPacker fieldpacker)
    {
        long l1 = 0L;
        if (allocation == null && allocation1 == null)
        {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        byte abyte0[];
        long l;
        if (allocation != null)
        {
            l = allocation.getID(mRS);
        } else
        {
            l = 0L;
        }
        if (allocation1 != null)
        {
            l1 = allocation1.getID(mRS);
        }
        abyte0 = null;
        if (fieldpacker != null)
        {
            abyte0 = fieldpacker.getData();
        }
        if (mUseIncSupp)
        {
            l = getDummyAlloc(allocation);
            l1 = getDummyAlloc(allocation1);
            mRS.nScriptForEach(getID(mRS), i, l, l1, abyte0, mUseIncSupp);
            return;
        } else
        {
            mRS.nScriptForEach(getID(mRS), i, l, l1, abyte0, mUseIncSupp);
            return;
        }
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation1, FieldPacker fieldpacker, LaunchOptions launchoptions)
    {
        if (allocation == null && allocation1 == null)
        {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (launchoptions == null)
        {
            forEach(i, allocation, allocation1, fieldpacker);
            return;
        }
        long l = 0L;
        long l1 = 0L;
        if (allocation != null)
        {
            l = allocation.getID(mRS);
        }
        if (allocation1 != null)
        {
            l1 = allocation1.getID(mRS);
        }
        byte abyte0[] = null;
        if (fieldpacker != null)
        {
            abyte0 = fieldpacker.getData();
        }
        if (mUseIncSupp)
        {
            l = getDummyAlloc(allocation);
            l1 = getDummyAlloc(allocation1);
            mRS.nScriptForEachClipped(getID(mRS), i, l, l1, abyte0, launchoptions.xstart, launchoptions.xend, launchoptions.ystart, launchoptions.yend, launchoptions.zstart, launchoptions.zend, mUseIncSupp);
            return;
        } else
        {
            mRS.nScriptForEachClipped(getID(mRS), i, l, l1, abyte0, launchoptions.xstart, launchoptions.xend, launchoptions.ystart, launchoptions.yend, launchoptions.zstart, launchoptions.zend, mUseIncSupp);
            return;
        }
    }

    long getDummyAlloc(Allocation allocation)
    {
        long l = 0L;
        if (allocation != null)
        {
            l = allocation.getType().getElement().getDummyElement(mRS);
            l = allocation.getType().getDummyType(mRS, l);
            l = mRS.nIncAllocationCreateTyped(allocation.getID(mRS), l);
            allocation.setIncAllocID(l);
        }
        return l;
    }

    protected void invoke(int i)
    {
        mRS.nScriptInvoke(getID(mRS), i, mUseIncSupp);
    }

    protected void invoke(int i, FieldPacker fieldpacker)
    {
        if (fieldpacker != null)
        {
            mRS.nScriptInvokeV(getID(mRS), i, fieldpacker.getData(), mUseIncSupp);
            return;
        } else
        {
            mRS.nScriptInvoke(getID(mRS), i, mUseIncSupp);
            return;
        }
    }

    protected boolean isIncSupp()
    {
        return mUseIncSupp;
    }

    protected void setIncSupp(boolean flag)
    {
        mUseIncSupp = flag;
    }

    public void setTimeZone(String s)
    {
        mRS.validate();
        try
        {
            mRS.nScriptSetTimeZone(getID(mRS), s.getBytes("UTF-8"), mUseIncSupp);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
    }

    public void setVar(int i, double d)
    {
        mRS.nScriptSetVarD(getID(mRS), i, d, mUseIncSupp);
    }

    public void setVar(int i, float f)
    {
        mRS.nScriptSetVarF(getID(mRS), i, f, mUseIncSupp);
    }

    public void setVar(int i, int j)
    {
        mRS.nScriptSetVarI(getID(mRS), i, j, mUseIncSupp);
    }

    public void setVar(int i, long l)
    {
        mRS.nScriptSetVarJ(getID(mRS), i, l, mUseIncSupp);
    }

    public void setVar(int i, BaseObj baseobj)
    {
        long l = 0L;
        if (mUseIncSupp)
        {
            long l1 = getDummyAlloc((Allocation)baseobj);
            RenderScript renderscript = mRS;
            long l3 = getID(mRS);
            if (baseobj != null)
            {
                l = l1;
            }
            renderscript.nScriptSetVarObj(l3, i, l, mUseIncSupp);
            return;
        }
        RenderScript renderscript1 = mRS;
        long l2 = getID(mRS);
        if (baseobj != null)
        {
            l = baseobj.getID(mRS);
        }
        renderscript1.nScriptSetVarObj(l2, i, l, mUseIncSupp);
    }

    public void setVar(int i, FieldPacker fieldpacker)
    {
        mRS.nScriptSetVarV(getID(mRS), i, fieldpacker.getData(), mUseIncSupp);
    }

    public void setVar(int i, FieldPacker fieldpacker, Element element, int ai[])
    {
        if (mUseIncSupp)
        {
            long l = element.getDummyElement(mRS);
            mRS.nScriptSetVarVE(getID(mRS), i, fieldpacker.getData(), l, ai, mUseIncSupp);
            return;
        } else
        {
            mRS.nScriptSetVarVE(getID(mRS), i, fieldpacker.getData(), element.getID(mRS), ai, mUseIncSupp);
            return;
        }
    }

    public void setVar(int i, boolean flag)
    {
        RenderScript renderscript = mRS;
        long l = getID(mRS);
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        renderscript.nScriptSetVarI(l, i, j, mUseIncSupp);
    }
}
