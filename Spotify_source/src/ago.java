// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class ago
{

    private static final ahn a = ahn.a("connected.car.sdk");

    public static void a(String s, String s1, File file)
    {
        file = new FileWriter(new File(file, "actions.txt"));
        file.write(s);
        file.append(System.getProperty("line.separator"));
        file.append(s1);
        file.close();
    }

    public static String[] a(String s)
    {
        String as[];
        as = new String[2];
        File file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/bmwgroup/").append(s).append("/").toString(), "actions.txt");
        if (!file.exists() || !file.canRead())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        try
        {
            s = new BufferedReader(new FileReader(file));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.b("actions_txt file not found!", new Object[0]);
            s = null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        try
        {
            as[0] = s.readLine();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.c("Error reading file actions_txt", new Object[0]);
            return as;
        }
        if (as[0] == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        a.b("mConnectAction = %s", new Object[] {
            as[0]
        });
        as[1] = s.readLine();
        a.b("mDisconnectAction = %s", new Object[] {
            as[1]
        });
        return as;
        a.b("actions_txt file not found in folder %s", new Object[] {
            (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/bmwgroup/").append(s).toString()
        });
        return as;
    }

}
