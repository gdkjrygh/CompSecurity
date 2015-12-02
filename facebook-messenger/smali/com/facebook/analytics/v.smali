.class Lcom/facebook/analytics/v;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/b/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lcom/facebook/analytics/v;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 473
    invoke-direct {p0, p1}, Lcom/facebook/analytics/v;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/b/c;
    .locals 5

    .prologue
    .line 476
    const-class v0, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/d;

    .line 477
    invoke-interface {v0}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v1

    .line 478
    invoke-virtual {v1}, Lcom/facebook/common/process/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 479
    const/4 v0, 0x0

    .line 481
    :goto_0
    return-object v0

    :cond_0
    new-instance v3, Lcom/facebook/analytics/b/c;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1}, Lcom/facebook/common/process/c;->c()Ljava/lang/String;

    move-result-object v4

    const-class v1, Lcom/facebook/analytics/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/b/a;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/facebook/analytics/b/c;-><init>(Lcom/facebook/prefs/shared/d;Ljava/lang/String;Lcom/facebook/analytics/b/a;Lcom/facebook/common/time/a;)V

    move-object v0, v3

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 473
    invoke-virtual {p0}, Lcom/facebook/analytics/v;->a()Lcom/facebook/analytics/b/c;

    move-result-object v0

    return-object v0
.end method
