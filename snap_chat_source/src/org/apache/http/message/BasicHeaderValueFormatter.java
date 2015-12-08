// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeaderValueFormatter
{

    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final BasicHeaderValueFormatter INSTANCE = new BasicHeaderValueFormatter();

    public BasicHeaderValueFormatter()
    {
    }

    protected void doFormatValue(CharArrayBuffer chararraybuffer, String s, boolean flag)
    {
        boolean flag1 = false;
        boolean flag2 = flag;
        if (!flag)
        {
            int i = 0;
            do
            {
                flag2 = flag;
                if (i >= s.length())
                {
                    break;
                }
                flag2 = flag;
                if (flag)
                {
                    break;
                }
                flag = isSeparator(s.charAt(i));
                i++;
            } while (true);
        }
        int j = ((flag1) ? 1 : 0);
        if (flag2)
        {
            chararraybuffer.append('"');
            j = ((flag1) ? 1 : 0);
        }
        for (; j < s.length(); j++)
        {
            char c = s.charAt(j);
            if (isUnsafe(c))
            {
                chararraybuffer.append('\\');
            }
            chararraybuffer.append(c);
        }

        if (flag2)
        {
            chararraybuffer.append('"');
        }
    }

    protected int estimateNameValuePairLen(NameValuePair namevaluepair)
    {
        int i;
        if (namevaluepair == null)
        {
            i = 0;
        } else
        {
            int j = namevaluepair.getName().length();
            namevaluepair = namevaluepair.getValue();
            i = j;
            if (namevaluepair != null)
            {
                return j + (namevaluepair.length() + 3);
            }
        }
        return i;
    }

    protected int estimateParametersLen(NameValuePair anamevaluepair[])
    {
        boolean flag;
        int k;
        flag = false;
        k = ((flag) ? 1 : 0);
        if (anamevaluepair == null) goto _L2; else goto _L1
_L1:
        if (anamevaluepair.length > 0) goto _L4; else goto _L3
_L3:
        k = ((flag) ? 1 : 0);
_L2:
        return k;
_L4:
        int i = anamevaluepair.length;
        int l = anamevaluepair.length;
        i = i - 1 << 1;
        int j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            k = estimateNameValuePairLen(anamevaluepair[j]);
            j++;
            i = k + i;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public CharArrayBuffer formatNameValuePair(CharArrayBuffer chararraybuffer, NameValuePair namevaluepair, boolean flag)
    {
        Args.notNull(namevaluepair, "Name / value pair");
        int i = estimateNameValuePairLen(namevaluepair);
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        chararraybuffer.append(namevaluepair.getName());
        namevaluepair = namevaluepair.getValue();
        if (namevaluepair != null)
        {
            chararraybuffer.append('=');
            doFormatValue(chararraybuffer, namevaluepair, flag);
        }
        return chararraybuffer;
    }

    public CharArrayBuffer formatParameters(CharArrayBuffer chararraybuffer, NameValuePair anamevaluepair[], boolean flag)
    {
        Args.notNull(anamevaluepair, "Header parameter array");
        int i = estimateParametersLen(anamevaluepair);
        if (chararraybuffer == null)
        {
            chararraybuffer = new CharArrayBuffer(i);
        } else
        {
            chararraybuffer.ensureCapacity(i);
        }
        for (i = 0; i < anamevaluepair.length; i++)
        {
            if (i > 0)
            {
                chararraybuffer.append("; ");
            }
            formatNameValuePair(chararraybuffer, anamevaluepair[i], flag);
        }

        return chararraybuffer;
    }

    protected boolean isSeparator(char c)
    {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    protected boolean isUnsafe(char c)
    {
        return "\"\\".indexOf(c) >= 0;
    }

}
