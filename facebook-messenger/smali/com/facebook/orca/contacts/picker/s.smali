.class public Lcom/facebook/orca/contacts/picker/s;
.super Lcom/facebook/widget/f;
.source "ContactPickerFavoritesSectionHeaderView.java"


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Landroid/view/View;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/picker/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/s;->a:Landroid/content/Context;

    .line 40
    sget v0, Lcom/facebook/k;->orca_favorites_contact_picker_section_header:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/s;->setContentView(I)V

    .line 41
    sget v0, Lcom/facebook/i;->contact_picker_section_header:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/s;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/s;->b:Landroid/view/View;

    .line 42
    sget v0, Lcom/facebook/i;->contact_picker_section_header_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/s;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/s;->c:Landroid/widget/TextView;

    .line 43
    sget v0, Lcom/facebook/i;->edit_favorites_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/s;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/s;->d:Landroid/widget/Button;

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/s;->d:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/contacts/picker/t;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/picker/t;-><init>(Lcom/facebook/orca/contacts/picker/s;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 71
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 73
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/s;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/s;->a()V

    return-void
.end method


# virtual methods
.method public setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 4

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/s;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 55
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_1

    .line 56
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->b:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->default_contacts_section_background:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 58
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->default_contacts_section_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/s;->d:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/s;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/f;->default_contacts_section_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 67
    :cond_0
    :goto_0
    return-void

    .line 61
    :cond_1
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_0

    .line 62
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->b:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->divebar_section_background:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->divebar_section_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 65
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/s;->d:Landroid/widget/Button;

    sget v2, Lcom/facebook/f;->divebar_section_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0
.end method
