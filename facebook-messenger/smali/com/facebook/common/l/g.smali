.class Lcom/facebook/common/l/g;
.super Lcom/facebook/inject/d;
.source "ManifestModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/l/h;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/l/d;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/common/l/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/l/h;
    .locals 3

    .prologue
    .line 28
    new-instance v1, Lcom/facebook/common/l/h;

    invoke-virtual {p0}, Lcom/facebook/common/l/g;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/common/l/h;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/facebook/common/l/g;->a()Lcom/facebook/common/l/h;

    move-result-object v0

    return-object v0
.end method
