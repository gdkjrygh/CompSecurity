.class public Lcom/facebook/common/executors/f;
.super Lcom/facebook/inject/b;
.source "ExecutorsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 25
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 21
    const-class v0, Lcom/facebook/common/executors/d;

    invoke-virtual {p0, v0}, Lcom/facebook/common/executors/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/executors/h;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/common/executors/h;-><init>(Lcom/facebook/common/executors/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 23
    return-void
.end method
