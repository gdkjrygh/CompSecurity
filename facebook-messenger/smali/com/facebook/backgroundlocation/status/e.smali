.class public Lcom/facebook/backgroundlocation/status/e;
.super Lcom/facebook/inject/c;
.source "BackgroundLocationStatusModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 57
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 23
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/e;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundlocation/status/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 25
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundlocation/status/IsBackgroundLocationEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundlocation/status/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 29
    const-class v0, Lcom/facebook/nux/status/e;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/e;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundlocation/status/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 32
    const-class v0, Lcom/facebook/backgroundlocation/status/d;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/backgroundlocation/status/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/backgroundlocation/status/h;-><init>(Lcom/facebook/backgroundlocation/status/e;Lcom/facebook/backgroundlocation/status/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 36
    const-class v0, Lcom/facebook/analytics/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/e;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundlocation/status/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 38
    const-class v0, Lcom/facebook/backgroundlocation/status/a;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundlocation/status/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/backgroundlocation/status/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/backgroundlocation/status/g;-><init>(Lcom/facebook/backgroundlocation/status/e;Lcom/facebook/backgroundlocation/status/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 41
    return-void
.end method
