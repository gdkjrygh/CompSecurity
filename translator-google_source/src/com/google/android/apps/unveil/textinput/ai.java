// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.view.animation.AnimationUtils;
import com.google.android.apps.unveil.env.Size;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ac, aa, BoundingBoxView, ae

public final class ai extends ac
{

    private final BoundingBoxView c;
    private final aa d;

    public ai(BoundingBoxView boundingboxview, aa aa1, ae ae1)
    {
        super(ae1);
        c = boundingboxview;
        d = aa1;
    }

    public final void a(long l, Size size)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == l)
        {
            aa aa1 = d;
            aa1.a = size;
            aa1.b();
            c.setQueryPictureSize(size);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        size;
        throw size;
    }

    protected final void a(List list)
    {
        boolean flag = true;
        com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText recognizedtext = c(list);
        int i;
        if (recognizedtext == null || recognizedtext.b.length <= 0)
        {
            d.a(null);
            if (!a())
            {
                b.j();
            }
            i = 0;
        } else
        {
            list = new ArrayList();
            com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word aword[] = recognizedtext.b;
            int j = aword.length;
            for (i = 0; i < j; i++)
            {
                com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word = aword[i];
                com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word1 = (new com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word()).setText(word.getText());
                word1.box = a(word.box);
                list.add(word1);
            }

            d.a(list);
            i = ((flag) ? 1 : 0);
        }
        c.setAnimation(AnimationUtils.loadAnimation(c.getContext(), 0x10a0000));
        c.setVisibility(0);
        if (!a() && i != 0)
        {
            b.k();
        }
    }
}
