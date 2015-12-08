// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, RenderScript, RSRuntimeException, Allocation, 
//            Script, RSIllegalArgumentException, RSInvalidStateException, Type, 
//            FieldPacker

public final class ScriptGroup extends BaseObj
{
    public static final class Binding
    {

        private final Script.FieldID mField;
        private final Object mValue;

        public Script.FieldID getField()
        {
            return mField;
        }

        public Object getValue()
        {
            return mValue;
        }

        public Binding(Script.FieldID fieldid, Object obj)
        {
            mField = fieldid;
            mValue = obj;
        }
    }

    public static final class Builder
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
                Node node = (Node)iterator.next();
                if (node.mInputs.size() == 0)
                {
                    for (Iterator iterator1 = mNodes.iterator(); iterator1.hasNext();)
                    {
                        ((Node)iterator1.next()).mSeen = false;
                    }

                    flag = calcOrderRecurse(node, 1) & flag;
                }
            } while (true);
            Collections.sort(mNodes, new Comparator() {

                final Builder this$0;

                public int compare(Node node, Node node1)
                {
                    return node.mOrder - node1.mOrder;
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((Node)obj, (Node)obj1);
                }

            
            {
                this$0 = Builder.this;
                super();
            }
            });
            return flag;
        }

        private boolean calcOrderRecurse(Node node, int i)
        {
            node.mSeen = true;
            if (node.mOrder < i)
            {
                node.mOrder = i;
            }
            Iterator iterator = node.mOutputs.iterator();
            boolean flag = true;
            do
            {
                Object obj;
label0:
                {
                    boolean flag1 = flag;
                    if (iterator.hasNext())
                    {
                        obj = (ConnectLine)iterator.next();
                        if (((ConnectLine) (obj)).mToF != null)
                        {
                            obj = findNode(((ConnectLine) (obj)).mToF.mScript);
                        } else
                        {
                            obj = findNode(((ConnectLine) (obj)).mToK.mScript);
                        }
                        if (!((Node) (obj)).mSeen)
                        {
                            break label0;
                        }
                        flag1 = false;
                    }
                    return flag1;
                }
                flag = calcOrderRecurse(((Node) (obj)), node.mOrder + 1) & flag;
            } while (true);
        }

        private Node findNode(Script.KernelID kernelid)
        {
            for (int i = 0; i < mNodes.size(); i++)
            {
                Node node = (Node)mNodes.get(i);
                for (int j = 0; j < node.mKernels.size(); j++)
                {
                    if (kernelid == node.mKernels.get(j))
                    {
                        return node;
                    }
                }

            }

            return null;
        }

        private Node findNode(Script script)
        {
            for (int i = 0; i < mNodes.size(); i++)
            {
                if (script == ((Node)mNodes.get(i)).mScript)
                {
                    return (Node)mNodes.get(i);
                }
            }

            return null;
        }

        private void mergeDAGs(int i, int j)
        {
            for (int k = 0; k < mNodes.size(); k++)
            {
                if (((Node)mNodes.get(k)).dagNumber == j)
                {
                    ((Node)mNodes.get(k)).dagNumber = i;
                }
            }

        }

        private void validateCycle(Node node, Node node1)
        {
            for (int i = 0; i < node.mOutputs.size(); i++)
            {
                Object obj = (ConnectLine)node.mOutputs.get(i);
                if (((ConnectLine) (obj)).mToK != null)
                {
                    Node node2 = findNode(((ConnectLine) (obj)).mToK.mScript);
                    if (node2.equals(node1))
                    {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(node2, node1);
                }
                if (((ConnectLine) (obj)).mToF == null)
                {
                    continue;
                }
                obj = findNode(((ConnectLine) (obj)).mToF.mScript);
                if (obj.equals(node1))
                {
                    throw new RSInvalidStateException("Loops in group not allowed.");
                }
                validateCycle(((Node) (obj)), node1);
            }

        }

        private void validateDAG()
        {
            boolean flag = false;
            for (int i = 0; i < mNodes.size(); i++)
            {
                Node node = (Node)mNodes.get(i);
                if (node.mInputs.size() != 0)
                {
                    continue;
                }
                if (node.mOutputs.size() == 0 && mNodes.size() > 1)
                {
                    throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                }
                validateDAGRecurse(node, i + 1);
            }

            int k = ((Node)mNodes.get(0)).dagNumber;
            for (int j = ((flag) ? 1 : 0); j < mNodes.size(); j++)
            {
                if (((Node)mNodes.get(j)).dagNumber != k)
                {
                    throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
                }
            }

        }

        private void validateDAGRecurse(Node node, int i)
        {
            if (node.dagNumber != 0 && node.dagNumber != i)
            {
                mergeDAGs(node.dagNumber, i);
            } else
            {
                node.dagNumber = i;
                int j = 0;
                while (j < node.mOutputs.size()) 
                {
                    ConnectLine connectline = (ConnectLine)node.mOutputs.get(j);
                    if (connectline.mToK != null)
                    {
                        validateDAGRecurse(findNode(connectline.mToK.mScript), i);
                    }
                    if (connectline.mToF != null)
                    {
                        validateDAGRecurse(findNode(connectline.mToF.mScript), i);
                    }
                    j++;
                }
            }
        }

        public Builder addConnection(Type type, Script.KernelID kernelid, Script.FieldID fieldid)
        {
            Node node = findNode(kernelid);
            if (node == null)
            {
                throw new RSInvalidStateException("From script not found.");
            }
            Node node1 = findNode(fieldid.mScript);
            if (node1 == null)
            {
                throw new RSInvalidStateException("To script not found.");
            } else
            {
                ConnectLine connectline = new ConnectLine(type, kernelid, fieldid);
                mLines.add(new ConnectLine(type, kernelid, fieldid));
                node.mOutputs.add(connectline);
                node1.mInputs.add(connectline);
                validateCycle(node, node);
                return this;
            }
        }

        public Builder addConnection(Type type, Script.KernelID kernelid, Script.KernelID kernelid1)
        {
            Node node = findNode(kernelid);
            if (node == null)
            {
                throw new RSInvalidStateException("From script not found.");
            }
            Node node1 = findNode(kernelid1);
            if (node1 == null)
            {
                throw new RSInvalidStateException("To script not found.");
            } else
            {
                ConnectLine connectline = new ConnectLine(type, kernelid, kernelid1);
                mLines.add(new ConnectLine(type, kernelid, kernelid1));
                node.mOutputs.add(connectline);
                node1.mInputs.add(connectline);
                validateCycle(node, node);
                return this;
            }
        }

        public Builder addKernel(Script.KernelID kernelid)
        {
            if (mLines.size() != 0)
            {
                throw new RSInvalidStateException("Kernels may not be added once connections exist.");
            }
            if (kernelid.mScript.isIncSupp())
            {
                mUseIncSupp = true;
            }
            if (findNode(kernelid) != null)
            {
                return this;
            }
            mKernelCount = mKernelCount + 1;
            Node node1 = findNode(kernelid.mScript);
            Node node = node1;
            if (node1 == null)
            {
                node = new Node(kernelid.mScript);
                mNodes.add(node);
            }
            node.mKernels.add(kernelid);
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
                ((Node)mNodes.get(i)).dagNumber = 0;
            }

            validateDAG();
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            long al[] = new long[mKernelCount];
            int j = 0;
            for (int j1 = 0; j1 < mNodes.size(); j1++)
            {
                Node node = (Node)mNodes.get(j1);
                for (int k1 = 0; k1 < node.mKernels.size();)
                {
                    Script.KernelID kernelid = (Script.KernelID)node.mKernels.get(k1);
                    al[j] = kernelid.getID(mRS);
                    boolean flag1 = false;
                    boolean flag = false;
                    for (int l1 = 0; l1 < node.mInputs.size(); l1++)
                    {
                        if (((ConnectLine)node.mInputs.get(l1)).mToK == kernelid)
                        {
                            flag = true;
                        }
                    }

                    for (int i2 = 0; i2 < node.mOutputs.size(); i2++)
                    {
                        if (((ConnectLine)node.mOutputs.get(i2)).mFrom == kernelid)
                        {
                            flag1 = true;
                        }
                    }

                    if (!flag)
                    {
                        arraylist.add(new IO(kernelid));
                    }
                    if (!flag1)
                    {
                        arraylist1.add(new IO(kernelid));
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
                    ConnectLine connectline = (ConnectLine)mLines.get(k);
                    al1[k] = connectline.mFrom.getID(mRS);
                    if (connectline.mToK != null)
                    {
                        al2[k] = connectline.mToK.getID(mRS);
                    }
                    if (connectline.mToF != null)
                    {
                        al3[k] = connectline.mToF.getID(mRS);
                    }
                    al4[k] = connectline.mAllocationType.getID(mRS);
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
            scriptgroup.mOutputs = new IO[arraylist1.size()];
            for (int l = 0; l < arraylist1.size(); l++)
            {
                scriptgroup.mOutputs[l] = (IO)arraylist1.get(l);
            }

            scriptgroup.mInputs = new IO[arraylist.size()];
            for (int i1 = 0; i1 < arraylist.size(); i1++)
            {
                scriptgroup.mInputs[i1] = (IO)arraylist.get(i1);
            }

            scriptgroup.mNodes = mNodes;
            scriptgroup.mUseIncSupp = mUseIncSupp;
            return scriptgroup;
        }

        public Builder(RenderScript renderscript)
        {
            mNodes = new ArrayList();
            mLines = new ArrayList();
            mUseIncSupp = false;
            mRS = renderscript;
        }
    }

    public static final class Builder2
    {

        private static final String TAG = "ScriptGroup.Builder2";
        List mClosures;
        List mInputs;
        RenderScript mRS;

        private Closure addInvokeInternal(Script.InvokeID invokeid, Object aobj[], Map map)
        {
            invokeid = new Closure(mRS, invokeid, aobj, map);
            mClosures.add(invokeid);
            return invokeid;
        }

        private Closure addKernelInternal(Script.KernelID kernelid, Type type, Object aobj[], Map map)
        {
            kernelid = new Closure(mRS, kernelid, type, aobj, map);
            mClosures.add(kernelid);
            return kernelid;
        }

        private boolean seperateArgsAndBindings(Object aobj[], ArrayList arraylist, Map map)
        {
            int i = 0;
_L5:
            if (i < aobj.length && !(aobj[i] instanceof Binding)) goto _L2; else goto _L1
_L1:
            if (i >= aobj.length)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!(aobj[i] instanceof Binding))
            {
                return false;
            }
            arraylist = (Binding)aobj[i];
            map.put(arraylist.getField(), arraylist.getValue());
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            arraylist.add(aobj[i]);
            i++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            return true;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public Input addInput()
        {
            Input input = new Input();
            mInputs.add(input);
            return input;
        }

        public transient Closure addInvoke(Script.InvokeID invokeid, Object aobj[])
        {
            ArrayList arraylist = new ArrayList();
            HashMap hashmap = new HashMap();
            if (!seperateArgsAndBindings(aobj, arraylist, hashmap))
            {
                return null;
            } else
            {
                return addInvokeInternal(invokeid, arraylist.toArray(), hashmap);
            }
        }

        public transient Closure addKernel(Script.KernelID kernelid, Type type, Object aobj[])
        {
            ArrayList arraylist = new ArrayList();
            HashMap hashmap = new HashMap();
            if (!seperateArgsAndBindings(aobj, arraylist, hashmap))
            {
                return null;
            } else
            {
                return addKernelInternal(kernelid, type, arraylist.toArray(), hashmap);
            }
        }

        public transient ScriptGroup create(String s, Future afuture[])
        {
            if (s == null || s.isEmpty() || s.length() > 100 || !s.equals(s.replaceAll("[^a-zA-Z0-9-]", "_")))
            {
                throw new RSIllegalArgumentException("invalid script group name");
            } else
            {
                return new ScriptGroup(mRS, s, mClosures, mInputs, afuture);
            }
        }

        public Builder2(RenderScript renderscript)
        {
            mRS = renderscript;
            mClosures = new ArrayList();
            mInputs = new ArrayList();
        }
    }

    public static final class Closure extends BaseObj
    {

        private static final String TAG = "Closure";
        private Object mArgs[];
        private Map mBindings;
        private FieldPacker mFP;
        private Map mGlobalFuture;
        private Future mReturnFuture;
        private Allocation mReturnValue;

        private void retrieveValueAndDependenceInfo(RenderScript renderscript, int i, Script.FieldID fieldid, Object obj, long al[], int ai[], long al1[], 
                long al2[])
        {
            if (obj instanceof Future)
            {
                Future future = (Future)obj;
                obj = future.getValue();
                al1[i] = future.getClosure().getID(renderscript);
                al1 = future.getFieldID();
                long l;
                if (al1 != null)
                {
                    l = al1.getID(renderscript);
                } else
                {
                    l = 0L;
                }
                al2[i] = l;
            } else
            {
                al1[i] = 0L;
                al2[i] = 0L;
            }
            if (obj instanceof Input)
            {
                renderscript = (Input)obj;
                if (i < mArgs.length)
                {
                    renderscript.addReference(this, i);
                } else
                {
                    renderscript.addReference(this, fieldid);
                }
                al[i] = 0L;
                ai[i] = 0;
                return;
            } else
            {
                renderscript = new ValueAndSize(renderscript, obj);
                al[i] = ((ValueAndSize) (renderscript)).value;
                ai[i] = ((ValueAndSize) (renderscript)).size;
                return;
            }
        }

        public Future getGlobal(Script.FieldID fieldid)
        {
            Future future = (Future)mGlobalFuture.get(fieldid);
            Object obj = future;
            if (future == null)
            {
                Object obj1 = mBindings.get(fieldid);
                obj = obj1;
                if (obj1 instanceof Future)
                {
                    obj = ((Future)obj1).getValue();
                }
                obj = new Future(this, fieldid, obj);
                mGlobalFuture.put(fieldid, obj);
            }
            return ((Future) (obj));
        }

        public Future getReturn()
        {
            if (mReturnFuture == null)
            {
                mReturnFuture = new Future(this, null, mReturnValue);
            }
            return mReturnFuture;
        }

        void setArg(int i, Object obj)
        {
            Object obj1 = obj;
            if (obj instanceof Future)
            {
                obj1 = ((Future)obj).getValue();
            }
            mArgs[i] = obj1;
            obj = new ValueAndSize(mRS, obj1);
            mRS.nClosureSetArg(getID(mRS), i, ((ValueAndSize) (obj)).value, ((ValueAndSize) (obj)).size);
        }

        void setGlobal(Script.FieldID fieldid, Object obj)
        {
            Object obj1 = obj;
            if (obj instanceof Future)
            {
                obj1 = ((Future)obj).getValue();
            }
            mBindings.put(fieldid, obj1);
            obj = new ValueAndSize(mRS, obj1);
            mRS.nClosureSetGlobal(getID(mRS), fieldid.getID(mRS), ((ValueAndSize) (obj)).value, ((ValueAndSize) (obj)).size);
        }

        Closure(long l, RenderScript renderscript)
        {
            super(l, renderscript);
        }

        Closure(RenderScript renderscript, Script.InvokeID invokeid, Object aobj[], Map map)
        {
            super(0L, renderscript);
            if (android.os.Build.VERSION.SDK_INT < 23 && renderscript.isUseNative())
            {
                throw new RSRuntimeException("ScriptGroup2 not supported in this API level");
            }
            mFP = FieldPacker.createFromArray(aobj);
            mArgs = aobj;
            mBindings = map;
            mGlobalFuture = new HashMap();
            int i = map.size();
            aobj = new long[i];
            long al[] = new long[i];
            int ai[] = new int[i];
            long al1[] = new long[i];
            long al2[] = new long[i];
            i = 0;
            for (map = map.entrySet().iterator(); map.hasNext();)
            {
                Object obj1 = (java.util.Map.Entry)map.next();
                Object obj = ((java.util.Map.Entry) (obj1)).getValue();
                obj1 = (Script.FieldID)((java.util.Map.Entry) (obj1)).getKey();
                aobj[i] = ((Script.FieldID) (obj1)).getID(renderscript);
                retrieveValueAndDependenceInfo(renderscript, i, ((Script.FieldID) (obj1)), obj, al, ai, al1, al2);
                i++;
            }

            setID(renderscript.nInvokeClosureCreate(invokeid.getID(renderscript), mFP.getData(), ((long []) (aobj)), al, ai));
        }

        Closure(RenderScript renderscript, Script.KernelID kernelid, Type type, Object aobj[], Map map)
        {
            super(0L, renderscript);
            if (android.os.Build.VERSION.SDK_INT < 23 && renderscript.isUseNative())
            {
                throw new RSRuntimeException("ScriptGroup2 not supported in this API level");
            }
            mArgs = aobj;
            mReturnValue = Allocation.createTyped(renderscript, type);
            mBindings = map;
            mGlobalFuture = new HashMap();
            int i = aobj.length + map.size();
            type = new long[i];
            long al[] = new long[i];
            int ai[] = new int[i];
            long al1[] = new long[i];
            long al2[] = new long[i];
            for (i = 0; i < aobj.length; i++)
            {
                type[i] = 0L;
                retrieveValueAndDependenceInfo(renderscript, i, null, aobj[i], al, ai, al1, al2);
            }

            for (aobj = map.entrySet().iterator(); ((Iterator) (aobj)).hasNext();)
            {
                Object obj = (java.util.Map.Entry)((Iterator) (aobj)).next();
                map = ((Map) (((java.util.Map.Entry) (obj)).getValue()));
                obj = (Script.FieldID)((java.util.Map.Entry) (obj)).getKey();
                type[i] = ((Script.FieldID) (obj)).getID(renderscript);
                retrieveValueAndDependenceInfo(renderscript, i, ((Script.FieldID) (obj)), map, al, ai, al1, al2);
                i++;
            }

            setID(renderscript.nClosureCreate(kernelid.getID(renderscript), mReturnValue.getID(renderscript), type, al, ai, al1, al2));
        }
    }

    private static final class Closure.ValueAndSize
    {

        public int size;
        public long value;

        public Closure.ValueAndSize(RenderScript renderscript, Object obj)
        {
            if (obj instanceof Allocation)
            {
                value = ((Allocation)obj).getID(renderscript);
                size = -1;
            } else
            {
                if (obj instanceof Boolean)
                {
                    long l;
                    if (((Boolean)obj).booleanValue())
                    {
                        l = 1L;
                    } else
                    {
                        l = 0L;
                    }
                    value = l;
                    size = 4;
                    return;
                }
                if (obj instanceof Integer)
                {
                    value = ((Integer)obj).longValue();
                    size = 4;
                    return;
                }
                if (obj instanceof Long)
                {
                    value = ((Long)obj).longValue();
                    size = 8;
                    return;
                }
                if (obj instanceof Float)
                {
                    value = ((Float)obj).longValue();
                    size = 4;
                    return;
                }
                if (obj instanceof Double)
                {
                    value = ((Double)obj).longValue();
                    size = 8;
                    return;
                }
            }
        }
    }

    static class ConnectLine
    {

        Allocation mAllocation;
        Type mAllocationType;
        Script.KernelID mFrom;
        Script.FieldID mToF;
        Script.KernelID mToK;

        ConnectLine(Type type, Script.KernelID kernelid, Script.FieldID fieldid)
        {
            mFrom = kernelid;
            mToF = fieldid;
            mAllocationType = type;
        }

        ConnectLine(Type type, Script.KernelID kernelid, Script.KernelID kernelid1)
        {
            mFrom = kernelid;
            mToK = kernelid1;
            mAllocationType = type;
        }
    }

    public static final class Future
    {

        Closure mClosure;
        Script.FieldID mFieldID;
        Object mValue;

        Closure getClosure()
        {
            return mClosure;
        }

        Script.FieldID getFieldID()
        {
            return mFieldID;
        }

        Object getValue()
        {
            return mValue;
        }

        Future(Closure closure, Script.FieldID fieldid, Object obj)
        {
            mClosure = closure;
            mFieldID = fieldid;
            mValue = obj;
        }
    }

    static class IO
    {

        Allocation mAllocation;
        Script.KernelID mKID;

        IO(Script.KernelID kernelid)
        {
            mKID = kernelid;
        }
    }

    public static final class Input
    {

        List mArgIndex;
        List mFieldID;
        Object mValue;

        void addReference(Closure closure, int i)
        {
            mArgIndex.add(Pair.create(closure, Integer.valueOf(i)));
        }

        void addReference(Closure closure, Script.FieldID fieldid)
        {
            mFieldID.add(Pair.create(closure, fieldid));
        }

        Object get()
        {
            return mValue;
        }

        void set(Object obj)
        {
            mValue = obj;
            Pair pair;
            for (Iterator iterator = mArgIndex.iterator(); iterator.hasNext(); ((Closure)pair.first).setArg(((Integer)pair.second).intValue(), obj))
            {
                pair = (Pair)iterator.next();
            }

            Pair pair1;
            for (Iterator iterator1 = mFieldID.iterator(); iterator1.hasNext(); ((Closure)pair1.first).setGlobal((Script.FieldID)pair1.second, obj))
            {
                pair1 = (Pair)iterator1.next();
            }

        }

        Input()
        {
            mFieldID = new ArrayList();
            mArgIndex = new ArrayList();
        }
    }

    static class Node
    {

        int dagNumber;
        ArrayList mInputs;
        ArrayList mKernels;
        Node mNext;
        int mOrder;
        ArrayList mOutputs;
        Script mScript;
        boolean mSeen;

        Node(Script script)
        {
            mKernels = new ArrayList();
            mInputs = new ArrayList();
            mOutputs = new ArrayList();
            mScript = script;
        }
    }


    private static final int MIN_API_VERSION = 23;
    private static final String TAG = "ScriptGroup";
    private List mClosures;
    IO mInputs[];
    private List mInputs2;
    private String mName;
    private ArrayList mNodes;
    IO mOutputs[];
    private Future mOutputs2[];
    private boolean mUseIncSupp;

    ScriptGroup(long l, RenderScript renderscript)
    {
        super(l, renderscript);
        mUseIncSupp = false;
        mNodes = new ArrayList();
    }

    ScriptGroup(RenderScript renderscript, String s, List list, List list1, Future afuture[])
    {
        super(0L, renderscript);
        mUseIncSupp = false;
        mNodes = new ArrayList();
        if (android.os.Build.VERSION.SDK_INT < 23 && renderscript.isUseNative())
        {
            throw new RSRuntimeException("ScriptGroup2 not supported in this API level");
        }
        mName = s;
        mClosures = list;
        mInputs2 = list1;
        mOutputs2 = afuture;
        list1 = new long[list.size()];
        for (int i = 0; i < list1.length; i++)
        {
            list1[i] = ((Closure)list.get(i)).getID(renderscript);
        }

        setID(renderscript.nScriptGroup2Create(s, renderscript.getApplicationContext().getCacheDir().toString(), list1));
    }

    public void execute()
    {
        if (!mUseIncSupp)
        {
            mRS.nScriptGroupExecute(getID(mRS));
        } else
        {
            for (int i = 0; i < mNodes.size(); i++)
            {
                Node node = (Node)mNodes.get(i);
                int k = 0;
                while (k < node.mOutputs.size()) 
                {
                    ConnectLine connectline = (ConnectLine)node.mOutputs.get(k);
                    if (connectline.mAllocation == null)
                    {
                        Allocation allocation1 = Allocation.createTyped(mRS, connectline.mAllocationType, Allocation.MipmapControl.MIPMAP_NONE, 1);
                        connectline.mAllocation = allocation1;
                        int j1 = k + 1;
                        while (j1 < node.mOutputs.size()) 
                        {
                            if (((ConnectLine)node.mOutputs.get(j1)).mFrom == connectline.mFrom)
                            {
                                ((ConnectLine)node.mOutputs.get(j1)).mAllocation = allocation1;
                            }
                            j1++;
                        }
                    }
                    k++;
                }
            }

            Iterator iterator = mNodes.iterator();
            while (iterator.hasNext()) 
            {
                Node node1 = (Node)iterator.next();
                Iterator iterator1 = node1.mKernels.iterator();
                while (iterator1.hasNext()) 
                {
                    Script.KernelID kernelid = (Script.KernelID)iterator1.next();
                    Object obj1 = node1.mInputs.iterator();
                    Allocation allocation = null;
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        ConnectLine connectline1 = (ConnectLine)((Iterator) (obj1)).next();
                        if (connectline1.mToK == kernelid)
                        {
                            allocation = connectline1.mAllocation;
                        }
                    } while (true);
                    IO aio[] = mInputs;
                    int l = aio.length;
                    int j = 0;
                    obj1 = allocation;
                    while (j < l) 
                    {
                        Object obj = aio[j];
                        Iterator iterator2;
                        Object obj2;
                        int i1;
                        if (((IO) (obj)).mKID == kernelid)
                        {
                            obj = ((IO) (obj)).mAllocation;
                        } else
                        {
                            obj = obj1;
                        }
                        j++;
                        obj1 = obj;
                    }
                    iterator2 = node1.mOutputs.iterator();
                    obj = null;
                    do
                    {
                        if (!iterator2.hasNext())
                        {
                            break;
                        }
                        obj2 = (ConnectLine)iterator2.next();
                        if (((ConnectLine) (obj2)).mFrom == kernelid)
                        {
                            obj = ((ConnectLine) (obj2)).mAllocation;
                        }
                    } while (true);
                    iterator2 = mOutputs;
                    i1 = iterator2.length;
                    for (j = 0; j < i1; j++)
                    {
                        obj2 = iterator2[j];
                        if (((IO) (obj2)).mKID == kernelid)
                        {
                            obj = ((IO) (obj2)).mAllocation;
                        }
                    }

                    kernelid.mScript.forEach(kernelid.mSlot, ((Allocation) (obj1)), ((Allocation) (obj)), null);
                }
            }
        }
    }

    public transient Object[] execute(Object aobj[])
    {
        int k = 0;
        if (aobj.length < mInputs2.size())
        {
            Log.e("ScriptGroup", (new StringBuilder()).append(toString()).append(" receives ").append(aobj.length).append(" inputs, ").append("less than expected ").append(mInputs2.size()).toString());
            return null;
        }
        if (aobj.length > mInputs2.size())
        {
            Log.i("ScriptGroup", (new StringBuilder()).append(toString()).append(" receives ").append(aobj.length).append(" inputs, ").append("more than expected ").append(mInputs2.size()).toString());
        }
        for (int i = 0; i < mInputs2.size(); i++)
        {
            Object obj = aobj[i];
            if ((obj instanceof Future) || (obj instanceof Input))
            {
                Log.e("ScriptGroup", (new StringBuilder()).append(toString()).append(": input ").append(i).append(" is a future or unbound value").toString());
                return null;
            }
            ((Input)mInputs2.get(i)).set(obj);
        }

        mRS.nScriptGroup2Execute(getID(mRS));
        Object aobj1[] = new Object[mOutputs2.length];
        Future afuture[] = mOutputs2;
        int l = afuture.length;
        for (int j = 0; k < l; j++)
        {
            Object obj1 = afuture[k].getValue();
            aobj = ((Object []) (obj1));
            if (obj1 instanceof Input)
            {
                aobj = ((Object []) (((Input)obj1).get()));
            }
            aobj1[j] = ((Object) (aobj));
            k++;
        }

        return aobj1;
    }

    public void setInput(Script.KernelID kernelid, Allocation allocation)
    {
        for (int i = 0; i < mInputs.length; i++)
        {
            if (mInputs[i].mKID == kernelid)
            {
                mInputs[i].mAllocation = allocation;
                if (!mUseIncSupp)
                {
                    mRS.nScriptGroupSetInput(getID(mRS), kernelid.getID(mRS), mRS.safeID(allocation));
                }
                return;
            }
        }

        throw new RSIllegalArgumentException("Script not found");
    }

    public void setOutput(Script.KernelID kernelid, Allocation allocation)
    {
        for (int i = 0; i < mOutputs.length; i++)
        {
            if (mOutputs[i].mKID == kernelid)
            {
                mOutputs[i].mAllocation = allocation;
                if (!mUseIncSupp)
                {
                    mRS.nScriptGroupSetOutput(getID(mRS), kernelid.getID(mRS), mRS.safeID(allocation));
                }
                return;
            }
        }

        throw new RSIllegalArgumentException("Script not found");
    }


/*
    static ArrayList access$002(ScriptGroup scriptgroup, ArrayList arraylist)
    {
        scriptgroup.mNodes = arraylist;
        return arraylist;
    }

*/


/*
    static boolean access$102(ScriptGroup scriptgroup, boolean flag)
    {
        scriptgroup.mUseIncSupp = flag;
        return flag;
    }

*/
}
