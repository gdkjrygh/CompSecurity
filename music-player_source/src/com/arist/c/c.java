// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.content.Context;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.arist.c:
//            d

public final class c
{

    public static final String a[] = {
        "4mp", "669", "6cm", "8cm", "8med", "8svx", "a2m", "aa", "aa3", "aac", 
        "aax", "abc", "abm", "ac3", "acd", "acd-bak", "acd-zip", "acm", "act", "adg", 
        "afc", "agm", "ahx", "aif", "aifc", "aiff", "ais", "akp", "al", "alaw", 
        "all", "amf", "amr", "ams", "ams", "aob", "ape", "apf", "apl", "ase", 
        "at3", "atrac", "au", "aud", "aup", "avr", "awb", "band", "bap", "bdd", 
        "box", "bun", "bwf", "c01", "caf", "cda", "cdda", "cdr", "cel", "cfa", 
        "cidb", "cmf", "copy", "cpr", "cpt", "csh", "cwp", "d00", "d01", "dcf", 
        "dcm", "dct", "ddt", "dewf", "df2", "dfc", "dig", "dig", "dls", "dm", 
        "dmf", "dmsa", "dmse", "drg", "dsf", "dsm", "dsp", "dss", "dtm", "dts", 
        "dtshd", "dvf", "dwd", "ear", "efa", "efe", "efk", "efq", "efs", "efv", 
        "emd", "emp", "emx", "esps", "f2r", "f32", "f3r", "f4a", "f64", "far", 
        "fff", "flac", "flp", "fls", "frg", "fsm", "fzb", "fzf", "fzv", "g721", 
        "g723", "g726", "gig", "gp5", "gpk", "gsm", "gsm", "h0", "hdp", "hma", 
        "hsb", "ics", "iff", "imf", "imp", "ins", "ins", "it", "iti", "its", 
        "jam", "k25", "k26", "kar", "kin", "kit", "kmp", "koz", "koz", "kpl", 
        "krz", "ksc", "ksf", "kt2", "kt3", "ktp", "l", "la", "lqt", "lso", 
        "lvp", "lwv", "m1a", "m3u", "m4a", "m4b", "m4p", "m4r", "ma1", "mdl", 
        "med", "mgv", "midi", "miniusf", "mka", "mlp", "mmf", "mmm", "mmp", "mo3", 
        "mod", "mp1", "mp2", "mp3", "mpa", "mpc", "mpga", "mpu", "mp_", "mscx", 
        "mscz", "msv", "mt2", "mt9", "mte", "mti", "mtm", "mtp", "mts", "mus", 
        "mws", "mxl", "mzp", "nap", "nki", "nra", "nrt", "nsa", "nsf", "nst", 
        "ntn", "nvf", "nwc", "odm", "oga", "ogg", "okt", "oma", "omf", "omg", 
        "omx", "ots", "ove", "ovw", "pac", "pat", "pbf", "pca", "pcast", "pcg", 
        "pcm", "peak", "phy", "pk", "pla", "pls", "pna", "ppc", "ppcx", "prg", 
        "prg", "psf", "psm", "ptf", "ptm", "pts", "pvc", "qcp", "r", "r1m", 
        "ra", "ram", "raw", "rax", "rbs", "rcy", "rex", "rfl", "rmf", "rmi", 
        "rmj", "rmm", "rmx", "rng", "rns", "rol", "rsn", "rso", "rti", "rtm", 
        "rts", "rvx", "rx2", "s3i", "s3m", "s3z", "saf", "sam", "sb", "sbg", 
        "sbi", "sbk", "sc2", "sd", "sd", "sd2", "sd2f", "sdat", "sdii", "sds", 
        "sdt", "sdx", "seg", "seq", "ses", "sf2", "sfk", "sfl", "shn", "sib", 
        "sid", "sid", "smf", "smp", "snd", "snd", "snd", "sng", "sng", "sou", 
        "sppack", "sprg", "sseq", "sseq", "ssnd", "stm", "stx", "sty", "svx", "sw", 
        "swa", "syh", "syw", "syx", "td0", "tfmx", "thx", "toc", "tsp", "txw", 
        "u", "ub", "ulaw", "ult", "ulw", "uni", "usf", "usflib", "uw", "uwf", 
        "vag", "val", "vc3", "vmd", "vmf", "vmf", "voc", "voi", "vox", "vpm", 
        "vqf", "vrf", "vyf", "w01", "wav", "wav", "wave", "wax", "wfb", "wfd", 
        "wfp", "wma", "wow", "wpk", "wproj", "wrk", "wus", "wut", "wv", "wvc", 
        "wve", "wwu", "xa", "xa", "xfs", "xi", "xm", "xmf", "xmi", "xmz", 
        "xp", "xrns", "xsb", "xspf", "xt", "xwb", "ym", "zvd", "zvr"
    };
    private static HashSet b = new HashSet(Arrays.asList(a));

    public static ArrayList a(Context context)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        Object obj = null;
        context = (StorageManager)context.getSystemService("storage");
        int j;
        try
        {
            context = (String[])context.getClass().getMethod("getVolumePaths", new Class[0]).invoke(context, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = obj;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = obj;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = obj;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = obj;
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        j = context.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        Log.i("FileUtil", (new StringBuilder("getVolumePaths:")).append(arraylist.toString()).toString());
        return arraylist;
_L3:
        String s = context[i];
        if ((new File(s)).list() != null)
        {
            arraylist.add(s);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(File file, File file1)
    {
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        if (file.equals(file1))
        {
            return;
        }
        if (file1.exists())
        {
            file1.delete();
        }
        file = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
        file1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file1), "GBK"));
_L1:
        String s = file.readLine();
        if (s == null)
        {
            try
            {
                file.close();
                file1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_114;
        }
        file1.println(s);
          goto _L1
    }

    public static boolean a(String s)
    {
        return (new File(s)).exists();
    }

    public static File b(String s)
    {
        com/arist/c/c;
        JVM INSTR monitorenter ;
        s = new File(s);
        if (!s.getParentFile().exists())
        {
            s.getParentFile().mkdirs();
        }
        if (s.exists())
        {
            s.delete();
        }
        s.createNewFile();
        com/arist/c/c;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static void c(String s)
    {
        (new d(s)).start();
    }

    public static String d(String s)
    {
        int i;
label0:
        {
            if (TextUtils.isEmpty(s) || !s.contains("."))
            {
                return s;
            }
            int j = s.lastIndexOf(File.separator);
            if (j >= 0)
            {
                i = j;
                if (j != s.length() - 1)
                {
                    break label0;
                }
            }
            i = 0;
        }
        int l = s.lastIndexOf(".");
        int k = l;
        if (l <= i)
        {
            k = s.length();
        }
        return s.substring(i + 1, k);
    }

}
