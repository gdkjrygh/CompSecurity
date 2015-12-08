.class public Lorg/chromium/base/library_loader/LibraryLoaderHelper;
.super Ljava/lang/Object;
.source "LibraryLoaderHelper.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final LIB_DIR:Ljava/lang/String; = "lib"

.field private static final TAG:Ljava/lang/String; = "LibraryLoaderHelper"

.field private static sLibrariesWereUnpacked:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 27
    const-class v0, Lorg/chromium/base/library_loader/LibraryLoaderHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->$assertionsDisabled:Z

    .line 36
    sput-boolean v1, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->sLibrariesWereUnpacked:Z

    return-void

    :cond_0
    move v0, v1

    .line 27
    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static deleteDirectorySync(Ljava/io/File;)V
    .locals 9
    .param p0, "dir"    # Ljava/io/File;

    .prologue
    .line 237
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 238
    .local v3, "files":[Ljava/io/File;
    if-eqz v3, :cond_1

    .line 239
    move-object v0, v3

    .local v0, "arr$":[Ljava/io/File;
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_1

    aget-object v2, v0, v4

    .line 240
    .local v2, "file":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v6

    if-nez v6, :cond_0

    .line 241
    const-string v6, "LibraryLoaderHelper"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to remove "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 239
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 245
    .end local v0    # "arr$":[Ljava/io/File;
    .end local v2    # "file":Ljava/io/File;
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v6

    if-nez v6, :cond_2

    .line 246
    const-string v6, "LibraryLoaderHelper"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to remove "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    .end local v3    # "files":[Ljava/io/File;
    :cond_2
    :goto_1
    return-void

    .line 249
    :catch_0
    move-exception v1

    .line 250
    .local v1, "e":Ljava/lang/Exception;
    const-string v6, "LibraryLoaderHelper"

    const-string v7, "Failed to remove old libs, "

    invoke-static {v6, v7, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method static deleteWorkaroundLibrariesAsynchronously(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 211
    new-instance v0, Lorg/chromium/base/library_loader/LibraryLoaderHelper$1;

    invoke-direct {v0, p0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper$1;->start()V

    .line 217
    return-void
.end method

.method public static deleteWorkaroundLibrariesSynchronously(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 225
    invoke-static {p0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->getWorkaroundLibDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 226
    .local v0, "libDir":Ljava/io/File;
    invoke-static {v0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteDirectorySync(Ljava/io/File;)V

    .line 227
    return-void
.end method

.method private static getJniNameInApk(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "libName"    # Ljava/lang/String;

    .prologue
    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lib/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getWorkaroundLibDir(Landroid/content/Context;)Ljava/io/File;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 112
    const-string v0, "lib"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private static getWorkaroundLibFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "library"    # Ljava/lang/String;

    .prologue
    .line 116
    invoke-static {p1}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    .local v0, "libName":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-static {p0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->getWorkaroundLibDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method public static loadNativeLibrariesUsingWorkaroundForTesting(Landroid/content/Context;)Z
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 48
    sget-object v0, Lorg/chromium/base/library_loader/NativeLibraries;->LIBRARIES:[Ljava/lang/String;

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 49
    .local v3, "library":Ljava/lang/String;
    invoke-static {p0, v3}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->tryLoadLibraryUsingWorkaround(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 50
    const/4 v4, 0x0

    .line 53
    .end local v3    # "library":Ljava/lang/String;
    :goto_1
    return v4

    .line 48
    .restart local v3    # "library":Ljava/lang/String;
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 53
    .end local v3    # "library":Ljava/lang/String;
    :cond_1
    const/4 v4, 0x1

    goto :goto_1
.end method

.method static tryLoadLibraryUsingWorkaround(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "library"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 91
    sget-boolean v3, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->$assertionsDisabled:Z

    if-nez v3, :cond_0

    if-nez p0, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 92
    :cond_0
    invoke-static {p0, p1}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->getWorkaroundLibFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 93
    .local v1, "libFile":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->unpackLibrariesOnce(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 100
    :goto_0
    return v2

    .line 97
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/System;->load(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    const/4 v2, 0x1

    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    .local v0, "e":Ljava/lang/UnsatisfiedLinkError;
    goto :goto_0
.end method

.method private static unpackLibrariesOnce(Landroid/content/Context;)Z
    .locals 21
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 130
    sget-boolean v18, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->sLibrariesWereUnpacked:Z

    if-eqz v18, :cond_0

    .line 131
    const/16 v18, 0x0

    .line 199
    :goto_0
    return v18

    .line 133
    :cond_0
    const/16 v18, 0x1

    sput-boolean v18, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->sLibrariesWereUnpacked:Z

    .line 135
    invoke-static/range {p0 .. p0}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->getWorkaroundLibDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v13

    .line 136
    .local v13, "libDir":Ljava/io/File;
    invoke-static {v13}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteDirectorySync(Ljava/io/File;)V

    .line 139
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 140
    .local v2, "appInfo":Landroid/content/pm/ApplicationInfo;
    new-instance v8, Ljava/util/zip/ZipFile;

    new-instance v18, Ljava/io/File;

    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    move-object/from16 v19, v0

    invoke-direct/range {v18 .. v19}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/16 v19, 0x1

    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-direct {v8, v0, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V

    .line 141
    .local v8, "file":Ljava/util/zip/ZipFile;
    sget-object v3, Lorg/chromium/base/library_loader/NativeLibraries;->LIBRARIES:[Ljava/lang/String;

    .local v3, "arr$":[Ljava/lang/String;
    array-length v12, v3

    .local v12, "len$":I
    const/4 v9, 0x0

    .local v9, "i$":I
    :goto_1
    if-ge v9, v12, :cond_c

    aget-object v14, v3, v9

    .line 142
    .local v14, "libName":Ljava/lang/String;
    invoke-static {v14}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->getJniNameInApk(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 144
    .local v11, "jniNameInApk":Ljava/lang/String;
    invoke-virtual {v8, v11}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v7

    .line 145
    .local v7, "entry":Ljava/util/zip/ZipEntry;
    if-nez v7, :cond_1

    .line 146
    const-string v18, "LibraryLoaderHelper"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    move-object/from16 v20, v0

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, " doesn\'t have file "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V

    .line 148
    invoke-static {v13}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteDirectorySync(Ljava/io/File;)V

    .line 149
    const/16 v18, 0x0

    goto :goto_0

    .line 152
    :cond_1
    move-object/from16 v0, p0

    invoke-static {v0, v14}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->getWorkaroundLibFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v17

    .line 154
    .local v17, "outputFile":Ljava/io/File;
    const-string v18, "LibraryLoaderHelper"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Extracting native libraries into "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    sget-boolean v18, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->$assertionsDisabled:Z

    if-nez v18, :cond_2

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->exists()Z

    move-result v18

    if-eqz v18, :cond_2

    new-instance v18, Ljava/lang/AssertionError;

    invoke-direct/range {v18 .. v18}, Ljava/lang/AssertionError;-><init>()V

    throw v18
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    .end local v2    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .end local v3    # "arr$":[Ljava/lang/String;
    .end local v7    # "entry":Ljava/util/zip/ZipEntry;
    .end local v8    # "file":Ljava/util/zip/ZipFile;
    .end local v9    # "i$":I
    .end local v11    # "jniNameInApk":Ljava/lang/String;
    .end local v12    # "len$":I
    .end local v14    # "libName":Ljava/lang/String;
    .end local v17    # "outputFile":Ljava/io/File;
    :catch_0
    move-exception v6

    .line 197
    .local v6, "e":Ljava/io/IOException;
    const-string v18, "LibraryLoaderHelper"

    const-string v19, "Failed to unpack native libraries"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-static {v0, v1, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 198
    invoke-static {v13}, Lorg/chromium/base/library_loader/LibraryLoaderHelper;->deleteDirectorySync(Ljava/io/File;)V

    .line 199
    const/16 v18, 0x0

    goto/16 :goto_0

    .line 159
    .end local v6    # "e":Ljava/io/IOException;
    .restart local v2    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .restart local v3    # "arr$":[Ljava/lang/String;
    .restart local v7    # "entry":Ljava/util/zip/ZipEntry;
    .restart local v8    # "file":Ljava/util/zip/ZipFile;
    .restart local v9    # "i$":I
    .restart local v11    # "jniNameInApk":Ljava/lang/String;
    .restart local v12    # "len$":I
    .restart local v14    # "libName":Ljava/lang/String;
    .restart local v17    # "outputFile":Ljava/io/File;
    :cond_2
    :try_start_1
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->createNewFile()Z

    move-result v18

    if-nez v18, :cond_4

    .line 160
    new-instance v18, Ljava/io/IOException;

    invoke-direct/range {v18 .. v18}, Ljava/io/IOException;-><init>()V

    throw v18
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 184
    :catch_1
    move-exception v6

    .line 185
    .restart local v6    # "e":Ljava/io/IOException;
    :try_start_2
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->exists()Z

    move-result v18

    if-eqz v18, :cond_3

    .line 186
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->delete()Z

    move-result v18

    if-nez v18, :cond_3

    .line 187
    const-string v18, "LibraryLoaderHelper"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Failed to delete "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    :cond_3
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V

    .line 191
    throw v6
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 163
    .end local v6    # "e":Ljava/io/IOException;
    :cond_4
    const/4 v10, 0x0

    .line 164
    .local v10, "is":Ljava/io/InputStream;
    const/4 v15, 0x0

    .line 166
    .local v15, "os":Ljava/io/FileOutputStream;
    :try_start_3
    invoke-virtual {v8, v7}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v10

    .line 167
    new-instance v16, Ljava/io/FileOutputStream;

    invoke-direct/range {v16 .. v17}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 168
    .end local v15    # "os":Ljava/io/FileOutputStream;
    .local v16, "os":Ljava/io/FileOutputStream;
    const/4 v5, 0x0

    .line 169
    .local v5, "count":I
    const/16 v18, 0x4000

    :try_start_4
    move/from16 v0, v18

    new-array v4, v0, [B

    .line 170
    .local v4, "buffer":[B
    :goto_2
    invoke-virtual {v10, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_7

    .line 171
    const/16 v18, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v18

    invoke-virtual {v0, v4, v1, v5}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 174
    .end local v4    # "buffer":[B
    :catchall_0
    move-exception v18

    move-object/from16 v15, v16

    .line 175
    .end local v5    # "count":I
    .end local v16    # "os":Ljava/io/FileOutputStream;
    .restart local v15    # "os":Ljava/io/FileOutputStream;
    :goto_3
    if-eqz v10, :cond_5

    :try_start_5
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 177
    :cond_5
    if-eqz v15, :cond_6

    :try_start_6
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V

    :cond_6
    throw v18
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 175
    .end local v15    # "os":Ljava/io/FileOutputStream;
    .restart local v4    # "buffer":[B
    .restart local v5    # "count":I
    .restart local v16    # "os":Ljava/io/FileOutputStream;
    :cond_7
    if-eqz v10, :cond_8

    :try_start_7
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 177
    :cond_8
    if-eqz v16, :cond_9

    :try_start_8
    invoke-virtual/range {v16 .. v16}, Ljava/io/FileOutputStream;->close()V

    .line 181
    :cond_9
    const/16 v18, 0x1

    const/16 v19, 0x0

    invoke-virtual/range {v17 .. v19}, Ljava/io/File;->setReadable(ZZ)Z

    .line 182
    const/16 v18, 0x1

    const/16 v19, 0x0

    invoke-virtual/range {v17 .. v19}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 183
    const/16 v18, 0x1

    invoke-virtual/range {v17 .. v18}, Ljava/io/File;->setWritable(Z)Z

    .line 141
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 177
    :catchall_1
    move-exception v18

    if-eqz v16, :cond_a

    invoke-virtual/range {v16 .. v16}, Ljava/io/FileOutputStream;->close()V

    :cond_a
    throw v18

    .end local v4    # "buffer":[B
    .end local v5    # "count":I
    .end local v16    # "os":Ljava/io/FileOutputStream;
    .restart local v15    # "os":Ljava/io/FileOutputStream;
    :catchall_2
    move-exception v18

    if-eqz v15, :cond_b

    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V

    :cond_b
    throw v18
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    .line 194
    .end local v7    # "entry":Ljava/util/zip/ZipEntry;
    .end local v10    # "is":Ljava/io/InputStream;
    .end local v11    # "jniNameInApk":Ljava/lang/String;
    .end local v14    # "libName":Ljava/lang/String;
    .end local v15    # "os":Ljava/io/FileOutputStream;
    .end local v17    # "outputFile":Ljava/io/File;
    :cond_c
    :try_start_9
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 195
    const/16 v18, 0x1

    goto/16 :goto_0

    .line 174
    .restart local v7    # "entry":Ljava/util/zip/ZipEntry;
    .restart local v10    # "is":Ljava/io/InputStream;
    .restart local v11    # "jniNameInApk":Ljava/lang/String;
    .restart local v14    # "libName":Ljava/lang/String;
    .restart local v15    # "os":Ljava/io/FileOutputStream;
    .restart local v17    # "outputFile":Ljava/io/File;
    :catchall_3
    move-exception v18

    goto :goto_3
.end method
