.class Lme/grantland/twitter/TwitterActivity$H;
.super Landroid/os/Handler;
.source "TwitterActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/grantland/twitter/TwitterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "H"
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterActivity;


# direct methods
.method private constructor <init>(Lme/grantland/twitter/TwitterActivity;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lme/grantland/twitter/TwitterActivity$H;->this$0:Lme/grantland/twitter/TwitterActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lme/grantland/twitter/TwitterActivity;Lme/grantland/twitter/TwitterActivity$H;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lme/grantland/twitter/TwitterActivity$H;-><init>(Lme/grantland/twitter/TwitterActivity;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 50
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 52
    .local v0, "data":Landroid/os/Bundle;
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 65
    :goto_0
    return-void

    .line 54
    :pswitch_0
    iget-object v1, p0, Lme/grantland/twitter/TwitterActivity$H;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mWebView:Landroid/webkit/WebView;
    invoke-static {v1}, Lme/grantland/twitter/TwitterActivity;->access$0(Lme/grantland/twitter/TwitterActivity;)Landroid/webkit/WebView;

    move-result-object v1

    const-string v2, "url"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 52
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
