.class public Lcom/facebook/maps/s;
.super Lcom/facebook/inject/b;
.source "MapsModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 45
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 19
    const-class v0, Lcom/facebook/maps/o;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/maps/u;

    invoke-direct {v1, v2}, Lcom/facebook/maps/u;-><init>(Lcom/facebook/maps/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 21
    const-class v0, Lcom/facebook/maps/r;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/maps/v;

    invoke-direct {v1, v2}, Lcom/facebook/maps/v;-><init>(Lcom/facebook/maps/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 23
    const-class v0, Lcom/facebook/maps/q;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/s;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/maps/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/maps/w;-><init>(Lcom/facebook/maps/s;Lcom/facebook/maps/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 25
    return-void
.end method
