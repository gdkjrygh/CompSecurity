// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.net.Uri;
import com.appboy.f;
import com.appboy.f.a;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public final class dk
{

    private static final String a;

    public dk()
    {
    }

    public static URI a(Uri uri)
    {
        URI uri1;
        try
        {
            uri1 = new URI(uri.toString());
        }
        catch (URISyntaxException urisyntaxexception)
        {
            com.appboy.f.a.d(a, String.format("Could not create URI from uri [%s]", new Object[] {
                uri.toString()
            }));
            return null;
        }
        return uri1;
    }

    public static URL a(URI uri)
    {
        try
        {
            uri = new URL(uri.toString());
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            com.appboy.f.a.d(a, String.format("Unable to parse URI [%s]", new Object[] {
                uri.getMessage()
            }));
            return null;
        }
        return uri;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/dk.getName()
        });
    }
}
