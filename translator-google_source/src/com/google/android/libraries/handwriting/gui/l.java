// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.json.JSONException;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            o, i, n, aa

final class l
    implements o
{

    final i a;
    private final boolean b;

    public l(i j, boolean flag)
    {
        a = j;
        super();
        b = flag;
    }

    public final void a(n n1, com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException recognitionfailedexception)
    {
        synchronized (a.d)
        {
            a.d.remove(n1);
        }
        obj = a;
        int j = n.a(n1);
        (new StringBuilder(String.valueOf("recognizing").length() + 37)).append("Exception while request(").append(j).append(") ").append("recognizing");
        try
        {
            throw recognitionfailedexception;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = "";
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "No response from server while ".concat(n1);
            } else
            {
                n1 = new String("No response from server while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Connection timed out while ".concat(n1);
            } else
            {
                n1 = new String("Connection timed out while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Connection timeout while ".concat(n1);
            } else
            {
                n1 = new String("Connection timeout while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Unknown host while ".concat(n1);
            } else
            {
                n1 = new String("Unknown host while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Http Client Protocol Exception while ".concat(n1);
            } else
            {
                n1 = new String("Http Client Protocol Exception while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Socket timeout while ".concat(n1);
            } else
            {
                n1 = new String("Socket timeout while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "JSON exception while ".concat(n1);
            } else
            {
                n1 = new String("JSON exception while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Socket exception while ".concat(n1);
            } else
            {
                n1 = new String("Socket exception while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Lost authentication while ".concat(n1);
            } else
            {
                n1 = new String("Lost authentication while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Unsupported encoding while ".concat(n1);
            } else
            {
                n1 = new String("Unsupported encoding while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Illegal argument while ".concat(n1);
            } else
            {
                n1 = new String("Illegal argument while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "InterruptedIOException while ".concat(n1);
            } else
            {
                n1 = new String("InterruptedIOException while ");
            }
            recognitionfailedexception.a(j, n1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            recognitionfailedexception = ((i) (obj)).i;
            n1 = String.valueOf("recognizing");
            if (n1.length() != 0)
            {
                n1 = "Unidentified error while ".concat(n1);
            } else
            {
                n1 = new String("Unidentified error while ");
            }
        }
        recognitionfailedexception.a(j, n1);
        return;
        n1;
        obj;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void a(n n1, StrokeList strokelist, RecognitionResult recognitionresult)
    {
        String s = String.valueOf(n1);
        strokelist = String.valueOf(strokelist);
        String s1 = String.valueOf(recognitionresult);
        (new StringBuilder(String.valueOf(s).length() + 20 + String.valueOf(strokelist).length() + String.valueOf(s1).length())).append("recognitionEnded: ").append(s).append(" ").append(strokelist).append(" ").append(s1);
        synchronized (a.d)
        {
            a.d.remove(n1);
        }
        long l1 = System.currentTimeMillis();
        if (recognitionresult != null)
        {
            int j = recognitionresult.a;
            if (!n1.c)
            {
                recognitionresult.c = l1;
                if (j < a.j)
                {
                    int k = recognitionresult.a;
                    (new StringBuilder(43)).append("Obsolete request: ").append(j).append(" < ").append(k);
                    return;
                }
                if (j > a.k)
                {
                    a.i.a(recognitionresult, a.j - j, b);
                    a.k = j;
                }
                if (a.i.f())
                {
                    n1 = a.i;
                    int i1 = a.j;
                    strokelist = String.valueOf(recognitionresult.d);
                    n1.a((new StringBuilder(String.valueOf(strokelist).length() + 30)).append("Pending requests: ").append(i1 - j).append("\n").append(strokelist).toString());
                    return;
                }
            }
        }
        return;
        n1;
        strokelist;
        JVM INSTR monitorexit ;
        throw n1;
    }
}
