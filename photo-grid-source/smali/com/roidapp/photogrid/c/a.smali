.class public final Lcom/roidapp/photogrid/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/data/com.roidapp.photogrid/download"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/c/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v1, 0x400

    .line 65
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    const-string v0, ""

    .line 84
    :goto_0
    return-object v0

    .line 70
    :cond_0
    new-array v0, v1, [B

    .line 73
    :try_start_0
    const-string v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 74
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 75
    :goto_1
    const/4 v3, 0x0

    const/16 v4, 0x400

    invoke-virtual {v2, v0, v3, v4}, Ljava/io/FileInputStream;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 76
    const/4 v4, 0x0

    invoke-virtual {v1, v0, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 79
    :catch_0
    move-exception v0

    .line 80
    const-string v1, "AllUtil"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, ""

    goto :goto_0

    .line 78
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    new-instance v0, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 84
    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const-wide/16 v2, 0xa

    const-wide/16 v4, 0x400

    .line 94
    invoke-static {}, Lcom/roidapp/photogrid/c/a;->b()J

    move-result-wide v0

    div-long/2addr v0, v4

    div-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 96
    const-string v0, "AllUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5916\u90e8\u5b58\u50a8\u7a7a\u95f4\uff0cMB:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/photogrid/c/a;->b()J

    move-result-wide v2

    div-long/2addr v2, v4

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/c/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/update/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 108
    :goto_0
    return-object v0

    .line 99
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/c/a;->c()J

    move-result-wide v0

    div-long/2addr v0, v4

    div-long/2addr v0, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 101
    const-string v0, "AllUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5185\u90e8\u5b58\u50a8\u7a7a\u95f4\uff0cMB:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/photogrid/c/a;->c()J

    move-result-wide v2

    div-long/2addr v2, v4

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    sget-object v0, Lcom/roidapp/photogrid/c/a;->a:Ljava/lang/String;

    goto :goto_0

    .line 106
    :cond_1
    const-string v0, "AllUtil"

    const-string v1, "\u78c1\u76d8\u7a7a\u95f4\u4e0d\u8db3"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string v0, ""

    goto :goto_0
.end method

.method private static a()Z
    .locals 2

    .prologue
    .line 120
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 121
    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static b()J
    .locals 4

    .prologue
    .line 129
    invoke-static {}, Lcom/roidapp/photogrid/c/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    const-wide/16 v0, 0x0

    .line 138
    :goto_0
    return-wide v0

    .line 133
    :cond_0
    new-instance v1, Landroid/os/StatFs;

    .line 1146
    invoke-static {}, Lcom/roidapp/photogrid/c/a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1147
    const/4 v0, 0x0

    .line 133
    :goto_1
    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 136
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    .line 138
    mul-long/2addr v0, v2

    goto :goto_0

    .line 1150
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 177
    if-eqz p0, :cond_0

    const-string v0, "\ufeff"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 180
    :cond_0
    return-object p0
.end method

.method private static c()J
    .locals 8

    .prologue
    .line 158
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 159
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 162
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    .line 164
    const-string v4, "AllUtil"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\u5185\u90e8\u7a7a\u95f4\u5927\u5c0f"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    mul-long v6, v0, v2

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/roidapp/photogrid/c/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    mul-long/2addr v0, v2

    return-wide v0
.end method
