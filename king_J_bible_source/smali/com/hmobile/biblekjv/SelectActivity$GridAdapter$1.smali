.class Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;
.super Ljava/lang/Object;
.source "SelectActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

.field private final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    iput p2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->val$position:I

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 239
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    iget-boolean v1, v1, Lcom/hmobile/biblekjv/SelectActivity;->isChapterView:Z

    if-eqz v1, :cond_1

    .line 240
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    iget v2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->val$position:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    .line 241
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/hmobile/biblekjv/SelectActivity;->segmentText:Lcom/hmobile/common/SegmentedRadioGroup;

    const v2, 0x7f0e00cf

    invoke-virtual {v1, v2}, Lcom/hmobile/common/SegmentedRadioGroup;->check(I)V

    .line 256
    :cond_0
    :goto_0
    return-void

    .line 242
    :cond_1
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    iget-boolean v1, v1, Lcom/hmobile/biblekjv/SelectActivity;->isVerseView:Z

    if-eqz v1, :cond_0

    .line 243
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    iget v2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->val$position:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/hmobile/biblekjv/SelectActivity;->verse_id:I

    .line 244
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    .line 245
    const-class v2, Lcom/hmobile/biblekjv/MainBookActivity;

    .line 244
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 246
    .local v0, "returnIntent":Landroid/content/Intent;
    const-string v1, "book_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v2}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v2

    iget v2, v2, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 247
    const-string v1, "chap_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v2}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v2

    iget v2, v2, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 248
    const-string v1, "verse_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v2}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v2

    iget v2, v2, Lcom/hmobile/biblekjv/SelectActivity;->verse_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 249
    const-string v1, "select_flag"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 251
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 252
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/SelectActivity;->startActivity(Landroid/content/Intent;)V

    .line 253
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;->this$1:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    # getter for: Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/SelectActivity;->finish()V

    goto :goto_0
.end method
