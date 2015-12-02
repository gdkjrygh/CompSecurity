.class public Lcom/facebook/mqtt/q;
.super Lcom/facebook/inject/c;
.source "MqttClientModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 29
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 22
    const-class v0, Lcom/facebook/k/e;

    invoke-virtual {p0, v0}, Lcom/facebook/mqtt/q;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 24
    const-class v0, Lcom/facebook/mqtt/p;

    invoke-virtual {p0, v0}, Lcom/facebook/mqtt/q;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/mqtt/s;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/mqtt/s;-><init>(Lcom/facebook/mqtt/r;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    return-void
.end method
