// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class don
    implements dkl
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "local_state", "remote_state", "type", "content_uri", "protobuf"
    })));
    private final jdr b;

    don(Context context)
    {
        b = (jdr)olm.a(context, jdr);
    }

    public final ekf a(int i, Object obj)
    {
        boolean flag = true;
        Object obj1 = (Cursor)obj;
        if (((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndexOrThrow("type")) == euv.c.f)
        {
            obj = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("content_uri"));
            eun eun1 = eun.a(((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndexOrThrow("local_state")));
            byte abyte0[] = ((Cursor) (obj1)).getBlob(((Cursor) (obj1)).getColumnIndexOrThrow("protobuf"));
            qgg qgg1 = (qgg)mve.a(new qgg(), abyte0);
            obj1 = eun.a(((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndexOrThrow("remote_state")));
            if (eun1 == eun.a && !TextUtils.isEmpty(((CharSequence) (obj))))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (obj1 != eun.a || qgg1 == null)
            {
                flag = false;
            }
            if (i != 0 && flag)
            {
                return jdy.a(((String) (obj)), qgg1, b);
            }
            if (i != 0)
            {
                return jdy.a(((String) (obj)));
            }
            if (flag)
            {
                return jdy.a(qgg1, b);
            }
        }
        return null;
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return jdy;
    }

}
