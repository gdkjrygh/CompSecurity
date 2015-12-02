.class Lcom/qihoo/security/widget/material/a$2;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/material/a;->a(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/qihoo/security/widget/material/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/material/a;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    iput-object p2, p0, Lcom/qihoo/security/widget/material/a$2;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->b(Lcom/qihoo/security/widget/material/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/material/a;->a(F)V

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    invoke-static {v1}, Lcom/qihoo/security/widget/material/a;->c(Lcom/qihoo/security/widget/material/a;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/material/a;->a(Ljava/lang/Integer;)V

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->d(Lcom/qihoo/security/widget/material/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 289
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a$2;->b:Lcom/qihoo/security/widget/material/a;

    invoke-static {v0}, Lcom/qihoo/security/widget/material/a;->a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 290
    return-void
.end method
