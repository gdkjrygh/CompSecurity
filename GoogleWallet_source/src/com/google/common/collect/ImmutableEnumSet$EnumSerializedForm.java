// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.EnumSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableEnumSet

static final class delegate
    implements Serializable
{

    final EnumSet _flddelegate;

    (EnumSet enumset)
    {
        _flddelegate = enumset;
    }
}
