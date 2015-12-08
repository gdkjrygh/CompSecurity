.class public Lcom/bumptech/glide/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/bumptech/glide/h;


# instance fields
.field private final b:Lcom/bumptech/glide/load/c/c;

.field private final c:Lcom/bumptech/glide/load/b/f;

.field private final d:Lcom/bumptech/glide/load/b/a/e;

.field private final e:Lcom/bumptech/glide/load/b/b/n;

.field private final f:Lcom/bumptech/glide/load/a;

.field private final g:Lcom/bumptech/glide/g/b/f;

.field private final h:Lcom/bumptech/glide/load/resource/e/d;

.field private final i:Lcom/bumptech/glide/f/c;

.field private final j:Lcom/bumptech/glide/load/resource/bitmap/e;

.field private final k:Lcom/bumptech/glide/load/resource/d/h;

.field private final l:Lcom/bumptech/glide/load/resource/bitmap/l;

.field private final m:Lcom/bumptech/glide/load/resource/d/h;

.field private final n:Landroid/os/Handler;

.field private final o:Lcom/bumptech/glide/load/b/d/a;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/b/f;Lcom/bumptech/glide/load/b/b/n;Lcom/bumptech/glide/load/b/a/e;Landroid/content/Context;Lcom/bumptech/glide/load/a;)V
    .locals 6

    .prologue
    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Lcom/bumptech/glide/g/b/f;

    invoke-direct {v0}, Lcom/bumptech/glide/g/b/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/h;->g:Lcom/bumptech/glide/g/b/f;

    .line 93
    new-instance v0, Lcom/bumptech/glide/load/resource/e/d;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/e/d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/h;->h:Lcom/bumptech/glide/load/resource/e/d;

    .line 204
    iput-object p1, p0, Lcom/bumptech/glide/h;->c:Lcom/bumptech/glide/load/b/f;

    .line 205
    iput-object p3, p0, Lcom/bumptech/glide/h;->d:Lcom/bumptech/glide/load/b/a/e;

    .line 206
    iput-object p2, p0, Lcom/bumptech/glide/h;->e:Lcom/bumptech/glide/load/b/b/n;

    .line 207
    iput-object p5, p0, Lcom/bumptech/glide/h;->f:Lcom/bumptech/glide/load/a;

    .line 208
    new-instance v0, Lcom/bumptech/glide/load/c/c;

    invoke-direct {v0, p4}, Lcom/bumptech/glide/load/c/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->b:Lcom/bumptech/glide/load/c/c;

    .line 209
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->n:Landroid/os/Handler;

    .line 210
    new-instance v0, Lcom/bumptech/glide/load/b/d/a;

    invoke-direct {v0, p2, p3, p5}, Lcom/bumptech/glide/load/b/d/a;-><init>(Lcom/bumptech/glide/load/b/b/n;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->o:Lcom/bumptech/glide/load/b/d/a;

    .line 212
    new-instance v0, Lcom/bumptech/glide/f/c;

    invoke-direct {v0}, Lcom/bumptech/glide/f/c;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    .line 214
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/v;

    invoke-direct {v0, p3, p5}, Lcom/bumptech/glide/load/resource/bitmap/v;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    .line 216
    iget-object v1, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    const-class v2, Ljava/io/InputStream;

    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2, v3, v0}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V

    .line 218
    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/j;

    invoke-direct {v1, p3, p5}, Lcom/bumptech/glide/load/resource/bitmap/j;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    .line 220
    iget-object v2, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    const-class v3, Landroid/os/ParcelFileDescriptor;

    const-class v4, Landroid/graphics/Bitmap;

    invoke-virtual {v2, v3, v4, v1}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V

    .line 222
    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/s;

    invoke-direct {v2, v0, v1}, Lcom/bumptech/glide/load/resource/bitmap/s;-><init>(Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/f/b;)V

    .line 224
    iget-object v0, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    const-class v1, Lcom/bumptech/glide/load/c/j;

    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1, v3, v2}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V

    .line 226
    new-instance v0, Lcom/bumptech/glide/load/resource/c/d;

    invoke-direct {v0, p4, p3}, Lcom/bumptech/glide/load/resource/c/d;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/b/a/e;)V

    .line 228
    iget-object v1, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    const-class v3, Ljava/io/InputStream;

    const-class v4, Lcom/bumptech/glide/load/resource/c/b;

    invoke-virtual {v1, v3, v4, v0}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V

    .line 230
    iget-object v1, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    const-class v3, Lcom/bumptech/glide/load/c/j;

    const-class v4, Lcom/bumptech/glide/load/resource/d/a;

    new-instance v5, Lcom/bumptech/glide/load/resource/d/i;

    invoke-direct {v5, v2, v0, p3}, Lcom/bumptech/glide/load/resource/d/i;-><init>(Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/b/a/e;)V

    invoke-virtual {v1, v3, v4, v5}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V

    .line 233
    iget-object v0, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    const-class v1, Ljava/io/InputStream;

    const-class v2, Ljava/io/File;

    new-instance v3, Lcom/bumptech/glide/load/resource/b/e;

    invoke-direct {v3}, Lcom/bumptech/glide/load/resource/b/e;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f/b;)V

    .line 235
    const-class v0, Ljava/io/File;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v2, Lcom/bumptech/glide/load/c/a/b;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/a/b;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 236
    const-class v0, Ljava/io/File;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/f;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/f;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 237
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v2, Lcom/bumptech/glide/load/c/a/e;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/a/e;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 238
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/i;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/i;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 239
    const-class v0, Ljava/lang/Integer;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v2, Lcom/bumptech/glide/load/c/a/e;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/a/e;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 240
    const-class v0, Ljava/lang/Integer;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/i;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/i;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 241
    const-class v0, Ljava/lang/String;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v2, Lcom/bumptech/glide/load/c/a/g;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/a/g;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 242
    const-class v0, Ljava/lang/String;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/k;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/k;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 243
    const-class v0, Landroid/net/Uri;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v2, Lcom/bumptech/glide/load/c/a/i;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/a/i;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 244
    const-class v0, Landroid/net/Uri;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/m;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/m;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 245
    const-class v0, Ljava/net/URL;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/o;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/o;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 246
    const-class v0, Lcom/bumptech/glide/load/c/e;

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/b;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/b;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 247
    const-class v0, [B

    const-class v1, Ljava/io/InputStream;

    new-instance v2, Lcom/bumptech/glide/load/c/b/d;

    invoke-direct {v2}, Lcom/bumptech/glide/load/c/b/d;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V

    .line 249
    iget-object v0, p0, Lcom/bumptech/glide/h;->h:Lcom/bumptech/glide/load/resource/e/d;

    const-class v1, Landroid/graphics/Bitmap;

    const-class v2, Lcom/bumptech/glide/load/resource/bitmap/m;

    new-instance v3, Lcom/bumptech/glide/load/resource/e/b;

    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v3, v4, p3}, Lcom/bumptech/glide/load/resource/e/b;-><init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/b/a/e;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/bumptech/glide/load/resource/e/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/resource/e/c;)V

    .line 251
    iget-object v0, p0, Lcom/bumptech/glide/h;->h:Lcom/bumptech/glide/load/resource/e/d;

    const-class v1, Lcom/bumptech/glide/load/resource/d/a;

    const-class v2, Lcom/bumptech/glide/load/resource/a/b;

    new-instance v3, Lcom/bumptech/glide/load/resource/e/a;

    new-instance v4, Lcom/bumptech/glide/load/resource/e/b;

    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5, p3}, Lcom/bumptech/glide/load/resource/e/b;-><init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/b/a/e;)V

    invoke-direct {v3, v4}, Lcom/bumptech/glide/load/resource/e/a;-><init>(Lcom/bumptech/glide/load/resource/e/c;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/bumptech/glide/load/resource/e/d;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/resource/e/c;)V

    .line 255
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/e;

    invoke-direct {v0, p3}, Lcom/bumptech/glide/load/resource/bitmap/e;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->j:Lcom/bumptech/glide/load/resource/bitmap/e;

    .line 256
    new-instance v0, Lcom/bumptech/glide/load/resource/d/h;

    iget-object v1, p0, Lcom/bumptech/glide/h;->j:Lcom/bumptech/glide/load/resource/bitmap/e;

    invoke-direct {v0, p3, v1}, Lcom/bumptech/glide/load/resource/d/h;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/g;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->k:Lcom/bumptech/glide/load/resource/d/h;

    .line 258
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/l;

    invoke-direct {v0, p3}, Lcom/bumptech/glide/load/resource/bitmap/l;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->l:Lcom/bumptech/glide/load/resource/bitmap/l;

    .line 259
    new-instance v0, Lcom/bumptech/glide/load/resource/d/h;

    iget-object v1, p0, Lcom/bumptech/glide/h;->l:Lcom/bumptech/glide/load/resource/bitmap/l;

    invoke-direct {v0, p3, v1}, Lcom/bumptech/glide/load/resource/d/h;-><init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/g;)V

    iput-object v0, p0, Lcom/bumptech/glide/h;->m:Lcom/bumptech/glide/load/resource/d/h;

    .line 260
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/bumptech/glide/h;
    .locals 5

    .prologue
    .line 145
    sget-object v0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/h;

    if-nez v0, :cond_2

    .line 146
    const-class v1, Lcom/bumptech/glide/h;

    monitor-enter v1

    .line 147
    :try_start_0
    sget-object v0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/h;

    if-nez v0, :cond_1

    .line 148
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 149
    new-instance v2, Lcom/bumptech/glide/e/b;

    invoke-direct {v2, v0}, Lcom/bumptech/glide/e/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/bumptech/glide/e/b;->a()Ljava/util/List;

    move-result-object v2

    .line 151
    new-instance v3, Lcom/bumptech/glide/i;

    invoke-direct {v3, v0}, Lcom/bumptech/glide/i;-><init>(Landroid/content/Context;)V

    .line 152
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/e/a;

    .line 153
    invoke-interface {v0, v3}, Lcom/bumptech/glide/e/a;->a(Lcom/bumptech/glide/i;)V

    goto :goto_0

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 155
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Lcom/bumptech/glide/i;->a()Lcom/bumptech/glide/h;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/h;

    .line 156
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    sget-object v2, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/h;

    goto :goto_1

    .line 160
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 163
    :cond_2
    sget-object v0, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/h;

    return-object v0
