.class Lme/grantland/twitter/TwitterActivity$2;
.super Ljava/lang/Thread;
.source "TwitterActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/TwitterActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterActivity;


# direct methods
.method constructor <init>(Lme/grantland/twitter/TwitterActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/TwitterActivity$2;->this$0:Lme/grantland/twitter/TwitterActivity;

    .line 103
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 107
    :try_start_0
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 108
    .local v2, "msg":Landroid/os/Message;
    const/4 v3, 0x1

    iput v3, v2, Landroid/os/Message;->what:I

    .line 110
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 111
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v3, "url"

    iget-object v4, p0, Lme/grantland/twitter/TwitterActivity$2;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mProvider:Loauth/signpost/OAuthProvider;
    invoke-static {v4}, Lme/grantland/twitter/TwitterActivity;->access$5(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthProvider;

    move-result-object v4

    .line 112
    iget-object v5, p0, Lme/grantland/twitter/TwitterActivity$2;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v5}, Lme/grantland/twitter/TwitterActivity;->access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;

    move-result-object v5

    const-string v6, "gc://twitt"

    .line 111
    invoke-interface {v4, v5, v6}, Loauth/signpost/OAuthProvider;->retrieveRequestToken(Loauth/signpost/OAuthConsumer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 117
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$2;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mMainThreadHandler:Lme/grantland/twitter/TwitterActivity$H;
    invoke-static {v3}, Lme/grantland/twitter/TwitterActivity;->access$7(Lme/grantland/twitter/TwitterActivity;)Lme/grantland/twitter/TwitterActivity$H;

    move-result-object v3

    invoke-virtual {v3, v2}, Lme/grantland/twitter/TwitterActivity$H;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Loauth/signpost/exception/OAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .end local v0    # "bundle":Landroid/os/Bundle;
    .end local v2    # "msg":Landroid/os/Message;
    :goto_0
    return-void

    .line 118
    :catch_0
    move-exception v1

    .line 119
    .local v1, "e":Loauth/signpost/exception/OAuthException;
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$2;->this$0:Lme/grantland/twitter/TwitterActivity;

    # invokes: Lme/grantland/twitter/TwitterActivity;->error(Ljava/lang/Throwable;)V
    invoke-static {v3, v1}, Lme/grantland/twitter/TwitterActivity;->access$4(Lme/grantland/twitter/TwitterActivity;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
