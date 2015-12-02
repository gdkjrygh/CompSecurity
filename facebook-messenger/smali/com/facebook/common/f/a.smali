.class public Lcom/facebook/common/f/a;
.super Lcom/facebook/inject/b;
.source "FileModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 25
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 17
    const-class v0, Lcom/facebook/common/f/d;

    invoke-virtual {p0, v0}, Lcom/facebook/common/f/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/f/d;

    invoke-direct {v1}, Lcom/facebook/common/f/d;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 20
    const-class v0, Lcom/facebook/common/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/common/f/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/f/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/f/c;-><init>(Lcom/facebook/common/f/a;Lcom/facebook/common/f/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 23
    return-void
.end method
