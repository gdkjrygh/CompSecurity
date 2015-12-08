.class final Lcom/roidapp/cloudlib/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/roidapp/cloudlib/w;->a:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/roidapp/cloudlib/w;->a:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ad;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/roidapp/cloudlib/w;->a:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    .line 164
    iget-object v0, p0, Lcom/roidapp/cloudlib/w;->a:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/roidapp/cloudlib/w;->a:Lcom/roidapp/cloudlib/t;

    iget v1, v1, Lcom/roidapp/cloudlib/t;->b:I

    sub-int/2addr v0, v1

    .line 166
    iget-object v1, p0, Lcom/roidapp/cloudlib/w;->a:Lcom/roidapp/cloudlib/t;

    iget-object v1, v1, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/ad;->c(I)V

    .line 170
    :cond_0
    return-void
.end method
