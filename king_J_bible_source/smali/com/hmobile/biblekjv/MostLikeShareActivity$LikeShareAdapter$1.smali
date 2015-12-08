.class Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;
.super Ljava/lang/Object;
.source "MostLikeShareActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

.field private final synthetic val$book_id:I

.field private final synthetic val$chap_id:I

.field private final synthetic val$verse_id:I


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;III)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->this$1:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    iput p2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->val$book_id:I

    iput p3, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->val$chap_id:I

    iput p4, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->val$verse_id:I

    .line 259
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

    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->this$1:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;)Lcom/hmobile/biblekjv/MostLikeShareActivity;

    move-result-object v1

    .line 265
    const-class v2, Lcom/hmobile/biblekjv/MainBookActivity;

    .line 264
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 266
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "book_id"

    iget v2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->val$book_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 267
    const-string v1, "chap_id"

    iget v2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->val$chap_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 268
    const-string v1, "verse_id"

    iget v2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->val$verse_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 269
    const-string v1, "isFromLikeShare"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 270
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->this$1:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;)Lcom/hmobile/biblekjv/MostLikeShareActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->startActivity(Landroid/content/Intent;)V

    .line 271
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;->this$1:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;)Lcom/hmobile/biblekjv/MostLikeShareActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->finish()V

    .line 272
    return-void
.end method
