// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.view.View;

// Referenced classes of package butterknife:
//            ButterKnife

public static abstract class <init> extends Enum
{

    private static final ACTIVITY $VALUES[];
    public static final ACTIVITY ACTIVITY;
    public static final ACTIVITY VIEW;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(butterknife/ButterKnife$Finder, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    public abstract View findById(Object obj, int i);

    static 
    {
        class _cls1 extends ButterKnife.Finder
        {

            public final View findById(Object obj, int i)
            {
                return ((View)obj).findViewById(i);
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        VIEW = new _cls1("VIEW", 0);
        class _cls2 extends ButterKnife.Finder
        {

            public final View findById(Object obj, int i)
            {
                return ((Activity)obj).findViewById(i);
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        ACTIVITY = new _cls2("ACTIVITY", 1);
        $VALUES = (new .VALUES[] {
            VIEW, ACTIVITY
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
