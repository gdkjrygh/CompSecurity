.class Lcom/facebook/orca/threadlist/ad;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/facebook/orca/threadlist/bc;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 399
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 434
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/t;->h(Lcom/facebook/orca/threadlist/t;)Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 435
    sget-object v1, Lcom/facebook/orca/creation/CreateThreadActivity;->r:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 436
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 402
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->d(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "thread_list_message_button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 406
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ad;->d()Landroid/content/Intent;

    move-result-object v0

    .line 407
    const-string v1, "trigger"

    const-string v2, "thread_list_message_button"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 408
    const-string v1, "disable_create_thread_suggestions"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 409
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/t;->b(Landroid/content/Intent;)V

    .line 410
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 414
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->d(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "thread_list_group_button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 418
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ad;->d()Landroid/content/Intent;

    move-result-object v0

    .line 419
    const-string v1, "trigger"

    const-string v2, "thread_list_group_button"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 420
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/t;->b(Landroid/content/Intent;)V

    .line 421
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 425
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->d(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "thread_list_broadcast_button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 429
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/t;->g(Lcom/facebook/orca/threadlist/t;)Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 430
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ad;->a:Lcom/facebook/orca/threadlist/t;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/t;->b(Landroid/content/Intent;)V

    .line 431
    return-void
.end method
