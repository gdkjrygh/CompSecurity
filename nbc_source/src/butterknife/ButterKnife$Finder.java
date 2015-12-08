// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package butterknife:
//            ButterKnife, ImmutableList

public static abstract class <init> extends Enum
{

    private static final DIALOG $VALUES[];
    public static final DIALOG ACTIVITY;
    public static final DIALOG DIALOG;
    public static final DIALOG VIEW;

    public static transient Object[] arrayOf(Object aobj[])
    {
        return filterNull(aobj);
    }

    private static Object[] filterNull(Object aobj[])
    {
        int j = 0;
        for (int i = 0; i < aobj.length;)
        {
            Object obj = aobj[i];
            int k = j;
            if (obj != null)
            {
                aobj[j] = obj;
                k = j + 1;
            }
            i++;
            j = k;
        }

        return Arrays.copyOfRange(aobj, 0, j);
    }

    public static transient List listOf(Object aobj[])
    {
        return new ImmutableList(filterNull(aobj));
    }

    public static filterNull valueOf(String s)
    {
        return (filterNull)Enum.valueOf(butterknife/ButterKnife$Finder, s);
    }

    public static filterNull[] values()
    {
        return (filterNull[])$VALUES.clone();
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
            throw new IllegalStateException((new StringBuilder()).append("Required view '").append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Nullable' annotation.").toString());
        } else
        {
            return obj1;
        }
    }

    protected abstract View findView(Object obj, int i);

    public abstract Context getContext(Object obj);

    static 
    {
        VIEW = new ButterKnife.Finder("VIEW", 0) {

            protected View findView(Object obj, int i)
            {
                return ((View)obj).findViewById(i);
            }

            public Context getContext(Object obj)
            {
                return ((View)obj).getContext();
            }

        };
        ACTIVITY = new ButterKnife.Finder("ACTIVITY", 1) {

            protected View findView(Object obj, int i)
            {
                return ((Activity)obj).findViewById(i);
            }

            public Context getContext(Object obj)
            {
                return (Activity)obj;
            }

        };
        DIALOG = new ButterKnife.Finder("DIALOG", 2) {

            protected View findView(Object obj, int i)
            {
                return ((Dialog)obj).findViewById(i);
            }

            public Context getContext(Object obj)
            {
                return ((Dialog)obj).getContext();
            }

        };
        $VALUES = (new .VALUES[] {
            VIEW, ACTIVITY, DIALOG
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
