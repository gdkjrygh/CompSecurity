.class Lcom/facebook/analytics/bb;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/c/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lcom/facebook/analytics/bb;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 167
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bb;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/c/d;
    .locals 1

    .prologue
    .line 171
    new-instance v0, Lcom/facebook/analytics/c/d;

    invoke-direct {v0}, Lcom/facebook/analytics/c/d;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 167
    invoke-virtual {p0}, Lcom/facebook/analytics/bb;->a()Lcom/facebook/analytics/c/d;

    move-result-object v0

    return-object v0
.end method
