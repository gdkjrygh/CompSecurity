.class final Lcom/roidapp/cloudlib/sns/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/i;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/i;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/k;->b:Lcom/roidapp/cloudlib/sns/i;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/k;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/k;->a:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
