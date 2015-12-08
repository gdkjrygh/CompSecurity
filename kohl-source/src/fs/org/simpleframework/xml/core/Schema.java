// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Version;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Caller, Creator, Section, Label

interface Schema
{

    public abstract Caller getCaller();

    public abstract Creator getCreator();

    public abstract Version getRevision();

    public abstract Section getSection();

    public abstract Label getVersion();

    public abstract boolean isPrimitive();
}
