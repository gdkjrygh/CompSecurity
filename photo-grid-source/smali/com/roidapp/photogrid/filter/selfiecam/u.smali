.class final Lcom/roidapp/photogrid/filter/selfiecam/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Landroid/widget/PopupWindow;

.field final synthetic b:Lcom/roidapp/photogrid/filter/selfiecam/o;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/o;Landroid/widget/PopupWindow;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/u;->b:Lcom/roidapp/photogrid/filter/selfiecam/o;

    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/u;->a:Landroid/widget/PopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/u;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 282
    const/4 v0, 0x1

    return v0
.end method
