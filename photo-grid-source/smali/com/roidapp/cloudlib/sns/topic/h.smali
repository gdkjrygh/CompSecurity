.class final Lcom/roidapp/cloudlib/sns/topic/h;
.super Landroid/support/v7/widget/t;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/roidapp/cloudlib/sns/topic/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/e;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/h;->b:Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {p0}, Landroid/support/v7/widget/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/h;->b:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/c/y;->a(I)I

    move-result v1

    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/h;->b:Lcom/roidapp/cloudlib/sns/topic/e;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/topic/e;->d:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->d()Landroid/support/v7/widget/al;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/topic/a;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/topic/a;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0
.end method