.end method

.method public static a(Ljava/lang/Class;Landroid/content/Context;)Lcom/bumptech/glide/load/c/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Landroid/content/Context;",
            ")",
            "Lcom/bumptech/glide/load/c/s",
            "<TT;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 558
    const-class v0, Ljava/io/InputStream;

    invoke-static {p0, v0, p1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Landroid/content/Context;)Lcom/bumptech/glide/load/c/s;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Class;Landroid/content/Context;)Lcom/bumptech/glide/load/c/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TY;>;",
            "Landroid/content/Context;",
            ")",
            "Lcom/bumptech/glide/load/c/s",
            "<TT;TY;>;"
        }
    .end annotation

    .prologue
    .line 524
    if-nez p0, :cond_0

    .line 525
    const-string v0, "Glide"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 528
    const/4 v0, 0x0

    .line 530
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p2}, Lcom/bumptech/glide/h;->a(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    .line 1329
    iget-object v0, v0, Lcom/bumptech/glide/h;->b:Lcom/bumptech/glide/load/c/c;

    .line 530
    invoke-virtual {v0, p0, p1}, Lcom/bumptech/glide/load/c/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/c/s;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Landroid/app/Activity;)Lcom/bumptech/glide/p;
    .locals 1

    .prologue
    .line 631
    invoke-static {}, Lcom/bumptech/glide/d/n;->a()Lcom/bumptech/glide/d/n;

    move-result-object v0

    .line 632
    invoke-virtual {v0, p0}, Lcom/bumptech/glide/d/n;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;
    .locals 1

    .prologue
    .line 668
    invoke-static {}, Lcom/bumptech/glide/d/n;->a()Lcom/bumptech/glide/d/n;

    move-result-object v0

    .line 669
    invoke-virtual {v0, p0}, Lcom/bumptech/glide/d/n;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/support/v4/app/FragmentActivity;)Lcom/bumptech/glide/p;
    .locals 1

    .prologue
    .line 643
    invoke-static {}, Lcom/bumptech/glide/d/n;->a()Lcom/bumptech/glide/d/n;

    move-result-object v0

    .line 644
    invoke-virtual {v0, p0}, Lcom/bumptech/glide/d/n;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/bumptech/glide/p;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/bumptech/glide/g/b/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g/b/k",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 418
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 419
    invoke-interface {p0}, Lcom/bumptech/glide/g/b/k;->e()Lcom/bumptech/glide/g/c;

    move-result-object v0

    .line 420
    if-eqz v0, :cond_0

    .line 421
    invoke-interface {v0}, Lcom/bumptech/glide/g/c;->c()V

    .line 422
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lcom/bumptech/glide/g/b/k;->a(Lcom/bumptech/glide/g/c;)V

    .line 424
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TY;>;",
            "Lcom/bumptech/glide/load/c/t",
            "<TT;TY;>;)V"
        }
    .end annotation

    .prologue
    .line 483
    iget-object v0, p0, Lcom/bumptech/glide/h;->b:Lcom/bumptech/glide/load/c/c;

    invoke-virtual {v0, p1, p2, p3}, Lcom/bumptech/glide/load/c/c;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/c/t;)Lcom/bumptech/glide/load/c/t;

    .line 487
    return-void
