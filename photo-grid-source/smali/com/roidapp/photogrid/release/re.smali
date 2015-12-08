.class public final Lcom/roidapp/photogrid/release/re;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/photogrid/release/re;->a:Landroid/view/View$OnClickListener;

    .line 31
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/re;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    :cond_0
    :goto_0
    return-void

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/re;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 48
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ParentActivity;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 49
    check-cast v0, Lcom/roidapp/photogrid/release/ParentActivity;

    .line 50
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 53
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/re;->dismiss()V

    goto :goto_0

    .line 56
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/re;->a:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/re;->a:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 58
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/re;->dismiss()V

    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x7f0d04d2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 24
    const v0, 0x7f03012f

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 1034
    const v0, 0x7f0d04d2

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 1035
    check-cast v0, Landroid/widget/ImageView;

    const v3, 0x7f02036b

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1036
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1037
    const v0, 0x7f0d04d3

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1038
    if-eqz v0, :cond_0

    .line 1039
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/re;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f070236

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1040
    :cond_0
    const v0, 0x7f0d04d4

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    return-object v2
.end method
