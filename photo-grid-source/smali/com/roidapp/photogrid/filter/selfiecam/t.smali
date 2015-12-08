.class final Lcom/roidapp/photogrid/filter/selfiecam/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field final synthetic a:Landroid/widget/PopupWindow;

.field final synthetic b:Lcom/roidapp/photogrid/filter/selfiecam/o;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/o;Landroid/widget/PopupWindow;)V
    .locals 0

    .prologue
    .line 267
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/t;->b:Lcom/roidapp/photogrid/filter/selfiecam/o;

    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/t;->a:Landroid/widget/PopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 270
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/t;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 272
    const/4 v0, 0x1

    .line 274
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
