.class public Landroid_src/drm/mobile1/DrmRightsManager;
.super Ljava/lang/Object;
.source "DrmRightsManager.java"


# static fields
.field private static a:Landroid_src/drm/mobile1/DrmRightsManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 64
    const/4 v0, 0x0

    sput-object v0, Landroid_src/drm/mobile1/DrmRightsManager;->a:Landroid_src/drm/mobile1/DrmRightsManager;

    .line 249
    :try_start_0
    const-string v0, "drm1_jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    :goto_0
    return-void

    .line 251
    :catch_0
    move-exception v0

    .line 252
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "WARNING: Could not load libdrm1_jni.so"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    return-void
.end method

.method public static declared-synchronized a()Landroid_src/drm/mobile1/DrmRightsManager;
    .locals 2

    .prologue
    .line 79
    const-class v1, Landroid_src/drm/mobile1/DrmRightsManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Landroid_src/drm/mobile1/DrmRightsManager;->a:Landroid_src/drm/mobile1/DrmRightsManager;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Landroid_src/drm/mobile1/DrmRightsManager;

    invoke-direct {v0}, Landroid_src/drm/mobile1/DrmRightsManager;-><init>()V

    sput-object v0, Landroid_src/drm/mobile1/DrmRightsManager;->a:Landroid_src/drm/mobile1/DrmRightsManager;

    .line 83
    :cond_0
    sget-object v0, Landroid_src/drm/mobile1/DrmRightsManager;->a:Landroid_src/drm/mobile1/DrmRightsManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 79
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private native nativeDeleteRights(Landroid_src/drm/mobile1/DrmRights;)I
.end method

.method private native nativeGetNumOfRights()I
.end method

.method private native nativeGetRightsList([Landroid_src/drm/mobile1/DrmRights;I)I
.end method

.method private native nativeInstallDrmRights(Ljava/io/InputStream;IILandroid_src/drm/mobile1/DrmRights;)I
.end method

.method private native nativeQueryRights(Landroid_src/drm/mobile1/DrmRawContent;Landroid_src/drm/mobile1/DrmRights;)I
.end method


# virtual methods
.method public declared-synchronized a(Landroid_src/drm/mobile1/DrmRawContent;)Landroid_src/drm/mobile1/DrmRights;
    .locals 3

    .prologue
    .line 128
    monitor-enter p0

    :try_start_0
    new-instance v0, Landroid_src/drm/mobile1/DrmRights;

    invoke-direct {v0}, Landroid_src/drm/mobile1/DrmRights;-><init>()V

    .line 131
    invoke-direct {p0, p1, v0}, Landroid_src/drm/mobile1/DrmRightsManager;->nativeQueryRights(Landroid_src/drm/mobile1/DrmRawContent;Landroid_src/drm/mobile1/DrmRights;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    .line 133
    const/4 v2, -0x1

    if-ne v2, v1, :cond_0

    .line 134
    const/4 v0, 0x0

    .line 136
    :cond_0
    monitor-exit p0

    return-object v0

    .line 128
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/io/InputStream;ILjava/lang/String;)Landroid_src/drm/mobile1/DrmRights;
    .locals 3

    .prologue
    .line 95
    monitor-enter p0

    .line 97
    :try_start_0
    const-string v0, "application/vnd.oma.drm.rights+xml"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    const/4 v0, 0x3

    move v1, v0

    .line 106
    :goto_0
    if-gtz p2, :cond_4

    .line 107
    const/4 v0, 0x0

    .line 117
    :cond_0
    monitor-exit p0

    return-object v0

    .line 99
    :cond_1
    :try_start_1
    const-string v0, "application/vnd.oma.drm.rights+wbxml"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    const/4 v0, 0x4

    move v1, v0

    goto :goto_0

    .line 101
    :cond_2
    const-string v0, "application/vnd.oma.drm.message"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 102
    const/4 v0, 0x1

    move v1, v0

    goto :goto_0

    .line 104
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "mimeType must be DRM_MIMETYPE_RIGHTS_XML or DRM_MIMETYPE_RIGHTS_WBXML or DRM_MIMETYPE_MESSAGE"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 109
    :cond_4
    :try_start_2
    new-instance v0, Landroid_src/drm/mobile1/DrmRights;

    invoke-direct {v0}, Landroid_src/drm/mobile1/DrmRights;-><init>()V

    .line 112
    invoke-direct {p0, p1, p2, v1, v0}, Landroid_src/drm/mobile1/DrmRightsManager;->nativeInstallDrmRights(Ljava/io/InputStream;IILandroid_src/drm/mobile1/DrmRights;)I

    move-result v1

    .line 114
    const/4 v2, -0x1

    if-ne v2, v1, :cond_0

    .line 115
    new-instance v0, Landroid_src/drm/mobile1/b;

    const-string v1, "nativeInstallDrmRights() returned JNI_DRM_FAILURE"

    invoke-direct {v0, v1}, Landroid_src/drm/mobile1/b;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method
