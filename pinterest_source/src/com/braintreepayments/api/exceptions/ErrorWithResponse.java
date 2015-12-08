// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.exceptions;

import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;

public final class ErrorWithResponse extends Exception
{

    private final int a;
    private final String b;
    private final List c;

    public ErrorWithResponse(int i, BraintreeErrors braintreeerrors)
    {
        a = i;
        if (braintreeerrors != null)
        {
            c = braintreeerrors.b();
            b = braintreeerrors.a();
            return;
        } else
        {
            c = null;
            b = "Parsing error response failed";
            return;
        }
    }

    public ErrorWithResponse(int i, String s)
    {
        this(i, (BraintreeErrors)(new Gson()).fromJson(s, com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeErrors));
    }

    public final BraintreeError a(String s)
    {
label0:
        {
            if (c == null)
            {
                break label0;
            }
            Iterator iterator = c.iterator();
            BraintreeError braintreeerror;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                braintreeerror = (BraintreeError)iterator.next();
            } while (!BraintreeError.a(braintreeerror).equals(s));
            return braintreeerror;
        }
        return null;
    }

    public final String getMessage()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("ErrorWithResponse (")).append(a).append("): ").append(b).append("\n").append(c.toString()).toString();
    }

    /* member class not found */
    class BraintreeErrors {}


    /* member class not found */
    class BraintreeError {}

}
