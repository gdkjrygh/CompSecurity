.class final Lcom/roidapp/cloudlib/template/c/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/cloudlib/template/c/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/template/c/f;I)V
    .locals 0

    .prologue
    .line 266
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/h;->b:Lcom/roidapp/cloudlib/template/c/f;

    iput p2, p0, Lcom/roidapp/cloudlib/template/c/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 269
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/h;->b:Lcom/roidapp/cloudlib/template/c/f;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    iget v1, p0, Lcom/roidapp/cloudlib/template/c/h;->a:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a_(I)V

    .line 270
    return-void
.end method
