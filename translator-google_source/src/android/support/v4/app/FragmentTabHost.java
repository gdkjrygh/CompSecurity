// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ad, r, ae, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a = new ArrayList();
    private FrameLayout b;
    private Context c;
    private r d;
    private int e;
    private android.widget.TabHost.OnTabChangeListener f;
    private ad g;
    private boolean h;

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        e = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    private ae a(String s, ae ae1)
    {
        ad ad1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            ad ad2 = (ad)a.get(i);
            if (ad2.a.equals(s))
            {
                ad1 = ad2;
            }
        }

        if (ad1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = ae1;
        if (g != ad1)
        {
            s = ae1;
            if (ae1 == null)
            {
                s = d.a();
            }
            if (g != null && g.d != null)
            {
                s.b(g.d);
            }
            if (ad1 != null)
            {
                if (ad1.d == null)
                {
                    ad1.d = Fragment.a(c, ad1.b.getName(), ad1.c);
                    s.a(e, ad1.d, ad1.a);
                } else
                {
                    s.c(ad1.d);
                }
            }
            g = ad1;
        }
        return s;
    }

    private void a()
    {
        if (b == null)
        {
            b = (FrameLayout)findViewById(e);
            if (b == null)
            {
                throw new IllegalStateException((new StringBuilder("No tab content FrameLayout found for id ")).append(e).toString());
            }
        }
    }

    private void a(Context context)
    {
        if (findViewById(0x1020013) == null)
        {
            LinearLayout linearlayout = new LinearLayout(context);
            linearlayout.setOrientation(1);
            addView(linearlayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
            Object obj = new TabWidget(context);
            ((TabWidget) (obj)).setId(0x1020013);
            ((TabWidget) (obj)).setOrientation(0);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
            obj = new FrameLayout(context);
            ((FrameLayout) (obj)).setId(0x1020011);
            linearlayout.addView(((android.view.View) (obj)), new android.widget.LinearLayout.LayoutParams(0, 0, 0.0F));
            context = new FrameLayout(context);
            b = context;
            b.setId(e);
            linearlayout.addView(context, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F));
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        ae ae1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            ad ad1 = (ad)a.get(i);
            ad1.d = d.a(ad1.a);
            ae ae2 = ae1;
            if (ad1.d != null)
            {
                ae2 = ae1;
                if (!ad1.d.B)
                {
                    if (ad1.a.equals(s))
                    {
                        g = ad1;
                        ae2 = ae1;
                    } else
                    {
                        ae2 = ae1;
                        if (ae1 == null)
                        {
                            ae2 = d.a();
                        }
                        ae2.b(ad1.d);
                    }
                }
            }
            i++;
            ae1 = ae2;
        }
        h = true;
        ae1 = a(s, ae1);
        if (ae1 != null)
        {
            ae1.a();
            d.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).a);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (h)
        {
            ae ae1 = a(s, null);
            if (ae1 != null)
            {
                ae1.a();
            }
        }
        if (f != null)
        {
            f.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        f = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setup(Context context, r r1)
    {
        a(context);
        super.setup();
        c = context;
        d = r1;
        a();
    }

    public void setup(Context context, r r1, int i)
    {
        a(context);
        super.setup();
        c = context;
        d = r1;
        e = i;
        a();
        b.setId(i);
        if (getId() == -1)
        {
            setId(0x1020012);
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ac();
        String a;

        public String toString()
        {
            return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
