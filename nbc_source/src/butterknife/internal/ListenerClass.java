// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.lang.annotation.Annotation;

// Referenced classes of package butterknife.internal:
//            ListenerMethod

public interface ListenerClass
    extends Annotation
{
    public static final class NONE extends Enum
    {

        private static final NONE $VALUES[] = new NONE[0];

        public static NONE valueOf(String s)
        {
            return (NONE)Enum.valueOf(butterknife/internal/ListenerClass$NONE, s);
        }

        public static NONE[] values()
        {
            return (NONE[])$VALUES.clone();
        }


        private NONE(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Class callbacks();

    public abstract int genericArguments();

    public abstract ListenerMethod[] method();

    public abstract String setter();

    public abstract String targetType();

    public abstract String type();
}
