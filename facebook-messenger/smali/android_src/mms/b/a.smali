.class public Landroid_src/mms/b/a;
.super Ljava/lang/Object;
.source "DrmWrapper.java"


# instance fields
.field private a:Landroid_src/drm/mobile1/DrmRights;

.field private final b:Landroid_src/drm/mobile1/DrmRawContent;

.field private final c:Landroid/net/Uri;

.field private final d:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;[B)V
    .locals 3

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    if-eqz p1, :cond_0

    if-nez p3, :cond_1

    .line 66
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Content-Type or data may not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_1
    iput-object p2, p0, Landroid_src/mms/b/a;->c:Landroid/net/Uri;

    .line 71
    iput-object p3, p0, Landroid_src/mms/b/a;->d:[B

    .line 73
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 74
    new-instance v1, Landroid_src/drm/mobile1/DrmRawContent;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    invoke-direct {v1, v0, v2, p1}, Landroid_src/drm/mobile1/DrmRawContent;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    iput-object v1, p0, Landroid_src/mms/b/a;->b:Landroid_src/drm/mobile1/DrmRawContent;

    .line 77
    invoke-virtual {p0}, Landroid_src/mms/b/a;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 81
    invoke-virtual {p0, p3}, Landroid_src/mms/b/a;->a([B)V

    .line 83
    :cond_2
    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 4

    .prologue
    .line 93
    if-nez p1, :cond_0

    .line 94
    new-instance v0, Landroid_src/drm/mobile1/b;

    const-string v1, "Right data may not be null."

    invoke-direct {v0, v1}, Landroid_src/drm/mobile1/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 102
    invoke-static {}, Landroid_src/drm/mobile1/DrmRightsManager;->a()Landroid_src/drm/mobile1/DrmRightsManager;

    move-result-object v1

    array-length v2, p1

    const-string v3, "application/vnd.oma.drm.message"

    invoke-virtual {v1, v0, v2, v3}, Landroid_src/drm/mobile1/DrmRightsManager;->a(Ljava/io/InputStream;ILjava/lang/String;)Landroid_src/drm/mobile1/DrmRights;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/b/a;->a:Landroid_src/drm/mobile1/DrmRights;

    .line 105
    return-void
.end method

.method public a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 115
    iget-object v1, p0, Landroid_src/mms/b/a;->a:Landroid_src/drm/mobile1/DrmRights;

    if-eqz v1, :cond_1

    .line 120
    :cond_0
    :goto_0
    return v0

    .line 119
    :cond_1
    invoke-static {}, Landroid_src/drm/mobile1/DrmRightsManager;->a()Landroid_src/drm/mobile1/DrmRightsManager;

    move-result-object v1

    iget-object v2, p0, Landroid_src/mms/b/a;->b:Landroid_src/drm/mobile1/DrmRawContent;

    invoke-virtual {v1, v2}, Landroid_src/drm/mobile1/DrmRightsManager;->a(Landroid_src/drm/mobile1/DrmRawContent;)Landroid_src/drm/mobile1/DrmRights;

    move-result-object v1

    iput-object v1, p0, Landroid_src/mms/b/a;->a:Landroid_src/drm/mobile1/DrmRights;

    .line 120
    iget-object v1, p0, Landroid_src/mms/b/a;->a:Landroid_src/drm/mobile1/DrmRights;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid_src/mms/b/a;->b:Landroid_src/drm/mobile1/DrmRawContent;

    invoke-virtual {v0}, Landroid_src/drm/mobile1/DrmRawContent;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
