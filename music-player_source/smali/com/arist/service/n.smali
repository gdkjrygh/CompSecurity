.class final Lcom/arist/service/n;
.super Landroid/media/session/MediaSession$Callback;


# instance fields
.field final synthetic a:Lcom/arist/service/m;


# direct methods
.method constructor <init>(Lcom/arist/service/m;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/n;->a:Lcom/arist/service/m;

    invoke-direct {p0}, Landroid/media/session/MediaSession$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPause()V
    .locals 3

    iget-object v0, p0, Lcom/arist/service/n;->a:Lcom/arist/service/m;

    iget-object v0, v0, Lcom/arist/service/m;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final onPlay()V
    .locals 3

    iget-object v0, p0, Lcom/arist/service/n;->a:Lcom/arist/service/m;

    iget-object v0, v0, Lcom/arist/service/m;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final onSkipToNext()V
    .locals 3

    iget-object v0, p0, Lcom/arist/service/n;->a:Lcom/arist/service/m;

    iget-object v0, v0, Lcom/arist/service/m;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final onSkipToPrevious()V
    .locals 3

    iget-object v0, p0, Lcom/arist/service/n;->a:Lcom/arist/service/m;

    iget-object v0, v0, Lcom/arist/service/m;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final onStop()V
    .locals 3

    iget-object v0, p0, Lcom/arist/service/n;->a:Lcom/arist/service/m;

    iget-object v0, v0, Lcom/arist/service/m;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
