.class Lcom/facebook/analytics/x;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/ak;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 331
    iput-object p1, p0, Lcom/facebook/analytics/x;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 331
    invoke-direct {p0, p1}, Lcom/facebook/analytics/x;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/ak;
    .locals 1

    .prologue
    .line 335
    new-instance v0, Lcom/facebook/analytics/y;

    invoke-direct {v0, p0}, Lcom/facebook/analytics/y;-><init>(Lcom/facebook/analytics/x;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 331
    invoke-virtual {p0}, Lcom/facebook/analytics/x;->a()Lcom/facebook/analytics/ak;

    move-result-object v0

    return-object v0
.end method
