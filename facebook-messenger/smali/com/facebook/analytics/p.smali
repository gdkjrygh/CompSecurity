.class Lcom/facebook/analytics/p;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/an;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 393
    iput-object p1, p0, Lcom/facebook/analytics/p;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 393
    invoke-direct {p0, p1}, Lcom/facebook/analytics/p;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/an;
    .locals 5

    .prologue
    .line 398
    new-instance v4, Lcom/facebook/analytics/an;

    const-class v0, Lcom/facebook/analytics/ck;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/ck;

    const-class v1, Lcom/facebook/analytics/i/d;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/i/d;

    const-class v2, Lcom/facebook/analytics/au;

    invoke-virtual {p0, v2}, Lcom/facebook/analytics/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/http/b/au;

    const-class v3, Lcom/facebook/http/b/ar;

    invoke-virtual {p0, v3}, Lcom/facebook/analytics/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/http/b/ar;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/analytics/an;-><init>(Lcom/facebook/analytics/ck;Lcom/facebook/analytics/i/d;Lcom/facebook/http/b/au;Lcom/facebook/http/b/ar;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 393
    invoke-virtual {p0}, Lcom/facebook/analytics/p;->a()Lcom/facebook/analytics/an;

    move-result-object v0

    return-object v0
.end method
