.class Lnet/coocent/android/xmlparser/PromotionSDK$2;
.super Ljava/lang/Object;
.source "PromotionSDK.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/coocent/android/xmlparser/PromotionSDK;->setListOnItemClickListner(Landroid/widget/GridView;Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field private final synthetic val$giftGridViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;


# direct methods
.method constructor <init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lnet/coocent/android/xmlparser/PromotionSDK$2;->val$giftGridViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "arg2"    # I
    .param p4, "arg3"    # J
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 185
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$1()Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 186
    .local v1, "ed":Landroid/content/SharedPreferences$Editor;
    iget-object v6, p0, Lnet/coocent/android/xmlparser/PromotionSDK$2;->val$giftGridViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    .line 187
    invoke-virtual {v6, p3}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v6

    .line 186
    check-cast v6, Lnet/coocent/android/xmlparser/GiftEntity;

    .line 187
    invoke-virtual {v6}, Lnet/coocent/android/xmlparser/GiftEntity;->getPackagename()Ljava/lang/String;

    move-result-object v4

    .line 188
    .local v4, "packagename":Ljava/lang/String;
    invoke-interface {v1, v4, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 189
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 190
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "market://details?id="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 192
    .local v3, "marketUrl":Ljava/lang/String;
    :try_start_0
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 193
    .local v5, "uri":Landroid/net/Uri;
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$0()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 194
    const-string v7, "com.android.vending"

    invoke-virtual {v6, v7}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 195
    const-string v7, "android.intent.action.VIEW"

    invoke-virtual {v6, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 196
    .local v2, "intent":Landroid/content/Intent;
    invoke-virtual {v2, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 198
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$0()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    :goto_0
    iget-object v6, p0, Lnet/coocent/android/xmlparser/PromotionSDK$2;->val$giftGridViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    invoke-virtual {v6}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->notifyDataSetChanged()V

    .line 205
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$0()Landroid/app/Activity;

    move-result-object v6

    const/16 v7, 0x2e

    const/16 v8, 0x5f

    invoke-virtual {v4, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 206
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$0()Landroid/app/Activity;

    move-result-object v6

    const-string v7, "total"

    invoke-static {v6, v7}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 207
    return-void

    .line 199
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v5    # "uri":Landroid/net/Uri;
    :catch_0
    move-exception v0

    .line 200
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 201
    .restart local v5    # "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v2, v6, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 202
    .restart local v2    # "intent":Landroid/content/Intent;
    # getter for: Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->access$0()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
