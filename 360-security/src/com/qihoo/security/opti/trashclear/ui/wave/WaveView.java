// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.wave;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.nineoldandroids.a.k;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.wave:
//            RoundLayout, Wave, Solid

public class WaveView extends RoundLayout
{
    private static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        int a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1);
    }


    a b;
    int c;
    private final int d;
    private final int e;
    private int f;
    private final int g;
    private final int h;
    private final int i;
    private int j;
    private final Wave k;
    private final Solid l;
    private final int m = -1;
    private final int n = -1;
    private final int o = 0;
    private final int p = 80;
    private k q;
    private final float r = 7F;

    public WaveView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
        setOrientation(1);
        attributeset = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.WaveView);
        d = attributeset.getColor(0, -1);
        e = attributeset.getColor(1, -1);
        a = attributeset.getColor(2, 0);
        f = attributeset.getInt(3, 80);
        g = attributeset.getInt(6, 2);
        h = attributeset.getInt(5, 1);
        i = attributeset.getInt(7, 2);
        attributeset.recycle();
        k = new Wave(context, null);
        k.a(h, g, i);
        k.a(d);
        k.b(e);
        k.e();
        l = new Solid(context, null);
        l.a(k.c());
        l.b(k.d());
        addView(k);
        addView(l);
        setProgress(f);
    }

    private void b()
    {
        j = (int)((float)getHeight() * (1.0F - (float)f / 1000F));
        android.view.ViewGroup.LayoutParams layoutparams = k.getLayoutParams();
        if (layoutparams != null)
        {
            ((android.widget.LinearLayout.LayoutParams)layoutparams).topMargin = j;
        }
        k.setLayoutParams(layoutparams);
    }

    public void a()
    {
        if (q != null)
        {
            q.b();
        }
        setProgress(0);
        c = -1;
    }

    public void a(boolean flag)
    {
        if (k != null)
        {
            k.a(flag);
        }
    }

    public int getProgress()
    {
        return f;
    }

    public Solid getSolid()
    {
        return l;
    }

    public Wave getWave()
    {
        return k;
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setProgress(((SavedState) (parcelable)).a);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = f;
        return savedstate;
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag)
        {
            b();
        }
    }

    public void setAboveWaveColor(int i1)
    {
        k.a(i1);
        k.e();
        postInvalidate();
    }

    public void setBelowWaveColor(int i1)
    {
        k.b(i1);
        k.e();
        postInvalidate();
    }

    public void setProgress(int i1)
    {
        int j1 = 1000;
        if (i1 <= 1000)
        {
            j1 = i1;
        }
        f = j1;
        b();
        if (b != null)
        {
            b.a(i1);
        }
    }

    public void setWaveCallback(a a1)
    {
        b = a1;
        if (k != null)
        {
            k.a(a1);
        }
    }
}
