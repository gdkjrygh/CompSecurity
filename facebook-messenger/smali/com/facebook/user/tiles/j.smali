.class Lcom/facebook/user/tiles/j;
.super Lcom/facebook/inject/d;
.source "UserTilesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/tiles/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/tiles/g;


# direct methods
.method private constructor <init>(Lcom/facebook/user/tiles/g;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/user/tiles/j;->a:Lcom/facebook/user/tiles/g;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/user/tiles/g;Lcom/facebook/user/tiles/h;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/user/tiles/j;-><init>(Lcom/facebook/user/tiles/g;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/tiles/c;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/user/tiles/c;

    const-class v1, Lcom/facebook/user/p;

    invoke-virtual {p0, v1}, Lcom/facebook/user/tiles/j;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/http/c/i;

    invoke-virtual {p0, v2}, Lcom/facebook/user/tiles/j;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/tiles/c;-><init>(Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/user/tiles/j;->a()Lcom/facebook/user/tiles/c;

    move-result-object v0

    return-object v0
.end method
