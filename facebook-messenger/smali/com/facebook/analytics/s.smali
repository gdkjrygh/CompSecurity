.class public Lcom/facebook/analytics/s;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/cache/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 313
    iput-object p1, p0, Lcom/facebook/analytics/s;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/cache/h;
    .locals 3

    .prologue
    .line 316
    new-instance v2, Lcom/facebook/analytics/cache/h;

    const-class v0, Lcom/facebook/analytics/cache/d;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cache/d;

    const-class v1, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/s;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/ak;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/cache/h;-><init>(Lcom/facebook/analytics/cache/d;Lcom/facebook/analytics/ak;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 313
    invoke-virtual {p0}, Lcom/facebook/analytics/s;->a()Lcom/facebook/analytics/cache/h;

    move-result-object v0

    return-object v0
.end method
