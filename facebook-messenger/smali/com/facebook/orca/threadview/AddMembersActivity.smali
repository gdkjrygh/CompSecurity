.class public Lcom/facebook/orca/threadview/AddMembersActivity;
.super Lcom/facebook/base/activity/i;
.source "AddMembersActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private q:Lcom/facebook/orca/f/k;

.field private r:Lcom/facebook/l/k;

.field private s:Landroid/support/v4/app/q;

.field private t:Landroid/view/inputmethod/InputMethodManager;

.field private u:Lcom/facebook/orca/threadview/dn;

.field private v:Lcom/facebook/analytics/av;

.field private w:Lcom/facebook/widget/titlebar/a;

.field private x:Landroid/widget/Button;

.field private y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

.field private z:Lcom/facebook/orca/threads/ThreadSummary;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const-class v0, Lcom/facebook/orca/threadview/AddMembersActivity;

    sput-object v0, Lcom/facebook/orca/threadview/AddMembersActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/AddMembersActivity;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->k()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/AddMembersActivity;)Lcom/facebook/l/k;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->r:Lcom/facebook/l/k;

    return-object v0
.end method

.method static synthetic j()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 54
    sget-object v0, Lcom/facebook/orca/threadview/AddMembersActivity;->p:Ljava/lang/Class;

    return-object v0
.end method

.method private k()V
    .locals 4

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->A:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 204
    :goto_0
    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a()Lcom/google/common/a/es;

    move-result-object v0

    .line 182
    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 183
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->add_members_missing_people:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0

    .line 188
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->t:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 190
    new-instance v1, Lcom/facebook/orca/server/AddMembersParams;

    iget-object v2, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->z:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/facebook/user/RecipientInfo;->a(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/orca/server/AddMembersParams;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 194
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 195
    const-string v2, "addMembersParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 197
    iget-object v1, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->A:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->n:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->v:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "add_member"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "thread_id"

    iget-object v3, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->z:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "add_person"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 79
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 81
    sget v0, Lcom/facebook/k;->orca_add_members:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/AddMembersActivity;->setContentView(I)V

    .line 82
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 83
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->q:Lcom/facebook/orca/f/k;

    .line 84
    const-class v0, Lcom/facebook/l/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->r:Lcom/facebook/l/k;

    .line 85
    const-class v0, Landroid/support/v4/app/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/q;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->s:Landroid/support/v4/app/q;

    .line 86
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->t:Landroid/view/inputmethod/InputMethodManager;

    .line 87
    const-class v0, Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/dn;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->u:Lcom/facebook/orca/threadview/dn;

    .line 88
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->v:Lcom/facebook/analytics/av;

    .line 89
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 90
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/AddMembersActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->w:Lcom/facebook/widget/titlebar/a;

    .line 91
    sget v0, Lcom/facebook/i;->add_members_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/AddMembersActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->x:Landroid/widget/Button;

    .line 93
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    if-le v1, v0, :cond_0

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 97
    const-string v1, "thread_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 98
    iget-object v1, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->q:Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->z:Lcom/facebook/orca/threads/ThreadSummary;

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->z:Lcom/facebook/orca/threads/ThreadSummary;

    if-nez v0, :cond_1

    .line 100
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->finish()V

    .line 172
    :goto_0
    return-void

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->u:Lcom/facebook/orca/threadview/dn;

    iget-object v1, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->w:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->u:Lcom/facebook/orca/threadview/dn;

    iget-object v1, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->z:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->s:Landroid/support/v4/app/q;

    sget v1, Lcom/facebook/i;->add_members_contact_picker:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->x:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/threadview/a;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/a;-><init>(Lcom/facebook/orca/threadview/AddMembersActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    new-instance v0, Lcom/facebook/orca/threadview/b;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/b;-><init>(Lcom/facebook/orca/threadview/AddMembersActivity;)V

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/contacts/picker/v;)V

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    sget-object v1, Lcom/facebook/orca/contacts/picker/x;->FACEBOOK_LIST:Lcom/facebook/orca/contacts/picker/x;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/x;)V

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->P()V

    .line 142
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    sget-object v1, Lcom/facebook/orca/contacts/picker/y;->ADD_MEMBERS:Lcom/facebook/orca/contacts/picker/y;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/y;)V

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    sget v1, Lcom/facebook/o;->name_search_hint:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/AddMembersActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Ljava/lang/String;)V

    .line 144
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->z:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 146
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 147
    iget-object v3, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->q:Lcom/facebook/orca/f/k;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserFbidIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 153
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->y:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/google/common/a/es;)V

    .line 155
    const-string v0, "addMembersOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->A:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->A:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/threadview/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/c;-><init>(Lcom/facebook/orca/threadview/AddMembersActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->A:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    sget v2, Lcom/facebook/o;->add_members_progress:I

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    goto/16 :goto_0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 74
    sget-object v0, Lcom/facebook/analytics/f/a;->ADD_MEMBERS_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/orca/threadview/AddMembersActivity;->t:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/AddMembersActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 209
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onBackPressed()V

    .line 210
    return-void
.end method
