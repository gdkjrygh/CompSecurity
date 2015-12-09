// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import ag;
import ah;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a = new ArrayList();
    private int b;
    private android.widget.TabHost.OnTabChangeListener c;
    private ag d;
    private boolean e;

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        b = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    private ah a(String s, ah ah1)
    {
        int i = 0;
        ag ag1 = null;
        for (; i < a.size(); i++)
        {
            ag ag2 = (ag)a.get(i);
            if (ag2.a.equals(s))
            {
                ag1 = ag2;
            }
        }

        if (ag1 == null)
        {
            throw new IllegalStateException((new StringBuilder("No tab known for tag ")).append(s).toString());
        }
        if (d != ag1)
        {
            if (ah1 == null)
            {
                throw new NullPointerException();
            }
            if (d != null && d.d != null)
            {
                ah1.b(d.d);
            }
            if (ag1 != null)
            {
                if (ag1.d == null)
                {
                    ag1.d = Fragment.a(null, ag1.b.getName(), ag1.c);
                    ah1.a(b, ag1.d, ag1.a);
                } else
                {
                    ah1.c(ag1.d);
                }
            }
            d = ag1;
        }
        return ah1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Object obj = getCurrentTabTag();
        if (a.size() < 0)
        {
            obj = ((ag)a.get(0)).a;
            throw new NullPointerException();
        }
        e = true;
        obj = a(((String) (obj)), null);
        if (obj != null)
        {
            ((ah) (obj)).c();
            throw new NullPointerException();
        } else
        {
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        e = false;
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
        if (e)
        {
            ah ah1 = a(s, null);
            if (ah1 != null)
            {
                ah1.c();
            }
        }
        if (c != null)
        {
            c.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        c = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private class SavedState extends android.view.View.BaseSavedState
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

}
