.class public Lme/grantland/twitter/Tweeter$SendTwit;
.super Landroid/os/AsyncTask;
.source "Tweeter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/grantland/twitter/Tweeter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SendTwit"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field del:Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

.field msg:Ljava/lang/String;

.field final synthetic this$0:Lme/grantland/twitter/Tweeter;


# direct methods
.method public constructor <init>(Lme/grantland/twitter/Tweeter;Ljava/lang/String;Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;)V
    .locals 1
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "delegate"    # Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

    .prologue
    .line 66
    iput-object p1, p0, Lme/grantland/twitter/Tweeter$SendTwit;->this$0:Lme/grantland/twitter/Tweeter;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 63
    const-string v0, ""

    iput-object v0, p0, Lme/grantland/twitter/Tweeter$SendTwit;->msg:Ljava/lang/String;

    .line 67
    iput-object p2, p0, Lme/grantland/twitter/Tweeter$SendTwit;->msg:Ljava/lang/String;

    .line 68
    iput-object p3, p0, Lme/grantland/twitter/Tweeter$SendTwit;->del:Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

    .line 70
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 3
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 74
    iget-object v1, p0, Lme/grantland/twitter/Tweeter$SendTwit;->this$0:Lme/grantland/twitter/Tweeter;

    iget-object v2, p0, Lme/grantland/twitter/Tweeter$SendTwit;->msg:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lme/grantland/twitter/Tweeter;->tweet(Ljava/lang/String;)Z

    move-result v0

    .line 75
    .local v0, "yes":Z
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lme/grantland/twitter/Tweeter$SendTwit;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/Boolean;

    .prologue
    .line 80
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 81
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lme/grantland/twitter/Tweeter$SendTwit;->del:Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lme/grantland/twitter/Tweeter$SendTwit;->del:Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

    invoke-interface {v0}, Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;->UploadSuccessFully()V

    .line 90
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    iget-object v0, p0, Lme/grantland/twitter/Tweeter$SendTwit;->del:Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lme/grantland/twitter/Tweeter$SendTwit;->del:Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;

    invoke-interface {v0}, Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;->UploadFailed()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lme/grantland/twitter/Tweeter$SendTwit;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
