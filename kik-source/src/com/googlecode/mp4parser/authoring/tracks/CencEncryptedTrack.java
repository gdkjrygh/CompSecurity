// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.Track;
import java.util.List;
import java.util.UUID;

public interface CencEncryptedTrack
    extends Track
{

    public abstract UUID getDefaultKeyId();

    public abstract List getSampleEncryptionEntries();

    public abstract boolean hasSubSampleEncryption();
}
