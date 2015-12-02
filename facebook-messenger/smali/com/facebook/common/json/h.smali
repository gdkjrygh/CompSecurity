.class Lcom/facebook/common/json/h;
.super Lcom/facebook/inject/d;
.source "FbJsonModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/json/k;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/json/f;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/common/json/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/json/k;
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/common/json/k;

    invoke-direct {v0}, Lcom/facebook/common/json/k;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/facebook/common/json/h;->a()Lcom/facebook/common/json/k;

    move-result-object v0

    return-object v0
.end method
