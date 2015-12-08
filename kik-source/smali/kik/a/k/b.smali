.class public final Lkik/a/k/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/c/b/as;

.field private final d:Lcom/c/b/bk;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/c/b/as;Lcom/c/b/bk;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lkik/a/k/b;->a:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lkik/a/k/b;->b:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lkik/a/k/b;->c:Lcom/c/b/as;

    .line 28
    iput-object p4, p0, Lkik/a/k/b;->d:Lcom/c/b/bk;

    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/e/f;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 61
    if-nez p1, :cond_0

    .line 62
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No communicator to execute on!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 98
    :goto_0
    return-object v0

    .line 64
    :cond_0
    invoke-static {p0}, Lkik/a/k/d;->a(Lkik/a/k/b;)Lkik/a/k/d;

    move-result-object v0

    invoke-interface {p1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v1

    .line 68
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 69
    if-eqz v1, :cond_1

    .line 70
    new-instance v2, Lkik/a/k/c;

    invoke-direct {v2, p0, v0}, Lkik/a/k/c;-><init>(Lkik/a/k/b;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 96
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Nothing to wrap"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a([B)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 48
    iget-object v1, p0, Lkik/a/k/b;->d:Lcom/c/b/bk;

    if-nez v1, :cond_0

    .line 55
    :goto_0
    return-object v0

    .line 52
    :cond_0
    :try_start_0
    iget-object v1, p0, Lkik/a/k/b;->d:Lcom/c/b/bk;

    invoke-interface {v1, p1}, Lcom/c/b/bk;->a([B)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 55
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lkik/a/k/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lkik/a/k/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/c/b/as;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lkik/a/k/b;->c:Lcom/c/b/as;

    return-object v0
.end method
