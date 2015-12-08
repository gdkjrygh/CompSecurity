// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content:
//            i, j

public class FileProvider extends ContentProvider
{

    private static final String a[] = {
        "_display_name", "_size"
    };
    private static final File b = new File("/");
    private static HashMap c = new HashMap();
    private i d;

    public FileProvider()
    {
    }

    private static i a(Context context, String s)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj1 = (i)c.get(s);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        XmlResourceParser xmlresourceparser;
        obj1 = new j(s);
        xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlresourceparser != null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        context;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context);
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
_L12:
        Object obj2 = ((File) (obj)).getCanonicalFile();
        String s1;
        ((j) (obj1)).a.put(s1, obj2);
_L4:
        int k = xmlresourceparser.next();
        if (k == 1) goto _L6; else goto _L5
_L5:
        if (k != 2) goto _L4; else goto _L7
_L7:
        obj = xmlresourceparser.getName();
        s1 = xmlresourceparser.getAttributeValue(null, "name");
        obj2 = xmlresourceparser.getAttributeValue(null, "path");
        if (!"root-path".equals(obj)) goto _L9; else goto _L8
_L8:
        obj = a(b, new String[] {
            obj2
        });
_L15:
        if (obj == null) goto _L4; else goto _L10
_L10:
        if (!TextUtils.isEmpty(s1)) goto _L12; else goto _L11
_L11:
        throw new IllegalArgumentException("Name must not be empty");
        context;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context);
_L9:
        if (!"files-path".equals(obj)) goto _L14; else goto _L13
_L13:
        obj = a(context.getFilesDir(), new String[] {
            obj2
        });
          goto _L15
_L14:
label0:
        {
            if (!"cache-path".equals(obj))
            {
                break label0;
            }
            obj = a(context.getCacheDir(), new String[] {
                obj2
            });
        }
          goto _L15
        if (!"external-path".equals(obj))
        {
            break MISSING_BLOCK_LABEL_347;
        }
        obj = a(Environment.getExternalStorageDirectory(), new String[] {
            obj2
        });
          goto _L15
        context;
        throw new IllegalArgumentException((new StringBuilder("Failed to resolve canonical path for ")).append(obj).toString(), context);
_L6:
        c.put(s, obj1);
        obj = obj1;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return ((i) (obj));
        obj = null;
          goto _L15
    }

    private static transient File a(File file, String as[])
    {
        for (int k = 0; k <= 0; k++)
        {
            String s = as[0];
            if (s != null)
            {
                file = new File(file, s);
            }
        }

        return file;
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
        if (providerinfo.exported)
        {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerinfo.grantUriPermissions)
        {
            throw new SecurityException("Provider must grant uri permissions");
        } else
        {
            d = a(context, providerinfo.authority);
            return;
        }
    }

    public int delete(Uri uri, String s, String as[])
    {
        return !d.a(uri).delete() ? 0 : 1;
    }

    public String getType(Uri uri)
    {
        uri = d.a(uri);
        int k = uri.getName().lastIndexOf('.');
        if (k >= 0)
        {
            uri = uri.getName().substring(k + 1);
            uri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uri);
            if (uri != null)
            {
                return uri;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        uri = d.a(uri);
        int k;
        if ("r".equals(s))
        {
            k = 0x10000000;
        } else
        if ("w".equals(s) || "wt".equals(s))
        {
            k = 0x2c000000;
        } else
        if ("wa".equals(s))
        {
            k = 0x2a000000;
        } else
        if ("rw".equals(s))
        {
            k = 0x38000000;
        } else
        if ("rwt".equals(s))
        {
            k = 0x3c000000;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid mode: ")).append(s).toString());
        }
        return ParcelFileDescriptor.open(uri, k);
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        s = d.a(uri);
        uri = as;
        if (as == null)
        {
            uri = a;
        }
        as1 = new String[uri.length];
        as = ((String []) (new Object[uri.length]));
        int k1 = uri.length;
        int l = 0;
        int k = 0;
        while (l < k1) 
        {
            s1 = uri[l];
            if ("_display_name".equals(s1))
            {
                as1[k] = "_display_name";
                int i1 = k + 1;
                as[k] = s.getName();
                k = i1;
            } else
            if ("_size".equals(s1))
            {
                as1[k] = "_size";
                int j1 = k + 1;
                as[k] = Long.valueOf(s.length());
                k = j1;
            }
            l++;
        }
        uri = new String[k];
        System.arraycopy(as1, 0, uri, 0, k);
        s = ((String) (new Object[k]));
        System.arraycopy(as, 0, s, 0, k);
        uri = new MatrixCursor(uri, 1);
        uri.addRow(s);
        return uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("No external updates");
    }

}
