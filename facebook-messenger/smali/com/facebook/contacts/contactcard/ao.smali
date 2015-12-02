.class public Lcom/facebook/contacts/contactcard/ao;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "HiddenEntryListRow.java"


# instance fields
.field private final a:Lcom/facebook/orca/threads/n;

.field private final b:Lcom/facebook/user/i;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/widget/TextView;

.field private final e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/ao;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/ao;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ao;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 41
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->a:Lcom/facebook/orca/threads/n;

    .line 42
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->b:Lcom/facebook/user/i;

    .line 44
    sget v0, Lcom/facebook/k;->contacts_hidden_entry_list_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ao;->setContentView(I)V

    .line 45
    sget v0, Lcom/facebook/i;->hidden_entry_value:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ao;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->c:Landroid/widget/TextView;

    .line 46
    sget v0, Lcom/facebook/i;->hidden_entry_source:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ao;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->d:Landroid/widget/TextView;

    .line 47
    sget v0, Lcom/facebook/i;->hidden_entry_time_stamp:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ao;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->e:Landroid/widget/TextView;

    .line 48
    return-void
.end method


# virtual methods
.method public setEntry(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 5

    .prologue
    .line 51
    check-cast p1, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 53
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->b:Lcom/facebook/user/i;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ao;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ao;->a:Lcom/facebook/orca/threads/n;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getCreationTime()J

    move-result-wide v3

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/threads/n;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ao;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    return-void
.end method
