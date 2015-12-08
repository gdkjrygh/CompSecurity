// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.graphics.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ag, ah

public final class af
    implements ag
{

    private final Map a = new HashMap();

    public af()
    {
    }

    public final ah a(com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word)
    {
        if (a.containsKey(word))
        {
            return (ah)a.get(word);
        } else
        {
            return null;
        }
    }

    public final void a(List list)
    {
        a.clear();
        if (list != null && list.size() != 0)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word word = (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word)list.next();
                com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox boundingbox = word.box;
                a.put(word, new ah(new Point(boundingbox.getX(), boundingbox.getY() + boundingbox.getHeight()), new Point(boundingbox.getX() + boundingbox.getWidth(), boundingbox.getY() + boundingbox.getHeight()), boundingbox));
            }
        }
    }
}
