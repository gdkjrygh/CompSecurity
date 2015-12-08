.class Lcom/QRBS/activity/StartActivity$3;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->showBackDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/StartActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/StartActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/StartActivity$3;)Lcom/QRBS/activity/StartActivity;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "arg1"    # I

    .prologue
    .line 229
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 232
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity;->access$3(Lcom/QRBS/activity/StartActivity;)Lcom/google/android/gms/ads/InterstitialAd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity;->access$3(Lcom/QRBS/activity/StartActivity;)Lcom/google/android/gms/ads/InterstitialAd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->show()V

    .line 235
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->mInterstitialAd:Lcom/google/android/gms/ads/InterstitialAd;
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity;->access$3(Lcom/QRBS/activity/StartActivity;)Lcom/google/android/gms/ads/InterstitialAd;

    move-result-object v0

    new-instance v1, Lcom/QRBS/activity/StartActivity$3$1;

    invoke-direct {v1, p0}, Lcom/QRBS/activity/StartActivity$3$1;-><init>(Lcom/QRBS/activity/StartActivity$3;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/InterstitialAd;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 256
    :goto_0
    return-void

    .line 252
    :cond_0
    invoke-static {}, Lcom/scannerfire/utils/SoundControl;->isSoundLoaded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/scannerfire/utils/SoundControl;->destroySound()V

    .line 253
    :cond_1
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/QRBS/activity/StartActivity;->access$4(Lcom/QRBS/activity/StartActivity;Z)V

    .line 254
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/StartActivity;->finish()V

    goto :goto_0
.end method
