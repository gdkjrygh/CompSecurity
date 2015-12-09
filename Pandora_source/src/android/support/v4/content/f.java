// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

// Referenced classes of package android.support.v4.content:
//            a

public class f extends a
{

    final i.a f = new i.a(this);
    Uri g;
    String h[];
    String i;
    String j[];
    String k;
    Cursor l;

    public f(Context context, Uri uri, String as[], String s, String as1[], String s1)
    {
        super(context);
        g = uri;
        h = as;
        i = s;
        j = as1;
        k = s1;
    }

    public void a(Cursor cursor)
    {
        if (isReset())
        {
            if (cursor != null)
            {
                cursor.close();
            }
        } else
        {
            Cursor cursor1 = l;
            l = cursor;
            if (isStarted())
            {
                super.deliverResult(cursor);
            }
            if (cursor1 != null && cursor1 != cursor && !cursor1.isClosed())
            {
                cursor1.close();
                return;
            }
        }
    }

    public void a(Object obj)
    {
        b((Cursor)obj);
    }

    public void b(Cursor cursor)
    {
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
    }

    public Object c()
    {
        return e();
    }

    public void deliverResult(Object obj)
    {
        a((Cursor)obj);
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.print("mUri=");
        printwriter.println(g);
        printwriter.print(s);
        printwriter.print("mProjection=");
        printwriter.println(Arrays.toString(h));
        printwriter.print(s);
        printwriter.print("mSelection=");
        printwriter.println(i);
        printwriter.print(s);
        printwriter.print("mSelectionArgs=");
        printwriter.println(Arrays.toString(j));
        printwriter.print(s);
        printwriter.print("mSortOrder=");
        printwriter.println(k);
        printwriter.print(s);
        printwriter.print("mCursor=");
        printwriter.println(l);
        printwriter.print(s);
        printwriter.print("mContentChanged=");
        printwriter.println(mContentChanged);
    }

    public Cursor e()
    {
        Cursor cursor = getContext().getContentResolver().query(g, h, i, j, k);
        if (cursor != null)
        {
            cursor.getCount();
            cursor.registerContentObserver(f);
        }
        return cursor;
    }

    protected void onReset()
    {
        super.onReset();
        onStopLoading();
        if (l != null && !l.isClosed())
        {
            l.close();
        }
        l = null;
    }

    protected void onStartLoading()
    {
        if (l != null)
        {
            a(l);
        }
        if (takeContentChanged() || l == null)
        {
            forceLoad();
        }
    }

    protected void onStopLoading()
    {
        a();
    }
}
