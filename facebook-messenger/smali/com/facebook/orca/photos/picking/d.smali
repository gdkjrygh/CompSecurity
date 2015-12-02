.class public final enum Lcom/facebook/orca/photos/picking/d;
.super Ljava/lang/Enum;
.source "MediaChoiceDialog.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/photos/picking/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/photos/picking/d;

.field public static final enum CAMERA:Lcom/facebook/orca/photos/picking/d;

.field public static final enum CANCEL:Lcom/facebook/orca/photos/picking/d;

.field public static final enum GALLERY:Lcom/facebook/orca/photos/picking/d;

.field public static final enum IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/d;

.field public static final enum RECORD_AUDIO:Lcom/facebook/orca/photos/picking/d;

.field public static final enum RECORD_VIDEO:Lcom/facebook/orca/photos/picking/d;

.field public static final enum REMOVE:Lcom/facebook/orca/photos/picking/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 27
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "CAMERA"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->CAMERA:Lcom/facebook/orca/photos/picking/d;

    .line 28
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "GALLERY"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->GALLERY:Lcom/facebook/orca/photos/picking/d;

    .line 29
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "IMAGE_SEARCH"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/d;

    .line 30
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "RECORD_VIDEO"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->RECORD_VIDEO:Lcom/facebook/orca/photos/picking/d;

    .line 31
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "RECORD_AUDIO"

    invoke-direct {v0, v1, v7}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->RECORD_AUDIO:Lcom/facebook/orca/photos/picking/d;

    .line 32
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "REMOVE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->REMOVE:Lcom/facebook/orca/photos/picking/d;

    .line 33
    new-instance v0, Lcom/facebook/orca/photos/picking/d;

    const-string v1, "CANCEL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/photos/picking/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->CANCEL:Lcom/facebook/orca/photos/picking/d;

    .line 26
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/orca/photos/picking/d;

    sget-object v1, Lcom/facebook/orca/photos/picking/d;->CAMERA:Lcom/facebook/orca/photos/picking/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/photos/picking/d;->GALLERY:Lcom/facebook/orca/photos/picking/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/photos/picking/d;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/photos/picking/d;->RECORD_VIDEO:Lcom/facebook/orca/photos/picking/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/photos/picking/d;->RECORD_AUDIO:Lcom/facebook/orca/photos/picking/d;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/photos/picking/d;->REMOVE:Lcom/facebook/orca/photos/picking/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/orca/photos/picking/d;->CANCEL:Lcom/facebook/orca/photos/picking/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/photos/picking/d;->$VALUES:[Lcom/facebook/orca/photos/picking/d;

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
    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/photos/picking/d;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/orca/photos/picking/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/photos/picking/d;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/facebook/orca/photos/picking/d;->$VALUES:[Lcom/facebook/orca/photos/picking/d;

    invoke-virtual {v0}, [Lcom/facebook/orca/photos/picking/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/photos/picking/d;

    return-object v0
.end method
