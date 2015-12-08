.class Lorg/chromium/media/MediaDrmBridge$3;
.super Ljava/lang/Object;
.source "MediaDrmBridge.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/media/MediaDrmBridge;->onSessionMessage(ILandroid/media/MediaDrm$KeyRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/media/MediaDrmBridge;

.field final synthetic val$request:Landroid/media/MediaDrm$KeyRequest;

.field final synthetic val$sessionId:I


# direct methods
.method constructor <init>(Lorg/chromium/media/MediaDrmBridge;ILandroid/media/MediaDrm$KeyRequest;)V
    .locals 0

    .prologue
    .line 726
    iput-object p1, p0, Lorg/chromium/media/MediaDrmBridge$3;->this$0:Lorg/chromium/media/MediaDrmBridge;

    iput p2, p0, Lorg/chromium/media/MediaDrmBridge$3;->val$sessionId:I

    iput-object p3, p0, Lorg/chromium/media/MediaDrmBridge$3;->val$request:Landroid/media/MediaDrm$KeyRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 729
    iget-object v1, p0, Lorg/chromium/media/MediaDrmBridge$3;->this$0:Lorg/chromium/media/MediaDrmBridge;

    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$3;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # getter for: Lorg/chromium/media/MediaDrmBridge;->mNativeMediaDrmBridge:J
    invoke-static {v0}, Lorg/chromium/media/MediaDrmBridge;->access$600(Lorg/chromium/media/MediaDrmBridge;)J

    move-result-wide v2

    iget v4, p0, Lorg/chromium/media/MediaDrmBridge$3;->val$sessionId:I

    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$3;->val$request:Landroid/media/MediaDrm$KeyRequest;

    invoke-virtual {v0}, Landroid/media/MediaDrm$KeyRequest;->getData()[B

    move-result-object v5

    iget-object v0, p0, Lorg/chromium/media/MediaDrmBridge$3;->val$request:Landroid/media/MediaDrm$KeyRequest;

    invoke-virtual {v0}, Landroid/media/MediaDrm$KeyRequest;->getDefaultUrl()Ljava/lang/String;

    move-result-object v6

    # invokes: Lorg/chromium/media/MediaDrmBridge;->nativeOnSessionMessage(JI[BLjava/lang/String;)V
    invoke-static/range {v1 .. v6}, Lorg/chromium/media/MediaDrmBridge;->access$800(Lorg/chromium/media/MediaDrmBridge;JI[BLjava/lang/String;)V

    .line 731
    return-void
.end method
