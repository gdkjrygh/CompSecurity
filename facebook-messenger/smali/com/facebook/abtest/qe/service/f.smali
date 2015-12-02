.class public final Lcom/facebook/abtest/qe/service/f;
.super Lcom/facebook/inject/d;
.source "QuickExperimentRefresherAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/service/d;",
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
.method public a()Lcom/facebook/abtest/qe/service/d;
    .locals 4

    .prologue
    .line 13
    new-instance v3, Lcom/facebook/abtest/qe/service/d;

    const-class v0, Lcom/facebook/base/broadcast/j;

    const-class v1, Lcom/facebook/base/broadcast/LocalBroadcast;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/abtest/qe/service/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/broadcast/j;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/service/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/service/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/abtest/qe/service/d;-><init>(Lcom/facebook/base/broadcast/j;Lcom/facebook/prefs/shared/d;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/service/f;->a()Lcom/facebook/abtest/qe/service/d;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 22
    instance-of v0, p1, Lcom/facebook/abtest/qe/service/f;

    return v0
.end method
