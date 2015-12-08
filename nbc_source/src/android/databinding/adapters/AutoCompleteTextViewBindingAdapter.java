// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewBindingAdapter
{
    public static interface FixText
    {

        public abstract CharSequence fixText(CharSequence charsequence);
    }

    public static interface IsValid
    {

        public abstract boolean isValid(CharSequence charsequence);
    }


    public AutoCompleteTextViewBindingAdapter()
    {
    }

    public static void setListener(AutoCompleteTextView autocompletetextview, AdapterViewBindingAdapter.OnItemSelected onitemselected)
    {
        setListener(autocompletetextview, onitemselected, ((AdapterViewBindingAdapter.OnNothingSelected) (null)));
    }

    public static void setListener(AutoCompleteTextView autocompletetextview, AdapterViewBindingAdapter.OnItemSelected onitemselected, AdapterViewBindingAdapter.OnNothingSelected onnothingselected)
    {
        if (onitemselected == null && onnothingselected == null)
        {
            autocompletetextview.setOnItemSelectedListener(null);
            return;
        } else
        {
            autocompletetextview.setOnItemSelectedListener(new AdapterViewBindingAdapter.OnItemSelectedComponentListener(onitemselected, onnothingselected));
            return;
        }
    }

    public static void setListener(AutoCompleteTextView autocompletetextview, AdapterViewBindingAdapter.OnNothingSelected onnothingselected)
    {
        setListener(autocompletetextview, ((AdapterViewBindingAdapter.OnItemSelected) (null)), onnothingselected);
    }

    public static void setListener(AutoCompleteTextView autocompletetextview, FixText fixtext)
    {
        setListener(autocompletetextview, fixtext, ((IsValid) (null)));
    }

    public static void setListener(AutoCompleteTextView autocompletetextview, FixText fixtext, IsValid isvalid)
    {
        if (fixtext == null && isvalid == null)
        {
            autocompletetextview.setValidator(null);
            return;
        } else
        {
            autocompletetextview.setValidator(new android.widget.AutoCompleteTextView.Validator(isvalid, fixtext) {

                final FixText val$fixText;
                final IsValid val$isValid;

                public CharSequence fixText(CharSequence charsequence)
                {
                    CharSequence charsequence1 = charsequence;
                    if (fixText != null)
                    {
                        charsequence1 = fixText.fixText(charsequence);
                    }
                    return charsequence1;
                }

                public boolean isValid(CharSequence charsequence)
                {
                    if (isValid != null)
                    {
                        return isValid.isValid(charsequence);
                    } else
                    {
                        return true;
                    }
                }

            
            {
                isValid = isvalid;
                fixText = fixtext;
                super();
            }
            });
            return;
        }
    }

    public static void setListener(AutoCompleteTextView autocompletetextview, IsValid isvalid)
    {
        setListener(autocompletetextview, ((FixText) (null)), isvalid);
    }
}
