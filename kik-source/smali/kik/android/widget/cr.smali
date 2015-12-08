.class public final Lkik/android/widget/cr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# instance fields
.field private final a:Ljava/io/File;

.field private b:Landroid/media/MediaScannerConnection;


# direct methods
.method private constructor <init>(Ljava/io/File;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lkik/android/widget/cr;->a:Ljava/io/File;

    .line 18
    new-instance v0, Landroid/media/MediaScannerConnection;

    invoke-direct {v0, p2, p0}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    iput-object v0, p0, Lkik/android/widget/cr;->b:Landroid/media/MediaScannerConnection;

    .line 19
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 28
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 33
    :cond_0
    :goto_0
    return-void

    .line 31
    :cond_1
    new-instance v0, Lkik/android/widget/cr;

    invoke-direct {v0, p1, p0}, Lkik/android/widget/cr;-><init>(Ljava/io/File;Landroid/content/Context;)V

    .line 32
    iget-object v0, v0, Lkik/android/widget/cr;->b:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->connect()V

    goto :goto_0
.end method


# virtual methods
.method public final onMediaScannerConnected()V
    .locals 3

    .prologue
    .line 38
    iget-object v0, p0, Lkik/android/widget/cr;->b:Landroid/media/MediaScannerConnection;

    iget-object v1, p0, Lkik/android/widget/cr;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    return-void
.end method

.method public final onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/widget/cr;->b:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/cr;->b:Landroid/media/MediaScannerConnection;

    .line 46
    return-void
.end method
