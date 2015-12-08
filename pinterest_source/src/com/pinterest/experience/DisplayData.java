// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.ExperienceCompleteAction;
import com.pinterest.schemas.experiences.NagDisplayType;

// Referenced classes of package com.pinterest.experience:
//            DisplayDataBase

public class DisplayData extends DisplayDataBase
{

    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public ExperienceCompleteAction h;
    public int i;

    public DisplayData(PinterestJsonObject pinterestjsonobject)
    {
        super(pinterestjsonobject);
    }

    public final void a(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            j = pinterestjsonobject.a("title_text", "");
            k = pinterestjsonobject.a("detailed_text", "");
            a = pinterestjsonobject.a("button1_text", "");
            b = pinterestjsonobject.a("button1_uri", "");
            c = pinterestjsonobject.a("button2_text", "");
            d = pinterestjsonobject.a("button2_uri", "");
            f = pinterestjsonobject.a("bg_img_url_1x", "");
            g = pinterestjsonobject.a("bg_img_url_2x", "");
            e = pinterestjsonobject.a("complete_action", 0);
            h = ExperienceCompleteAction.findByValue(e);
            i = pinterestjsonobject.a("display_type", NagDisplayType.STANDARD.getValue());
            return;
        }
    }
}
