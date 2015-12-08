.class Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;
.super Landroid/os/Handler;
.source "XWalkContentsClientCallbackHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;Landroid/os/Looper;)V
    .locals 0
    .param p2, "x0"    # Landroid/os/Looper;

    .prologue
    .line 78
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 81
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 115
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "XWalkContentsClientCallbackHelper: unhandled message "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 83
    :pswitch_0
    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .line 84
    .local v8, "url":Ljava/lang/String;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;)Lorg/xwalk/core/internal/XWalkContentsClient;

    move-result-object v1

    invoke-virtual {v1, v8}, Lorg/xwalk/core/internal/XWalkContentsClient;->onLoadResource(Ljava/lang/String;)V

    .line 118
    .end local v8    # "url":Ljava/lang/String;
    :goto_0
    return-void

    .line 88
    :pswitch_1
    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .line 89
    .restart local v8    # "url":Ljava/lang/String;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;)Lorg/xwalk/core/internal/XWalkContentsClient;

    move-result-object v1

    invoke-virtual {v1, v8}, Lorg/xwalk/core/internal/XWalkContentsClient;->onPageStarted(Ljava/lang/String;)V

    goto :goto_0

    .line 93
    .end local v8    # "url":Ljava/lang/String;
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;

    .line 94
    .local v0, "info":Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;)Lorg/xwalk/core/internal/XWalkContentsClient;

    move-result-object v1

    iget-object v2, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mUrl:Ljava/lang/String;

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mUserAgent:Ljava/lang/String;

    iget-object v4, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mContentDisposition:Ljava/lang/String;

    iget-object v5, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mMimeType:Ljava/lang/String;

    iget-wide v6, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mContentLength:J

    invoke-virtual/range {v1 .. v7}, Lorg/xwalk/core/internal/XWalkContentsClient;->onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    .line 99
    .end local v0    # "info":Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;

    .line 100
    .local v0, "info":Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;)Lorg/xwalk/core/internal/XWalkContentsClient;

    move-result-object v1

    iget-object v2, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;->mRealm:Ljava/lang/String;

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;->mAccount:Ljava/lang/String;

    iget-object v4, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;->mArgs:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lorg/xwalk/core/internal/XWalkContentsClient;->onReceivedLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 104
    .end local v0    # "info":Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$LoginRequestInfo;
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;

    .line 105
    .local v0, "info":Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;)Lorg/xwalk/core/internal/XWalkContentsClient;

    move-result-object v1

    iget v2, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;->mErrorCode:I

    iget-object v3, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;->mDescription:Ljava/lang/String;

    iget-object v4, v0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;->mFailingUrl:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lorg/xwalk/core/internal/XWalkContentsClient;->onReceivedError(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 110
    .end local v0    # "info":Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$OnReceivedErrorInfo;
    :pswitch_5
    iget-object v8, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .line 111
    .restart local v8    # "url":Ljava/lang/String;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$1;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;

    # getter for: Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;
    invoke-static {v1}, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;->access$000(Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;)Lorg/xwalk/core/internal/XWalkContentsClient;

    move-result-object v1

    invoke-virtual {v1, v8}, Lorg/xwalk/core/internal/XWalkContentsClient;->onResourceLoadStarted(Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
