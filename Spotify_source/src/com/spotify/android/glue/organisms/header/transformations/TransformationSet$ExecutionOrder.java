// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.organisms.header.transformations;

import dev;
import java.util.Iterator;
import java.util.List;

public abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/android/glue/organisms/header/transformations/TransformationSet$ExecutionOrder, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    abstract float a(List list, float f);

    static 
    {
        a = new TransformationSet.ExecutionOrder("SEQUENTIAL") {

            final float a(List list, float f)
            {
                for (list = list.iterator(); list.hasNext();)
                {
                    f = ((dev)list.next()).a(f);
                }

                return f;
            }

        };
        b = new TransformationSet.ExecutionOrder("INDEPENDENT") {

            final float a(List list, float f)
            {
                for (list = list.iterator(); list.hasNext(); ((dev)list.next()).a(f)) { }
                return f;
            }

        };
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
