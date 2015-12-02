.class public Lcom/facebook/user/tiles/g;
.super Lcom/facebook/inject/c;
.source "UserTilesModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 36
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 17
    new-instance v0, Lcom/facebook/widget/tiles/e;

    invoke-direct {v0}, Lcom/facebook/widget/tiles/e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/facebook/user/tiles/g;->a(Lcom/facebook/inject/ag;)Lcom/facebook/inject/a/e;

    .line 18
    const-class v0, Lcom/facebook/user/tiles/a;

    invoke-virtual {p0, v0}, Lcom/facebook/user/tiles/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/user/tiles/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/user/tiles/i;-><init>(Lcom/facebook/user/tiles/g;Lcom/facebook/user/tiles/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 21
    const-class v0, Lcom/facebook/user/tiles/c;

    invoke-virtual {p0, v0}, Lcom/facebook/user/tiles/g;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/user/tiles/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/user/tiles/j;-><init>(Lcom/facebook/user/tiles/g;Lcom/facebook/user/tiles/h;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 24
    return-void
.end method
