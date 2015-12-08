.class final Lcom/roidapp/cloudlib/upload/r;
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
    .line 395
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/r;->a:Lcom/roidapp/cloudlib/upload/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 399
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 400
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 401
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/r;->a:Lcom/roidapp/cloudlib/upload/o;

    iget-object v1, v1, Lcom/roidapp/cloudlib/upload/o;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    iget-object v1, v1, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->d:Lcom/roidapp/cloudlib/upload/c;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/upload/c;->a(I)V

    .line 403
    :cond_0
    return-void
.end method
