.class Lcom/arist/MusicPlayer/MainActivity$25;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 708
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0
    .param p1, "arg0"    # I

    .prologue
    .line 749
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0
    .param p1, "arg0"    # I
    .param p2, "arg1"    # F
    .param p3, "arg2"    # I

    .prologue
    .line 746
    return-void
.end method

.method public onPageSelected(I)V
    .locals 5
    .param p1, "position"    # I

    .prologue
    .line 710
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iput p1, v3, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    .line 711
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget v3, v3, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    invoke-static {v3}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentPage(I)V

    .line 713
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget v3, v3, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    if-nez v3, :cond_0

    .line 714
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->buttonInfoBiz:Lcom/arist/biz/ButtonInfoBiz;
    invoke-static {v4}, Lcom/arist/MusicPlayer/MainActivity;->access$53(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/biz/ButtonInfoBiz;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/biz/ButtonInfoBiz;->getButtonInfos()Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/arist/MusicPlayer/MainActivity;->access$54(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V

    .line 715
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$55(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MainGridAdapter;

    move-result-object v3

    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/arist/MusicPlayer/MainActivity;->access$56(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/arist/Adapter/MainGridAdapter;->setData(Ljava/util/ArrayList;)V

    .line 716
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$55(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MainGridAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/Adapter/MainGridAdapter;->notifyDataSetChanged()V

    .line 732
    :cond_0
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$57(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 733
    .local v2, "totalPage":I
    const/4 v3, 0x4

    new-array v1, v3, [I

    .line 734
    .local v1, "positions":[I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-lt v0, v2, :cond_1

    .line 738
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->setComps(I[I)V
    invoke-static {v3, v2, v1}, Lcom/arist/MusicPlayer/MainActivity;->access$58(Lcom/arist/MusicPlayer/MainActivity;I[I)V

    .line 739
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$25$1;

    invoke-direct {v3, p0}, Lcom/arist/MusicPlayer/MainActivity$25$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$25;)V

    .line 742
    invoke-virtual {v3}, Lcom/arist/MusicPlayer/MainActivity$25$1;->start()V

    .line 743
    return-void

    .line 735
    :cond_1
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$25;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget v3, v3, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    if-ne v0, v3, :cond_2

    .line 736
    const/4 v3, 0x1

    aput v3, v1, v0

    .line 734
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
