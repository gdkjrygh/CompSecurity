// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result.supplement;

import android.content.Context;
import android.os.AsyncTask;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Log;
import android.widget.TextView;
import com.google.zxing.client.android.history.HistoryManager;
import com.google.zxing.client.result.ISBNParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ProductParsedResult;
import com.google.zxing.client.result.URIParsedResult;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            URIResultInfoRetriever, TitleRetriever, ProductResultInfoRetriever, AmazonInfoRetriever, 
//            BookResultInfoRetriever

public abstract class SupplementalInfoRetriever extends AsyncTask
{

    private static final String TAG = "SupplementalInfo";
    private final WeakReference historyManagerRef;
    private final Collection newContents = new ArrayList();
    private final Collection newHistories = new ArrayList();
    private final WeakReference textViewRef;

    SupplementalInfoRetriever(TextView textview, HistoryManager historymanager)
    {
        textViewRef = new WeakReference(textview);
        historyManagerRef = new WeakReference(historymanager);
    }

    static void maybeAddText(String s, Collection collection)
    {
        if (s != null && !s.isEmpty())
        {
            collection.add(s);
        }
    }

    static void maybeAddTextSeries(Collection collection, Collection collection1)
    {
        if (collection != null && !collection.isEmpty())
        {
            boolean flag = true;
            StringBuilder stringbuilder = new StringBuilder();
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                String s = (String)collection.next();
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(s);
            }
            collection1.add(stringbuilder.toString());
        }
    }

    public static void maybeInvokeRetrieval(TextView textview, ParsedResult parsedresult, HistoryManager historymanager, Context context)
    {
        if (parsedresult instanceof URIParsedResult)
        {
            (new URIResultInfoRetriever(textview, (URIParsedResult)parsedresult, historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            (new TitleRetriever(textview, (URIParsedResult)parsedresult, historymanager)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } else
        {
            if (parsedresult instanceof ProductParsedResult)
            {
                Object obj = (ProductParsedResult)parsedresult;
                parsedresult = ((ProductParsedResult) (obj)).getProductID();
                obj = ((ProductParsedResult) (obj)).getNormalizedProductID();
                (new ProductResultInfoRetriever(textview, parsedresult, historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                switch (parsedresult.length())
                {
                default:
                    return;

                case 12: // '\f'
                    (new AmazonInfoRetriever(textview, "UPC", ((String) (obj)), historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                    return;

                case 13: // '\r'
                    (new AmazonInfoRetriever(textview, "EAN", ((String) (obj)), historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                    break;
                }
                return;
            }
            if (parsedresult instanceof ISBNParsedResult)
            {
                parsedresult = ((ISBNParsedResult)parsedresult).getISBN();
                (new ProductResultInfoRetriever(textview, parsedresult, historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                (new BookResultInfoRetriever(textview, parsedresult, historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                (new AmazonInfoRetriever(textview, "ISBN", parsedresult, historymanager, context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                return;
            }
        }
    }

    final void append(String s, String s1, String as[], String s2)
    {
        Object obj;
        int i;
        int j;
        obj = new StringBuilder();
        if (s1 != null)
        {
            ((StringBuilder) (obj)).append(s1).append(' ');
        }
        j = ((StringBuilder) (obj)).length();
        boolean flag = true;
        int k = as.length;
        i = 0;
        while (i < k) 
        {
            s1 = as[i];
            if (flag)
            {
                ((StringBuilder) (obj)).append(s1);
                flag = false;
            } else
            {
                ((StringBuilder) (obj)).append(" [");
                ((StringBuilder) (obj)).append(s1);
                ((StringBuilder) (obj)).append(']');
            }
            i++;
        }
        i = ((StringBuilder) (obj)).length();
        as = ((StringBuilder) (obj)).toString();
        obj = new SpannableString((new StringBuilder()).append(as).append("\n\n").toString());
        if (s2 == null) goto _L2; else goto _L1
_L1:
        if (!s2.startsWith("HTTP://")) goto _L4; else goto _L3
_L3:
        s1 = (new StringBuilder()).append("http").append(s2.substring(4)).toString();
_L6:
        ((Spannable) (obj)).setSpan(new URLSpan(s1), j, i, 33);
_L2:
        newContents.add(obj);
        newHistories.add(new String[] {
            s, as
        });
        return;
_L4:
        s1 = s2;
        if (s2.startsWith("HTTPS://"))
        {
            s1 = (new StringBuilder()).append("https").append(s2.substring(5)).toString();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final transient Object doInBackground(Object aobj[])
    {
        try
        {
            retrieveSupplementalInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            Log.w("SupplementalInfo", ((Throwable) (aobj)));
        }
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (TextView)textViewRef.get();
        if (obj != null)
        {
            for (Iterator iterator = newContents.iterator(); iterator.hasNext(); ((TextView) (obj)).append((CharSequence)iterator.next())) { }
            ((TextView) (obj)).setMovementMethod(LinkMovementMethod.getInstance());
        }
        obj = (HistoryManager)historyManagerRef.get();
        if (obj != null)
        {
            String as[];
            for (Iterator iterator1 = newHistories.iterator(); iterator1.hasNext(); ((HistoryManager) (obj)).addHistoryItemDetails(as[0], as[1]))
            {
                as = (String[])iterator1.next();
            }

        }
    }

    abstract void retrieveSupplementalInfo()
        throws IOException;
}
