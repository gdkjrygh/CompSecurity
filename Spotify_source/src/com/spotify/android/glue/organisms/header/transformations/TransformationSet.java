// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header.transformations;

import dev;
import java.util.ArrayList;
import java.util.List;

public final class TransformationSet
    implements dev
{

    public ExecutionOrder a;
    public List b;

    public TransformationSet()
    {
        b = new ArrayList();
    }

    public final float a(float f)
    {
        return a.a(b, f);
    }

    private class ExecutionOrder extends Enum
    {

        public static final ExecutionOrder a;
        public static final ExecutionOrder b;
        private static final ExecutionOrder c[];

        public static ExecutionOrder valueOf(String s)
        {
            return (ExecutionOrder)Enum.valueOf(com/spotify/android/glue/organisms/header/transformations/TransformationSet$ExecutionOrder, s);
        }

        public static ExecutionOrder[] values()
        {
            return (ExecutionOrder[])c.clone();
        }

        abstract float a(List list, float f);

        static 
        {
            a = new ExecutionOrder("SEQUENTIAL") {

                final float a(List list, float f)
                {
                    for (list = list.iterator(); list.hasNext();)
                    {
                        f = ((dev)list.next()).a(f);
                    }

                    return f;
                }

            };
            b = new ExecutionOrder("INDEPENDENT") {

                final float a(List list, float f)
                {
                    for (list = list.iterator(); list.hasNext(); ((dev)list.next()).a(f)) { }
                    return f;
                }

            };
            c = (new ExecutionOrder[] {
                a, b
            });
        }

        private ExecutionOrder(String s, int i)
        {
            super(s, i);
        }

        ExecutionOrder(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}
