.class public Lcom/facebook/analytics/c/c;
.super Lcom/facebook/common/s/a;
.source "AnalyticsDbPropertyKey.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/s/a",
        "<",
        "Lcom/facebook/analytics/c/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/common/s/a;-><init>(Ljava/lang/String;)V

    .line 14
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Lcom/facebook/analytics/c/c;
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/facebook/analytics/c/c;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/c/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected synthetic b(Ljava/lang/String;)Lcom/facebook/common/s/a;
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/c/c;->a(Ljava/lang/String;)Lcom/facebook/analytics/c/c;

    move-result-object v0

    return-object v0
.end method
