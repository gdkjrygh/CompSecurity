.class public Lcom/facebook/contacts/contactcard/entry/m;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "TextRowView.java"


# instance fields
.field private a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/entry/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/entry/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    sget v0, Lcom/facebook/k;->contacts_text_row_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/m;->setContentView(I)V

    .line 32
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/m;->setClickable(Z)V

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 34
    sget v0, Lcom/facebook/h;->orca_item_background_holo_light:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/m;->setBackgroundResource(I)V

    .line 39
    :goto_0
    sget v0, Lcom/facebook/i;->item_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/m;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/m;->a:Landroid/widget/TextView;

    .line 40
    return-void

    .line 36
    :cond_0
    const v0, 0x1080062

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/m;->setBackgroundResource(I)V

    goto :goto_0
.end method


# virtual methods
.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/m;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    return-void
.end method
