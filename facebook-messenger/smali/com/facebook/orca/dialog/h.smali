.class public Lcom/facebook/orca/dialog/h;
.super Lcom/facebook/widget/f;
.source "MenuDialogItemView.java"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-direct {p0}, Lcom/facebook/orca/dialog/h;->a()V

    .line 29
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 42
    sget v0, Lcom/facebook/k;->orca_dialog_menu_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/dialog/h;->setContentView(I)V

    .line 44
    sget v0, Lcom/facebook/i;->dialog_menu_item_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/dialog/h;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/dialog/h;->a:Landroid/widget/TextView;

    .line 45
    sget v0, Lcom/facebook/i;->dialog_menu_item_divider:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/dialog/h;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/dialog/h;->b:Landroid/view/View;

    .line 46
    return-void
.end method


# virtual methods
.method public setDividerVisibility(I)V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/dialog/h;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    return-void
.end method

.method public setMenuDialogItem(Lcom/facebook/orca/dialog/MenuDialogItem;)V
    .locals 2

    .prologue
    .line 49
    invoke-static {p1}, Lcom/facebook/orca/dialog/g;->a(Lcom/facebook/orca/dialog/MenuDialogItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/facebook/orca/dialog/h;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/orca/dialog/MenuDialogItem;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 54
    :cond_0
    :goto_0
    return-void

    .line 51
    :cond_1
    invoke-static {p1}, Lcom/facebook/orca/dialog/g;->b(Lcom/facebook/orca/dialog/MenuDialogItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/dialog/h;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/orca/dialog/MenuDialogItem;->c()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/dialog/h;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    return-void
.end method
