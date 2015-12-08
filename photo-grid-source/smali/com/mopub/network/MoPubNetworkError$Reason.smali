.class public final enum Lcom/mopub/network/MoPubNetworkError$Reason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/network/MoPubNetworkError$Reason;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BAD_BODY:Lcom/mopub/network/MoPubNetworkError$Reason;

.field public static final enum BAD_HEADER_DATA:Lcom/mopub/network/MoPubNetworkError$Reason;

.field public static final enum NO_FILL:Lcom/mopub/network/MoPubNetworkError$Reason;

.field public static final enum TRACKING_FAILURE:Lcom/mopub/network/MoPubNetworkError$Reason;

.field public static final enum UNSPECIFIED:Lcom/mopub/network/MoPubNetworkError$Reason;

.field public static final enum WARMING_UP:Lcom/mopub/network/MoPubNetworkError$Reason;

.field private static final synthetic a:[Lcom/mopub/network/MoPubNetworkError$Reason;


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
    new-instance v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    const-string v1, "WARMING_UP"

    invoke-direct {v0, v1, v3}, Lcom/mopub/network/MoPubNetworkError$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->WARMING_UP:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 12
    new-instance v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    const-string v1, "NO_FILL"

    invoke-direct {v0, v1, v4}, Lcom/mopub/network/MoPubNetworkError$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->NO_FILL:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 13
    new-instance v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    const-string v1, "BAD_HEADER_DATA"

    invoke-direct {v0, v1, v5}, Lcom/mopub/network/MoPubNetworkError$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->BAD_HEADER_DATA:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 14
    new-instance v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    const-string v1, "BAD_BODY"

    invoke-direct {v0, v1, v6}, Lcom/mopub/network/MoPubNetworkError$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->BAD_BODY:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 15
    new-instance v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    const-string v1, "TRACKING_FAILURE"

    invoke-direct {v0, v1, v7}, Lcom/mopub/network/MoPubNetworkError$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->TRACKING_FAILURE:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 16
    new-instance v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/mopub/network/MoPubNetworkError$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->UNSPECIFIED:Lcom/mopub/network/MoPubNetworkError$Reason;

    .line 10
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/mopub/network/MoPubNetworkError$Reason;

    sget-object v1, Lcom/mopub/network/MoPubNetworkError$Reason;->WARMING_UP:Lcom/mopub/network/MoPubNetworkError$Reason;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/network/MoPubNetworkError$Reason;->NO_FILL:Lcom/mopub/network/MoPubNetworkError$Reason;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/network/MoPubNetworkError$Reason;->BAD_HEADER_DATA:Lcom/mopub/network/MoPubNetworkError$Reason;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/network/MoPubNetworkError$Reason;->BAD_BODY:Lcom/mopub/network/MoPubNetworkError$Reason;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/network/MoPubNetworkError$Reason;->TRACKING_FAILURE:Lcom/mopub/network/MoPubNetworkError$Reason;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/mopub/network/MoPubNetworkError$Reason;->UNSPECIFIED:Lcom/mopub/network/MoPubNetworkError$Reason;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->a:[Lcom/mopub/network/MoPubNetworkError$Reason;

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
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/network/MoPubNetworkError$Reason;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/network/MoPubNetworkError$Reason;

    return-object v0
.end method

.method public static values()[Lcom/mopub/network/MoPubNetworkError$Reason;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/mopub/network/MoPubNetworkError$Reason;->a:[Lcom/mopub/network/MoPubNetworkError$Reason;

    invoke-virtual {v0}, [Lcom/mopub/network/MoPubNetworkError$Reason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/network/MoPubNetworkError$Reason;

    return-object v0
.end method
