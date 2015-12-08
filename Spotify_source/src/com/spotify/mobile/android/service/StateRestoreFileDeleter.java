// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import com.spotify.mobile.android.util.logging.Logger;
import gin;
import gio;
import gip;
import java.io.File;

public final class StateRestoreFileDeleter
{

    private static final gip a = gip.a("deletion-policy");

    static DeletionPolicy a(String s, gin gin1)
    {
        int i = gin1.a(a, DeletionPolicy.a.ordinal());
        Object obj = DeletionPolicy.values();
        int j;
        if (i < 0 || i >= obj.length)
        {
            obj = DeletionPolicy.a;
        } else
        {
            obj = obj[i];
        }
        j = ((DeletionPolicy) (obj)).ordinal() + 1;
        i = j;
        if (j > DeletionPolicy.b.ordinal())
        {
            i = DeletionPolicy.a.ordinal();
        }
        gin1.b().a(a, i).a();
        s = new File(s, "Users");
        if (s.exists())
        {
            s = s.listFiles();
            if (s != null)
            {
                int k = s.length;
                for (i = 0; i < k; i++)
                {
                    gin1 = s[i];
                    if (gin1.isDirectory())
                    {
                        a(((DeletionPolicy) (obj)), ((File) (gin1)));
                    }
                }

            }
        }
        return ((DeletionPolicy) (obj));
    }

    private static void a(DeletionPolicy deletionpolicy, File file)
    {
        Logger.c("SpotifyService: Deleting state files in %s", new Object[] {
            file.getName()
        });
        file.getName();
        StringBuilder stringbuilder = new StringBuilder();
        file = file.listFiles();
        if (file != null)
        {
            int j = file.length;
            for (int i = 0; i < j; i++)
            {
                File file1 = file[i];
                if (file1.isFile() && deletionpolicy.a(file1.getName()) && file1.delete())
                {
                    stringbuilder.append("Deleted ").append(file1.getName()).append(". ");
                }
            }

        }
        Logger.c("SpotifyService %s", new Object[] {
            stringbuilder.toString()
        });
    }

    public static void a(gin gin1)
    {
        gin1.b().a(a, DeletionPolicy.a.ordinal()).a();
    }


    private class DeletionPolicy extends Enum
    {

        public static final DeletionPolicy a;
        public static final DeletionPolicy b;
        private static DeletionPolicy c;
        private static final DeletionPolicy d[];

        public static DeletionPolicy valueOf(String s)
        {
            return (DeletionPolicy)Enum.valueOf(com/spotify/mobile/android/service/StateRestoreFileDeleter$DeletionPolicy, s);
        }

        public static DeletionPolicy[] values()
        {
            return (DeletionPolicy[])d.clone();
        }

        abstract boolean a(String s);

        public String toString()
        {
            return super.toString().toLowerCase(Locale.US);
        }

        static 
        {
            a = new DeletionPolicy("BASIC") {

                final boolean a(String s)
                {
                    return s.equals("state.restore");
                }

            };
            c = new DeletionPolicy("INTERMEDIATE") {

                public final boolean a(String s)
                {
                    return !s.equals("orbit.settings") && !s.equals("offline2") && !s.equals("offline_lists.bnk");
                }

            };
            b = new DeletionPolicy("EXTREME") {

                final boolean a(String s)
                {
                    return true;
                }

            };
            d = (new DeletionPolicy[] {
                a, c, b
            });
        }

        private DeletionPolicy(String s, int i)
        {
            super(s, i);
        }

        DeletionPolicy(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}
