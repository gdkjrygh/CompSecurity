// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

public class mValue
{

    public String mParameter;
    public List mValue;
    final mValue this$1;

    public String getParameter()
    {
        return mParameter;
    }

    public void updateValue(String s)
    {
        mValue.add(URLDecoder.decode(s));
    }

    public (String s, String s1)
    {
        this$1 = this._cls1.this;
        super();
        mParameter = s;
        mValue = new ArrayList();
        mValue.add(URLDecoder.decode(s1));
    }
}
