// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.SystemUtils;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrMatcher, StrTokenizer

public class StrBuilder
    implements CharSequence, Appendable
{
    class StrBuilderReader extends Reader
    {

        private int mark;
        private int pos;
        final StrBuilder this$0;

        public void close()
        {
        }

        public void mark(int i)
        {
            mark = pos;
        }

        public boolean markSupported()
        {
            return true;
        }

        public int read()
        {
            if (!ready())
            {
                return -1;
            } else
            {
                StrBuilder strbuilder = StrBuilder.this;
                int i = pos;
                pos = i + 1;
                return strbuilder.charAt(i);
            }
        }

        public int read(char ac[], int i, int j)
        {
            if (i < 0 || j < 0 || i > ac.length || i + j > ac.length || i + j < 0)
            {
                throw new IndexOutOfBoundsException();
            }
            if (j == 0)
            {
                return 0;
            }
            if (pos >= size())
            {
                return -1;
            }
            int k = j;
            if (pos + j > size())
            {
                k = size() - pos;
            }
            getChars(pos, pos + k, ac, i);
            pos = pos + k;
            return k;
        }

        public boolean ready()
        {
            return pos < size();
        }

        public void reset()
        {
            pos = mark;
        }

        public long skip(long l)
        {
            long l1 = l;
            if ((long)pos + l > (long)size())
            {
                l1 = size() - pos;
            }
            if (l1 < 0L)
            {
                return 0L;
            } else
            {
                pos = (int)((long)pos + l1);
                return l1;
            }
        }

        StrBuilderReader()
        {
            this$0 = StrBuilder.this;
            super();
        }
    }

    class StrBuilderTokenizer extends StrTokenizer
    {

        final StrBuilder this$0;

        public String getContent()
        {
            String s1 = super.getContent();
            String s = s1;
            if (s1 == null)
            {
                s = toString();
            }
            return s;
        }

        protected List tokenize(char ac[], int i, int j)
        {
            if (ac == null)
            {
                return super.tokenize(buffer, 0, size());
            } else
            {
                return super.tokenize(ac, i, j);
            }
        }

        StrBuilderTokenizer()
        {
            this$0 = StrBuilder.this;
            super();
        }
    }

    class StrBuilderWriter extends Writer
    {

        final StrBuilder this$0;

        public void close()
        {
        }

        public void flush()
        {
        }

        public void write(int i)
        {
            append((char)i);
        }

        public void write(String s)
        {
            append(s);
        }

        public void write(String s, int i, int j)
        {
            append(s, i, j);
        }

        public void write(char ac[])
        {
            append(ac);
        }

        public void write(char ac[], int i, int j)
        {
            append(ac, i, j);
        }

        StrBuilderWriter()
        {
            this$0 = StrBuilder.this;
            super();
        }
    }


    static final int CAPACITY = 32;
    private static final long serialVersionUID = 0x69dea51fe8fc7e4bL;
    protected char buffer[];
    private String newLine;
    private String nullText;
    protected int size;

    public StrBuilder()
    {
        this(32);
    }

    public StrBuilder(int i)
    {
        int j = i;
        if (i <= 0)
        {
            j = 32;
        }
        buffer = new char[j];
    }

    public StrBuilder(String s)
    {
        if (s == null)
        {
            buffer = new char[32];
            return;
        } else
        {
            buffer = new char[s.length() + 32];
            append(s);
            return;
        }
    }

    private void deleteImpl(int i, int j, int k)
    {
        System.arraycopy(buffer, j, buffer, i, size - j);
        size = size - k;
    }

    private StrBuilder replaceImpl(StrMatcher strmatcher, String s, int i, int j, int k)
    {
        if (strmatcher != null && size != 0)
        {
            char ac[];
            int l;
            int i1;
            int i2;
            if (s == null)
            {
                l = 0;
            } else
            {
                l = s.length();
            }
            ac = buffer;
            i1 = i;
            i2 = j;
            j = i1;
            while (j < i2 && k != 0) 
            {
                int j2 = strmatcher.isMatch(ac, j, i, i2);
                int l1 = j;
                int j1 = i2;
                int k1 = k;
                if (j2 > 0)
                {
                    replaceImpl(j, j + j2, j2, s, l);
                    i2 = (i2 - j2) + l;
                    j = (j + l) - 1;
                    l1 = j;
                    j1 = i2;
                    k1 = k;
                    if (k > 0)
                    {
                        k1 = k - 1;
                        j1 = i2;
                        l1 = j;
                    }
                }
                j = l1 + 1;
                i2 = j1;
                k = k1;
            }
        }
        return this;
    }

    private void replaceImpl(int i, int j, int k, String s, int l)
    {
        int i1 = (size - k) + l;
        if (l != k)
        {
            ensureCapacity(i1);
            System.arraycopy(buffer, j, buffer, i + l, size - j);
            size = i1;
        }
        if (l > 0)
        {
            s.getChars(0, l, buffer, i);
        }
    }

    public volatile Appendable append(char c)
        throws IOException
    {
        return append(c);
    }

    public volatile Appendable append(CharSequence charsequence)
        throws IOException
    {
        return append(charsequence);
    }

    public volatile Appendable append(CharSequence charsequence, int i, int j)
        throws IOException
    {
        return append(charsequence, i, j);
    }

    public StrBuilder append(char c)
    {
        ensureCapacity(length() + 1);
        char ac[] = buffer;
        int i = size;
        size = i + 1;
        ac[i] = c;
        return this;
    }

    public StrBuilder append(double d)
    {
        return append(String.valueOf(d));
    }

    public StrBuilder append(float f)
    {
        return append(String.valueOf(f));
    }

    public StrBuilder append(int i)
    {
        return append(String.valueOf(i));
    }

    public StrBuilder append(long l)
    {
        return append(String.valueOf(l));
    }

    public StrBuilder append(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return appendNull();
        } else
        {
            return append(charsequence.toString());
        }
    }

    public StrBuilder append(CharSequence charsequence, int i, int j)
    {
        if (charsequence == null)
        {
            return appendNull();
        } else
        {
            return append(charsequence.toString(), i, j);
        }
    }

    public StrBuilder append(Object obj)
    {
        if (obj == null)
        {
            return appendNull();
        } else
        {
            return append(obj.toString());
        }
    }

    public StrBuilder append(String s)
    {
        StrBuilder strbuilder;
        if (s == null)
        {
            strbuilder = appendNull();
        } else
        {
            int i = s.length();
            strbuilder = this;
            if (i > 0)
            {
                int j = length();
                ensureCapacity(j + i);
                s.getChars(0, i, buffer, j);
                size = size + i;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder append(String s, int i, int j)
    {
        StrBuilder strbuilder;
        if (s == null)
        {
            strbuilder = appendNull();
        } else
        {
            if (i < 0 || i > s.length())
            {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (j < 0 || i + j > s.length())
            {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            strbuilder = this;
            if (j > 0)
            {
                int k = length();
                ensureCapacity(k + j);
                s.getChars(i, i + j, buffer, k);
                size = size + j;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder append(StringBuffer stringbuffer)
    {
        StrBuilder strbuilder;
        if (stringbuffer == null)
        {
            strbuilder = appendNull();
        } else
        {
            int i = stringbuffer.length();
            strbuilder = this;
            if (i > 0)
            {
                int j = length();
                ensureCapacity(j + i);
                stringbuffer.getChars(0, i, buffer, j);
                size = size + i;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder append(StringBuffer stringbuffer, int i, int j)
    {
        StrBuilder strbuilder;
        if (stringbuffer == null)
        {
            strbuilder = appendNull();
        } else
        {
            if (i < 0 || i > stringbuffer.length())
            {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (j < 0 || i + j > stringbuffer.length())
            {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            strbuilder = this;
            if (j > 0)
            {
                int k = length();
                ensureCapacity(k + j);
                stringbuffer.getChars(i, i + j, buffer, k);
                size = size + j;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder append(StrBuilder strbuilder)
    {
        StrBuilder strbuilder1;
        if (strbuilder == null)
        {
            strbuilder1 = appendNull();
        } else
        {
            int i = strbuilder.length();
            strbuilder1 = this;
            if (i > 0)
            {
                int j = length();
                ensureCapacity(j + i);
                System.arraycopy(strbuilder.buffer, 0, buffer, j, i);
                size = size + i;
                return this;
            }
        }
        return strbuilder1;
    }

    public StrBuilder append(StrBuilder strbuilder, int i, int j)
    {
        StrBuilder strbuilder1;
        if (strbuilder == null)
        {
            strbuilder1 = appendNull();
        } else
        {
            if (i < 0 || i > strbuilder.length())
            {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (j < 0 || i + j > strbuilder.length())
            {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            strbuilder1 = this;
            if (j > 0)
            {
                int k = length();
                ensureCapacity(k + j);
                strbuilder.getChars(i, i + j, buffer, k);
                size = size + j;
                return this;
            }
        }
        return strbuilder1;
    }

    public StrBuilder append(boolean flag)
    {
        if (flag)
        {
            ensureCapacity(size + 4);
            char ac[] = buffer;
            int i = size;
            size = i + 1;
            ac[i] = 't';
            ac = buffer;
            i = size;
            size = i + 1;
            ac[i] = 'r';
            ac = buffer;
            i = size;
            size = i + 1;
            ac[i] = 'u';
            ac = buffer;
            i = size;
            size = i + 1;
            ac[i] = 'e';
            return this;
        } else
        {
            ensureCapacity(size + 5);
            char ac1[] = buffer;
            int j = size;
            size = j + 1;
            ac1[j] = 'f';
            ac1 = buffer;
            j = size;
            size = j + 1;
            ac1[j] = 'a';
            ac1 = buffer;
            j = size;
            size = j + 1;
            ac1[j] = 'l';
            ac1 = buffer;
            j = size;
            size = j + 1;
            ac1[j] = 's';
            ac1 = buffer;
            j = size;
            size = j + 1;
            ac1[j] = 'e';
            return this;
        }
    }

    public StrBuilder append(char ac[])
    {
        StrBuilder strbuilder;
        if (ac == null)
        {
            strbuilder = appendNull();
        } else
        {
            int i = ac.length;
            strbuilder = this;
            if (i > 0)
            {
                int j = length();
                ensureCapacity(j + i);
                System.arraycopy(ac, 0, buffer, j, i);
                size = size + i;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder append(char ac[], int i, int j)
    {
        StrBuilder strbuilder;
        if (ac == null)
        {
            strbuilder = appendNull();
        } else
        {
            if (i < 0 || i > ac.length)
            {
                throw new StringIndexOutOfBoundsException((new StringBuilder()).append("Invalid startIndex: ").append(j).toString());
            }
            if (j < 0 || i + j > ac.length)
            {
                throw new StringIndexOutOfBoundsException((new StringBuilder()).append("Invalid length: ").append(j).toString());
            }
            strbuilder = this;
            if (j > 0)
            {
                int k = length();
                ensureCapacity(k + j);
                System.arraycopy(ac, i, buffer, k, j);
                size = size + j;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder appendAll(Iterable iterable)
    {
        if (iterable != null)
        {
            for (iterable = iterable.iterator(); iterable.hasNext(); append(iterable.next())) { }
        }
        return this;
    }

    public StrBuilder appendAll(Iterator iterator)
    {
        if (iterator != null)
        {
            for (; iterator.hasNext(); append(iterator.next())) { }
        }
        return this;
    }

    public StrBuilder appendAll(Object aobj[])
    {
        if (aobj != null && aobj.length > 0)
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                append(aobj[i]);
            }

        }
        return this;
    }

    public StrBuilder appendFixedWidthPadLeft(int i, int j, char c)
    {
        return appendFixedWidthPadLeft(String.valueOf(i), j, c);
    }

    public StrBuilder appendFixedWidthPadLeft(Object obj, int i, char c)
    {
        if (i > 0)
        {
            ensureCapacity(size + i);
            Object obj1;
            int k;
            if (obj == null)
            {
                obj = getNullText();
            } else
            {
                obj = obj.toString();
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = "";
            }
            k = ((String) (obj1)).length();
            if (k >= i)
            {
                ((String) (obj1)).getChars(k - i, k, buffer, size);
            } else
            {
                int l = i - k;
                for (int j = 0; j < l; j++)
                {
                    buffer[size + j] = c;
                }

                ((String) (obj1)).getChars(0, k, buffer, size + l);
            }
            size = size + i;
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadRight(int i, int j, char c)
    {
        return appendFixedWidthPadRight(String.valueOf(i), j, c);
    }

    public StrBuilder appendFixedWidthPadRight(Object obj, int i, char c)
    {
        if (i > 0)
        {
            ensureCapacity(size + i);
            Object obj1;
            int k;
            if (obj == null)
            {
                obj = getNullText();
            } else
            {
                obj = obj.toString();
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = "";
            }
            k = ((String) (obj1)).length();
            if (k >= i)
            {
                ((String) (obj1)).getChars(0, i, buffer, size);
            } else
            {
                ((String) (obj1)).getChars(0, k, buffer, size);
                int j = 0;
                while (j < i - k) 
                {
                    buffer[size + k + j] = c;
                    j++;
                }
            }
            size = size + i;
        }
        return this;
    }

    public StrBuilder appendNewLine()
    {
        if (newLine == null)
        {
            append(SystemUtils.LINE_SEPARATOR);
            return this;
        } else
        {
            return append(newLine);
        }
    }

    public StrBuilder appendNull()
    {
        if (nullText == null)
        {
            return this;
        } else
        {
            return append(nullText);
        }
    }

    public StrBuilder appendPadding(int i, char c)
    {
        if (i >= 0)
        {
            ensureCapacity(size + i);
            for (int j = 0; j < i; j++)
            {
                char ac[] = buffer;
                int k = size;
                size = k + 1;
                ac[k] = c;
            }

        }
        return this;
    }

    public StrBuilder appendSeparator(char c)
    {
        if (size() > 0)
        {
            append(c);
        }
        return this;
    }

    public StrBuilder appendSeparator(char c, char c1)
    {
        if (size() > 0)
        {
            append(c);
            return this;
        } else
        {
            append(c1);
            return this;
        }
    }

    public StrBuilder appendSeparator(char c, int i)
    {
        if (i > 0)
        {
            append(c);
        }
        return this;
    }

    public StrBuilder appendSeparator(String s)
    {
        return appendSeparator(s, ((String) (null)));
    }

    public StrBuilder appendSeparator(String s, int i)
    {
        if (s != null && i > 0)
        {
            append(s);
        }
        return this;
    }

    public StrBuilder appendSeparator(String s, String s1)
    {
        if (!isEmpty())
        {
            s1 = s;
        }
        if (s1 != null)
        {
            append(s1);
        }
        return this;
    }

    public StrBuilder appendWithSeparators(Iterable iterable, String s)
    {
        if (iterable != null)
        {
            s = ObjectUtils.toString(s);
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                append(iterable.next());
                if (iterable.hasNext())
                {
                    append(s);
                }
            } while (true);
        }
        return this;
    }

    public StrBuilder appendWithSeparators(Iterator iterator, String s)
    {
        if (iterator != null)
        {
            s = ObjectUtils.toString(s);
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                append(iterator.next());
                if (iterator.hasNext())
                {
                    append(s);
                }
            } while (true);
        }
        return this;
    }

    public StrBuilder appendWithSeparators(Object aobj[], String s)
    {
        if (aobj != null && aobj.length > 0)
        {
            s = ObjectUtils.toString(s);
            append(aobj[0]);
            for (int i = 1; i < aobj.length; i++)
            {
                append(s);
                append(aobj[i]);
            }

        }
        return this;
    }

    public StrBuilder appendln(char c)
    {
        return append(c).appendNewLine();
    }

    public StrBuilder appendln(double d)
    {
        return append(d).appendNewLine();
    }

    public StrBuilder appendln(float f)
    {
        return append(f).appendNewLine();
    }

    public StrBuilder appendln(int i)
    {
        return append(i).appendNewLine();
    }

    public StrBuilder appendln(long l)
    {
        return append(l).appendNewLine();
    }

    public StrBuilder appendln(Object obj)
    {
        return append(obj).appendNewLine();
    }

    public StrBuilder appendln(String s)
    {
        return append(s).appendNewLine();
    }

    public StrBuilder appendln(String s, int i, int j)
    {
        return append(s, i, j).appendNewLine();
    }

    public StrBuilder appendln(StringBuffer stringbuffer)
    {
        return append(stringbuffer).appendNewLine();
    }

    public StrBuilder appendln(StringBuffer stringbuffer, int i, int j)
    {
        return append(stringbuffer, i, j).appendNewLine();
    }

    public StrBuilder appendln(StrBuilder strbuilder)
    {
        return append(strbuilder).appendNewLine();
    }

    public StrBuilder appendln(StrBuilder strbuilder, int i, int j)
    {
        return append(strbuilder, i, j).appendNewLine();
    }

    public StrBuilder appendln(boolean flag)
    {
        return append(flag).appendNewLine();
    }

    public StrBuilder appendln(char ac[])
    {
        return append(ac).appendNewLine();
    }

    public StrBuilder appendln(char ac[], int i, int j)
    {
        return append(ac, i, j).appendNewLine();
    }

    public Reader asReader()
    {
        return new StrBuilderReader();
    }

    public StrTokenizer asTokenizer()
    {
        return new StrBuilderTokenizer();
    }

    public Writer asWriter()
    {
        return new StrBuilderWriter();
    }

    public int capacity()
    {
        return buffer.length;
    }

    public char charAt(int i)
    {
        if (i < 0 || i >= length())
        {
            throw new StringIndexOutOfBoundsException(i);
        } else
        {
            return buffer[i];
        }
    }

    public StrBuilder clear()
    {
        size = 0;
        return this;
    }

    public boolean contains(char c)
    {
        char ac[] = buffer;
        for (int i = 0; i < size; i++)
        {
            if (ac[i] == c)
            {
                return true;
            }
        }

        return false;
    }

    public boolean contains(String s)
    {
        boolean flag = false;
        if (indexOf(s, 0) >= 0)
        {
            flag = true;
        }
        return flag;
    }

    public boolean contains(StrMatcher strmatcher)
    {
        boolean flag = false;
        if (indexOf(strmatcher, 0) >= 0)
        {
            flag = true;
        }
        return flag;
    }

    public StrBuilder delete(int i, int j)
    {
        j = validateRange(i, j);
        int k = j - i;
        if (k > 0)
        {
            deleteImpl(i, j, k);
        }
        return this;
    }

    public StrBuilder deleteAll(char c)
    {
        int j;
        for (int i = 0; i < size; i = j + 1)
        {
            j = i;
            if (buffer[i] != c)
            {
                continue;
            }
            j = i;
            int k;
            do
            {
                k = j + 1;
                if (k >= size)
                {
                    break;
                }
                j = k;
            } while (buffer[k] == c);
            j = k - i;
            deleteImpl(i, k, j);
            j = k - j;
        }

        return this;
    }

    public StrBuilder deleteAll(String s)
    {
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        if (i > 0)
        {
            for (int j = indexOf(s, 0); j >= 0; j = indexOf(s, j))
            {
                deleteImpl(j, j + i, i);
            }

        }
        return this;
    }

    public StrBuilder deleteAll(StrMatcher strmatcher)
    {
        return replace(strmatcher, null, 0, size, -1);
    }

    public StrBuilder deleteCharAt(int i)
    {
        if (i < 0 || i >= size)
        {
            throw new StringIndexOutOfBoundsException(i);
        } else
        {
            deleteImpl(i, i + 1, 1);
            return this;
        }
    }

    public StrBuilder deleteFirst(char c)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < size)
                {
                    if (buffer[i] != c)
                    {
                        break label0;
                    }
                    deleteImpl(i, i + 1, 1);
                }
                return this;
            }
            i++;
        } while (true);
    }

    public StrBuilder deleteFirst(String s)
    {
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        if (i > 0)
        {
            int j = indexOf(s, 0);
            if (j >= 0)
            {
                deleteImpl(j, j + i, i);
            }
        }
        return this;
    }

    public StrBuilder deleteFirst(StrMatcher strmatcher)
    {
        return replace(strmatcher, null, 0, size, 1);
    }

    public boolean endsWith(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = s.length();
        if (k == 0)
        {
            return true;
        }
        if (k <= size)
        {
            int i = size - k;
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= k)
                    {
                        break label1;
                    }
                    if (buffer[i] != s.charAt(j))
                    {
                        break label0;
                    }
                    j++;
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public StrBuilder ensureCapacity(int i)
    {
        if (i > buffer.length)
        {
            char ac[] = buffer;
            buffer = new char[i * 2];
            System.arraycopy(ac, 0, buffer, 0, size);
        }
        return this;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof StrBuilder)
        {
            return equals((StrBuilder)obj);
        } else
        {
            return false;
        }
    }

    public boolean equals(StrBuilder strbuilder)
    {
        if (this != strbuilder)
        {
            if (size != strbuilder.size)
            {
                return false;
            }
            char ac[] = buffer;
            strbuilder = strbuilder.buffer;
            int i = size - 1;
            while (i >= 0) 
            {
                if (ac[i] != strbuilder[i])
                {
                    return false;
                }
                i--;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(StrBuilder strbuilder)
    {
        if (this != strbuilder)
        {
            if (size != strbuilder.size)
            {
                return false;
            }
            char ac[] = buffer;
            strbuilder = strbuilder.buffer;
            int i = size - 1;
            while (i >= 0) 
            {
                char c = ac[i];
                char c1 = strbuilder[i];
                if (c != c1 && Character.toUpperCase(c) != Character.toUpperCase(c1))
                {
                    return false;
                }
                i--;
            }
        }
        return true;
    }

    public void getChars(int i, int j, char ac[], int k)
    {
        if (i < 0)
        {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (j < 0 || j > length())
        {
            throw new StringIndexOutOfBoundsException(j);
        }
        if (i > j)
        {
            throw new StringIndexOutOfBoundsException("end < start");
        } else
        {
            System.arraycopy(buffer, i, ac, k, j - i);
            return;
        }
    }

    public char[] getChars(char ac[])
    {
        char ac1[];
        int i;
label0:
        {
            i = length();
            if (ac != null)
            {
                ac1 = ac;
                if (ac.length >= i)
                {
                    break label0;
                }
            }
            ac1 = new char[i];
        }
        System.arraycopy(buffer, 0, ac1, 0, i);
        return ac1;
    }

    public String getNewLineText()
    {
        return newLine;
    }

    public String getNullText()
    {
        return nullText;
    }

    public int hashCode()
    {
        char ac[] = buffer;
        int j = 0;
        for (int i = size - 1; i >= 0; i--)
        {
            j = j * 31 + ac[i];
        }

        return j;
    }

    public int indexOf(char c)
    {
        return indexOf(c, 0);
    }

    public int indexOf(char c, int i)
    {
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (j < size) goto _L2; else goto _L1
_L1:
        j = -1;
_L4:
        return j;
_L2:
        char ac[] = buffer;
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= size)
                {
                    break label1;
                }
                j = i;
                if (ac[i] == c)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public int indexOf(String s)
    {
        return indexOf(s, 0);
    }

    public int indexOf(String s, int i)
    {
        int j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (s == null || j >= size)
        {
            i = -1;
        } else
        {
            int l = s.length();
            if (l == 1)
            {
                return indexOf(s.charAt(0), j);
            }
            i = j;
            if (l != 0)
            {
                if (l > size)
                {
                    return -1;
                }
                char ac[] = buffer;
                int i1 = size;
                i = j;
label0:
                do
                {
                    if (i < (i1 - l) + 1)
                    {
                        int k = 0;
                        do
                        {
                            if (k >= l)
                            {
                                break;
                            }
                            if (s.charAt(k) != ac[i + k])
                            {
                                i++;
                                continue label0;
                            }
                            k++;
                        } while (true);
                        return i;
                    }
                    return -1;
                } while (true);
            }
        }
        return i;
    }

    public int indexOf(StrMatcher strmatcher)
    {
        return indexOf(strmatcher, 0);
    }

    public int indexOf(StrMatcher strmatcher, int i)
    {
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (strmatcher != null && j < size) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int l = size;
        char ac[] = buffer;
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= l)
                {
                    break label1;
                }
                k = i;
                if (strmatcher.isMatch(ac, i, j, l) > 0)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public StrBuilder insert(int i, char c)
    {
        validateIndex(i);
        ensureCapacity(size + 1);
        System.arraycopy(buffer, i, buffer, i + 1, size - i);
        buffer[i] = c;
        size = size + 1;
        return this;
    }

    public StrBuilder insert(int i, double d)
    {
        return insert(i, String.valueOf(d));
    }

    public StrBuilder insert(int i, float f)
    {
        return insert(i, String.valueOf(f));
    }

    public StrBuilder insert(int i, int j)
    {
        return insert(i, String.valueOf(j));
    }

    public StrBuilder insert(int i, long l)
    {
        return insert(i, String.valueOf(l));
    }

    public StrBuilder insert(int i, Object obj)
    {
        if (obj == null)
        {
            return insert(i, nullText);
        } else
        {
            return insert(i, obj.toString());
        }
    }

    public StrBuilder insert(int i, String s)
    {
        validateIndex(i);
        String s1 = s;
        if (s == null)
        {
            s1 = nullText;
        }
        int j;
        if (s1 == null)
        {
            j = 0;
        } else
        {
            j = s1.length();
        }
        if (j > 0)
        {
            int k = size + j;
            ensureCapacity(k);
            System.arraycopy(buffer, i, buffer, i + j, size - i);
            size = k;
            s1.getChars(0, j, buffer, i);
        }
        return this;
    }

    public StrBuilder insert(int i, boolean flag)
    {
        validateIndex(i);
        if (flag)
        {
            ensureCapacity(size + 4);
            System.arraycopy(buffer, i, buffer, i + 4, size - i);
            char ac[] = buffer;
            int j = i + 1;
            ac[i] = 't';
            ac = buffer;
            i = j + 1;
            ac[j] = 'r';
            buffer[i] = 'u';
            buffer[i + 1] = 'e';
            size = size + 4;
            return this;
        } else
        {
            ensureCapacity(size + 5);
            System.arraycopy(buffer, i, buffer, i + 5, size - i);
            char ac1[] = buffer;
            int k = i + 1;
            ac1[i] = 'f';
            ac1 = buffer;
            i = k + 1;
            ac1[k] = 'a';
            ac1 = buffer;
            k = i + 1;
            ac1[i] = 'l';
            buffer[k] = 's';
            buffer[k + 1] = 'e';
            size = size + 5;
            return this;
        }
    }

    public StrBuilder insert(int i, char ac[])
    {
        validateIndex(i);
        StrBuilder strbuilder;
        if (ac == null)
        {
            strbuilder = insert(i, nullText);
        } else
        {
            int j = ac.length;
            strbuilder = this;
            if (j > 0)
            {
                ensureCapacity(size + j);
                System.arraycopy(buffer, i, buffer, i + j, size - i);
                System.arraycopy(ac, 0, buffer, i, j);
                size = size + j;
                return this;
            }
        }
        return strbuilder;
    }

    public StrBuilder insert(int i, char ac[], int j, int k)
    {
        validateIndex(i);
        StrBuilder strbuilder;
        if (ac == null)
        {
            strbuilder = insert(i, nullText);
        } else
        {
            if (j < 0 || j > ac.length)
            {
                throw new StringIndexOutOfBoundsException((new StringBuilder()).append("Invalid offset: ").append(j).toString());
            }
            if (k < 0 || j + k > ac.length)
            {
                throw new StringIndexOutOfBoundsException((new StringBuilder()).append("Invalid length: ").append(k).toString());
            }
            strbuilder = this;
            if (k > 0)
            {
                ensureCapacity(size + k);
                System.arraycopy(buffer, i, buffer, i + k, size - i);
                System.arraycopy(ac, j, buffer, i, k);
                size = size + k;
                return this;
            }
        }
        return strbuilder;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int lastIndexOf(char c)
    {
        return lastIndexOf(c, size - 1);
    }

    public int lastIndexOf(char c, int i)
    {
        int j;
        j = i;
        if (i >= size)
        {
            j = size - 1;
        }
        if (j >= 0) goto _L2; else goto _L1
_L1:
        j = -1;
_L4:
        return j;
_L2:
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (buffer[i] == c)
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public int lastIndexOf(String s)
    {
        return lastIndexOf(s, size - 1);
    }

    public int lastIndexOf(String s, int i)
    {
        int j;
        j = i;
        if (i >= size)
        {
            j = size - 1;
        }
        if (s != null && j >= 0) goto _L2; else goto _L1
_L1:
        j = -1;
_L6:
        return j;
_L2:
        int l = s.length();
        if (l <= 0 || l > size) goto _L4; else goto _L3
_L3:
        if (l == 1)
        {
            return lastIndexOf(s.charAt(0), j);
        }
        i = (j - l) + 1;
_L7:
        int k;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        k = 0;
_L8:
        j = i;
        if (k >= l) goto _L6; else goto _L5
_L5:
label0:
        {
            if (s.charAt(k) == buffer[i + k])
            {
                break label0;
            }
            i--;
        }
          goto _L7
        k++;
          goto _L8
_L4:
        if (l == 0)
        {
            return j;
        }
        return -1;
          goto _L7
    }

    public int lastIndexOf(StrMatcher strmatcher)
    {
        return lastIndexOf(strmatcher, size);
    }

    public int lastIndexOf(StrMatcher strmatcher, int i)
    {
        int j;
        j = i;
        if (i >= size)
        {
            j = size - 1;
        }
        if (strmatcher != null && j >= 0) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        char ac[] = buffer;
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                k = i;
                if (strmatcher.isMatch(ac, i, 0, j + 1) > 0)
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public String leftString(int i)
    {
        if (i <= 0)
        {
            return "";
        }
        if (i >= size)
        {
            return new String(buffer, 0, size);
        } else
        {
            return new String(buffer, 0, i);
        }
    }

    public int length()
    {
        return size;
    }

    public String midString(int i, int j)
    {
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        if (j <= 0 || k >= size)
        {
            return "";
        }
        if (size <= k + j)
        {
            return new String(buffer, k, size - k);
        } else
        {
            return new String(buffer, k, j);
        }
    }

    public StrBuilder minimizeCapacity()
    {
        if (buffer.length > length())
        {
            char ac[] = buffer;
            buffer = new char[length()];
            System.arraycopy(ac, 0, buffer, 0, size);
        }
        return this;
    }

    public StrBuilder replace(int i, int j, String s)
    {
        int k = validateRange(i, j);
        if (s == null)
        {
            j = 0;
        } else
        {
            j = s.length();
        }
        replaceImpl(i, k, k - i, s, j);
        return this;
    }

    public StrBuilder replace(StrMatcher strmatcher, String s, int i, int j, int k)
    {
        return replaceImpl(strmatcher, s, i, validateRange(i, j), k);
    }

    public StrBuilder replaceAll(char c, char c1)
    {
        if (c != c1)
        {
            for (int i = 0; i < size; i++)
            {
                if (buffer[i] == c)
                {
                    buffer[i] = c1;
                }
            }

        }
        return this;
    }

    public StrBuilder replaceAll(String s, String s1)
    {
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        if (i > 0)
        {
            int j;
            int k;
            if (s1 == null)
            {
                j = 0;
            } else
            {
                j = s1.length();
            }
            for (k = indexOf(s, 0); k >= 0; k = indexOf(s, k + j))
            {
                replaceImpl(k, k + i, i, s1, j);
            }

        }
        return this;
    }

    public StrBuilder replaceAll(StrMatcher strmatcher, String s)
    {
        return replace(strmatcher, s, 0, size, -1);
    }

    public StrBuilder replaceFirst(char c, char c1)
    {
        if (c == c1) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i >= size) goto _L2; else goto _L3
_L3:
        if (buffer[i] != c) goto _L5; else goto _L4
_L4:
        buffer[i] = c1;
_L2:
        return this;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public StrBuilder replaceFirst(String s, String s1)
    {
        int j = 0;
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        if (i > 0)
        {
            int k = indexOf(s, 0);
            if (k >= 0)
            {
                if (s1 != null)
                {
                    j = s1.length();
                }
                replaceImpl(k, k + i, i, s1, j);
            }
        }
        return this;
    }

    public StrBuilder replaceFirst(StrMatcher strmatcher, String s)
    {
        return replace(strmatcher, s, 0, size, 1);
    }

    public StrBuilder reverse()
    {
        if (size != 0)
        {
            int k = size / 2;
            char ac[] = buffer;
            int j = 0;
            int i = size - 1;
            while (j < k) 
            {
                char c = ac[j];
                ac[j] = ac[i];
                ac[i] = c;
                j++;
                i--;
            }
        }
        return this;
    }

    public String rightString(int i)
    {
        if (i <= 0)
        {
            return "";
        }
        if (i >= size)
        {
            return new String(buffer, 0, size);
        } else
        {
            return new String(buffer, size - i, i);
        }
    }

    public StrBuilder setCharAt(int i, char c)
    {
        if (i < 0 || i >= length())
        {
            throw new StringIndexOutOfBoundsException(i);
        } else
        {
            buffer[i] = c;
            return this;
        }
    }

    public StrBuilder setLength(int i)
    {
        if (i < 0)
        {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i >= size) goto _L2; else goto _L1
_L1:
        size = i;
_L4:
        return this;
_L2:
        if (i > size)
        {
            ensureCapacity(i);
            int j = size;
            size = i;
            while (j < i) 
            {
                buffer[j] = '\0';
                j++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public StrBuilder setNewLineText(String s)
    {
        newLine = s;
        return this;
    }

    public StrBuilder setNullText(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.length() == 0)
            {
                s1 = null;
            }
        }
        nullText = s1;
        return this;
    }

    public int size()
    {
        return size;
    }

    public boolean startsWith(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = s.length();
        if (j == 0)
        {
            return true;
        }
        if (j <= size)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (buffer[i] != s.charAt(i))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public CharSequence subSequence(int i, int j)
    {
        if (i < 0)
        {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (j > size)
        {
            throw new StringIndexOutOfBoundsException(j);
        }
        if (i > j)
        {
            throw new StringIndexOutOfBoundsException(j - i);
        } else
        {
            return substring(i, j);
        }
    }

    public String substring(int i)
    {
        return substring(i, size);
    }

    public String substring(int i, int j)
    {
        j = validateRange(i, j);
        return new String(buffer, i, j - i);
    }

    public char[] toCharArray()
    {
        if (size == 0)
        {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        } else
        {
            char ac[] = new char[size];
            System.arraycopy(buffer, 0, ac, 0, size);
            return ac;
        }
    }

    public char[] toCharArray(int i, int j)
    {
        j = validateRange(i, j) - i;
        if (j == 0)
        {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        } else
        {
            char ac[] = new char[j];
            System.arraycopy(buffer, i, ac, 0, j);
            return ac;
        }
    }

    public String toString()
    {
        return new String(buffer, 0, size);
    }

    public StringBuffer toStringBuffer()
    {
        return (new StringBuffer(size)).append(buffer, 0, size);
    }

    public StrBuilder trim()
    {
        if (size != 0)
        {
            int k = size;
            char ac[] = buffer;
            int i = 0;
            int j;
            do
            {
                j = k;
                if (i >= k)
                {
                    break;
                }
                j = k;
                if (ac[i] > ' ')
                {
                    break;
                }
                i++;
            } while (true);
            for (; i < j && ac[j - 1] <= ' '; j--) { }
            if (j < size)
            {
                delete(j, size);
            }
            if (i > 0)
            {
                delete(0, i);
                return this;
            }
        }
        return this;
    }

    protected void validateIndex(int i)
    {
        if (i < 0 || i > size)
        {
            throw new StringIndexOutOfBoundsException(i);
        } else
        {
            return;
        }
    }

    protected int validateRange(int i, int j)
    {
        if (i < 0)
        {
            throw new StringIndexOutOfBoundsException(i);
        }
        int k = j;
        if (j > size)
        {
            k = size;
        }
        if (i > k)
        {
            throw new StringIndexOutOfBoundsException("end < start");
        } else
        {
            return k;
        }
    }
}
