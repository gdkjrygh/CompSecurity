// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.text.Editable;
import org.xml.sax.XMLReader;

public class at
    implements android.text.Html.TagHandler
{

    private boolean a;
    private String b;
    private int c;

    public at()
    {
        a = true;
        c = 1;
    }

    public void handleTag(boolean flag, String s, Editable editable, XMLReader xmlreader)
    {
label0:
        {
label1:
            {
                if ("ul".equals(s))
                {
                    b = "ul";
                } else
                if ("ol".equals(s))
                {
                    b = "ol";
                }
                if (s.equals("li"))
                {
                    if (!"ul".equals(b))
                    {
                        break label0;
                    }
                    if (!a)
                    {
                        break label1;
                    }
                    editable.append("\n\t\u2022");
                    a = false;
                }
                return;
            }
            a = true;
            return;
        }
        if (a)
        {
            editable.append((new StringBuilder()).append("\n\t").append(c).append(". ").toString());
            a = false;
            c = c + 1;
            return;
        } else
        {
            a = true;
            return;
        }
    }
}
