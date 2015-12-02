.class public Lcom/facebook/orca/creation/CreateThreadActivity;
.super Lcom/facebook/base/activity/i;
.source "CreateThreadActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/activity/c;


# static fields
.field public static r:Ljava/lang/String;

.field private static final s:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private B:Lcom/facebook/analytics/av;

.field private C:Lcom/facebook/orca/photos/b/k;

.field private D:Lcom/facebook/widget/OverlayLayout;

.field private E:Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;

.field private F:Lcom/facebook/orca/compose/av;

.field private G:Lcom/facebook/orca/compose/LocationNuxView;

.field private H:Lcom/facebook/orca/compose/LocationDisabledNuxView;

.field private I:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private J:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

.field private L:Lcom/facebook/orca/compose/ComposeFragment;

.field private M:Lcom/facebook/orca/d/af;

.field private N:Landroid/view/inputmethod/InputMethodManager;

.field private O:Lcom/facebook/messages/model/threads/Message;

.field private P:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserWithIdentifier;",
            ">;"
        }
    .end annotation
.end field

.field private Q:Ljava/lang/String;

.field private R:Z

.field private S:Z

.field private T:Lcom/facebook/messages/a/a/a;

.field private U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

.field p:Z

.field q:Z

.field private t:Landroid/support/v4/app/q;

.field private u:Lcom/facebook/orca/f/r;

.field private v:Lcom/facebook/orca/f/k;

.field private w:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 88
    const-class v0, Lcom/facebook/orca/creation/CreateThreadActivity;

    sput-object v0, Lcom/facebook/orca/creation/CreateThreadActivity;->s:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 523
    sget-object v0, Lcom/facebook/orca/creation/CreateThreadActivity;->s:Ljava/lang/Class;

    const-string v1, "onContactPickerFocusChanged"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 525
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 526
    :goto_0
    if-eqz v0, :cond_0

    .line 527
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->z()Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 528
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->p()V

    .line 537
    :cond_0
    :goto_1
    return-void

    .line 525
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 530
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ComposeFragment;->z()Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 531
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->r()V

    .line 532
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b()V

    goto :goto_1

    .line 535
    :cond_3
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 677
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 678
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 679
    if-eqz v0, :cond_0

    .line 680
    invoke-direct {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 684
    :goto_0
    return-void

    .line 682
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->t()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 729
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->t()V

    .line 730
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;I)V
    .locals 3

    .prologue
    .line 713
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "create_thread"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "thread"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "is_multipicker_clicked"

    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Q()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "participant_count"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "trigger"

    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->Q:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 722
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->B:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 723
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/creation/CreateThreadActivity;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->s()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/creation/CreateThreadActivity;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 5

    .prologue
    .line 688
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 689
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->a(Ljava/lang/String;)V

    .line 690
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->b(Ljava/lang/String;)V

    .line 692
    new-instance v1, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v1}, Lcom/facebook/messages/model/threads/e;-><init>()V

    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 697
    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->u:Lcom/facebook/orca/f/r;

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->Q:Ljava/lang/String;

    invoke-virtual {v2, v1, v3, v4}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    iget-boolean v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->R:Z

    if-nez v1, :cond_0

    .line 701
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 702
    const-string v2, "thread_id"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 703
    invoke-virtual {p0, v1}, Lcom/facebook/orca/creation/CreateThreadActivity;->startActivity(Landroid/content/Intent;)V

    .line 707
    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->setResult(I)V

    .line 709
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->finish()V

    .line 710
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 734
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->setResult(I)V

    .line 736
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->finish()V

    .line 739
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 740
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 741
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->a(Ljava/lang/String;)V

    .line 742
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->b(Ljava/lang/String;)V

    .line 744
    iget-boolean v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->R:Z

    if-nez v1, :cond_0

    .line 746
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 747
    const-string v2, "thread_id"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 748
    invoke-virtual {p0, v1}, Lcom/facebook/orca/creation/CreateThreadActivity;->startActivity(Landroid/content/Intent;)V

    .line 749
    sget v0, Lcom/facebook/b;->activity_close_enter:I

    sget v1, Lcom/facebook/b;->activity_close_exit:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/creation/CreateThreadActivity;->overridePendingTransition(II)V

    .line 751
    :cond_0
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 754
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->send_failed_error:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 759
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/creation/CreateThreadActivity;)Z
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->k()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/facebook/orca/creation/CreateThreadActivity;)Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/creation/CreateThreadActivity;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->n()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/creation/CreateThreadActivity;)Lcom/facebook/orca/compose/ComposeFragment;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    return-object v0
.end method

