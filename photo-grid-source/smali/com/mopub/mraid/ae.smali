.class final Lcom/mopub/mraid/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private c:Landroid/media/MediaScannerConnection;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 559
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 560
    iput-object p1, p0, Lcom/mopub/mraid/ae;->a:Ljava/lang/String;

    .line 561
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mraid/ae;->b:Ljava/lang/String;

    .line 562
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 553
    invoke-direct {p0, p1}, Lcom/mopub/mraid/ae;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/mopub/mraid/ae;Landroid/media/MediaScannerConnection;)V
    .locals 0

    .prologue
    .line 553
    .line 1565
    iput-object p1, p0, Lcom/mopub/mraid/ae;->c:Landroid/media/MediaScannerConnection;

    .line 553
    return-void
.end method


# virtual methods
.method public final onMediaScannerConnected()V
    .locals 3

    .prologue
    .line 570
    iget-object v0, p0, Lcom/mopub/mraid/ae;->c:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_0

    .line 571
    iget-object v0, p0, Lcom/mopub/mraid/ae;->c:Landroid/media/MediaScannerConnection;

    iget-object v1, p0, Lcom/mopub/mraid/ae;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/mopub/mraid/ae;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    :cond_0
    return-void
.end method

.method public final onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 577
    iget-object v0, p0, Lcom/mopub/mraid/ae;->c:Landroid/media/MediaScannerConnection;

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Lcom/mopub/mraid/ae;->c:Landroid/media/MediaScannerConnection;

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 580
    :cond_0
    return-void
.end method
