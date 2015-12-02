.class public Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;
.super Lcom/facebook/base/activity/i;
.source "DivebarContactsUploaderLearnMoreActivity.java"


# instance fields
.field private p:Lcom/facebook/prefs/shared/d;

.field private q:Lcom/facebook/contacts/upload/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->k()V

    return-void
.end method

.method private k()V
    .locals 3

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->p:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/o;->q:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->finish()V

    .line 67
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 28
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 30
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 31
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->p:Lcom/facebook/prefs/shared/d;

    .line 32
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/c;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->q:Lcom/facebook/contacts/upload/c;

    .line 34
    sget v0, Lcom/facebook/k;->orca_divebar_contacts_uploader_learn_more_activity:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->setContentView(I)V

    .line 36
    sget v0, Lcom/facebook/i;->divebar_contacts_uploader_learn_more_not_now_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 37
    new-instance v1, Lcom/facebook/orca/contacts/divebar/k;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/k;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    sget v0, Lcom/facebook/i;->divebar_contacts_uploader_learn_more_sync_contacts_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 45
    new-instance v1, Lcom/facebook/orca/contacts/divebar/l;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/l;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    return-void
.end method

.method public j()V
    .locals 3

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->p:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->N:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity;->q:Lcom/facebook/contacts/upload/c;

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 59
    return-void
.end method
