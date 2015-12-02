.class public Lcom/facebook/push/fbpushdata/b;
.super Lcom/facebook/inject/c;
.source "FbPushDataModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 41
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 25
    const-class v0, Lcom/facebook/push/mqtt/ax;

    invoke-virtual {p0, v0}, Lcom/facebook/push/fbpushdata/b;->e(Ljava/lang/Class;)V

    .line 26
    const-class v0, Lcom/facebook/push/c2dm/d;

    invoke-virtual {p0, v0}, Lcom/facebook/push/fbpushdata/b;->e(Ljava/lang/Class;)V

    .line 29
    const-class v0, Lcom/facebook/push/fbpushdata/e;

    invoke-virtual {p0, v0}, Lcom/facebook/push/fbpushdata/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/fbpushdata/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/push/fbpushdata/d;-><init>(Lcom/facebook/push/fbpushdata/b;Lcom/facebook/push/fbpushdata/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 35
    const-class v0, Lcom/facebook/push/fbpushdata/a;

    invoke-virtual {p0, v0}, Lcom/facebook/push/fbpushdata/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 37
    const-class v0, Lcom/facebook/push/mqtt/av;

    invoke-virtual {p0, v0}, Lcom/facebook/push/fbpushdata/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/fbpushdata/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 39
    return-void
.end method
