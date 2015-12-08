.class Lcom/arist/util/AdUtil$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "AdUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/util/AdUtil;->showAD(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$adContainer:Landroid/widget/LinearLayout;


# direct methods
.method constructor <init>(Landroid/widget/LinearLayout;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/util/AdUtil$1;->val$adContainer:Landroid/widget/LinearLayout;

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoaded()V
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lcom/arist/util/AdUtil$1;->val$adContainer:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 30
    return-void
.end method
