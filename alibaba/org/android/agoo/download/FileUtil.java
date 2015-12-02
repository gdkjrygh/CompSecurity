// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.download;

import android.content.Context;
import android.util.Log;
import bjr;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import org.android.agoo.util.FileCheckUtil;
import org.android.du.CpuType;

// Referenced classes of package org.android.agoo.download:
//            UpdateEntity

public final class FileUtil
{

    private static final String DOWNLOAD_FOLDER = "/download/";
    private static final String ZIPFILE_POSTFIX = ".zip";

    public FileUtil()
    {
    }

    private static Boolean downFile(String s, String s1, String s2, String s3, Context context)
    {
        File file;
        String s4;
label0:
        {
            if (s2 != null)
            {
                s4 = s2;
                if (s2 != "")
                {
                    break label0;
                }
            }
            s4 = s.substring(s.lastIndexOf("/") + 1);
        }
        byte abyte0[];
        int i;
        try
        {
            URLConnection urlconnection = (new URL(s)).openConnection();
            urlconnection.connect();
            s2 = urlconnection.getInputStream();
            if (urlconnection.getContentLength() <= 0)
            {
                Log.d("FileUtil", "\u65E0\u6CD5\u83B7\u77E5\u6587\u4EF6\u5927\u5C0F");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("FileUtil", s.toString());
            bjr.e(context, s.toString(), "push");
            return Boolean.valueOf(false);
        }
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        Log.d("FileUtil", "\u65E0\u6CD5\u83B7\u53D6\u6587\u4EF6");
        return Boolean.valueOf(false);
        if (!(new File((new StringBuilder()).append(s1).append(s4).toString())).exists())
        {
            (new File((new StringBuilder()).append(s1).append(s4).toString())).getParentFile().mkdirs();
        }
        file = new File((new StringBuilder()).append(s1).append(s4).toString());
        s1 = new FileOutputStream((new StringBuilder()).append(s1).append(s4).toString());
        abyte0 = new byte[1024];
_L1:
        i = s2.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        s1.write(abyte0, 0, i);
          goto _L1
        s1.flush();
        s2.close();
        s1.close();
        if (file == null || !file.exists())
        {
            break MISSING_BLOCK_LABEL_405;
        }
        try
        {
            s1 = FileCheckUtil.getFileMD5String(file);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bjr.e(context, s.toString(), "push");
            return Boolean.valueOf(false);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        if (s1.equalsIgnoreCase(s3))
        {
            return Boolean.valueOf(true);
        }
        file.delete();
        Log.e("FileUtil", (new StringBuilder()).append("md5 check failed url=").append(s).append("computer md5=").append(s1).append(",getMd5()=").append(s3).toString());
        bjr.e(context, (new StringBuilder()).append("url=").append(s).append("computer md5=").append(s1).append(",getMd5()=").append(s3).toString(), "push");
        return Boolean.valueOf(false);
    }

    public static final boolean downloadAndUnZip(Context context, UpdateEntity updateentity, String s, CpuType cputype)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static Boolean unZip(String s, String s1, CpuType cputype, Context context)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
