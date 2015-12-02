.class Lcom/facebook/analytics/t;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 506
    iput-object p1, p0, Lcom/facebook/analytics/t;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 506
    invoke-direct {p0, p1}, Lcom/facebook/analytics/t;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/b/a;
    .locals 1

    .prologue
    .line 509
    new-instance v0, Lcom/facebook/analytics/b/a;

    invoke-direct {v0}, Lcom/facebook/analytics/b/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 506
    invoke-virtual {p0}, Lcom/facebook/analytics/t;->a()Lcom/facebook/analytics/b/a;

    move-result-object v0

    return-object v0
.end method
