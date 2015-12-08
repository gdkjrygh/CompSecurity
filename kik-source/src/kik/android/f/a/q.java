// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.os.AsyncTask;
import com.kik.g.p;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package kik.android.f.a:
//            f

final class q extends AsyncTask
{

    final String a;
    final p b;
    final f c;

    q(f f, String s, p p1)
    {
        c = f;
        a = s;
        b = p1;
        super();
    }

    private transient Void a()
    {
        Object obj = new DefaultHttpClient();
        obj = ((HttpClient) (obj)).execute(new HttpHead(a)).getFirstHeader("content-length");
        if (obj != null)
        {
            try
            {
                b.a(Long.valueOf(Long.parseLong(((Header) (obj)).getValue())));
            }
            catch (IOException ioexception)
            {
                b.a(ioexception);
            }
            catch (NumberFormatException numberformatexception)
            {
                b.a(numberformatexception);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                b.a(illegalargumentexception);
            }
            catch (RuntimeException runtimeexception)
            {
                b.a(runtimeexception);
            }
            break MISSING_BLOCK_LABEL_118;
        }
        b.a(Long.valueOf(0L));
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}
