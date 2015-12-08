// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

final class dma
    implements dkl
{

    static final Set a = new HashSet(Arrays.asList(new String[] {
        "remote_url", "content_uri", "signature", "is_edited", "media_key", "local_state", "remote_state"
    }));
    private final noz b;
    private final nnw c;
    private final gur d;
    private final gbd e;

    dma(Context context)
    {
        b = noz.a(context, 2, "AllDisplayFactory", new String[0]);
        c = (nnw)olm.b(context, nnw);
        d = (gur)olm.a(context, gur);
        e = (gbd)olm.a(context, gbd);
    }

    public final ekf a(int i, Cursor cursor)
    {
        String s = cursor.getString(cursor.getColumnIndexOrThrow("remote_url"));
        Object obj = cursor.getString(cursor.getColumnIndexOrThrow("content_uri"));
        int j = cursor.getColumnIndexOrThrow("signature");
        Object obj1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (!cursor.isNull(j))
        {
            obj1 = Integer.valueOf(cursor.getInt(j));
        } else
        {
            obj1 = null;
        }
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_edited")) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = Uri.parse(((String) (obj)));
        } else
        if (c == null)
        {
            obj = null;
        } else
        {
            obj = cursor.getString(cursor.getColumnIndex("media_key"));
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = c.a(((String) (obj)));
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((nnx) (obj)).a;
                }
            }
        }
        if (eun.a(cursor.getInt(cursor.getColumnIndexOrThrow("local_state"))) == eun.a && obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (eun.a(cursor.getInt(cursor.getColumnIndexOrThrow("remote_state"))) == eun.a && !TextUtils.isEmpty(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && flag)
        {
            gan gan1 = new gan(((Uri) (obj)), ((Integer) (obj1)));
            gat gat1 = new gat(s, i);
            obj1 = gas.b;
            cursor = ((Cursor) (obj1));
            if (flag2)
            {
                long l = d.a(i, gan1.b);
                flag1 = false;
                flag = flag1;
                if (l != -1L)
                {
                    cursor = d.a(i, l);
                    flag = flag1;
                    if (TextUtils.equals(e.a(gan1.b.toString()).b(), ((gum) (cursor)).e))
                    {
                        flag = true;
                    }
                }
                cursor = ((Cursor) (obj1));
                if (!flag)
                {
                    cursor = gas.a;
                }
            }
            if (b.a())
            {
                noy.a("primary source", cursor);
                noy.a("imageUrl", s);
                noy.a("localUri", obj);
                noy.a("hasEdits", Boolean.valueOf(flag2));
            }
            cursor = new gaq(gan1, gat1, cursor);
        } else
        if (flag1)
        {
            cursor = new gat(s, i);
        } else
        if (flag)
        {
            cursor = new gan(((Uri) (obj)), ((Integer) (obj1)));
        } else
        {
            return null;
        }
        return new elu(cursor);
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a(i, (Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return elt;
    }

}
