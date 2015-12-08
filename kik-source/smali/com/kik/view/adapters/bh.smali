.class final Lcom/kik/view/adapters/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/s;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;)V
    .locals 0

    .prologue
    .line 476
    iput-object p1, p0, Lcom/kik/view/adapters/bh;->b:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bh;->a:Lcom/kik/view/adapters/bf$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .prologue
    const/high16 v3, 0x42c80000    # 100.0f

    .line 480
    iget-object v0, p0, Lcom/kik/view/adapters/bh;->a:Lcom/kik/view/adapters/bf$b;

    check-cast v0, Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->w:Lkik/android/widget/ProgressWheel;

    .line 481
    if-eqz v0, :cond_0

    int-to-float v1, p1

    div-float/2addr v1, v3

    const v2, 0x3dcccccd    # 0.1f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 482
    int-to-float v1, p1

    div-float/2addr v1, v3

    invoke-virtual {v0, v1}, Lkik/android/widget/ProgressWheel;->a(F)V

    .line 484
    :cond_0
    return-void
.end method
