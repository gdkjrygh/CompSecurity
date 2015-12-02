.class public Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;
.super Lcom/facebook/base/activity/i;
.source "HiddenEntryPickerActivity.java"


# instance fields
.field private p:Lcom/facebook/contacts/a/b;

.field private q:Lcom/facebook/widget/titlebar/a;

.field private r:Lcom/facebook/widget/listview/BetterListView;

.field private s:Lcom/facebook/contacts/models/ContactDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 43
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 68
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 70
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 71
    const-class v1, Lcom/facebook/contacts/a/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/b;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->p:Lcom/facebook/contacts/a/b;

    .line 74
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "contact_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/facebook/user/UserKey;

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    invoke-direct {v1, v2, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->p:Lcom/facebook/contacts/a/b;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/a/b;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->s:Lcom/facebook/contacts/models/ContactDetails;

    .line 77
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->s:Lcom/facebook/contacts/models/ContactDetails;

    if-nez v0, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->finish()V

    .line 105
    :goto_0
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->s:Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactDetails;->getContactInfoSection()Lcom/facebook/contacts/models/EntrySection;

    move-result-object v1

    .line 84
    sget v0, Lcom/facebook/k;->contacts_hidden_entry_picker_activity:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->setContentView(I)V

    .line 85
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 86
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->q:Lcom/facebook/widget/titlebar/a;

    .line 87
    sget v0, Lcom/facebook/i;->hidden_entry_list:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/BetterListView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->r:Lcom/facebook/widget/listview/BetterListView;

    .line 89
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->q:Lcom/facebook/widget/titlebar/a;

    sget v2, Lcom/facebook/o;->contact_pick_number_title:I

    invoke-interface {v0, v2}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 91
    new-instance v0, Lcom/facebook/contacts/contactcard/aq;

    invoke-virtual {v1}, Lcom/facebook/contacts/models/EntrySection;->getHiddenEntries()Lcom/google/common/a/es;

    move-result-object v1

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, p0, p0, v1}, Lcom/facebook/contacts/contactcard/aq;-><init>(Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;Landroid/content/Context;Lcom/google/common/a/es;)V

    .line 95
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->r:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/listview/BetterListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;->r:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/contacts/contactcard/ap;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/ap;-><init>(Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0
.end method
