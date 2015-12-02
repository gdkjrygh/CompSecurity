.class public Lcom/facebook/location/s;
.super Lcom/facebook/inject/c;
.source "LocationModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 103
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 28
    const-class v0, Lcom/facebook/location/r;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/y;

    invoke-direct {v1, p0, v2}, Lcom/facebook/location/y;-><init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 31
    const-class v0, Lcom/facebook/location/h;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/location/w;-><init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 33
    const-class v0, Lcom/facebook/location/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/location/z;-><init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 36
    const-class v0, Lcom/facebook/location/c;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/u;

    invoke-direct {v1, v2}, Lcom/facebook/location/u;-><init>(Lcom/facebook/location/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 39
    const-class v0, Lcom/facebook/location/d;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/location/v;-><init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 42
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/location/r;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 44
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/location/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 47
    const-class v0, Lcom/facebook/analytics/d/a;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/location/q;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 49
    const-class v0, Lcom/facebook/location/q;

    invoke-virtual {p0, v0}, Lcom/facebook/location/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/location/x;

    invoke-direct {v1, p0, v2}, Lcom/facebook/location/x;-><init>(Lcom/facebook/location/s;Lcom/facebook/location/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 52
    return-void
.end method
