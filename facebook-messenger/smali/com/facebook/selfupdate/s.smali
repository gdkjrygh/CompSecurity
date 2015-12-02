.class Lcom/facebook/selfupdate/s;
.super Ljava/lang/Object;
.source "SelfUpdateManager.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/q;


# direct methods
.method constructor <init>(Lcom/facebook/selfupdate/q;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/facebook/selfupdate/s;->a:Lcom/facebook/selfupdate/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 6

    .prologue
    .line 191
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 192
    const-string v1, "extra_download_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 193
    iget-object v2, p0, Lcom/facebook/selfupdate/s;->a:Lcom/facebook/selfupdate/q;

    invoke-static {v2}, Lcom/facebook/selfupdate/q;->a(Lcom/facebook/selfupdate/q;)Lcom/facebook/prefs/shared/d;

    move-result-object v2

    sget-object v3, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v2

    .line 197
    cmp-long v2, v2, v0

    if-nez v2, :cond_0

    .line 199
    iget-object v2, p0, Lcom/facebook/selfupdate/s;->a:Lcom/facebook/selfupdate/q;

    invoke-static {v2}, Lcom/facebook/selfupdate/q;->b(Lcom/facebook/selfupdate/q;)Lcom/facebook/common/executors/a;

    move-result-object v2

    const-string v3, "completeDownload"

    new-instance v4, Lcom/facebook/selfupdate/t;

    invoke-direct {v4, p0, v0, v1}, Lcom/facebook/selfupdate/t;-><init>(Lcom/facebook/selfupdate/s;J)V

    invoke-interface {v2, v3, v4}, Lcom/facebook/common/executors/a;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 206
    :cond_0
    return-void
.end method
