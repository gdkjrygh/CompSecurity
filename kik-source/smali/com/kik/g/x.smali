.class final Lcom/kik/g/x;
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
    .line 437
    iput-object p1, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    iput-object p2, p0, Lcom/kik/g/x;->b:Lcom/kik/g/p;

    iput-boolean p3, p0, Lcom/kik/g/x;->c:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 441
    iget-object v0, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/kik/g/x;->b:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/m/o;

    iget-object v2, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 444
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 462
    iget-boolean v0, p0, Lcom/kik/g/x;->c:Z

    if-eqz v0, :cond_1

    .line 463
    iget-object v0, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 464
    iget-object v0, p0, Lcom/kik/g/x;->b:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/m/o;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    invoke-virtual {v3}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 470
    :cond_0
    :goto_0
    return-void

    .line 468
    :cond_1
    iget-object v0, p0, Lcom/kik/g/x;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 449
    iget-boolean v0, p0, Lcom/kik/g/x;->c:Z

    if-eqz v0, :cond_1

    .line 450
    iget-object v0, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/kik/g/x;->b:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/m/o;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/kik/g/x;->a:Lcom/kik/g/p;

    invoke-virtual {v3}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/kik/m/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 457
    :cond_0
    :goto_0
    return-void

    .line 455
    :cond_1
    iget-object v0, p0, Lcom/kik/g/x;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
