.class final Lcom/roidapp/imagelib/a/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 790
    iput-object p1, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .prologue
    .line 793
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 794
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/imagelib/a/a;->b(I)V

    .line 795
    sput p2, Lcom/roidapp/imagelib/a/h;->h:I

    .line 797
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 798
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 799
    :cond_1
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 803
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 804
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 805
    :cond_0
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 809
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 810
    iget-object v0, p0, Lcom/roidapp/imagelib/a/l;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 811
    :cond_0
    return-void
.end method
