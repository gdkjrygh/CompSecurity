.class Lcom/facebook/analytics/u;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/b/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 490
    iput-object p1, p0, Lcom/facebook/analytics/u;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 490
    invoke-direct {p0, p1}, Lcom/facebook/analytics/u;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/b/b;
    .locals 3

    .prologue
    .line 493
    const-class v0, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/d;

    .line 494
    invoke-interface {v0}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    .line 495
    invoke-virtual {v0}, Lcom/facebook/common/process/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 496
    new-instance v2, Lcom/facebook/analytics/b/b;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/analytics/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/b/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/b/b;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/b/a;)V

    move-object v0, v2

    .line 501
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 490
    invoke-virtual {p0}, Lcom/facebook/analytics/u;->a()Lcom/facebook/analytics/b/b;

    move-result-object v0

    return-object v0
.end method
