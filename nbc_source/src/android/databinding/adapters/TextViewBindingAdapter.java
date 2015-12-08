// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView;

// Referenced classes of package android.databinding.adapters:
//            ListenerUtil

public class TextViewBindingAdapter
{
    public static interface AfterTextChanged
    {

        public abstract void afterTextChanged(Editable editable);
    }

    public static interface BeforeTextChanged
    {

        public abstract void beforeTextChanged(CharSequence charsequence, int i, int j, int k);
    }

    public static interface OnTextChanged
    {

        public abstract void onTextChanged(CharSequence charsequence, int i, int j, int k);
    }


    public static final int DECIMAL = 5;
    public static final int INTEGER = 1;
    public static final int SIGNED = 3;
    private static final String TAG = "TextViewBindingAdapters";

    public TextViewBindingAdapter()
    {
    }

    public static void setAutoText(TextView textview, boolean flag)
    {
        android.text.method.TextKeyListener.Capitalize capitalize;
        int i;
        KeyListener keylistener = textview.getKeyListener();
        capitalize = android.text.method.TextKeyListener.Capitalize.NONE;
        if (keylistener != null)
        {
            i = keylistener.getInputType();
        } else
        {
            i = 0;
        }
        if ((i & 0x1000) == 0) goto _L2; else goto _L1
_L1:
        capitalize = android.text.method.TextKeyListener.Capitalize.CHARACTERS;
_L4:
        textview.setKeyListener(TextKeyListener.getInstance(flag, capitalize));
        return;
_L2:
        if ((i & 0x2000) != 0)
        {
            capitalize = android.text.method.TextKeyListener.Capitalize.WORDS;
        } else
        if ((i & 0x4000) != 0)
        {
            capitalize = android.text.method.TextKeyListener.Capitalize.SENTENCES;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void setBufferType(TextView textview, android.widget.TextView.BufferType buffertype)
    {
        textview.setText(textview.getText(), buffertype);
    }

    public static void setCapitalize(TextView textview, android.text.method.TextKeyListener.Capitalize capitalize)
    {
        boolean flag;
        if ((0x8000 & textview.getKeyListener().getInputType()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview.setKeyListener(TextKeyListener.getInstance(flag, capitalize));
    }

    public static void setDigits(TextView textview, CharSequence charsequence)
    {
        if (charsequence != null)
        {
            textview.setKeyListener(DigitsKeyListener.getInstance(charsequence.toString()));
        } else
        if (textview.getKeyListener() instanceof DigitsKeyListener)
        {
            textview.setKeyListener(null);
            return;
        }
    }

    public static void setDrawableBottom(TextView textview, Drawable drawable)
    {
        Drawable adrawable[] = textview.getCompoundDrawables();
        textview.setCompoundDrawables(adrawable[0], adrawable[1], adrawable[2], drawable);
    }

    public static void setDrawableEnd(TextView textview, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            setDrawableRight(textview, drawable);
            return;
        } else
        {
            Drawable adrawable[] = textview.getCompoundDrawablesRelative();
            textview.setCompoundDrawablesRelative(adrawable[0], adrawable[1], drawable, adrawable[3]);
            return;
        }
    }

    public static void setDrawableLeft(TextView textview, Drawable drawable)
    {
        Drawable adrawable[] = textview.getCompoundDrawables();
        textview.setCompoundDrawables(drawable, adrawable[1], adrawable[2], adrawable[3]);
    }

    public static void setDrawableRight(TextView textview, Drawable drawable)
    {
        Drawable adrawable[] = textview.getCompoundDrawables();
        textview.setCompoundDrawables(adrawable[0], adrawable[1], drawable, adrawable[3]);
    }

    public static void setDrawableStart(TextView textview, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            setDrawableLeft(textview, drawable);
            return;
        } else
        {
            Drawable adrawable[] = textview.getCompoundDrawablesRelative();
            textview.setCompoundDrawablesRelative(drawable, adrawable[1], adrawable[2], adrawable[3]);
            return;
        }
    }

    public static void setDrawableTop(TextView textview, Drawable drawable)
    {
        Drawable adrawable[] = textview.getCompoundDrawables();
        textview.setCompoundDrawables(adrawable[0], drawable, adrawable[2], adrawable[3]);
    }

    public static void setImeActionLabel(TextView textview, int i)
    {
        textview.setImeActionLabel(textview.getImeActionLabel(), i);
    }

    public static void setImeActionLabel(TextView textview, CharSequence charsequence)
    {
        textview.setImeActionLabel(charsequence, textview.getImeActionId());
    }

    public static void setInputMethod(TextView textview, CharSequence charsequence)
    {
        try
        {
            textview.setKeyListener((KeyListener)Class.forName(charsequence.toString()).newInstance());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            Log.e("TextViewBindingAdapters", (new StringBuilder()).append("Could not create input method: ").append(charsequence).toString(), textview);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            Log.e("TextViewBindingAdapters", (new StringBuilder()).append("Could not create input method: ").append(charsequence).toString(), textview);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            Log.e("TextViewBindingAdapters", (new StringBuilder()).append("Could not create input method: ").append(charsequence).toString(), textview);
        }
    }

    public static void setLineSpacingExtra(TextView textview, float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            textview.setLineSpacing(f, textview.getLineSpacingMultiplier());
            return;
        } else
        {
            textview.setLineSpacing(f, 1.0F);
            return;
        }
    }

    public static void setLineSpacingMultiplier(TextView textview, float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            textview.setLineSpacing(textview.getLineSpacingExtra(), f);
            return;
        } else
        {
            textview.setLineSpacing(0.0F, f);
            return;
        }
    }

