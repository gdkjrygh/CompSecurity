// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import java.util.ArrayList;

class ClusterTransitions
{

    final ArrayList a;
    final ArrayList b;

    private ClusterTransitions(Builder builder)
    {
        a = Builder.a(builder);
        b = Builder.b(builder);
    }

    ClusterTransitions(Builder builder, byte byte0)
    {
        this(builder);
    }

    private class Builder
    {

        private final WeakReference a;
        private final ArrayList b;
        private final ArrayList c = new ArrayList();
        private final ArrayList d = new ArrayList();

        static ArrayList a(Builder builder)
        {
            return builder.c;
        }

        static ArrayList b(Builder builder)
        {
            return builder.d;
        }

        final void a(ClusterPoint clusterpoint)
        {
            Projection projection;
            AnimatedTransition animatedtransition;
            ClusterPoint clusterpoint1;
            InputPoint inputpoint;
            boolean flag;
            boolean flag1;
            Iterator iterator;
            Iterator iterator1;
            Iterator iterator2;
            if (a != null)
            {
                projection = (Projection)a.get();
            } else
            {
                projection = null;
            }
            if (clusterpoint == null || projection == null)
            {
                break MISSING_BLOCK_LABEL_232;
            }
            if (b == null)
            {
                break MISSING_BLOCK_LABEL_215;
            }
            iterator = b.iterator();
            flag = false;
_L5:
            flag1 = flag;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_218;
            }
            clusterpoint1 = (ClusterPoint)iterator.next();
            iterator1 = clusterpoint1.d().iterator();
_L2:
            do
            {
                if (!iterator1.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                inputpoint = (InputPoint)iterator1.next();
            } while (!clusterpoint.b(inputpoint));
            iterator2 = c.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break MISSING_BLOCK_LABEL_178;
                }
                animatedtransition = (AnimatedTransition)iterator2.next();
            } while (!animatedtransition.b(inputpoint) || !animatedtransition.a(inputpoint));
_L3:
            if (animatedtransition != null)
            {
                animatedtransition.c(inputpoint);
            } else
            {
                AnimatedTransition animatedtransition1 = new AnimatedTransition(projection, clusterpoint1, inputpoint, clusterpoint);
                c.add(animatedtransition1);
                flag = true;
            }
            if (true) goto _L2; else goto _L1
_L1:
            continue; /* Loop/switch isn't completed */
            animatedtransition = null;
              goto _L3
            flag1 = false;
            if (!flag1)
            {
                d.add(clusterpoint);
            }
            return;
            if (true) goto _L5; else goto _L4
_L4:
        }

        Builder(Projection projection, ArrayList arraylist)
        {
            a = new WeakReference(projection);
            b = arraylist;
        }
    }

}
