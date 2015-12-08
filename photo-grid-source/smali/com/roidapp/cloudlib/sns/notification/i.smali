.class final Lcom/roidapp/cloudlib/sns/notification/i;
.super Lcom/roidapp/cloudlib/sns/basepost/v;
.source "SourceFile"


# instance fields
.field final synthetic d:I

.field final synthetic e:Lcom/roidapp/cloudlib/sns/notification/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/f;IIJI)V
    .locals 8

    .prologue
    .line 347
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/i;->e:Lcom/roidapp/cloudlib/sns/notification/f;

    iput p6, p0, Lcom/roidapp/cloudlib/sns/notification/i;->d:I

    const/16 v6, 0x1001

    move-object v1, p0

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/basepost/v;-><init>(IIJI)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/i;->e:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->c(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 352
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/i;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 353
    const/16 v0, 0x1001

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 354
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/i;->e:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->c(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 356
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/v;->onClick(Landroid/view/View;)V

    .line 357
    return-void
.end method
