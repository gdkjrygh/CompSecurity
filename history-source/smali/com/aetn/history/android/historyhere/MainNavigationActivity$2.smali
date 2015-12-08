.class Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;
.super Ljava/lang/Object;
.source "MainNavigationActivity.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/MainNavigationActivity;->executeDeeplink(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

.field final synthetic val$poiId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    .prologue
    .line 416
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->val$poiId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTourDetailLoadFailed()V
    .locals 2

    .prologue
    .line 427
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    # getter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$000(Lcom/aetn/history/android/historyhere/MainNavigationActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleDeeplink(): Deeplink could not get detail for this item "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const/4 v1, 0x0

    # setter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mDeepLinkActive:Z
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$102(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Z)Z

    .line 429
    return-void
.end method

.method public onTourDetailLoaded(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 2
    .param p1, "detail"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 420
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 421
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->val$poiId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourInMap(Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/MainNavigationActivity$2;->this$0:Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const/4 v1, 0x0

    # setter for: Lcom/aetn/history/android/historyhere/MainNavigationActivity;->mDeepLinkActive:Z
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->access$102(Lcom/aetn/history/android/historyhere/MainNavigationActivity;Z)Z

    .line 424
    return-void
.end method
