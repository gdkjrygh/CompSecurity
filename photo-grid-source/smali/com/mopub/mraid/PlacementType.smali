.class public final enum Lcom/mopub/mraid/PlacementType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/mraid/PlacementType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum INLINE:Lcom/mopub/mraid/PlacementType;

.field public static final enum INTERSTITIAL:Lcom/mopub/mraid/PlacementType;

.field private static final synthetic a:[Lcom/mopub/mraid/PlacementType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 6
    new-instance v0, Lcom/mopub/mraid/PlacementType;

    const-string v1, "INLINE"

    invoke-direct {v0, v1, v2}, Lcom/mopub/mraid/PlacementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/PlacementType;->INLINE:Lcom/mopub/mraid/PlacementType;

    .line 7
    new-instance v0, Lcom/mopub/mraid/PlacementType;

    const-string v1, "INTERSTITIAL"

    invoke-direct {v0, v1, v3}, Lcom/mopub/mraid/PlacementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/PlacementType;->INTERSTITIAL:Lcom/mopub/mraid/PlacementType;

    .line 5
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/mopub/mraid/PlacementType;

    sget-object v1, Lcom/mopub/mraid/PlacementType;->INLINE:Lcom/mopub/mraid/PlacementType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mraid/PlacementType;->INTERSTITIAL:Lcom/mopub/mraid/PlacementType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/mopub/mraid/PlacementType;->a:[Lcom/mopub/mraid/PlacementType;

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
    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mraid/PlacementType;
    .locals 1

    .prologue
    .line 5
    const-class v0, Lcom/mopub/mraid/PlacementType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/mraid/PlacementType;

    return-object v0
.end method

.method public static values()[Lcom/mopub/mraid/PlacementType;
    .locals 1

    .prologue
    .line 5
    sget-object v0, Lcom/mopub/mraid/PlacementType;->a:[Lcom/mopub/mraid/PlacementType;

    invoke-virtual {v0}, [Lcom/mopub/mraid/PlacementType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mraid/PlacementType;

    return-object v0
.end method
