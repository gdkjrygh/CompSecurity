.class public final enum Lcom/facebook/fbservice/c/b;
.super Ljava/lang/Enum;
.source "DataFreshnessResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/fbservice/c/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/fbservice/c/b;

.field public static final enum FROM_CACHE_HAD_SERVER_ERROR:Lcom/facebook/fbservice/c/b;

.field public static final enum FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

.field public static final enum FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

.field public static final enum FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

.field public static final enum FROM_SERVER:Lcom/facebook/fbservice/c/b;

.field public static final enum NO_DATA:Lcom/facebook/fbservice/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 11
    new-instance v0, Lcom/facebook/fbservice/c/b;

    const-string v1, "FROM_SERVER"

    invoke-direct {v0, v1, v3}, Lcom/facebook/fbservice/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    .line 15
    new-instance v0, Lcom/facebook/fbservice/c/b;

    const-string v1, "FROM_CACHE_UP_TO_DATE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/fbservice/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    .line 18
    new-instance v0, Lcom/facebook/fbservice/c/b;

    const-string v1, "FROM_CACHE_STALE"

    invoke-direct {v0, v1, v5}, Lcom/facebook/fbservice/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    .line 21
    new-instance v0, Lcom/facebook/fbservice/c/b;

    const-string v1, "NO_DATA"

    invoke-direct {v0, v1, v6}, Lcom/facebook/fbservice/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    .line 24
    new-instance v0, Lcom/facebook/fbservice/c/b;

    const-string v1, "FROM_CACHE_INCOMPLETE"

    invoke-direct {v0, v1, v7}, Lcom/facebook/fbservice/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

    .line 28
    new-instance v0, Lcom/facebook/fbservice/c/b;

    const-string v1, "FROM_CACHE_HAD_SERVER_ERROR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/c/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_HAD_SERVER_ERROR:Lcom/facebook/fbservice/c/b;

    .line 8
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/fbservice/c/b;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_CACHE_HAD_SERVER_ERROR:Lcom/facebook/fbservice/c/b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/fbservice/c/b;->$VALUES:[Lcom/facebook/fbservice/c/b;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/c/b;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/fbservice/c/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/c/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/fbservice/c/b;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/fbservice/c/b;->$VALUES:[Lcom/facebook/fbservice/c/b;

    invoke-virtual {v0}, [Lcom/facebook/fbservice/c/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/fbservice/c/b;

    return-object v0
.end method
