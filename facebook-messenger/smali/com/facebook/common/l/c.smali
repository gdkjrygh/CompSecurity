.class public Lcom/facebook/common/l/c;
.super Lcom/facebook/inject/b;
.source "ManifestModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 40
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 15
    const-class v0, Lcom/facebook/common/l/h;

    invoke-virtual {p0, v0}, Lcom/facebook/common/l/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/l/g;

    invoke-direct {v1, v2}, Lcom/facebook/common/l/g;-><init>(Lcom/facebook/common/l/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 17
    const-class v0, Lcom/facebook/common/l/b;

    invoke-virtual {p0, v0}, Lcom/facebook/common/l/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/l/f;

    invoke-direct {v1, v2}, Lcom/facebook/common/l/f;-><init>(Lcom/facebook/common/l/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 19
    const-class v0, Lcom/facebook/common/l/a;

    invoke-virtual {p0, v0}, Lcom/facebook/common/l/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/l/e;

    invoke-direct {v1, v2}, Lcom/facebook/common/l/e;-><init>(Lcom/facebook/common/l/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 22
    return-void
.end method
