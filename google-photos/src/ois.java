// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import org.xml.sax.XMLReader;

public final class ois
    implements android.text.Html.TagHandler
{

    public ois()
    {
    }

    private static void a(Editable editable)
    {
        Object obj;
        Object obj1;
        Object aobj[];
        int j;
        j = editable.length();
        aobj = editable.getSpans(0, j, android/text/style/StrikethroughSpan);
        obj1 = null;
        obj = obj1;
        if (aobj == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (aobj.length <= 0) goto _L2; else goto _L3
_L3:
        int i = aobj.length - 1;
_L8:
        obj = obj1;
        if (i < 0) goto _L2; else goto _L4
_L4:
        if (editable.getSpanFlags(aobj[i]) != 17) goto _L6; else goto _L5
_L5:
        obj = aobj[i];
_L2:
        i = editable.getSpanStart(obj);
        editable.removeSpan(obj);
        if (i != j)
        {
            editable.setSpan(new StrikethroughSpan(), i, j, 33);
        }
        return;
_L6:
        i--;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void handleTag(boolean flag, String s, Editable editable, XMLReader xmlreader)
    {
label0:
        {
            s = s.toLowerCase();
            if (TextUtils.equals(s, "strike") || TextUtils.equals(s, "s"))
            {
                if (!flag)
                {
                    break label0;
                }
                int i = editable.length();
                editable.setSpan(new StrikethroughSpan(), i, i, 17);
            }
            return;
        }
        a(editable);
    }
}
