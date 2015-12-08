// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.hockeyapp.android:
//            k

public class l
{

    public static final int A = 1034;
    public static final int B = 1035;
    public static final int C = 1036;
    public static final int D = 1037;
    public static final int E = 1038;
    public static final int F = 1039;
    public static final int G = 1040;
    public static final int H = 1041;
    public static final int I = 1042;
    public static final int J = 1043;
    public static final int K = 1280;
    public static final int L = 1281;
    public static final int M = 1282;
    public static final int N = 1283;
    public static final int O = 1284;
    public static final int P = 1536;
    public static final int Q = 1537;
    public static final int R = 1538;
    public static final int S = 1539;
    public static final int T = 1540;
    public static final int U = 1541;
    public static final int V = 1542;
    private static final Map W;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 256;
    public static final int g = 257;
    public static final int h = 258;
    public static final int i = 259;
    public static final int j = 512;
    public static final int k = 513;
    public static final int l = 514;
    public static final int m = 515;
    public static final int n = 516;
    public static final int o = 768;
    public static final int p = 769;
    public static final int q = 1024;
    public static final int r = 1025;
    public static final int s = 1026;
    public static final int t = 1027;
    public static final int u = 1028;
    public static final int v = 1029;
    public static final int w = 1030;
    public static final int x = 1031;
    public static final int y = 1032;
    public static final int z = 1033;

    public l()
    {
    }

    public static String a(int i1)
    {
        return a(((k) (null)), i1);
    }

    public static String a(k k1, int i1)
    {
        String s1 = null;
        if (k1 != null)
        {
            s1 = k1.a(i1);
        }
        k1 = s1;
        if (s1 == null)
        {
            k1 = (String)W.get(Integer.valueOf(i1));
        }
        return k1;
    }

    public static void a(int i1, String s1)
    {
        if (s1 != null)
        {
            W.put(Integer.valueOf(i1), s1);
        }
    }

    static 
    {
        W = new HashMap();
        W.put(Integer.valueOf(0), "Crash Data");
        W.put(Integer.valueOf(1), "The app found information about previous crashes. Would you like to send this data to the developer?");
        W.put(Integer.valueOf(2), "Dismiss");
        W.put(Integer.valueOf(3), "Always send");
        W.put(Integer.valueOf(4), "Send");
        W.put(Integer.valueOf(256), "Download Failed");
        W.put(Integer.valueOf(257), "The update could not be downloaded. Would you like to try again?");
        W.put(Integer.valueOf(258), "Cancel");
        W.put(Integer.valueOf(259), "Retry");
        W.put(Integer.valueOf(512), "Please install the latest version to continue to use this app.");
        W.put(Integer.valueOf(513), "Update Available");
        W.put(Integer.valueOf(514), "Show information about the new update?");
        W.put(Integer.valueOf(515), "Dismiss");
        W.put(Integer.valueOf(516), "Show");
        W.put(Integer.valueOf(768), "Build Expired");
        W.put(Integer.valueOf(769), "This has build has expired. Please check HockeyApp for any updates.");
        W.put(Integer.valueOf(1024), "Feedback Failed");
        W.put(Integer.valueOf(1025), "Would you like to send your feedback again?");
        W.put(Integer.valueOf(1026), "Name");
        W.put(Integer.valueOf(1027), "Email");
        W.put(Integer.valueOf(1028), "Subject");
        W.put(Integer.valueOf(1029), "Message");
        W.put(Integer.valueOf(1030), "Last Updated: ");
        W.put(Integer.valueOf(1031), "Add Attachment");
        W.put(Integer.valueOf(1032), "Send Feedback");
        W.put(Integer.valueOf(1033), "Add a Response");
        W.put(Integer.valueOf(1034), "Refresh");
        W.put(Integer.valueOf(1035), "Feedback");
        W.put(Integer.valueOf(1036), "Message couldn't be posted. Please check your input values and your connection, then try again.");
        W.put(Integer.valueOf(1037), "No response from server. Please check your connection, then try again.");
        W.put(Integer.valueOf(1038), "Please enter a subject");
        W.put(Integer.valueOf(1041), "Please enter a name");
        W.put(Integer.valueOf(1042), "Please enter an email address");
        W.put(Integer.valueOf(1043), "Please enter a feedback text");
        W.put(Integer.valueOf(1039), "Message couldn't be posted. Please check the format of your email address.");
        W.put(Integer.valueOf(1040), "An error has occured");
        W.put(Integer.valueOf(1280), "Please enter your account credentials.");
        W.put(Integer.valueOf(1281), "Please fill in the missing account credentials.");
        W.put(Integer.valueOf(1282), "Email");
        W.put(Integer.valueOf(1283), "Password");
        W.put(Integer.valueOf(1284), "Login");
        W.put(Integer.valueOf(1536), "Draw something!");
        W.put(Integer.valueOf(1537), "Save");
        W.put(Integer.valueOf(1538), "Undo");
        W.put(Integer.valueOf(1539), "Clear");
        W.put(Integer.valueOf(1540), "Discard your drawings?");
        W.put(Integer.valueOf(1541), "No");
        W.put(Integer.valueOf(1542), "Yes");
    }
}
