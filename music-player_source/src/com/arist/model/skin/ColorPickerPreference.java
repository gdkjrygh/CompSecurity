// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.arist.model.skin:
//            i, a, g

public class ColorPickerPreference extends Preference
    implements android.preference.Preference.OnPreferenceClickListener, i
{

    View a;
    g b;
    private int c;
    private float d;
    private boolean e;
    private boolean f;

    public ColorPickerPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0xff000000;
        d = 0.0F;
        e = false;
        f = false;
        a(attributeset);
    }

    public ColorPickerPreference(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        c = 0xff000000;
        d = 0.0F;
        e = false;
        f = false;
        a(attributeset);
    }

    public static int a(String s)
    {
        String s1 = s;
        if (!s.startsWith("#"))
        {
            s1 = (new StringBuilder("#")).append(s).toString();
        }
        return Color.parseColor(s1);
    }

    private void a()
    {
        if (a != null)
        {
            ImageView imageview = new ImageView(getContext());
            LinearLayout linearlayout = (LinearLayout)a.findViewById(0x1020018);
            if (linearlayout != null)
            {
                linearlayout.setVisibility(0);
                linearlayout.setPadding(linearlayout.getPaddingLeft(), linearlayout.getPaddingTop(), (int)(d * 8F), linearlayout.getPaddingBottom());
                int j = linearlayout.getChildCount();
                if (j > 0)
                {
                    linearlayout.removeViews(0, j);
                }
                linearlayout.addView(imageview);
                linearlayout.setMinimumWidth(0);
                imageview.setBackgroundDrawable(new a((int)(5F * d)));
                imageview.setImageBitmap(b());
                return;
            }
        }
    }

    private void a(Bundle bundle)
    {
        b = new g(getContext(), c);
        b.a(this);
        if (e)
        {
            b.b();
        }
        if (f)
        {
            b.a();
        }
        if (bundle != null)
        {
            b.onRestoreInstanceState(bundle);
        }
        b.show();
    }

    private void a(AttributeSet attributeset)
    {
        d = getContext().getResources().getDisplayMetrics().density;
        setOnPreferenceClickListener(this);
        if (attributeset != null)
        {
            e = attributeset.getAttributeBooleanValue(null, "alphaSlider", false);
            f = attributeset.getAttributeBooleanValue(null, "hexValue", false);
        }
    }

    private Bitmap b()
    {
        Bitmap bitmap;
        int j;
        int i1;
        int j1;
        int k1;
        j = (int)(d * 21F);
        i1 = c;
        bitmap = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
        j1 = bitmap.getWidth();
        k1 = bitmap.getHeight();
        j = 0;
_L2:
        if (j >= j1)
        {
            return bitmap;
        }
        int k = j;
        do
        {
label0:
            {
                if (k < k1)
                {
                    break label0;
                }
                j++;
            }
            if (true)
            {
                continue;
            }
            int l;
            if (j <= 1 || k <= 1 || j >= j1 - 2 || k >= k1 - 2)
            {
                l = 0xff888888;
            } else
            {
                l = i1;
            }
            bitmap.setPixel(j, k, l);
            if (j != k)
            {
                bitmap.setPixel(k, j, l);
            }
            k++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String b(int j)
    {
        String s1 = Integer.toHexString(Color.alpha(j));
        String s2 = Integer.toHexString(Color.red(j));
        String s3 = Integer.toHexString(Color.green(j));
        String s4 = Integer.toHexString(Color.blue(j));
        String s = s1;
        if (s1.length() == 1)
        {
            s = (new StringBuilder("0")).append(s1).toString();
        }
        s1 = s2;
        if (s2.length() == 1)
        {
            s1 = (new StringBuilder("0")).append(s2).toString();
        }
        s2 = s3;
        if (s3.length() == 1)
        {
            s2 = (new StringBuilder("0")).append(s3).toString();
        }
        s3 = s4;
        if (s4.length() == 1)
        {
            s3 = (new StringBuilder("0")).append(s4).toString();
        }
        return (new StringBuilder("#")).append(s).append(s1).append(s2).append(s3).toString();
    }

    public static String c(int j)
    {
        String s1 = Integer.toHexString(Color.red(j));
        String s2 = Integer.toHexString(Color.green(j));
        String s3 = Integer.toHexString(Color.blue(j));
        String s = s1;
        if (s1.length() == 1)
        {
            s = (new StringBuilder("0")).append(s1).toString();
        }
        s1 = s2;
        if (s2.length() == 1)
        {
            s1 = (new StringBuilder("0")).append(s2).toString();
        }
        s2 = s3;
        if (s3.length() == 1)
        {
            s2 = (new StringBuilder("0")).append(s3).toString();
        }
        return (new StringBuilder("#")).append(s).append(s1).append(s2).toString();
    }

    public final void a(int j)
    {
        if (isPersistent())
        {
            persistInt(j);
        }
        c = j;
        a();
        try
        {
            getOnPreferenceChangeListener().onPreferenceChange(this, Integer.valueOf(j));
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            return;
        }
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        a = view;
        a();
    }

    protected Object onGetDefaultValue(TypedArray typedarray, int j)
    {
        return Integer.valueOf(typedarray.getColor(j, 0xff000000));
    }

    public boolean onPreferenceClick(Preference preference)
    {
        a(((Bundle) (null)));
        return false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable == null || !(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            a(((SavedState) (parcelable)).a);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Object obj = super.onSaveInstanceState();
        if (b == null || !b.isShowing())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new SavedState(((Parcelable) (obj)));
            obj.a = b.onSaveInstanceState();
            return ((Parcelable) (obj));
        }
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
        int j;
        if (flag)
        {
            j = getPersistedInt(c);
        } else
        {
            j = ((Integer)obj).intValue();
        }
        a(j);
    }

    private class SavedState extends android.preference.Preference.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new j();
        Bundle a;

        public void writeToParcel(Parcel parcel, int k)
        {
            super.writeToParcel(parcel, k);
            parcel.writeBundle(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readBundle();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
