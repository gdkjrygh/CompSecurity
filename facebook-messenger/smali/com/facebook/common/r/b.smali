.class public Lcom/facebook/common/r/b;
.super Lcom/facebook/inject/b;
.source "TimeFormatModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 23
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 18
    const-class v0, Lcom/facebook/common/r/e;

    invoke-virtual {p0, v0}, Lcom/facebook/common/r/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/r/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/r/d;-><init>(Lcom/facebook/common/r/b;Lcom/facebook/common/r/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 21
    return-void
.end method
