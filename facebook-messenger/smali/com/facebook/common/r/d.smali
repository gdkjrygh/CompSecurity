.class Lcom/facebook/common/r/d;
.super Lcom/facebook/inject/d;
.source "TimeFormatModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/r/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/r/b;


# direct methods
.method private constructor <init>(Lcom/facebook/common/r/b;)V
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/facebook/common/r/d;->a:Lcom/facebook/common/r/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/r/b;Lcom/facebook/common/r/c;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/common/r/d;-><init>(Lcom/facebook/common/r/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/r/e;
    .locals 3

    .prologue
    .line 27
    new-instance v2, Lcom/facebook/common/r/a;

    invoke-virtual {p0}, Lcom/facebook/common/r/d;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/time/c;

    invoke-virtual {p0, v1}, Lcom/facebook/common/r/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/common/r/a;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0}, Lcom/facebook/common/r/d;->a()Lcom/facebook/common/r/e;

    move-result-object v0

    return-object v0
.end method
