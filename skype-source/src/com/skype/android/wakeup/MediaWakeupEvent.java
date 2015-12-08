// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import com.skype.MediaDocument;

public class MediaWakeupEvent
{
    public static final class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        private static final Type c[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/skype/android/wakeup/MediaWakeupEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        static 
        {
            a = new Type("UPLOAD", 0);
            b = new Type("DOWNLOAD", 1);
            c = (new Type[] {
                a, b
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private MediaDocument a;
    private String b;
    private long c;
    private Type d;

    public MediaWakeupEvent(MediaDocument mediadocument, String s, long l, Type type)
    {
        a = mediadocument;
        b = s;
        c = l;
        d = type;
    }

    public final MediaDocument a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final long c()
    {
        return c;
    }

    public final Type d()
    {
        return d;
    }
}
