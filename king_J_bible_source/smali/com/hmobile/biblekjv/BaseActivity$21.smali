.class Lcom/hmobile/biblekjv/BaseActivity$21;
.super Lcom/google/android/gms/ads/AdListener;
.source "BaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->addAdView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$21;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 1085
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(I)V
    .locals 2
    .param p1, "errorCode"    # I

    .prologue
    .line 1088
    invoke-super {p0, p1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(I)V

    .line 1089
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$21;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 1090
    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    .prologue
    .line 1094
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    .line 1095
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$21;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/BaseActivity;->adView:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    .line 1096
    return-void
.end method
