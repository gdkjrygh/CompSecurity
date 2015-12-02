.class Lcom/facebook/base/c/g;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/executors/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 741
    iput-object p1, p0, Lcom/facebook/base/c/g;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 741
    invoke-direct {p0, p1}, Lcom/facebook/base/c/g;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/executors/a;
    .locals 1

    .prologue
    .line 745
    new-instance v0, Lcom/facebook/common/executors/b;

    invoke-direct {v0}, Lcom/facebook/common/executors/b;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 741
    invoke-virtual {p0}, Lcom/facebook/base/c/g;->a()Lcom/facebook/common/executors/a;

    move-result-object v0

    return-object v0
.end method
