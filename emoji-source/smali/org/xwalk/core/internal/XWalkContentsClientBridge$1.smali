.class Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;
.super Landroid/os/Handler;
.source "XWalkContentsClientBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContentsClientBridge;-><init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 101
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 119
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    throw v2

    .line 103
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 104
    .local v0, "newXWalkView":Lorg/xwalk/core/internal/XWalkViewInternal;
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$100(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkViewInternal;

    move-result-object v2

    if-ne v0, v2, :cond_0

    .line 105
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Parent XWalkView cannot host it\'s own popup window"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 108
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->getNavigationHistory()Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;

    move-result-object v2

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkNavigationHistoryInternal;->size()I

    move-result v2

    if-eqz v2, :cond_1

    .line 109
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "New WebView for popup window must not have been previously navigated."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 112
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;
    invoke-static {v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$100(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkViewInternal;

    move-result-object v2

    invoke-virtual {v2, v0}, Lorg/xwalk/core/internal/XWalkViewInternal;->completeWindowCreation(Lorg/xwalk/core/internal/XWalkViewInternal;)V

    .line 121
    .end local v0    # "newXWalkView":Lorg/xwalk/core/internal/XWalkViewInternal;
    :goto_0
    return-void

    .line 115
    :pswitch_1
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 116
    .local v1, "url":Ljava/lang/String;
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    iget-object v3, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->mNativeContentsClientBridge:J
    invoke-static {v3}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$200(Lorg/xwalk/core/internal/XWalkContentsClientBridge;)J

    move-result-wide v4

    # invokes: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->nativeDownloadIcon(JLjava/lang/String;)V
    invoke-static {v2, v4, v5, v1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$300(Lorg/xwalk/core/internal/XWalkContentsClientBridge;JLjava/lang/String;)V

    goto :goto_0

    .line 101
    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
