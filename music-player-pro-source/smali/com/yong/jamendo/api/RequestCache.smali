.class public Lcom/yong/jamendo/api/RequestCache;
.super Ljava/lang/Object;
.source "RequestCache.java"


# static fields
.field private static CACHE_LIMIT:I


# instance fields
.field private cache:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private history:Ljava/util/LinkedList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const/16 v0, 0xa

    sput v0, Lcom/yong/jamendo/api/RequestCache;->CACHE_LIMIT:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/yong/jamendo/api/RequestCache;->history:Ljava/util/LinkedList;

    .line 20
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/yong/jamendo/api/RequestCache;->cache:Ljava/util/Hashtable;

    .line 21
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 35
    iget-object v0, p0, Lcom/yong/jamendo/api/RequestCache;->cache:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;

    .prologue
    .line 25
    iget-object v1, p0, Lcom/yong/jamendo/api/RequestCache;->history:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v1, p0, Lcom/yong/jamendo/api/RequestCache;->history:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    sget v2, Lcom/yong/jamendo/api/RequestCache;->CACHE_LIMIT:I

    if-le v1, v2, :cond_0

    .line 28
    iget-object v1, p0, Lcom/yong/jamendo/api/RequestCache;->history:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 29
    .local v0, "old_url":Ljava/lang/String;
    iget-object v1, p0, Lcom/yong/jamendo/api/RequestCache;->cache:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .end local v0    # "old_url":Ljava/lang/String;
    :cond_0
    iget-object v1, p0, Lcom/yong/jamendo/api/RequestCache;->cache:Ljava/util/Hashtable;

    invoke-virtual {v1, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    return-void
.end method
