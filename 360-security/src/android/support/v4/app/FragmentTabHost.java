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
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            f, h, Fragment

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


    private final ArrayList a = new ArrayList();
    private Context b;
    private f c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private a f;
    private boolean g;

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    private h a(String s, h h1)
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
            throw new IllegalStateException((new StringBuilder()).append("No tab known for tag ").append(s).toString());
        }
        s = h1;
        if (f != a1)
        {
            s = h1;
            if (h1 == null)
            {
                s = c.a();
            }
            if (f != null && a.a(f) != null)
            {
                s.b(a.a(f));
            }
            if (a1 != null)
            {
                if (a.a(a1) == null)
                {
                    a.a(a1, Fragment.instantiate(b, a.c(a1).getName(), a.d(a1)));
                    s.a(d, a.a(a1), a.b(a1));
                } else
                {
                    s.c(a.a(a1));
                }
            }
            f = a1;
        }
        return s;
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        d = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        h h1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            a a1 = (a)a.get(i);
            a.a(a1, c.a(a.b(a1)));
            h h2 = h1;
            if (a.a(a1) != null)
            {
                h2 = h1;
                if (!a.a(a1).isDetached())
                {
                    if (a.b(a1).equals(s))
                    {
                        f = a1;
                        h2 = h1;
                    } else
                    {
                        h2 = h1;
                        if (h1 == null)
                        {
                            h2 = c.a();
                        }
                        h2.b(a.a(a1));
                    }
                }
            }
            i++;
            h1 = h2;
        }
        g = true;
        h1 = a(s, h1);
        if (h1 != null)
        {
            h1.a();
            c.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
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
        if (g)
        {
            h h1 = a(s, ((h) (null)));
            if (h1 != null)
            {
                h1.a();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        e = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
