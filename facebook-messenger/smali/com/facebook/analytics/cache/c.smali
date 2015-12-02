.class public final enum Lcom/facebook/analytics/cache/c;
.super Ljava/lang/Enum;
.source "CacheCounterType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/cache/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/cache/c;

.field public static final enum BYTES_COUNT:Lcom/facebook/analytics/cache/c;

.field public static final enum ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

.field public static final enum EVICTIONS_ON_CACHE_FULL_CALL:Lcom/facebook/analytics/cache/c;

.field public static final enum EVICTIONS_ON_CACHE_FULL_ITEM:Lcom/facebook/analytics/cache/c;

.field public static final enum EVICTIONS_ON_CACHE_FULL_SIZE:Lcom/facebook/analytics/cache/c;

.field public static final enum EVICTIONS_ON_CONTENT_STALE_CALL:Lcom/facebook/analytics/cache/c;

.field public static final enum EVICTIONS_ON_CONTENT_STALE_ITEM:Lcom/facebook/analytics/cache/c;

.field public static final enum EVICTIONS_ON_CONTENT_STALE_SIZE:Lcom/facebook/analytics/cache/c;

.field public static final enum HITS_COUNT:Lcom/facebook/analytics/cache/c;

.field public static final enum INSERTION_ITEM:Lcom/facebook/analytics/cache/c;

.field public static final enum INSERTION_SIZE:Lcom/facebook/analytics/cache/c;

.field public static final enum MISSES_COUNT:Lcom/facebook/analytics/cache/c;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 9
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "HITS_COUNT"

    const-string v2, "hits"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->HITS_COUNT:Lcom/facebook/analytics/cache/c;

    .line 10
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "MISSES_COUNT"

    const-string v2, "misses"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->MISSES_COUNT:Lcom/facebook/analytics/cache/c;

    .line 11
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "BYTES_COUNT"

    const-string v2, "bytes"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    .line 12
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "ENTRIES_COUNT"

    const-string v2, "entries"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    .line 13
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "EVICTIONS_ON_CACHE_FULL_CALL"

    const-string v2, "eviction_on_cache_full_call"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_CALL:Lcom/facebook/analytics/cache/c;

    .line 14
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "EVICTIONS_ON_CACHE_FULL_ITEM"

    const/4 v2, 0x5

    const-string v3, "eviction_on_cache_full_item"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_ITEM:Lcom/facebook/analytics/cache/c;

    .line 15
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "EVICTIONS_ON_CACHE_FULL_SIZE"

    const/4 v2, 0x6

    const-string v3, "eviction_on_cache_full_size"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_SIZE:Lcom/facebook/analytics/cache/c;

    .line 16
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "EVICTIONS_ON_CONTENT_STALE_CALL"

    const/4 v2, 0x7

    const-string v3, "eviction_on_stale_call"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_CALL:Lcom/facebook/analytics/cache/c;

    .line 17
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "EVICTIONS_ON_CONTENT_STALE_ITEM"

    const/16 v2, 0x8

    const-string v3, "eviction_on_stale_item"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_ITEM:Lcom/facebook/analytics/cache/c;

    .line 18
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "EVICTIONS_ON_CONTENT_STALE_SIZE"

    const/16 v2, 0x9

    const-string v3, "eviction_on_stale_size"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_SIZE:Lcom/facebook/analytics/cache/c;

    .line 19
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "INSERTION_ITEM"

    const/16 v2, 0xa

    const-string v3, "insertion_item"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->INSERTION_ITEM:Lcom/facebook/analytics/cache/c;

    .line 20
    new-instance v0, Lcom/facebook/analytics/cache/c;

    const-string v1, "INSERTION_SIZE"

    const/16 v2, 0xb

    const-string v3, "insertion_size"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/analytics/cache/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/analytics/cache/c;->INSERTION_SIZE:Lcom/facebook/analytics/cache/c;

    .line 8
    const/16 v0, 0xc

    new-array v0, v0, [Lcom/facebook/analytics/cache/c;

    sget-object v1, Lcom/facebook/analytics/cache/c;->HITS_COUNT:Lcom/facebook/analytics/cache/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/analytics/cache/c;->MISSES_COUNT:Lcom/facebook/analytics/cache/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/analytics/cache/c;->BYTES_COUNT:Lcom/facebook/analytics/cache/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/analytics/cache/c;->ENTRIES_COUNT:Lcom/facebook/analytics/cache/c;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_CALL:Lcom/facebook/analytics/cache/c;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_ITEM:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CACHE_FULL_SIZE:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_CALL:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_ITEM:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/analytics/cache/c;->EVICTIONS_ON_CONTENT_STALE_SIZE:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/facebook/analytics/cache/c;->INSERTION_ITEM:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/facebook/analytics/cache/c;->INSERTION_SIZE:Lcom/facebook/analytics/cache/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/analytics/cache/c;->$VALUES:[Lcom/facebook/analytics/cache/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    iput-object p3, p0, Lcom/facebook/analytics/cache/c;->name:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/cache/c;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/analytics/cache/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cache/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/cache/c;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/analytics/cache/c;->$VALUES:[Lcom/facebook/analytics/cache/c;

    invoke-virtual {v0}, [Lcom/facebook/analytics/cache/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/cache/c;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/analytics/cache/c;->name:Ljava/lang/String;

    return-object v0
.end method
