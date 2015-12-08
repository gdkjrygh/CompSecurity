// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import org.apache.log4j.Logger;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyczarReader;

// Referenced classes of package org.keyczar:
//            Keyczar, StreamCache

public class Verifier extends Keyczar
{

    private static final Logger LOG = Logger.getLogger(org/keyczar/Verifier);
    private final StreamCache VERIFY_CACHE = new StreamCache();

    public Verifier(KeyczarReader keyczarreader)
        throws KeyczarException
    {
        super(keyczarreader);
    }

    boolean isAcceptablePurpose(KeyPurpose keypurpose)
    {
        return keypurpose == KeyPurpose.VERIFY || keypurpose == KeyPurpose.SIGN_AND_VERIFY;
    }

}
