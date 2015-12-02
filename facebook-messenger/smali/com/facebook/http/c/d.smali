.class public Lcom/facebook/http/c/d;
.super Ljava/lang/Object;
.source "HttpGateKeeperSetProvider.java"

# interfaces
.implements Lcom/facebook/f/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 2
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
    const-string v0, "fbandroid_ssl_cache_enabled"

    const-string v1, "fbandroid_http_aggressive_retry"

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
