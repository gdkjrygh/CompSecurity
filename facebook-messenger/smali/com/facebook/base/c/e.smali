.class Lcom/facebook/base/c/e;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/debug/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 887
    iput-object p1, p0, Lcom/facebook/base/c/e;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 887
    invoke-direct {p0, p1}, Lcom/facebook/base/c/e;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/debug/a/a;
    .locals 2

    .prologue
    .line 891
    new-instance v1, Lcom/facebook/debug/a/a;

    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    invoke-direct {v1, v0}, Lcom/facebook/debug/a/a;-><init>(Lcom/facebook/common/executors/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 887
    invoke-virtual {p0}, Lcom/facebook/base/c/e;->a()Lcom/facebook/debug/a/a;

    move-result-object v0

    return-object v0
.end method
