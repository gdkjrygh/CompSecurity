// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            b, a

public abstract class ListDialogPreference extends DialogPreference
{

    private CharSequence a[];
    private int b[];
    private OnValueChangedListener c;
    private int d;
    private int e;
    private int f;
    private boolean g;

    public ListDialogPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static boolean a(ListDialogPreference listdialogpreference, Object obj)
    {
        return listdialogpreference.callChangeListener(obj);
    }

    static int[] a(ListDialogPreference listdialogpreference)
    {
        return listdialogpreference.b;
    }

    static int b(ListDialogPreference listdialogpreference)
    {
        return listdialogpreference.d;
    }

    protected CharSequence a(int i)
    {
        if (a == null || a.length <= i)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    protected abstract void a(View view, int i);

    protected int b(int i)
    {
        return b[i];
    }

    protected int c(int i)
    {
        int ai[] = b;
        if (ai != null)
        {
            int k = ai.length;
            for (int j = 0; j < k; j++)
            {
                if (ai[j] == i)
                {
                    return j;
                }
            }

        }
        return -1;
    }

    public CharSequence getSummary()
    {
        if (f >= 0)
        {
            return a(f);
        } else
        {
            return null;
        }
    }

    public int getValue()
    {
        return e;
    }

    protected Object onGetDefaultValue(TypedArray typedarray, int i)
    {
        return Integer.valueOf(typedarray.getInt(i, 0));
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        super.onPrepareDialogBuilder(builder);
        Object obj = getContext();
        int i = getDialogLayoutResource();
        obj = LayoutInflater.from(((Context) (obj))).inflate(i, null);
        b b1 = new b(this, null);
        AbsListView abslistview = (AbsListView)((View) (obj)).findViewById(0x102000a);
        abslistview.setAdapter(b1);
        abslistview.setOnItemClickListener(new a(this));
        i = c(e);
        if (i != -1)
        {
            abslistview.setSelection(i);
        }
        builder.setView(((View) (obj)));
        builder.setPositiveButton(null, null);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(com/brightcove/player/captioning/preferences/ListDialogPreference$SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            setValue(((SavedState) (parcelable)).a);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Object obj = super.onSaveInstanceState();
        if (isPersistent())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new SavedState(((Parcelable) (obj)));
            obj.a = getValue();
            return ((Parcelable) (obj));
        }
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
        int i;
        if (flag)
        {
            i = getPersistedInt(e);
        } else
        {
            i = ((Integer)obj).intValue();
        }
        setValue(i);
    }

    public void setListItemLayoutResource(int i)
    {
        d = i;
    }

    public void setOnValueChangedListener(OnValueChangedListener onvaluechangedlistener)
    {
        c = onvaluechangedlistener;
    }

    public void setTitles(CharSequence acharsequence[])
    {
        a = acharsequence;
    }

    public void setValue(int i)
    {
        boolean flag;
        if (e != i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !g)
        {
            e = i;
            f = c(i);
            g = true;
            persistInt(i);
            if (flag)
            {
                notifyDependencyChange(shouldDisableDependents());
                notifyChanged();
            }
            if (c != null)
            {
                c.onValueChanged(this, i);
            }
        }
    }

    public void setValues(int ai[])
    {
        b = ai;
        if (g && f == -1)
        {
            f = c(e);
        }
    }

    private class SavedState extends android.preference.Preference.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new c();
        public int a;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private class OnValueChangedListener
    {

        public abstract void onValueChanged(ListDialogPreference listdialogpreference, int i);
    }

}
