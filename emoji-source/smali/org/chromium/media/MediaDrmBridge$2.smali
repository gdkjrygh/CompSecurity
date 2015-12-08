.class Lorg/chromium/media/MediaDrmBridge$2;
.super Ljava/lang/Object;
.source "MediaDrmBridge.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/media/MediaDrmBridge;->onSessionCreated(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/media/MediaDrmBridge;

.field final synthetic val$sessionId:I

.field final synthetic val$webSessionId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/chromium/media/MediaDrmBridge;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 717
    iput-object p1, p0, Lorg/chromium/media/MediaDrmBridge$2;->this$0:Lorg/chromium/media/MediaDrmBridge;

    iput p2, p0, Lorg/chromium/media/MediaDrmBridge$2;->val$sessionId:I

    iput-object p3, p0, Lorg/chromium/media/MediaDrmBridge$2;->val$webSessionId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 720
    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$2;->this$0:Lorg/chromium/media/MediaDrmBridge;

    iget-object v1, p0, Lorg/chromium/media/MediaDrmBridge$2;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # getter for: Lorg/chromium/media/MediaDrmBridge;->mNativeMediaDrmBridge:J
    invoke-static {v1}, Lorg/chromium/media/MediaDrmBridge;->access$600(Lorg/chromium/media/MediaDrmBridge;)J

    move-result-wide v2

    iget v1, p0, Lorg/chromium/media/MediaDrmBridge$2;->val$sessionId:I

    iget-object v4, p0, Lorg/chromium/media/MediaDrmBridge$2;->val$webSessionId:Ljava/lang/String;

    # invokes: Lorg/chromium/media/MediaDrmBridge;->nativeOnSessionCreated(JILjava/lang/String;)V
    invoke-static {v0, v2, v3, v1, v4}, Lorg/chromium/media/MediaDrmBridge;->access$700(Lorg/chromium/media/MediaDrmBridge;JILjava/lang/String;)V

    .line 721
    return-void
.end method