.method private k()Z
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->A:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->S:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 304
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/creation/CreateThreadActivity;->r:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->w:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->y:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method private m()V
    .locals 2

    .prologue
    .line 310
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    new-instance v1, Lcom/facebook/orca/creation/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/creation/e;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/z;)V

    .line 326
    return-void
.end method

.method private n()V
    .locals 6

    .prologue
    const/4 v3, 0x1

    .line 336
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->c()Lcom/facebook/user/s;

    move-result-object v0

    if-nez v0, :cond_0

    .line 338
    sget-object v1, Lcom/facebook/orca/contacts/picker/x;->MERGED:Lcom/facebook/orca/contacts/picker/x;

    .line 339
    sget v0, Lcom/facebook/o;->name_or_phone_search_hint:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    move v2, v3

    move-object v4, v1

    move-object v1, v0

    .line 359
    :goto_0
    iget-object v5, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->z:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {v5, v3}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->e(I)V

    .line 363
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/x;)V

    .line 364
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->P()V

    .line 366
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Ljava/lang/String;)V

    .line 367
    if-eqz v2, :cond_4

    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 368
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d()V

    .line 372
    :goto_2
    return-void

    .line 342
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    if-eqz v0, :cond_1

    .line 343
    sget-object v2, Lcom/facebook/orca/contacts/picker/x;->ADDRESS_BOOK:Lcom/facebook/orca/contacts/picker/x;

    .line 344
    sget v0, Lcom/facebook/o;->name_or_phone_search_hint:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 345
    const/4 v1, 0x0

    move-object v4, v2

    move v2, v1

    move-object v1, v0

    goto :goto_0

    .line 348
    :cond_1
    sget-object v1, Lcom/facebook/orca/contacts/picker/x;->FACEBOOK_LIST:Lcom/facebook/orca/contacts/picker/x;

    .line 349
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->T:Lcom/facebook/messages/a/a/a;

    invoke-virtual {v0}, Lcom/facebook/messages/a/a/a;->c()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 351
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 352
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_3
    move v2, v3

    move-object v4, v1

    move-object v1, v0

    .line 356
    goto :goto_0

    .line 354
    :cond_2
    sget v0, Lcom/facebook/o;->name_search_hint:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 359
    :cond_3
    const v3, 0x7fffffff

    goto :goto_1

    .line 370
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->O()V

    goto :goto_2
.end method

.method private o()V
    .locals 2

    .prologue
    .line 375
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    new-instance v1, Lcom/facebook/orca/creation/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/creation/f;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/ab;)V

    .line 387
    return-void
.end method

.method private p()V
    .locals 2

    .prologue
    .line 540
    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->p:Z

    if-nez v0, :cond_0

    .line 548
    :goto_0
    return-void

    .line 543
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 544
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->F:Lcom/facebook/orca/compose/av;

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ap;)V

    .line 545
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->E:Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;->setComposeMode(Lcom/facebook/orca/compose/ap;)V

    .line 546
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->p:Z

    .line 547
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->D:Lcom/facebook/widget/OverlayLayout;

    invoke-virtual {v0}, Lcom/facebook/widget/OverlayLayout;->requestLayout()V

    goto :goto_0
.end method

.method private q()V
    .locals 2

    .prologue
    .line 551
    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    if-eqz v0, :cond_0

    .line 556
    :goto_0
    return-void

    .line 554
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    .line 555
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    iget-boolean v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Z)V

    goto :goto_0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 559
    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->p:Z

    if-eqz v0, :cond_0

    .line 567
    :goto_0
    return-void

    .line 562
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 563
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->F:Lcom/facebook/orca/compose/av;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ap;)V

    .line 564
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->E:Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;->setComposeMode(Lcom/facebook/orca/compose/ap;)V

    .line 565
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->p:Z

    .line 566
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->D:Lcom/facebook/widget/OverlayLayout;

    invoke-virtual {v0}, Lcom/facebook/widget/OverlayLayout;->requestLayout()V

    goto :goto_0
.end method

