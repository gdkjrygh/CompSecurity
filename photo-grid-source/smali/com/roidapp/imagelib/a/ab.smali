.class final Lcom/roidapp/imagelib/a/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Landroid/hardware/Camera$Size;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/aa;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/aa;)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lcom/roidapp/imagelib/a/ab;->a:Lcom/roidapp/imagelib/a/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 473
    check-cast p1, Landroid/hardware/Camera$Size;

    check-cast p2, Landroid/hardware/Camera$Size;

    .line 1477
    iget v2, p1, Landroid/hardware/Camera$Size;->width:I

    iget v3, p2, Landroid/hardware/Camera$Size;->width:I

    if-le v2, v3, :cond_1

    .line 1484
    :cond_0
    :goto_0
    return v0

    .line 1479
    :cond_1
    iget v2, p1, Landroid/hardware/Camera$Size;->width:I

    iget v3, p2, Landroid/hardware/Camera$Size;->width:I

    if-ge v2, v3, :cond_2

    move v0, v1

    .line 1480
    goto :goto_0

    .line 1481
    :cond_2
    iget v2, p1, Landroid/hardware/Camera$Size;->height:I

    iget v3, p2, Landroid/hardware/Camera$Size;->height:I

    if-gt v2, v3, :cond_0

    .line 1483
    iget v0, p1, Landroid/hardware/Camera$Size;->height:I

    iget v2, p2, Landroid/hardware/Camera$Size;->height:I

    if-ge v0, v2, :cond_3

    move v0, v1

    .line 1484
    goto :goto_0

    .line 1485
    :cond_3
    const/4 v0, 0x0

    .line 473
    goto :goto_0
.end method
