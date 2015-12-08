.class final Lcom/roidapp/baselib/c/z;
.super Landroid/support/v7/widget/an;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/c/y;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/c/y;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/baselib/c/z;->a:Lcom/roidapp/baselib/c/y;

    invoke-direct {p0}, Landroid/support/v7/widget/an;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 50
    invoke-super {p0}, Landroid/support/v7/widget/an;->a()V

    .line 51
    iget-object v0, p0, Lcom/roidapp/baselib/c/z;->a:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->c()V

    .line 52
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 68
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/an;->a(II)V

    .line 69
    iget-object v0, p0, Lcom/roidapp/baselib/c/z;->a:Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/baselib/c/z;->a:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->g()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, p2}, Lcom/roidapp/baselib/c/y;->a(II)V

    .line 70
    return-void
.end method

.method public final b(II)V
    .locals 2

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/an;->b(II)V

    .line 63
    iget-object v0, p0, Lcom/roidapp/baselib/c/z;->a:Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/baselib/c/z;->a:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v1}, Lcom/roidapp/baselib/c/y;->g()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, p2}, Lcom/roidapp/baselib/c/y;->b(II)V

    .line 64
    return-void
.end method
