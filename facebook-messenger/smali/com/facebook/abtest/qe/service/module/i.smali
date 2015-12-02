.class Lcom/facebook/abtest/qe/service/module/i;
.super Lcom/facebook/inject/d;
.source "QuickExperimentServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/protocol/sync/user/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/abtest/qe/service/module/a;


# direct methods
.method private constructor <init>(Lcom/facebook/abtest/qe/service/module/a;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/module/i;->a:Lcom/facebook/abtest/qe/service/module/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/module/a;Lcom/facebook/abtest/qe/service/module/b;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/module/i;-><init>(Lcom/facebook/abtest/qe/service/module/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/protocol/sync/user/a;
    .locals 2

    .prologue
    .line 80
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/user/a;

    new-instance v1, Lcom/facebook/abtest/qe/protocol/sync/user/d;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/protocol/sync/user/d;-><init>()V

    invoke-direct {v0, v1}, Lcom/facebook/abtest/qe/protocol/sync/user/a;-><init>(Lcom/facebook/abtest/qe/protocol/sync/user/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/module/i;->a()Lcom/facebook/abtest/qe/protocol/sync/user/a;

    move-result-object v0

    return-object v0
.end method
