.class final Lcom/roidapp/cloudlib/sns/topic/a/d;
.super Landroid/support/v7/widget/t;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/roidapp/cloudlib/sns/topic/a/b;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/topic/a/b;)V
    .locals 0

    .prologue
    .line 159
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/a/d;->b:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-direct {p0}, Landroid/support/v7/widget/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 162
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/d;->b:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->w(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/c/y;->a(I)I

    move-result v1

    .line 163
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a/d;->b:Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;->x(Lcom/roidapp/cloudlib/sns/topic/a/b;)Lcom/roidapp/baselib/c/y;

    move-result-object v0

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
    const/4 v0, 0x3

    goto :goto_0
.end method
