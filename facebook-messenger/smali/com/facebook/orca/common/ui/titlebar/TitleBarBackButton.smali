.class public Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;
.super Lcom/facebook/widget/f;
.source "TitleBarBackButton.java"


# instance fields
.field private a:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 21
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    sget v0, Lcom/facebook/k;->orca_titlebar_back_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->setContentView(I)V

    .line 33
    sget v0, Lcom/facebook/i;->titlebar_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->a:Landroid/widget/ImageButton;

    .line 34
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->a:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/x;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/x;-><init>(Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    return-void
.end method


# virtual methods
.method public setColorScheme(Lcom/facebook/orca/common/ui/titlebar/w;)V
    .locals 2

    .prologue
    .line 44
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/y;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/titlebar/w;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 50
    :goto_0
    return-void

    .line 45
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->a:Landroid/widget/ImageButton;

    sget v1, Lcom/facebook/h;->orca_title_bar_top_button:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 47
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->a:Landroid/widget/ImageButton;

    sget v1, Lcom/facebook/h;->orca_title_bar_top_sms_button:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 44
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
