.class final Lcom/kik/cache/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lcom/kik/cache/e;


# direct methods
.method constructor <init>(Lcom/kik/cache/e;ZLcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/kik/cache/f;->c:Lcom/kik/cache/e;

    iput-boolean p2, p0, Lcom/kik/cache/f;->a:Z

    iput-object p3, p0, Lcom/kik/cache/f;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 99
    check-cast p1, Lcom/kik/cache/h;

    iget-object v0, p0, Lcom/kik/cache/f;->c:Lcom/kik/cache/e;

    iget-object v0, v0, Lcom/kik/cache/e;->f:Lcom/kik/cache/d;

    iget-object v1, p0, Lcom/kik/cache/f;->c:Lcom/kik/cache/e;

    iget-object v1, v1, Lcom/kik/cache/e;->e:Ljava/lang/Object;

    new-instance v2, Lcom/kik/cache/h;

    invoke-virtual {p1}, Lcom/kik/cache/h;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Lcom/kik/cache/h;->b()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/kik/cache/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/cache/d;->a(Ljava/lang/Object;Lcom/kik/cache/h;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cache/f;->b:Lcom/kik/g/p;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/kik/cache/f;->c:Lcom/kik/cache/e;

    iget-object v1, v1, Lcom/kik/cache/e;->a:Lcom/kik/g/p;

    new-instance v2, Lcom/kik/cache/h;

    invoke-virtual {p1}, Lcom/kik/cache/h;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/kik/cache/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/kik/cache/f;->c:Lcom/kik/cache/e;

    iget-object v0, v0, Lcom/kik/cache/e;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/kik/cache/f;->b:Lcom/kik/g/p;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/kik/cache/f;->b:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 120
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/kik/cache/f;->b:Lcom/kik/g/p;

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/kik/cache/f;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 127
    :cond_0
    return-void
.end method
