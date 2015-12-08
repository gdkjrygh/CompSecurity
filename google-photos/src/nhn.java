// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class nhn extends mtf
{

    private final mnh a;

    public nhn(String s, mnh mnh1)
    {
        super(s);
        a = mnh1;
    }

    protected final mue a(Context context)
    {
        mne amne[];
        mue mue1;
        int i;
        try
        {
            amne = a.a();
            context = new String[amne.length];
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(false);
        }
        i = 0;
        if (i >= context.length)
        {
            break; /* Loop/switch isn't completed */
        }
        context[i] = amne[i].a;
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        mue1 = new mue(true);
        mue1.a().putStringArray("account_name_array", context);
        return mue1;
    }
}
