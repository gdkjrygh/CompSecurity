// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            s, l, t, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a = new ArrayList();
    private Context b;
    private l c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private s f;
    private boolean g;

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        d = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    private t a(String s1, t t1)
    {
        s s2 = null;
        for (int i = 0; i < a.size(); i++)
        {
            s s3 = (s)a.get(i);
            if (s.b(s3).equals(s1))
            {
                s2 = s3;
            }
        }

        if (s2 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s1).toString());
        }
        s1 = t1;
        if (f != s2)
        {
            s1 = t1;
            if (t1 == null)
            {
                s1 = c.a();
            }
            if (f != null && s.a(f) != null)
            {
                s1.a(s.a(f));
            }
            if (s2 != null)
            {
                if (s.a(s2) == null)
                {
                    s.a(s2, Fragment.a(b, s.c(s2).getName(), s.d(s2)));
                    s1.a(d, s.a(s2), s.b(s2));
                } else
                {
                    s1.b(s.a(s2));
                }
            }
            f = s2;
        }
        return s1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s1 = getCurrentTabTag();
        t t1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            s s2 = (s)a.get(i);
            s.a(s2, c.a(s.b(s2)));
            t t2 = t1;
            if (s.a(s2) != null)
            {
                t2 = t1;
                if (!s.a(s2).d())
                {
                    if (s.b(s2).equals(s1))
                    {
                        f = s2;
                        t2 = t1;
                    } else
                    {
                        t2 = t1;
                        if (t1 == null)
                        {
                            t2 = c.a();
                        }
                        t2.a(s.a(s2));
                    }
                }
            }
            i++;
            t1 = t2;
        }
        g = true;
        t1 = a(s1, t1);
        if (t1 != null)
        {
            t1.a();
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

    public void onTabChanged(String s1)
    {
        if (g)
        {
            t t1 = a(s1, null);
            if (t1 != null)
            {
                t1.a();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s1);
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

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new r();
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
