.class Lnet/coocent/android/xmlparser/PromotionSDK$1;
.super Ljava/lang/Object;
.source "PromotionSDK.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/coocent/android/xmlparser/PromotionSDK;->InitMyActionBar(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 75
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$0()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "open"

    invoke-static {v0, v1}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->showPromoationApp()V

    .line 77
    return-void
.end method
