.class Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;
.super Ljava/lang/Object;
.source "TourHomeListViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field bg:Landroid/view/ViewGroup;

.field city:Landroid/widget/TextView;

.field defaultIcon:Landroid/widget/ImageView;

.field icon:Lcom/android/volley/toolbox/NetworkImageView;

.field iconHolder:Landroid/view/ViewGroup;

.field iconMask:Landroid/widget/ImageView;

.field id:Ljava/lang/String;

.field mileage:Landroid/widget/TextView;

.field sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

.field title:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .prologue
    .line 354
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
