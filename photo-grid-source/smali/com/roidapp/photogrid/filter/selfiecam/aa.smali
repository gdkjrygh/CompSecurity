.class final Lcom/roidapp/photogrid/filter/selfiecam/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/filter/selfiecam/v;


# instance fields
.field private final a:[I

.field private final b:Landroid/widget/TextView;

.field private c:I


# direct methods
.method public constructor <init>([ILandroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 458
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 459
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->a:[I

    .line 460
    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->b:Landroid/widget/TextView;

    .line 461
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 470
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->a:[I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->a:[I

    array-length v0, v0

    goto :goto_0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 465
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->a:[I

    aget v0, v0, p1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "P"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 483
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->c:I

    return v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 475
    iput p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->c:I

    .line 476
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/aa;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 477
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/aa;->a:[I

    aget v1, v1, p1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;I)V

    .line 479
    return-void
.end method
