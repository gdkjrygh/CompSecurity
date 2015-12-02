.class Lcom/facebook/analytics/k;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/au;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 407
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 407
    invoke-direct {p0}, Lcom/facebook/analytics/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/au;
    .locals 5

    .prologue
    .line 412
    new-instance v4, Lcom/facebook/analytics/au;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    const-class v1, Lcom/facebook/http/b/ar;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/b/ar;

    const-class v2, Landroid/net/ConnectivityManager;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    const-class v3, Lcom/facebook/analytics/g/g;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/g/e;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/analytics/au;-><init>(Lcom/facebook/analytics/av;Lcom/facebook/http/b/ar;Landroid/net/ConnectivityManager;Lcom/facebook/analytics/g/e;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 407
    invoke-virtual {p0}, Lcom/facebook/analytics/k;->a()Lcom/facebook/analytics/au;

    move-result-object v0

    return-object v0
.end method
