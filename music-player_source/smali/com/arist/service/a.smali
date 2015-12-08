.class final Lcom/arist/service/a;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/arist/service/DeskLrcService;


# direct methods
.method constructor <init>(Lcom/arist/service/DeskLrcService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/a;->a:Lcom/arist/service/DeskLrcService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/service/a;->a:Lcom/arist/service/DeskLrcService;

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/service/DeskLrcService;->a(Lcom/arist/b/b;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/arist/c/a;->r:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "musicProgress"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iget-object v1, p0, Lcom/arist/service/a;->a:Lcom/arist/service/DeskLrcService;

    invoke-virtual {v1, v0}, Lcom/arist/service/DeskLrcService;->b(I)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/arist/c/a;->C:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "dismiss"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lcom/arist/c/g;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/arist/service/a;->a:Lcom/arist/service/DeskLrcService;

    invoke-static {v0, v2}, Lcom/arist/service/DeskLrcService;->a(Lcom/arist/service/DeskLrcService;Z)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/arist/service/a;->a:Lcom/arist/service/DeskLrcService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/arist/service/DeskLrcService;->a(Lcom/arist/service/DeskLrcService;Z)V

    goto :goto_0
.end method
