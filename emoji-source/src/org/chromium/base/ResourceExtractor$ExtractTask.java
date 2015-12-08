// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.chromium.base:
//            ResourceExtractor, LocaleUtils

private class this._cls0 extends AsyncTask
{

    private static final int BUFFER_SIZE = 16384;
    final ResourceExtractor this$0;

    private String checkPakTimestamp(File file)
    {
        Object obj = ResourceExtractor.access$200(ResourceExtractor.this).getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(ResourceExtractor.access$200(ResourceExtractor.this).getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return "pak_timestamp-";
        }
        if (obj == null)
        {
            file = "pak_timestamp-";
        } else
        {
            obj = (new StringBuilder()).append("pak_timestamp-").append(((PackageInfo) (obj)).versionCode).append("-").append(((PackageInfo) (obj)).lastUpdateTime).toString();
            String as[] = file.list(new FilenameFilter() {

                final ResourceExtractor.ExtractTask this$1;

                public boolean accept(File file1, String s)
                {
                    return s.startsWith("pak_timestamp-");
                }

            
            {
                this$1 = ResourceExtractor.ExtractTask.this;
                super();
            }
            });
            file = ((File) (obj));
            if (as.length == 1)
            {
                file = ((File) (obj));
                if (((String) (obj)).equals(as[0]))
                {
                    return null;
                }
            }
        }
        return file;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        byte abyte0[];
        Object obj1;
        Object obj2;
        File file;
        Object obj3;
        SharedPreferences sharedpreferences;
        HashSet hashset;
        String s1;
        Object obj4;
        File file1;
        int j;
        boolean flag2;
        file = ResourceExtractor.access$000(ResourceExtractor.this);
        if (!file.exists() && !file.mkdirs())
        {
            Log.e("ResourceExtractor", "Unable to create pak resources directory!");
            return null;
        }
        s1 = checkPakTimestamp(file);
        if (s1 != null)
        {
            ResourceExtractor.access$100(ResourceExtractor.this);
        }
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(ResourceExtractor.access$200(ResourceExtractor.this).getApplicationContext());
        hashset = (HashSet)sharedpreferences.getStringSet("Pak filenames", new HashSet());
        avoid = LocaleUtils.getDefaultLocale().split("-", 2)[0];
        if (sharedpreferences.getString("Last language", "").equals(avoid) && hashset.size() >= ResourceExtractor.access$300().length)
        {
            boolean flag1 = true;
            Iterator iterator = hashset.iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break;
                }
                if ((new File(file, (String)iterator.next())).exists())
                {
                    continue;
                }
                flag = false;
                break;
            } while (true);
            if (flag)
            {
                return null;
            }
        } else
        {
            sharedpreferences.edit().ring("Last language", avoid).();
        }
        Object obj = new StringBuilder();
        String as[] = ResourceExtractor.access$300();
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append('|');
            }
            ((StringBuilder) (obj)).append((new StringBuilder()).append("\\Q").append(s).append("\\E").toString());
        }

        if (ResourceExtractor.access$400())
        {
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append('|');
            }
            ((StringBuilder) (obj)).append(avoid);
            ((StringBuilder) (obj)).append("(-\\w+)?\\.pak");
        }
        Pattern pattern = Pattern.compile(((StringBuilder) (obj)).toString());
        AssetManager assetmanager = ResourceExtractor.access$200(ResourceExtractor.this).getResources().getAssets();
        obj2 = null;
        Object aobj[];
        int l;
        boolean flag3;
        try
        {
            avoid = assetmanager.list("");
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Log.w("ResourceExtractor", (new StringBuilder()).append("Exception unpacking required pak resources: ").append(avoid.getMessage()).toString());
            ResourceExtractor.access$100(ResourceExtractor.this);
            return null;
        }
        aobj = avoid;
        if (ResourceExtractor.access$500() == null)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        obj = ResourceExtractor.access$500().getInterceptableResourceList();
        aobj = avoid;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        aobj = avoid;
        if (((Set) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_453;
        }
        k = avoid.length;
        j = 0;
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Set) (obj)).add(avoid[j]);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        aobj = new String[((Set) (obj)).size()];
        ((Set) (obj)).toArray(aobj);
        k = aobj.length;
        j = 0;
_L20:
        if (j >= k) goto _L4; else goto _L3
_L3:
        obj4 = aobj[j];
        if (pattern.matcher(((CharSequence) (obj4))).matches()) goto _L6; else goto _L5
_L5:
        avoid = ((Void []) (obj2));
          goto _L7
_L6:
        flag2 = ((String) (obj4)).equals("icudtl.dat");
        if (!flag2) goto _L9; else goto _L8
_L8:
        avoid = ResourceExtractor.access$600(ResourceExtractor.this);
_L14:
        file1 = new File(avoid, ((String) (obj4)));
        flag3 = file1.exists();
        avoid = ((Void []) (obj2));
        if (flag3) goto _L7; else goto _L10
_L10:
        avoid = null;
        obj1 = null;
        obj3 = null;
        abyte0 = avoid;
        if (ResourceExtractor.access$500() == null)
        {
            break MISSING_BLOCK_LABEL_572;
        }
        abyte0 = avoid;
        obj1 = ResourceExtractor.access$500().interceptLoadingForResource(((String) (obj4)));
        avoid = ((Void []) (obj1));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_588;
        }
        abyte0 = ((byte []) (obj1));
        avoid = assetmanager.open(((String) (obj4)));
        abyte0 = avoid;
        obj1 = new FileOutputStream(file1);
        Log.i("ResourceExtractor", (new StringBuilder()).append("Extracting resource ").append(((String) (obj4))).toString());
        abyte0 = ((byte []) (obj2));
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_644;
        }
        abyte0 = new byte[16384];
_L13:
        l = avoid.read(abyte0, 0, 16384);
        if (l == -1) goto _L12; else goto _L11
_L11:
        ((OutputStream) (obj1)).write(abyte0, 0, l);
          goto _L13
        obj2;
        abyte0 = ((byte []) (obj1));
        obj1 = obj2;
_L18:
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_687;
        }
        avoid.close();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_695;
        }
        abyte0.close();
        throw obj1;
_L9:
        avoid = file;
          goto _L14
_L12:
        ((OutputStream) (obj1)).flush();
        if (file1.length() == 0L)
        {
            throw new IOException((new StringBuilder()).append(((String) (obj4))).append(" extracted with 0 length!").toString());
        }
        if (flag2) goto _L16; else goto _L15
_L15:
        hashset.add(obj4);
_L17:
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_806;
        }
        avoid.close();
        avoid = abyte0;
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((OutputStream) (obj1)).close();
        avoid = abyte0;
        break; /* Loop/switch isn't completed */
_L16:
        file1.setReadable(true, false);
        if (true) goto _L17; else goto _L7
        avoid;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_841;
        }
        ((OutputStream) (obj1)).close();
        throw avoid;
        avoid;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_852;
        }
        abyte0.close();
        throw avoid;
_L4:
        if (s1 != null)
        {
            try
            {
                (new File(file, s1)).createNewFile();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.w("ResourceExtractor", "Failed to write resource pak timestamp!");
            }
        }
        sharedpreferences.edit().e("Pak filenames").();
        sharedpreferences.edit().ringSet("Pak filenames", hashset).();
        return null;
        obj1;
        avoid = abyte0;
        abyte0 = obj3;
          goto _L18
_L7:
        j++;
        obj2 = avoid;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public _cls1.this._cls1()
    {
        this$0 = ResourceExtractor.this;
        super();
    }
}
