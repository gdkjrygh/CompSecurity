.class Lcom/facebook/common/e/f;
.super Lcom/facebook/inject/d;
.source "ErrorReportingModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/e/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/e/d;


# direct methods
.method private constructor <init>(Lcom/facebook/common/e/d;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/facebook/common/e/f;->a:Lcom/facebook/common/e/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/e/d;Lcom/facebook/common/e/e;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/common/e/f;-><init>(Lcom/facebook/common/e/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/e/h;
    .locals 6

    .prologue
    .line 34
    new-instance v0, Lcom/facebook/common/e/i;

    const-class v1, Lcom/facebook/common/w/q;

    const-class v2, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/common/e/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/base/IsBetaBuild;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/common/e/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/common/e/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Ljava/util/Random;

    const-class v5, Lcom/facebook/common/random/InsecureRandom;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/common/e/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Random;

    sget-object v5, Lcom/facebook/common/e/i;->a:Ljavax/inject/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/common/e/i;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljava/util/concurrent/ExecutorService;Ljava/util/Random;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/common/e/f;->a()Lcom/facebook/common/e/h;

    move-result-object v0

    return-object v0
.end method
