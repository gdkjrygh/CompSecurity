// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.IOException;
import java.io.InputStream;
import retrofit.mime.TypedInput;

class ExceptionCatchingTypedInput
    implements TypedInput
{

    private final TypedInput _flddelegate;
    private final ExceptionCatchingInputStream delegateStream;

    ExceptionCatchingTypedInput(TypedInput typedinput)
    {
        _flddelegate = typedinput;
        delegateStream = new ExceptionCatchingInputStream(typedinput.in());
    }

    IOException getThrownException()
    {
        return delegateStream.thrownException;
    }

    public InputStream in()
    {
        return delegateStream;
    }

    public long length()
    {
        return _flddelegate.length();
    }

    public String mimeType()
    {
        return _flddelegate.mimeType();
    }

    boolean threwException()
    {
        return delegateStream.thrownException != null;
    }

    private class ExceptionCatchingInputStream extends InputStream
    {

        private final InputStream _flddelegate;
        private IOException thrownException;

        public int available()
        {
            int i;
            try
            {
                i = _flddelegate.available();
            }
            catch (IOException ioexception)
            {
                thrownException = ioexception;
                throw ioexception;
            }
            return i;
        }

        public void close()
        {
            try
            {
                _flddelegate.close();
                return;
            }
            catch (IOException ioexception)
            {
                thrownException = ioexception;
                throw ioexception;
            }
        }

        public void mark(int i)
        {
            this;
            JVM INSTR monitorenter ;
            _flddelegate.mark(i);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public boolean markSupported()
        {
            return _flddelegate.markSupported();
        }

        public int read()
        {
            int i;
            try
            {
                i = _flddelegate.read();
            }
            catch (IOException ioexception)
            {
                thrownException = ioexception;
                throw ioexception;
            }
            return i;
        }

        public int read(byte abyte0[])
        {
            int i;
            try
            {
                i = _flddelegate.read(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                thrownException = abyte0;
                throw abyte0;
            }
            return i;
        }

        public int read(byte abyte0[], int i, int j)
        {
            try
            {
                i = _flddelegate.read(abyte0, i, j);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                thrownException = abyte0;
                throw abyte0;
            }
            return i;
        }

        public void reset()
        {
            this;
            JVM INSTR monitorenter ;
            _flddelegate.reset();
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            thrownException = ((IOException) (obj));
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public long skip(long l)
        {
            try
            {
                l = _flddelegate.skip(l);
            }
            catch (IOException ioexception)
            {
                thrownException = ioexception;
                throw ioexception;
            }
            return l;
        }


        ExceptionCatchingInputStream(InputStream inputstream)
        {
            _flddelegate = inputstream;
        }
    }

}
