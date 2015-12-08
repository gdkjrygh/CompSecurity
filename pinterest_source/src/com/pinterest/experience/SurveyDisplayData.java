// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.experience:
//            DisplayDataBase

public class SurveyDisplayData extends DisplayDataBase
{

    public String a;
    public Button b[];

    public SurveyDisplayData(PinterestJsonObject pinterestjsonobject)
    {
        super(pinterestjsonobject);
    }

    public final void a(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null)
        {
            j = pinterestjsonobject.a("title_text", "");
            a = pinterestjsonobject.a("subtitle_text", "");
            k = pinterestjsonobject.a("detailed_text", "");
            pinterestjsonobject = pinterestjsonobject.e("buttons");
            b = new Button[pinterestjsonobject.a()];
            int i = 0;
            while (i < pinterestjsonobject.a()) 
            {
                PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c(i);
                b[i] = new Button(pinterestjsonobject1.a("text", ""), pinterestjsonobject1.a("uri", ""));
                i++;
            }
        }
    }

    private class Button
    {

        public String a;
        public String b;
        final SurveyDisplayData c;

        public Button(String s, String s1)
        {
            c = SurveyDisplayData.this;
            super();
            a = s;
            b = s1;
        }
    }

}
