.class Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;
.super Ljava/lang/Object;
.source "SearchResultActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

.field private final synthetic val$info:Lcom/hmobile/model/VerseInfo;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;Lcom/hmobile/model/VerseInfo;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->this$1:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->val$info:Lcom/hmobile/model/VerseInfo;

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 264
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 265
    .local v0, "returnIntent":Landroid/content/Intent;
    const-string v1, "book_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->val$info:Lcom/hmobile/model/VerseInfo;

    iget v2, v2, Lcom/hmobile/model/VerseInfo;->BookId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 266
    const-string v1, "chap_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->val$info:Lcom/hmobile/model/VerseInfo;

    iget v2, v2, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 267
    const-string v1, "verse_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->val$info:Lcom/hmobile/model/VerseInfo;

    iget v2, v2, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 268
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->this$1:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    # getter for: Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->access$0(Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;)Lcom/hmobile/biblekjv/SearchResultActivity;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/hmobile/biblekjv/SearchResultActivity;->setResult(ILandroid/content/Intent;)V

    .line 269
    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;->this$1:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    # getter for: Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->access$0(Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;)Lcom/hmobile/biblekjv/SearchResultActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/SearchResultActivity;->finish()V

    .line 270
    return-void
.end method
