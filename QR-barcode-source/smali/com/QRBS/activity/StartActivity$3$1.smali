.class Lcom/QRBS/activity/StartActivity$3$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "StartActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity$3;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/QRBS/activity/StartActivity$3;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/StartActivity$3;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$3$1;->this$1:Lcom/QRBS/activity/StartActivity$3;

    .line 235
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClosed()V
    .locals 2

    .prologue
    .line 244
    invoke-static {}, Lcom/scannerfire/utils/SoundControl;->isSoundLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/scannerfire/utils/SoundControl;->destroySound()V

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3$1;->this$1:Lcom/QRBS/activity/StartActivity$3;

    # getter for: Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity$3;->access$0(Lcom/QRBS/activity/StartActivity$3;)Lcom/QRBS/activity/StartActivity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/QRBS/activity/StartActivity;->access$4(Lcom/QRBS/activity/StartActivity;Z)V

    .line 246
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$3$1;->this$1:Lcom/QRBS/activity/StartActivity$3;

    # getter for: Lcom/QRBS/activity/StartActivity$3;->this$0:Lcom/QRBS/activity/StartActivity;
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity$3;->access$0(Lcom/QRBS/activity/StartActivity$3;)Lcom/QRBS/activity/StartActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/QRBS/activity/StartActivity;->finish()V

    .line 247
    return-void
.end method
