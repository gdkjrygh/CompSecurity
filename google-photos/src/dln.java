// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dln
    implements dkl
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "media_key", "type", "protobuf"
    })));
    private final Context b;

    dln(Context context)
    {
        b = context;
    }

    public final ekf a(int i, Object obj)
    {
        Object obj1 = (Cursor)obj;
        int j = ((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndexOrThrow("type"));
        obj = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("media_key"));
        byte abyte0[] = ((Cursor) (obj1)).getBlob(((Cursor) (obj1)).getColumnIndexOrThrow("protobuf"));
        abyte0 = (qgg)mve.a(new qgg(), abyte0);
        obj = new fzi(((String) (obj)), null);
        obj = (new fzk(b, i)).a(((fzi) (obj))).a.g;
        abyte0 = b.a(abyte0, euv.a(j));
        if (abyte0 != null)
        {
            return new feu(abyte0, ((String) (obj)));
        } else
        {
            return null;
        }
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return feu;
    }

}
