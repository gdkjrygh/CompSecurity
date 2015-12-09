// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import com.google.android.apps.wallet.inject.ApplicationInjector;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.validator.DataValidator;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidationLogic

public class ValidatedEditText extends EditText
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
        private boolean mHasFocus;

        public final boolean hasFocus()
        {
            return mHasFocus;
        }

        public final void setHasFocus(boolean flag)
        {
            mHasFocus = flag;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (mHasFocus)
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
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            mHasFocus = flag;
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    AccessibilityUtil accessibilityUtil;
    private final ValidationLogic validationLogic;

    public ValidatedEditText(Context context)
    {
        this(context, null);
    }

    public ValidatedEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ApplicationInjector.inject(this, context);
        validationLogic = new ValidationLogic(this, accessibilityUtil);
        validationLogic.initializeStyle(context, attributeset);
    }

    public final boolean checkForError()
    {
        return validationLogic.checkForError();
    }

    final ValidationLogic getValidationLogic()
    {
        return validationLogic;
    }

    public final String getValue()
    {
        return getText().toString();
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1 && hasFocus() && getText().length() > 0)
        {
            checkForError();
        }
        return super.onKeyPreIme(i, keyevent);
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
            if (parcelable.hasFocus())
            {
                validationLogic.setRestoringState(true);
                requestFocus();
                validationLogic.setRestoringState(false);
                return;
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.setHasFocus(hasFocus());
        return savedstate;
    }

    public void setAutoAdvanceEnabled(boolean flag)
    {
        validationLogic.setAutoAdvance(flag);
    }

    public void setInvalidState(String s)
    {
        validationLogic.setInvalidState(s);
    }

    public void setMaxLength(int i)
    {
        validationLogic.setMaxLength(i);
    }

    public void setValidator(DataValidator datavalidator)
    {
        validationLogic.setValidator(datavalidator);
    }

    public void setValue(String s)
    {
        setText(s);
    }
}
