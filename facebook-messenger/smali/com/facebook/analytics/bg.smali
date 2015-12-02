.class Lcom/facebook/analytics/bg;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/c/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/analytics/bg;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 182
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bg;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/c/g;
    .locals 5

    .prologue
    .line 186
    new-instance v4, Lcom/facebook/analytics/c/g;

    invoke-virtual {p0}, Lcom/facebook/analytics/bg;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/analytics/c/a;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/c/a;

    const-class v2, Lcom/facebook/analytics/c/e;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/c/e;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/analytics/c/g;-><init>(Landroid/content/Context;Lcom/facebook/analytics/c/a;Lcom/facebook/analytics/c/e;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 182
    invoke-virtual {p0}, Lcom/facebook/analytics/bg;->a()Lcom/facebook/analytics/c/g;

    move-result-object v0

    return-object v0
.end method
