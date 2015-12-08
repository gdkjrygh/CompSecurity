.class public Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;
.super Landroid/os/AsyncTask;
.source "MainBookActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MainBookActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ScrolltoPage"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 684
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 689
    const-wide/16 v2, 0x64

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 693
    :goto_0
    const/4 v1, 0x0

    return-object v1

    .line 690
    :catch_0
    move-exception v0

    .line 691
    .local v0, "e":Ljava/lang/InterruptedException;
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 4
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    const/4 v3, 0x0

    .line 698
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 699
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromBookMark:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$2(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromSelectActivity:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$3(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromSearchActivity:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$4(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 700
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromToday:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$5(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromFavorite:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$6(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromWidget:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$7(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 701
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromLikeShare:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$8(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->isFromNotes:Z
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$9(Lcom/hmobile/biblekjv/MainBookActivity;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 702
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->ll:Landroid/widget/LinearLayout;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$10(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I
    invoke-static {v2}, Lcom/hmobile/biblekjv/MainBookActivity;->access$11(Lcom/hmobile/biblekjv/MainBookActivity;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 703
    .local v0, "c":Landroid/view/View;
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-static {v1, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->access$12(Lcom/hmobile/biblekjv/MainBookActivity;I)V

    .line 704
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->scroll:Landroid/widget/ScrollView;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$13(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/ScrollView;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->view_height:I
    invoke-static {v2}, Lcom/hmobile/biblekjv/MainBookActivity;->access$14(Lcom/hmobile/biblekjv/MainBookActivity;)I

    move-result v2

    invoke-virtual {v1, v3, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 705
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$15(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 706
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$16(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 707
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$17(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 708
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$18(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 709
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$19(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 710
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$20(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 711
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-static {v1, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->access$21(Lcom/hmobile/biblekjv/MainBookActivity;Z)V

    .line 714
    .end local v0    # "c":Landroid/view/View;
    :cond_1
    return-void
.end method
