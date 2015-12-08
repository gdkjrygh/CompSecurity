.class Lme/grantland/twitter/TwitterDialog$H;
.super Landroid/os/Handler;
.source "TwitterDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/grantland/twitter/TwitterDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "H"
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterDialog;


# direct methods
.method private constructor <init>(Lme/grantland/twitter/TwitterDialog;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lme/grantland/twitter/TwitterDialog$H;->this$0:Lme/grantland/twitter/TwitterDialog;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lme/grantland/twitter/TwitterDialog;Lme/grantland/twitter/TwitterDialog$H;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterDialog$H;-><init>(Lme/grantland/twitter/TwitterDialog;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 69
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 71
    .local v0, "data":Landroid/os/Bundle;
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 89
    :goto_0
    :pswitch_0
    return-void

    .line 73
    :pswitch_1
    iget-object v2, p0, Lme/grantland/twitter/TwitterDialog$H;->this$0:Lme/grantland/twitter/TwitterDialog;

    const-string v1, "error"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    # invokes: Lme/grantland/twitter/TwitterDialog;->error(Ljava/lang/Throwable;)V
    invoke-static {v2, v1}, Lme/grantland/twitter/TwitterDialog;->access$0(Lme/grantland/twitter/TwitterDialog;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 77
    :pswitch_2
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog$H;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mWebView:Landroid/webkit/WebView;
    invoke-static {v1}, Lme/grantland/twitter/TwitterDialog;->access$1(Lme/grantland/twitter/TwitterDialog;)Landroid/webkit/WebView;

    move-result-object v1

    const-string v2, "url"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :pswitch_3
    iget-object v1, p0, Lme/grantland/twitter/TwitterDialog$H;->this$0:Lme/grantland/twitter/TwitterDialog;

    const-string v2, "access_token"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 82
    const-string v3, "access_secret"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 81
    # invokes: Lme/grantland/twitter/TwitterDialog;->complete(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v1, v2, v3}, Lme/grantland/twitter/TwitterDialog;->access$2(Lme/grantland/twitter/TwitterDialog;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 71
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
