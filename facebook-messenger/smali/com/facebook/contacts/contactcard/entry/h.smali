.class public abstract Lcom/facebook/contacts/contactcard/entry/h;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "EntryView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;

.field private final c:Landroid/widget/ImageButton;

.field private d:Lcom/facebook/contacts/models/entry/Entry;

.field private e:Lcom/facebook/contacts/contactcard/entry/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/entry/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/entry/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    sget v0, Lcom/facebook/k;->contacts_entry_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->setContentView(I)V

    .line 47
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->setClickable(Z)V

    .line 48
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 49
    sget v0, Lcom/facebook/h;->orca_item_background_holo_light:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->setBackgroundResource(I)V

    .line 53
    :goto_0
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/i;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/contactcard/entry/i;-><init>(Lcom/facebook/contacts/contactcard/entry/h;)V

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    sget v0, Lcom/facebook/i;->item_value:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->b:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/facebook/i;->item_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->a:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/facebook/i;->item_remove_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->c:Landroid/widget/ImageButton;

    .line 66
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->c:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/contacts/contactcard/entry/j;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/entry/j;-><init>(Lcom/facebook/contacts/contactcard/entry/h;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    return-void

    .line 51
    :cond_0
    const v0, 0x1080062

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/entry/h;)Lcom/facebook/contacts/contactcard/entry/k;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->e:Lcom/facebook/contacts/contactcard/entry/k;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/contacts/contactcard/entry/h;)Lcom/facebook/contacts/models/entry/Entry;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->d:Lcom/facebook/contacts/models/entry/Entry;

    return-object v0
.end method


# virtual methods
.method protected abstract a(Landroid/widget/TextView;)V
.end method

.method protected abstract b(Landroid/widget/TextView;)V
.end method

.method public getEntry()Lcom/facebook/contacts/models/entry/Entry;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->d:Lcom/facebook/contacts/models/entry/Entry;

    return-object v0
.end method

.method public setEditMode(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 91
    if-eqz p1, :cond_0

    .line 92
    invoke-virtual {p0, v1}, Lcom/facebook/contacts/contactcard/entry/h;->setClickable(Z)V

    .line 93
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->c:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 98
    :goto_0
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->setClickable(Z)V

    .line 96
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->c:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public setEntry(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 1

    .prologue
    .line 77
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/entry/h;->d:Lcom/facebook/contacts/models/entry/Entry;

    .line 78
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->a:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->a(Landroid/widget/TextView;)V

    .line 79
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/h;->b:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/h;->b(Landroid/widget/TextView;)V

    .line 80
    return-void
.end method

.method public setEntryViewListener(Lcom/facebook/contacts/contactcard/entry/k;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/entry/h;->e:Lcom/facebook/contacts/contactcard/entry/k;

    .line 88
    return-void
.end method
