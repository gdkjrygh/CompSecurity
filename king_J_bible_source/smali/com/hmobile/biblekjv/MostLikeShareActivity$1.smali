.class Lcom/hmobile/biblekjv/MostLikeShareActivity$1;
.super Ljava/lang/Object;
.source "MostLikeShareActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MostLikeShareActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 76
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->access$1(Lcom/hmobile/biblekjv/MostLikeShareActivity;Z)V

    .line 82
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostLike:Landroid/widget/Button;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->access$2(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f020005

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 83
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostShare:Landroid/widget/Button;
    invoke-static {v0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->access$3(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 86
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->bindData()V

    .line 87
    return-void
.end method
