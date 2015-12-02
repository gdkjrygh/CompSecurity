.class public Lcom/facebook/contacts/contactslist/b;
.super Lcom/facebook/widget/f;
.source "ContactRowView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;

.field private final c:Lcom/facebook/user/tiles/UserTileView;

.field private final d:Landroid/widget/ImageView;

.field private e:Lcom/facebook/contacts/models/e;

.field private f:Lcom/facebook/contacts/models/Contact;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactslist/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactslist/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    sget v0, Lcom/facebook/k;->contacts_list_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/b;->setContentView(I)V

    .line 46
    sget v0, Lcom/facebook/i;->contact_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/b;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/b;->a:Landroid/widget/TextView;

    .line 47
    sget v0, Lcom/facebook/i;->contact_status:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/b;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/b;->b:Landroid/widget/TextView;

    .line 48
    sget v0, Lcom/facebook/i;->contact_user_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/b;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/b;->c:Lcom/facebook/user/tiles/UserTileView;

    .line 49
    sget v0, Lcom/facebook/i;->contact_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/b;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/b;->d:Landroid/widget/ImageView;

    .line 51
    invoke-virtual {p0}, Lcom/facebook/contacts/contactslist/b;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 52
    const-class v1, Lcom/facebook/contacts/models/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/e;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/b;->e:Lcom/facebook/contacts/models/e;

    .line 53
    return-void
.end method


# virtual methods
.method public setContact(Lcom/facebook/contacts/models/Contact;)V
    .locals 3

    .prologue
    .line 56
    iput-object p1, p0, Lcom/facebook/contacts/contactslist/b;->f:Lcom/facebook/contacts/models/Contact;

    .line 57
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/b;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/b;->c:Lcom/facebook/user/tiles/UserTileView;

    iget-object v1, p0, Lcom/facebook/contacts/contactslist/b;->f:Lcom/facebook/contacts/models/Contact;

    iget-object v2, p0, Lcom/facebook/contacts/contactslist/b;->e:Lcom/facebook/contacts/models/e;

    invoke-static {v1, v2}, Lcom/facebook/orca/photos/a/a;->a(Lcom/facebook/contacts/models/Contact;Lcom/facebook/contacts/models/e;)Lcom/facebook/user/tiles/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 63
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/b;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 64
    return-void
.end method
