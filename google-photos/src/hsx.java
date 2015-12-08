// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.List;

public class hsx
{

    private final Context a;

    public hsx(Context context)
    {
        a = context;
    }

    public final List a(int i, String s, int j, int k)
    {
        s = new hrq(a, i, s, j, k);
        s.d();
        if (s.l())
        {
            if (Log.isLoggable("SuggestionsCore", 3))
            {
                i = ((nxx) (s)).l;
                (new StringBuilder(72)).append("Error while fetching AutoCompleteSuggestions with errorCode: ").append(i);
                s = ((nxx) (s)).n;
            }
            return Collections.emptyList();
        } else
        {
            return s.a();
        }
    }
}
