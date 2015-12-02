.class Lcom/qihoo/security/ui/result/view/ResultScrollView$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/ResultScrollView;->a(IJLcom/nineoldandroids/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/nineoldandroids/a/b;

.field final synthetic c:J

.field final synthetic d:Lcom/qihoo/security/ui/result/view/ResultScrollView;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;ILcom/nineoldandroids/a/b;J)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->d:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    iput p2, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->a:I

    iput-object p3, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->b:Lcom/nineoldandroids/a/b;

    iput-wide p4, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 96
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    iget v2, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->a:I

    aput v2, v0, v1

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->b:Lcom/nineoldandroids/a/b;

    if-eqz v1, :cond_0

    .line 98
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->b:Lcom/nineoldandroids/a/b;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 100
    :cond_0
    new-instance v1, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/result/view/ResultScrollView$2$1;-><init>(Lcom/qihoo/security/ui/result/view/ResultScrollView$2;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 121
    iget-wide v2, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$2;->c:J

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 122
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 123
    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 125
    return-void
.end method
