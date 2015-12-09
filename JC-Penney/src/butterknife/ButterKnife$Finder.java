// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.List;

// Referenced classes of package butterknife:
//            ImmutableList

public abstract class <init> extends Enum
{

    private static final DIALOG $VALUES[];
    public static final DIALOG ACTIVITY;
    public static final DIALOG DIALOG;
    public static final DIALOG VIEW;

    public static transient Object[] arrayOf(Object aobj[])
    {
        return aobj;
    }

    public static transient List listOf(Object aobj[])
    {
        return new ImmutableList(aobj);
    }

    public static > valueOf(String s)
    {
        return (>)Enum.valueOf(butterknife/ButterKnife$Finder, s);
    }

    public static >[] values()
    {
        return (>[])$VALUES.clone();
    }

    public Object castParam(Object obj, String s, int i, String s1, int j)
    {
        return obj;
    }

    public Object castView(View view, int i, String s)
    {
        return view;
    }

    public Object findOptionalView(Object obj, int i, String s)
    {
        return castView(findView(obj, i), i, s);
    }

    public Object findRequiredView(Object obj, int i, String s)
    {
        Object obj1 = findOptionalView(obj, i, s);
        if (obj1 == null)
        {
            obj = getContext(obj).getResources().getResourceEntryName(i);
            throw new IllegalStateException((new StringBuilder()).append("Required view '").append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Optional' annotation.").toString());
        } else
        {
            return obj1;
        }
    }

    protected abstract View findView(Object obj, int i);

    protected abstract Context getContext(Object obj);

    static 
    {
        class _cls1 extends ButterKnife.Finder
        {

            protected View findView(Object obj, int i)
            {
                return ((View)obj).findViewById(i);
            }

            protected Context getContext(Object obj)
            {
                return ((View)obj).getContext();
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        VIEW = new _cls1("VIEW", 0);
        class _cls2 extends ButterKnife.Finder
        {

            protected View findView(Object obj, int i)
            {
                return ((Activity)obj).findViewById(i);
            }

            protected Context getContext(Object obj)
            {
                return (Activity)obj;
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        ACTIVITY = new _cls2("ACTIVITY", 1);
        class _cls3 extends ButterKnife.Finder
        {

            protected View findView(Object obj, int i)
            {
                return ((Dialog)obj).findViewById(i);
            }

            protected Context getContext(Object obj)
            {
                return ((Dialog)obj).getContext();
            }

            _cls3(String s, int i)
            {
                super(s, i, null);
            }
        }

        DIALOG = new _cls3("DIALOG", 2);
        $VALUES = (new .VALUES[] {
            VIEW, ACTIVITY, DIALOG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }

    (String s, int i,  )
    {
        this(s, i);
    }
}
