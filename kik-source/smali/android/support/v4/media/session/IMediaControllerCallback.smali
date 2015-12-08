.class public interface abstract Landroid/support/v4/media/session/IMediaControllerCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/IMediaControllerCallback$Stub;
    }
.end annotation


# virtual methods
.method public abstract onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onExtrasChanged(Landroid/os/Bundle;)V
.end method

.method public abstract onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V
.end method

.method public abstract onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V
.end method

.method public abstract onQueueChanged(Ljava/util/List;)V
.end method

.method public abstract onQueueTitleChanged(Ljava/lang/CharSequence;)V
.end method

.method public abstract onSessionDestroyed()V
.end method

.method public abstract onVolumeInfoChanged(Landroid/support/v4/media/session/ParcelableVolumeInfo;)V
.end method
