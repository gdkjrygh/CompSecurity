// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.CancellationSignal;
import android.support.v4.os.OperationCanceledException;

// Referenced classes of package android.support.v4.content:
//            ContentResolverCompatJellybean

public class ContentResolverCompat
{
    static interface ContentResolverCompatImpl
    {

        public abstract Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal);
    }

    static class ContentResolverCompatImplBase
        implements ContentResolverCompatImpl
    {

        public Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
        {
            if (cancellationsignal != null)
            {
                cancellationsignal.throwIfCanceled();
            }
            return contentresolver.query(uri, as, s, as1, s1);
        }

        ContentResolverCompatImplBase()
        {
        }
    }

    static class ContentResolverCompatImplJB extends ContentResolverCompatImplBase
    {

        public Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
        {
            if (cancellationsignal == null)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            cancellationsignal = ((CancellationSignal) (cancellationsignal.getCancellationSignalObject()));
_L1:
            contentresolver = ContentResolverCompatJellybean.query(contentresolver, uri, as, s, as1, s1, cancellationsignal);
            return contentresolver;
            cancellationsignal = null;
              goto _L1
            contentresolver;
            if (ContentResolverCompatJellybean.isFrameworkOperationCanceledException(contentresolver))
            {
                throw new OperationCanceledException();
            } else
            {
                throw contentresolver;
            }
        }

        ContentResolverCompatImplJB()
        {
        }
    }


    private static final ContentResolverCompatImpl IMPL;

    private ContentResolverCompat()
    {
    }

    public static Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, CancellationSignal cancellationsignal)
    {
        return IMPL.query(contentresolver, uri, as, s, as1, s1, cancellationsignal);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new ContentResolverCompatImplJB();
        } else
        {
            IMPL = new ContentResolverCompatImplBase();
        }
    }
}
