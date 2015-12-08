// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            GridLayout

class tCount
{

    static final boolean $assertionsDisabled;
    .assertionsDisabled arcsByVertex[][];
    int cursor;
    .assertionsDisabled result[];
    final .assertionsDisabled this$1;
    final .assertionsDisabled val$arcs[];
    int visited[];

    tCount[] sort()
    {
        int i = 0;
        for (int j = arcsByVertex.length; i < j; i++)
        {
            walk(i);
        }

        if (!$assertionsDisabled && cursor != -1)
        {
            throw new AssertionError();
        } else
        {
            return result;
        }
    }

    void walk(int i)
    {
        visited[i];
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 116;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        visited[i] = 1;
        result aresult[] = arcsByVertex[i];
        int k = aresult.length;
        for (int j = 0; j < k; j++)
        {
            result result1 = aresult[j];
            walk(result1.n.max);
            result aresult1[] = result;
            int l = cursor;
            cursor = l - 1;
            aresult1[l] = result1;
        }

        visited[i] = 2;
        return;
_L3:
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static 
    {
        boolean flag;
        if (!android/support/v7/widget/GridLayout.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    l()
    {
        this$1 = final_l;
        val$arcs = _5B_Landroid.support.v7.widget.l.arcs.this;
        super();
        result = new result[val$arcs.length];
        cursor = result.length - 1;
        arcsByVertex = oupArcsByFirstVertex(val$arcs);
        visited = new int[tCount() + 1];
    }
}