.method private s()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 570
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->J:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->I:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_1

    .line 641
    :cond_0
    :goto_0
    return-void

    .line 576
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    .line 577
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 578
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->w:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->x:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lcom/facebook/o;->create_thread_no_recipients_name_and_number:I

    .line 581
    :goto_1
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v1

    sget v2, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v1, v2}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0

    .line 578
    :cond_2
    sget v0, Lcom/facebook/o;->create_thread_no_recipients_name:I

    goto :goto_1

    .line 588
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 589
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->send_empty_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0

    .line 597
    :cond_4
    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->P()Z

    move-result v0

    if-nez v0, :cond_5

    .line 599
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->send_attachments_too_large:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0

    .line 606
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->O()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    .line 607
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->F:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/av;->a()V

    .line 609
    const/4 v1, 0x0

    .line 610
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v0, v2, :cond_9

    .line 612
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    invoke-virtual {v0, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserWithIdentifier;

    .line 613
    invoke-virtual {v0}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v0

    .line 614
    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 615
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 623
    :goto_2
    iget-boolean v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->R:Z

    if-nez v1, :cond_6

    move v1, v2

    .line 624
    :goto_3
    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    .line 625
    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->v:Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 627
    if-eqz v1, :cond_7

    .line 628
    invoke-direct {p0, v1}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto/16 :goto_0

    :cond_6
    move v1, v3

    .line 623
    goto :goto_3

    .line 630
    :cond_7
    new-instance v1, Lcom/facebook/orca/server/ac;

    invoke-direct {v1}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v2, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 634
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 635
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 636
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->I:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto/16 :goto_0

    .line 639
    :cond_8
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->t()V

    goto/16 :goto_0

    :cond_9
    move-object v0, v1

    goto :goto_2
.end method

.method private t()V
    .locals 4

    .prologue
    .line 646
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v0

    if-nez v0, :cond_1

    .line 647
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 648
    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->C:Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/b/k;->a(Ljava/lang/String;)Lcom/facebook/orca/photos/b/m;

    move-result-object v0

    .line 650
    iget-object v0, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v2, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    if-eq v0, v2, :cond_0

    .line 652
    sget v0, Lcom/facebook/o;->attachment_upload_not_complete:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 671
    :goto_0
    return-void

    .line 660
    :cond_1
    new-instance v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    iget-object v3, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    invoke-static {v3}, Lcom/facebook/user/RecipientInfo;->a(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;-><init>(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Ljava/util/List;)V

    .line 666
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 667
    const-string v2, "createThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 668
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->J:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->e:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 670
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/messages/model/threads/Message;I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/activity/d;)V
    .locals 3

    .prologue
    .line 476
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 477
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/facebook/orca/activity/d;->a(Z)V

    .line 501
    :goto_0
    return-void

    .line 481
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 482
    sget v1, Lcom/facebook/o;->compose_discard_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 483
    sget v1, Lcom/facebook/o;->compose_discard_dialog_message:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 484
    sget v1, Lcom/facebook/o;->compose_discard_dialog_no_button:I

    new-instance v2, Lcom/facebook/orca/creation/g;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/creation/g;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/orca/activity/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 492
    sget v1, Lcom/facebook/o;->compose_discard_dialog_discard_button:I

    new-instance v2, Lcom/facebook/orca/creation/h;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/creation/h;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/orca/activity/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 500
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 151
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 153
    sget v0, Lcom/facebook/k;->orca_create_thread:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->setContentView(I)V

    .line 155
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->i()Lcom/facebook/inject/t;

    move-result-object v2

    .line 156
    const-class v0, Landroid/support/v4/app/q;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/q;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->t:Landroid/support/v4/app/q;

    .line 157
    const-class v0, Lcom/facebook/orca/f/r;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/r;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->u:Lcom/facebook/orca/f/r;

    .line 158
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->v:Lcom/facebook/orca/f/k;

    .line 159
    const-class v0, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->w:Ljavax/inject/a;

    .line 160
    const-class v0, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->x:Ljavax/inject/a;

    .line 161
    const-class v0, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsSmsSendPermitted;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->y:Ljavax/inject/a;

    .line 162
    const-class v0, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsMmsSendPermitted;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->z:Ljavax/inject/a;

    .line 163
    const-class v0, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsSuggestionsEnabled;

    invoke-virtual {v2, v0, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->A:Ljavax/inject/a;

    .line 164
    const-class v0, Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/k;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->C:Lcom/facebook/orca/photos/b/k;

    .line 166
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->B:Lcom/facebook/analytics/av;

    .line 167
    const-class v0, Lcom/facebook/orca/d/af;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/af;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->M:Lcom/facebook/orca/d/af;

    .line 168
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->N:Landroid/view/inputmethod/InputMethodManager;

    .line 170
    sget v0, Lcom/facebook/i;->create_thread_overlay_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/OverlayLayout;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->D:Lcom/facebook/widget/OverlayLayout;

    .line 171
    sget v0, Lcom/facebook/i;->compose_location_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/LocationNuxView;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->G:Lcom/facebook/orca/compose/LocationNuxView;

    .line 172
    sget v0, Lcom/facebook/i;->compose_location_disabled_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/LocationDisabledNuxView;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->H:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    .line 173
    sget v0, Lcom/facebook/i;->create_thread_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->E:Lcom/facebook/orca/common/ui/widgets/CreateThreadCustomLayout;

    .line 175
    const-class v0, Lcom/facebook/messages/a/a/a;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/a/a/a;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->T:Lcom/facebook/messages/a/a/a;

    .line 178
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 180
    new-instance v3, Lcom/facebook/orca/compose/av;

    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/az;

    invoke-direct {v3, v0}, Lcom/facebook/orca/compose/av;-><init>(Lcom/facebook/orca/prefs/az;)V

    iput-object v3, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->F:Lcom/facebook/orca/compose/av;

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->F:Lcom/facebook/orca/compose/av;

    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->G:Lcom/facebook/orca/compose/LocationNuxView;

    iget-object v3, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->H:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/LocationNuxView;Lcom/facebook/orca/compose/LocationDisabledNuxView;)V

    .line 185
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 186
    if-nez p1, :cond_8

    .line 187
    const-string v0, "to"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .line 188
    if-eqz v0, :cond_4

    .line 189
    instance-of v2, v0, Lcom/facebook/user/UserWithIdentifier;

    if-eqz v2, :cond_3

    .line 190
    check-cast v0, Lcom/facebook/user/UserWithIdentifier;

    .line 195
    :goto_0
    const-string v2, "threadType"

    invoke-virtual {v5, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    move v3, v2

    move-object v2, v0

    .line 198
    :goto_1
    const-string v0, "disable_redirect_to_thread_view"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->R:Z

    .line 200
    const-string v0, "disable_create_thread_suggestions"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->S:Z

    .line 203
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v6, Lcom/facebook/orca/creation/a;

    invoke-direct {v6, p0}, Lcom/facebook/orca/creation/a;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {v0, v6}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 211
    const-string v0, "fetchCanonicalThread"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->I:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->I:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v6, Lcom/facebook/orca/creation/b;

    invoke-direct {v6, p0}, Lcom/facebook/orca/creation/b;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {v0, v6}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->I:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v6, Lcom/facebook/fbservice/ops/aa;

    sget v7, Lcom/facebook/o;->create_thread_progress:I

    invoke-direct {v6, p0, v7}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v6}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 228
    const-string v0, "createThreadUiOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->J:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 229
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->J:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v6, Lcom/facebook/orca/creation/c;

    invoke-direct {v6, p0}, Lcom/facebook/orca/creation/c;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {v0, v6}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->J:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v6, Lcom/facebook/fbservice/ops/aa;

    sget v7, Lcom/facebook/o;->create_thread_progress:I

    invoke-direct {v6, p0, v7}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v6}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 243
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->t:Landroid/support/v4/app/q;

    sget v6, Lcom/facebook/i;->suggestions_multipicker_fragment:I

    invoke-virtual {v0, v6}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    .line 245
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->k()Z

    move-result v6

    invoke-virtual {v0, v6}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Z)V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a()Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->t:Landroid/support/v4/app/q;

    sget v6, Lcom/facebook/i;->create_thread_compose:I

    invoke-virtual {v0, v6}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/ComposeFragment;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    .line 250
    if-eqz v2, :cond_6

    .line 251
    const-string v0, "disableContactPicker"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->d()V

    .line 254
    :cond_0
    invoke-virtual {v2}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v0

    .line 256
    sget-object v3, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    if-ne v0, v3, :cond_5

    .line 257
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->q()V

    .line 269
    :cond_1
    :goto_2
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->o()V

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Ljava/lang/String;)V

    .line 274
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->n()V

    .line 276
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 277
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->m()V

    .line 281
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v3, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->F:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/av;)V

    .line 282
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    new-instance v3, Lcom/facebook/orca/creation/d;

    invoke-direct {v3, p0}, Lcom/facebook/orca/creation/d;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {v0, v3}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/an;)V

    .line 289
    if-eqz v2, :cond_2

    .line 290
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/user/UserWithIdentifier;)V

    .line 293
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;)Lcom/facebook/orca/compose/ai;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ai;)V

    .line 296
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 297
    return-void

    .line 192
    :cond_3
    sget-object v0, Lcom/facebook/orca/creation/CreateThreadActivity;->s:Ljava/lang/Class;

    const-string v2, "\"to\" extra is not of expected type, ignoring"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    :cond_4
    move-object v0, v1

    goto/16 :goto_0

    .line 258
    :cond_5
    sget-object v3, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    if-ne v0, v3, :cond_1

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/facebook/orca/compose/ComposeFragment;->e(Z)V

    goto :goto_2

    .line 263
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/compose/ComposeFragment;->e(Z)V

    .line 265
    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    .line 266
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->q()V

    goto :goto_2

    .line 279
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->O()V

    goto :goto_3

    :cond_8
    move-object v2, v1

    move v3, v4

    goto/16 :goto_1
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 146
    sget-object v0, Lcom/facebook/analytics/f/a;->CREATE_THREAD_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public j()Z
    .locals 2

    .prologue
    .line 762
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->c()Lcom/facebook/user/s;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->c()Lcom/facebook/user/s;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    if-nez v0, :cond_1

    .line 765
    const/4 v0, 0x1

    .line 767
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    .line 505
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->N:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 506
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->a()V

    .line 508
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->finish()V

    .line 511
    :cond_0
    new-instance v0, Lcom/facebook/orca/creation/i;

    invoke-direct {v0, p0}, Lcom/facebook/orca/creation/i;-><init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/orca/activity/d;)V

    .line 520
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 391
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onPause()V

    .line 392
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->M:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 393
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 455
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 456
    const-string v0, "composingSmsThread"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->q()V

    .line 459
    :cond_0
    const-string v0, "composeExpanded"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 460
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->r()V

    .line 462
    :cond_1
    const-string v0, "outgoingMessage"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    .line 463
    const-string v0, "pickedUsers"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 464
    if-eqz v0, :cond_2

    .line 465
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    .line 468
    :cond_2
    const-string v0, "trigger"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 469
    if-eqz v0, :cond_3

    .line 470
    iput-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->Q:Ljava/lang/String;

    .line 472
    :cond_3
    return-void
