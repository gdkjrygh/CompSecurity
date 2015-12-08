.class public final enum Lcom/dropbox/client2/DropboxAPI$ThumbFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/dropbox/client2/DropboxAPI$ThumbFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

.field public static final enum JPEG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

.field public static final enum PNG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1406
    new-instance v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    const-string v1, "PNG"

    invoke-direct {v0, v1, v2}, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->PNG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    new-instance v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    const-string v1, "JPEG"

    invoke-direct {v0, v1, v3}, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->JPEG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    .line 1405
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    sget-object v1, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->PNG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    aput-object v1, v0, v2

    sget-object v1, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->JPEG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    aput-object v1, v0, v3

    sput-object v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->$VALUES:[Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

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
    .line 1405
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/dropbox/client2/DropboxAPI$ThumbFormat;
    .locals 1

    .prologue
    .line 1405
    const-class v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    return-object v0
.end method

.method public static values()[Lcom/dropbox/client2/DropboxAPI$ThumbFormat;
    .locals 1

    .prologue
    .line 1405
    sget-object v0, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->$VALUES:[Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    invoke-virtual {v0}, [Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    return-object v0
.end method
