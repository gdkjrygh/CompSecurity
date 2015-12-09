// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import org.json.JSONArray;
import org.json.JSONException;

class ject
{

    final ception a;
    final ception b;

    public void a(String s)
    {
        try
        {
            a.a(new JSONArray(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.a(s);
        }
    }

    NException(NException nexception, NException nexception1)
    {
        b = nexception;
        a = nexception1;
        super();
    }
}
