// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso23001.part7;

import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;

public class TrackEncryptionBox extends AbstractTrackEncryptionBox
{

    public static final String TYPE = "tenc";

    public TrackEncryptionBox()
    {
        super("tenc");
    }
}
