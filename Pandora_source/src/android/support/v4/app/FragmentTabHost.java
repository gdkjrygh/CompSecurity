// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            h, k, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i)
            {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        String a;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentTabHost.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static class a
        implements android.widget.TabHost.TabContentFactory
    {

        private final Context a;

        public View createTabContent(String s)
        {
            s = new View(a);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public a(Context context)
        {
            a = context;
        }
    }

    static final class b
    {

        private final String a;
        private final Class b;
        private final Bundle c;
        private Fragment d;

        static Fragment a(b b1)
        {
            return b1.d;
        }

        static Fragment a(b b1, Fragment fragment)
        {
            b1.d = fragment;
            return fragment;
        }

        static String b(b b1)
        {
            return b1.a;
        }

        static Class c(b b1)
        {
            return b1.b;
        }

        static Bundle d(b b1)
        {
            return b1.c;
        }

        b(String s, Class class1, Bundle bundle)
        {
            a = s;
            b = class1;
            c = bundle;
        }
    }


    private final ArrayList a;
    private FrameLayout b;
    private Context c;
    private h d;
    private int e;
    private android.widget.TabHost.OnTabChangeListener f;
    private b g;
    private boolean h;

    public FragmentTabHost(Context context)
    {
        super(context, null);
        a = new ArrayList();
        a(context, ((AttributeSet) (null)));
    }

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        a(context, attributeset);
    }

    private k a(String s, k k1)
    {
        b b1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            b b2 = (b)a.get(i);
            if (b.b(b2).equals(s))
            {
                b1 = b2;
            }
        }

        if (b1 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No tab known for tag ").append(s).toString());
        }
        s = k1;
        if (g != b1)
        {
            s = k1;
            if (k1 == null)
            {
                s = d.a();
            }
            if (g != null && b.a(g) != null)
            {
                s.d(b.a(g));
            }
            if (b1 != null)
            {
                if (b.a(b1) == null)
                {
                    b.a(b1, Fragment.instantiate(c, b.c(b1).getName(), b.d(b1)));
                    s.a(e, b.a(b1), b.b(b1));
                } else
                {
                    s.e(b.a(b1));
                }
            }
            g = b1;
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
                throw new IllegalStateException((new StringBuilder()).append("No tab content FrameLayout found for id ").append(e).toString());
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
            linearlayout.addView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
            obj = new FrameLayout(context);
            ((FrameLayout) (obj)).setId(0x1020011);
            linearlayout.addView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(0, 0, 0.0F));
            context = new FrameLayout(context);
            b = context;
            b.setId(e);
            linearlayout.addView(context, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F));
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        e = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    public void a(Context context, h h1, int i)
    {
        a(context);
        super.setup();
        c = context;
        d = h1;
        e = i;
        a();
        b.setId(i);
        if (getId() == -1)
        {
            setId(0x1020012);
        }
    }

    public void a(android.widget.TabHost.TabSpec tabspec, Class class1, Bundle bundle)
    {
        tabspec.setContent(new a(c));
        String s = tabspec.getTag();
        class1 = new b(s, class1, bundle);
        if (h)
        {
            b.a(class1, d.a(s));
            if (b.a(class1) != null && !b.a(class1).isDetached())
            {
                bundle = d.a();
                bundle.d(b.a(class1));
                bundle.b();
            }
        }
        a.add(class1);
        addTab(tabspec);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        k k1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            b b1 = (b)a.get(i);
            b.a(b1, d.a(b.b(b1)));
            k k2 = k1;
            if (b.a(b1) != null)
            {
                k2 = k1;
                if (!b.a(b1).isDetached())
                {
                    if (b.b(b1).equals(s))
                    {
                        g = b1;
                        k2 = k1;
                    } else
                    {
                        k2 = k1;
                        if (k1 == null)
                        {
                            k2 = d.a();
                        }
                        k2.d(b.a(b1));
                    }
                }
            }
            i++;
            k1 = k2;
        }
        h = true;
        k1 = a(s, k1);
        if (k1 != null)
        {
            k1.b();
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
            k k1 = a(s, ((k) (null)));
            if (k1 != null)
            {
                k1.b();
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
}
