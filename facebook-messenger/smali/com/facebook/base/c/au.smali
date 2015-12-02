.class Lcom/facebook/base/c/au;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/util/Random;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 688
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 688
    invoke-direct {p0}, Lcom/facebook/base/c/au;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Random;
    .locals 1

    .prologue
    .line 692
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 688
    invoke-virtual {p0}, Lcom/facebook/base/c/au;->a()Ljava/util/Random;

    move-result-object v0

    return-object v0
.end method