    public static void setListener(TextView textview, AfterTextChanged aftertextchanged)
    {
        setListener(textview, null, null, aftertextchanged);
    }

    public static void setListener(TextView textview, BeforeTextChanged beforetextchanged)
    {
        setListener(textview, beforetextchanged, null, null);
    }

    public static void setListener(TextView textview, BeforeTextChanged beforetextchanged, AfterTextChanged aftertextchanged)
    {
        setListener(textview, beforetextchanged, null, aftertextchanged);
    }

    public static void setListener(TextView textview, BeforeTextChanged beforetextchanged, OnTextChanged ontextchanged)
    {
        setListener(textview, beforetextchanged, ontextchanged, null);
    }

    public static void setListener(TextView textview, BeforeTextChanged beforetextchanged, OnTextChanged ontextchanged, AfterTextChanged aftertextchanged)
    {
        if (beforetextchanged == null && aftertextchanged == null && ontextchanged == null)
        {
            beforetextchanged = null;
        } else
        {
            beforetextchanged = new TextWatcher(beforetextchanged, ontextchanged, aftertextchanged) {

                final AfterTextChanged val$after;
                final BeforeTextChanged val$before;
                final OnTextChanged val$on;

                public void afterTextChanged(Editable editable)
                {
                    if (after != null)
                    {
                        after.afterTextChanged(editable);
                    }
                }

                public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                    if (before != null)
                    {
                        before.beforeTextChanged(charsequence, i, j, k);
                    }
                }

                public void onTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                    if (on != null)
                    {
                        on.onTextChanged(charsequence, i, j, k);
                    }
                }

            
            {
                before = beforetextchanged;
                on = ontextchanged;
                after = aftertextchanged;
                super();
            }
            };
        }
        ontextchanged = (TextWatcher)ListenerUtil.trackListener(textview, beforetextchanged, com.android.databinding.library.baseAdapters.R.id.textWatcher);
        if (ontextchanged != null)
        {
            textview.removeTextChangedListener(ontextchanged);
        }
        if (beforetextchanged != null)
        {
            textview.addTextChangedListener(beforetextchanged);
        }
    }

    public static void setListener(TextView textview, OnTextChanged ontextchanged)
    {
        setListener(textview, null, ontextchanged, null);
    }

    public static void setListener(TextView textview, OnTextChanged ontextchanged, AfterTextChanged aftertextchanged)
    {
        setListener(textview, null, ontextchanged, aftertextchanged);
    }

    public static void setMaxLength(TextView textview, int i)
    {
        InputFilter ainputfilter[] = textview.getFilters();
        if (ainputfilter != null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new InputFilter[1];
        obj[0] = new android.text.InputFilter.LengthFilter(i);
_L4:
        textview.setFilters(((InputFilter []) (obj)));
        return;
_L2:
        boolean flag = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag2 = flag;
                if (j < ainputfilter.length)
                {
                    obj = ainputfilter[j];
                    if (!(obj instanceof android.text.InputFilter.LengthFilter))
                    {
                        break label0;
                    }
                    boolean flag3 = true;
                    boolean flag1 = true;
                    if (android.os.Build.VERSION.SDK_INT >= 21)
                    {
                        if (((android.text.InputFilter.LengthFilter)obj).getMax() != i)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    }
                    flag2 = flag3;
                    if (flag1)
                    {
                        ainputfilter[j] = new android.text.InputFilter.LengthFilter(i);
                        flag2 = flag3;
                    }
                }
                obj = ainputfilter;
                if (!flag2)
                {
                    obj = new InputFilter[ainputfilter.length + 1];
                    System.arraycopy(ainputfilter, 0, obj, 0, ainputfilter.length);
                    obj[obj.length - 1] = new android.text.InputFilter.LengthFilter(i);
                }
            }
            if (true)
            {
                continue;
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void setNumeric(TextView textview, int i)
    {
        boolean flag1 = true;
        boolean flag;
        if ((i & 3) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 5) == 0)
        {
            flag1 = false;
        }
        textview.setKeyListener(DigitsKeyListener.getInstance(flag, flag1));
    }

    public static void setPassword(TextView textview, boolean flag)
    {
        if (flag)
        {
            textview.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else
        if (textview.getTransformationMethod() instanceof PasswordTransformationMethod)
        {
            textview.setTransformationMethod(null);
            return;
        }
    }

    public static void setPhoneNumber(TextView textview, boolean flag)
    {
        if (flag)
        {
            textview.setKeyListener(DialerKeyListener.getInstance());
        } else
        if (textview.getKeyListener() instanceof DialerKeyListener)
        {
            textview.setKeyListener(null);
            return;
        }
    }

    public static void setShadowColor(TextView textview, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            float f = textview.getShadowDx();
            float f1 = textview.getShadowDy();
            textview.setShadowLayer(textview.getShadowRadius(), f, f1, i);
        }
    }

    public static void setShadowDx(TextView textview, float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            int i = textview.getShadowColor();
            float f1 = textview.getShadowDy();
            textview.setShadowLayer(textview.getShadowRadius(), f, f1, i);
        }
    }

    public static void setShadowDy(TextView textview, float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            int i = textview.getShadowColor();
            float f1 = textview.getShadowDx();
            textview.setShadowLayer(textview.getShadowRadius(), f1, f, i);
        }
    }

    public static void setShadowRadius(TextView textview, float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            int i = textview.getShadowColor();
            textview.setShadowLayer(f, textview.getShadowDx(), textview.getShadowDy(), i);
        }
    }

    public static void setTextSize(TextView textview, float f)
    {
        textview.setTextSize(0, f);
    }
}