.end method

.method protected onResume()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 397
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 398
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 402
    if-eqz v1, :cond_1

    .line 403
    const-string v2, "focus_compose"

    invoke-static {v1, v2, v0}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 405
    const/4 v0, 0x1

    .line 408
    :cond_0
    const-string v2, "trigger"

    invoke-static {v1, v2}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 409
    if-eqz v1, :cond_1

    .line 410
    iget-object v2, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->B:Lcom/facebook/analytics/av;

    new-instance v3, Lcom/facebook/analytics/cb;

    const-string v4, "show_module"

    invoke-direct {v3, v4}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "trigger"

    invoke-virtual {v3, v4, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 414
    iput-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->Q:Ljava/lang/String;

    .line 418
    :cond_1
    if-eqz v0, :cond_4

    .line 419
    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->r()V

    .line 420
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 427
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->k()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 428
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d()V

    .line 433
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->L:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 434
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b()V

    .line 436
    :cond_3
    return-void

    .line 421
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/facebook/orca/creation/CreateThreadActivity;->k()Z

    move-result v0

    if-nez v0, :cond_2

    .line 424
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->K:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    .line 430
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->U:Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->O()V

    goto :goto_1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 440
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 441
    const-string v0, "composeExpanded"

    iget-boolean v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->p:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 442
    const-string v0, "composingSmsThread"

    iget-boolean v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->q:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 443
    const-string v0, "outgoingMessage"

    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->O:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 444
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    .line 445
    const-string v0, "pickedUsers"

    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->P:Lcom/google/common/a/es;

    invoke-static {v1}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 448
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->Q:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 449
    const-string v0, "trigger"

    iget-object v1, p0, Lcom/facebook/orca/creation/CreateThreadActivity;->Q:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    :cond_1
    return-void
.end method
