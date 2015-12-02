.class public Landroid_src/drm/mobile1/DrmRawContent;
.super Ljava/lang/Object;
.source "DrmRawContent.java"


# instance fields
.field private a:Ljava/io/BufferedInputStream;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 458
    :try_start_0
    const-string v0, "drm1_jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 463
    :goto_0
    return-void

    .line 460
    :catch_0
    move-exception v0

    .line 461
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "WARNING: Could not load libdrm1_jni.so"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/InputStream;ILjava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    iput v3, p0, Landroid_src/drm/mobile1/DrmRawContent;->c:I

    .line 135
    new-instance v0, Ljava/io/BufferedInputStream;

    const/16 v1, 0x400

    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->a:Ljava/io/BufferedInputStream;

    .line 136
    iput p2, p0, Landroid_src/drm/mobile1/DrmRawContent;->b:I

    .line 138
    const-string v0, "application/vnd.oma.drm.message"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    const/4 v0, 0x1

    .line 145
    :goto_0
    if-gtz p2, :cond_2

    .line 146
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "len must be > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_0
    const-string v0, "application/vnd.oma.drm.content"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    const/4 v0, 0x2

    goto :goto_0

    .line 143
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mimeType must be DRM_MIMETYPE_MESSAGE or DRM_MIMETYPE_CONTENT"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 149
    :cond_2
    iget-object v1, p0, Landroid_src/drm/mobile1/DrmRawContent;->a:Ljava/io/BufferedInputStream;

    iget v2, p0, Landroid_src/drm/mobile1/DrmRawContent;->b:I

    invoke-direct {p0, v1, v2, v0}, Landroid_src/drm/mobile1/DrmRawContent;->nativeConstructDrmContent(Ljava/io/InputStream;II)I

    move-result v0

    iput v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->c:I

    .line 151
    iget v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->c:I

    if-ne v3, v0, :cond_3

    .line 152
    new-instance v0, Landroid_src/drm/mobile1/b;

    const-string v1, "nativeConstructDrmContent() returned JNI_DRM_FAILURE"

    invoke-direct {v0, v1}, Landroid_src/drm/mobile1/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 155
    :cond_3
    invoke-direct {p0}, Landroid_src/drm/mobile1/DrmRawContent;->nativeGetRightsAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->d:Ljava/lang/String;

    .line 158
    invoke-direct {p0}, Landroid_src/drm/mobile1/DrmRawContent;->nativeGetDeliveryMethod()I

    move-result v0

    iput v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->f:I

    .line 159
    iget v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->f:I

    if-ne v3, v0, :cond_4

    .line 160
    new-instance v0, Landroid_src/drm/mobile1/b;

    const-string v1, "nativeGetDeliveryMethod() returned JNI_DRM_FAILURE"

    invoke-direct {v0, v1}, Landroid_src/drm/mobile1/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_4
    invoke-direct {p0}, Landroid_src/drm/mobile1/DrmRawContent;->nativeGetContentType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->e:Ljava/lang/String;

    .line 164
    iget-object v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->e:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 165
    new-instance v0, Landroid_src/drm/mobile1/b;

    const-string v1, "nativeGetContentType() returned null"

    invoke-direct {v0, v1}, Landroid_src/drm/mobile1/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_5
    return-void
.end method

.method private native nativeConstructDrmContent(Ljava/io/InputStream;II)I
.end method

.method private native nativeGetContentLength()I
.end method

.method private native nativeGetContentType()Ljava/lang/String;
.end method

.method private native nativeGetDeliveryMethod()I
.end method

.method private native nativeGetRightsAddress()Ljava/lang/String;
.end method

.method private native nativeReadContent([BIII)I
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Landroid_src/drm/mobile1/DrmRawContent;->e:Ljava/lang/String;

    return-object v0
.end method

.method protected native finalize()V
.end method
