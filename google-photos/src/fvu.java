// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.database.Cursor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class fvu
    implements fvl
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "_id", "mime_type", "aliased_orientation", "corrected_added_modified"
    })));

    fvu()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        i = ((fvm) (obj)).b.getColumnIndexOrThrow("_id");
        int k = ((fvm) (obj)).b.getColumnIndexOrThrow("mime_type");
        int l = ((fvm) (obj)).b.getColumnIndexOrThrow("aliased_orientation");
        int j = ((fvm) (obj)).b.getColumnIndexOrThrow("corrected_added_modified");
        long l1 = ((fvm) (obj)).b.getLong(i);
        String s = ((fvm) (obj)).b.getString(k);
        if (((fvm) (obj)).b.isNull(l))
        {
            i = 0;
        } else
        {
            i = ((fvm) (obj)).b.getInt(l);
        }
        s = neh.a(s, i, ((fvm) (obj)).b.getLong(j));
        return new elu(new gan(ContentUris.withAppendedId(((fvm) (obj)).a.b, l1), Integer.valueOf(s.hashCode())));
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
