// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

final class htk extends mtf
{

    public htk()
    {
        super("com.google.android.apps.photos.earch.peoplegroupingonboarding.newuser.CountryCodes");
    }

    protected final mue a(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ArrayList arraylist;
        try
        {
            context = context.getResources().openRawResource(b.xG);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            obj = null;
            context = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            context = null;
            obj2 = null;
        }
        obj = new BufferedReader(new InputStreamReader(context));
        obj2 = obj;
        obj1 = context;
        arraylist = new ArrayList();
        obj2 = obj;
        obj1 = context;
        ((BufferedReader) (obj)).readLine();
_L2:
        obj2 = obj;
        obj1 = context;
        obj3 = ((BufferedReader) (obj)).readLine();
        if (obj3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj;
        obj1 = context;
        arraylist.add(((String) (obj3)).substring(((String) (obj3)).lastIndexOf(',') + 1, ((String) (obj3)).length()));
        if (true) goto _L2; else goto _L1
        obj1;
_L6:
        obj2 = obj;
        obj1 = context;
        obj3 = new mue(false);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((mue) (obj3));
            }
        }
        return ((mue) (obj3));
_L1:
        obj2 = obj;
        obj1 = context;
        obj3 = new mue(true);
        obj2 = obj;
        obj1 = context;
        ((mue) (obj3)).a().putStringArrayList("extra_country_codes", arraylist);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((mue) (obj3));
        }
        return ((mue) (obj3));
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw obj;
        obj;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj;
        context = ((Context) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_11;
        IOException ioexception;
        ioexception;
        ioexception = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
