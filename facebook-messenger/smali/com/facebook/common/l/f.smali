.class Lcom/facebook/common/l/f;
.super Lcom/facebook/inject/d;
.source "ManifestModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/l/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/l/d;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/common/l/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/l/b;
    .locals 3

    .prologue
    .line 44
    new-instance v2, Lcom/facebook/common/l/b;

    invoke-virtual {p0}, Lcom/facebook/common/l/f;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/l/h;

    invoke-virtual {p0, v1}, Lcom/facebook/common/l/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/l/h;

    invoke-direct {v2, v0, v1}, Lcom/facebook/common/l/b;-><init>(Landroid/content/Context;Lcom/facebook/common/l/h;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/common/l/f;->a()Lcom/facebook/common/l/b;

    move-result-object v0

    return-object v0
.end method
