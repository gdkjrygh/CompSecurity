.class Lcom/hmobile/biblekjv/BaseActivity$12;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->showAlertForTwitterShare(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;

.field private final synthetic val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

.field private final synthetic val$sharetext:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$12;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$12;->val$sharetext:Ljava/lang/String;

    iput-object p3, p0, Lcom/hmobile/biblekjv/BaseActivity$12;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    .line 742
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 746
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$12;->val$sharetext:Ljava/lang/String;

    const/4 v3, 0x0

    const/16 v4, 0x88

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 747
    .local v0, "s":Ljava/lang/String;
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$12;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$12;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    invoke-virtual {v1, v0, v2}, Lcom/hmobile/biblekjv/BaseActivity;->signInwithTwitter(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    .line 748
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 750
    return-void
.end method
