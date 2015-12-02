.class public Lcom/facebook/contacts/contactslist/ContactsListActivity;
.super Lcom/facebook/base/activity/i;
.source "ContactsListActivity.java"


# instance fields
.field private p:Lcom/facebook/contacts/contactslist/e;

.field private q:Lcom/facebook/widget/listview/BetterListView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactslist/ContactsListActivity;I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactslist/ContactsListActivity;Lcom/facebook/contacts/contactslist/g;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->a(Lcom/facebook/contacts/contactslist/g;)V

    return-void
.end method

.method private a(Lcom/facebook/contacts/contactslist/g;)V
    .locals 2

    .prologue
    .line 79
    const-string v0, "loaded contacts: "

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->p:Lcom/facebook/contacts/contactslist/e;

    invoke-virtual {p1}, Lcom/facebook/contacts/contactslist/g;->a()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactslist/e;->a(Lcom/google/common/a/es;)V

    .line 81
    return-void
.end method

.method private c(I)V
    .locals 0

    .prologue
    .line 85
    return-void
.end method

.method private j()V
    .locals 4

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->g()Landroid/support/v4/app/ag;

    move-result-object v0

    .line 54
    const/4 v1, 0x1

    const/4 v2, 0x0

    new-instance v3, Lcom/facebook/contacts/contactslist/d;

    invoke-direct {v3, p0}, Lcom/facebook/contacts/contactslist/d;-><init>(Lcom/facebook/contacts/contactslist/ContactsListActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ag;->a(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 76
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 31
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 33
    invoke-virtual {p0}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 34
    const-class v1, Lcom/facebook/contacts/contactslist/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactslist/e;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->p:Lcom/facebook/contacts/contactslist/e;

    .line 36
    sget v0, Lcom/facebook/k;->contacts_list_activity:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->setContentView(I)V

    .line 37
    sget v0, Lcom/facebook/i;->contacts_list:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/BetterListView;

    iput-object v0, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->q:Lcom/facebook/widget/listview/BetterListView;

    .line 39
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->q:Lcom/facebook/widget/listview/BetterListView;

    iget-object v1, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->p:Lcom/facebook/contacts/contactslist/e;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 40
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->q:Lcom/facebook/widget/listview/BetterListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setDividerHeight(I)V

    .line 41
    iget-object v0, p0, Lcom/facebook/contacts/contactslist/ContactsListActivity;->q:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/contacts/contactslist/c;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactslist/c;-><init>(Lcom/facebook/contacts/contactslist/ContactsListActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 49
    invoke-direct {p0}, Lcom/facebook/contacts/contactslist/ContactsListActivity;->j()V

    .line 50
    return-void
.end method
