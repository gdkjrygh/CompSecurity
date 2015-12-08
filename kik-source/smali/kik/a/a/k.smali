.class final Lkik/a/a/k;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/a/a/j;


# direct methods
.method constructor <init>(Lkik/a/a/j;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lkik/a/a/k;->b:Lkik/a/a/j;

    iput-object p2, p0, Lkik/a/a/k;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 76
    check-cast p1, Lkik/a/k/d;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lkik/a/k/d;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$e;

    iget-object v1, p0, Lkik/a/a/k;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 90
    iget-object v0, p0, Lkik/a/a/k;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 91
    return-void
.end method
