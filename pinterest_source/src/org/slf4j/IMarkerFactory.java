// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j;


// Referenced classes of package org.slf4j:
//            Marker

public interface IMarkerFactory
{

    public abstract boolean detachMarker(String s);

    public abstract boolean exists(String s);

    public abstract Marker getDetachedMarker(String s);

    public abstract Marker getMarker(String s);
}
