.class Lcom/facebook/orca/l/ad;
.super Ljava/lang/Object;
.source "MergingUtil.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/orca/server/FetchThreadResult;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 911
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/l/x;)V
    .locals 0

    .prologue
    .line 911
    invoke-direct {p0}, Lcom/facebook/orca/l/ad;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadResult;)Ljava/lang/Long;
    .locals 2

    .prologue
    .line 915
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 911
    check-cast p1, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/ad;->a(Lcom/facebook/orca/server/FetchThreadResult;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
