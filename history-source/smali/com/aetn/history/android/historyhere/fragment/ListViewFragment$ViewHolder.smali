.class Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;
.super Ljava/lang/Object;
.source "ListViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field icon:Lcom/android/volley/toolbox/NetworkImageView;

.field iconHolder:Landroid/widget/FrameLayout;

.field iconMask:Landroid/widget/ImageView;

.field id:Ljava/lang/String;

.field position:I

.field root:Landroid/view/ViewGroup;

.field short_description:Landroid/widget/TextView;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

.field title:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .prologue
    .line 332
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
