.class public Lcom/facebook/widget/tiles/e;
.super Lcom/facebook/inject/c;
.source "DefaultTilesModule.java"


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
    const-class v0, Lcom/facebook/widget/tiles/b;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/tiles/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/widget/tiles/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/widget/tiles/h;-><init>(Lcom/facebook/widget/tiles/e;Lcom/facebook/widget/tiles/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 20
    const-class v0, Lcom/facebook/widget/tiles/c;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/tiles/e;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/widget/tiles/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/widget/tiles/g;-><init>(Lcom/facebook/widget/tiles/e;Lcom/facebook/widget/tiles/f;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 23
    return-void
.end method
