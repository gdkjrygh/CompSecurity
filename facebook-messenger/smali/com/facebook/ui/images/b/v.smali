.class public final enum Lcom/facebook/ui/images/b/v;
.super Ljava/lang/Enum;
.source "FetchedImage.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/images/b/v;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/images/b/v;

.field public static final enum CACHE:Lcom/facebook/ui/images/b/v;

.field public static final enum DOWNLOADED:Lcom/facebook/ui/images/b/v;

.field public static final enum ERROR:Lcom/facebook/ui/images/b/v;

.field public static final enum MEMORY_CACHE:Lcom/facebook/ui/images/b/v;

.field public static final enum NOT_IN_CACHE_NOT_DOWNLOADED:Lcom/facebook/ui/images/b/v;

.field public static final enum UNDERLYING_IMAGE_IN_CACHE:Lcom/facebook/ui/images/b/v;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 34
    new-instance v0, Lcom/facebook/ui/images/b/v;

    const-string v1, "NOT_IN_CACHE_NOT_DOWNLOADED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/images/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/v;->NOT_IN_CACHE_NOT_DOWNLOADED:Lcom/facebook/ui/images/b/v;

    .line 37
    new-instance v0, Lcom/facebook/ui/images/b/v;

    const-string v1, "MEMORY_CACHE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/ui/images/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/v;->MEMORY_CACHE:Lcom/facebook/ui/images/b/v;

    .line 40
    new-instance v0, Lcom/facebook/ui/images/b/v;

    const-string v1, "CACHE"

    invoke-direct {v0, v1, v5}, Lcom/facebook/ui/images/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/v;->CACHE:Lcom/facebook/ui/images/b/v;

    .line 43
    new-instance v0, Lcom/facebook/ui/images/b/v;

    const-string v1, "UNDERLYING_IMAGE_IN_CACHE"

    invoke-direct {v0, v1, v6}, Lcom/facebook/ui/images/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/v;->UNDERLYING_IMAGE_IN_CACHE:Lcom/facebook/ui/images/b/v;

    .line 46
    new-instance v0, Lcom/facebook/ui/images/b/v;

    const-string v1, "DOWNLOADED"

    invoke-direct {v0, v1, v7}, Lcom/facebook/ui/images/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/v;->DOWNLOADED:Lcom/facebook/ui/images/b/v;

    .line 49
    new-instance v0, Lcom/facebook/ui/images/b/v;

    const-string v1, "ERROR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    .line 32
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/ui/images/b/v;

    sget-object v1, Lcom/facebook/ui/images/b/v;->NOT_IN_CACHE_NOT_DOWNLOADED:Lcom/facebook/ui/images/b/v;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/ui/images/b/v;->MEMORY_CACHE:Lcom/facebook/ui/images/b/v;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/ui/images/b/v;->CACHE:Lcom/facebook/ui/images/b/v;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/ui/images/b/v;->UNDERLYING_IMAGE_IN_CACHE:Lcom/facebook/ui/images/b/v;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/ui/images/b/v;->DOWNLOADED:Lcom/facebook/ui/images/b/v;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/ui/images/b/v;->$VALUES:[Lcom/facebook/ui/images/b/v;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/images/b/v;
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/ui/images/b/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/v;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/images/b/v;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/facebook/ui/images/b/v;->$VALUES:[Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0}, [Lcom/facebook/ui/images/b/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/images/b/v;

    return-object v0
.end method
