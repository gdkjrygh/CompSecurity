// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.graphics.Point;
import com.google.android.apps.unveil.env.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ab
{

    final List a = new ArrayList();
    float b;

    ab()
    {
        b = 0.0F;
    }

    public final void a(com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word, int i, int j, List list)
    {
        a.add(word);
        word = list.iterator();
        float f = 3.402823E+38F;
        do
        {
            if (!word.hasNext())
            {
                break;
            }
            list = (Point)word.next();
            float f1 = e.a(i, j, ((Point) (list)).x, ((Point) (list)).y);
            if (f1 < f)
            {
                f = f1;
            }
        } while (true);
        b = b + f;
    }
}
