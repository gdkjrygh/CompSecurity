// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidatedSpinnerAdapterWrapper

public class ValidatedSpinner extends LinearLayout
    implements ValidationGroup.Groupable
{
    static final class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            private static SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private boolean hasFocus;
        private Parcelable spinnerState;

        public final Parcelable getSpinnerState()
        {
            return spinnerState;
        }

        public final boolean hasFocus()
        {
            return hasFocus;
        }

        public final void setHasFocus(boolean flag)
        {
            hasFocus = flag;
        }

        public final void setSpinnerState(Parcelable parcelable)
        {
            spinnerState = parcelable;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(spinnerState, i);
            if (hasFocus)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private SavedState(Parcel parcel)
        {
            boolean flag = true;
            super(parcel);
            spinnerState = parcel.readParcelable(null);
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            hasFocus = flag;
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private ValidatedSpinnerAdapterWrapper adapter;
    final TextView errorTextView;
    private final Map invalidValues;
    private boolean isFirstSelection;
    private android.widget.AdapterView.OnItemSelectedListener listener;
    private final Spinner spinner;
    private DataValidator validator;

    public ValidatedSpinner(Context context)
    {
        this(context, null);
    }

    public ValidatedSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        invalidValues = Maps.newHashMap();
        setOrientation(1);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.validated_spinner, this);
        errorTextView = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ValidationError);
        spinner = (Spinner)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ValidatedSpinner);
        isFirstSelection = true;
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ValidatedSpinner this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (!isFirstSelection)
                {
                    if (listener != null)
                    {
                        listener.onItemSelected(adapterview, view, i, l);
                    }
                    checkForError();
                    return;
                } else
                {
                    isFirstSelection = false;
                    return;
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
                if (!isFirstSelection)
                {
                    if (listener != null)
                    {
                        listener.onNothingSelected(adapterview);
                    }
                    checkForError();
                    return;
                } else
                {
                    isFirstSelection = false;
                    return;
                }
            }

            
            {
                this$0 = ValidatedSpinner.this;
                super();
            }
        });
        errorTextView.setId(-1);
        spinner.setId(-1);
        setEnabled(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSaveEnabled(true);
    }

    public final boolean checkForError()
    {
        Object obj = getValue();
        String s = validator.validate(obj, getResources());
        boolean flag;
        boolean flag1;
        if (!s.equals(""))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            s = (String)invalidValues.get(obj);
            if (s != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        obj = errorTextView;
        if (!flag1)
        {
            s = null;
        }
        Views.setTextOrHide(((TextView) (obj)), s);
        return flag1;
    }

    public final Spinner getInputView()
    {
        return spinner;
    }

    public final Object getValue()
    {
        Preconditions.checkNotNull(adapter);
        return adapter.getValue(spinner.getSelectedItemPosition());
    }

    public void onFocusChanged(boolean flag, int i, Rect rect)
    {
        if (flag)
        {
            spinner.requestFocus(i, rect);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            spinner.onRestoreInstanceState(parcelable.getSpinnerState());
            if (parcelable.hasFocus())
            {
                requestFocus();
                return;
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.setSpinnerState(spinner.onSaveInstanceState());
        savedstate.setHasFocus(hasFocus());
        return savedstate;
    }

    public void setAdapter(ValidatedSpinnerAdapterWrapper validatedspinneradapterwrapper)
    {
        adapter = validatedspinneradapterwrapper;
        spinner.setAdapter(validatedspinneradapterwrapper);
    }

    public void setInvalidState(String s)
    {
        invalidValues.put(getValue(), Strings.nullToEmpty(s));
        Views.setTextOrHide(errorTextView, s);
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        listener = onitemselectedlistener;
    }

    public void setValidator(DataValidator datavalidator)
    {
        validator = datavalidator;
    }

    public void setValue(Object obj)
    {
        ValidatedSpinnerAdapterWrapper validatedspinneradapterwrapper = adapter;
        int i = ValidatedSpinnerAdapterWrapper.getNumExtraViews();
        do
        {
label0:
            {
                if (i < spinner.getCount())
                {
                    if (!adapter.getValue(i).equals(obj))
                    {
                        break label0;
                    }
                    spinner.setSelection(i);
                }
                return;
            }
            i++;
        } while (true);
    }



/*
    static boolean access$002(ValidatedSpinner validatedspinner, boolean flag)
    {
        validatedspinner.isFirstSelection = flag;
        return flag;
    }

*/

}
