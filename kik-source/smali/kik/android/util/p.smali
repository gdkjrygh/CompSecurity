.class public final Lkik/android/util/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/p$a;
    }
.end annotation


# static fields
.field private static a:Ljava/io/File;

.field private static b:Ljava/io/File;

.field private static c:Ljava/io/File;

.field private static final d:Lorg/c/b;

.field private static f:Lkik/android/util/p;


# instance fields
.field private e:Lkik/a/e/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    const-string v0, "AndroidProfPicHelper"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/p;->d:Lorg/c/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    return-void
.end method

.method public static a()Lkik/android/util/p;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lkik/android/util/p;->f:Lkik/android/util/p;

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lkik/android/util/p;

    invoke-direct {v0}, Lkik/android/util/p;-><init>()V

    sput-object v0, Lkik/android/util/p;->f:Lkik/android/util/p;

    .line 70
    :cond_0
    sget-object v0, Lkik/android/util/p;->f:Lkik/android/util/p;

    return-object v0
.end method

.method static synthetic a(Lkik/android/util/p;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    return-void
.end method

.method public static b()V
    .locals 1

    .prologue
    .line 122
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 125
    :cond_0
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 128
    :cond_1
    return-void
.end method

.method static synthetic i()Ljava/io/File;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    return-object v0
.end method

.method static synthetic j()Ljava/io/File;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    return-object v0
.end method

.method private k()V
    .locals 5

    .prologue
    .line 84
    sget-object v0, Lkik/android/util/p;->a:Ljava/io/File;

    if-eqz v0, :cond_0

    sget-object v0, Lkik/android/util/p;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 86
    :cond_0
    const-string v0, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 87
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "temp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lkik/android/util/p;->a:Ljava/io/File;

    .line 94
    :cond_1
    :goto_0
    sget-object v0, Lkik/android/util/p;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 95
    sget-object v0, Lkik/android/util/p;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 98
    :cond_2
    new-instance v0, Ljava/io/File;

    sget-object v1, Lkik/android/util/p;->a:Ljava/io/File;

    const-string v2, ".noMedia"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 100
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    :goto_1
    const-string v0, ""

    .line 108
    iget-object v1, p0, Lkik/android/util/p;->e:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 109
    iget-object v2, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 110
    iget-object v0, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 112
    :cond_3
    new-instance v1, Ljava/io/File;

    sget-object v2, Lkik/android/util/p;->a:Ljava/io/File;

    const-string v3, "kiktmp"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v1, Lkik/android/util/p;->b:Ljava/io/File;

    .line 113
    new-instance v1, Ljava/io/File;

    sget-object v2, Lkik/android/util/p;->a:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "kikCache"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 115
    sput-object v1, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 116
    new-instance v0, Ljava/io/File;

    sget-object v1, Lkik/android/util/p;->a:Ljava/io/File;

    const-string v2, "kikCache"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    .line 118
    :cond_4
    return-void

    .line 90
    :cond_5
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getDownloadCacheDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "temp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lkik/android/util/p;->a:Ljava/io/File;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public final a(Lkik/a/e/w;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lkik/android/util/p;->e:Lkik/a/e/w;

    .line 76
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;Landroid/content/Context;)V
    .locals 6

    .prologue
    const v5, 0x7f09029e

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 179
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 180
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 184
    :cond_0
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 185
    const v0, 0x7f0902f3

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 188
    invoke-static {p2}, Lkik/android/util/DeviceUtils;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    const v2, 0x7f09030f

    invoke-virtual {p2, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-virtual {p2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v4

    .line 197
    :goto_0
    new-instance v2, Lkik/android/util/q;

    invoke-direct {v2, p0, v0, p1}, Lkik/android/util/q;-><init>(Lkik/android/util/p;[Ljava/lang/CharSequence;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 213
    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "tag"

    invoke-virtual {p1, v0, v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 214
    return-void

    .line 192
    :cond_1
    new-array v0, v4, [Ljava/lang/CharSequence;

    invoke-virtual {p2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;[B)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 417
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 418
    const/4 v3, 0x0

    .line 420
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    sget-object v4, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 421
    :try_start_1
    invoke-virtual {v2, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 429
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 441
    :goto_0
    sget-object v2, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    sget-object v3, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {p1, v2, v3}, Lkik/android/util/e;->a(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v2

    .line 443
    const/16 v3, 0x2860

    :try_start_3
    invoke-virtual {p1, v2, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    .line 449
    :goto_1
    return v0

    .line 433
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 423
    :catch_1
    move-exception v0

    move-object v2, v3

    .line 424
    :goto_2
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "could not write image: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    const v0, 0x7f0902bb

    const/4 v3, 0x1

    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 426
    if-eqz v2, :cond_0

    .line 431
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :cond_0
    :goto_3
    move v0, v1

    .line 435
    goto :goto_1

    .line 433
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 429
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_4
    if-eqz v2, :cond_1

    .line 431
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 435
    :cond_1
    :goto_5
    throw v0

    .line 433
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_5

    .line 446
    :catch_4
    move-exception v0

    invoke-virtual {p0}, Lkik/android/util/p;->g()V

    move v0, v1

    .line 447
    goto :goto_1

    .line 429
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 423
    :catch_5
    move-exception v0

    goto :goto_2
.end method

.method public final a(Landroid/support/v4/app/Fragment;Landroid/content/Context;ILandroid/content/Intent;Lkik/a/e/n;)Z
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    .line 378
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 379
    const/16 v0, 0x285e

    if-ne p3, v0, :cond_3

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_0
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    move-object v6, v0

    :goto_0
    invoke-virtual {v6}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/String;

    const-string v4, "_data"

    aput-object v4, v2, v8

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    new-instance v0, Ljava/io/File;

    if-nez v3, :cond_2

    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-interface {p5, v0}, Lkik/a/e/n;->a(Ljava/io/File;)Z

    .line 381
    :cond_3
    invoke-static {}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$b;->a()V

    .line 385
    if-eqz p4, :cond_4

    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_4
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    :goto_1
    sget-object v1, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lkik/android/util/e;->a(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    .line 388
    const/16 v1, 0x2860

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v7

    .line 394
    :goto_2
    return v0

    .line 379
    :cond_5
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    .line 385
    :cond_6
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    goto :goto_1

    .line 391
    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lkik/android/util/p;->g()V

    move v0, v8

    .line 392
    goto :goto_2
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 145
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 146
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 221
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 222
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    sget-object v1, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-static {v1}, Lkik/android/util/e;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public final e()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 228
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-static {v0}, Lkik/android/util/e;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 233
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 234
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-static {v0}, Lkik/android/util/e;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 239
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 240
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    sget-object v0, Lkik/android/util/p;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 243
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 247
    invoke-direct {p0}, Lkik/android/util/p;->k()V

    .line 248
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    sget-object v0, Lkik/android/util/p;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 251
    :cond_0
    return-void
.end method
