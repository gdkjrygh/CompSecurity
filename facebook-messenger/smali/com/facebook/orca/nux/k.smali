.class public Lcom/facebook/orca/nux/k;
.super Ljava/lang/Object;
.source "ThreadListNuxController.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/nux/h;

.field private final c:Lcom/facebook/orca/app/g;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/facebook/orca/sms/af;

.field private final i:Lcom/facebook/contacts/upload/c;

.field private final j:Landroid/support/v4/a/e;

.field private final k:Lcom/facebook/analytics/av;

.field private final l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

.field private final m:Lcom/facebook/orca/nux/NuxFindingContactsView;

.field private final n:Lcom/facebook/orca/nux/NuxScrimView;

.field private final o:Lcom/facebook/orca/nux/NuxSmsIntroView;

.field private p:Landroid/content/BroadcastReceiver;

.field private q:Lcom/facebook/orca/nux/t;

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/nux/k;

    sput-object v0, Lcom/facebook/orca/nux/k;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/nux/h;Lcom/facebook/orca/app/g;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/sms/af;Lcom/facebook/contacts/upload/c;Landroid/support/v4/a/e;Lcom/facebook/analytics/av;Lcom/facebook/orca/nux/NuxFindingContactsIntroView;Lcom/facebook/orca/nux/NuxFindingContactsView;Lcom/facebook/orca/nux/NuxScrimView;Lcom/facebook/orca/nux/NuxSmsIntroView;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/nux/h;",
            "Lcom/facebook/orca/app/g;",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/sms/af;",
            "Lcom/facebook/contacts/upload/c;",
            "Landroid/support/v4/a/e;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/orca/nux/NuxFindingContactsIntroView;",
            "Lcom/facebook/orca/nux/NuxFindingContactsView;",
            "Lcom/facebook/orca/nux/NuxScrimView;",
            "Lcom/facebook/orca/nux/NuxSmsIntroView;",
            ")V"
        }
    .end annotation

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    .line 76
    iput-object p1, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    .line 77
    iput-object p2, p0, Lcom/facebook/orca/nux/k;->c:Lcom/facebook/orca/app/g;

    .line 78
    iput-object p3, p0, Lcom/facebook/orca/nux/k;->d:Lcom/facebook/prefs/shared/d;

    .line 79
    iput-object p4, p0, Lcom/facebook/orca/nux/k;->e:Ljavax/inject/a;

    .line 80
    iput-object p5, p0, Lcom/facebook/orca/nux/k;->f:Ljavax/inject/a;

    .line 81
    iput-object p6, p0, Lcom/facebook/orca/nux/k;->g:Ljavax/inject/a;

    .line 82
    iput-object p7, p0, Lcom/facebook/orca/nux/k;->h:Lcom/facebook/orca/sms/af;

    .line 83
    iput-object p8, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    .line 84
    iput-object p9, p0, Lcom/facebook/orca/nux/k;->j:Landroid/support/v4/a/e;

    .line 85
    iput-object p10, p0, Lcom/facebook/orca/nux/k;->k:Lcom/facebook/analytics/av;

    .line 86
    iput-object p11, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    .line 87
    iput-object p12, p0, Lcom/facebook/orca/nux/k;->m:Lcom/facebook/orca/nux/NuxFindingContactsView;

    .line 88
    iput-object p13, p0, Lcom/facebook/orca/nux/k;->n:Lcom/facebook/orca/nux/NuxScrimView;

    .line 89
    iput-object p14, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    .line 90
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/nux/k;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->k:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->m:Lcom/facebook/orca/nux/NuxFindingContactsView;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/nux/NuxFindingContactsView;->setState(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 133
    sget-object v0, Lcom/facebook/orca/nux/s;->a:[I

    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 138
    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p0}, Lcom/facebook/orca/nux/k;->d()V

    goto :goto_0

    .line 143
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)Z

    goto :goto_0

    .line 133
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Lcom/facebook/orca/common/ui/titlebar/m;)V
    .locals 1

    .prologue
    .line 149
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/m;->OPENED:Lcom/facebook/orca/common/ui/titlebar/m;

    if-ne p1, v0, :cond_0

    .line 150
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    invoke-virtual {p0}, Lcom/facebook/orca/nux/k;->d()V

    .line 154
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/nux/k;Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/nux/k;Lcom/facebook/orca/common/ui/titlebar/m;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/orca/common/ui/titlebar/m;)V

    return-void
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 162
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 186
    :cond_0
    :goto_0
    return v0

    .line 167
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v1}, Lcom/facebook/orca/nux/h;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 168
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->n()V

    .line 169
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->p()V

    .line 186
    :cond_2
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 170
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v1}, Lcom/facebook/orca/nux/h;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 171
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->g()V

    goto :goto_1

    .line 172
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/c;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 173
    if-nez p1, :cond_5

    .line 174
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->c()Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    move-result-object p1

    .line 177
    :cond_5
    sget-object v0, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    if-eq p1, v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/orca/nux/k;->s:Z

    if-nez v0, :cond_2

    .line 179
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->j()V

    goto :goto_1

    .line 181
    :cond_6
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 182
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->m()V

    goto :goto_1
