.class final Lcom/roidapp/cloudlib/upload/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/o;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/o;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/p;->a:Lcom/roidapp/cloudlib/upload/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 352
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/p;->a:Lcom/roidapp/cloudlib/upload/o;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/o;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;I)I

    .line 355
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/p;->a:Lcom/roidapp/cloudlib/upload/o;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/o;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->showDialog(I)V

    .line 357
    :cond_0
    return-void
.end method
