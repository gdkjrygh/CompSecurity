.class final Lcom/roidapp/photogrid/release/oe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field final synthetic a:Ljava/lang/reflect/Field;

.field final synthetic b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field final synthetic c:Lcom/roidapp/photogrid/release/oa;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/oa;Ljava/lang/reflect/Field;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oe;->c:Lcom/roidapp/photogrid/release/oa;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/oe;->a:Ljava/lang/reflect/Field;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/oe;->b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .locals 2

    .prologue
    .line 338
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oe;->a:Ljava/lang/reflect/Field;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oe;->c:Lcom/roidapp/photogrid/release/oa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 339
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 347
    :cond_0
    :goto_0
    return-void

    .line 342
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oe;->b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-interface {v0}, Landroid/view/ViewTreeObserver$OnScrollChangedListener;->onScrollChanged()V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 345
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0
.end method
