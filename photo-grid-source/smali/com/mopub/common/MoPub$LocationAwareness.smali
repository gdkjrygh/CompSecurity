.class public final enum Lcom/mopub/common/MoPub$LocationAwareness;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/MoPub$LocationAwareness;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

.field public static final enum NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

.field public static final enum TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;

.field private static final synthetic a:[Lcom/mopub/common/MoPub$LocationAwareness;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 13
    new-instance v0, Lcom/mopub/common/MoPub$LocationAwareness;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/MoPub$LocationAwareness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

    new-instance v0, Lcom/mopub/common/MoPub$LocationAwareness;

    const-string v1, "TRUNCATED"

    invoke-direct {v0, v1, v3}, Lcom/mopub/common/MoPub$LocationAwareness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;

    new-instance v0, Lcom/mopub/common/MoPub$LocationAwareness;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1, v4}, Lcom/mopub/common/MoPub$LocationAwareness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mopub/common/MoPub$LocationAwareness;

    sget-object v1, Lcom/mopub/common/MoPub$LocationAwareness;->NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/MoPub$LocationAwareness;->TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/MoPub$LocationAwareness;->DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->a:[Lcom/mopub/common/MoPub$LocationAwareness;

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
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/MoPub$LocationAwareness;
    .locals 1

    .prologue
    .line 13
    const-class v0, Lcom/mopub/common/MoPub$LocationAwareness;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/MoPub$LocationAwareness;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/MoPub$LocationAwareness;
    .locals 1

    .prologue
    .line 13
    sget-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->a:[Lcom/mopub/common/MoPub$LocationAwareness;

    invoke-virtual {v0}, [Lcom/mopub/common/MoPub$LocationAwareness;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/MoPub$LocationAwareness;

    return-object v0
.end method
