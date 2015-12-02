.class public final enum Lcom/facebook/orca/photos/picking/b;
.super Ljava/lang/Enum;
.source "MediaChoiceDialog.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/photos/picking/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/photos/picking/b;

.field public static final enum CAMERA:Lcom/facebook/orca/photos/picking/b;

.field public static final enum GALLERY:Lcom/facebook/orca/photos/picking/b;

.field public static final enum IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/b;

.field public static final enum RECORD_AUDIO:Lcom/facebook/orca/photos/picking/b;

.field public static final enum RECORD_VIDEO:Lcom/facebook/orca/photos/picking/b;

.field public static final enum REMOVE:Lcom/facebook/orca/photos/picking/b;


# instance fields
.field private final buttonId:I

.field private final result:Lcom/facebook/orca/photos/picking/d;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 37
    new-instance v0, Lcom/facebook/orca/photos/picking/b;

    const-string v1, "CAMERA"

    sget v2, Lcom/facebook/i;->media_picker_camera:I

    sget-object v3, Lcom/facebook/orca/photos/picking/d;->CAMERA:Lcom/facebook/orca/photos/picking/d;

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/facebook/orca/photos/picking/b;-><init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->CAMERA:Lcom/facebook/orca/photos/picking/b;

    .line 38
    new-instance v0, Lcom/facebook/orca/photos/picking/b;

    const-string v1, "GALLERY"

    sget v2, Lcom/facebook/i;->media_picker_upload_photo:I

    sget-object v3, Lcom/facebook/orca/photos/picking/d;->GALLERY:Lcom/facebook/orca/photos/picking/d;

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/facebook/orca/photos/picking/b;-><init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->GALLERY:Lcom/facebook/orca/photos/picking/b;

    .line 39
    new-instance v0, Lcom/facebook/orca/photos/picking/b;

    const-string v1, "IMAGE_SEARCH"

    sget v2, Lcom/facebook/i;->media_picker_image_search:I

    sget-object v3, Lcom/facebook/orca/photos/picking/d;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/d;

    invoke-direct {v0, v1, v7, v2, v3}, Lcom/facebook/orca/photos/picking/b;-><init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/b;

    .line 40
    new-instance v0, Lcom/facebook/orca/photos/picking/b;

    const-string v1, "RECORD_VIDEO"

    sget v2, Lcom/facebook/i;->media_picker_record_video:I

    sget-object v3, Lcom/facebook/orca/photos/picking/d;->RECORD_VIDEO:Lcom/facebook/orca/photos/picking/d;

    invoke-direct {v0, v1, v8, v2, v3}, Lcom/facebook/orca/photos/picking/b;-><init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->RECORD_VIDEO:Lcom/facebook/orca/photos/picking/b;

    .line 41
    new-instance v0, Lcom/facebook/orca/photos/picking/b;

    const-string v1, "RECORD_AUDIO"

    sget v2, Lcom/facebook/i;->media_picker_record_audio:I

    sget-object v3, Lcom/facebook/orca/photos/picking/d;->RECORD_AUDIO:Lcom/facebook/orca/photos/picking/d;

    invoke-direct {v0, v1, v9, v2, v3}, Lcom/facebook/orca/photos/picking/b;-><init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->RECORD_AUDIO:Lcom/facebook/orca/photos/picking/b;

    .line 42
    new-instance v0, Lcom/facebook/orca/photos/picking/b;

    const-string v1, "REMOVE"

    const/4 v2, 0x5

    sget v3, Lcom/facebook/i;->media_picker_remove:I

    sget-object v4, Lcom/facebook/orca/photos/picking/d;->REMOVE:Lcom/facebook/orca/photos/picking/d;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/orca/photos/picking/b;-><init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->REMOVE:Lcom/facebook/orca/photos/picking/b;

    .line 36
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/orca/photos/picking/b;

    sget-object v1, Lcom/facebook/orca/photos/picking/b;->CAMERA:Lcom/facebook/orca/photos/picking/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/photos/picking/b;->GALLERY:Lcom/facebook/orca/photos/picking/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/photos/picking/b;->IMAGE_SEARCH:Lcom/facebook/orca/photos/picking/b;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/orca/photos/picking/b;->RECORD_VIDEO:Lcom/facebook/orca/photos/picking/b;

    aput-object v1, v0, v8

    sget-object v1, Lcom/facebook/orca/photos/picking/b;->RECORD_AUDIO:Lcom/facebook/orca/photos/picking/b;

    aput-object v1, v0, v9

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/photos/picking/b;->REMOVE:Lcom/facebook/orca/photos/picking/b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/photos/picking/b;->$VALUES:[Lcom/facebook/orca/photos/picking/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/facebook/orca/photos/picking/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/orca/photos/picking/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    iput p3, p0, Lcom/facebook/orca/photos/picking/b;->buttonId:I

    .line 49
    iput-object p4, p0, Lcom/facebook/orca/photos/picking/b;->result:Lcom/facebook/orca/photos/picking/d;

    .line 50
    return-void
.end method

.method static synthetic access$200(Lcom/facebook/orca/photos/picking/b;)Lcom/facebook/orca/photos/picking/d;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/b;->result:Lcom/facebook/orca/photos/picking/d;

    return-object v0
.end method

.method static synthetic access$300(Lcom/facebook/orca/photos/picking/b;)I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/orca/photos/picking/b;->buttonId:I

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/photos/picking/b;
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/photos/picking/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/photos/picking/b;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/facebook/orca/photos/picking/b;->$VALUES:[Lcom/facebook/orca/photos/picking/b;

    invoke-virtual {v0}, [Lcom/facebook/orca/photos/picking/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/photos/picking/b;

    return-object v0
.end method
