.class Lme/grantland/twitter/TwitterDialog$1;
.super Ljava/lang/Thread;
.source "TwitterDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/TwitterDialog;-><init>(Landroid/content/Context;Loauth/signpost/OAuthConsumer;Ljava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterDialog;


# direct methods
.method constructor <init>(Lme/grantland/twitter/TwitterDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/TwitterDialog$1;->this$0:Lme/grantland/twitter/TwitterDialog;

    .line 105
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 108
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 109
    .local v2, "msg":Landroid/os/Message;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 111
    .local v0, "bundle":Landroid/os/Bundle;
    const/4 v3, 0x1

    :try_start_0
    iput v3, v2, Landroid/os/Message;->what:I

    .line 112
    const-string v3, "url"

    iget-object v4, p0, Lme/grantland/twitter/TwitterDialog$1;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mProvider:Loauth/signpost/OAuthProvider;
    invoke-static {v4}, Lme/grantland/twitter/TwitterDialog;->access$7(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthProvider;

    move-result-object v4

    .line 113
    iget-object v5, p0, Lme/grantland/twitter/TwitterDialog$1;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v5}, Lme/grantland/twitter/TwitterDialog;->access$8(Lme/grantland/twitter/TwitterDialog;)Loauth/signpost/OAuthConsumer;

    move-result-object v5

    const-string v6, "gc://twitt"

    .line 112
    invoke-interface {v4, v5, v6}, Loauth/signpost/OAuthProvider;->retrieveRequestToken(Loauth/signpost/OAuthConsumer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Loauth/signpost/exception/OAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :goto_0
    invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 119
    iget-object v3, p0, Lme/grantland/twitter/TwitterDialog$1;->this$0:Lme/grantland/twitter/TwitterDialog;

    # getter for: Lme/grantland/twitter/TwitterDialog;->mMainThreadHandler:Lme/grantland/twitter/TwitterDialog$H;
    invoke-static {v3}, Lme/grantland/twitter/TwitterDialog;->access$9(Lme/grantland/twitter/TwitterDialog;)Lme/grantland/twitter/TwitterDialog$H;

    move-result-object v3

    invoke-virtual {v3, v2}, Lme/grantland/twitter/TwitterDialog$H;->sendMessage(Landroid/os/Message;)Z

    .line 120
    return-void

    .line 114
    :catch_0
    move-exception v1

    .line 115
    .local v1, "e":Loauth/signpost/exception/OAuthException;
    const/4 v3, -0x1

    iput v3, v2, Landroid/os/Message;->what:I

    .line 116
    const-string v3, "error"

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_0
.end method
