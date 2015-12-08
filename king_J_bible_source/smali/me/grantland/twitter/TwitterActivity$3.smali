.class Lme/grantland/twitter/TwitterActivity$3;
.super Ljava/lang/Thread;
.source "TwitterActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/TwitterActivity;->retrieveAccessToken(Landroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/TwitterActivity;

.field private final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lme/grantland/twitter/TwitterActivity;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    iput-object p2, p0, Lme/grantland/twitter/TwitterActivity$3;->val$uri:Landroid/net/Uri;

    .line 158
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 164
    :try_start_0
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$3;->val$uri:Landroid/net/Uri;

    .line 165
    const-string v4, "oauth_token"

    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 166
    .local v1, "oauth_token":Ljava/lang/String;
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$3;->val$uri:Landroid/net/Uri;

    .line 167
    const-string v4, "oauth_verifier"

    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 173
    .local v2, "verifier":Ljava/lang/String;
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v3}, Lme/grantland/twitter/TwitterActivity;->access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;

    move-result-object v3

    .line 174
    iget-object v4, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v4}, Lme/grantland/twitter/TwitterActivity;->access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;

    move-result-object v4

    invoke-interface {v4}, Loauth/signpost/OAuthConsumer;->getConsumerSecret()Ljava/lang/String;

    move-result-object v4

    .line 173
    invoke-interface {v3, v1, v4}, Loauth/signpost/OAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mProvider:Loauth/signpost/OAuthProvider;
    invoke-static {v3}, Lme/grantland/twitter/TwitterActivity;->access$5(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthProvider;

    move-result-object v3

    iget-object v4, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v4}, Lme/grantland/twitter/TwitterActivity;->access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Loauth/signpost/OAuthProvider;->retrieveAccessToken(Loauth/signpost/OAuthConsumer;Ljava/lang/String;)V

    .line 177
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    iget-object v4, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v4}, Lme/grantland/twitter/TwitterActivity;->access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;

    move-result-object v4

    invoke-interface {v4}, Loauth/signpost/OAuthConsumer;->getToken()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # getter for: Lme/grantland/twitter/TwitterActivity;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v5}, Lme/grantland/twitter/TwitterActivity;->access$6(Lme/grantland/twitter/TwitterActivity;)Loauth/signpost/OAuthConsumer;

    move-result-object v5

    invoke-interface {v5}, Loauth/signpost/OAuthConsumer;->getTokenSecret()Ljava/lang/String;

    move-result-object v5

    # invokes: Lme/grantland/twitter/TwitterActivity;->complete(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v3, v4, v5}, Lme/grantland/twitter/TwitterActivity;->access$8(Lme/grantland/twitter/TwitterActivity;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Loauth/signpost/exception/OAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    .end local v1    # "oauth_token":Ljava/lang/String;
    .end local v2    # "verifier":Ljava/lang/String;
    :goto_0
    return-void

    .line 178
    :catch_0
    move-exception v0

    .line 179
    .local v0, "e":Loauth/signpost/exception/OAuthException;
    iget-object v3, p0, Lme/grantland/twitter/TwitterActivity$3;->this$0:Lme/grantland/twitter/TwitterActivity;

    # invokes: Lme/grantland/twitter/TwitterActivity;->error(Ljava/lang/Throwable;)V
    invoke-static {v3, v0}, Lme/grantland/twitter/TwitterActivity;->access$4(Lme/grantland/twitter/TwitterActivity;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
