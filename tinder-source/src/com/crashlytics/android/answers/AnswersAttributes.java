// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventValidator

class AnswersAttributes
{

    final AnswersEventValidator a;
    final Map b = new HashMap();

    public AnswersAttributes(AnswersEventValidator answerseventvalidator)
    {
        a = answerseventvalidator;
    }

    public String toString()
    {
        return (new JSONObject(b)).toString();
    }
}
