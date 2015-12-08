.class public final Lkik/android/f/a/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/f/a/ae$b;,
        Lkik/android/f/a/ae$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    const-string v0, "PlatformUtils"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/f/a/ae;->a:Lorg/c/b;

    return-void
.end method

.method public static a(Ljava/io/File;)J
    .locals 6

    .prologue
    .line 189
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v2, 0x0

    .line 190
    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 191
    invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    .line 192
    const/4 v0, 0x0

    :goto_1
    array-length v4, v1

    if-ge v0, v4, :cond_1

    .line 193
    new-instance v4, Ljava/io/File;

    aget-object v5, v1, v0

    invoke-direct {v4, p0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v4}, Lkik/android/f/a/ae;->a(Ljava/io/File;)J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 192
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 189
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v2

    goto :goto_0

    .line 197
    :cond_1
    return-wide v2
.end method

.method public static a(Landroid/app/Activity;Lcom/kik/cards/web/kik/KikMessageParcelable;Lcom/kik/cache/ad;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 134
    new-instance v0, Lkik/android/f/a/ae$b;

    invoke-direct {v0, p0, p2}, Lkik/android/f/a/ae$b;-><init>(Landroid/app/Activity;Lcom/kik/cache/ad;)V

    .line 135
    invoke-virtual {v0, p1}, Lkik/android/f/a/ae$b;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V

    .line 136
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lkik/android/f/a/ae$b;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 137
    invoke-virtual {v0}, Lkik/android/f/a/ae$b;->a()Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/app/Activity;Lkik/a/d/a/a;Lcom/kik/cache/ad;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 142
    new-instance v0, Lkik/android/f/a/ae$b;

    invoke-direct {v0, p0, p2}, Lkik/android/f/a/ae$b;-><init>(Landroid/app/Activity;Lcom/kik/cache/ad;)V

    .line 143
    invoke-virtual {v0, p1}, Lkik/android/f/a/ae$b;->a(Lkik/a/d/a/a;)V

    .line 144
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lkik/android/f/a/ae$b;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 145
    invoke-virtual {v0}, Lkik/android/f/a/ae$b;->a()Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/graphics/Bitmap;)[B
    .locals 4

    .prologue
    .line 175
    const/4 v0, 0x0

    .line 176
    if-eqz p0, :cond_0

    .line 177
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const-wide/16 v2, 0x2800

    invoke-static {p0, v0, v2, v3}, Lcom/kik/m/k;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;J)[B

    move-result-object v0

    .line 179
    :cond_0
    return-object v0
.end method

.method public static a([B)[B
    .locals 2

    .prologue
    .line 150
    if-eqz p0, :cond_0

    .line 152
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v0, v1}, Lcom/kik/m/k;->a(Ljava/io/InputStream;Landroid/graphics/Bitmap$CompressFormat;)[B

    move-result-object p0

    .line 154
    :cond_0
    return-object p0
.end method

.method public static b(Ljava/io/File;)V
    .locals 4

    .prologue
    .line 202
    if-eqz p0, :cond_1

    .line 203
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 205
    invoke-static {v3}, Lkik/android/f/a/ae;->b(Ljava/io/File;)V

    .line 204
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 207
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 209
    :cond_1
    return-void
.end method
