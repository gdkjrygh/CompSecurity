.class public Lcom/facebook/c/d;
.super Lcom/facebook/inject/b;
.source "ContentModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 66
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 16
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {p0, v0}, Lcom/facebook/c/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/c/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/c/g;-><init>(Lcom/facebook/c/d;Lcom/facebook/c/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 20
    const-class v0, Lcom/facebook/c/t;

    invoke-virtual {p0, v0}, Lcom/facebook/c/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/c/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/c/h;-><init>(Lcom/facebook/c/d;Lcom/facebook/c/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 24
    const-class v0, Lcom/facebook/c/j;

    invoke-virtual {p0, v0}, Lcom/facebook/c/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/c/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/c/f;-><init>(Lcom/facebook/c/d;Lcom/facebook/c/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 28
    const-class v0, Lcom/facebook/c/u;

    invoke-virtual {p0, v0}, Lcom/facebook/c/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/c/i;

    invoke-direct {v1, v2}, Lcom/facebook/c/i;-><init>(Lcom/facebook/c/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 32
    const-class v0, Lcom/facebook/c/o;

    invoke-virtual {p0, v0}, Lcom/facebook/c/d;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 33
    return-void
.end method
