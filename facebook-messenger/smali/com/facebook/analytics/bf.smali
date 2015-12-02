.class Lcom/facebook/analytics/bf;
.super Lcom/facebook/inject/d;
.source "AnalyticsServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/ay;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/ay;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/analytics/bf;->a:Lcom/facebook/analytics/ay;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/ay;Lcom/facebook/analytics/az;)V
    .locals 0

    .prologue
    .line 145
    invoke-direct {p0, p1}, Lcom/facebook/analytics/bf;-><init>(Lcom/facebook/analytics/ay;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 2

    .prologue
    .line 149
    new-instance v1, Lcom/facebook/analytics/service/q;

    const-class v0, Lcom/facebook/analytics/service/u;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/service/u;

    invoke-direct {v1, v0}, Lcom/facebook/analytics/service/q;-><init>(Lcom/facebook/analytics/service/u;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/facebook/analytics/bf;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
