.class Lcom/qihoo/security/ui/b/b$c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:I

.field b:J

.field c:J

.field d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/ui/b/b$b;",
            ">;"
        }
    .end annotation
.end field

.field f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/ViewTreeObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILcom/qihoo/security/ui/b/b$b;)V
    .locals 1

    .prologue
    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    iput p1, p0, Lcom/qihoo/security/ui/b/b$c;->a:I

    .line 313
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/b$c;->e:Ljava/lang/ref/WeakReference;

    .line 314
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 324
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/b/b$c;->c:J

    .line 325
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$c;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewTreeObserver;

    .line 326
    if-eqz v0, :cond_0

    .line 327
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 329
    :cond_0
    return-void
.end method

.method public a(Landroid/view/ViewTreeObserver;)V
    .locals 2

    .prologue
    .line 317
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/b$c;->f:Ljava/lang/ref/WeakReference;

    .line 318
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 319
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/b/b$c;->d:Landroid/util/SparseArray;

    .line 320
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/b/b$c;->b:J

    .line 321
    return-void
.end method

.method public onPreDraw()Z
    .locals 3

    .prologue
    .line 333
    iget-object v0, p0, Lcom/qihoo/security/ui/b/b$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/b/b$b;

    .line 334
    if-eqz v0, :cond_0

    .line 335
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->c()Lcom/qihoo/security/ui/b/b;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/ui/b/b$c;->a:I

    invoke-interface {v0}, Lcom/qihoo/security/ui/b/b$b;->a()I

    move-result v0

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/ui/b/b;->a(Lcom/qihoo/security/ui/b/b;II)V

    .line 339
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 337
    :cond_0
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->c()Lcom/qihoo/security/ui/b/b;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/ui/b/b$c;->a:I

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(Lcom/qihoo/security/ui/b/b;I)V

    goto :goto_0
.end method
