.class Lcom/facebook/widget/a/e;
.super Landroid/os/Handler;
.source "AbstractCustomFilter.java"


# instance fields
.field final synthetic a:Lcom/facebook/widget/a/a;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/a/a;)V
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/facebook/widget/a/e;->a:Lcom/facebook/widget/a/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/a/a;Lcom/facebook/widget/a/b;)V
    .locals 0

    .prologue
    .line 209
    invoke-direct {p0, p1}, Lcom/facebook/widget/a/e;-><init>(Lcom/facebook/widget/a/a;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 221
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/widget/a/c;

    .line 223
    iget-object v1, p0, Lcom/facebook/widget/a/e;->a:Lcom/facebook/widget/a/a;

    iget-object v2, v0, Lcom/facebook/widget/a/c;->a:Ljava/lang/CharSequence;

    iget-object v3, v0, Lcom/facebook/widget/a/c;->c:Lcom/facebook/widget/a/i;

    invoke-virtual {v1, v2, v3}, Lcom/facebook/widget/a/a;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/i;)V

    .line 224
    iget-object v1, v0, Lcom/facebook/widget/a/c;->b:Lcom/facebook/widget/a/h;

    if-eqz v1, :cond_1

    .line 225
    iget-object v1, v0, Lcom/facebook/widget/a/c;->c:Lcom/facebook/widget/a/i;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/facebook/widget/a/c;->c:Lcom/facebook/widget/a/i;

    iget v1, v1, Lcom/facebook/widget/a/i;->b:I

    .line 226
    :goto_0
    iget-object v2, v0, Lcom/facebook/widget/a/c;->b:Lcom/facebook/widget/a/h;

    invoke-interface {v2, v1}, Lcom/facebook/widget/a/h;->a(I)V

    .line 228
    iget-object v1, p0, Lcom/facebook/widget/a/e;->a:Lcom/facebook/widget/a/a;

    invoke-static {v1}, Lcom/facebook/widget/a/a;->b(Lcom/facebook/widget/a/a;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 229
    :try_start_0
    iget-object v1, p0, Lcom/facebook/widget/a/e;->a:Lcom/facebook/widget/a/a;

    invoke-static {v1}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/widget/a/e;->a:Lcom/facebook/widget/a/a;

    invoke-static {v1}, Lcom/facebook/widget/a/a;->c(Lcom/facebook/widget/a/a;)Landroid/os/Handler;

    move-result-object v1

    const v3, -0x2f2f0ff3

    invoke-virtual {v1, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_0
    const/4 v1, 0x1

    .line 230
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    if-eqz v1, :cond_1

    .line 232
    iget-object v0, v0, Lcom/facebook/widget/a/c;->b:Lcom/facebook/widget/a/h;

    sget-object v1, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    invoke-interface {v0, v1}, Lcom/facebook/widget/a/h;->a(Lcom/facebook/widget/a/j;)V

    .line 235
    :cond_1
    return-void

    .line 225
    :cond_2
    const/4 v1, -0x1

    goto :goto_0

    .line 229
    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    .line 230
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
