.class public Lcom/facebook/orca/threadview/upsell/a;
.super Ljava/lang/Object;
.source "MergedThreadsUpsellController.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/support/v4/app/ag;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/contacts/g/c;

.field private final e:Lcom/facebook/fbservice/ops/k;

.field private final f:Lcom/facebook/contacts/models/g;

.field private final g:Lcom/facebook/c/s;

.field private final h:Lcom/facebook/prefs/shared/d;

.field private final i:Lcom/facebook/widget/ConfirmationView;

.field private final j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

.field private k:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/facebook/orca/threads/ThreadSummary;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Lcom/facebook/contacts/models/Contact;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/app/ag;Lcom/facebook/widget/ConfirmationView;Lcom/facebook/orca/threadview/upsell/UpsellContactView;Lcom/facebook/prefs/shared/d;Lcom/facebook/c/s;)V
    .locals 3

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/a;->a:Landroid/content/Context;

    .line 90
    iput-object p2, p0, Lcom/facebook/orca/threadview/upsell/a;->b:Landroid/support/v4/app/ag;

    .line 91
    iput-object p6, p0, Lcom/facebook/orca/threadview/upsell/a;->g:Lcom/facebook/c/s;

    .line 93
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 94
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsMergeThreadsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->c:Ljavax/inject/a;

    .line 96
    const-class v0, Lcom/facebook/contacts/g/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/g/c;

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->d:Lcom/facebook/contacts/g/c;

    .line 97
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->e:Lcom/facebook/fbservice/ops/k;

    .line 98
    const-class v0, Lcom/facebook/contacts/models/g;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/g;

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->f:Lcom/facebook/contacts/models/g;

    .line 100
    iput-object p3, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    .line 101
    iput-object p4, p0, Lcom/facebook/orca/threadview/upsell/a;->j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    .line 102
    iput-object p5, p0, Lcom/facebook/orca/threadview/upsell/a;->h:Lcom/facebook/prefs/shared/d;

    .line 103
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/upsell/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/upsell/a;Lcom/facebook/contacts/models/Contact;)Lcom/facebook/contacts/models/Contact;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/upsell/a;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/a;->k:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0}, Lcom/facebook/widget/ConfirmationView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 303
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    sget v2, Lcom/facebook/o;->merged_thread_upsell_confirmation:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/ConfirmationView;->setMessage(Ljava/lang/String;)V

    .line 304
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    sget v2, Lcom/facebook/o;->merged_thread_upsell_confirmation_positive_button:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/widget/ConfirmationView;->setPositiveButtonTitle(Ljava/lang/String;)V

    .line 306
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    sget v2, Lcom/facebook/o;->merged_thread_upsell_confirmation_negative_button:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/ConfirmationView;->setNegativeButtonTitle(Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ConfirmationView;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    new-instance v1, Lcom/facebook/orca/threadview/upsell/h;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/upsell/h;-><init>(Lcom/facebook/orca/threadview/upsell/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ConfirmationView;->setListener(Lcom/facebook/widget/c;)V

    .line 322
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 327
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->audio_message_error_name:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 331
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/upsell/a;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/upsell/a;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 129
    new-instance v0, Lcom/facebook/orca/threadview/upsell/b;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/orca/threadview/upsell/b;-><init>(Lcom/facebook/orca/threadview/upsell/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->b:Landroid/support/v4/app/ag;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ag;->a(I)Landroid/support/v4/a/c;

    move-result-object v1

    if-nez v1, :cond_0

    .line 154
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->b:Landroid/support/v4/app/ag;

    invoke-virtual {v1, v2, v3, v0}, Landroid/support/v4/app/ag;->a(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 158
    :goto_0
    return-void

    .line 156
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->b:Landroid/support/v4/app/ag;

    invoke-virtual {v1, v2, v3, v0}, Landroid/support/v4/app/ag;->b(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/upsell/a;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/a;->l:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 161
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 162
    new-instance v1, Lcom/facebook/orca/threadview/upsell/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/upsell/c;-><init>(Lcom/facebook/orca/threadview/upsell/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 170
    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v1}, Lcom/facebook/widget/ConfirmationView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 171
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-direct {v2, v1}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 172
    sget v3, Lcom/facebook/o;->merged_thread_upsell_detail_blurb:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 173
    const-string v3, "[[learn_more_link]]"

    sget v4, Lcom/facebook/o;->merged_thread_upsell_learn_more_link:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x21

    invoke-virtual {v2, v3, v4, v0, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0}, Lcom/facebook/widget/ConfirmationView;->b()V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/ConfirmationView;->setBlurb(Ljava/lang/CharSequence;)V

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    sget v2, Lcom/facebook/o;->merged_thread_upsell_intro_positive_button:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/ConfirmationView;->setPositiveButtonTitle(Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    sget v2, Lcom/facebook/o;->merged_thread_upsell_intro_negative_button:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ConfirmationView;->setNegativeButtonTitle(Ljava/lang/String;)V

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->setContact(Lcom/facebook/contacts/models/Contact;)V

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0, v6}, Lcom/facebook/widget/ConfirmationView;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    new-instance v1, Lcom/facebook/orca/threadview/upsell/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/upsell/d;-><init>(Lcom/facebook/orca/threadview/upsell/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->setListener(Lcom/facebook/orca/threadview/upsell/k;)V

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    new-instance v1, Lcom/facebook/orca/threadview/upsell/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/upsell/e;-><init>(Lcom/facebook/orca/threadview/upsell/a;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ConfirmationView;->setListener(Lcom/facebook/widget/c;)V

    .line 214
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/a;->b()V

    return-void
.end method

.method private c()V
    .locals 6

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->k:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 252
    :goto_0
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->d:Lcom/facebook/contacts/g/c;

    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->o:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/contacts/g/c;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 224
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 225
    new-instance v2, Lcom/facebook/contacts/server/CreateContactClaimParams;

    iget-object v3, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v3}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v4}, Lcom/facebook/contacts/models/Contact;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/facebook/contacts/server/PrivacyParam;->b:Lcom/facebook/contacts/server/PrivacyParam;

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/facebook/contacts/server/CreateContactClaimParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/contacts/server/PrivacyParam;)V

    .line 230
    const-string v0, "createContactClaimParams"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 231
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->e:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 235
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    iget-object v2, p0, Lcom/facebook/orca/threadview/upsell/a;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->contact_add_phone_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 238
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->k:Lcom/google/common/d/a/s;

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->k:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/threadview/upsell/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/upsell/f;-><init>(Lcom/facebook/orca/threadview/upsell/a;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/a;->f()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/threadview/upsell/a;)Lcom/facebook/widget/ConfirmationView;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    return-object v0
.end method

.method private d()V
    .locals 5

    .prologue
    .line 255
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->l:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_1

    .line 297
    :cond_0
    :goto_0
    return-void

    .line 259
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->f:Lcom/facebook/contacts/models/g;

    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v1}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/threadview/upsell/a;->o:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/contacts/models/g;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/contacts/models/entry/PhoneEntry;

    move-result-object v0

    .line 262
    if-eqz v0, :cond_0

    .line 266
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 267
    new-instance v2, Lcom/facebook/contacts/server/DeleteContactClaimParams;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v3}, Lcom/facebook/contacts/models/Contact;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/threadview/upsell/a;->p:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v4}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v0, v3, v4}, Lcom/facebook/contacts/server/DeleteContactClaimParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    const-string v0, "deleteContactClaimParams"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->e:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 276
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    iget-object v2, p0, Lcom/facebook/orca/threadview/upsell/a;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->contact_delete_phone_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 279
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->l:Lcom/google/common/d/a/s;

    .line 280
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->l:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/threadview/upsell/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/upsell/g;-><init>(Lcom/facebook/orca/threadview/upsell/a;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private e()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 334
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->j:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->setVisibility(I)V

    .line 335
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ConfirmationView;->setVisibility(I)V

    .line 336
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/a;->e()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/threadview/upsell/a;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->h:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 339
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0}, Lcom/facebook/widget/ConfirmationView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 340
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/facebook/orca/nux/LearnMoreActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 341
    const-string v2, "layout"

    sget v3, Lcom/facebook/k;->orca_nux_finding_contacts_learn_more:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 344
    iget-object v2, p0, Lcom/facebook/orca/threadview/upsell/a;->g:Lcom/facebook/c/s;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 345
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/a;->c()V

    return-void
.end method

.method static synthetic h(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/a;->d()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->h:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->l:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->i:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0}, Lcom/facebook/widget/ConfirmationView;->c()V

    .line 355
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 3

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->m:Lcom/facebook/orca/threads/ThreadSummary;

    if-ne p1, v0, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 109
    :cond_1
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/a;->m:Lcom/facebook/orca/threads/ThreadSummary;

    .line 110
    invoke-direct {p0}, Lcom/facebook/orca/threadview/upsell/a;->e()V

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->m:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->m:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->m:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->m:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threads/ThreadSummary;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->n:Ljava/lang/String;

    .line 120
    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->o:Ljava/lang/String;

    .line 122
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/upsell/a;->a()V

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/a;->o:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/orca/threadview/upsell/a;->n:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/upsell/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 116
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
