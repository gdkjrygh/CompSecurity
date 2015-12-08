.class Lcom/hmobile/biblekjv/MainBookActivity$9;
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

.field private final synthetic val$s:Lcom/hmobile/model/VerseInfo;

.field private final synthetic val$txtVerse:Lcom/hmobile/biblekjv/ClickPreventableTextView;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;Lcom/hmobile/model/VerseInfo;Lcom/hmobile/biblekjv/ClickPreventableTextView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$s:Lcom/hmobile/model/VerseInfo;

    iput-object p3, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$txtVerse:Lcom/hmobile/biblekjv/ClickPreventableTextView;

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 628
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 629
    .local v0, "i":I
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$s:Lcom/hmobile/model/VerseInfo;

    iget v2, v2, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-static {v1, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->access$33(Lcom/hmobile/biblekjv/MainBookActivity;I)V

    .line 631
    if-nez v0, :cond_0

    .line 632
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$txtVerse:Lcom/hmobile/biblekjv/ClickPreventableTextView;

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->underlineText(Landroid/widget/TextView;)V

    .line 633
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$22(Lcom/hmobile/biblekjv/MainBookActivity;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$s:Lcom/hmobile/model/VerseInfo;

    iget v2, v2, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 640
    :goto_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$22(Lcom/hmobile/biblekjv/MainBookActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 641
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-boolean v3, v1, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    .line 646
    :goto_1
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->setoncontentClick()V

    .line 647
    return-void

    .line 636
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$txtVerse:Lcom/hmobile/biblekjv/ClickPreventableTextView;

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->removeunderline(Landroid/widget/TextView;)V

    .line 637
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->access$22(Lcom/hmobile/biblekjv/MainBookActivity;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->val$s:Lcom/hmobile/model/VerseInfo;

    iget v2, v2, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 638
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 643
    :cond_1
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$9;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    .line 644
    const-string v3, "navigation_fade"

    .line 643
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v1, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    goto :goto_1
.end method
