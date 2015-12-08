// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            m, q, Fragment

public final class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{
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

        final String a;
        final Class b;
        final Bundle c;
        Fragment d;
    }


    private final ArrayList a;
    private Context b;
    private m c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private a f;
    private boolean g;

    private q a(String s, q q1)
    {
        a a1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            a a2 = (a)a.get(i);
            if (a2.a.equals(s))
            {
                a1 = a2;
            }
        }

        if (a1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = q1;
        if (f != a1)
        {
            s = q1;
            if (q1 == null)
            {
                s = c.a();
            }
            if (f != null && f.d != null)
            {
                s.b(f.d);
            }
            if (a1 != null)
            {
                if (a1.d == null)
                {
                    a1.d = Fragment.instantiate(b, a1.b.getName(), a1.c);
                    s.a(d, a1.d, a1.a);
                } else
                {
                    s.c(a1.d);
                }
            }
            f = a1;
        }
        return s;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        q q1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            a a1 = (a)a.get(i);
            a1.d = c.a(a1.a);
            q q2 = q1;
            if (a1.d != null)
            {
                q2 = q1;
                if (!a1.d.isDetached())
                {
                    if (a1.a.equals(s))
                    {
                        f = a1;
                        q2 = q1;
                    } else
                    {
                        q2 = q1;
                        if (q1 == null)
                        {
                            q2 = c.a();
                        }
                        q2.b(a1.d);
                    }
                }
            }
            i++;
            q1 = q2;
        }
        g = true;
        q1 = a(s, q1);
        if (q1 != null)
        {
            q1.c();
            c.b();
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).a);
    }

    protected final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getCurrentTabTag();
        return savedstate;
    }

    public final void onTabChanged(String s)
    {
        if (g)
        {
            q q1 = a(s, null);
            if (q1 != null)
            {
                q1.c();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s);
        }
    }

    public final void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        e = ontabchangelistener;
    }

    public final void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
