.class Lcom/facebook/analytics/n;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/bx;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/facebook/analytics/n;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 206
    invoke-direct {p0, p1}, Lcom/facebook/analytics/n;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/bx;
    .locals 1

    .prologue
    .line 211
    const-class v0, Lcom/facebook/analytics/bt;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/bt;

    invoke-virtual {v0}, Lcom/facebook/analytics/bt;->e()Lcom/facebook/analytics/bx;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 206
    invoke-virtual {p0}, Lcom/facebook/analytics/n;->a()Lcom/facebook/analytics/bx;

    move-result-object v0

    return-object v0
.end method
