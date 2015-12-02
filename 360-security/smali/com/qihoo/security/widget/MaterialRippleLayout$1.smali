.class Lcom/qihoo/security/widget/MaterialRippleLayout$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/MaterialRippleLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/MaterialRippleLayout;)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$1;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 230
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$1;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 231
    return-void
.end method