.end method

.method public static b(Ljava/lang/Class;Landroid/content/Context;)Lcom/bumptech/glide/load/c/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Landroid/content/Context;",
            ")",
            "Lcom/bumptech/glide/load/c/s",
            "<TT;",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    .prologue
    .line 579
    const-class v0, Landroid/os/ParcelFileDescriptor;

    invoke-static {p0, v0, p1}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Ljava/lang/Class;Landroid/content/Context;)Lcom/bumptech/glide/load/c/s;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lcom/bumptech/glide/p;
    .locals 1

    .prologue
    .line 619
    invoke-static {}, Lcom/bumptech/glide/d/n;->a()Lcom/bumptech/glide/d/n;

    move-result-object v0

    .line 620
    invoke-virtual {v0, p0}, Lcom/bumptech/glide/d/n;->a(Landroid/content/Context;)Lcom/bumptech/glide/p;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/load/b/a/e;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/bumptech/glide/load/b/a/e;

    return-object v0
.end method

.method final a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/resource/e/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TZ;>;",
            "Ljava/lang/Class",
            "<TR;>;)",
            "Lcom/bumptech/glide/load/resource/e/c",
            "<TZ;TR;>;"
        }
    .end annotation

    .prologue
    .line 289
    iget-object v0, p0, Lcom/bumptech/glide/h;->h:Lcom/bumptech/glide/load/resource/e/d;

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/load/resource/e/d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/resource/e/c;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/bumptech/glide/load/b/a/e;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/load/b/a/e;->a(I)V

    .line 380
    iget-object v0, p0, Lcom/bumptech/glide/h;->e:Lcom/bumptech/glide/load/b/b/n;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/load/b/b/n;->a(I)V

    .line 381
    return-void
