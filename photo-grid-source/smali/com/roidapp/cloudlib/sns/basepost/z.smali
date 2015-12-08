.class final Lcom/roidapp/cloudlib/sns/basepost/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Lcom/roidapp/cloudlib/sns/basepost/w;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/w;IJ)V
    .locals 1

    .prologue
    .line 306
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->a:I

    iput-wide p3, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 310
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->b(Lcom/roidapp/cloudlib/sns/basepost/w;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 311
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->notifyDataSetChanged()V

    .line 312
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->c:Lcom/roidapp/cloudlib/sns/basepost/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->a(Lcom/roidapp/cloudlib/sns/basepost/w;)Lcom/roidapp/cloudlib/sns/basepost/at;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/z;->b:J

    invoke-interface {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/at;->a(J)V

    .line 313
    return-void
.end method
