// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.a.e;
import com.google.b.c.a;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            ColorOption

public class ColorOptionList
{
    public static class ColorOptionListDeserializer
        implements k
    {

        private static final Type sToken = (new a() {

        }).getType();

        public ColorOptionList deserialize(l l1, Type type, j j1)
            throws p
        {
            type = new ColorOptionList();
            type.colorOptions = (List)j1.a(e.b(l1.m(), "Base Colors"), sToken);
            return type;
        }

        public volatile Object deserialize(l l1, Type type, j j1)
            throws p
        {
            return deserialize(l1, type, j1);
        }


        public ColorOptionListDeserializer()
        {
        }
    }


    private static final String LIST_TAG = "Base Colors";
    public List colorOptions;

    public ColorOptionList()
    {
        colorOptions = new ArrayList();
    }

    public ColorOption getColorOption(int i)
    {
        ColorOption coloroption1 = new ColorOption(i);
        ColorOption coloroption = coloroption1;
        if (colorOptions.contains(coloroption1))
        {
            coloroption = (ColorOption)colorOptions.get(colorOptions.indexOf(coloroption1));
        }
        return coloroption;
    }

    public int getColorOptionIndex(int i)
    {
        ColorOption coloroption = new ColorOption(i);
        return colorOptions.indexOf(coloroption);
    }
}
