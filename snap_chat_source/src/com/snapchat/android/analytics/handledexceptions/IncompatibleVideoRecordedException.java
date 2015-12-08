// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.handledexceptions;

import java.util.Iterator;
import java.util.List;

public final class IncompatibleVideoRecordedException extends Exception
{
    public static final class IncompatibleVideoType extends Enum
    {

        private static final IncompatibleVideoType $VALUES[];
        public static final IncompatibleVideoType AMR_NB;
        public static final IncompatibleVideoType H263;

        public static IncompatibleVideoType valueOf(String s)
        {
            return (IncompatibleVideoType)Enum.valueOf(com/snapchat/android/analytics/handledexceptions/IncompatibleVideoRecordedException$IncompatibleVideoType, s);
        }

        public static IncompatibleVideoType[] values()
        {
            return (IncompatibleVideoType[])$VALUES.clone();
        }

        static 
        {
            AMR_NB = new IncompatibleVideoType("AMR_NB", 0);
            H263 = new IncompatibleVideoType("H263", 1);
            $VALUES = (new IncompatibleVideoType[] {
                AMR_NB, H263
            });
        }

        private IncompatibleVideoType(String s, int i)
        {
            super(s, i);
        }
    }


    public IncompatibleVideoRecordedException(List list)
    {
        super(a(list));
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder("Incompatibilities: ");
        Iterator iterator = list.iterator();
        for (list = ""; iterator.hasNext(); list = " + ")
        {
            IncompatibleVideoType incompatiblevideotype = (IncompatibleVideoType)iterator.next();
            stringbuilder.append(list);
            stringbuilder.append(incompatiblevideotype.name());
        }

        return stringbuilder.toString();
    }
}
