// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import java.lang.annotation.Annotation;

public interface OnTextChanged
    extends Annotation
{
    public static final class Callback extends Enum
    {

        private static final Callback $VALUES[];
        public static final Callback AFTER_TEXT_CHANGED;
        public static final Callback BEFORE_TEXT_CHANGED;
        public static final Callback TEXT_CHANGED;

        public static Callback valueOf(String s)
        {
            return (Callback)Enum.valueOf(butterknife/OnTextChanged$Callback, s);
        }

        public static Callback[] values()
        {
            return (Callback[])$VALUES.clone();
        }

        static 
        {
            TEXT_CHANGED = new Callback("TEXT_CHANGED", 0);
            BEFORE_TEXT_CHANGED = new Callback("BEFORE_TEXT_CHANGED", 1);
            AFTER_TEXT_CHANGED = new Callback("AFTER_TEXT_CHANGED", 2);
            $VALUES = (new Callback[] {
                TEXT_CHANGED, BEFORE_TEXT_CHANGED, AFTER_TEXT_CHANGED
            });
        }

        private Callback(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Callback callback();

    public abstract int[] value();
}
