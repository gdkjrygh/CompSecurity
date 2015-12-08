.class Lcom/hmobile/biblekjv/MainBookActivity$13;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->ShowAlertForFacebook(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;

.field private final synthetic val$dialog:Landroid/app/AlertDialog;

.field private final synthetic val$edtText:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/widget/EditText;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->val$edtText:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->val$dialog:Landroid/app/AlertDialog;

    .line 1381
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1385
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->val$edtText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1386
    .local v0, "sharetext":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    .line 1387
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/MainBookActivity;->bookname:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->signInWithFb(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1388
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 1389
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity$13;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    .line 1391
    :cond_0
    return-void
.end method
