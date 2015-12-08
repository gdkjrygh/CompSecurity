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
//            l, o, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{
    static class DummyTabFactory
        implements android.widget.TabHost.TabContentFactory
    {

        private final Context mContext;

        public View createTabContent(String s)
        {
            s = new View(mContext);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public DummyTabFactory(Context context)
        {
            mContext = context;
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
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


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static final class a
    {

        private final String a;
        private final Class b;
        private final Bundle c;
        private Fragment d;

        static Fragment a(a a1)
        {
            return a1.d;
        }

        static Fragment a(a a1, Fragment fragment)
        {
            a1.d = fragment;
            return fragment;
        }

        static String b(a a1)
        {
            return a1.a;
        }

        static Class c(a a1)
        {
            return a1.b;
        }

        static Bundle d(a a1)
        {
            return a1.c;
        }
    }


    private final ArrayList a;
    private FrameLayout b;
    private Context c;
    private l d;
    private int e;
    private android.widget.TabHost.OnTabChangeListener f;
    private a g;
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

    private o a(String s, o o1)
    {
        a a1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            a a2 = (a)a.get(i);
            if (a.b(a2).equals(s))
            {
                a1 = a2;
            }
        }

        if (a1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = o1;
        if (g != a1)
        {
            s = o1;
            if (o1 == null)
            {
                s = d.a();
            }
            if (g != null && a.a(g) != null)
            {
                s.c(a.a(g));
            }
            if (a1 != null)
            {
                if (a.a(a1) == null)
                {
                    a.a(a1, Fragment.instantiate(c, a.c(a1).getName(), a.d(a1)));
                    s.a(e, a.a(a1), a.b(a1));
                } else
                {
                    s.d(a.a(a1));
                }
            }
            g = a1;
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

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        o o1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            a a1 = (a)a.get(i);
            a.a(a1, d.a(a.b(a1)));
            o o2 = o1;
            if (a.a(a1) != null)
            {
                o2 = o1;
                if (!a.a(a1).isDetached())
                {
                    if (a.b(a1).equals(s))
                    {
                        g = a1;
                        o2 = o1;
                    } else
                    {
                        o2 = o1;
                        if (o1 == null)
                        {
                            o2 = d.a();
                        }
                        o2.c(a.a(a1));
                    }
                }
            }
            i++;
            o1 = o2;
        }
        h = true;
        o1 = a(s, o1);
        if (o1 != null)
        {
            o1.a();
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
            o o1 = a(s, ((o) (null)));
            if (o1 != null)
            {
                o1.a();
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

    public void setup(Context context, l l1)
    {
        a(context);
        super.setup();
        c = context;
        d = l1;
        a();
    }

    public void setup(Context context, l l1, int i)
    {
        a(context);
        super.setup();
        c = context;
        d = l1;
        e = i;
        a();
        b.setId(i);
        if (getId() == -1)
        {
            setId(0x1020012);
        }
    }
}