.end method

.method static synthetic b(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->h()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->i()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->k()V

    return-void
.end method

.method static synthetic e()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/facebook/orca/nux/k;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->o()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/nux/k;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->d:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 190
    iget-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    return v0
.end method

.method static synthetic g(Lcom/facebook/orca/nux/k;)Lcom/facebook/orca/app/g;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->c:Lcom/facebook/orca/app/g;

    return-object v0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 194
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->q()V

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->i()V

    .line 247
    :goto_0
    return-void

    .line 202
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    new-instance v1, Lcom/facebook/orca/nux/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/m;-><init>(Lcom/facebook/orca/nux/k;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->setOnFindContactsClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    new-instance v1, Lcom/facebook/orca/nux/n;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/n;-><init>(Lcom/facebook/orca/nux/k;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->setOnSkipClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 229
    new-instance v1, Lcom/facebook/orca/nux/o;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/o;-><init>(Lcom/facebook/orca/nux/k;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 240
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->k:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "nux_shown"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "finding_contacts_intro"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 244
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->setLearnMoreLinkSpan(Lcom/facebook/widget/text/CustomUrlLikeSpan;)V

    .line 245
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->n:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxScrimView;->h()V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->h()V

    goto :goto_0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->k:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "nux_hidden"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "finding_contacts_intro"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 254
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->i()V

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->n:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxScrimView;->i()V

    .line 257
    return-void
.end method

.method static synthetic h(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/nux/k;->q()V

    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 260
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->N:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 264
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 265
    return-void
.end method

.method private j()V
    .locals 3

    .prologue
    .line 268
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->k:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "nux_shown"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "finding_contacts_progress"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 271
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->m:Lcom/facebook/orca/nux/NuxFindingContactsView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->h()V

    .line 273
    return-void
.end method

.method private k()V
    .locals 3

    .prologue
    .line 276
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    invoke-virtual {v1}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/nux/LearnMoreActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 279
    const-string v1, "layout"

    sget v2, Lcom/facebook/k;->orca_nux_finding_contacts_learn_more:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->l:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    invoke-virtual {v1}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 283
    return-void
.end method

.method private l()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 296
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/n;->N:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/nux/k;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/contacts/upload/a;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private m()V
    .locals 2

    .prologue
    .line 303
    sget-object v0, Lcom/facebook/orca/nux/k;->a:Ljava/lang/Class;

    const-string v1, "Starting divebar-only contacts upload."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_DIVE_BAR_ONLY:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 305
    return-void
.end method

.method private n()V
    .locals 2

    .prologue
    .line 308
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    .line 310
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->n:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxScrimView;->h()V

    .line 313
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxSmsIntroView;->setClickable(Z)V

    .line 314
    return-void
.end method

.method private o()V
    .locals 3

    .prologue
    .line 322
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->h:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/af;->d()V

    .line 323
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v1}, Lcom/facebook/orca/nux/NuxSmsIntroView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/nux/SmsNuxDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 324
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v1}, Lcom/facebook/orca/nux/NuxSmsIntroView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 325
    return-void
.end method

.method private p()V
    .locals 5

    .prologue
    .line 328
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->h:Lcom/facebook/orca/sms/af;

    iget-object v0, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->f()Z

    move-result v2

    iget-object v0, p0, Lcom/facebook/orca/nux/k;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object v0, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->g()Z

    move-result v4

    iget-object v0, p0, Lcom/facebook/orca/nux/k;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/facebook/orca/sms/af;->b(ZZZZ)V

    .line 333
    new-instance v1, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 334
    new-instance v0, Lcom/facebook/orca/nux/p;

    invoke-direct {v0, p0}, Lcom/facebook/orca/nux/p;-><init>(Lcom/facebook/orca/nux/k;)V

    invoke-virtual {v1, v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 341
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 342
    new-instance v3, Lcom/facebook/common/w/o;

    invoke-direct {v3, v2}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 343
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 344
    sget v0, Lcom/facebook/o;->sms_nux_intro_force_blurb:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 350
    :goto_0
    const-string v0, "[[learn_more_link]]"

    sget v4, Lcom/facebook/o;->sms_nux_learn_more_link:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x21

    invoke-virtual {v3, v0, v2, v1, v4}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->j()V

    .line 354
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v3}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxSmsIntroView;->setBlurb(Ljava/lang/CharSequence;)V

    .line 356
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->n:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxScrimView;->b()V

    .line 358
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 359
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->b()V

    .line 362
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->h()V

    .line 363
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    new-instance v1, Lcom/facebook/orca/nux/q;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/q;-><init>(Lcom/facebook/orca/nux/k;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxSmsIntroView;->setOnTryClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    new-instance v1, Lcom/facebook/orca/nux/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/nux/r;-><init>(Lcom/facebook/orca/nux/k;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/NuxSmsIntroView;->setOnSkipClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    return-void

    .line 345
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 346
    sget v0, Lcom/facebook/o;->sms_nux_intro_upgrade_blurb:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    goto :goto_0

    .line 348
    :cond_3
    sget v0, Lcom/facebook/o;->sms_nux_intro_blurb:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    goto :goto_0
.end method

.method private q()V
    .locals 3

    .prologue
    .line 386
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 387
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->h:Lcom/facebook/orca/sms/af;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/af;->a(Z)V

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->o()V

    .line 389
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->o:Lcom/facebook/orca/nux/NuxSmsIntroView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->i()V

    .line 390
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->n:Lcom/facebook/orca/nux/NuxScrimView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxScrimView;->i()V

    .line 391
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->q:Lcom/facebook/orca/nux/t;

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->q:Lcom/facebook/orca/nux/t;

    invoke-interface {v0}, Lcom/facebook/orca/nux/t;->a()V

    .line 394
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 93
    new-instance v0, Lcom/facebook/orca/nux/l;

    invoke-direct {v0, p0}, Lcom/facebook/orca/nux/l;-><init>(Lcom/facebook/orca/nux/k;)V

    iput-object v0, p0, Lcom/facebook/orca/nux/k;->p:Landroid/content/BroadcastReceiver;

    .line 113
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 114
    const-string v1, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 115
    const-string v1, "com.facebook.orca.common.ui.titlebar.DIVEBAR_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 116
    iget-object v1, p0, Lcom/facebook/orca/nux/k;->j:Landroid/support/v4/a/e;

    iget-object v2, p0, Lcom/facebook/orca/nux/k;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/nux/k;->i:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/c;->c()Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 121
    return-void
.end method

.method public a(Lcom/facebook/orca/nux/t;)V
    .locals 0

    .prologue
    .line 397
    iput-object p1, p0, Lcom/facebook/orca/nux/k;->q:Lcom/facebook/orca/nux/t;

    .line 398
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 405
    iput-boolean p1, p0, Lcom/facebook/orca/nux/k;->s:Z

    .line 406
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->j:Landroid/support/v4/a/e;

    iget-object v1, p0, Lcom/facebook/orca/nux/k;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;)V

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/nux/k;->p:Landroid/content/BroadcastReceiver;

    .line 126
    return-void
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 3

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->k:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "nux_hidden"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "finding_contacts_progress"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 289
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/nux/k;->r:Z

    .line 290
    iget-object v0, p0, Lcom/facebook/orca/nux/k;->m:Lcom/facebook/orca/nux/NuxFindingContactsView;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/NuxFindingContactsView;->g()V

    .line 291
    return-void
.end method
