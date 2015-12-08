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
import com.google.zxing.client.android.common.executor.AsyncTaskExecInterface;
import com.google.zxing.client.android.common.executor.AsyncTaskExecManager;
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
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            URIResultInfoRetriever, TitleRetriever, ProductResultInfoRetriever, AmazonInfoRetriever, 
//            BookResultInfoRetriever

public abstract class SupplementalInfoRetriever extends AsyncTask
{

    private static final String TAG = "SupplementalInfo";
    private final WeakReference historyManagerRef;
    private final List newContents = new ArrayList();
    private final List newHistories = new ArrayList();
    private final WeakReference textViewRef;

    SupplementalInfoRetriever(TextView textview, HistoryManager historymanager)
    {
        textViewRef = new WeakReference(textview);
        historyManagerRef = new WeakReference(historymanager);
    }

    static void maybeAddText(String s, Collection collection)
    {
        if (s != null && s.length() > 0)
        {
            collection.add(s);
        }
    }

    static void maybeAddTextSeries(Collection collection, Collection collection1)
    {
        if (collection == null || collection.isEmpty()) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        boolean flag;
        flag = true;
        stringbuilder = new StringBuilder();
        collection = collection.iterator();
_L6:
        if (collection.hasNext()) goto _L4; else goto _L3
_L3:
        collection1.add(stringbuilder.toString());
_L2:
        return;
_L4:
        String s = (String)collection.next();
        if (flag)
        {
            flag = false;
        } else
        {
            stringbuilder.append(", ");
        }
        stringbuilder.append(s);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void maybeInvokeRetrieval(TextView textview, ParsedResult parsedresult, HistoryManager historymanager, Context context)
    {
        AsyncTaskExecInterface asynctaskexecinterface = (AsyncTaskExecInterface)(new AsyncTaskExecManager()).build();
        if (parsedresult instanceof URIParsedResult)
        {
            asynctaskexecinterface.execute(new URIResultInfoRetriever(textview, (URIParsedResult)parsedresult, historymanager, context), new Object[0]);
            asynctaskexecinterface.execute(new TitleRetriever(textview, (URIParsedResult)parsedresult, historymanager), new Object[0]);
        } else
        {
            if (parsedresult instanceof ProductParsedResult)
            {
                parsedresult = ((ProductParsedResult)parsedresult).getProductID();
                asynctaskexecinterface.execute(new ProductResultInfoRetriever(textview, parsedresult, historymanager, context), new Object[0]);
                switch (parsedresult.length())
                {
                default:
                    return;

                case 12: // '\f'
                    asynctaskexecinterface.execute(new AmazonInfoRetriever(textview, "UPC", parsedresult, historymanager, context), new Object[0]);
                    return;

                case 13: // '\r'
                    asynctaskexecinterface.execute(new AmazonInfoRetriever(textview, "EAN", parsedresult, historymanager, context), new Object[0]);
                    break;
                }
                return;
            }
            if (parsedresult instanceof ISBNParsedResult)
            {
                parsedresult = ((ISBNParsedResult)parsedresult).getISBN();
                asynctaskexecinterface.execute(new ProductResultInfoRetriever(textview, parsedresult, historymanager, context), new Object[0]);
                asynctaskexecinterface.execute(new BookResultInfoRetriever(textview, parsedresult, historymanager, context), new Object[0]);
                asynctaskexecinterface.execute(new AmazonInfoRetriever(textview, "ISBN", parsedresult, historymanager, context), new Object[0]);
                return;
            }
        }
    }

    final void append(String s, String s1, String as[], String s2)
    {
        Object obj = new StringBuilder();
        if (s1 != null)
        {
            ((StringBuilder) (obj)).append(s1).append(' ');
        }
        int j = ((StringBuilder) (obj)).length();
        boolean flag = true;
        int k = as.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                i = ((StringBuilder) (obj)).length();
                as = ((StringBuilder) (obj)).toString();
                obj = new SpannableString((new StringBuilder(String.valueOf(as))).append("\n\n").toString());
                if (s2 != null)
                {
                    if (s2.startsWith("HTTP://"))
                    {
                        s1 = (new StringBuilder("http")).append(s2.substring(4)).toString();
                    } else
                    {
                        s1 = s2;
                        if (s2.startsWith("HTTPS://"))
                        {
                            s1 = (new StringBuilder("https")).append(s2.substring(5)).toString();
                        }
                    }
                    ((Spannable) (obj)).setSpan(new URLSpan(s1), j, i, 33);
                }
                newContents.add(obj);
                newHistories.add(new String[] {
                    s, as
                });
                return;
            }
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
        } while (true);
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
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = newContents.iterator();
_L7:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        ((TextView) (obj)).setMovementMethod(LinkMovementMethod.getInstance());
_L2:
        obj = (HistoryManager)historyManagerRef.get();
        if (obj == null) goto _L6; else goto _L5
_L5:
        iterator = newHistories.iterator();
_L8:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_92;
        }
_L6:
        return;
_L4:
        ((TextView) (obj)).append((Spannable)iterator.next());
          goto _L7
        String as[] = (String[])iterator.next();
        ((HistoryManager) (obj)).addHistoryItemDetails(as[0], as[1]);
          goto _L8
    }

    abstract void retrieveSupplementalInfo()
        throws IOException;
}
