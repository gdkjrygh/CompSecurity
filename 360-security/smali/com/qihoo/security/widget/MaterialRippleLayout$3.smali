.class Lcom/qihoo/security/widget/MaterialRippleLayout$3;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/qihoo/security/widget/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 339
    iput-object p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    iput-object p2, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->b(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setRadius(F)V

    .line 344
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    iget-object v1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->c(Lcom/qihoo/security/widget/MaterialRippleLayout;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setRippleAlpha(Ljava/lang/Integer;)V

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->d(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 349
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$3;->b:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 350
    return-void
.end method
