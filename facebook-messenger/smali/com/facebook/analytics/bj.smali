.class Lcom/facebook/analytics/bj;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/service/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/facebook/analytics/bj;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 248
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bj;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/service/r;
    .locals 3

    .prologue
    .line 253
    new-instance v2, Lcom/facebook/analytics/service/r;

    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    const-class v1, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/bj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/ak;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/service/r;-><init>(Lcom/facebook/fbservice/ops/k;Lcom/facebook/analytics/ak;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 248
    invoke-virtual {p0}, Lcom/facebook/analytics/bj;->a()Lcom/facebook/analytics/service/r;

    move-result-object v0

    return-object v0
.end method
