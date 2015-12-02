.class Lcom/qihoo/security/widget/MaterialRippleLayout$2;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/MaterialRippleLayout;
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
    .line 307
    iput-object p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$2;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$2;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->performLongClick()Z

    .line 311
    return-void
.end method
