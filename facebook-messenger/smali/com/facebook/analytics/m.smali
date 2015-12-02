.class Lcom/facebook/analytics/m;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/module/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lcom/facebook/analytics/m;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 429
    invoke-direct {p0, p1}, Lcom/facebook/analytics/m;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/module/b;
    .locals 3

    .prologue
    .line 434
    new-instance v2, Lcom/facebook/analytics/module/b;

    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    const-class v1, Lcom/facebook/device_id/l;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/device_id/l;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/module/b;-><init>(Lcom/facebook/common/e/h;Lcom/facebook/device_id/l;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 429
    invoke-virtual {p0}, Lcom/facebook/analytics/m;->a()Lcom/facebook/analytics/module/b;

    move-result-object v0

    return-object v0
.end method
