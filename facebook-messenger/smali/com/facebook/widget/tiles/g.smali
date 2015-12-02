.class Lcom/facebook/widget/tiles/g;
.super Lcom/facebook/inject/d;
.source "DefaultTilesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/widget/tiles/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/widget/tiles/e;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/tiles/e;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/widget/tiles/g;->a:Lcom/facebook/widget/tiles/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/tiles/e;Lcom/facebook/widget/tiles/f;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/widget/tiles/g;-><init>(Lcom/facebook/widget/tiles/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/widget/tiles/c;
    .locals 1

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/widget/tiles/c;

    invoke-direct {v0}, Lcom/facebook/widget/tiles/c;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/widget/tiles/g;->a()Lcom/facebook/widget/tiles/c;

    move-result-object v0

    return-object v0
.end method
