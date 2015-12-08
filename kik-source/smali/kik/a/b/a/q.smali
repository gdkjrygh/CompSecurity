.class final Lkik/a/b/a/q;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lkik/a/d/f;

.field final synthetic c:Lcom/kik/g/p;

.field final synthetic d:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;Lkik/a/d/s;Lkik/a/d/f;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 1620
    iput-object p1, p0, Lkik/a/b/a/q;->d:Lkik/a/b/a/a;

    iput-object p2, p0, Lkik/a/b/a/q;->a:Lkik/a/d/s;

    iput-object p3, p0, Lkik/a/b/a/q;->b:Lkik/a/d/f;

    iput-object p4, p0, Lkik/a/b/a/q;->c:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1620
    check-cast p1, Lcom/kik/m/o;

    iget-object v0, p1, Lcom/kik/m/o;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p1, Lcom/kik/m/o;->a:Ljava/lang/Object;

    check-cast v1, Ljava/security/KeyPair;

    invoke-static {v0, v1}, Lkik/a/f/f/v;->a(Ljava/util/List;Ljava/security/KeyPair;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/b/a/q;->a:Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->o()[B

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v0, 0x10

    new-array v0, v0, [B

    iget-object v1, p0, Lkik/a/b/a/q;->d:Lkik/a/b/a/a;

    invoke-static {v1}, Lkik/a/b/a/a;->d(Lkik/a/b/a/a;)Ljava/security/SecureRandom;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v1, p0, Lkik/a/b/a/q;->a:Lkik/a/d/s;

    invoke-virtual {v1, v0}, Lkik/a/d/s;->a([B)V

    iget-object v0, p0, Lkik/a/b/a/q;->b:Lkik/a/d/f;

    iget-object v1, p0, Lkik/a/b/a/q;->a:Lkik/a/d/s;

    iget-object v2, p0, Lkik/a/b/a/q;->a:Lkik/a/d/s;

    invoke-virtual {v2}, Lkik/a/d/s;->c()I

    move-result v2

    iget-object v3, p0, Lkik/a/b/a/q;->d:Lkik/a/b/a/a;

    invoke-static {v3}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;)Lkik/a/e/v;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lkik/a/d/f;->a(Lkik/a/d/s;ILkik/a/e/v;)V

    :cond_0
    iget-object v0, p0, Lkik/a/b/a/q;->c:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 1642
    iget-object v0, p0, Lkik/a/b/a/q;->c:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 1643
    return-void
.end method
