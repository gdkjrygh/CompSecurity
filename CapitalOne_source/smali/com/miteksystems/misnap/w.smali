.class final Lcom/miteksystems/misnap/w;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, -0x1

    const/4 v2, 0x0

    sput-boolean v2, Lcom/miteksystems/misnap/MiSnap;->i:Z

    sput-boolean v2, Lcom/miteksystems/misnap/u;->a:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->aj()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0, v2}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;Z)V

    sput-boolean v2, Lcom/miteksystems/misnap/u;->a:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->A(Lcom/miteksystems/misnap/u;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->B(Lcom/miteksystems/misnap/u;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0, v4}, Lcom/miteksystems/misnap/u;->b(Lcom/miteksystems/misnap/u;Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->j()V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->C(Lcom/miteksystems/misnap/u;)I

    move-result v1

    invoke-virtual {v0, v2, v2, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->D(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->j:Landroid/os/Handler;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0, v4}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;Z)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->C(Lcom/miteksystems/misnap/u;)I

    move-result v1

    invoke-virtual {v0, v2, v2, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->D(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->A(Lcom/miteksystems/misnap/u;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->B(Lcom/miteksystems/misnap/u;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0, v4}, Lcom/miteksystems/misnap/u;->b(Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0, v2}, Lcom/miteksystems/misnap/u;->b(Lcom/miteksystems/misnap/u;Z)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->E(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->at()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->F(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;

    move-result-object v0

    sget v1, Lcom/miteksystems/misnap/R$string;->dialog_mitek_capture:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->F(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;

    move-result-object v1

    sget v2, Lcom/miteksystems/misnap/R$string;->dialog_mitek_capture:I

    invoke-virtual {v0, v1, v2}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->F(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v1

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->ai()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    iget-object v0, v0, Lcom/miteksystems/misnap/u;->l:Lcom/miteksystems/misnap/i;

    iget-object v1, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->F(Lcom/miteksystems/misnap/u;)Landroid/widget/Button;

    move-result-object v1

    iget-object v2, p0, Lcom/miteksystems/misnap/w;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v2

    iget-object v2, v2, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MiSnapAPI;->ai()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/miteksystems/misnap/i;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1
.end method
