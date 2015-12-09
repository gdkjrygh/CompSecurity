// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, RSInvalidStateException, Script, RSRuntimeException, 
//            Type, RenderScript

public static final class mRS
{

    private int mKernelCount;
    private ArrayList mLines;
    private ArrayList mNodes;
    private RenderScript mRS;
    private boolean mUseIncSupp;

    private boolean calcOrder()
    {
        Iterator iterator = mNodes.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            mRS mrs = (mNodes)iterator.next();
            if (mrs.puts.size() == 0)
            {
                for (Iterator iterator1 = mNodes.iterator(); iterator1.hasNext();)
                {
                    ((mNodes)iterator1.next()).en = false;
                }

                flag = calcOrderRecurse(mrs, 1) & flag;
            }
        } while (true);
        Collections.sort(mNodes, new Comparator() {

            final ScriptGroup.Builder this$0;

            public int compare(ScriptGroup.Node node, ScriptGroup.Node node1)
            {
                return node.mOrder - node1.mOrder;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((ScriptGroup.Node)obj, (ScriptGroup.Node)obj1);
            }

            
            {
                this$0 = ScriptGroup.Builder.this;
                super();
            }
        });
        return flag;
    }

    private boolean calcOrderRecurse(_cls1.compare compare, int i)
    {
        compare.en = true;
        if (compare.der < i)
        {
            compare.der = i;
        }
        Iterator iterator = compare.tputs.iterator();
        boolean flag = true;
        do
        {
            Object obj;
label0:
            {
                boolean flag1 = flag;
                if (iterator.hasNext())
                {
                    obj = (ine)iterator.next();
                    if (((ine) (obj)).mToF != null)
                    {
                        obj = findNode(((ine) (obj)).mToF.pt);
                    } else
                    {
                        obj = findNode(((ine) (obj)).mToK.ipt);
                    }
                    if (!((ipt) (obj)).en)
                    {
                        break label0;
                    }
                    flag1 = false;
                }
                return flag1;
            }
            flag = calcOrderRecurse(((calcOrderRecurse) (obj)), compare.der + 1) & flag;
        } while (true);
    }

    private der findNode(der der)
    {
        for (int i = 0; i < mNodes.size(); i++)
        {
            der der1 = (mNodes)mNodes.get(i);
            for (int j = 0; j < der1.rnels.size(); j++)
            {
                if (der == der1.rnels.get(j))
                {
                    return der1;
                }
            }

        }

        return null;
    }

    private rnels findNode(Script script)
    {
        for (int i = 0; i < mNodes.size(); i++)
        {
            if (script == ((mNodes)mNodes.get(i)).ript)
            {
                return (ript)mNodes.get(i);
            }
        }

        return null;
    }

    private void mergeDAGs(int i, int j)
    {
        for (int k = 0; k < mNodes.size(); k++)
        {
            if (((mNodes)mNodes.get(k)).Number == j)
            {
                ((Number)mNodes.get(k)).Number = i;
            }
        }

    }

    private void validateCycle(Number number, Number number1)
    {
        for (int i = 0; i < number.tputs.size(); i++)
        {
            Object obj = (ine)number.tputs.get(i);
            if (((ine) (obj)).mToK != null)
            {
                ine ine = findNode(((ine) (obj)).mToK.ipt);
                if (ine.equals(number1))
                {
                    throw new RSInvalidStateException("Loops in group not allowed.");
                }
                validateCycle(ine, number1);
            }
            if (((ine) (obj)).mToF == null)
            {
                continue;
            }
            obj = findNode(((ine) (obj)).mToF.pt);
            if (obj.equals(number1))
            {
                throw new RSInvalidStateException("Loops in group not allowed.");
            }
            validateCycle(((validateCycle) (obj)), number1);
        }

    }

    private void validateDAG()
    {
        boolean flag = false;
        for (int i = 0; i < mNodes.size(); i++)
        {
            validateCycle validatecycle = (mNodes)mNodes.get(i);
            if (validatecycle.puts.size() != 0)
            {
                continue;
            }
            if (validatecycle.tputs.size() == 0 && mNodes.size() > 1)
            {
                throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
            }
            validateDAGRecurse(validatecycle, i + 1);
        }

        int k = ((validateDAGRecurse)mNodes.get(0)).Number;
        for (int j = ((flag) ? 1 : 0); j < mNodes.size(); j++)
        {
            if (((mNodes)mNodes.get(j)).Number != k)
            {
                throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
            }
        }

    }

    private void validateDAGRecurse(ion ion, int i)
    {
        if (ion.Number != 0 && ion.Number != i)
        {
            mergeDAGs(ion.Number, i);
        } else
        {
            ion.Number = i;
            int j = 0;
            while (j < ion.tputs.size()) 
            {
                ine ine = (ine)ion.tputs.get(j);
                if (ine.mToK != null)
                {
                    validateDAGRecurse(findNode(ine.mToK.ipt), i);
                }
                if (ine.mToF != null)
                {
                    validateDAGRecurse(findNode(ine.mToF.pt), i);
                }
                j++;
            }
        }
    }

    public pt addConnection(Type type, pt pt, pt pt1)
    {
        pt pt2 = findNode(pt);
        if (pt2 == null)
        {
            throw new RSInvalidStateException("From script not found.");
        }
        pt pt3 = findNode(pt1.pt);
        if (pt3 == null)
        {
            throw new RSInvalidStateException("To script not found.");
        } else
        {
            ine ine = new ine(type, pt, pt1);
            mLines.add(new ine(type, pt, pt1));
            pt2.tputs.add(ine);
            pt3.puts.add(ine);
            validateCycle(pt2, pt2);
            return this;
        }
    }

    public validateCycle addConnection(Type type, validateCycle validatecycle, validateCycle validatecycle1)
    {
        validateCycle validatecycle2 = findNode(validatecycle);
        if (validatecycle2 == null)
        {
            throw new RSInvalidStateException("From script not found.");
        }
        validateCycle validatecycle3 = findNode(validatecycle1);
        if (validatecycle3 == null)
        {
            throw new RSInvalidStateException("To script not found.");
        } else
        {
            ine ine = new ine(type, validatecycle, validatecycle1);
            mLines.add(new ine(type, validatecycle, validatecycle1));
            validatecycle2.tputs.add(ine);
            validatecycle3.puts.add(ine);
            validateCycle(validatecycle2, validatecycle2);
            return this;
        }
    }

    public validateCycle addKernel(validateCycle validatecycle)
    {
        if (mLines.size() != 0)
        {
            throw new RSInvalidStateException("Kernels may not be added once connections exist.");
        }
        if (validatecycle.ipt.isIncSupp())
        {
            mUseIncSupp = true;
        }
        if (findNode(validatecycle) != null)
        {
            return this;
        }
        mKernelCount = mKernelCount + 1;
        validateCycle validatecycle2 = findNode(validatecycle.ipt);
        validateCycle validatecycle1 = validatecycle2;
        if (validatecycle2 == null)
        {
            validatecycle1 = new it>(validatecycle.ipt);
            mNodes.add(validatecycle1);
        }
        validatecycle1.rnels.add(validatecycle);
        return this;
    }

    public ScriptGroup create()
    {
        if (mNodes.size() == 0)
        {
            throw new RSInvalidStateException("Empty script groups are not allowed");
        }
        for (int i = 0; i < mNodes.size(); i++)
        {
            ((mNodes)mNodes.get(i)).Number = 0;
        }

        validateDAG();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        long al[] = new long[mKernelCount];
        int j = 0;
        for (int j1 = 0; j1 < mNodes.size(); j1++)
        {
            rnels rnels = (mNodes)mNodes.get(j1);
            for (int k1 = 0; k1 < rnels.rnels.size();)
            {
                rnels rnels1 = (rnels)rnels.rnels.get(k1);
                al[j] = rnels1.D(mRS);
                boolean flag1 = false;
                boolean flag = false;
                for (int l1 = 0; l1 < rnels.puts.size(); l1++)
                {
                    if (((ine)rnels.puts.get(l1)).mToK == rnels1)
                    {
                        flag = true;
                    }
                }

                for (int i2 = 0; i2 < rnels.tputs.size(); i2++)
                {
                    if (((ine)rnels.tputs.get(i2)).mFrom == rnels1)
                    {
                        flag1 = true;
                    }
                }

                if (!flag)
                {
                    arraylist.add(new >(rnels1));
                }
                if (!flag1)
                {
                    arraylist1.add(new >(rnels1));
                }
                k1++;
                j++;
            }

        }

        if (j != mKernelCount)
        {
            throw new RSRuntimeException("Count mismatch, should not happen.");
        }
        long l2;
        if (!mUseIncSupp)
        {
            long al1[] = new long[mLines.size()];
            long al2[] = new long[mLines.size()];
            long al3[] = new long[mLines.size()];
            long al4[] = new long[mLines.size()];
            for (int k = 0; k < mLines.size(); k++)
            {
                ine ine = (ine)mLines.get(k);
                al1[k] = ine.mFrom.D(mRS);
                if (ine.mToK != null)
                {
                    al2[k] = ine.mToK.D(mRS);
                }
                if (ine.mToF != null)
                {
                    al3[k] = ine.mToF.(mRS);
                }
                al4[k] = ine.mAllocationType.getID(mRS);
            }

            long l3 = mRS.nScriptGroupCreate(al, al1, al2, al3, al4);
            l2 = l3;
            if (l3 == 0L)
            {
                throw new RSRuntimeException("Object creation error, should not happen.");
            }
        } else
        {
            calcOrder();
            l2 = 0L;
        }
        ScriptGroup scriptgroup = new ScriptGroup(l2, mRS);
        scriptgroup.mOutputs = new [arraylist1.size()];
        for (int l = 0; l < arraylist1.size(); l++)
        {
            scriptgroup.mOutputs[l] = ()arraylist1.get(l);
        }

        scriptgroup.mInputs = new [arraylist.size()];
        for (int i1 = 0; i1 < arraylist.size(); i1++)
        {
            scriptgroup.mInputs[i1] = ()arraylist.get(i1);
        }

        ScriptGroup.access$002(scriptgroup, mNodes);
        ScriptGroup.access$102(scriptgroup, mUseIncSupp);
        return scriptgroup;
    }

    public _cls1.this._cls0(RenderScript renderscript)
    {
        mNodes = new ArrayList();
        mLines = new ArrayList();
        mUseIncSupp = false;
        mRS = renderscript;
    }
}
