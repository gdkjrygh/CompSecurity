.class Lcom/facebook/analytics/i;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/i/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 351
    iput-object p1, p0, Lcom/facebook/analytics/i;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 351
    invoke-direct {p0, p1}, Lcom/facebook/analytics/i;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/i/a;
    .locals 7

    .prologue
    .line 354
    new-instance v0, Lcom/facebook/analytics/i/a;

    const-class v1, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/hardware/k;

    const-class v2, Lcom/facebook/analytics/a;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/a;

    const-class v3, Lcom/facebook/analytics/cache/d;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/cache/d;

    const-class v4, Lcom/facebook/analytics/j/a;

    invoke-virtual {p0, v4}, Lcom/facebook/analytics/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/analytics/j/a;

    const-class v5, Lcom/facebook/analytics/d/a;

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/i;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v5

    const-class v6, Lcom/facebook/analytics/b/b;

    invoke-virtual {p0, v6}, Lcom/facebook/analytics/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/analytics/b/b;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/analytics/i/a;-><init>(Lcom/facebook/common/hardware/k;Lcom/facebook/analytics/a;Lcom/facebook/analytics/cache/d;Lcom/facebook/analytics/j/a;Ljava/util/Set;Lcom/facebook/analytics/b/b;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 351
    invoke-virtual {p0}, Lcom/facebook/analytics/i;->a()Lcom/facebook/analytics/i/a;

    move-result-object v0

    return-object v0
.end method
