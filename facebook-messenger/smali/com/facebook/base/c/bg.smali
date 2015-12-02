.class Lcom/facebook/base/c/bg;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/v/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 463
    iput-object p1, p0, Lcom/facebook/base/c/bg;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 463
    invoke-direct {p0, p1}, Lcom/facebook/base/c/bg;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/v/f;
    .locals 2

    .prologue
    .line 467
    new-instance v1, Lcom/facebook/common/v/f;

    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    invoke-direct {v1, v0}, Lcom/facebook/common/v/f;-><init>(Lcom/facebook/common/executors/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 463
    invoke-virtual {p0}, Lcom/facebook/base/c/bg;->a()Lcom/facebook/common/v/f;

    move-result-object v0

    return-object v0
.end method
