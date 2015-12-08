// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import java.lang.annotation.Annotation;

public interface OnPageChange
    extends Annotation
{
    public static final class Callback extends Enum
    {

        private static final Callback $VALUES[];
        public static final Callback PAGE_SCROLLED;
        public static final Callback PAGE_SCROLL_STATE_CHANGED;
        public static final Callback PAGE_SELECTED;

        public static Callback valueOf(String s)
        {
            return (Callback)Enum.valueOf(butterknife/OnPageChange$Callback, s);
        }

        public static Callback[] values()
        {
            return (Callback[])$VALUES.clone();
        }

        static 
        {
            PAGE_SELECTED = new Callback("PAGE_SELECTED", 0);
            PAGE_SCROLLED = new Callback("PAGE_SCROLLED", 1);
            PAGE_SCROLL_STATE_CHANGED = new Callback("PAGE_SCROLL_STATE_CHANGED", 2);
            $VALUES = (new Callback[] {
                PAGE_SELECTED, PAGE_SCROLLED, PAGE_SCROLL_STATE_CHANGED
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
