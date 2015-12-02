.class Lcom/facebook/base/c/al;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/c/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 585
    iput-object p1, p0, Lcom/facebook/base/c/al;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 585
    invoke-direct {p0, p1}, Lcom/facebook/base/c/al;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/c/i;
    .locals 2

    .prologue
    .line 588
    new-instance v0, Lcom/facebook/common/c/i;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/c/i;-><init>(Ljava/lang/Runtime;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 585
    invoke-virtual {p0}, Lcom/facebook/base/c/al;->a()Lcom/facebook/common/c/i;

    move-result-object v0

    return-object v0
.end method
