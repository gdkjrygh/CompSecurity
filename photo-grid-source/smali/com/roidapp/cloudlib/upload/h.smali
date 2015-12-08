.class final Lcom/roidapp/cloudlib/upload/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    :goto_0
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->c()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v1, v1, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/upload/c;->d()I

    move-result v1

    sub-int/2addr v0, v1

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->showDialog(I)V

    goto :goto_0

    .line 116
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/h;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->b()V

    goto :goto_0
.end method
