.class public Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "LabelValueRowView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    sget v0, Lcom/facebook/k;->contacts_entry_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setContentView(I)V

    .line 34
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setClickable(Z)V

    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 36
    sget v0, Lcom/facebook/h;->orca_item_background_holo_light:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setBackgroundResource(I)V

    .line 41
    :goto_0
    sget v0, Lcom/facebook/i;->item_value:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->b:Landroid/widget/TextView;

    .line 42
    sget v0, Lcom/facebook/i;->item_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->a:Landroid/widget/TextView;

    .line 43
    return-void

    .line 38
    :cond_0
    const v0, 0x1080062

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setBackgroundResource(I)V

    goto :goto_0
.end method


# virtual methods
.method public setLabelText(I)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 47
    return-void
.end method

.method public setLabelText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    return-void
.end method

.method public setValueText(I)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 55
    return-void
.end method

.method public setValueText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    return-void
.end method
