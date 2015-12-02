.class public Lcom/facebook/appconfig/f;
.super Lcom/facebook/inject/c;
.source "AppConfigModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 75
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 22
    const-class v0, Lcom/facebook/appconfig/b;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/appconfig/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/appconfig/h;-><init>(Lcom/facebook/appconfig/f;Lcom/facebook/appconfig/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 25
    const-class v0, Lcom/facebook/appconfig/o;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/appconfig/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/appconfig/k;-><init>(Lcom/facebook/appconfig/f;Lcom/facebook/appconfig/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 27
    const-class v0, Lcom/facebook/appconfig/c;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/appconfig/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/appconfig/i;-><init>(Lcom/facebook/appconfig/f;Lcom/facebook/appconfig/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 30
    const-class v0, Lcom/facebook/appconfig/m;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/appconfig/j;

    invoke-direct {v1, v2}, Lcom/facebook/appconfig/j;-><init>(Lcom/facebook/appconfig/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 35
    const-class v0, Lcom/facebook/auth/a/c;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/appconfig/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 37
    const-class v0, Lcom/facebook/config/background/k;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/appconfig/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 39
    return-void
.end method
