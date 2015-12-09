// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.j;
import com.google.b.l;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            TextFormatModel, FontModel, ColorModel

public static class  extends o
{

    protected TextFormatModel fromA2(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected volatile Object fromA2(l l1, Type type, j j1)
    {
        return fromA2(l1, type, j1);
    }

    protected TextFormatModel fromA3(l l1, Type type, j j1)
    {
        int i = 0;
        if (!l1.j())
        {
            return null;
        }
        Object obj = l1.m();
        l1 = e.b(((com.google.b.o) (obj)), "font");
        if (l1 == null)
        {
            throw new IllegalStateException("TextFormat must have font config");
        }
        l1 = (FontModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/FontModel);
        type = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "shadow"), java/lang/Boolean);
        String s = (String)j1.a(e.b(((com.google.b.o) (obj)), "text_alignment"), java/lang/String);
        ColorModel colormodel = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "text_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
        ColorModel colormodel1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "text_background_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
        Boolean boolean1 = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "text_border"), java/lang/Boolean);
        j1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "text_border_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
        obj = new TextFormatModel();
        ((TextFormatModel) (obj)).setFont(l1);
        ((TextFormatModel) (obj)).setShadow(type.booleanValue());
        ((TextFormatModel) (obj)).setTextAlignment(s);
        if (colormodel != null)
        {
            ((TextFormatModel) (obj)).setTextColor(colormodel);
        }
        if (colormodel1 != null)
        {
            ((TextFormatModel) (obj)).setBackgroundColor(colormodel1);
        }
        boolean flag;
        if (boolean1 == null)
        {
            flag = false;
        } else
        {
            flag = boolean1.booleanValue();
        }
        ((TextFormatModel) (obj)).setTextBorder(flag);
        if (j1 != null)
        {
            ((TextFormatModel) (obj)).setBorderColor(j1);
        } else
        {
            if (((TextFormatModel) (obj)).hasTextBorder())
            {
                i = 0xff000000;
            }
            ((TextFormatModel) (obj)).setBorderColor(i);
        }
        return ((TextFormatModel) (obj));
    }

    protected volatile Object fromA3(l l1, Type type, j j1)
    {
        return fromA3(l1, type, j1);
    }

    protected TextFormatModel fromV5(l l1, Type type, j j1)
    {
        int i = 0;
        if (!l1.j())
        {
            return null;
        }
        Object obj = l1.m();
        l1 = e.b(((com.google.b.o) (obj)), "font");
        if (l1 == null)
        {
            throw new IllegalStateException("TextFormat must have font config");
        }
        l1 = (FontModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/FontModel);
        type = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "shadow"), java/lang/Boolean);
        String s = (String)j1.a(e.b(((com.google.b.o) (obj)), "alignment"), java/lang/String);
        ColorModel colormodel = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
        ColorModel colormodel1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "background_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
        Boolean boolean1 = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "border"), java/lang/Boolean);
        j1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "border_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
        obj = new TextFormatModel();
        ((TextFormatModel) (obj)).setFont(l1);
        ((TextFormatModel) (obj)).setShadow(type.booleanValue());
        ((TextFormatModel) (obj)).setTextAlignment(s);
        if (colormodel != null)
        {
            ((TextFormatModel) (obj)).setTextColor(colormodel);
        }
        if (colormodel1 != null)
        {
            ((TextFormatModel) (obj)).setBackgroundColor(colormodel1);
        }
        boolean flag;
        if (boolean1 == null)
        {
            flag = false;
        } else
        {
            flag = boolean1.booleanValue();
        }
        ((TextFormatModel) (obj)).setTextBorder(flag);
        if (j1 != null)
        {
            ((TextFormatModel) (obj)).setBorderColor(j1);
        } else
        {
            if (((TextFormatModel) (obj)).hasTextBorder())
            {
                i = 0xff000000;
            }
            ((TextFormatModel) (obj)).setBorderColor(i);
        }
        return ((TextFormatModel) (obj));
    }

    protected volatile Object fromV5(l l1, Type type, j j1)
    {
        return fromV5(l1, type, j1);
    }

    protected l toA3(TextFormatModel textformatmodel, Type type, r r1)
    {
        type = new com.google.b.o();
        type.a("font", r1.a(textformatmodel.getFont(), com/cardinalblue/android/piccollage/model/gson/FontModel));
        type.a("shadow", r1.a(Boolean.valueOf(textformatmodel.hasShadow()), java/lang/Boolean));
        type.a("text_alignment", r1.a(textformatmodel.getTextAlignment(), java/lang/String));
        type.a("text_color", r1.a(textformatmodel.getTextColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
        type.a("text_background_color", r1.a(textformatmodel.getTextBackgroundColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
        type.a("text_border", r1.a(Boolean.valueOf(textformatmodel.hasTextBorder()), java/lang/Boolean));
        type.a("text_border_color", r1.a(textformatmodel.getBorderColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
        return type;
    }

    protected volatile l toA3(Object obj, Type type, r r1)
    {
        return toA3((TextFormatModel)obj, type, r1);
    }

    protected l toV5(TextFormatModel textformatmodel, Type type, r r1)
    {
        type = new com.google.b.o();
        type.a("font", r1.a(textformatmodel.getFont(), com/cardinalblue/android/piccollage/model/gson/FontModel));
        type.a("shadow", r1.a(Boolean.valueOf(textformatmodel.hasShadow()), java/lang/Boolean));
        type.a("alignment", r1.a(textformatmodel.getTextAlignment(), java/lang/String));
        type.a("color", r1.a(textformatmodel.getTextColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
        type.a("background_color", r1.a(textformatmodel.getTextBackgroundColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
        type.a("border", r1.a(Boolean.valueOf(textformatmodel.hasTextBorder()), java/lang/Boolean));
        type.a("border_color", r1.a(textformatmodel.getBorderColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
        return type;
    }

    protected volatile l toV5(Object obj, Type type, r r1)
    {
        return toV5((TextFormatModel)obj, type, r1);
    }

    public ( )
    {
        super();
    }
}
