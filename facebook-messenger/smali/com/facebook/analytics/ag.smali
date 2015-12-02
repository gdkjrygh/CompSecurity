.class Lcom/facebook/analytics/ag;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/cn;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 365
    iput-object p1, p0, Lcom/facebook/analytics/ag;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 365
    invoke-direct {p0, p1}, Lcom/facebook/analytics/ag;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/cn;
    .locals 5

    .prologue
    .line 370
    new-instance v3, Lcom/facebook/analytics/cn;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    const-class v2, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/analytics/module/IsVerboseReliabilityAnalyticsLoggingPermitted;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/analytics/ag;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v2, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/ag;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/hardware/k;

    invoke-direct {v3, v0, v1, v4, v2}, Lcom/facebook/analytics/cn;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;Ljavax/inject/a;Lcom/facebook/common/hardware/k;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 365
    invoke-virtual {p0}, Lcom/facebook/analytics/ag;->a()Lcom/facebook/analytics/cn;

    move-result-object v0

    return-object v0
.end method
