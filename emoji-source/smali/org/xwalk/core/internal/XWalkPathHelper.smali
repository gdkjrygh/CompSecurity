.class public Lorg/xwalk/core/internal/XWalkPathHelper;
.super Ljava/lang/Object;
.source "XWalkPathHelper.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "XWalkPathHelper"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static initialize()V
    .locals 11

    .prologue
    const/4 v10, 0x4

    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 22
    const-string v4, "EXTERNAL"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/xwalk/core/internal/XWalkPathHelper;->nativeSetDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const/16 v4, 0x9

    new-array v3, v4, [Ljava/lang/String;

    const-string v4, "ALARMS"

    aput-object v4, v3, v6

    const-string v4, "DCIM"

    aput-object v4, v3, v7

    const-string v4, "DOWNLOADS"

    aput-object v4, v3, v8

    const-string v4, "MOVIES"

    aput-object v4, v3, v9

    const-string v4, "MUSIC"

    aput-object v4, v3, v10

    const/4 v4, 0x5

    const-string v5, "NOTIFICATIONS"

    aput-object v5, v3, v4

    const/4 v4, 0x6

    const-string v5, "PICTURES"

    aput-object v5, v3, v4

    const/4 v4, 0x7

    const-string v5, "PODCASTS"

    aput-object v5, v3, v4

    const/16 v4, 0x8

    const-string v5, "RINGTONES"

    aput-object v5, v3, v4

    .line 35
    .local v3, "names":[Ljava/lang/String;
    const/16 v4, 0x9

    new-array v1, v4, [Ljava/lang/String;

    sget-object v4, Landroid/os/Environment;->DIRECTORY_ALARMS:Ljava/lang/String;

    aput-object v4, v1, v6

    sget-object v4, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    aput-object v4, v1, v7

    sget-object v4, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    aput-object v4, v1, v8

    sget-object v4, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    aput-object v4, v1, v9

    sget-object v4, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    aput-object v4, v1, v10

    const/4 v4, 0x5

    sget-object v5, Landroid/os/Environment;->DIRECTORY_NOTIFICATIONS:Ljava/lang/String;

    aput-object v5, v1, v4

    const/4 v4, 0x6

    sget-object v5, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    aput-object v5, v1, v4

    const/4 v4, 0x7

    sget-object v5, Landroid/os/Environment;->DIRECTORY_PODCASTS:Ljava/lang/String;

    aput-object v5, v1, v4

    const/16 v4, 0x8

    sget-object v5, Landroid/os/Environment;->DIRECTORY_RINGTONES:Ljava/lang/String;

    aput-object v5, v1, v4

    .line 46
    .local v1, "dirs":[Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v4, v3

    if-ge v2, v4, :cond_1

    .line 47
    aget-object v4, v1, v2

    invoke-static {v4}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 48
    .local v0, "dir":Ljava/io/File;
    if-eqz v0, :cond_0

    .line 49
    aget-object v4, v3, v2

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/xwalk/core/internal/XWalkPathHelper;->nativeSetDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 52
    .end local v0    # "dir":Ljava/io/File;
    :cond_1
    return-void
.end method

.method private static native nativeSetDirectory(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static setCacheDirectory(Ljava/lang/String;)V
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 55
    const-string v0, "CACHEDIR"

    invoke-static {v0, p0}, Lorg/xwalk/core/internal/XWalkPathHelper;->nativeSetDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method public static setExternalCacheDirectory(Ljava/lang/String;)V
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .prologue
    .line 59
    const-string v0, "EXTERNAL_CACHEDIR"

    invoke-static {v0, p0}, Lorg/xwalk/core/internal/XWalkPathHelper;->nativeSetDirectory(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    return-void
.end method
