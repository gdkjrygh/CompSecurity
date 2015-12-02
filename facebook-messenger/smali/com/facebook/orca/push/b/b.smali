.class public Lcom/facebook/orca/push/b/b;
.super Lcom/facebook/inject/c;
.source "OrcaMqttPushModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 105
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 38
    const-class v0, Lcom/facebook/mqtt/t;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/b/d;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/push/b/d;-><init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 42
    const-class v0, Lcom/facebook/orca/push/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/b/e;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/push/b/e;-><init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 45
    const-class v0, Lcom/facebook/push/mqtt/av;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/push/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 46
    const-class v0, Lcom/facebook/push/mqtt/m;

    const-class v1, Lcom/facebook/push/mqtt/MqttTopicList;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/push/b/b;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/m;

    const-class v2, Lcom/facebook/orca/annotations/ForMessages;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 48
    const-class v0, Lcom/facebook/push/mqtt/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/ForMessages;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/b/f;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/push/b/f;-><init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 53
    const-class v0, Lcom/facebook/push/mqtt/ck;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/push/b/i;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 55
    const-class v0, Lcom/facebook/orca/push/b/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/push/b/g;

    invoke-direct {v1, p0, v3}, Lcom/facebook/orca/push/b/g;-><init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 57
    return-void
.end method
