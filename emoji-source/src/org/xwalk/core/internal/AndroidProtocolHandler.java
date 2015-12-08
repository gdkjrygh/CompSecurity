// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.util.List;

class AndroidProtocolHandler
{

    static final boolean $assertionsDisabled;
    public static final String APP_SCHEME = "app";
    private static final String APP_SRC = "www";
    private static final String CONTENT_SCHEME = "content";
    public static final String FILE_SCHEME = "file";
    private static final String SCHEME_SEPARATOR = "//";
    private static final String TAG = "AndroidProtocolHandler";

    AndroidProtocolHandler()
    {
    }

    public static Uri appUriToFileUri(Uri uri)
    {
        if (!$assertionsDisabled && !uri.getScheme().equals("app"))
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && uri.getPath() == null)
        {
            throw new AssertionError();
        }
        Uri uri1;
        try
        {
            uri1 = Uri.parse((new URI("file", (new StringBuilder()).append("//").append(nativeGetAndroidAssetPath()).append("www").append(uri.getPath()).toString(), null)).normalize().toString());
        }
        catch (URISyntaxException urisyntaxexception)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to convert app URI to file URI: ").append(uri).toString(), urisyntaxexception);
            return null;
        }
        return uri1;
    }

    public static String getAssetPath(Uri uri)
    {
        if (!$assertionsDisabled && !uri.getScheme().equals("file"))
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && uri.getPath() == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && !uri.getPath().startsWith(nativeGetAndroidAssetPath()))
        {
            throw new AssertionError();
        } else
        {
            return (new File(uri.getPath())).getAbsolutePath().replaceFirst(nativeGetAndroidAssetPath(), "");
        }
    }

    private static int getFieldId(Context context, String s, String s1)
        throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException
    {
        return context.getClassLoader().loadClass((new StringBuilder()).append(context.getPackageName()).append(".R$").append(s).toString()).getField(s1).getInt(null);
    }

    public static String getMimeType(Context context, InputStream inputstream, String s)
    {
        Uri uri = verifyUrl(s);
        if (uri != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        try
        {
            String s1 = uri.getPath();
            if (uri.getScheme().equals("content"))
            {
                return context.getContentResolver().getType(uri);
            }
            if (!uri.getScheme().equals("app") && (!uri.getScheme().equals("file") || !s1.startsWith(nativeGetAndroidAssetPath())))
            {
                break; /* Loop/switch isn't completed */
            }
            context = URLConnection.guessContentTypeFromName(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to get mime type").append(s).toString());
            return null;
        }
        s = context;
        context = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        try
        {
            context = URLConnection.guessContentTypeFromStream(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String getPackageName(Context context)
    {
        try
        {
            context = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", "Unable to get package name");
            return null;
        }
        return context;
    }

    static String getUrlContent(Context context, String s)
        throws IOException
    {
        InputStream inputstream;
        inputstream = open(context, s);
        if (inputstream == null)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to open the url: ").append(s).toString());
        }
        context = "";
        s = new byte[1024];
_L1:
        int i = inputstream.read(s, 0, 1024);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        context = (new StringBuilder()).append(context).append(new String(s, 0, i)).toString();
          goto _L1
        inputstream.close();
        return context;
        context;
        inputstream.close();
        throw context;
    }

    private static int getValueType(Context context, int i)
    {
        TypedValue typedvalue = new TypedValue();
        context.getResources().getValue(i, typedvalue, true);
        return typedvalue.type;
    }

    private static native String nativeGetAndroidAssetPath();

    private static native String nativeGetAndroidResourcePath();

    private static native void nativeSetResourceContextForTesting(Context context);

    public static InputStream open(Context context, String s)
    {
        Uri uri = verifyUrl(s);
        if (uri != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s1;
label0:
        {
            s1 = uri.getPath();
            if (!uri.getScheme().equals("file"))
            {
                break label0;
            }
            if (s1.startsWith(nativeGetAndroidAssetPath()))
            {
                return openAsset(context, uri);
            }
            if (s1.startsWith(nativeGetAndroidResourcePath()))
            {
                return openResource(context, uri);
            }
        }
          goto _L1
        if (uri.getScheme().equals("content"))
        {
            return openContent(context, uri);
        }
        if (!uri.getScheme().equals("app") || !uri.getHost().equals(context.getPackageName().toLowerCase()) || s1.length() <= 1) goto _L1; else goto _L3
_L3:
        context = openAsset(context, appUriToFileUri(uri));
        return context;
        context;
        Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Error opening inputstream: ").append(s).toString());
        return null;
    }

    private static InputStream openAsset(Context context, Uri uri)
    {
        if (!$assertionsDisabled && !uri.getScheme().equals("file"))
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && uri.getPath() == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && !uri.getPath().startsWith(nativeGetAndroidAssetPath()))
        {
            throw new AssertionError();
        }
        try
        {
            context = context.getAssets().open(getAssetPath(uri), 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to open asset URL: ").append(uri).toString());
            return null;
        }
        return context;
    }

    private static InputStream openContent(Context context, Uri uri)
    {
        if (!$assertionsDisabled && !uri.getScheme().equals("content"))
        {
            throw new AssertionError();
        }
        try
        {
            Uri uri1 = stripQueryParameters(uri);
            context = context.getContentResolver().openInputStream(uri1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to open content URL: ").append(uri).toString());
            return null;
        }
        return context;
    }

    private static InputStream openResource(Context context, Uri uri)
    {
        if (!$assertionsDisabled && !uri.getScheme().equals("file"))
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && uri.getPath() == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && !uri.getPath().startsWith(nativeGetAndroidResourcePath()))
        {
            throw new AssertionError();
        }
        Object obj1 = uri.getPathSegments();
        if (((List) (obj1)).size() != 3)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Incorrect resource path: ").append(uri).toString());
            return null;
        }
        Object obj = (String)((List) (obj1)).get(0);
        String s = (String)((List) (obj1)).get(1);
        obj1 = (String)((List) (obj1)).get(2);
        if (!(new StringBuilder()).append("/").append(((String) (obj))).append("/").toString().equals(nativeGetAndroidResourcePath()))
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Resource path does not start with ").append(nativeGetAndroidResourcePath()).append(": ").append(uri).toString());
            return null;
        }
        obj1 = ((String) (obj1)).split("\\.")[0];
        obj = context;
        try
        {
            if (context.getApplicationContext() != null)
            {
                obj = context.getApplicationContext();
            }
            int i = getFieldId(((Context) (obj)), s, ((String) (obj1)));
            if (getValueType(((Context) (obj)), i) == 3)
            {
                return ((Context) (obj)).getResources().openRawResource(i);
            }
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Asset not of type string: ").append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to open resource URL: ").append(uri).toString(), context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to open resource URL: ").append(uri).toString(), context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Unable to open resource URL: ").append(uri).toString(), context);
            return null;
        }
        return null;
    }

    public static void setResourceContextForTesting(Context context)
    {
        nativeSetResourceContextForTesting(context);
    }

    private static Uri stripQueryParameters(Uri uri)
    {
        if (!$assertionsDisabled && uri.getAuthority() == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && uri.getPath() == null)
        {
            throw new AssertionError();
        } else
        {
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.encodedAuthority(uri.getAuthority());
            builder.encodedPath(uri.getPath());
            return builder.build();
        }
    }

    private static Uri verifyUrl(String s)
    {
        Uri uri;
        if (s == null)
        {
            uri = null;
        } else
        {
            uri = Uri.parse(s);
            if (uri == null)
            {
                Log.e("AndroidProtocolHandler", (new StringBuilder()).append("Malformed URL: ").append(s).toString());
                return null;
            }
            String s1 = uri.getPath();
            if (s1 == null || s1.length() == 0)
            {
                Log.e("AndroidProtocolHandler", (new StringBuilder()).append("URL does not have a path: ").append(s).toString());
                return null;
            }
        }
        return uri;
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/AndroidProtocolHandler.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
