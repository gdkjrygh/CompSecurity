// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.snapchat.android.Timber;
import java.util.concurrent.Executor;

public class Pz
{

    private static final String TAG = Pz.getSimpleName();
    private final JY mCache;
    private final Executor mExecutor;
    private final Py mSnapcodeUtils;

    public Pz()
    {
        this(((Executor) (IO.HIGH_PRIORITY_EXECUTOR)), Ka.PROFILE_IMAGE_CACHE, Py.a());
    }

    private Pz(Executor executor, JY jy, Py py)
    {
        mExecutor = executor;
        mCache = jy;
        mSnapcodeUtils = py;
    }

    static JY a(Pz pz)
    {
        return pz.mCache;
    }

    static String a()
    {
        return TAG;
    }

    static Py b(Pz pz)
    {
        return pz.mSnapcodeUtils;
    }

    public final void a(final String userId, final PA callback)
    {
        (new AsyncTask() {

            final Pz this$0;
            final PA val$callback;
            final String val$userId;

            private transient cn a()
            {
                cn cn1;
                try
                {
                    cn1 = Pz.b(Pz.this).b(Pz.a(Pz.this), userId);
                }
                catch (Exception exception)
                {
                    Timber.e(Pz.a(), (new StringBuilder("Unable to load SVG! Error: ")).append(exception).toString(), new Object[0]);
                    return null;
                }
                return cn1;
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (cn)obj;
                callback.a(((cn) (obj)), userId);
            }

            
            {
                this$0 = Pz.this;
                userId = s;
                callback = pa;
                super();
            }
        }).executeOnExecutor(mExecutor, new Void[0]);
    }

}
