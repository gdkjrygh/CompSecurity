.class public final Lcom/facebook/abtest/qe/e/c;
.super Lcom/facebook/inject/d;
.source "QuickExperimentLoggerAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/e/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/e/a;
    .locals 2

    .prologue
    .line 13
    new-instance v1, Lcom/facebook/abtest/qe/e/a;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/e/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    invoke-direct {v1, v0}, Lcom/facebook/abtest/qe/e/a;-><init>(Lcom/facebook/analytics/av;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/e/c;->a()Lcom/facebook/abtest/qe/e/a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 19
    instance-of v0, p1, Lcom/facebook/abtest/qe/e/c;

    return v0
.end method
