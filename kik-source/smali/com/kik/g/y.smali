.class final Lcom/kik/g/y;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lcom/kik/g/p;Lcom/kik/g/p;Z)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    iput-object p2, p0, Lcom/kik/g/y;->b:Lcom/kik/g/p;

    iput-boolean p3, p0, Lcom/kik/g/y;->c:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 477
    iget-object v0, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 478
    iget-object v0, p0, Lcom/kik/g/y;->b:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/m/o;

    iget-object v2, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 480
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 498
    iget-boolean v0, p0, Lcom/kik/g/y;->c:Z

    if-eqz v0, :cond_1

    .line 499
    iget-object v0, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lcom/kik/g/y;->b:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/m/o;

    iget-object v2, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 506
    :cond_0
    :goto_0
    return-void

    .line 504
    :cond_1
    iget-object v0, p0, Lcom/kik/g/y;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 485
    iget-boolean v0, p0, Lcom/kik/g/y;->c:Z

    if-eqz v0, :cond_1

    .line 486
    iget-object v0, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lcom/kik/g/y;->b:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/m/o;

    iget-object v2, p0, Lcom/kik/g/y;->a:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 493
    :cond_0
    :goto_0
    return-void

    .line 491
    :cond_1
    iget-object v0, p0, Lcom/kik/g/y;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
