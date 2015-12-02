.class Lcom/facebook/widget/tiles/h;
.super Lcom/facebook/inject/d;
.source "DefaultTilesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/widget/tiles/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/widget/tiles/e;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/tiles/e;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/widget/tiles/h;->a:Lcom/facebook/widget/tiles/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/tiles/e;Lcom/facebook/widget/tiles/f;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/widget/tiles/h;-><init>(Lcom/facebook/widget/tiles/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/widget/tiles/b;
    .locals 3

    .prologue
    .line 29
    new-instance v2, Lcom/facebook/widget/tiles/b;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/tiles/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    const-class v1, Lcom/facebook/widget/tiles/c;

    invoke-virtual {p0, v1}, Lcom/facebook/widget/tiles/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/tiles/c;

    invoke-direct {v2, v0, v1}, Lcom/facebook/widget/tiles/b;-><init>(Landroid/content/res/Resources;Lcom/facebook/widget/tiles/c;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/h;->a()Lcom/facebook/widget/tiles/b;

    move-result-object v0

    return-object v0
.end method
