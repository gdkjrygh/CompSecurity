// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import com.google.common.base.Optional;
import com.spotify.mobile.android.arsenal.data.AccountsLinkException;
import com.spotify.mobile.android.util.logging.Logger;

public final class dkg
{

    final Context a;
    AsyncTask b;

    public dkg(Context context)
    {
        a = context;
    }

    public final void a()
    {
        if (b != null)
        {
            b.cancel(true);
            b = null;
        }
    }

    // Unreferenced inner class dkg$1

/* anonymous class */
    final class _cls1 extends AsyncTask
    {

        private dkh a;
        private dkg b;

        private transient Optional a(String as[])
        {
            try
            {
                as = dkr.a(b.a).a(as[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Logger.a(as, "ArsenalLink: Accounts are not linked.", new Object[0]);
                return Optional.e();
            }
            return as;
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (Optional)obj;
            if (((Optional) (obj)).b())
            {
                a.a((String)((Optional) (obj)).c());
            } else
            {
                a.a();
            }
            b.b = null;
        }

            
            {
                b = dkg.this;
                a = dkh1;
                super();
            }
    }

}
