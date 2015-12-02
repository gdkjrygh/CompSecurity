.class public Lcom/facebook/common/n/f;
.super Lcom/facebook/inject/b;
.source "NumbersModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 23
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 17
    const-class v0, Lcom/facebook/common/n/b;

    invoke-virtual {p0, v0}, Lcom/facebook/common/n/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/n/h;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/common/n/h;-><init>(Lcom/facebook/common/n/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 21
    return-void
.end method
