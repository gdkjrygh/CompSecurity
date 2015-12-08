.class public Lcom/aetn/history/android/historyhere/model/DataCache;
.super Ljava/lang/Object;
.source "DataCache.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "DataCache"

.field private static detailMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v0, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 13
    const-string v0, "DataCache"

    const-string v1, "detailMap is null"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    .line 18
    :goto_0
    return-void

    .line 16
    :cond_0
    const-string v0, "DataCache"

    const-string v1, "detailMap is NOT null"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public getPOIDetail(Ljava/lang/String;)Lcom/aetn/history/android/historyhere/model/POIDetail;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 30
    const/4 v0, 0x0

    .line 31
    .local v0, "targetDetail":Lcom/aetn/history/android/historyhere/model/POIDetail;
    sget-object v1, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 32
    const-string v1, "DataCache"

    const-string v2, "we have the item"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    sget-object v1, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "targetDetail":Lcom/aetn/history/android/historyhere/model/POIDetail;
    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 35
    .restart local v0    # "targetDetail":Lcom/aetn/history/android/historyhere/model/POIDetail;
    :cond_0
    return-object v0
.end method

.method public putPOIDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 3
    .param p1, "detail"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 22
    const-string v0, "DataCache"

    const-string v1, "add this item to the cache"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 24
    sget-object v0, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    const-string v0, "DataCache"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the detailMap is now this large: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/aetn/history/android/historyhere/model/DataCache;->detailMap:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_0
    return-void
.end method
