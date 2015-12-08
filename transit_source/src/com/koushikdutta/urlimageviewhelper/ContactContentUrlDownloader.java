// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.koushikdutta.urlimageviewhelper;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

// Referenced classes of package com.koushikdutta.urlimageviewhelper:
//            UrlDownloader, UrlImageViewHelper

public class ContactContentUrlDownloader
    implements UrlDownloader
{

    public ContactContentUrlDownloader()
    {
    }

    public boolean allowCache()
    {
        return false;
    }

    public boolean canDownloadUrl(String s)
    {
        return s.startsWith(android.provider.ContactsContract.Contacts.CONTENT_URI.toString());
    }

    public void download(final Context context, final String url, String s, final UrlDownloader.UrlDownloaderCallback callback, final Runnable completion)
    {
        UrlImageViewHelper.executeTask(new AsyncTask() {

            final ContactContentUrlDownloader this$0;
            final UrlDownloader.UrlDownloaderCallback val$callback;
            final Runnable val$completion;
            final Context val$context;
            final String val$url;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                try
                {
                    avoid = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), Uri.parse(url));
                    callback.onDownloadComplete(ContactContentUrlDownloader.this, avoid, null);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                    return null;
                }
                return null;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Void)obj);
            }

            protected void onPostExecute(Void void1)
            {
                completion.run();
            }

            
            {
                this$0 = ContactContentUrlDownloader.this;
                context = context1;
                url = s;
                callback = urldownloadercallback;
                completion = runnable;
                super();
            }
        });
    }
}
