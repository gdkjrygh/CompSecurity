// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dmd
{

    private static final List a;
    private static final Set b;

    public dmd()
    {
    }

    private static Set a(InputStream inputstream)
    {
        HashSet hashset = new HashSet();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, "ascii"));
        inputstream = Pattern.compile("\\S+ (\\S+) (\\S+) rw.*");
_L3:
        Object obj = bufferedreader.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = inputstream.matcher(((CharSequence) (obj)));
        if (((Matcher) (obj)).matches())
        {
            String s = ((Matcher) (obj)).group(2);
            if (!b.contains(s))
            {
                hashset.add(((Matcher) (obj)).group(1));
            }
        }
          goto _L3
        inputstream;
_L5:
        if (bufferedreader != null)
        {
            bufferedreader.close();
        }
        throw inputstream;
_L2:
        bufferedreader.close();
        return hashset;
        inputstream;
        bufferedreader = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Set a(String s)
    {
        Object obj;
        Object obj1;
        obj = new HashSet();
        obj1 = null;
        FileInputStream fileinputstream = new FileInputStream(s);
        s = a(((InputStream) (fileinputstream)));
        obj = s;
        s = ((String) (obj));
        fileinputstream.close();
        s = ((String) (obj));
        obj = b(((Set) (obj)));
        s = ((String) (obj));
        obj = a(((Set) (obj)));
        s = ((String) (obj));
_L2:
        s.add(Environment.getExternalStorageDirectory().getAbsolutePath());
        return s;
        s;
        s = ((String) (obj));
        fileinputstream = obj1;
_L3:
        gdv.a(fileinputstream);
        s.clear();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s = ((String) (obj));
          goto _L3
        IOException ioexception;
        ioexception;
          goto _L3
    }

    private static Set a(Set set)
    {
        HashSet hashset;
        hashset = new HashSet();
        set = set.iterator();
_L2:
        String s;
        boolean flag;
        if (!set.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)set.next();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_92;
            }
        } while (!((Pattern)iterator.next()).matcher(s).matches());
        flag = true;
_L3:
        if (!flag)
        {
            hashset.add(s);
        }
        if (true) goto _L2; else goto _L1
_L1:
        return hashset;
        flag = false;
          goto _L3
    }

    private static Set b(Set set)
    {
        HashSet hashset = new HashSet();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            String s = (String)set.next();
            File file = new File(s);
            if (file.exists() && file.isDirectory() && file.canWrite())
            {
                hashset.add(s);
            }
        } while (true);
        return hashset;
    }

    static 
    {
        Object obj = new LinkedList();
        ((List) (obj)).add(Pattern.compile("/storage/emulated/legacy.*"));
        ((List) (obj)).add(Pattern.compile("/storage/emulated/[0-9]+/Android/obb"));
        a = Collections.unmodifiableList(((List) (obj)));
        obj = new HashSet();
        ((Set) (obj)).add("tmpfs");
        ((Set) (obj)).add("proc");
        ((Set) (obj)).add("sysfs");
        ((Set) (obj)).add("cifs");
        ((Set) (obj)).add("nfs");
        ((Set) (obj)).add("smbfs");
        b = Collections.unmodifiableSet(((Set) (obj)));
    }
}
