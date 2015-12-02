.class Lcom/facebook/base/c/bf;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/v/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 493
    iput-object p1, p0, Lcom/facebook/base/c/bf;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 493
    invoke-direct {p0, p1}, Lcom/facebook/base/c/bf;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/v/i;
    .locals 1

    .prologue
    .line 498
    const-class v0, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/f;

    invoke-virtual {v0}, Lcom/facebook/common/v/f;->a()Lcom/facebook/common/v/i;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 493
    invoke-virtual {p0}, Lcom/facebook/base/c/bf;->a()Lcom/facebook/common/v/i;

    move-result-object v0

    return-object v0
.end method
