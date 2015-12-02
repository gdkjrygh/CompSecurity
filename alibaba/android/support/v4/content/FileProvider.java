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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider
{
    static interface a
    {

        public abstract File a(Uri uri);
    }

    static class b
        implements a
    {

        private final String a;
        private final HashMap b = new HashMap();

        public File a(Uri uri)
        {
            Object obj1 = uri.getEncodedPath();
            int i = ((String) (obj1)).indexOf('/', 1);
            Object obj = Uri.decode(((String) (obj1)).substring(1, i));
            obj1 = Uri.decode(((String) (obj1)).substring(i + 1));
            obj = (File)b.get(obj);
            if (obj == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unable to find configured root for ").append(uri).toString());
            }
            uri = new File(((File) (obj)), ((String) (obj1)));
            try
            {
                obj1 = uri.getCanonicalFile();
            }
            catch (IOException ioexception)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(uri).toString());
            }
            if (!((File) (obj1)).getPath().startsWith(((File) (obj)).getPath()))
            {
                throw new SecurityException("Resolved path jumped beyond configured root");
            } else
            {
                return ((File) (obj1));
            }
        }

        public void a(String s, File file)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Name must not be empty");
            }
            File file1;
            try
            {
                file1 = file.getCanonicalFile();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(file).toString(), s);
            }
            b.put(s, file1);
        }

        public b(String s)
        {
            a = s;
        }
    }


    private static final String a[] = {
        "_display_name", "_size"
    };
    private static final File b = new File("/");
    private static HashMap c = new HashMap();
    private a d;

    public FileProvider()
    {
    }

    private static int a(String s)
    {
        if ("r".equals(s))
        {
            return 0x10000000;
        }
        if ("w".equals(s) || "wt".equals(s))
        {
            return 0x2c000000;
        }
        if ("wa".equals(s))
        {
            return 0x2a000000;
        }
        if ("rw".equals(s))
        {
            return 0x38000000;
        }
        if ("rwt".equals(s))
        {
            return 0x3c000000;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid mode: ").append(s).toString());
        }
    }

    private static a a(Context context, String s)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        a a2 = (a)c.get(s);
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        a1 = b(context, s);
        c.put(s, a1);
        hashmap;
        JVM INSTR monitorexit ;
        return a1;
        context;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context);
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
        context;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context);
    }

    private static transient File a(File file, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s != null)
            {
                file = new File(file, s);
            }
        }

        return file;
    }

    private static Object[] a(Object aobj[], int i)
    {
        Object aobj1[] = new Object[i];
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
        return aobj1;
    }

    private static String[] a(String as[], int i)
    {
        String as1[] = new String[i];
        System.arraycopy(as, 0, as1, 0, i);
        return as1;
    }

    private static a b(Context context, String s)
        throws IOException, XmlPullParserException
    {
        b b1 = new b(s);
        XmlResourceParser xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlresourceparser == null)
        {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        do
        {
            int i = xmlresourceparser.next();
            if (i != 1)
            {
                if (i == 2)
                {
                    s = xmlresourceparser.getName();
                    String s1 = xmlresourceparser.getAttributeValue(null, "name");
                    String s2 = xmlresourceparser.getAttributeValue(null, "path");
                    if ("root-path".equals(s))
                    {
                        s = a(b, new String[] {
                            s2
                        });
                    } else
                    if ("files-path".equals(s))
                    {
                        s = a(context.getFilesDir(), new String[] {
                            s2
                        });
                    } else
                    if ("cache-path".equals(s))
                    {
                        s = a(context.getCacheDir(), new String[] {
                            s2
                        });
                    } else
                    if ("external-path".equals(s))
                    {
                        s = a(Environment.getExternalStorageDirectory(), new String[] {
                            s2
                        });
                    } else
                    {
                        s = null;
                    }
                    if (s != null)
                    {
                        b1.a(s1, s);
                    }
                }
            } else
            {
                return b1;
            }
        } while (true);
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
        int i = uri.getName().lastIndexOf('.');
        if (i >= 0)
        {
            uri = uri.getName().substring(i + 1);
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
        throws FileNotFoundException
    {
        return ParcelFileDescriptor.open(d.a(uri), a(s));
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
        int i1 = uri.length;
        int j = 0;
        int i = 0;
        while (j < i1) 
        {
            s1 = uri[j];
            if ("_display_name".equals(s1))
            {
                as1[i] = "_display_name";
                int k = i + 1;
                as[i] = s.getName();
                i = k;
            } else
            if ("_size".equals(s1))
            {
                as1[i] = "_size";
                int l = i + 1;
                as[i] = Long.valueOf(s.length());
                i = l;
            }
            j++;
        }
        uri = a(as1, i);
        as = ((String []) (a(as, i)));
        uri = new MatrixCursor(uri, 1);
        uri.addRow(as);
        return uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("No external updates");
    }

}
