// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ag, u, ah, Fragment

public final class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a;
    private Context b;
    private u c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private ag f;
    private boolean g;

    private ah a(String s, ah ah1)
    {
        ag ag1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            ag ag2 = (ag)a.get(i);
            if (ag.b(ag2).equals(s))
            {
                ag1 = ag2;
            }
        }

        if (ag1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        s = ah1;
        if (f != ag1)
        {
            s = ah1;
            if (ah1 == null)
            {
                s = c.a();
            }
            if (f != null && ag.a(f) != null)
            {
                s.d(ag.a(f));
            }
            if (ag1 != null)
            {
                if (ag.a(ag1) == null)
                {
                    ag.a(ag1, Fragment.instantiate(b, ag.c(ag1).getName(), ag.d(ag1)));
                    s.a(d, ag.a(ag1), ag.b(ag1));
                } else
                {
                    s.e(ag.a(ag1));
                }
            }
            f = ag1;
        }
        return s;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        ah ah1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            ag ag1 = (ag)a.get(i);
            ag.a(ag1, c.a(ag.b(ag1)));
            ah ah2 = ah1;
            if (ag.a(ag1) != null)
            {
                ah2 = ah1;
                if (!ag.a(ag1).isDetached())
                {
                    if (ag.b(ag1).equals(s))
                    {
                        f = ag1;
                        ah2 = ah1;
                    } else
                    {
                        ah2 = ah1;
                        if (ah1 == null)
                        {
                            ah2 = c.a();
                        }
                        ah2.d(ag.a(ag1));
                    }
                }
            }
            i++;
            ah1 = ah2;
        }
        g = true;
        ah1 = a(s, ah1);
        if (ah1 != null)
        {
            ah1.a();
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
            ah ah1 = a(s, null);
            if (ah1 != null)
            {
                ah1.a();
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

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new af();
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

}
