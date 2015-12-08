.class public final enum Lcom/mopub/common/util/DeviceUtils$ForceOrientation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/util/DeviceUtils$ForceOrientation;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DEVICE_ORIENTATION:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

.field public static final enum FORCE_LANDSCAPE:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

.field public static final enum FORCE_PORTRAIT:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

.field public static final enum UNDEFINED:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

.field private static final synthetic b:[Lcom/mopub/common/util/DeviceUtils$ForceOrientation;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 51
    new-instance v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    const-string v1, "FORCE_PORTRAIT"

    const-string v2, "portrait"

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_PORTRAIT:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    .line 52
    new-instance v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    const-string v1, "FORCE_LANDSCAPE"

    const-string v2, "landscape"

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_LANDSCAPE:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    .line 53
    new-instance v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    const-string v1, "DEVICE_ORIENTATION"

    const-string v2, "device"

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->DEVICE_ORIENTATION:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    .line 54
    new-instance v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    const-string v1, "UNDEFINED"

    const-string v2, ""

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->UNDEFINED:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    .line 50
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_PORTRAIT:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->FORCE_LANDSCAPE:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->DEVICE_ORIENTATION:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->UNDEFINED:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    aput-object v1, v0, v6

    sput-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->b:[Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

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
    .line 58
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 59
    iput-object p3, p0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->a:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public static getForceOrientation(Ljava/lang/String;)Lcom/mopub/common/util/DeviceUtils$ForceOrientation;
    .locals 5

    .prologue
    .line 64
    invoke-static {}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->values()[Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 65
    iget-object v4, v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->a:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 70
    :goto_1
    return-object v0

    .line 64
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 70
    :cond_1
    sget-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->UNDEFINED:Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/util/DeviceUtils$ForceOrientation;
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/util/DeviceUtils$ForceOrientation;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->b:[Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    invoke-virtual {v0}, [Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    return-object v0
.end method
