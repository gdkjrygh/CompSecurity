.class public final enum Lcom/facebook/analytics/cache/g;
.super Ljava/lang/Enum;
.source "CacheTracker.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/analytics/cache/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/analytics/cache/g;

.field public static final enum CACHE_FULL:Lcom/facebook/analytics/cache/g;

.field public static final enum CONTENT_STALE:Lcom/facebook/analytics/cache/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 33
    new-instance v0, Lcom/facebook/analytics/cache/g;

    const-string v1, "CACHE_FULL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/analytics/cache/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/cache/g;->CACHE_FULL:Lcom/facebook/analytics/cache/g;

    .line 34
    new-instance v0, Lcom/facebook/analytics/cache/g;

    const-string v1, "CONTENT_STALE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/cache/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/analytics/cache/g;->CONTENT_STALE:Lcom/facebook/analytics/cache/g;

    .line 32
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/analytics/cache/g;

    sget-object v1, Lcom/facebook/analytics/cache/g;->CACHE_FULL:Lcom/facebook/analytics/cache/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/analytics/cache/g;->CONTENT_STALE:Lcom/facebook/analytics/cache/g;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/analytics/cache/g;->$VALUES:[Lcom/facebook/analytics/cache/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/analytics/cache/g;
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/analytics/cache/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cache/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/analytics/cache/g;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/facebook/analytics/cache/g;->$VALUES:[Lcom/facebook/analytics/cache/g;

    invoke-virtual {v0}, [Lcom/facebook/analytics/cache/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/analytics/cache/g;

    return-object v0
.end method
