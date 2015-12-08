.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private byteCount:I

.field private fileCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 543
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 551
    const/16 v0, 0x400

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->fileCount:I

    .line 552
    const/high16 v0, 0x100000

    iput v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->byteCount:I

    .line 553
    return-void
.end method


# virtual methods
.method final getByteCount()I
    .locals 1

    .prologue
    .line 556
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->byteCount:I

    return v0
.end method

.method final getFileCount()I
    .locals 1

    .prologue
    .line 560
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->fileCount:I

    return v0
.end method

.method final setByteCount(I)V
    .locals 2

    .prologue
    .line 564
    if-gez p1, :cond_0

    .line 565
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "Cache byte-count limit must be >= 0"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 567
    :cond_0
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->byteCount:I

    .line 568
    return-void
.end method

.method final setFileCount(I)V
    .locals 2

    .prologue
    .line 571
    if-gez p1, :cond_0

    .line 572
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "Cache file count limit must be >= 0"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :cond_0
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache$Limits;->fileCount:I

    .line 575
    return-void
.end method
