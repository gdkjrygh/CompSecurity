.class Lcom/facebook/analytics/h;
.super Lcom/facebook/inject/d;
.source "AnalyticsClientModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/analytics/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/f;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/f;)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/facebook/analytics/h;->a:Lcom/facebook/analytics/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/f;Lcom/facebook/analytics/g;)V
    .locals 0

    .prologue
    .line 290
    invoke-direct {p0, p1}, Lcom/facebook/analytics/h;-><init>(Lcom/facebook/analytics/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/analytics/a;
    .locals 2

    .prologue
    .line 293
    new-instance v1, Lcom/facebook/analytics/a;

    const-class v0, Lcom/facebook/analytics/b/c;

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/b/c;

    invoke-direct {v1, v0}, Lcom/facebook/analytics/a;-><init>(Lcom/facebook/analytics/b/c;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 290
    invoke-virtual {p0}, Lcom/facebook/analytics/h;->a()Lcom/facebook/analytics/a;

    move-result-object v0

    return-object v0
.end method
