.class Lcom/facebook/base/c/aa;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/u/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 937
    iput-object p1, p0, Lcom/facebook/base/c/aa;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 937
    invoke-direct {p0, p1}, Lcom/facebook/base/c/aa;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/u/a;
    .locals 2

    .prologue
    .line 941
    new-instance v0, Lcom/facebook/common/u/a;

    const-class v1, Lcom/facebook/common/u/b;

    invoke-virtual {p0, v1}, Lcom/facebook/base/c/aa;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/u/a;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 937
    invoke-virtual {p0}, Lcom/facebook/base/c/aa;->a()Lcom/facebook/common/u/a;

    move-result-object v0

    return-object v0
.end method
