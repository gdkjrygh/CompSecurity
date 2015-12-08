// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.snapshots;

import com.google.android.gms.games.snapshot.SnapshotMetadata;

public interface SnapshotEventListener
{

    public abstract void onNewSnapshotClicked();

    public abstract void onSnapshotClicked(SnapshotMetadata snapshotmetadata);

    public abstract void onSnapshotDeleted(SnapshotMetadata snapshotmetadata);
}
