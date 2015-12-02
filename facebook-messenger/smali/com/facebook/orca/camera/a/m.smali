.class Lcom/facebook/orca/camera/a/m;
.super Ljava/lang/Object;
.source "UriImage.java"

# interfaces
.implements Lcom/facebook/orca/camera/a/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/net/Uri;

.field private final c:Lcom/facebook/orca/camera/a/d;

.field private final d:Landroid/content/ContentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/camera/a/m;

    sput-object v0, Lcom/facebook/orca/camera/a/m;->a:Ljava/lang/Class;

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/camera/a/d;Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/orca/camera/a/m;->c:Lcom/facebook/orca/camera/a/d;

    .line 44
    iput-object p2, p0, Lcom/facebook/orca/camera/a/m;->d:Landroid/content/ContentResolver;

    .line 45
    iput-object p3, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    .line 46
    return-void
.end method

.method private e()Landroid/os/ParcelFileDescriptor;
    .locals 3

    .prologue
    .line 89
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 91
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/high16 v0, 0x10000000

    invoke-static {v1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 97
    :goto_0
    return-object v0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/a/m;->d:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    const-string v2, "r"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 96
    :catch_0
    move-exception v0

    .line 97
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(II)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 102
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/orca/camera/a/m;->a(IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a(IIZ)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/orca/camera/a/m;->a(IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a(IIZZ)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 115
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/camera/a/m;->e()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 116
    invoke-static {p1, p2, v0, p4}, Lcom/facebook/orca/camera/aa;->a(IILandroid/os/ParcelFileDescriptor;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 118
    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 119
    invoke-virtual {p0}, Lcom/facebook/orca/camera/a/m;->c()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/camera/aa;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 124
    :cond_0
    :goto_0
    return-object v0

    .line 122
    :catch_0
    move-exception v0

    .line 123
    sget-object v1, Lcom/facebook/orca/camera/a/m;->a:Ljava/lang/Class;

    const-string v2, "got exception decoding bitmap "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Z)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 149
    const/16 v0, 0x140

    const/high16 v1, 0x30000

    invoke-virtual {p0, v0, v1, p1}, Lcom/facebook/orca/camera/a/m;->a(IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 193
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public c()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 50
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "file"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    iget-object v1, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 52
    new-instance v2, Landroid/media/ExifInterface;

    invoke-direct {v2, v1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 53
    const-string v1, "Orientation"

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 54
    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 55
    const/16 v0, 0xb4

    .line 67
    :cond_0
    :goto_0
    return v0

    .line 56
    :cond_1
    const/4 v2, 0x6

    if-ne v1, v2, :cond_2

    .line 57
    const/16 v0, 0x5a

    goto :goto_0

    .line 58
    :cond_2
    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 59
    const/16 v0, 0x10e

    goto :goto_0

    .line 66
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/orca/camera/a/m;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
