.class public final enum Lcom/facebook/cache/l;
.super Ljava/lang/Enum;
.source "CacheType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/cache/l;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/cache/l;

.field public static final enum ALL:Lcom/facebook/cache/l;

.field public static final enum DATABASE:Lcom/facebook/cache/l;

.field public static final enum FILE:Lcom/facebook/cache/l;

.field public static final enum MEMORY:Lcom/facebook/cache/l;


# instance fields
.field private final mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 9
    new-instance v0, Lcom/facebook/cache/l;

    const-string v1, "MEMORY"

    const-string v2, "memory"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/cache/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/cache/l;->MEMORY:Lcom/facebook/cache/l;

    .line 10
    new-instance v0, Lcom/facebook/cache/l;

    const-string v1, "DATABASE"

    const-string v2, "database"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/cache/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/cache/l;->DATABASE:Lcom/facebook/cache/l;

    .line 11
    new-instance v0, Lcom/facebook/cache/l;

    const-string v1, "FILE"

    const-string v2, "file"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/cache/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/cache/l;->FILE:Lcom/facebook/cache/l;

    .line 12
    new-instance v0, Lcom/facebook/cache/l;

    const-string v1, "ALL"

    const-string v2, "all"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/cache/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/cache/l;->ALL:Lcom/facebook/cache/l;

    .line 8
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/cache/l;

    sget-object v1, Lcom/facebook/cache/l;->MEMORY:Lcom/facebook/cache/l;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/cache/l;->DATABASE:Lcom/facebook/cache/l;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/cache/l;->FILE:Lcom/facebook/cache/l;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/cache/l;->ALL:Lcom/facebook/cache/l;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/cache/l;->$VALUES:[Lcom/facebook/cache/l;

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
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    iput-object p3, p0, Lcom/facebook/cache/l;->mName:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/cache/l;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/cache/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/cache/l;

    return-object v0
.end method

.method public static values()[Lcom/facebook/cache/l;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/cache/l;->$VALUES:[Lcom/facebook/cache/l;

    invoke-virtual {v0}, [Lcom/facebook/cache/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/cache/l;

    return-object v0
.end method
