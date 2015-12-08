.class final Lcom/roidapp/photogrid/filter/selfiecam/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/filter/selfiecam/v;


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:[Ljava/lang/String;

.field private c:I


# direct methods
.method private constructor <init>(Landroid/widget/TextView;)V
    .locals 3

    .prologue
    .line 492
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ".JPG"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ".PNG"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->b:[Ljava/lang/String;

    .line 493
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->a:Landroid/widget/TextView;

    .line 494
    return-void
.end method

.method synthetic constructor <init>(Landroid/widget/TextView;B)V
    .locals 0

    .prologue
    .line 487
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/x;-><init>(Landroid/widget/TextView;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 498
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->b:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 519
    iget v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->c:I

    return v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 508
    iput p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->c:I

    .line 1498
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->b:[Ljava/lang/String;

    aget-object v0, v0, p1

    .line 510
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 511
    if-nez p1, :cond_0

    .line 512
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Z)V

    .line 515
    :goto_0
    return-void

    .line 514
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/x;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Z)V

    goto :goto_0
.end method
