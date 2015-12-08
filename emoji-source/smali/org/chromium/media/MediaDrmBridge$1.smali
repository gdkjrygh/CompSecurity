.class Lorg/chromium/media/MediaDrmBridge$1;
.super Ljava/lang/Object;
.source "MediaDrmBridge.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/media/MediaDrmBridge;->resumePendingOperations()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/media/MediaDrmBridge;


# direct methods
.method constructor <init>(Lorg/chromium/media/MediaDrmBridge;)V
    .locals 0

    .prologue
    .line 460
    iput-object p1, p0, Lorg/chromium/media/MediaDrmBridge$1;->this$0:Lorg/chromium/media/MediaDrmBridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 463
    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$1;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # invokes: Lorg/chromium/media/MediaDrmBridge;->processPendingCreateSessionData()V
    invoke-static {v0}, Lorg/chromium/media/MediaDrmBridge;->access$500(Lorg/chromium/media/MediaDrmBridge;)V

    .line 464
    return-void
.end method
