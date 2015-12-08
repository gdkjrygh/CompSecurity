.class Landroid/support/v4/media/session/MediaSessionCompatApi18$OnPlaybackPositionUpdateListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/RemoteControlClient$OnPlaybackPositionUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompatApi18;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OnPlaybackPositionUpdateListener"
.end annotation


# instance fields
.field protected final mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi14$Callback;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/MediaSessionCompatApi14$Callback;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompatApi18$OnPlaybackPositionUpdateListener;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi14$Callback;

    .line 86
    return-void
.end method


# virtual methods
.method public onPlaybackPositionUpdate(J)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompatApi18$OnPlaybackPositionUpdateListener;->mCallback:Landroid/support/v4/media/session/MediaSessionCompatApi14$Callback;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/media/session/MediaSessionCompatApi14$Callback;->onSeekTo(J)V

    .line 91
    return-void
.end method
