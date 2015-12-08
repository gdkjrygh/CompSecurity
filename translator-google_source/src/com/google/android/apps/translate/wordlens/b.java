// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.wordlens;

import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.textinput.ac;
import com.google.android.apps.unveil.textinput.ae;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.wordlens:
//            c

public final class b extends ac
{

    private final c c;

    public b(ae ae1, c c1)
    {
        super(ae1);
        c = c1;
    }

    public final void a(long l, Size size)
    {
    }

    protected final void a(List list)
    {
        com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText recognizedtext;
        int j;
        boolean flag;
        j = 0;
        flag = true;
        recognizedtext = c(list);
        if (recognizedtext != null && recognizedtext.b.length > 0) goto _L2; else goto _L1
_L1:
        int i;
        if (c != null)
        {
            c.a(null);
        }
        if (!a())
        {
            b.j();
        }
        i = 0;
_L4:
        if (!a() && i != 0)
        {
            b.k();
        }
        return;
_L2:
        list = new com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word[recognizedtext.b.length];
        com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word aword[] = recognizedtext.b;
        int k = aword.length;
        for (i = 0; j < k; i++)
        {
            com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word = aword[j];
            com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word1 = (new com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word()).setText(word.getText());
            word1.box = a(word.box);
            list[i] = word1;
            j++;
        }

        i = ((flag) ? 1 : 0);
        if (c != null)
        {
            c.a(list);
            i = ((flag) ? 1 : 0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
