.class Lcom/facebook/abtest/qe/service/module/d;
.super Lcom/facebook/inject/d;
.source "QuickExperimentServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/service/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/service/module/a;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/module/d;->a:Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/module/d;-><init>(Lcom/facebook/abtest/qe/service/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/service/b;
    .locals 3

    .prologue
    .line 117
    new-instance v2, Lcom/facebook/abtest/qe/service/b;

    const-class v0, Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/module/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/g/a;

    const-class v1, Lcom/facebook/abtest/qe/c/e;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/service/module/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/abtest/qe/c/e;

    invoke-direct {v2, v0, v1}, Lcom/facebook/abtest/qe/service/b;-><init>(Lcom/facebook/abtest/qe/g/a;Lcom/facebook/abtest/qe/c/e;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 112
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/d;->a()Lcom/facebook/abtest/qe/service/b;

    move-result-object v0

    return-object v0
.end method
