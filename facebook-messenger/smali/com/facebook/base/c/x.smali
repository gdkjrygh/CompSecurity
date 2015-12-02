.class Lcom/facebook/base/c/x;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/c/l;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 984
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 984
    invoke-direct {p0}, Lcom/facebook/base/c/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/c/l;
    .locals 2

    .prologue
    .line 990
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/x;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->j()Lcom/facebook/base/j;

    move-result-object v0

    .line 991
    new-instance v1, Lcom/facebook/c/l;

    invoke-direct {v1, v0}, Lcom/facebook/c/l;-><init>(Lcom/facebook/base/j;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 984
    invoke-virtual {p0}, Lcom/facebook/base/c/x;->a()Lcom/facebook/c/l;

    move-result-object v0

    return-object v0
.end method
