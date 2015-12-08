// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import yuku.ambilwarna.AmbilWarnaDialog;

public class AmbilWarnaPreference extends Preference
{
    private static class SavedState extends android.preference.Preference.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        int value;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(value);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            value = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private final boolean supportsAlpha;
    int value;

    public AmbilWarnaPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        supportsAlpha = context.obtainStyledAttributes(attributeset, yuku.ambilwarna.R.styleable.AmbilWarnaPreference).getBoolean(yuku.ambilwarna.R.styleable.AmbilWarnaPreference_supportsAlpha, false);
        setWidgetLayoutResource(yuku.ambilwarna.R.layout.ambilwarna_pref_widget);
    }

    public void forceSetValue(int i)
    {
        value = i;
        persistInt(i);
        notifyChanged();
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        view = view.findViewById(yuku.ambilwarna.R.id.ambilwarna_pref_widget_box);
        if (view != null)
        {
            view.setBackgroundColor(value);
        }
    }

    protected void onClick()
    {
        (new AmbilWarnaDialog(getContext(), value, supportsAlpha, new yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener() {

            final AmbilWarnaPreference this$0;

            public void onCancel(AmbilWarnaDialog ambilwarnadialog)
            {
            }

            public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
            {
                if (!callChangeListener(Integer.valueOf(i)))
                {
                    return;
                } else
                {
                    value = i;
                    persistInt(value);
                    notifyChanged();
                    return;
                }
            }

            
            {
                this$0 = AmbilWarnaPreference.this;
                super();
            }
        })).show();
    }

    protected Object onGetDefaultValue(TypedArray typedarray, int i)
    {
        return Integer.valueOf(typedarray.getInteger(i, 0));
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!parcelable.getClass().equals(yuku/ambilwarna/widget/AmbilWarnaPreference$SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            value = ((SavedState) (parcelable)).value;
            notifyChanged();
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
            obj.value = value;
            return ((Parcelable) (obj));
        }
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
        if (flag)
        {
            value = getPersistedInt(value);
            return;
        } else
        {
            int i = ((Integer)obj).intValue();
            value = i;
            persistInt(i);
            return;
        }
    }



}
