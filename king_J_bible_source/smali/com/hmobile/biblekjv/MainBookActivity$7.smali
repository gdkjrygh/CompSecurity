.class Lcom/hmobile/biblekjv/MainBookActivity$7;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$7;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 539
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 542
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$7;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->access$0(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 543
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$7;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$7;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->startNewThread()V

    .line 546
    :cond_0
    return-void
.end method
