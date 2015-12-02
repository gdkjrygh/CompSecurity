.class Lcom/facebook/base/c/aq;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/o/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 857
    iput-object p1, p0, Lcom/facebook/base/c/aq;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 857
    invoke-direct {p0, p1}, Lcom/facebook/base/c/aq;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/o/e;
    .locals 2

    .prologue
    .line 861
    new-instance v1, Lcom/facebook/common/o/e;

    const-class v0, Lcom/facebook/common/time/c;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/aq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-direct {v1, v0}, Lcom/facebook/common/o/e;-><init>(Lcom/facebook/common/time/a;)V

    .line 864
    const-class v0, Landroid/graphics/Rect;

    invoke-virtual {v1, v0}, Lcom/facebook/common/o/e;->a(Ljava/lang/Class;)Lcom/facebook/common/o/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/o/d;->a()Lcom/facebook/common/o/a;

    .line 866
    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 857
    invoke-virtual {p0}, Lcom/facebook/base/c/aq;->a()Lcom/facebook/common/o/e;

    move-result-object v0

    return-object v0
.end method
