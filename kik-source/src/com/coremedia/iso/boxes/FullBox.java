// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            Box

public interface FullBox
    extends Box
{

    public abstract int getFlags();

    public abstract int getVersion();

    public abstract void setFlags(int i);

    public abstract void setVersion(int i);
}
