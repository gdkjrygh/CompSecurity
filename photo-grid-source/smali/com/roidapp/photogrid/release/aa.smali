.class public final Lcom/roidapp/photogrid/release/aa;
.super Landroid/graphics/drawable/ColorDrawable;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/r;

.field private final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/r;Lcom/roidapp/photogrid/release/u;)V
    .locals 1

    .prologue
    .line 392
    iput-object p1, p0, Lcom/roidapp/photogrid/release/aa;->a:Lcom/roidapp/photogrid/release/r;

    .line 393
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 394
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/aa;->b:Ljava/lang/ref/WeakReference;

    .line 396
    return-void
.end method


# virtual methods
.method public final a()Lcom/roidapp/photogrid/release/u;
    .locals 1

    .prologue
    .line 399
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aa;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/u;

    return-object v0
.end method
