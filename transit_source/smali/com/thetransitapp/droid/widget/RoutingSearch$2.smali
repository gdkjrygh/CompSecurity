.class Lcom/thetransitapp/droid/widget/RoutingSearch$2;
.super Ljava/lang/Object;
.source "RoutingSearch.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/RoutingSearch;->reverseGeocode(Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

.field private final synthetic val$options:Lcom/google/android/gms/maps/model/MarkerOptions;

.field private final synthetic val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/RoutingSearch;Lcom/thetransitapp/droid/widget/SuggestionTextView;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    iput-object p3, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->val$options:Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 377
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->onResult(Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Ljava/lang/String;)V
    .locals 4
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 361
    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    if-eqz v1, :cond_0

    .line 362
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v1, p1, v3}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 363
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/SuggestionTextView;->dismissDropDown()V

    .line 364
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->val$options:Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 366
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

    # invokes: Lcom/thetransitapp/droid/widget/RoutingSearch;->shouldEnableRouteButton()Z
    invoke-static {v1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->access$0(Lcom/thetransitapp/droid/widget/RoutingSearch;)Z

    move-result v0

    .line 368
    .local v0, "enable":Z
    if-eqz v0, :cond_0

    .line 369
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->hideKeyboard()V

    .line 370
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$2;->this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

    # getter for: Lcom/thetransitapp/droid/widget/RoutingSearch;->delegate:Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;
    invoke-static {v1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->access$1(Lcom/thetransitapp/droid/widget/RoutingSearch;)Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v3, v2}, Lcom/thetransitapp/droid/widget/RoutingSearch$RoutingSearchDelegate;->routeButtonStatusChange(ZZZ)V

    .line 373
    .end local v0    # "enable":Z
    :cond_0
    return-void
.end method
