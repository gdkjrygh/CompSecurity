.class Lcom/roidapp/cloudlib/upload/v;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field protected i:Ljava/lang/String;

.field protected j:Z

.field final synthetic k:Lcom/roidapp/cloudlib/upload/UploadPhotoService;


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;)V
    .locals 0

    .prologue
    .line 422
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/v;->k:Lcom/roidapp/cloudlib/upload/UploadPhotoService;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;B)V
    .locals 0

    .prologue
    .line 422
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/upload/v;-><init>(Lcom/roidapp/cloudlib/upload/UploadPhotoService;)V

    return-void
.end method
