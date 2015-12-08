// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import com.c.a.c.c;
import java.util.Iterator;
import kik.a.d.a;
import kik.a.d.b;

public final class i extends kik.a.d.a
{
    private final class a
        implements Iterator
    {

        c a;
        final i b;
        private final Cursor c;
        private final Cursor d;
        private boolean e;
        private boolean f;

        private boolean a(String s)
        {
            while (s == null || a != null && a.b(s)) 
            {
                return true;
            }
            return false;
        }

        protected final void finalize()
        {
            super.finalize();
            if (c != null && !c.isClosed())
            {
                c.close();
            }
            if (d != null && !d.isClosed())
            {
                d.close();
            }
        }

        public final boolean hasNext()
        {
            return !e || !f;
        }

        public final Object next()
        {
            if (!hasNext())
            {
                throw new IndexOutOfBoundsException("Trying to access items beyond the end of our size!");
            }
            b b1 = null;
            b b2 = null;
            if (!e)
            {
                int j = c.getColumnIndex("data1");
                do
                {
                    String s = c.getString(j);
                    b1 = b2;
                    if (s != null)
                    {
                        b1 = b2;
                        if (!a(s))
                        {
                            b1 = new b(kik.a.d.b.a.b, s, kik.a.d.b.b.a);
                        }
                    }
                    c.moveToNext();
                    if (b1 != null)
                    {
                        break;
                    }
                    b2 = b1;
                } while (!c.isAfterLast());
                e = c.isAfterLast();
            }
            b2 = b1;
            if (!f)
            {
                b2 = b1;
                if (b1 == null)
                {
                    int k = d.getColumnIndex("data1");
                    b2 = b1;
                    do
                    {
                        String s1 = PhoneNumberUtils.stripSeparators(d.getString(k));
                        b1 = b2;
                        if (s1 != null)
                        {
                            b1 = b2;
                            if (!a(s1))
                            {
                                b1 = new b(kik.a.d.b.a.a, s1, kik.a.d.b.b.a);
                            }
                        }
                        d.moveToNext();
                        if (b1 != null)
                        {
                            break;
                        }
                        b2 = b1;
                    } while (!d.isAfterLast());
                    f = d.isAfterLast();
                    b2 = b1;
                }
            }
            if (e && !c.isClosed())
            {
                c.close();
            }
            if (f && !d.isClosed())
            {
                d.close();
            }
            return b2;
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        public a(Cursor cursor, Cursor cursor1, c c1)
        {
            b = i.this;
            super();
            e = false;
            f = false;
            c = cursor1;
            d = cursor;
            a = c1;
            if (c == null || !c.moveToFirst())
            {
                e = true;
            }
            if (d == null || !d.moveToFirst())
            {
                f = true;
            }
            if (!e)
            {
                int k = c.getColumnIndex("data1");
                do
                {
                    j = c.getString(k);
                    if (i.this != null && !a(i.this))
                    {
                        break;
                    }
                    c.moveToNext();
                } while (!c.isAfterLast());
                e = c.isAfterLast();
            }
            if (!f)
            {
                int l = d.getColumnIndex("data1");
                do
                {
                    j = PhoneNumberUtils.stripSeparators(d.getString(l));
                    if (i.this != null && !a(i.this))
                    {
                        break;
                    }
                    d.moveToNext();
                } while (!d.isAfterLast());
                f = d.isAfterLast();
            }
        }
    }


    private final Context a;

    public i(Context context)
    {
        a = context;
    }

    private Cursor b()
    {
        return a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {
            "data1"
        }, null, null, null);
    }

    private Cursor c()
    {
        return a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] {
            "data1"
        }, null, null, null);
    }

    public final Iterator a()
    {
        return new a(b(), c(), null);
    }

    public final Iterator a(c c1)
    {
        return new a(b(), c(), c1);
    }
}
