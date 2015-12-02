.class Lcom/facebook/analytics/q;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/bp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lcom/facebook/analytics/q;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 282
    invoke-direct {p0, p1}, Lcom/facebook/analytics/q;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/bp;
    .locals 2

    .prologue
    .line 286
    new-instance v1, Lcom/facebook/analytics/bp;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    invoke-direct {v1, v0}, Lcom/facebook/analytics/bp;-><init>(Lcom/facebook/analytics/av;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 282
    invoke-virtual {p0}, Lcom/facebook/analytics/q;->a()Lcom/facebook/analytics/bp;

    move-result-object v0

    return-object v0
.end method
