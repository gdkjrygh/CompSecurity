.class public Lcom/facebook/k/e;
.super Lcom/facebook/inject/b;
.source "PowerManagementModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 73
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 28
    const-class v0, Lcom/facebook/base/c/a;

    invoke-virtual {p0, v0}, Lcom/facebook/k/e;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 29
    const-class v0, Lcom/facebook/http/b/w;

    invoke-virtual {p0, v0}, Lcom/facebook/k/e;->e(Ljava/lang/Class;)V

    .line 31
    const-class v0, Lcom/facebook/k/j;

    invoke-virtual {p0, v0}, Lcom/facebook/k/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/k/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/k/i;-><init>(Lcom/facebook/k/e;Lcom/facebook/k/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 34
    const-class v0, Lcom/facebook/k/a;

    invoke-virtual {p0, v0}, Lcom/facebook/k/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/k/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/k/g;-><init>(Lcom/facebook/k/e;Lcom/facebook/k/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 38
    const-class v0, Lcom/facebook/k/b;

    invoke-virtual {p0, v0}, Lcom/facebook/k/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/k/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/k/h;-><init>(Lcom/facebook/k/e;Lcom/facebook/k/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 42
    const-class v0, Lcom/facebook/http/b/t;

    invoke-virtual {p0, v0}, Lcom/facebook/k/e;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/k/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 44
    return-void
.end method
