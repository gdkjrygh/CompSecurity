.class Lcom/facebook/config/background/e;
.super Lcom/facebook/inject/d;
.source "ConfigBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/config/background/g;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/config/background/c;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Lcom/facebook/config/background/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/config/background/g;
    .locals 3

    .prologue
    .line 79
    new-instance v1, Lcom/facebook/config/background/g;

    const-class v0, Lcom/facebook/http/protocol/w;

    invoke-virtual {p0, v0}, Lcom/facebook/config/background/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/w;

    const-class v2, Lcom/facebook/config/background/k;

    invoke-virtual {p0, v2}, Lcom/facebook/config/background/e;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/config/background/g;-><init>(Lcom/facebook/http/protocol/w;Ljava/util/Set;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/config/background/e;->a()Lcom/facebook/config/background/g;

    move-result-object v0

    return-object v0
.end method
