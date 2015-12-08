// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.worklight.nativeandroid.common.WLUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.worklight.common:
//            Logger

public class WLSimpleDataSharing
{

    private static final Logger logger = Logger.getInstance(com/worklight/common/WLSimpleDataSharing.getName());
    private static boolean shouldPersist = false;
    private final Context context;

    public WLSimpleDataSharing(Context context1)
    {
        boolean flag1 = false;
        super();
        context = context1;
        boolean flag;
        try
        {
            context1 = context1.getPackageManager().getPackageInfo(context1.getPackageName(), 0).sharedUserId;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            return;
        }
        flag = flag1;
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        flag = flag1;
        if (!context1.isEmpty())
        {
            flag = true;
        }
        shouldPersist = flag;
        return;
    }

    private String getSanitizedFileName(String s)
    {
        return s.replaceAll("[^a-zA-Z0-9\\._-]+", "_");
    }

    public void clearSharedToken(String s)
    {
        String as[] = context.getPackageManager().getPackagesForUid(context.getApplicationInfo().uid);
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            try
            {
                File file = new File((new StringBuilder()).append(context.createPackageContext(s1, 0).getFilesDir().getAbsolutePath()).append("/").append(getSanitizedFileName(s)).toString());
                if (file.exists() && file.isFile() && shouldPersist)
                {
                    logger.debug((new StringBuilder()).append("Attempt to delete file '").append(file.getPath()).append("' from ").append(s1).toString());
                    file.delete();
                }
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                logger.error((new StringBuilder()).append("Failed to find '").append(s).append("' with ").append(s1).toString(), namenotfoundexception);
            }
            i++;
        }
    }

    public String getSharedToken(String s)
    {
        String as[];
        int i;
        int j;
        as = context.getPackageManager().getPackagesForUid(context.getApplicationInfo().uid);
        j = as.length;
        i = 0;
_L9:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s1 = as[i];
        File file = new File((new StringBuilder()).append(context.createPackageContext(s1, 0).getFilesDir().getAbsolutePath()).append("/").append(getSanitizedFileName(s)).toString());
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (!file.exists() || !file.isFile()) goto _L4; else goto _L3
_L3:
        boolean flag = shouldPersist;
        if (!flag) goto _L4; else goto _L5
_L5:
        Object obj = obj1;
        logger.debug((new StringBuilder()).append("Attempt to retrieve '").append(s).append("' from ").append(s1).append(" in file ").append(file.getPath()).toString());
        obj = obj1;
        obj1 = new FileInputStream(file);
        obj = WLUtils.convertStreamToString(((java.io.InputStream) (obj1)));
        setSharedToken(s, ((String) (obj)));
        if (obj != null) goto _L7; else goto _L6
_L6:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        ((FileInputStream) (obj1)).close();
        return ((String) (obj));
_L7:
        obj = ((String) (obj)).trim();
        if (true) goto _L6; else goto _L8
_L8:
        obj;
        obj1 = obj2;
        obj2 = obj;
_L12:
        obj = obj1;
        logger.error((new StringBuilder()).append("Failed to retrieve '").append(s).append("' from ").append(s1).append(" in file ").append(file.getPath()).toString(), ((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                logger.error((new StringBuilder()).append("Failed to retrieve '").append(s).append("' with ").append(s1).toString(), ((Throwable) (obj)));
            }
        }
_L4:
        i++;
          goto _L9
        obj1;
_L11:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj1;
_L2:
        return null;
        s;
        return ((String) (obj));
        obj2;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L11; else goto _L10
_L10:
        obj2;
          goto _L12
    }

    public void setSharedToken(String s, String s1)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = s1.getBytes();
        }
        setSharedToken(s, ((byte []) (s1)));
    }

    public void setSharedToken(String s, byte abyte0[])
    {
        if (s != null && !s.trim().equals("")) goto _L2; else goto _L1
_L1:
        logger.error("Cannot share a key/value pair where key is empty");
_L4:
        return;
_L2:
        String as[];
        int i;
        int j;
        as = context.getPackageManager().getPackagesForUid(context.getApplicationInfo().uid);
        j = as.length;
        i = 0;
_L10:
        if (i >= j) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = as[i];
        logger.debug((new StringBuilder()).append("Attempt to share '").append(s).append("' with ").append(s1).toString());
        Object obj;
        File file;
        obj = getSanitizedFileName(s);
        file = new File((new StringBuilder()).append(context.createPackageContext(s1, 0).getFilesDir().getAbsolutePath()).append("/").append(((String) (obj))).toString());
        if (file.exists() && !file.isFile() || ((String) (obj)).length() <= 0) goto _L6; else goto _L5
_L5:
        boolean flag = shouldPersist;
        if (!flag) goto _L6; else goto _L7
_L7:
        Object obj2;
        obj = null;
        obj2 = null;
        Object obj1 = new FileOutputStream(file);
        if (abyte0 != null) goto _L9; else goto _L8
_L8:
        obj = "".getBytes();
_L11:
        ((FileOutputStream) (obj1)).write(((byte []) (obj)));
        ((FileOutputStream) (obj1)).close();
        logger.debug((new StringBuilder()).append("Successfully shared '").append(s).append("' with ").append(s1).append(" to file ").append(file.getPath()).toString());
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                logger.error((new StringBuilder()).append("Failed to share '").append(s).append("' with ").append(s1).toString(), namenotfoundexception);
            }
        }
_L6:
        i++;
          goto _L10
_L9:
        obj = abyte0;
          goto _L11
        obj;
        obj1 = obj2;
        obj2 = obj;
_L15:
        obj = obj1;
        logger.error((new StringBuilder()).append("Failed to share '").append(s).append("' with ").append(s1).append(" to file ").append(file.getPath()).toString(), ((Throwable) (obj2)));
        if (obj1 == null) goto _L6; else goto _L12
_L12:
        ((FileOutputStream) (obj1)).close();
          goto _L6
        obj;
          goto _L6
        obj1;
_L14:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        throw obj1;
        obj2;
        namenotfoundexception = ((android.content.pm.PackageManager.NameNotFoundException) (obj1));
        obj1 = obj2;
        if (true) goto _L14; else goto _L13
_L13:
        obj2;
          goto _L15
    }

}
