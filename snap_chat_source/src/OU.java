// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.snapchat.android.Timber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class OU
{

    private static final char LINE_SEPARATOR = 10;
    private static final String TAG = "RawResourceReader";

    public static String a(Context context)
    {
        Object obj;
        context = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(0x7f070005)));
        obj = new StringBuilder();
_L1:
        String s = context.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append('\n');
          goto _L1
        obj;
        try
        {
            context.close();
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.e("RawResourceReader", (new StringBuilder("Failed to read text file ")).append(context).toString(), new Object[0]);
        }
        return null;
        context.close();
        context = ((StringBuilder) (obj)).toString();
        return context;
    }
}
