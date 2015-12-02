.class public Lcom/facebook/config/server/k;
.super Lcom/facebook/inject/c;
.source "ServerConfigModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 61
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 19
    const-class v0, Lcom/facebook/config/server/j;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/k;->d(Ljava/lang/Class;)V

    .line 22
    const-class v0, Lcom/facebook/http/c/i;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/server/n;

    invoke-direct {v1, v2}, Lcom/facebook/config/server/n;-><init>(Lcom/facebook/config/server/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 24
    const-class v0, Lcom/facebook/http/c/i;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/ProductionPlatformAppHttpConfig;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/server/o;

    invoke-direct {v1, v2}, Lcom/facebook/config/server/o;-><init>(Lcom/facebook/config/server/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 27
    const-class v0, Lcom/facebook/http/c/i;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/BootstrapPlatformAppHttpConfig;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/server/m;

    invoke-direct {v1, v2}, Lcom/facebook/config/server/m;-><init>(Lcom/facebook/config/server/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 30
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/k;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/http/annotations/UserAgentString;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/server/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/config/server/p;-><init>(Lcom/facebook/config/server/k;Lcom/facebook/config/server/l;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 33
    return-void
.end method
