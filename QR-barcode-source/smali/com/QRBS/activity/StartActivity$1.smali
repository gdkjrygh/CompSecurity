.class Lcom/QRBS/activity/StartActivity$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "StartActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->onCreate(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$1;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 106
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoaded()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$1;->this$0:Lcom/QRBS/activity/StartActivity;

    # invokes: Lcom/QRBS/activity/StartActivity;->loadInterstitial()V
    invoke-static {v0}, Lcom/QRBS/activity/StartActivity;->access$0(Lcom/QRBS/activity/StartActivity;)V

    .line 111
    return-void
.end method
