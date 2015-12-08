// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            DataFormatReaders

protected class this._cls0 extends com.fasterxml.jackson.core.format.er
{

    final DataFormatReaders this$0;

    public this._cls0 createMatcher(ObjectReader objectreader, MatchStrength matchstrength)
    {
        return new this._cls0(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, objectreader, matchstrength);
    }

    public (InputStream inputstream, byte abyte0[])
    {
        this$0 = DataFormatReaders.this;
        super(inputstream, abyte0);
    }
}
