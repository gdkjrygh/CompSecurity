// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

public abstract class ListDialogPreference extends DialogPreference
{
    public static interface OnValueChangedListener
    {

        public abstract void onValueChanged(ListDialogPreference listdialogpreference, int i);
    }

    static class SavedState extends android.preference.Preference.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
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

    final class a extends BaseAdapter
    {

        private LayoutInflater a;
        private ListDialogPreference b;

        public final int getCount()
        {
            return ListDialogPreference.a(b).length;
        }

        public final Object getItem(int i)
        {
            return Integer.valueOf(ListDialogPreference.a(b)[i]);
        }

        public final long getItemId(int i)
        {
            return (long)ListDialogPreference.a(b)[i];
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                if (a == null)
                {
                    a = LayoutInflater.from(viewgroup.getContext());
                }
                view1 = a.inflate(ListDialogPreference.b(b), viewgroup, false);
            }
            b.a(view1, i);
            return view1;
        }

        public final boolean hasStableIds()
        {
            return true;
        }

        private a()
        {
            b = ListDialogPreference.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    int a[];
    private CharSequence b[];
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
        return listdialogpreference.a;
    }

    private int b(int i)
    {
        int ai[] = a;
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

    static int b(ListDialogPreference listdialogpreference)
    {
        return listdialogpreference.d;
    }

    protected CharSequence a(int i)
    {
        if (b == null || b.length <= i)
        {
            return null;
        } else
        {
            return b[i];
        }
    }

    protected abstract void a(View view, int i);

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
        a a1 = new a((byte)0);
        AbsListView abslistview = (AbsListView)((View) (obj)).findViewById(0x102000a);
        abslistview.setAdapter(a1);
        abslistview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private ListDialogPreference a;

            public final void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                if (ListDialogPreference.a(a, Integer.valueOf((int)l)))
                {
                    a.setValue((int)l);
                }
                adapterview = a.getDialog();
                if (adapterview != null)
                {
                    adapterview.dismiss();
                }
            }

            
            {
                a = ListDialogPreference.this;
                super();
            }
        });
        i = b(e);
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
        b = acharsequence;
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
            f = b(i);
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
        a = ai;
        if (g && f == -1)
        {
            f = b(e);
        }
    }
}
