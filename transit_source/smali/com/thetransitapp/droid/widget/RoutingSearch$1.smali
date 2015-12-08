.class Lcom/thetransitapp/droid/widget/RoutingSearch$1;
.super Ljava/lang/Object;
.source "RoutingSearch.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/RoutingSearch;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

.field private final synthetic val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/RoutingSearch;Lcom/thetransitapp/droid/widget/SuggestionTextView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$1;->this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$1;->val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAddressReceived(Lcom/bricolsoftconsulting/geocoderplus/Address;)V
    .locals 2
    .param p1, "address"    # Lcom/bricolsoftconsulting/geocoderplus/Address;

    .prologue
    .line 276
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$1;->this$0:Lcom/thetransitapp/droid/widget/RoutingSearch;

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingSearch$1;->val$textView:Lcom/thetransitapp/droid/widget/SuggestionTextView;

    invoke-virtual {v0, v1, p1}, Lcom/thetransitapp/droid/widget/RoutingSearch;->onAddressReceived(Landroid/view/View;Lcom/bricolsoftconsulting/geocoderplus/Address;)V

    .line 277
    return-void
.end method
