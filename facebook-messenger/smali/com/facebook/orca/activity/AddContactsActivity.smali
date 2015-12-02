.class public Lcom/facebook/orca/activity/AddContactsActivity;
.super Lcom/facebook/base/activity/i;
.source "AddContactsActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private A:Ljava/lang/String;

.field private p:Lcom/facebook/widget/titlebar/a;

.field private q:Lcom/facebook/contacts/g/a/h;

.field private r:Lcom/facebook/contacts/g/a/a;

.field private s:Lcom/facebook/fbservice/ops/k;

.field private t:Lcom/facebook/user/i;

.field private u:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private w:Lcom/facebook/orca/sms/bo;

.field private x:Lcom/facebook/c/s;

.field private y:Lcom/facebook/analytics/av;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/orca/activity/AddContactsActivity;->u:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Landroid/app/ProgressDialog;)V
    .locals 2

    .prologue
    .line 130
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "dismiss_check_phone_number"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/analytics/cb;)V

    .line 132
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 133
    return-void
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 3

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->y:Lcom/facebook/analytics/av;

    invoke-virtual {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 202
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/activity/AddContactsActivity;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->k()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/activity/AddContactsActivity;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Landroid/app/ProgressDialog;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/facebook/analytics/cb;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/analytics/cb;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/activity/AddContactsActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 136
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 137
    const-string v1, "focus_compose"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 139
    new-instance v1, Lcom/facebook/user/o;

    invoke-direct {v1}, Lcom/facebook/user/o;-><init>()V

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v1, v2, p2}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/user/o;->a(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v1

    .line 144
    invoke-virtual {v1}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v2

    .line 145
    new-instance v3, Lcom/facebook/user/UserWithIdentifier;

    invoke-direct {v3, v1, v2}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 146
    const-string v1, "to"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 147
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 148
    iget-object v1, p0, Lcom/facebook/orca/activity/AddContactsActivity;->x:Lcom/facebook/c/s;

    invoke-virtual {v1, v0, p0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 150
    invoke-direct {p0, p2}, Lcom/facebook/orca/activity/AddContactsActivity;->b(Ljava/lang/String;)V

    .line 152
    invoke-virtual {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->finish()V

    .line 153
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/activity/AddContactsActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->A:Ljava/lang/String;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 186
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 187
    const-string v1, "fbid"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    iget-object v1, p0, Lcom/facebook/orca/activity/AddContactsActivity;->s:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->j:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->v:Lcom/google/common/d/a/s;

    .line 192
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/activity/AddContactsActivity;)Lcom/facebook/orca/sms/bo;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->w:Lcom/facebook/orca/sms/bo;

    return-object v0
.end method

.method private j()V
    .locals 5

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 82
    const-string v1, "phone_number"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->A:Ljava/lang/String;

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->t:Lcom/facebook/user/i;

    iget-object v1, p0, Lcom/facebook/orca/activity/AddContactsActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->z:Ljava/lang/String;

    .line 85
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 86
    const-string v1, "phone_number"

    iget-object v2, p0, Lcom/facebook/orca/activity/AddContactsActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    sget v1, Lcom/facebook/o;->invite_searching_user:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/facebook/o;->invite_please_wait:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/activity/AddContactsActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {p0, v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v1

    .line 92
    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "show_check_phone_number"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "phone_number"

    iget-object v4, p0, Lcom/facebook/orca/activity/AddContactsActivity;->A:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/analytics/cb;)V

    .line 95
    iget-object v2, p0, Lcom/facebook/orca/activity/AddContactsActivity;->s:Lcom/facebook/fbservice/ops/k;

    sget-object v3, Lcom/facebook/contacts/server/d;->i:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v2, v3, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->u:Lcom/google/common/d/a/s;

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->u:Lcom/google/common/d/a/s;

    new-instance v2, Lcom/facebook/orca/activity/a;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/activity/a;-><init>(Lcom/facebook/orca/activity/AddContactsActivity;Landroid/app/ProgressDialog;)V

    invoke-static {v0, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 127
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 156
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "show_invite_sms_prompt"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/analytics/cb;)V

    .line 160
    sget v0, Lcom/facebook/k;->orca_add_contacts:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->setContentView(I)V

    .line 161
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 162
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->p:Lcom/facebook/widget/titlebar/a;

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->p:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->invite_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 165
    sget v0, Lcom/facebook/i;->phone_number_disp:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 166
    iget-object v1, p0, Lcom/facebook/orca/activity/AddContactsActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    sget v0, Lcom/facebook/i;->smsButton:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 169
    new-instance v1, Lcom/facebook/orca/activity/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/activity/b;-><init>(Lcom/facebook/orca/activity/AddContactsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 66
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 68
    const-class v0, Lcom/facebook/contacts/g/a/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/g/a/h;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->q:Lcom/facebook/contacts/g/a/h;

    .line 69
    const-class v0, Lcom/facebook/contacts/g/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/g/a/a;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->r:Lcom/facebook/contacts/g/a/a;

    .line 70
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->s:Lcom/facebook/fbservice/ops/k;

    .line 71
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->x:Lcom/facebook/c/s;

    .line 72
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->t:Lcom/facebook/user/i;

    .line 73
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->y:Lcom/facebook/analytics/av;

    .line 74
    const-class v0, Lcom/facebook/orca/sms/bo;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/bo;

    iput-object v0, p0, Lcom/facebook/orca/activity/AddContactsActivity;->w:Lcom/facebook/orca/sms/bo;

    .line 76
    invoke-direct {p0}, Lcom/facebook/orca/activity/AddContactsActivity;->j()V

    .line 77
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 195
    sget-object v0, Lcom/facebook/analytics/f/a;->ADD_CONTACT_BY_PHONE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
