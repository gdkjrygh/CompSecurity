.class Lcom/facebook/analytics/bl;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/periodicreporters/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lcom/facebook/analytics/bl;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 281
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bl;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/periodicreporters/e;
    .locals 6

    .prologue
    .line 286
    new-instance v0, Lcom/facebook/analytics/periodicreporters/e;

    invoke-virtual {p0}, Lcom/facebook/analytics/bl;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/analytics/c/e;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/bl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/c/e;

    const-class v3, Landroid/content/pm/PackageManager;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/bl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/PackageManager;

    const-class v4, Landroid/app/ActivityManager;

    invoke-virtual {p0, v4}, Lcom/facebook/analytics/bl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/ActivityManager;

    const-class v5, Lcom/facebook/analytics/periodicreporters/j;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/bl;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/periodicreporters/e;-><init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Landroid/content/pm/PackageManager;Landroid/app/ActivityManager;Ljava/lang/Iterable;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 281
    invoke-virtual {p0}, Lcom/facebook/analytics/bl;->a()Lcom/facebook/analytics/periodicreporters/e;

    move-result-object v0

    return-object v0
.end method
