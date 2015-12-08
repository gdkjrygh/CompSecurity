// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.a.a;
import com.androidquery.callback.AbstractAjaxCallback;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.BitmapAjaxCallback;
import com.androidquery.util.Common;
import com.androidquery.util.c;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;
import org.apache.http.HttpHost;

public abstract class b
    implements c
{

    private static final Class l[] = {
        android/view/View
    };
    private static Class m[];
    private static Class n[];
    private static final Class o[];
    private static Class p[];
    private static final Class q[];
    private static Class r[];
    private static WeakHashMap s = new WeakHashMap();
    protected View a;
    protected Object b;
    protected a c;
    private View e;
    private Activity f;
    private Context g;
    private com.androidquery.callback.c h;
    private int i;
    private HttpHost j;
    private Constructor k;

    public b(Activity activity)
    {
        i = 0;
        f = activity;
    }

    public b(Context context)
    {
        i = 0;
        g = context;
    }

    public b(View view)
    {
        i = 0;
        e = view;
        a = view;
    }

    private View f(int i1)
    {
        View view = null;
        if (e != null)
        {
            view = e.findViewById(i1);
        } else
        if (f != null)
        {
            return f.findViewById(i1);
        }
        return view;
    }

    private Constructor j()
    {
        if (k == null)
        {
            try
            {
                k = getClass().getConstructor(new Class[] {
                    android/view/View
                });
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return k;
    }

    protected b a()
    {
        return this;
    }

    public b a(int i1)
    {
        return a(f(i1));
    }

    public b a(Dialog dialog)
    {
        if (dialog != null)
        {
            try
            {
                dialog.show();
                s.put(dialog, null);
            }
            // Misplaced declaration of an exception variable
            catch (Dialog dialog) { }
        }
        return a();
    }

    public b a(android.view.View.OnClickListener onclicklistener)
    {
        if (a != null)
        {
            a.setOnClickListener(onclicklistener);
        }
        return a();
    }

    protected b a(View view)
    {
        view = (b)j().newInstance(new Object[] {
            view
        });
        view.f = f;
        return view;
        Exception exception;
        exception;
        view = null;
_L2:
        exception.printStackTrace();
        return view;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected b a(AbstractAjaxCallback abstractajaxcallback)
    {
        if (c != null)
        {
            abstractajaxcallback.a(c);
        }
        if (b != null)
        {
            abstractajaxcallback.a(b);
        }
        if (h != null)
        {
            abstractajaxcallback.a(h);
        }
        abstractajaxcallback.b(i);
        if (j != null)
        {
            abstractajaxcallback.a(j.getHostName(), j.getPort());
        }
        if (f != null)
        {
            abstractajaxcallback.a(f);
        } else
        {
            abstractajaxcallback.a(h());
        }
        i();
        return a();
    }

    public b a(AjaxCallback ajaxcallback)
    {
        return a(((AbstractAjaxCallback) (ajaxcallback)));
    }

    public b a(BitmapAjaxCallback bitmapajaxcallback)
    {
        if (a instanceof ImageView)
        {
            bitmapajaxcallback.a((ImageView)a);
            a(((AbstractAjaxCallback) (bitmapajaxcallback)));
        }
        return a();
    }

    public b a(File file, int i1)
    {
        return a(file, true, i1, ((BitmapAjaxCallback) (null)));
    }

    public b a(File file, boolean flag, int i1, BitmapAjaxCallback bitmapajaxcallback)
    {
        if (bitmapajaxcallback == null)
        {
            bitmapajaxcallback = new BitmapAjaxCallback();
        }
        bitmapajaxcallback.a(file);
        String s1 = null;
        if (file != null)
        {
            s1 = file.getAbsolutePath();
        }
        return a(s1, flag, true, i1, 0, bitmapajaxcallback);
    }

    public b a(CharSequence charsequence)
    {
        if (a instanceof TextView)
        {
            ((TextView)a).setText(charsequence);
        }
        return a();
    }

    public b a(String s1)
    {
        return a(s1, true, true, 0, 0);
    }

    public b a(String s1, Class class1, AjaxCallback ajaxcallback)
    {
        ((AjaxCallback)ajaxcallback.a(class1)).a(s1);
        return a(ajaxcallback);
    }

    public b a(String s1, boolean flag, boolean flag1)
    {
        return a(s1, flag, flag1, 0, 0);
    }

    public b a(String s1, boolean flag, boolean flag1, int i1, int j1)
    {
        return a(s1, flag, flag1, i1, j1, null, 0);
    }

    public b a(String s1, boolean flag, boolean flag1, int i1, int j1, Bitmap bitmap, int k1)
    {
        return a(s1, flag, flag1, i1, j1, bitmap, k1, 0.0F);
    }

    public b a(String s1, boolean flag, boolean flag1, int i1, int j1, Bitmap bitmap, int k1, 
            float f1)
    {
        return a(s1, flag, flag1, i1, j1, bitmap, k1, f1, 0, null);
    }

    protected b a(String s1, boolean flag, boolean flag1, int i1, int j1, Bitmap bitmap, int k1, 
            float f1, int l1, String s2)
    {
        if (a instanceof ImageView)
        {
            BitmapAjaxCallback.a(f, h(), (ImageView)a, s1, flag, flag1, i1, j1, bitmap, k1, f1, 3.402823E+38F, b, c, i, l1, j, s2);
            i();
        }
        return a();
    }

    public b a(String s1, boolean flag, boolean flag1, int i1, int j1, BitmapAjaxCallback bitmapajaxcallback)
    {
        ((BitmapAjaxCallback)((BitmapAjaxCallback)bitmapajaxcallback.d(i1).e(j1).a(s1)).b(flag)).a(flag1);
        return a(bitmapajaxcallback);
    }

    public boolean a(int i1, View view, ViewGroup viewgroup, String s1)
    {
        if (viewgroup instanceof ExpandableListView)
        {
            throw new IllegalArgumentException("Please use the other shouldDelay methods for expandable list.");
        } else
        {
            return Common.a(i1, view, viewgroup, s1);
        }
    }

    public View b()
    {
        return a;
    }

    public b b(int i1)
    {
        return b(f(i1));
    }

    public b b(Dialog dialog)
    {
        if (dialog != null)
        {
            try
            {
                s.remove(dialog);
                dialog.dismiss();
            }
            // Misplaced declaration of an exception variable
            catch (Dialog dialog) { }
        }
        return a();
    }

    public b b(View view)
    {
        a = view;
        i();
        return a();
    }

    public b c()
    {
        return e(8);
    }

    public b c(int i1)
    {
        if (a instanceof TextView)
        {
            ((TextView)a).setText(i1);
        }
        return a();
    }

    public b d()
    {
        return e(4);
    }

    public b d(int i1)
    {
        if (a instanceof ImageView)
        {
            ImageView imageview = (ImageView)a;
            imageview.setTag(0x40ff0001, null);
            if (i1 == 0)
            {
                imageview.setImageBitmap(null);
            } else
            {
                imageview.setImageResource(i1);
            }
        }
        return a();
    }

    public b e()
    {
        return e(0);
    }

    public b e(int i1)
    {
        if (a != null && a.getVisibility() != i1)
        {
            a.setVisibility(i1);
        }
        return a();
    }

    public boolean f()
    {
        return a != null;
    }

    public TextView g()
    {
        return (TextView)a;
    }

    public Context h()
    {
        if (f != null)
        {
            return f;
        }
        if (e != null)
        {
            return e.getContext();
        } else
        {
            return g;
        }
    }

    protected void i()
    {
        c = null;
        b = null;
        h = null;
        i = 0;
        j = null;
    }

    static 
    {
        m = (new Class[] {
            android/widget/AdapterView, android/view/View, Integer.TYPE, Long.TYPE
        });
        n = (new Class[] {
            android/widget/AbsListView, Integer.TYPE
        });
        o = (new Class[] {
            java/lang/CharSequence, Integer.TYPE, Integer.TYPE, Integer.TYPE
        });
        p = (new Class[] {
            Integer.TYPE, Integer.TYPE
        });
        q = (new Class[] {
            Integer.TYPE
        });
        r = (new Class[] {
            Integer.TYPE, android/graphics/Paint
        });
    }
}
