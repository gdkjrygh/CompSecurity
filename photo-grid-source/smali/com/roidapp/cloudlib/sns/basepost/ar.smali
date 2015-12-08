.class final Lcom/roidapp/cloudlib/sns/basepost/ar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/basepost/bb;


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;JLjava/lang/String;)V
    .locals 0

    .prologue
    .line 850
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iput-wide p2, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->a:J

    iput-object p4, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    .line 854
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->t(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 855
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->t(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->bringToFront()V

    .line 856
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->u(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->v(Lcom/roidapp/cloudlib/sns/basepost/ad;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->c:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/basepost/ad;->b(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/n;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v3, v3, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->a:J

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/basepost/ar;->b:Ljava/lang/String;

    new-instance v7, Lcom/roidapp/cloudlib/sns/basepost/as;

    invoke-direct {v7, p0}, Lcom/roidapp/cloudlib/sns/basepost/as;-><init>(Lcom/roidapp/cloudlib/sns/basepost/ar;)V

    invoke-static/range {v0 .. v7}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JIJLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 883
    return-void
.end method
