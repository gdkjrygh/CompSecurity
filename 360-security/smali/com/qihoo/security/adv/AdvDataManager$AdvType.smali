.class public final enum Lcom/qihoo/security/adv/AdvDataManager$AdvType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/adv/AdvDataManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AdvType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AppLockAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum BatteryLifeAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum BoosterResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum CleanDeepResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum CleanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum FaceBookAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum PrepareAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum VirusFullScanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field public static final enum VirusResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field private static final synthetic e:[Lcom/qihoo/security/adv/AdvDataManager$AdvType;


# instance fields
.field private a:Z

.field private b:Z

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .prologue
    const/4 v15, 0x4

    const/4 v14, 0x3

    const/4 v13, 0x2

    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 137
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "PrepareAdvData"

    const/16 v3, 0x24

    move v4, v2

    move v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;IIIZZ)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->PrepareAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 142
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "BoosterResultAdvData"

    const/16 v3, 0x1e

    invoke-direct {v0, v1, v5, v3, v2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BoosterResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 146
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "BatteryLifeAdvData"

    const/16 v3, 0x15

    invoke-direct {v0, v1, v13, v3, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BatteryLifeAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 151
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "CleanResultAdvData"

    const/16 v3, 0x1f

    invoke-direct {v0, v1, v14, v3, v2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 155
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "CleanDeepResultAdvData"

    const/16 v3, 0x22

    invoke-direct {v0, v1, v15, v3, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanDeepResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 160
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "VirusResultAdvData"

    const/4 v3, 0x5

    const/16 v4, 0x20

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 164
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "VirusFullScanResultAdvData"

    const/4 v3, 0x6

    const/16 v4, 0x21

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusFullScanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 169
    new-instance v6, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v7, "AppLockAdvData"

    const/4 v8, 0x7

    const/16 v9, 0x1b

    move v10, v2

    move v11, v5

    move v12, v5

    invoke-direct/range {v6 .. v12}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;IIIZZ)V

    sput-object v6, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->AppLockAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 174
    new-instance v6, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v7, "FaceBookAdvData"

    const/16 v8, 0x8

    const/16 v9, 0x23

    move v10, v2

    move v11, v5

    invoke-direct/range {v6 .. v11}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;IIIZ)V

    sput-object v6, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->FaceBookAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 178
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "GameBoosterAddRecmdAdvData"

    const/16 v3, 0x9

    const/16 v4, 0x2b

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 183
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "GameBoosterFolderAllLikeData"

    const/16 v3, 0xa

    const/16 v4, 0x2d

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 187
    new-instance v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    const-string/jumbo v1, "GameBoosterFolderHotAdvData"

    const/16 v3, 0xb

    const/16 v4, 0x2c

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 133
    const/16 v0, 0xc

    new-array v0, v0, [Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->PrepareAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BoosterResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->BatteryLifeAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->CleanDeepResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v1, v0, v15

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->VirusFullScanResultAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->AppLockAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->FaceBookAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->e:[Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 250
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 192
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 194
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    .line 251
    iput p3, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->c:I

    .line 252
    iput p4, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->d:I

    .line 253
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 238
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 192
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 194
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    .line 239
    iput p3, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->c:I

    .line 240
    iput p4, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->d:I

    .line 241
    iput-boolean p5, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 242
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZZ)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 224
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 192
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 194
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    .line 225
    iput p3, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->c:I

    .line 226
    iput p4, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->d:I

    .line 227
    iput-boolean p5, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 228
    iput-boolean p6, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    .line 229
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 211
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 192
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 194
    iput-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    .line 212
    iput p3, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->c:I

    .line 213
    iput-boolean p4, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 214
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z
    .locals 1

    .prologue
    .line 133
    iget-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Z
    .locals 1

    .prologue
    .line 133
    iget-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/adv/AdvDataManager$AdvType;
    .locals 1

    .prologue
    .line 133
    const-class v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/adv/AdvDataManager$AdvType;
    .locals 1

    .prologue
    .line 133
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->e:[Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0}, [Lcom/qihoo/security/adv/AdvDataManager$AdvType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    return-object v0
.end method


# virtual methods
.method public getMid()I
    .locals 1

    .prologue
    .line 280
    iget v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->c:I

    return v0
.end method

.method public getType()I
    .locals 1

    .prologue
    .line 272
    iget v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->d:I

    return v0
.end method

.method public isShouldCache()Z
    .locals 1

    .prologue
    .line 256
    iget-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    return v0
.end method

.method public isShouldPreLoadImg()Z
    .locals 1

    .prologue
    .line 264
    iget-boolean v0, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    return v0
.end method

.method public setMid(I)V
    .locals 0

    .prologue
    .line 284
    iput p1, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->c:I

    .line 285
    return-void
.end method

.method public setShouldCache(Z)V
    .locals 0

    .prologue
    .line 260
    iput-boolean p1, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->a:Z

    .line 261
    return-void
.end method

.method public setShouldPreLoadImg(Z)V
    .locals 0

    .prologue
    .line 268
    iput-boolean p1, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->b:Z

    .line 269
    return-void
.end method

.method public setType(I)V
    .locals 0

    .prologue
    .line 276
    iput p1, p0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->d:I

    .line 277
    return-void
.end method
