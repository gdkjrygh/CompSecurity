.class Lcom/hmobile/biblekjv/SelectActivity$1;
.super Ljava/lang/Object;
.source "SelectActivity.java"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SelectActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/SelectActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SelectActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 4
    .param p1, "group"    # Landroid/widget/RadioGroup;
    .param p2, "checkedId"    # I

    .prologue
    .line 84
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget-object v1, v1, Lcom/hmobile/biblekjv/SelectActivity;->segmentText:Lcom/hmobile/common/SegmentedRadioGroup;

    if-ne p1, v1, :cond_0

    .line 86
    const-wide/16 v2, 0xc8

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :goto_0
    const v1, 0x7f0e00cd

    if-ne p2, v1, :cond_1

    .line 91
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/SelectActivity;->loadviewForBook()V

    .line 98
    :cond_0
    :goto_1
    return-void

    .line 87
    :catch_0
    move-exception v0

    .line 88
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 92
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :cond_1
    const v1, 0x7f0e00ce

    if-ne p2, v1, :cond_2

    .line 93
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget v2, v2, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/SelectActivity;->loadviewForChapter(I)V

    goto :goto_1

    .line 94
    :cond_2
    const v1, 0x7f0e00cf

    if-ne p2, v1, :cond_0

    .line 95
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget v2, v2, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    iget-object v3, p0, Lcom/hmobile/biblekjv/SelectActivity$1;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget v3, v3, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    invoke-virtual {v1, v2, v3}, Lcom/hmobile/biblekjv/SelectActivity;->loadviewForVerse(II)V

    goto :goto_1
.end method
