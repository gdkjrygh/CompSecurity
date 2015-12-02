.class public final enum Lcom/facebook/user/tiles/f;
.super Ljava/lang/Enum;
.source "UserTileViewParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/user/tiles/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/user/tiles/f;

.field public static final enum PIC_CROP_INFO:Lcom/facebook/user/tiles/f;

.field public static final enum USER_KEY:Lcom/facebook/user/tiles/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-instance v0, Lcom/facebook/user/tiles/f;

    const-string v1, "PIC_CROP_INFO"

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/tiles/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/tiles/f;->PIC_CROP_INFO:Lcom/facebook/user/tiles/f;

    .line 33
    new-instance v0, Lcom/facebook/user/tiles/f;

    const-string v1, "USER_KEY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/user/tiles/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/tiles/f;->USER_KEY:Lcom/facebook/user/tiles/f;

    .line 22
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/user/tiles/f;

    sget-object v1, Lcom/facebook/user/tiles/f;->PIC_CROP_INFO:Lcom/facebook/user/tiles/f;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/user/tiles/f;->USER_KEY:Lcom/facebook/user/tiles/f;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/user/tiles/f;->$VALUES:[Lcom/facebook/user/tiles/f;

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
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/user/tiles/f;
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/user/tiles/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/f;

    return-object v0
.end method

.method public static values()[Lcom/facebook/user/tiles/f;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/user/tiles/f;->$VALUES:[Lcom/facebook/user/tiles/f;

    invoke-virtual {v0}, [Lcom/facebook/user/tiles/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/user/tiles/f;

    return-object v0
.end method
