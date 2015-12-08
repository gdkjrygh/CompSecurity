.class final Lcom/mopub/mraid/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mraid/ad;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/mopub/mraid/af;

.field final synthetic c:Lcom/mopub/mraid/MraidNativeCommandHandler;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidNativeCommandHandler;Landroid/content/Context;Lcom/mopub/mraid/af;)V
    .locals 0

    .prologue
    .line 408
    iput-object p1, p0, Lcom/mopub/mraid/aa;->c:Lcom/mopub/mraid/MraidNativeCommandHandler;

    iput-object p2, p0, Lcom/mopub/mraid/aa;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/mopub/mraid/aa;->b:Lcom/mopub/mraid/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure()V
    .locals 3

    .prologue
    .line 416
    iget-object v0, p0, Lcom/mopub/mraid/aa;->a:Landroid/content/Context;

    const-string v1, "Image failed to download."

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 417
    const-string v0, "Error downloading and saving image file."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 418
    iget-object v0, p0, Lcom/mopub/mraid/aa;->b:Lcom/mopub/mraid/af;

    new-instance v1, Lcom/mopub/mraid/h;

    const-string v2, "Error downloading and saving image file."

    invoke-direct {v1, v2}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/mopub/mraid/af;->onFailure(Lcom/mopub/mraid/h;)V

    .line 420
    return-void
.end method

.method public final onSuccess()V
    .locals 1

    .prologue
    .line 411
    const-string v0, "Image successfully saved."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 412
    return-void
.end method
