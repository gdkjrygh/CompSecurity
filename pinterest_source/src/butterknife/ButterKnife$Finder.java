// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife;

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

    public abstract View a(Object obj, int i);

    public final View a(Object obj, int i, String s)
    {
        View view = a(obj, i);
        if (view == null)
        {
            obj = a(obj).getResources().getResourceEntryName(i);
            throw new IllegalStateException((new StringBuilder("Required view '")).append(((String) (obj))).append("' with ID ").append(i).append(" for ").append(s).append(" was not found. If this view is optional add '@Optional' annotation.").toString());
        } else
        {
            return view;
        }
    }

    static 
    {
        class _cls1 extends ButterKnife.Finder
        {

            protected final Context a(Object obj)
            {
                return ((View)obj).getContext();
            }

            public final View a(Object obj, int i)
            {
                return ((View)obj).findViewById(i);
            }

            _cls1(String s)
            {
                super(s, 0, (byte)0);
            }
        }

        a = new _cls1("VIEW");
        class _cls2 extends ButterKnife.Finder
        {

            protected final Context a(Object obj)
            {
                return (Activity)obj;
            }

            public final View a(Object obj, int i)
            {
                return ((Activity)obj).findViewById(i);
            }

            _cls2(String s)
            {
                super(s, 1, (byte)0);
            }
        }

        b = new _cls2("ACTIVITY");
        class _cls3 extends ButterKnife.Finder
        {

            protected final Context a(Object obj)
            {
                return ((Dialog)obj).getContext();
            }

            public final View a(Object obj, int i)
            {
                return ((Dialog)obj).findViewById(i);
            }

            _cls3(String s)
            {
                super(s, 2, (byte)0);
            }
        }

        c = new _cls3("DIALOG");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }

    (String s, int i, byte byte0)
    {
        this(s, i);
    }
}