.end method

.method final b(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/f/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TZ;>;)",
            "Lcom/bumptech/glide/f/b",
            "<TT;TZ;>;"
        }
    .end annotation

    .prologue
    .line 293
    iget-object v0, p0, Lcom/bumptech/glide/h;->i:Lcom/bumptech/glide/f/c;

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/f/c;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/f/b;

    move-result-object v0

    return-object v0
.end method

.method final b()Lcom/bumptech/glide/load/b/f;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/bumptech/glide/h;->c:Lcom/bumptech/glide/load/b/f;

    return-object v0
.end method

.method final c()Lcom/bumptech/glide/load/resource/bitmap/e;
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/bumptech/glide/h;->j:Lcom/bumptech/glide/load/resource/bitmap/e;

    return-object v0
.end method

.method final d()Lcom/bumptech/glide/load/resource/bitmap/l;
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/bumptech/glide/h;->l:Lcom/bumptech/glide/load/resource/bitmap/l;

    return-object v0
.end method

.method final e()Lcom/bumptech/glide/load/resource/d/h;
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Lcom/bumptech/glide/h;->k:Lcom/bumptech/glide/load/resource/d/h;

    return-object v0
.end method

.method final f()Lcom/bumptech/glide/load/resource/d/h;
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/bumptech/glide/h;->m:Lcom/bumptech/glide/load/resource/d/h;

    return-object v0
.end method

.method final g()Lcom/bumptech/glide/load/a;
    .locals 1

    .prologue
    .line 325
    iget-object v0, p0, Lcom/bumptech/glide/h;->f:Lcom/bumptech/glide/load/a;

    return-object v0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 369
    iget-object v0, p0, Lcom/bumptech/glide/h;->d:Lcom/bumptech/glide/load/b/a/e;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b/a/e;->a()V

    .line 370
    iget-object v0, p0, Lcom/bumptech/glide/h;->e:Lcom/bumptech/glide/load/b/b/n;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b/b/n;->a()V

    .line 371
    return-void
.end method
