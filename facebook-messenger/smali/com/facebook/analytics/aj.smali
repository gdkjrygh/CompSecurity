.class Lcom/facebook/analytics/aj;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/j/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lcom/facebook/analytics/aj;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 304
    invoke-direct {p0, p1}, Lcom/facebook/analytics/aj;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/j/a;
    .locals 3

    .prologue
    .line 307
    new-instance v2, Lcom/facebook/analytics/j/a;

    const-class v0, Lcom/facebook/analytics/ak;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/ak;

    const-class v1, Lcom/facebook/analytics/b/c;

    invoke-virtual {p0, v1}, Lcom/facebook/analytics/aj;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/b/c;

    invoke-direct {v2, v0, v1}, Lcom/facebook/analytics/j/a;-><init>(Lcom/facebook/analytics/ak;Lcom/facebook/analytics/b/c;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 304
    invoke-virtual {p0}, Lcom/facebook/analytics/aj;->a()Lcom/facebook/analytics/j/a;

    move-result-object v0

    return-object v0
.end method
