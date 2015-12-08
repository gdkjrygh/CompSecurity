.class final Lcom/arist/service/c;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/arist/service/b;


# direct methods
.method constructor <init>(Lcom/arist/service/b;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/c;->a:Lcom/arist/service/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const/4 v1, 0x0

    const-string v0, "state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "state"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/c;->a:Lcom/arist/service/b;

    invoke-static {v0}, Lcom/arist/service/b;->a(Lcom/arist/service/b;)Lcom/arist/service/MusicPlayService;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/c;->a:Lcom/arist/service/b;

    invoke-static {v0}, Lcom/arist/service/b;->a(Lcom/arist/service/b;)Lcom/arist/service/MusicPlayService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "state"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0}, Lcom/arist/c/f;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/c;->a:Lcom/arist/service/b;

    invoke-static {v0}, Lcom/arist/service/b;->a(Lcom/arist/service/b;)Lcom/arist/service/MusicPlayService;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/service/c;->a:Lcom/arist/service/b;

    invoke-static {v0}, Lcom/arist/service/b;->a(Lcom/arist/service/b;)Lcom/arist/service/MusicPlayService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->a()V

    goto :goto_0
.end method
