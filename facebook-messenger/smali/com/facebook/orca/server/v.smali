.class public final enum Lcom/facebook/orca/server/v;
.super Ljava/lang/Enum;
.source "FetchStickerPacksParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/server/v;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/server/v;

.field public static final enum STORE_PACKS:Lcom/facebook/orca/server/v;

.field public static final enum USER_PACKS:Lcom/facebook/orca/server/v;


# instance fields
.field private mFieldName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 19
    new-instance v0, Lcom/facebook/orca/server/v;

    const-string v1, "USER_PACKS"

    const-string v2, "owned_packs"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/orca/server/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    .line 20
    new-instance v0, Lcom/facebook/orca/server/v;

    const-string v1, "STORE_PACKS"

    const-string v2, "available_packs"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/orca/server/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/server/v;->STORE_PACKS:Lcom/facebook/orca/server/v;

    .line 18
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/server/v;

    sget-object v1, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/server/v;->STORE_PACKS:Lcom/facebook/orca/server/v;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/server/v;->$VALUES:[Lcom/facebook/orca/server/v;

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
    iput-object p3, p0, Lcom/facebook/orca/server/v;->mFieldName:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/server/v;
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/orca/server/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/v;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/server/v;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/orca/server/v;->$VALUES:[Lcom/facebook/orca/server/v;

    invoke-virtual {v0}, [Lcom/facebook/orca/server/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/server/v;

    return-object v0
.end method


# virtual methods
.method public getFieldName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/server/v;->mFieldName:Ljava/lang/String;

    return-object v0
.end method
