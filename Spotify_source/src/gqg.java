// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.update.AppVersion;
import com.spotify.music.update.AppVersionParsingException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class gqg
    implements gqf
{

    public gqg()
    {
    }

    private static Collection a(InputStream inputstream)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        bds.a(inputstream);
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        Logger.c("Empty inputStream", new Object[0]);
_L6:
        return arraylist;
_L2:
        int i;
        try
        {
            inputstream = (new JSONObject((new Scanner(inputstream)).useDelimiter("\\A").next())).optJSONArray("appVersions");
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Logger.b(inputstream, "Failed to parse Appversion Obj from JSON", new Object[0]);
            return arraylist;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Logger.b(inputstream, "Failed to parse JSON object.", new Object[0]);
            return arraylist;
        }
        if (inputstream == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
        if (i >= inputstream.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(AppVersion.a(inputstream.getJSONObject(i)));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_89;
_L4:
        break MISSING_BLOCK_LABEL_63;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static InputStream b()
    {
        BufferedInputStream bufferedinputstream;
        try
        {
            Logger.a("UpdateNag: Fetching version ID file from: %s", new Object[] {
                String.format("http://d1yypvapi0ho9y.cloudfront.net/android/%s.json", new Object[] {
                    c()
                })
            });
            bufferedinputstream = new BufferedInputStream(((HttpURLConnection)(new URL(String.format("http://d1yypvapi0ho9y.cloudfront.net/android/%s.json", new Object[] {
                c()
            }))).openConnection()).getInputStream());
        }
        catch (IOException ioexception)
        {
            ioexception.getMessage();
            return null;
        }
        return bufferedinputstream;
    }

    private static String c()
    {
        Object obj = DebugFlag.j;
        try
        {
            obj = gmn.getDeclaredField("a");
            Logger.a("UpdateNag: versionID: %s", new Object[] {
                ((Field) (obj)).get(null)
            });
            obj = (String)((Field) (obj)).get(null);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            return "";
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            return "";
        }
        return ((String) (obj));
    }

    public final Collection a()
    {
        InputStream inputstream = null;
        InputStream inputstream1 = b();
        if (inputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        inputstream = inputstream1;
        Collection collection = a(inputstream1);
        gdv.a(inputstream1);
        return collection;
        gdv.a(inputstream1);
        return new LinkedList();
        Exception exception;
        exception;
        gdv.a(inputstream);
        throw exception;
    }
}
