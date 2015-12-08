.class Lcom/EnterpriseMobileBanking/Utils/WebViewHelper$1;
.super Landroid/os/Handler;
.source "WebViewHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper$1;->this$0:Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 60
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 75
    :goto_0
    return-void

    .line 62
    :pswitch_0
    const-string v1, "WebViewHelper"

    const-string v2, "Timeout called..."

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .line 64
    .local v0, "data":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    monitor-enter v0

    .line 66
    :try_start_0
    # getter for: Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->access$000(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 68
    const/4 v1, 0x1

    # setter for: Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->timeoutFlag:Z
    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->access$002(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;Z)Z

    .line 69
    # getter for: Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->mView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->access$100(Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 70
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handleError()V

    .line 72
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 60
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
