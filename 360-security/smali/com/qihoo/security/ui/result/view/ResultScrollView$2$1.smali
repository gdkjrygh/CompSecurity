.class Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/ResultScrollView$2;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/ResultScrollView$2;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 104
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 105
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView$2;

    iget v1, v1, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->a:I

    if-ge v0, v1, :cond_0

    .line 109
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView$2;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->d:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->smoothScrollTo(II)V

    .line 117
    :goto_0
    return-void

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView$2;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->d:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView$2;

    iget v1, v1, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->a:I

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->smoothScrollTo(II)V

    .line 115
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->b()V

    goto :goto_0
.end method
