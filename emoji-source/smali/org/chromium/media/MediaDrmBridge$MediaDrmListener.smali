.class Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;
.super Ljava/lang/Object;
.source "MediaDrmBridge.java"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/MediaDrmBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MediaDrmListener"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic this$0:Lorg/chromium/media/MediaDrmBridge;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 775
    const-class v0, Lorg/chromium/media/MediaDrmBridge;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lorg/chromium/media/MediaDrmBridge;)V
    .locals 0

    .prologue
    .line 775
    iput-object p1, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/media/MediaDrmBridge;Lorg/chromium/media/MediaDrmBridge$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/media/MediaDrmBridge;
    .param p2, "x1"    # Lorg/chromium/media/MediaDrmBridge$1;

    .prologue
    .line 775
    invoke-direct {p0, p1}, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;-><init>(Lorg/chromium/media/MediaDrmBridge;)V

    return-void
.end method


# virtual methods
.method public onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 8
    .param p1, "mediaDrm"    # Landroid/media/MediaDrm;
    .param p2, "sessionArray"    # [B
    .param p3, "event"    # I
    .param p4, "extra"    # I
    .param p5, "data"    # [B

    .prologue
    .line 779
    if-nez p2, :cond_1

    .line 780
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrmListener: Null session."

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 829
    :cond_0
    :goto_0
    return-void

    .line 783
    :cond_1
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 784
    .local v3, "session":Ljava/nio/ByteBuffer;
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # invokes: Lorg/chromium/media/MediaDrmBridge;->sessionExists(Ljava/nio/ByteBuffer;)Z
    invoke-static {v5, v3}, Lorg/chromium/media/MediaDrmBridge;->access$1200(Lorg/chromium/media/MediaDrmBridge;Ljava/nio/ByteBuffer;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 785
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrmListener: Invalid session."

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 788
    :cond_2
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # getter for: Lorg/chromium/media/MediaDrmBridge;->mSessionIds:Ljava/util/HashMap;
    invoke-static {v5}, Lorg/chromium/media/MediaDrmBridge;->access$1300(Lorg/chromium/media/MediaDrmBridge;)Ljava/util/HashMap;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 789
    .local v4, "sessionId":Ljava/lang/Integer;
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-nez v5, :cond_4

    .line 790
    :cond_3
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrmListener: Invalid session ID."

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 793
    :cond_4
    packed-switch p3, :pswitch_data_0

    .line 826
    const-string v5, "MediaDrmBridge"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid DRM event "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 795
    :pswitch_0
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrm.EVENT_PROVISION_REQUIRED"

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 798
    :pswitch_1
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrm.EVENT_KEY_REQUIRED"

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 799
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # getter for: Lorg/chromium/media/MediaDrmBridge;->mProvisioningPending:Z
    invoke-static {v5}, Lorg/chromium/media/MediaDrmBridge;->access$1400(Lorg/chromium/media/MediaDrmBridge;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 802
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # getter for: Lorg/chromium/media/MediaDrmBridge;->mSessionMimeTypes:Ljava/util/HashMap;
    invoke-static {v5}, Lorg/chromium/media/MediaDrmBridge;->access$1500(Lorg/chromium/media/MediaDrmBridge;)Ljava/util/HashMap;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 803
    .local v1, "mime":Ljava/lang/String;
    const/4 v2, 0x0

    .line 805
    .local v2, "request":Landroid/media/MediaDrm$KeyRequest;
    :try_start_0
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # invokes: Lorg/chromium/media/MediaDrmBridge;->getKeyRequest(Ljava/nio/ByteBuffer;[BLjava/lang/String;)Landroid/media/MediaDrm$KeyRequest;
    invoke-static {v5, v3, p5, v1}, Lorg/chromium/media/MediaDrmBridge;->access$1600(Lorg/chromium/media/MediaDrmBridge;Ljava/nio/ByteBuffer;[BLjava/lang/String;)Landroid/media/MediaDrm$KeyRequest;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 811
    if-eqz v2, :cond_5

    .line 812
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    # invokes: Lorg/chromium/media/MediaDrmBridge;->onSessionMessage(ILandroid/media/MediaDrm$KeyRequest;)V
    invoke-static {v5, v6, v2}, Lorg/chromium/media/MediaDrmBridge;->access$1800(Lorg/chromium/media/MediaDrmBridge;ILandroid/media/MediaDrm$KeyRequest;)V

    goto/16 :goto_0

    .line 806
    :catch_0
    move-exception v0

    .line 807
    .local v0, "e":Landroid/media/NotProvisionedException;
    const-string v5, "MediaDrmBridge"

    const-string v6, "Device not provisioned"

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 808
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    # invokes: Lorg/chromium/media/MediaDrmBridge;->startProvisioning()V
    invoke-static {v5}, Lorg/chromium/media/MediaDrmBridge;->access$1700(Lorg/chromium/media/MediaDrmBridge;)V

    goto/16 :goto_0

    .line 814
    .end local v0    # "e":Landroid/media/NotProvisionedException;
    :cond_5
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    # invokes: Lorg/chromium/media/MediaDrmBridge;->onSessionError(I)V
    invoke-static {v5, v6}, Lorg/chromium/media/MediaDrmBridge;->access$1900(Lorg/chromium/media/MediaDrmBridge;I)V

    goto/16 :goto_0

    .line 818
    .end local v1    # "mime":Ljava/lang/String;
    .end local v2    # "request":Landroid/media/MediaDrm$KeyRequest;
    :pswitch_2
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrm.EVENT_KEY_EXPIRED"

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 819
    iget-object v5, p0, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->this$0:Lorg/chromium/media/MediaDrmBridge;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    # invokes: Lorg/chromium/media/MediaDrmBridge;->onSessionError(I)V
    invoke-static {v5, v6}, Lorg/chromium/media/MediaDrmBridge;->access$1900(Lorg/chromium/media/MediaDrmBridge;I)V

    goto/16 :goto_0

    .line 822
    :pswitch_3
    const-string v5, "MediaDrmBridge"

    const-string v6, "MediaDrm.EVENT_VENDOR_DEFINED"

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 823
    sget-boolean v5, Lorg/chromium/media/MediaDrmBridge$MediaDrmListener;->$assertionsDisabled:Z

    if-nez v5, :cond_0

    new-instance v5, Ljava/lang/AssertionError;

    invoke-direct {v5}, Ljava/lang/AssertionError;-><init>()V

    throw v5

    .line 793
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
