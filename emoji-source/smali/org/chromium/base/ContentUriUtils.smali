.class public abstract Lorg/chromium/base/ContentUriUtils;
.super Ljava/lang/Object;
.source "ContentUriUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/ContentUriUtils$FileProviderUtil;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ContentUriUtils"

.field private static sFileProviderUtil:Lorg/chromium/base/ContentUriUtils$FileProviderUtil;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static contentUriExists(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "uriString"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 77
    invoke-static {p0, p1}, Lorg/chromium/base/ContentUriUtils;->getParcelFileDescriptor(Landroid/content/Context;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 78
    .local v0, "pfd":Landroid/os/ParcelFileDescriptor;
    if-nez v0, :cond_0

    .line 79
    const/4 v1, 0x0

    .line 81
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public static getContentUriFromFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "file"    # Ljava/io/File;

    .prologue
    .line 44
    invoke-static {}, Lorg/chromium/base/ThreadUtils;->assertOnUiThread()V

    .line 45
    sget-object v0, Lorg/chromium/base/ContentUriUtils;->sFileProviderUtil:Lorg/chromium/base/ContentUriUtils$FileProviderUtil;

    if-eqz v0, :cond_0

    .line 46
    sget-object v0, Lorg/chromium/base/ContentUriUtils;->sFileProviderUtil:Lorg/chromium/base/ContentUriUtils$FileProviderUtil;

    invoke-interface {v0, p0, p1}, Lorg/chromium/base/ContentUriUtils$FileProviderUtil;->getContentUriFromFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 48
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getDisplayName(Landroid/net/Uri;Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p0, "uri"    # Landroid/net/Uri;
    .param p1, "contentResolver"    # Landroid/content/ContentResolver;
    .param p2, "columnField"    # Ljava/lang/String;

    .prologue
    .line 115
    if-eqz p1, :cond_0

    if-nez p0, :cond_2

    :cond_0
    const-string v0, ""

    .line 132
    :cond_1
    :goto_0
    return-object v0

    .line 116
    :cond_2
    const/4 v6, 0x0

    .line 118
    .local v6, "cursor":Landroid/database/Cursor;
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 120
    if-eqz v6, :cond_3

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_3

    .line 121
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 122
    invoke-interface {v6, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 123
    .local v8, "index":I
    const/4 v0, -0x1

    if-le v8, v0, :cond_3

    invoke-interface {v6, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 130
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .end local v8    # "index":I
    :cond_3
    if-eqz v6, :cond_4

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 132
    :cond_4
    const-string v0, ""

    goto :goto_0

    .line 125
    :catch_0
    move-exception v7

    .line 128
    .local v7, "e":Ljava/lang/NullPointerException;
    :try_start_1
    const-string v0, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    if-eqz v6, :cond_1

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .end local v7    # "e":Ljava/lang/NullPointerException;
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_5

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v0
.end method

.method private static getParcelFileDescriptor(Landroid/content/Context;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "uriString"    # Ljava/lang/String;

    .prologue
    .line 92
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 93
    .local v2, "resolver":Landroid/content/ContentResolver;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 95
    .local v3, "uri":Landroid/net/Uri;
    const/4 v1, 0x0

    .line 97
    .local v1, "pfd":Landroid/os/ParcelFileDescriptor;
    :try_start_0
    const-string v4, "r"

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 101
    :goto_0
    return-object v1

    .line 98
    :catch_0
    move-exception v0

    .line 99
    .local v0, "e":Ljava/io/FileNotFoundException;
    const-string v4, "ContentUriUtils"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Cannot find content uri: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static openContentUriForRead(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "uriString"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 61
    invoke-static {p0, p1}, Lorg/chromium/base/ContentUriUtils;->getParcelFileDescriptor(Landroid/content/Context;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 62
    .local v0, "pfd":Landroid/os/ParcelFileDescriptor;
    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v1

    .line 65
    :goto_0
    return v1

    :cond_0
    const/4 v1, -0x1

    goto :goto_0
.end method

.method public static setFileProviderUtil(Lorg/chromium/base/ContentUriUtils$FileProviderUtil;)V
    .locals 0
    .param p0, "util"    # Lorg/chromium/base/ContentUriUtils$FileProviderUtil;

    .prologue
    .line 40
    sput-object p0, Lorg/chromium/base/ContentUriUtils;->sFileProviderUtil:Lorg/chromium/base/ContentUriUtils$FileProviderUtil;

    .line 41
    return-void
.end method
