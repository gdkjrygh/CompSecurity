.class public Lcom/facebook/orca/contacts/divebar/m;
.super Lcom/facebook/widget/e;
.source "DivebarContactsUploaderView.java"


# instance fields
.field private final a:Lcom/facebook/orca/contacts/divebar/q;

.field private final b:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/av;Lcom/facebook/orca/contacts/divebar/q;)V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;)V

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/m;->b:Lcom/facebook/analytics/av;

    .line 38
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/m;->a:Lcom/facebook/orca/contacts/divebar/q;

    .line 40
    sget v0, Lcom/facebook/k;->orca_divebar_contacts_uploader:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/m;->setContentView(I)V

    .line 43
    sget v0, Lcom/facebook/i;->divebar_contacts_uploader_enable_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/m;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 44
    new-instance v1, Lcom/facebook/orca/contacts/divebar/n;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/n;-><init>(Lcom/facebook/orca/contacts/divebar/m;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget v0, Lcom/facebook/i;->divebar_contacts_uploader_learn_more_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/m;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 58
    new-instance v1, Lcom/facebook/orca/contacts/divebar/o;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/o;-><init>(Lcom/facebook/orca/contacts/divebar/m;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    sget v0, Lcom/facebook/i;->divebar_contacts_uploader_dismiss_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/m;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 72
    new-instance v1, Lcom/facebook/orca/contacts/divebar/p;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/p;-><init>(Lcom/facebook/orca/contacts/divebar/m;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/m;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/m;->b:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/m;)Lcom/facebook/orca/contacts/divebar/q;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/m;->a:Lcom/facebook/orca/contacts/divebar/q;

    return-object v0
.end method
