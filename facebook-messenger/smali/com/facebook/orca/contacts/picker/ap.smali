.class public Lcom/facebook/orca/contacts/picker/ap;
.super Lcom/facebook/widget/f;
.source "ContactPickerProgressView.java"


# instance fields
.field private final a:Lcom/facebook/contacts/upload/c;

.field private final b:Landroid/support/v4/a/e;

.field private final c:Landroid/content/BroadcastReceiver;

.field private final d:Landroid/widget/TextView;

.field private final e:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 30
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/picker/ap;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    sget v0, Lcom/facebook/k;->orca_contact_picker_contacts_upload_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ap;->setContentView(I)V

    .line 43
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ap;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 44
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/c;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->a:Lcom/facebook/contacts/upload/c;

    .line 45
    const-class v0, Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->b:Landroid/support/v4/a/e;

    .line 46
    new-instance v0, Lcom/facebook/orca/contacts/picker/aq;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/aq;-><init>(Lcom/facebook/orca/contacts/picker/ap;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->c:Landroid/content/BroadcastReceiver;

    .line 54
    sget v0, Lcom/facebook/i;->contact_picker_progress_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->d:Landroid/widget/TextView;

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 56
    sget v0, Lcom/facebook/i;->contact_picker_progress_bar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->e:Landroid/widget/ProgressBar;

    .line 57
    return-void
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 60
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->b()I

    move-result v0

    .line 61
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->c()I

    move-result v1

    .line 62
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v2

    .line 63
    if-gtz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    :goto_0
    return-void

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ap;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/o;->orca_picker_finding_contacts_progress:I

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 72
    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/ap;->d:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ap;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 74
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ap;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v6}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ap;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ap;Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ap;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 3

    .prologue
    .line 81
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 83
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ap;->b:Landroid/support/v4/a/e;

    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ap;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->a:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/contacts/picker/ap;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 85
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ap;->b:Landroid/support/v4/a/e;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ap;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;)V

    .line 89
    return-void
.end method
