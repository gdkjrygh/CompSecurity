.class public Lcom/facebook/orca/contacts/picker/bb;
.super Lcom/facebook/widget/f;
.source "ContactPickerSectionSplitterView.java"


# instance fields
.field private final a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 20
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/picker/bb;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    sget v0, Lcom/facebook/k;->orca_contact_picker_section_splitter:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bb;->setContentView(I)V

    .line 33
    sget v0, Lcom/facebook/i;->contact_picker_section_header:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bb;->a:Landroid/view/View;

    .line 34
    return-void
.end method


# virtual methods
.method public setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 4

    .prologue
    .line 37
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bb;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 38
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_1

    .line 39
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bb;->a:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->default_contacts_section_background:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 45
    :cond_0
    :goto_0
    return-void

    .line 41
    :cond_1
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_0

    .line 42
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bb;->a:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->divebar_section_background:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method
