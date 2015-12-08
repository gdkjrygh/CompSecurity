.class Lcom/hmobile/biblekjv/MainBookActivity$8;
.super Landroid/text/style/ClickableSpan;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;

.field private final synthetic val$ninfo:Lcom/hmobile/model/NotesInfo;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;Lcom/hmobile/model/NotesInfo;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->val$ninfo:Lcom/hmobile/model/NotesInfo;

    .line 578
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "widget"    # Landroid/view/View;

    .prologue
    .line 581
    instance-of v0, p1, Lcom/hmobile/biblekjv/ClickPreventableTextView;

    if-eqz v0, :cond_1

    move-object v0, p1

    .line 582
    check-cast v0, Lcom/hmobile/biblekjv/ClickPreventableTextView;

    .line 583
    invoke-virtual {v0}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->ignoreSpannableClick()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 593
    :goto_0
    return-void

    :cond_0
    move-object v0, p1

    .line 585
    check-cast v0, Lcom/hmobile/biblekjv/ClickPreventableTextView;

    .line 586
    invoke-virtual {v0}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->preventNextClick()V

    .line 588
    :cond_1
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->val$ninfo:Lcom/hmobile/model/NotesInfo;

    iget-object v2, v2, Lcom/hmobile/model/NotesInfo;->Title:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 589
    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->val$ninfo:Lcom/hmobile/model/NotesInfo;

    iget-object v2, v2, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->val$ninfo:Lcom/hmobile/model/NotesInfo;

    invoke-virtual {v2}, Lcom/hmobile/model/NotesInfo;->getID()J

    move-result-wide v2

    .line 588
    # invokes: Lcom/hmobile/biblekjv/MainBookActivity;->menuDialogDisplayPopup(Ljava/lang/String;J)V
    invoke-static {v0, v1, v2, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$31(Lcom/hmobile/biblekjv/MainBookActivity;Ljava/lang/String;J)V

    .line 590
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    new-instance v1, Lcom/hmobile/quickaction/QuickActionNotes;

    invoke-direct {v1, p1}, Lcom/hmobile/quickaction/QuickActionNotes;-><init>(Landroid/view/View;)V

    iput-object v1, v0, Lcom/hmobile/biblekjv/MainBookActivity;->qa:Lcom/hmobile/quickaction/QuickActionNotes;

    .line 591
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->qa:Lcom/hmobile/quickaction/QuickActionNotes;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->actionpopup:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$32(Lcom/hmobile/biblekjv/MainBookActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickActionNotes;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 592
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$8;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->qa:Lcom/hmobile/quickaction/QuickActionNotes;

    invoke-virtual {v0}, Lcom/hmobile/quickaction/QuickActionNotes;->show()V

    goto :goto_0
.end method
