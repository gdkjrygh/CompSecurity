.class public final Lcom/arist/c/a/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/net/Uri;

.field private static final b:Lcom/a/a/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v1, 0x7f020036

    const-string v0, "content://media/external/audio/albumart"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/arist/c/a/a;->a:Landroid/net/Uri;

    new-instance v0, Lcom/a/a/b/e;

    invoke-direct {v0}, Lcom/a/a/b/e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->a(I)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->b(I)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->c(I)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->a()Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->b()Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->c()Lcom/a/a/b/e;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->a(Landroid/graphics/Bitmap$Config;)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->d()Lcom/a/a/b/d;

    move-result-object v0

    sput-object v0, Lcom/arist/c/a/a;->b:Lcom/a/a/b/d;

    return-void
.end method

.method private static a(Landroid/content/Context;JJ)Landroid/graphics/Bitmap;
    .locals 5

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    cmp-long v0, p3, v2

    if-gez v0, :cond_2

    cmp-long v0, p1, v2

    if-ltz v0, :cond_1

    const-wide/16 v2, -0x1

    invoke-static {p0, p1, p2, v2, v3}, Lcom/arist/c/a/a;->b(Landroid/content/Context;JJ)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v2, Lcom/arist/c/a/a;->a:Landroid/net/Uri;

    invoke-static {v2, p3, p4}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v1

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v2, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/arist/c/a/a;->b(Landroid/content/Context;JJ)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    :cond_3
    if-eqz v1, :cond_0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_4

    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :cond_4
    :goto_1
    throw v0

    :cond_5
    move-object v0, v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Lcom/arist/b/b;)Landroid/graphics/Bitmap;
    .locals 4

    invoke-virtual {p1}, Lcom/arist/b/b;->c()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1}, Lcom/arist/b/b;->i()I

    move-result v2

    int-to-long v2, v2

    invoke-static {p0, v0, v1, v2, v3}, Lcom/arist/c/a/a;->a(Landroid/content/Context;JJ)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/arist/c/a/d;->a(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lcom/a/a/b/h;

    invoke-direct {v0, p0}, Lcom/a/a/b/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/a/a/b/h;->a()Lcom/a/a/b/h;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0, v1}, Lcom/a/a/b/h;->a(Landroid/graphics/Bitmap$CompressFormat;)Lcom/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/h;->b()Lcom/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/h;->c()Lcom/a/a/b/h;

    move-result-object v0

    sget-object v1, Lcom/a/a/b/a/h;->b:Lcom/a/a/b/a/h;

    invoke-virtual {v0, v1}, Lcom/a/a/b/h;->a(Lcom/a/a/b/a/h;)Lcom/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/h;->d()Lcom/a/a/b/h;

    move-result-object v0

    new-instance v1, Lcom/a/a/a/b/a/b;

    const/high16 v2, 0x200000

    invoke-direct {v1, v2}, Lcom/a/a/a/b/a/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/a/a/b/h;->a(Lcom/a/a/a/b/a;)Lcom/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/h;->e()Lcom/a/a/b/h;

    move-result-object v0

    new-instance v1, Lcom/a/a/a/a/b/b;

    invoke-direct {v1}, Lcom/a/a/a/a/b/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/a/a/b/h;->a(Lcom/a/a/a/a/b/a;)Lcom/a/a/b/h;

    move-result-object v0

    new-instance v1, Lcom/a/a/b/d/a;

    invoke-direct {v1, p0}, Lcom/a/a/b/d/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/a/a/b/h;->a(Lcom/a/a/b/d/c;)Lcom/a/a/b/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/h;->f()Lcom/a/a/b/g;

    move-result-object v0

    invoke-static {}, Lcom/a/a/c/e;->a()V

    invoke-static {}, Lcom/a/a/b/f;->a()Lcom/a/a/b/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/a/a/b/f;->a(Lcom/a/a/b/g;)V

    return-void
.end method

.method public static a(Lcom/arist/b/b;Landroid/widget/ImageView;)V
    .locals 4

    const v1, 0x7f020038

    new-instance v0, Lcom/a/a/b/e;

    invoke-direct {v0}, Lcom/a/a/b/e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->a(I)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->b(I)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->c(I)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->a()Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->b()Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->c()Lcom/a/a/b/e;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0, v1}, Lcom/a/a/b/e;->a(Landroid/graphics/Bitmap$Config;)Lcom/a/a/b/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/b/e;->d()Lcom/a/a/b/d;

    move-result-object v0

    invoke-static {}, Lcom/a/a/b/f;->a()Lcom/a/a/b/f;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "content://media/external/audio/albumart/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/arist/b/b;->i()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/arist/c/a/c;

    invoke-direct {v3, p1}, Lcom/arist/c/a/c;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2, p1, v0, v3}, Lcom/a/a/b/f;->a(Ljava/lang/String;Landroid/widget/ImageView;Lcom/a/a/b/d;Lcom/a/a/b/f/a;)V

    return-void
.end method

.method public static a(Lcom/arist/b/b;Lcom/arist/model/skin/ColorImageView;)V
    .locals 4

    invoke-static {}, Lcom/a/a/b/f;->a()Lcom/a/a/b/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "content://media/external/audio/albumart/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/arist/b/b;->i()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/arist/c/a/a;->b:Lcom/a/a/b/d;

    new-instance v3, Lcom/arist/c/a/b;

    invoke-direct {v3, p1}, Lcom/arist/c/a/b;-><init>(Lcom/arist/model/skin/ColorImageView;)V

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/a/a/b/f;->a(Ljava/lang/String;Landroid/widget/ImageView;Lcom/a/a/b/d;Lcom/a/a/b/f/a;)V

    return-void
.end method

.method private static b(Landroid/content/Context;JJ)Landroid/graphics/Bitmap;
    .locals 7

    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    cmp-long v1, p3, v4

    if-gez v1, :cond_0

    cmp-long v1, p1, v4

    if-gez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must specify an album or a song id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    cmp-long v2, p3, v4

    if-gez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "content://media/external/audio/media/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/albumart"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "r"

    invoke-virtual {v3, v2, v4}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    sget-object v2, Lcom/arist/c/a/a;->a:Landroid/net/Uri;

    invoke-static {v2, p3, p4}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "r"

    invoke-virtual {v3, v2, v4}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
