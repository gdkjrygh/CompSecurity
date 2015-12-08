// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class ijl
    implements ikf
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        "media_key", "is_joined", "owner_actor_id", "protobuf"
    }));
    private final mmv b;
    private final iiv c;

    ijl(iiv iiv1, mmv mmv1)
    {
        c = iiv1;
        b = mmv1;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (Cursor)obj;
        byte abyte0[] = ((Cursor) (obj)).getBlob(((Cursor) (obj)).getColumnIndexOrThrow("protobuf"));
        int j = b.a(((qfz)mve.a(new qfz(), abyte0)).c.a);
        String s = b.a(i).b("gaia_id");
        Object obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key"));
        obj1 = c.b(i, ((String) (obj1)));
        Collections.sort(((java.util.List) (obj1)), new ijm(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("owner_actor_id")), s));
        return new hjz(((java.util.List) (obj1)), j);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return hjz;
    }

}
