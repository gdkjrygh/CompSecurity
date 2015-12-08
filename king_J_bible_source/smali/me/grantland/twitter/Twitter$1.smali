.class Lme/grantland/twitter/Twitter$1;
.super Ljava/lang/Object;
.source "Twitter.java"

# interfaces
.implements Lme/grantland/twitter/Twitter$DialogListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme/grantland/twitter/Twitter;->startTwitterDialog(Landroid/app/Activity;Ljava/lang/String;Lme/grantland/twitter/Twitter$DialogListener;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lme/grantland/twitter/Twitter;

.field private final synthetic val$listener:Lme/grantland/twitter/Twitter$DialogListener;


# direct methods
.method constructor <init>(Lme/grantland/twitter/Twitter;Lme/grantland/twitter/Twitter$DialogListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lme/grantland/twitter/Twitter$1;->this$0:Lme/grantland/twitter/Twitter;

    iput-object p2, p0, Lme/grantland/twitter/Twitter$1;->val$listener:Lme/grantland/twitter/Twitter$DialogListener;

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lme/grantland/twitter/Twitter$1;->val$listener:Lme/grantland/twitter/Twitter$DialogListener;

    invoke-interface {v0}, Lme/grantland/twitter/Twitter$DialogListener;->onCancel()V

    .line 185
    return-void
.end method

.method public onComplete(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "token"    # Ljava/lang/String;
    .param p2, "secret"    # Ljava/lang/String;

    .prologue
    .line 172
    iget-object v0, p0, Lme/grantland/twitter/Twitter$1;->this$0:Lme/grantland/twitter/Twitter;

    # getter for: Lme/grantland/twitter/Twitter;->mConsumer:Loauth/signpost/OAuthConsumer;
    invoke-static {v0}, Lme/grantland/twitter/Twitter;->access$0(Lme/grantland/twitter/Twitter;)Loauth/signpost/OAuthConsumer;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Loauth/signpost/OAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lme/grantland/twitter/Twitter$1;->val$listener:Lme/grantland/twitter/Twitter$DialogListener;

    invoke-interface {v0, p1, p1}, Lme/grantland/twitter/Twitter$DialogListener;->onComplete(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    return-void
.end method

.method public onError(Lme/grantland/twitter/TwitterError;)V
    .locals 1
    .param p1, "error"    # Lme/grantland/twitter/TwitterError;

    .prologue
    .line 179
    iget-object v0, p0, Lme/grantland/twitter/Twitter$1;->val$listener:Lme/grantland/twitter/Twitter$DialogListener;

    invoke-interface {v0, p1}, Lme/grantland/twitter/Twitter$DialogListener;->onError(Lme/grantland/twitter/TwitterError;)V

    .line 180
    return-void
.end method
