.class Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;
.super Ljava/lang/Object;
.source "SelectActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

.field private final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

    iput p2, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;->val$position:I

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 320
    iget-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v0

    iget v1, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;->val$position:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    .line 321
    iget-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/hmobile/biblekjv/SelectActivity;->segmentText:Lcom/hmobile/common/SegmentedRadioGroup;

    const v1, 0x7f0e00ce

    invoke-virtual {v0, v1}, Lcom/hmobile/common/SegmentedRadioGroup;->check(I)V

    .line 322
    return-void
.end method
