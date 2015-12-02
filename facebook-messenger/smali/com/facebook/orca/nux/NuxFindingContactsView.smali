.class public Lcom/facebook/orca/nux/NuxFindingContactsView;
.super Lcom/facebook/orca/nux/e;
.source "NuxFindingContactsView.java"


# static fields
.field private static final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private e:Lcom/facebook/contacts/upload/ContactsUploadState;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/ProgressBar;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/orca/nux/NuxFindingContactsView;

    sput-object v0, Lcom/facebook/orca/nux/NuxFindingContactsView;->d:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->i:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_body:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 95
    return-void
.end method

.method private getNumMatched()I
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    if-nez v0, :cond_0

    .line 145
    const/4 v0, 0x0

    .line 147
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/ContactsUploadState;->c()I

    move-result v0

    goto :goto_0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 99
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->l()V

    .line 100
    return-void
.end method

.method private k()V
    .locals 6

    .prologue
    const/4 v4, 0x1

    .line 103
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getNumMatched()I

    move-result v0

    .line 104
    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_title_done:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 113
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->i:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_body:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 116
    return-void

    .line 106
    :cond_0
    if-ne v0, v4, :cond_1

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_title_done_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 109
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->orca_nux_finding_contacts_title_done_many:I

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private l()V
    .locals 6

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 119
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    :goto_0
    return-void

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 125
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getNumMatched()I

    move-result v0

    .line 127
    if-nez v0, :cond_1

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->i:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_body:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    goto :goto_0

    .line 131
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v5}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 132
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    iget-object v2, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    invoke-virtual {v2}, Lcom/facebook/contacts/upload/ContactsUploadState;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 133
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    iget-object v2, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    invoke-virtual {v2}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 134
    if-ne v0, v4, :cond_2

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->i:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_body_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 137
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->orca_nux_finding_contacts_body_many:I

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method


# virtual methods
.method protected a()V
    .locals 2

    .prologue
    .line 44
    sget v0, Lcom/facebook/k;->orca_nux_finding_contacts:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->setContentView(I)V

    .line 45
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->f:Landroid/widget/LinearLayout;

    .line 46
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->g:Landroid/widget/ProgressBar;

    .line 47
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    .line 48
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_body:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->i:Landroid/widget/TextView;

    .line 50
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->h:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->orca_nux_finding_contacts_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 51
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->l()V

    .line 52
    return-void
.end method

.method public setContentOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->d()V

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    return-void
.end method

.method public setState(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 3

    .prologue
    .line 62
    sget-object v0, Lcom/facebook/orca/nux/NuxFindingContactsView;->d:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 64
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iput-object p1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    :goto_0
    :pswitch_0
    return-void

    .line 71
    :cond_0
    sget-object v0, Lcom/facebook/orca/nux/d;->a:[I

    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsView;->e:Lcom/facebook/contacts/upload/ContactsUploadState;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 76
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->b()V

    goto :goto_0

    .line 79
    :pswitch_2
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->j()V

    goto :goto_0

    .line 82
    :pswitch_3
    invoke-direct {p0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->k()V

    goto :goto_0

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
