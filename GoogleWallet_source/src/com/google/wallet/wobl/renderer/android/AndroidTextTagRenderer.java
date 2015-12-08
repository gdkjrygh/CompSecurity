// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.intermediaterepresentation.InlineLinkIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTagRenderer, AndroidRenderer, AndroidRenderUtils

public class AndroidTextTagRenderer extends AndroidTagRenderer
{
    abstract class ClickableSpan extends android.text.style.ClickableSpan
    {

        final AndroidTextTagRenderer this$0;

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.setColor(textpaint.linkColor);
        }

        private ClickableSpan()
        {
            this$0 = AndroidTextTagRenderer.this;
            super();
        }

    }

    class SpanMetaData
    {

        private final int end;
        private final Object span;
        private final int start;
        final AndroidTextTagRenderer this$0;




        public SpanMetaData(Object obj, int i, int j)
        {
            this$0 = AndroidTextTagRenderer.this;
            super();
            span = obj;
            start = i;
            end = j;
        }
    }


    private static final int DEFAULT_TEXT_SIZE_PX = 15;
    static final String SERVICE_MARK_SUPERSCRIPT_SYMBOL = "SM";
    private static final int SERVICE_MARK_SUPERSCRIPT_SYMBOL_LENGH = 2;
    static final String SERVICE_MARK_UNICODE = "\u2120";
    int androidVersion;

    public AndroidTextTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
        androidVersion = android.os.Build.VERSION.SDK_INT;
    }

    private Spanned createSpannedText(String s)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        if (s == null)
        {
            return spannablestringbuilder;
        }
        for (int i = s.indexOf("\u2120"); i >= 0; i = s.indexOf("\u2120"))
        {
            spannablestringbuilder.append(s.substring(0, i));
            spannablestringbuilder.append("SM");
            int j = spannablestringbuilder.length();
            spannablestringbuilder.setSpan(new SuperscriptSpan(), j - SERVICE_MARK_SUPERSCRIPT_SYMBOL_LENGH, j, 33);
            s = s.substring(i + 1);
        }

        spannablestringbuilder.append(s);
        return spannablestringbuilder;
    }

    private List getAllSpans(final TextIr textIr, final View textView)
    {
        final AndroidRenderer renderer;
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        renderer = (AndroidRenderer)getRenderer();
        if (textIr instanceof InlineLinkIr)
        {
            arraylist.add(new ClickableSpan() {

                final AndroidTextTagRenderer this$0;
                final AndroidRenderer val$renderer;
                final TextIr val$textIr;
                final View val$textView;

                public void onClick(View view)
                {
                    AndroidRenderUtils.getFirstResolvableClickListener(textIr.getTapUris(), renderer.getRendererClient(), textView).onClick(view);
                }

            
            {
                this$0 = AndroidTextTagRenderer.this;
                textIr = textir;
                renderer = androidrenderer;
                textView = view;
                super();
            }
            });
        }
        if (!textIr.getTextColor().isPresent() && !textIr.getFontFamily().isPresent() && !textIr.getFontStyle().isPresent() && !textIr.getFontWeight().isPresent())
        {
            return arraylist;
        }
        renderer = null;
        if (textIr.getTextColor().isPresent())
        {
            textView = ColorStateList.valueOf(Color.parseColor((String)textIr.getTextColor().get()));
            renderer = textView;
            if (textIr.getTextColorAlpha().isPresent())
            {
                renderer = textView.withAlpha(convertAlphaToInt(((Float)textIr.getTextColorAlpha().get()).floatValue()));
            }
        }
        obj = null;
        textView = obj;
        if (!textIr.getFontFamily().isPresent()) goto _L2; else goto _L1
_L1:
        static class _cls2
        {

            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$TextIr$FontFamily[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$TextIr$FontFamily = new int[com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$TextIr$FontFamily[com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily.SANS_SERIF.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$TextIr$FontFamily[com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily.SERIF.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$TextIr$FontFamily[com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily.MONOSPACE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$TextIr$FontFamily[com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily.NORMAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily[((com.google.wallet.wobl.intermediaterepresentation.TextIr.FontFamily)textIr.getFontFamily().get()).ordinal()];
        JVM INSTR tableswitch 1 3: default 208
    //                   1 277
    //                   2 311
    //                   3 317;
           goto _L3 _L4 _L5 _L6
_L3:
        textView = obj;
_L2:
        int i = 0;
        if (textIr.getFontWeight().orNull() == com.google.wallet.wobl.intermediaterepresentation.TextIr.FontWeight.BOLD)
        {
            i = 1;
        }
        int j = i;
        if (textIr.getFontStyle().orNull() == com.google.wallet.wobl.intermediaterepresentation.TextIr.FontStyle.ITALIC)
        {
            j = i | 2;
        }
        arraylist.add(new TextAppearanceSpan(textView, j, 0, renderer, null));
        return arraylist;
_L4:
        if (textIr.getFontWeight().orNull() == com.google.wallet.wobl.intermediaterepresentation.TextIr.FontWeight.LIGHT && androidVersion >= 16)
        {
            textView = "sans-serif-light";
        } else
        {
            textView = "sans-serif";
        }
        continue; /* Loop/switch isn't completed */
_L5:
        textView = "serif";
        continue; /* Loop/switch isn't completed */
_L6:
        textView = "monospace";
        if (true) goto _L2; else goto _L7
_L7:
    }

    private int getIrLength(TextIr textir)
    {
        int j;
        if (textir.hasChildComponents())
        {
            int i = 0;
            textir = textir.getChildComponents().iterator();
            do
            {
                j = i;
                if (!textir.hasNext())
                {
                    break;
                }
                i += getIrLength((TextIr)textir.next());
            } while (true);
        } else
        {
            j = createSpannedText(textir.getText()).length();
        }
        return j;
    }

    private void parse(TextIr textir, List list, SpannableStringBuilder spannablestringbuilder, Optional optional, TextView textview)
    {
        for (Iterator iterator = getAllSpans(textir, textview).iterator(); iterator.hasNext(); list.add(new SpanMetaData(iterator.next(), spannablestringbuilder.length(), spannablestringbuilder.length() + getIrLength(textir)))) { }
        if (!textir.hasChildComponents())
        {
            if (textir.getTextTransform().isPresent())
            {
                textir = ((com.google.wallet.wobl.intermediaterepresentation.TextIr.TextTransform)textir.getTextTransform().get()).apply(textir.getText());
            } else
            if (optional.isPresent())
            {
                textir = ((com.google.wallet.wobl.intermediaterepresentation.TextIr.TextTransform)optional.get()).apply(textir.getText());
            } else
            {
                textir = textir.getText();
            }
            spannablestringbuilder.append(createSpannedText(textir));
        } else
        {
            Iterator iterator1 = textir.getChildComponents().iterator();
            while (iterator1.hasNext()) 
            {
                TextIr textir1 = (TextIr)iterator1.next();
                Optional optional1;
                if (textir.getTextTransform().isPresent())
                {
                    optional1 = textir.getTextTransform();
                } else
                {
                    optional1 = optional;
                }
                parse(textir1, list, spannablestringbuilder, optional1, textview);
            }
        }
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((TextView)view, (TextIr)intermediaterepresentation);
    }

    public void applyIrToView(TextView textview, TextIr textir)
    {
        float f = 0.0F;
        super.applyIrToView(textview, textir);
        Object obj;
        int i;
        if (textir.getLineHeight().isPresent())
        {
            obj = (com.google.wallet.wobl.intermediaterepresentation.TextIr.LineHeight)textir.getLineHeight().get();
            Optional optional = AndroidRenderUtils.displayUnitToPx(((com.google.wallet.wobl.intermediaterepresentation.TextIr.LineHeight) (obj)).getLength(), getContext());
            if (optional.isPresent())
            {
                f = Math.max(((Integer)optional.get()).intValue() - textview.getLineHeight(), 0.0F);
            }
            float f1;
            if (((com.google.wallet.wobl.intermediaterepresentation.TextIr.LineHeight) (obj)).getMultiplier().isPresent())
            {
                f1 = ((Double)((com.google.wallet.wobl.intermediaterepresentation.TextIr.LineHeight) (obj)).getMultiplier().get()).floatValue();
            } else
            {
                f1 = 1.0F;
            }
            textview.setLineSpacing(f, f1);
        }
        if (textir.getMaxLines().isPresent())
        {
            textview.setMaxLines(((Integer)textir.getMaxLines().get()).intValue());
        } else
        {
            textview.setMaxLines(0x7fffffff);
        }
        if (textir.getTextOverflow().orNull() == com.google.wallet.wobl.intermediaterepresentation.TextIr.TextOverflow.ELLIPSIS)
        {
            obj = android.text.TextUtils.TruncateAt.END;
        } else
        {
            obj = null;
        }
        textview.setEllipsize(((android.text.TextUtils.TruncateAt) (obj)));
        if (textir.getFontSize().isPresent())
        {
            i = AndroidRenderUtils.displayUnitToPx((DisplayUnit)textir.getFontSize().get(), getContext());
        } else
        {
            i = 15;
        }
        textview.setTextSize(0, i);
        setText(textview, textir);
        textview.setGravity(AndroidRenderUtils.calculateGravity(textir));
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public TextView getViewInstance()
    {
        return new TextView(getContext());
    }

    void setText(TextView textview, TextIr textir)
    {
        ArrayList arraylist = new ArrayList();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        parse(textir, arraylist, spannablestringbuilder, textir.getTextTransform(), textview);
        textir = arraylist.iterator();
        do
        {
            if (!textir.hasNext())
            {
                break;
            }
            SpanMetaData spanmetadata = (SpanMetaData)textir.next();
            spannablestringbuilder.setSpan(spanmetadata.span, spanmetadata.start, spanmetadata.end, 33);
            if ((spanmetadata.span instanceof ClickableSpan) && textview.getMovementMethod() == null)
            {
                textview.setMovementMethod(LinkMovementMethod.getInstance());
            }
        } while (true);
        textview.setText(spannablestringbuilder);
    }

}
