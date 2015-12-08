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
                            stackLineHash = stacktraceelement.getClassName().hashCode() + stacktraceelement.getMethodName().hashCode() + stackLineHash * 31;
                            lineNumberHash = lineNumberHash * 31 + stacktraceelement.getLineNumber();
                        }
                        i--;
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            hexString = (new StringBuilder()).append(hexString).append(toHexString(stackLineHash)).append("-").append(toHexString(lineNumberHash)).toString();
            if (throwable.getCause() != null)
            {
                hexString = (new StringBuilder()).append(hexString).append(" ").append((new ExceptionDiagnosis(throwable.getCause(), as)).asHexString()).toString();
            }
            return;
        } while (true);
    }

    private String toHexString(int i)
    {
        String s = (new StringBuilder("0000000")).append(Integer.toHexString(i)).toString();
        return s.substring(s.length() - 8, s.length());
    }

    final String asHexString()
    {
        return hexString;
    }

    public final boolean equals(Object obj)
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

    final int getLineNumberHash()
    {
        return lineNumberHash;
    }

    final String getLineNumberHashAsHex()
    {
        return toHexString(lineNumberHash);
    }

    final int getStackLineHash()
    {
        return stackLineHash;
    }

    final String getStackLineHashAsHex()
    {
        return toHexString(stackLineHash);
    }

    public final int hashCode()
    {
        return stackLineHash * 31 + lineNumberHash;
    }

    public final String toString()
    {
        return (new StringBuilder("ExceptionDiagnosis{stackLineHash=")).append(stackLineHash).append(", lineNumberHash=").append(lineNumberHash).append('}').toString();
    }
}
