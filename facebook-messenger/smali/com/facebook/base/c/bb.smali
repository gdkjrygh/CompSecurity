.class Lcom/facebook/base/c/bb;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/time/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 672
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 672
    invoke-direct {p0}, Lcom/facebook/base/c/bb;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/time/c;
    .locals 1

    .prologue
    .line 676
    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 672
    invoke-virtual {p0}, Lcom/facebook/base/c/bb;->a()Lcom/facebook/common/time/c;

    move-result-object v0

    return-object v0
.end method
