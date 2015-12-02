.class Lcom/facebook/base/c/w;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/hardware/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 541
    iput-object p1, p0, Lcom/facebook/base/c/w;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 541
    invoke-direct {p0, p1}, Lcom/facebook/base/c/w;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/hardware/j;
    .locals 1

    .prologue
    .line 544
    new-instance v0, Lcom/facebook/common/hardware/j;

    invoke-direct {v0}, Lcom/facebook/common/hardware/j;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 541
    invoke-virtual {p0}, Lcom/facebook/base/c/w;->a()Lcom/facebook/common/hardware/j;

    move-result-object v0

    return-object v0
.end method
