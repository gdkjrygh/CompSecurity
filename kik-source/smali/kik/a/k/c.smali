.class final Lkik/a/k/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/k/b;


# direct methods
.method constructor <init>(Lkik/a/k/b;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lkik/a/k/c;->b:Lkik/a/k/b;

    iput-object p2, p0, Lkik/a/k/c;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 70
    check-cast p1, Lkik/a/f/f/z;

    :try_start_0
    iget-object v0, p0, Lkik/a/k/c;->a:Lcom/kik/g/p;

    check-cast p1, Lkik/a/k/d;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lkik/a/k/c;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "incorrect type resolved"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lkik/a/k/c;->a:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 92
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lkik/a/k/c;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 86
    return-void
.end method
