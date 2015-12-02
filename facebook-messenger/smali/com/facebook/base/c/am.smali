.class Lcom/facebook/base/c/am;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/time/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 680
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 680
    invoke-direct {p0}, Lcom/facebook/base/c/am;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/time/b;
    .locals 1

    .prologue
    .line 684
    new-instance v0, Lcom/facebook/common/time/b;

    invoke-direct {v0}, Lcom/facebook/common/time/b;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 680
    invoke-virtual {p0}, Lcom/facebook/base/c/am;->a()Lcom/facebook/common/time/b;

    move-result-object v0

    return-object v0
.end method
