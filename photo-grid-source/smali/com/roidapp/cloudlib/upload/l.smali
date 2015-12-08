.class final Lcom/roidapp/cloudlib/upload/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/l;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 173
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/l;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/l;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->a(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/c;->c(I)V

    .line 174
    return-void
.end method
