// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

final class ExceptionDiagnosis
    implements Serializable
{

    private static final long serialVersionUID = 0x64cc93f854f97a4L;
    String hexString;
    int lineNumberHash;
    int stackLineHash;
    Throwable th;

    ExceptionDiagnosis(Throwable throwable)
    {
        this(throwable, new String[0]);
    }

    ExceptionDiagnosis(Throwable throwable, String as[])
    {
        hexString = "";
        th = throwable;
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        stackLineHash = 0;
        lineNumberHash = 0;
        int i = astacktraceelement.length - 1;
label0:
        do
        {
            if (i >= 0)
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                int k = as.length;
                int j = 0;
                do
                {
label1:
                    {
                        if (j < k)
                        {
                            String s = as[j];
                            if (!stacktraceelement.getClassName().startsWith(s))
                            {
                                break label1;
                            }
                            j = stacktraceelement.getClassName().hashCode();
                            int l = stacktraceelement.getMethodName().hashCode();
                            stackLineHash = stackLineHash * 31 + (j + l);
                            lineNumberHash = lineNumberHash * 31 + stacktraceelement.getLineNumber();
                        }
                        i--;
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            hexString = hexString + toHexString(stackLineHash) + "-" + toHexString(lineNumberHash);
            if (throwable.getCause() != null)
            {
                hexString = hexString + " " + (new ExceptionDiagnosis(throwable.getCause(), as)).asHexString();
            }
            return;
        } while (true);
    }

    private String toHexString(int i)
    {
        String s = "0000000" + Integer.toHexString(i);
        return s.substring(s.length() - 8, s.length());
    }

    String asHexString()
    {
        return hexString;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ExceptionDiagnosis)obj;
            if (lineNumberHash != ((ExceptionDiagnosis) (obj)).lineNumberHash)
            {
                return false;
            }
            if (stackLineHash != ((ExceptionDiagnosis) (obj)).stackLineHash)
            {
                return false;
            }
        }
        return true;
    }

    int getLineNumberHash()
    {
        return lineNumberHash;
    }

    String getLineNumberHashAsHex()
    {
        return toHexString(lineNumberHash);
    }

    int getStackLineHash()
    {
        return stackLineHash;
    }

    String getStackLineHashAsHex()
    {
        return toHexString(stackLineHash);
    }

    public int hashCode()
    {
        return stackLineHash * 31 + lineNumberHash;
    }

    public String toString()
    {
        return "ExceptionDiagnosis{stackLineHash=" + stackLineHash + ", lineNumberHash=" + lineNumberHash + '}';
    }
}
