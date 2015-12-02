.class public Lcom/facebook/n/a/a;
.super Lcom/facebook/inject/c;
.source "SpringModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 60
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    const-class v0, Lcom/facebook/ui/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/n/a/a;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 20
    const-class v0, Lcom/facebook/n/j;

    invoke-virtual {p0, v0}, Lcom/facebook/n/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/n/a/e;

    invoke-direct {v1, v2}, Lcom/facebook/n/a/e;-><init>(Lcom/facebook/n/a/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 23
    const-class v0, Lcom/facebook/n/f;

    invoke-virtual {p0, v0}, Lcom/facebook/n/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/n/a/c;

    invoke-direct {v1, v2}, Lcom/facebook/n/a/c;-><init>(Lcom/facebook/n/a/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 26
    const-class v0, Lcom/facebook/n/k;

    invoke-virtual {p0, v0}, Lcom/facebook/n/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/n/a/f;

    invoke-direct {v1, v2}, Lcom/facebook/n/a/f;-><init>(Lcom/facebook/n/a/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 29
    const-class v0, Lcom/facebook/n/h;

    invoke-virtual {p0, v0}, Lcom/facebook/n/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/n/a/d;

    invoke-direct {v1, v2}, Lcom/facebook/n/a/d;-><init>(Lcom/facebook/n/a/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 32
    return-void
.end method
