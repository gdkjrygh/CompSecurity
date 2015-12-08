// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.crypto.cipher;

import com.facebook.crypto.util.Assertions;
import com.facebook.crypto.util.NativeCryptoLibrary;

// Referenced classes of package com.facebook.crypto.cipher:
//            NativeCBCCipherException

public class NativeCBCCipher
{
    static final class STATE extends Enum
    {

        private static final STATE $VALUES[];
        public static final STATE FINALIZED;
        public static final STATE INITIALIZED;
        public static final STATE UNINITIALIZED;

        public static STATE valueOf(String s)
        {
            return (STATE)Enum.valueOf(com/facebook/crypto/cipher/NativeCBCCipher$STATE, s);
        }

        public static STATE[] values()
        {
            return (STATE[])$VALUES.clone();
        }

        static 
        {
            UNINITIALIZED = new STATE("UNINITIALIZED", 0);
            INITIALIZED = new STATE("INITIALIZED", 1);
            FINALIZED = new STATE("FINALIZED", 2);
            $VALUES = (new STATE[] {
                UNINITIALIZED, INITIALIZED, FINALIZED
            });
        }

        private STATE(String s, int i)
        {
            super(s, i);
        }
    }


    private int mCtxPtr;
    private STATE mCurrentState;
    private final NativeCryptoLibrary mNativeCryptoLibrary;

    public NativeCBCCipher(NativeCryptoLibrary nativecryptolibrary)
    {
        mCurrentState = STATE.UNINITIALIZED;
        mNativeCryptoLibrary = nativecryptolibrary;
    }

    private void ensureInFinalizedState()
    {
        boolean flag;
        if (mCurrentState == STATE.FINALIZED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag, "Cipher has not been finalized");
    }

    private void ensureInInitalizedState()
    {
        boolean flag;
        if (mCurrentState == STATE.INITIALIZED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag, "Cipher has not been initialized");
    }

    private transient String formatStrLocaleSafe(String s, Object aobj[])
    {
        return String.format(null, s, aobj);
    }

    private native int nativeDecryptInit(byte abyte0[], byte abyte1[]);

    private native int nativeDestroy();

    private native int nativeEncryptInit(byte abyte0[], byte abyte1[]);

    private static native int nativeFailure();

    private native int nativeFinal(byte abyte0[]);

    private native int nativeGetCipherBlockSize();

    private native int nativeUpdate(byte abyte0[], int i, int j, byte abyte1[]);

    public void decryptInit(byte abyte0[], byte abyte1[])
    {
        boolean flag;
        if (mCurrentState == STATE.UNINITIALIZED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag, "Cipher has already been initialized");
        mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeDecryptInit(abyte0, abyte1) == nativeFailure())
        {
            throw new NativeCBCCipherException("decryptInit");
        } else
        {
            mCurrentState = STATE.INITIALIZED;
            return;
        }
    }

    public void destroy()
    {
        ensureInFinalizedState();
        if (nativeDestroy() == nativeFailure())
        {
            throw new NativeCBCCipherException("destroy");
        } else
        {
            mCurrentState = STATE.UNINITIALIZED;
            return;
        }
    }

    public int doFinal(byte abyte0[])
    {
        int i;
        boolean flag;
        if (mCurrentState == STATE.INITIALIZED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag, "Cipher has not been initialized");
        mCurrentState = STATE.FINALIZED;
        i = nativeFinal(abyte0);
        if (i < 0)
        {
            throw new NativeCBCCipherException(formatStrLocaleSafe("doFinal read %d", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            return i;
        }
    }

    public void encryptInit(byte abyte0[], byte abyte1[])
    {
        boolean flag;
        if (mCurrentState == STATE.UNINITIALIZED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkState(flag, "Cipher has already been initialized");
        mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeEncryptInit(abyte0, abyte1) == nativeFailure())
        {
            throw new NativeCBCCipherException("encryptInit");
        } else
        {
            mCurrentState = STATE.INITIALIZED;
            return;
        }
    }

    public int getCipherBlockSize()
    {
        ensureInInitalizedState();
        return nativeGetCipherBlockSize();
    }

    public int update(byte abyte0[], int i, int j, byte abyte1[])
    {
        ensureInInitalizedState();
        int k = nativeUpdate(abyte0, i, j, abyte1);
        if (k < 0)
        {
            throw new NativeCBCCipherException(formatStrLocaleSafe("update: Offset = %d; DataLen = %d; Result = %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            }));
        } else
        {
            return k;
        }
    }
}
