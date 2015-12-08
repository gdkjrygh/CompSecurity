// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.annotations;

import java.lang.annotation.Annotation;

public interface UiThread
    extends Annotation
{
    public static final class Propagation extends Enum
    {

        public static final Propagation a;
        public static final Propagation b;
        private static final Propagation c[];

        public static Propagation valueOf(String s)
        {
            return (Propagation)Enum.valueOf(org/androidannotations/annotations/UiThread$Propagation, s);
        }

        public static Propagation[] values()
        {
            return (Propagation[])c.clone();
        }

        static 
        {
            a = new Propagation("ENQUEUE", 0);
            b = new Propagation("REUSE", 1);
            c = (new Propagation[] {
                a, b
            });
        }

        private Propagation(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract long a();

    public abstract Propagation b();
}
