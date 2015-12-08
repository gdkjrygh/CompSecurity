// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import java.lang.annotation.Annotation;

public interface OnItemSelected
    extends Annotation
{
    public static final class Callback extends Enum
    {

        private static final Callback $VALUES[];
        public static final Callback ITEM_SELECTED;
        public static final Callback NOTHING_SELECTED;

        public static Callback valueOf(String s)
        {
            return (Callback)Enum.valueOf(butterknife/OnItemSelected$Callback, s);
        }

        public static Callback[] values()
        {
            return (Callback[])$VALUES.clone();
        }

        static 
        {
            ITEM_SELECTED = new Callback("ITEM_SELECTED", 0);
            NOTHING_SELECTED = new Callback("NOTHING_SELECTED", 1);
            $VALUES = (new Callback[] {
                ITEM_SELECTED, NOTHING_SELECTED
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
