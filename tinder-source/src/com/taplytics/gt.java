// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, hc, gs, hf, 
//            hj, gx

public final class gt
{

    private static final gt a = new gt();

    private gt()
    {
    }

    public static gt a()
    {
        return a;
    }

    public static void a(String s, hc hc1)
    {
        Date date;
        Context context = ci.b().u;
        if (context == null)
        {
            hc1.a(new Exception("No App Context to write JSON to disk"));
            return;
        }
        date = new Date();
        s = new File(context.getCacheDir(), s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        if (s.delete() && gs.b())
        {
            gs.a("Deleted File", date);
        }
_L4:
        hc1.a(null);
        return;
_L2:
        if (gs.b())
        {
            gs.a("File does not exist to delete");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s, String s1, hf hf1)
    {
        Date date;
        Context context = ci.b().u;
        date = new Date();
        s = new File(context.getCacheDir(), s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        byte byte0;
        ObjectInputStream objectinputstream;
        try
        {
            objectinputstream = new ObjectInputStream(new FileInputStream(s));
            obj = objectinputstream.readObject();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.b("Reading file from disk: ", s);
            hf1.a(null, s);
            return;
        }
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 260
    //                   1025355039: 171
    //                   1706651217: 156
    //                   1752376903: 141;
           goto _L3 _L4 _L5 _L6
_L7:
        hf1.a(s, null);
        if (gs.b())
        {
            gs.a((new StringBuilder("Read item from disk: ")).append(s1).toString(), date);
        }
        objectinputstream.close();
        return;
_L6:
        if (s1.equals("JSONObject"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (s1.equals("JSONArray"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s1.equals("Serializable"))
        {
            byte0 = 2;
        }
          goto _L3
_L9:
        s = new JSONObject((String)obj);
          goto _L7
_L10:
        s = new JSONArray((String)obj);
          goto _L7
_L2:
        if (gs.b())
        {
            gs.a("File does not exist");
        }
        hf1.a(null, new Exception("File does not exist"));
        return;
_L3:
        s = ((String) (obj));
        byte0;
        JVM INSTR tableswitch 0 2: default 292
    //                   0 186
    //                   1 201
    //                   2 100;
           goto _L8 _L9 _L10 _L7
_L8:
        s = null;
          goto _L7
    }

    public final void a(ArrayList arraylist)
    {
        Context context = ci.b().u;
        if (context == null)
        {
            try
            {
                if (gs.b())
                {
                    gs.a("Writing TLEvents to Disk: No App Context to write JSON to disk");
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (ArrayList arraylist)
            {
                gs.b("wr err: ", arraylist);
            }
            break MISSING_BLOCK_LABEL_78;
        }
        (new hj(new JSONArray(Arrays.asList(new ArrayList[] {
            arraylist
        })), "TLEvents.json", context.getCacheDir(), new gx(this))).execute(new Void[0]);
        return;
    }

}
