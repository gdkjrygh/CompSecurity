// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class mhl
    implements lzx
{

    public final lnt a;
    public final List b;

    public mhl(lnt lnt1)
    {
        a = lnt1;
        Object obj = lnt1.b();
        if (obj != null)
        {
            lnt1 = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                AutoBackupSettings autobackupsettings = (AutoBackupSettings)((Iterator) (obj)).next();
                if (autobackupsettings != null)
                {
                    mhk mhk1 = new mhk(autobackupsettings.b);
                    mhk1.d = autobackupsettings.f;
                    mhk1.a = autobackupsettings.c;
                    mhk1.g = autobackupsettings.i;
                    mhk1.c = autobackupsettings.e;
                    mhk1.f = autobackupsettings.h;
                    mhk1.b = autobackupsettings.d;
                    mhk1.e = autobackupsettings.g;
                    lnt1.add(mhk1.a());
                }
            } while (true);
            b = Collections.unmodifiableList(lnt1);
            return;
        } else
        {
            b = Collections.emptyList();
            return;
        }
    }

    public List a()
    {
        return b;
    }

    public maa r()
    {
        return new maq(a.a_());
    }
}
