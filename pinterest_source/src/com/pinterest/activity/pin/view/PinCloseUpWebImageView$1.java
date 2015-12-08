// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.base.ErrorLogger;
import com.pinterest.reporting.CrashReporting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseUpWebImageView

class val.url
    implements Runnable
{

    final PinCloseUpWebImageView this$0;
    final String val$url;

    public void run()
    {
        Object obj;
        int j;
        j = 0;
        obj = null;
        final Object finalHtml = (HttpURLConnection)(new URL(val$url)).openConnection();
        int i;
        ((HttpURLConnection) (finalHtml)).setRequestMethod("HEAD");
        ((HttpURLConnection) (finalHtml)).getInputStream();
        i = ((HttpURLConnection) (finalHtml)).getContentLength();
        j = i;
        if (finalHtml == null) goto _L2; else goto _L1
_L1:
        ((HttpURLConnection) (finalHtml)).disconnect();
_L7:
        finalHtml = PinCloseUpWebImageView.access$000(PinCloseUpWebImageView.this).Url();
        class _cls1
            implements Runnable
        {

            final PinCloseUpWebImageView._cls1 this$1;
            final String val$finalHtml;

            public void run()
            {
                loadData(finalHtml, "text/html", "utf-8");
            }

            _cls1()
            {
                this$1 = PinCloseUpWebImageView._cls1.this;
                finalHtml = s;
                super();
            }
        }

        Exception exception1;
        if (i > 0)
        {
            finalHtml = val$url;
        } else
        {
            ErrorLogger.reportBrokenImage(val$url);
            CrashReporting.a(new RuntimeException("Close up image is 0 bytes"));
        }
        finalHtml = (new StringBuilder("<!DOCTYPE html><html><head><style type='text/css'>.reset{padding:0;margin:0;border:0;}</style></head><body width='100%' height='100%' align='center' class='reset' bgcolor='#f2f2f2'><img class='reset' src='")).append(((String) (finalHtml))).append("'style='width:100%;height:auto;border-radius:7px;' onerror='this.src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFAAAABQCAYAAACOEfKtAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAALEgAACxIB0t1+/AAAABx0RVh0U29mdHdhcmUAQWRvYmUgRmlyZXdvcmtzIENTNui8sowAAAAUdEVYdENyZWF0aW9uIFRpbWUAOC82LzEy6HMsjwAABOxJREFUeJztnGGL2zgQhh+HhjRhCbcspcuVUu7//6ijFI7tLSVc2NttCJfcB1k915mRNRqndjk9ELJNbWnyWhqPRuM05/OZSjmLqQ342akCOqkCOqkCOqkCOqkCOqkCOqkCOqkCOqkCOqkCOnllObhpmmvYsAHWwApYtu8aB+DYvr8Az2MaUpIXaCwnjSjgDbBt3708Afv23cXcBVwAt+3rGq7jBOza16mkgTkLeMf1hOsThfxiPXGOAm6AtwTf9qM5Ap8x+Mm5CfiGMOqGOBG+5Avh5vAVeQougNeEm8yacHFyRvQOeMw4bjYCLoD3pO+mEJx+vAGUEm9EQzejA/CJAd84BwGXwK+kxdsT/NMxu+NhlgQ/u00ccwD+SPU7tYBL4AP6tDoQptKosVuPDcF1aBfwBHxEEXFKAYembbYfGomU/1Wn85QCfkAX7wGfnytlC9wr/3cgjMTvKBFwjLhMmzJxukwhHm2/H5FvHCuC3W68Am7Qp8onwpWekjhdJW4J9rvwCvhW+fyB6cWLHAj2SGj2Z+MR8A55hbFjummrsSfY1SeGP8WUChgTA31iqDJHHpFnhWuNXnqi1ulcxYtI9mmDIQuPgH32XDdIHoNnZPdSLKApI91ygyx8bvpoRfA7N4QQ4wn4E1sOL/quuAa2tPGFyyXfom3LnJQtGYHSevOJvLXtkrBiiV980bb33tD/ghC4b9u/YxupZWSXI7JQqXV00hgrUuYj98q9UfpckT+N7pQ2loY2JHuLthesAkqB54n8sCUVuA6lvyKvC9vvskeY7k3TmANrq4Br4TPLjSM1zf8x2uJtQ7Jb+n5JrAJKo+TFcH5qqv+d2cZfhe33kezOnQXfsAoorTwsS7adcvyO/JG8R3YZ2ucakh3mvRtrGCNdoa+G82OGZtu2daJsg/yBMNqiPSVtSHabR2BJHNinZA92jLVy3FMppWjvuE+tjXFSBXQyxhS+Ft2YbNC/ddPxVyqCEpmTgHF/d418NzwSbhZe3zcqYwi4wOeQbwhLvKEQYtm+tgQxH/EJOYr7sjYixU6ppdVQ3/eEjXhr/BU38O8pF0Ky27wNYe1cWoqZYyf+20cuyoB0iJmcEhElu83VEtYpfOAya7FG3m9I8Q5d+Jhu6rqFmK+TRuqqbU/bfdOQ1r3mEWgVUFo/WjMYd+jGp0o/HtFLN9ZN09ydz2dLTaBkt2VdD9iHvvTlYkIzBy1nFzfBh8KVZ/TN+tumaXJ9aUzGfsf5fDZvSZT4Dk8y8hehzyf0fVuNuBbusmjbz8GTFL7o1Ip09TX/JB3Xp3QnTzov50IuleOK1uelI1CK+4Y2qONjDF32lNcJHrn80sumaYaiAsnOuLllpjSGku66W+wpe++KQjo/JeAG2V9bo4hveASURmGq4kma4t59ZOn8lCuR7ItV/UWULuVip/3pEMvGJP905PILe3NysUC934+EVoZX/FwJ+Assf0O+4lMVVWpoxZZH4Pf4jykKLD8rn99TtsS7Biv0SlXN/my8Aj6j+4+cRx2uzQq96sGykaUyRkpHKxvrlmBMQarcY7QyvFql36E+J/ITPycSqU8qJQ+uz8pdUJ/W7DA3AaE+L9w7uD6xfkH9zYQOcxewS/3VjhH5//xuTOWSWp3lpAropAropAropAropAropAropAropAropAro5F98M6PT1IgmawAAAABJRU5ErkJggg==\";this.style.width=\"40px\";this.style.height=\"40px\";this.style.position=\"absolute\";this.style.margin=\"-20px 0 0 -20px\";this.style.left=\"50%\";this.style.top=\"50%\";' /></body></html>").toString();
        obj = URLEncoder.encode(((String) (finalHtml)), "utf-8").replaceAll("\\+", " ");
        finalHtml = obj;
_L3:
        try
        {
            post(new _cls1());
            return;
        }
        catch (Exception exception)
        {
            return;
        }
        finalHtml;
        finalHtml = null;
_L5:
        if (finalHtml != null)
        {
            ((HttpURLConnection) (finalHtml)).disconnect();
            i = 0;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
        exception1;
        finalHtml = obj;
        obj = exception1;
_L4:
        if (finalHtml != null)
        {
            ((HttpURLConnection) (finalHtml)).disconnect();
        }
        throw obj;
        obj;
          goto _L3
        obj;
          goto _L4
        IOException ioexception;
        ioexception;
          goto _L5
_L2:
        i = j;
        if (true) goto _L7; else goto _L6
_L6:
    }

    _cls1()
    {
        this$0 = final_pincloseupwebimageview;
        val$url = String.this;
        super();
    }
}
