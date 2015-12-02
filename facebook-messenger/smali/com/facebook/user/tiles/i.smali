.class Lcom/facebook/user/tiles/i;
.super Lcom/facebook/inject/d;
.source "UserTilesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/tiles/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/tiles/g;


# direct methods
.method private constructor <init>(Lcom/facebook/user/tiles/g;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/facebook/user/tiles/i;->a:Lcom/facebook/user/tiles/g;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/user/tiles/g;Lcom/facebook/user/tiles/h;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/user/tiles/i;-><init>(Lcom/facebook/user/tiles/g;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/tiles/a;
    .locals 2

    .prologue
    .line 30
    new-instance v1, Lcom/facebook/user/tiles/a;

    const-class v0, Lcom/facebook/widget/tiles/b;

    invoke-virtual {p0, v0}, Lcom/facebook/user/tiles/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/b;

    invoke-direct {v1, v0}, Lcom/facebook/user/tiles/a;-><init>(Lcom/facebook/widget/tiles/b;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/facebook/user/tiles/i;->a()Lcom/facebook/user/tiles/a;

    move-result-object v0

    return-object v0
.end method
