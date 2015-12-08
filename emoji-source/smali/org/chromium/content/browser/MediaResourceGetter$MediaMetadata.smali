.class Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;
.super Ljava/lang/Object;
.source "MediaResourceGetter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/MediaResourceGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaMetadata"
.end annotation

.annotation build Lorg/chromium/base/VisibleForTesting;
.end annotation


# instance fields
.field private final mDurationInMilliseconds:I

.field private final mHeight:I

.field private final mSuccess:Z

.field private final mWidth:I


# direct methods
.method constructor <init>(IIIZ)V
    .locals 0
    .param p1, "durationInMilliseconds"    # I
    .param p2, "width"    # I
    .param p3, "height"    # I
    .param p4, "success"    # Z

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p1, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mDurationInMilliseconds:I

    .line 50
    iput p2, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mWidth:I

    .line 51
    iput p3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mHeight:I

    .line 52
    iput-boolean p4, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mSuccess:Z

    .line 53
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 93
    if-ne p0, p1, :cond_1

    .line 108
    :cond_0
    :goto_0
    return v1

    .line 95
    :cond_1
    if-nez p1, :cond_2

    move v1, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 98
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 99
    check-cast v0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;

    .line 100
    .local v0, "other":Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;
    iget v3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mDurationInMilliseconds:I

    iget v4, v0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mDurationInMilliseconds:I

    if-eq v3, v4, :cond_4

    move v1, v2

    .line 101
    goto :goto_0

    .line 102
    :cond_4
    iget v3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mHeight:I

    iget v4, v0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mHeight:I

    if-eq v3, v4, :cond_5

    move v1, v2

    .line 103
    goto :goto_0

    .line 104
    :cond_5
    iget-boolean v3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mSuccess:Z

    iget-boolean v4, v0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mSuccess:Z

    if-eq v3, v4, :cond_6

    move v1, v2

    .line 105
    goto :goto_0

    .line 106
    :cond_6
    iget v3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mWidth:I

    iget v4, v0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mWidth:I

    if-eq v3, v4, :cond_0

    move v1, v2

    .line 107
    goto :goto_0
.end method

.method getDurationInMilliseconds()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "MediaMetadata"
    .end annotation

    .prologue
    .line 59
    iget v0, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mDurationInMilliseconds:I

    return v0
.end method

.method getHeight()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "MediaMetadata"
    .end annotation

    .prologue
    .line 65
    iget v0, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mHeight:I

    return v0
.end method

.method getWidth()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "MediaMetadata"
    .end annotation

    .prologue
    .line 62
    iget v0, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 82
    const/16 v0, 0x1f

    .line 83
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 84
    .local v1, "result":I
    iget v2, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mDurationInMilliseconds:I

    add-int/lit8 v1, v2, 0x1f

    .line 85
    mul-int/lit8 v2, v1, 0x1f

    iget v3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mHeight:I

    add-int v1, v2, v3

    .line 86
    mul-int/lit8 v3, v1, 0x1f

    iget-boolean v2, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mSuccess:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    :goto_0
    add-int v1, v3, v2

    .line 87
    mul-int/lit8 v2, v1, 0x1f

    iget v3, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mWidth:I

    add-int v1, v2, v3

    .line 88
    return v1

    .line 86
    :cond_0
    const/16 v2, 0x4d5

    goto :goto_0
.end method

.method isSuccess()Z
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "MediaMetadata"
    .end annotation

    .prologue
    .line 68
    iget-boolean v0, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mSuccess:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaMetadata[durationInMilliseconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mDurationInMilliseconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", success="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lorg/chromium/content/browser/MediaResourceGetter$MediaMetadata;->mSuccess:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
