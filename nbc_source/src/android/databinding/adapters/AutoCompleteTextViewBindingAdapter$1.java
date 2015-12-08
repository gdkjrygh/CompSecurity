// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;


// Referenced classes of package android.databinding.adapters:
//            AutoCompleteTextViewBindingAdapter

static final class val.fixText
    implements android.widget.dingAdapter._cls1
{

    final xText val$fixText;
    final Valid val$isValid;

    public CharSequence fixText(CharSequence charsequence)
    {
        CharSequence charsequence1 = charsequence;
        if (val$fixText != null)
        {
            charsequence1 = val$fixText.fixText(charsequence);
        }
        return charsequence1;
    }

    public boolean isValid(CharSequence charsequence)
    {
        if (val$isValid != null)
        {
            return val$isValid.isValid(charsequence);
        } else
        {
            return true;
        }
    }

    xText(Valid valid, xText xtext)
    {
        val$isValid = valid;
        val$fixText = xtext;
        super();
    }
}
