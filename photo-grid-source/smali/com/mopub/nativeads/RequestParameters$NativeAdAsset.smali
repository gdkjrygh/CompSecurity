.class public final enum Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CALL_TO_ACTION_TEXT:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

.field public static final enum ICON_IMAGE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

.field public static final enum MAIN_IMAGE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

.field public static final enum STAR_RATING:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

.field public static final enum TEXT:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

.field public static final enum TITLE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

.field private static final synthetic b:[Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 13
    new-instance v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    const-string v1, "TITLE"

    const-string v2, "title"

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->TITLE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    .line 14
    new-instance v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    const-string v1, "TEXT"

    const-string v2, "text"

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->TEXT:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    .line 15
    new-instance v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    const-string v1, "ICON_IMAGE"

    const-string v2, "iconimage"

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->ICON_IMAGE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    .line 16
    new-instance v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    const-string v1, "MAIN_IMAGE"

    const-string v2, "mainimage"

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->MAIN_IMAGE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    .line 17
    new-instance v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    const-string v1, "CALL_TO_ACTION_TEXT"

    const-string v2, "ctatext"

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->CALL_TO_ACTION_TEXT:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    .line 18
    new-instance v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    const-string v1, "STAR_RATING"

    const/4 v2, 0x5

    const-string v3, "starrating"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->STAR_RATING:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    .line 12
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    sget-object v1, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->TITLE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->TEXT:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->ICON_IMAGE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->MAIN_IMAGE:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->CALL_TO_ACTION_TEXT:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->STAR_RATING:Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->b:[Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

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
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    iput-object p3, p0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->a:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    return-object v0
.end method

.method public static values()[Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;
    .locals 1

    .prologue
    .line 12
    sget-object v0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->b:[Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;->a:Ljava/lang/String;

    return-object v0
.end method
