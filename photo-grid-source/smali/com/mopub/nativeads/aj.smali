.class final enum Lcom/mopub/nativeads/aj;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/nativeads/aj;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AD:Lcom/mopub/nativeads/aj;

.field public static final enum EMPTY:Lcom/mopub/nativeads/aj;

.field private static final synthetic a:[Lcom/mopub/nativeads/aj;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-instance v0, Lcom/mopub/nativeads/aj;

    const-string v1, "EMPTY"

    invoke-direct {v0, v1, v2}, Lcom/mopub/nativeads/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/aj;->EMPTY:Lcom/mopub/nativeads/aj;

    .line 26
    new-instance v0, Lcom/mopub/nativeads/aj;

    const-string v1, "AD"

    invoke-direct {v0, v1, v3}, Lcom/mopub/nativeads/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/nativeads/aj;->AD:Lcom/mopub/nativeads/aj;

    .line 23
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/mopub/nativeads/aj;

    sget-object v1, Lcom/mopub/nativeads/aj;->EMPTY:Lcom/mopub/nativeads/aj;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/nativeads/aj;->AD:Lcom/mopub/nativeads/aj;

    aput-object v1, v0, v3

    sput-object v0, Lcom/mopub/nativeads/aj;->a:[Lcom/mopub/nativeads/aj;

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
    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/aj;
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/mopub/nativeads/aj;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/aj;

    return-object v0
.end method

.method public static values()[Lcom/mopub/nativeads/aj;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/mopub/nativeads/aj;->a:[Lcom/mopub/nativeads/aj;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/aj;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/aj;

    return-object v0
.end method
