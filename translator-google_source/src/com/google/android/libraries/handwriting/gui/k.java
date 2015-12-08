// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.text.TextUtils;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            i

public final class k
    implements Runnable
{

    final i a;
    private final String b;
    private final String c;
    private final RecognitionResult d;
    private final String e;

    protected k(i j, String s, String s1, RecognitionResult recognitionresult, String s2)
    {
        a = j;
        super();
        b = s;
        c = s1;
        d = recognitionresult;
        e = s2;
    }

    public final void run()
    {
        long l1 = System.currentTimeMillis();
        if (d.d == null)
        {
            d.d = "";
        }
        Object obj = d;
        String s = String.valueOf(d.d);
        long l2 = d.c;
        long l3 = d.b;
        obj.d = (new StringBuilder(String.valueOf(s).length() + 25)).append(s).append(" IME:").append(l2 - l3).toString();
        obj = d;
        s = String.valueOf(d.d);
        l2 = d.c;
        obj.d = (new StringBuilder(String.valueOf(s).length() + 24)).append(s).append(" FB:").append(l1 - l2).toString();
        obj = String.valueOf(c);
        if (((String) (obj)).length() != 0)
        {
            "Starting logging task: src=".concat(((String) (obj)));
        } else
        {
            new String("Starting logging task: src=");
        }
        obj = String.valueOf(b);
        if (((String) (obj)).length() != 0)
        {
            "text=".concat(((String) (obj)));
        } else
        {
            new String("text=");
        }
        obj = String.valueOf(d.b());
        if (((String) (obj)).length() != 0)
        {
            "inkHash=".concat(((String) (obj)));
        } else
        {
            new String("inkHash=");
        }
        if (d.j != null)
        {
            int j = d.j.size();
            (new StringBuilder(20)).append("nStrokes=").append(j);
            Object obj1 = String.valueOf(d.j.getPreContext());
            String s1;
            String s2;
            if (((String) (obj1)).length() != 0)
            {
                "preContext=".concat(((String) (obj1)));
            } else
            {
                new String("preContext=");
            }
            obj1 = String.valueOf(d.j.getPostContext());
            if (((String) (obj1)).length() != 0)
            {
                "postContext= ".concat(((String) (obj1)));
            } else
            {
                new String("postContext= ");
            }
        }
        if (!TextUtils.isEmpty(e))
        {
            obj1 = d;
            s1 = String.valueOf(d.d);
            s2 = e;
            obj1.d = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length())).append(s1).append(" ").append(s2).toString();
        }
        if (!TextUtils.isEmpty(d.b())) goto _L2; else goto _L1
_L1:
        if (d.j != null && !d.j.isEmpty()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        int l = d.j.size();
        (new StringBuilder(29)).append("logging with ink: ").append(l);
        Object obj2;
        com.google.android.libraries.handwriting.base.HandwritingRecognizer.SendingFeedbackFailedException sendingfeedbackfailedexception;
        try
        {
            obj2 = a.a.a(b, d.j, c, d.d);
        }
        catch (com.google.android.libraries.handwriting.base.HandwritingRecognizer.SendingFeedbackFailedException sendingfeedbackfailedexception1)
        {
            return;
        }
        if (obj2 != null)
        {
            try
            {
                (new JSONArray(((String) (obj2)))).getJSONArray(1).getJSONArray(0).getString(0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj2 = String.valueOf(d.b());
        if (((String) (obj2)).length() != 0)
        {
            "logging with hash: ".concat(((String) (obj2)));
        } else
        {
            new String("logging with hash: ");
        }
        try
        {
            obj2 = a.a.a(b, d.b(), c, d.d);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.libraries.handwriting.base.HandwritingRecognizer.SendingFeedbackFailedException sendingfeedbackfailedexception)
        {
            return;
        }
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_574;
_L5:
        if (true) goto _L3; else goto _L7
_L7:
    }
}
