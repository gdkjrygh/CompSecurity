// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.v4.app:
//            Fragment, p

public class e extends LayoutInflater
{

    private static final String a[] = {
        "android.widget.", "android.webkit."
    };
    private LayoutInflater b;
    private Fragment c;

    public e(LayoutInflater layoutinflater, Fragment fragment)
    {
        super(layoutinflater.getContext());
        b = layoutinflater;
        c = fragment;
    }

    public LayoutInflater cloneInContext(Context context)
    {
        return new e(b.cloneInContext(context), c);
    }

    public Context getContext()
    {
        return b.getContext();
    }

    public android.view.LayoutInflater.Filter getFilter()
    {
        return b.getFilter();
    }

    public View inflate(XmlPullParser xmlpullparser, ViewGroup viewgroup, boolean flag)
    {
        p p1 = c.m();
        q q = p1.i();
        p1.a(c.q());
        xmlpullparser = b.inflate(xmlpullparser, viewgroup, flag);
        p1.a(q);
        return xmlpullparser;
    }

    protected View onCreateView(String s, AttributeSet attributeset)
    {
        String as[];
        int i;
        int j;
        as = a;
        j = as.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj = as[i];
        obj = b.createView(s, ((String) (obj)), attributeset);
        if (obj != null)
        {
            return ((View) (obj));
        }
        continue; /* Loop/switch isn't completed */
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        i++;
          goto _L3
_L2:
        return super.onCreateView(s, attributeset);
    }

    public void setFactory(android.view.LayoutInflater.Factory factory)
    {
        super.setFactory(factory);
        b.setFactory(factory);
    }

    public void setFactory2(android.view.LayoutInflater.Factory2 factory2)
    {
        super.setFactory2(factory2);
        b.setFactory2(factory2);
    }

    public void setFilter(android.view.LayoutInflater.Filter filter)
    {
        super.setFilter(filter);
        b.setFilter(filter);
    }

}
