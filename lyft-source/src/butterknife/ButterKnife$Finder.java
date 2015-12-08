// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;

public abstract class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(butterknife/ButterKnife$Finder, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    protected abstract Context a(Object obj);

    protected abstract View a(Object obj, int i);

    public Object a(View view, int i, String s)
    {
        return view;
    }

    public Object a(Object obj, int i, String s)
    {
        Object obj1 = b(obj, i, s);
        if (obj1 == null)
        {
            obj = a(obj).getResources().getResourceEntryName(i);
            throw new IllegalStateException((new StringBuilder()).append("Required view '").append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Optional' annotation.").toString());
        } else
        {
            return obj1;
        }
    }

    public Object b(Object obj, int i, String s)
    {
        return a(a(obj, i), i, s);
    }

    static 
    {
        a = new ButterKnife.Finder("VIEW", 0) {

            protected Context a(Object obj)
            {
                return ((View)obj).getContext();
            }

            protected View a(Object obj, int i)
            {
                return ((View)obj).findViewById(i);
            }

        };
        b = new ButterKnife.Finder("ACTIVITY", 1) {

            protected Context a(Object obj)
            {
                return (Activity)obj;
            }

            protected View a(Object obj, int i)
            {
                return ((Activity)obj).findViewById(i);
            }

        };
        c = new ButterKnife.Finder("DIALOG", 2) {

            protected Context a(Object obj)
            {
                return ((Dialog)obj).getContext();
            }

            protected View a(Object obj, int i)
            {
                return ((Dialog)obj).findViewById(i);
            }

        };
        d = (new d[] {
            a, b, c
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
