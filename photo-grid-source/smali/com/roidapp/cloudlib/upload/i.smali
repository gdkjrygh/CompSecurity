.class final Lcom/roidapp/cloudlib/upload/i;
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
    .line 149
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/i;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/i;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v0, v0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/c;->b()V

    .line 154
    return-void
.end method
