.class public Lcom/facebook/analytics/cache/b;
.super Ljava/lang/Object;
.source "CacheAnalyticsGateKeeperSetProvider.java"

# interfaces
.implements Lcom/facebook/f/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 14
    const-string v0, "fb4a_enable_media_cache_logging"

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
