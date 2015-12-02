.class public Lcom/facebook/contacts/contactcard/ContactCardFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ContactCardFragment.java"


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
.field private Z:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private aA:Landroid/widget/Button;

.field private aB:Landroid/view/ViewGroup;

.field private aC:Lcom/facebook/c/s;

.field private aD:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

.field private aE:Lcom/facebook/contacts/contactcard/f;

.field private aF:Landroid/app/ProgressDialog;

.field private aG:Lcom/facebook/contacts/contactcard/x;

.field private aH:Lcom/facebook/contacts/models/Contact;

.field private aI:Lcom/facebook/contacts/models/ContactDetails;

.field private aJ:Z

.field private aK:Lcom/facebook/orca/threads/ThreadSummary;

.field private aL:Lcom/facebook/orca/threads/MessagesCollection;

.field private aM:Z

.field private aN:Z

.field private aO:Z

.field private aa:Lcom/facebook/contacts/data/a;

.field private ab:Lcom/facebook/fbservice/ops/k;

.field private ac:Lcom/facebook/prefs/shared/d;

.field private ad:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private ae:Lcom/facebook/orca/fbwebrtc/i;

.field private af:Lcom/facebook/contacts/contactcard/ax;

.field private ag:Lcom/facebook/zero/ui/l;

.field private ah:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private ai:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private aj:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private ak:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private al:Ljava/util/concurrent/Executor;

.field private am:Lcom/google/common/d/a/u;

.field private an:Lcom/facebook/user/UserKey;

.field private ao:Lcom/facebook/config/a/a;

.field private ap:Landroid/widget/Button;

.field private aq:Lcom/facebook/contacts/contactcard/HeaderView;

.field private ar:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private as:Landroid/view/ViewGroup;

.field private at:Landroid/view/ViewGroup;

.field private au:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

.field private av:Landroid/view/ViewGroup;

.field private aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

.field private ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

.field private ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

.field private az:Lcom/facebook/contacts/contactcard/MapSectionView;

.field private b:Lcom/facebook/orca/f/k;

.field private c:Lcom/facebook/analytics/av;

.field private d:Lcom/facebook/common/e/h;

.field private e:Lcom/facebook/contacts/g/c;

.field private f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 103
    const-class v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;

    sput-object v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 101
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 167
    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    .line 173
    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aN:Z

    .line 178
    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    .line 183
    return-void
.end method

.method static synthetic V()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 101
    sget-object v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private W()V
    .locals 3

    .prologue
    .line 557
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 558
    const/4 v0, 0x0

    .line 559
    if-eqz v1, :cond_0

    .line 560
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b:Lcom/facebook/orca/f/k;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/k;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 567
    :cond_0
    invoke-virtual {p0, v1, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 571
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    .line 572
    if-eqz v0, :cond_1

    .line 573
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    invoke-virtual {v0}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/contactcard/HeaderView;->setPlaceholderName(Ljava/lang/String;)V

    .line 574
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/HeaderView;->setVisibility(I)V

    .line 576
    :cond_1
    return-void
.end method

.method private X()V
    .locals 2

    .prologue
    .line 586
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "blockContactDialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    .line 589
    if-eqz v0, :cond_0

    .line 590
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aE:Lcom/facebook/contacts/contactcard/f;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/f;)V

    .line 593
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ag:Lcom/facebook/zero/ui/l;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/l;->a(Landroid/support/v4/app/q;)V

    .line 594
    return-void
.end method

.method private Y()V
    .locals 2

    .prologue
    .line 597
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    .line 598
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    iget-boolean v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setEditMode(Z)V

    .line 599
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    if-eqz v0, :cond_0

    .line 600
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/x;->d()V

    .line 602
    :cond_0
    return-void

    .line 597
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private Z()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 680
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    sget-object v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Updating contact info: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 683
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    sget-object v4, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    if-ne v0, v4, :cond_1

    .line 684
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    invoke-virtual {v0, v3}, Lcom/facebook/contacts/contactcard/HeaderView;->setVisibility(I)V

    .line 685
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ap:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 693
    :goto_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactDetails;->getHasTimeline()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 694
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->at:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 695
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/MapSectionView;->setVisibility(I)V

    .line 702
    :goto_1
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ag()V

    .line 704
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    sget-object v4, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    if-eq v0, v4, :cond_3

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-eq v0, v4, :cond_3

    move v0, v1

    .line 706
    :goto_2
    iget-object v4, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aA:Landroid/widget/Button;

    if-eqz v0, :cond_4

    move v0, v2

    :goto_3
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 709
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    if-eqz v0, :cond_5

    .line 710
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v1}, Lcom/facebook/contacts/models/ContactDetails;->getContactInfoSection()Lcom/facebook/contacts/models/EntrySection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setEntrySection(Lcom/facebook/contacts/models/EntrySection;)V

    .line 718
    :cond_0
    :goto_4
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    iget-boolean v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setEditMode(Z)V

    .line 719
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setVisibility(I)V

    .line 720
    return-void

    .line 687
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    iget-object v4, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0, v4}, Lcom/facebook/contacts/contactcard/HeaderView;->setContact(Lcom/facebook/contacts/models/Contact;)V

    .line 688
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/HeaderView;->setVisibility(I)V

    .line 689
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ap:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 697
    :cond_2
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->at:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 698
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-virtual {v0, v3}, Lcom/facebook/contacts/contactcard/MapSectionView;->setVisibility(I)V

    goto :goto_1

    :cond_3
    move v0, v2

    .line 704
    goto :goto_2

    :cond_4
    move v0, v3

    .line 706
    goto :goto_3

    .line 711
    :cond_5
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    sget-object v3, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    if-ne v0, v3, :cond_0

    .line 712
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v3, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v3, :cond_6

    :goto_5
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 713
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aa:Lcom/facebook/contacts/data/a;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/data/a;->a(Ljava/lang/String;)Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    .line 715
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setEntrySection(Lcom/facebook/contacts/models/EntrySection;)V

    goto :goto_4

    :cond_6
    move v1, v2

    .line 712
    goto :goto_5
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 2

    .prologue
    .line 1096
    const-string v0, "GroupContactCardFragment"

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 1097
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aK:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    .line 1098
    const-string v0, "thread_id"

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aK:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 1101
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1102
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ag()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/models/entry/Entry;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/contacts/models/entry/PhoneEntry;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/models/entry/PhoneEntry;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->e(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 2

    .prologue
    .line 867
    sget-object v0, Lcom/facebook/contacts/contactcard/o;->a:[I

    invoke-interface {p1}, Lcom/facebook/contacts/models/entry/Entry;->a()Lcom/facebook/contacts/models/entry/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/models/entry/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 883
    :goto_0
    return-void

    .line 869
    :pswitch_0
    const-string v0, "dial_phone_number"

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->e(Ljava/lang/String;)V

    .line 870
    check-cast p1, Lcom/facebook/contacts/models/entry/PhoneEntry;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getNumber()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 873
    :pswitch_1
    const-string v0, "open_email_client"

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->e(Ljava/lang/String;)V

    .line 874
    check-cast p1, Lcom/facebook/contacts/models/entry/EmailEntry;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/EmailEntry;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 877
    :pswitch_2
    const-string v0, "open_address_in_map"

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->e(Ljava/lang/String;)V

    .line 878
    check-cast p1, Lcom/facebook/contacts/models/entry/AddressEntry;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/AddressEntry;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 867
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/facebook/contacts/models/entry/PhoneEntry;)V
    .locals 5

    .prologue
    .line 886
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 887
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ak:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 923
    :goto_0
    return-void

    .line 891
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 892
    new-instance v1, Lcom/facebook/contacts/server/DeleteContactClaimParams;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v3}, Lcom/facebook/contacts/models/Contact;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v4}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/contacts/server/DeleteContactClaimParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 896
    const-string v2, "deleteContactClaimParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 897
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 900
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->contact_delete_phone_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 903
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ak:Lcom/google/common/d/a/s;

    .line 904
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ak:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/contactcard/l;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/l;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 645
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactResult;

    .line 646
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    .line 647
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->b()Lcom/facebook/contacts/models/ContactDetails;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    .line 649
    sget-object v1, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Fetched contact successfully, result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 651
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    if-eqz v1, :cond_0

    .line 652
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    invoke-interface {v1}, Lcom/facebook/contacts/contactcard/x;->d()V

    .line 654
    :cond_0
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Z()V

    .line 655
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    if-ne v0, v1, :cond_2

    .line 656
    sget-object v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    const-string v1, "Contact fetched from server, done."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 657
    invoke-direct {p0, v4}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Z)V

    .line 672
    :cond_1
    :goto_0
    return-void

    .line 659
    :cond_2
    sget-object v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    const-string v1, "Checking server for new data..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 660
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/fbservice/service/s;)V

    .line 665
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/ContactDetails;->getContactInfoSection()Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 669
    invoke-direct {p0, v4}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Z)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 675
    sget-object v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fetching contact failed, error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 676
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Z)V

    .line 677
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/s;)V
    .locals 3

    .prologue
    .line 837
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 864
    :goto_0
    return-void

    .line 845
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 846
    new-instance v1, Lcom/facebook/contacts/server/FetchContactParams;

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-direct {v1, p1, v2}, Lcom/facebook/contacts/server/FetchContactParams;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/user/UserKey;)V

    .line 847
    const-string v2, "fetchContactParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 848
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    .line 851
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/contactcard/k;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/k;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 926
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aj:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 968
    :goto_0
    return-void

    .line 932
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->e:Lcom/facebook/contacts/g/c;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/contacts/g/c;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 935
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 936
    new-instance v2, Lcom/facebook/contacts/server/CreateContactClaimParams;

    iget-object v3, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v3}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v4}, Lcom/facebook/contacts/models/Contact;->getGraphApiWriteId()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/facebook/contacts/server/PrivacyParam;->b:Lcom/facebook/contacts/server/PrivacyParam;

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/facebook/contacts/server/CreateContactClaimParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/contacts/server/PrivacyParam;)V

    .line 941
    const-string v0, "createContactClaimParams"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 942
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 945
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->contact_add_phone_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 948
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aj:Lcom/google/common/d/a/s;

    .line 949
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aj:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/contactcard/m;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/m;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 751
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->as:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    .line 764
    :cond_0
    :goto_0
    return-void

    .line 755
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 756
    if-eqz p1, :cond_2

    .line 757
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v1, Lcom/facebook/o;->contact_card_loading:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(I)V

    .line 758
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 759
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->as:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 761
    :cond_2
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 762
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->as:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/ContactCardFragment;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aN:Z

    return p1
.end method

.method private aa()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 767
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 769
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 771
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.INSERT"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 772
    const-string v3, "vnd.android.cursor.dir/contact"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 773
    const-string v3, "phone"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 774
    iput-boolean v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aN:Z

    .line 775
    invoke-virtual {p0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Landroid/content/Intent;)V

    .line 776
    return-void

    .line 768
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ab()V
    .locals 5

    .prologue
    .line 779
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getLookupKey()Ljava/lang/String;

    move-result-object v0

    .line 780
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/o;->contact_card_loading:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 786
    invoke-virtual {v1}, Lcom/facebook/fbservice/ops/aa;->a()V

    .line 787
    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->am:Lcom/google/common/d/a/u;

    new-instance v3, Lcom/facebook/contacts/contactcard/i;

    invoke-direct {v3, p0, v0}, Lcom/facebook/contacts/contactcard/i;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 798
    new-instance v2, Lcom/facebook/contacts/contactcard/j;

    invoke-direct {v2, p0, v1}, Lcom/facebook/contacts/contactcard/j;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/facebook/fbservice/ops/aa;)V

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->al:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 820
    return-void
.end method

.method private ac()V
    .locals 2

    .prologue
    .line 826
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b:Lcom/facebook/orca/f/k;

    invoke-virtual {v1}, Lcom/facebook/orca/f/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 831
    :goto_0
    return-void

    .line 830
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/user/UserKey;)V

    goto :goto_0
.end method

.method private ad()V
    .locals 3

    .prologue
    .line 971
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 972
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/contacts/contactcard/HiddenEntryPickerActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 973
    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 974
    const-string v1, "contact_id"

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v2}, Lcom/facebook/contacts/models/Contact;->getContactId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 976
    const/16 v1, 0x15

    invoke-virtual {p0, v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Landroid/content/Intent;I)V

    .line 977
    return-void
.end method

.method private ae()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 1022
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1023
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 1027
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_2

    .line 1028
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 1035
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fb://profile/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v3

    .line 1036
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1038
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/facebook/common/j/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v3

    .line 1041
    if-nez v3, :cond_5

    .line 1044
    const-string v2, "http://m.facebook.com/profile.php"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v2

    .line 1045
    const-string v4, "id"

    invoke-virtual {v2, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1046
    new-instance v0, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v4, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1049
    :goto_2
    if-eqz v3, :cond_3

    .line 1050
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aC:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 1060
    :goto_3
    return-void

    .line 1023
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1030
    :cond_2
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getProfileFbid()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 1052
    :cond_3
    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    if-nez v2, :cond_4

    .line 1053
    new-instance v2, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    .line 1054
    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    invoke-virtual {v2, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 1055
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    sget v2, Lcom/facebook/o;->loading_timeline_message:I

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 1056
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V

    .line 1058
    :cond_4
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aC:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_3

    :cond_5
    move-object v0, v2

    goto :goto_2
.end method

.method private af()V
    .locals 0

    .prologue
    .line 1063
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ae()V

    .line 1064
    return-void
.end method

.method private ag()V
    .locals 2

    .prologue
    .line 1070
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ax;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1071
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1081
    :goto_0
    return-void

    .line 1073
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1074
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setEnabled(Z)V

    .line 1075
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ax;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1076
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    sget v1, Lcom/facebook/f;->voip_section_background_unavailable:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_0

    .line 1078
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    sget v1, Lcom/facebook/f;->voip_section_background_normal:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method private ah()V
    .locals 5

    .prologue
    .line 1087
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ae:Lcom/facebook/orca/fbwebrtc/i;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    iget-object v3, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {v3}, Lcom/facebook/contacts/contactcard/ax;->c()Z

    move-result v3

    iget-object v4, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {v4}, Lcom/facebook/contacts/contactcard/ax;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/fbwebrtc/i;->a(Landroid/content/Context;Lcom/facebook/user/UserKey;ZLjava/lang/String;)V

    .line 1091
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ac()V

    .line 1092
    return-void
.end method

.method private ai()V
    .locals 3

    .prologue
    .line 1115
    new-instance v0, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;

    invoke-direct {v0}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;-><init>()V

    .line 1116
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aE:Lcom/facebook/contacts/contactcard/f;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Lcom/facebook/contacts/contactcard/f;)V

    .line 1118
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "blockContactDialog"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/contacts/contactcard/BlockContactDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    .line 1119
    return-void
.end method

.method private aj()V
    .locals 4

    .prologue
    .line 1122
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aK:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/prefs/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 1123
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ac:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/notify/NotificationSetting;->b:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v2}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 1126
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->a()V

    .line 1127
    return-void
.end method

.method private ak()V
    .locals 3

    .prologue
    .line 1130
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ai:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 1156
    :goto_0
    return-void

    .line 1137
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1138
    new-instance v1, Lcom/facebook/contacts/server/BlockContactParams;

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/server/BlockContactParams;-><init>(Lcom/facebook/user/UserKey;)V

    .line 1139
    const-string v2, "blockContactParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1140
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->e:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ai:Lcom/google/common/d/a/s;

    .line 1144
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ai:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/contactcard/n;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/n;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->al:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method

.method private al()V
    .locals 4

    .prologue
    .line 1159
    const-string v0, "https://m.facebook.com/help/contact/messenger-reporting"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v2

    .line 1162
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 1164
    const-string v1, "cid"

    iget-object v3, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ao:Lcom/facebook/config/a/a;

    invoke-virtual {v3}, Lcom/facebook/config/a/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1165
    const-string v3, "auth_token"

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->i:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1166
    const-string v1, "rep"

    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1167
    const-string v0, "resp"

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1168
    const-string v0, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1170
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1171
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aC:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 1172
    return-void
.end method

.method private am()Z
    .locals 1

    .prologue
    .line 1179
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ak:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aa()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 980
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 982
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.DIAL"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 983
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    .line 985
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "android.permission.CALL_PHONE"

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    .line 988
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.CALL"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 991
    :cond_0
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aC:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 992
    return-void
.end method

.method static synthetic c(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aj:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic c(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 995
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 996
    const-string v1, "android.intent.extra.EMAIL"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 997
    const-string v1, "plain/text"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 998
    const-string v1, ""

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Landroid/content/Intent;)V

    .line 999
    return-void
.end method

.method static synthetic d(Lcom/facebook/contacts/contactcard/ContactCardFragment;)Lcom/facebook/zero/ui/l;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ag:Lcom/facebook/zero/ui/l;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/contacts/contactcard/ContactCardFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ai:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1002
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 1005
    :try_start_0
    const-string v1, "ISO-8859-1"

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p1

    .line 1009
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "geo:0,0?q="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 1010
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1012
    invoke-static {v0, v2}, Lcom/facebook/common/j/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1013
    invoke-virtual {p0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Landroid/content/Intent;)V

    .line 1015
    :cond_0
    return-void

    .line 1006
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic e(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ai()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1105
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 1108
    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/analytics/cb;)V

    .line 1109
    return-void
.end method

.method static synthetic f(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aj()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ak()V

    return-void
.end method

.method static synthetic h(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->al()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah()V

    return-void
.end method

.method static synthetic j(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af()V

    return-void
.end method

.method static synthetic k(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ad()V

    return-void
.end method

.method static synthetic l(Lcom/facebook/contacts/contactcard/ContactCardFragment;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aC:Lcom/facebook/c/s;

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/contacts/contactcard/ContactCardFragment;)Lcom/facebook/common/e/h;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d:Lcom/facebook/common/e/h;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 0

    .prologue
    .line 446
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 447
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->T()V

    .line 448
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->R()V

    .line 449
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ac()V

    .line 450
    return-void
.end method

.method public B()V
    .locals 1

    .prologue
    .line 472
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 473
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 474
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 475
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aF:Landroid/app/ProgressDialog;

    .line 477
    :cond_0
    return-void
.end method

.method public O()V
    .locals 3

    .prologue
    .line 543
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    if-nez v0, :cond_0

    .line 549
    :goto_0
    return-void

    .line 547
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    const-string v1, "visible"

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/MapSectionView;->setVisibilityMode(Ljava/lang/String;)V

    .line 548
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aL:Lcom/facebook/orca/threads/MessagesCollection;

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/contacts/contactcard/MapSectionView;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/user/UserKey;)V

    goto :goto_0
.end method

.method public P()Z
    .locals 1

    .prologue
    .line 605
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    return v0
.end method

.method public Q()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 634
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 635
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 636
    iput-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ah:Lcom/google/common/d/a/s;

    .line 638
    iput-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    .line 640
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ax;->f()V

    .line 642
    return-void
.end method

.method public R()V
    .locals 2

    .prologue
    .line 723
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    if-nez v0, :cond_0

    .line 732
    :goto_0
    return-void

    .line 726
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aJ:Z

    if-eqz v0, :cond_1

    .line 727
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->setVisibility(I)V

    .line 728
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->a()V

    goto :goto_0

    .line 730
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->setVisibility(I)V

    goto :goto_0
.end method

.method T()V
    .locals 1

    .prologue
    .line 735
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    if-nez v0, :cond_0

    .line 748
    :goto_0
    return-void

    .line 738
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aN:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    if-nez v0, :cond_3

    .line 739
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Z)V

    .line 740
    sget-object v0, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/fbservice/service/s;)V

    .line 741
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    if-eqz v0, :cond_2

    .line 742
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/x;->e()V

    .line 744
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aN:Z

    goto :goto_0

    .line 746
    :cond_3
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Z()V

    goto :goto_0
.end method

.method public U()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 1183
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    if-eqz v0, :cond_0

    .line 1184
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/HeaderView;->setVisibility(I)V

    .line 1185
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/HeaderView;->a()V

    .line 1188
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->at:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 1189
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->at:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1191
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 1192
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1194
    :cond_2
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    if-eqz v0, :cond_3

    .line 1195
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setEnabled(Z)V

    .line 1197
    :cond_3
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    if-eqz v0, :cond_4

    .line 1198
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {v0, v3}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/user/UserKey;)V

    .line 1200
    :cond_4
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    if-eqz v0, :cond_5

    .line 1201
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/MapSectionView;->a()V

    .line 1202
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/MapSectionView;->setVisibility(I)V

    .line 1204
    :cond_5
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ap:Landroid/widget/Button;

    if-eqz v0, :cond_6

    .line 1205
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ap:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 1207
    :cond_6
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aA:Landroid/widget/Button;

    if-eqz v0, :cond_7

    .line 1208
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aA:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 1210
    :cond_7
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    if-eqz v0, :cond_8

    .line 1211
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setVisibility(I)V

    .line 1214
    :cond_8
    iput-object v3, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    .line 1215
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Q()V

    .line 1216
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Z)V

    .line 1217
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 223
    sget v0, Lcom/facebook/k;->contacts_card_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v2, -0x1

    .line 481
    const/16 v1, 0x15

    if-ne p1, v1, :cond_0

    if-ne p2, v0, :cond_0

    .line 483
    const-string v1, "entry_position"

    invoke-virtual {p3, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 484
    if-eq v1, v2, :cond_1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 486
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getEntrySection()Lcom/facebook/contacts/models/EntrySection;

    move-result-object v0

    .line 487
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    invoke-virtual {v0}, Lcom/facebook/contacts/models/EntrySection;->getHiddenEntries()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 489
    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getNumber()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Ljava/lang/String;)V

    .line 491
    :cond_0
    return-void

    .line 484
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 213
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 214
    if-eqz p1, :cond_0

    .line 215
    const-string v0, "userKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    .line 216
    const-string v0, "showConversationSettings"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aJ:Z

    .line 218
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/contacts/contactcard/x;)V
    .locals 1

    .prologue
    .line 494
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    .line 495
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    if-eqz v0, :cond_0

    .line 496
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/contactcard/MapSectionView;->setContactCardListener(Lcom/facebook/contacts/contactcard/x;)V

    .line 497
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->setContactCardListener(Lcom/facebook/contacts/contactcard/x;)V

    .line 499
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 2

    .prologue
    .line 609
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    if-nez v0, :cond_1

    .line 631
    :cond_0
    :goto_0
    return-void

    .line 612
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aK:Lcom/facebook/orca/threads/ThreadSummary;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aL:Lcom/facebook/orca/threads/MessagesCollection;

    if-eq p2, v0, :cond_0

    .line 615
    :cond_2
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aK:Lcom/facebook/orca/threads/ThreadSummary;

    .line 616
    iput-object p2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aL:Lcom/facebook/orca/threads/MessagesCollection;

    .line 618
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ad:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/HeaderView;->setThreadNameViewData(Lcom/facebook/orca/threadview/v;)V

    .line 622
    if-eqz p1, :cond_3

    .line 623
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->setThreadId(Ljava/lang/String;)V

    .line 625
    :cond_3
    if-eqz p2, :cond_4

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_4

    .line 626
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, p2, v1}, Lcom/facebook/contacts/contactcard/MapSectionView;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/user/UserKey;)V

    goto :goto_0

    .line 629
    :cond_4
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/MapSectionView;->a()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/user/UserKey;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 234
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {p1, v0}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aJ:Z

    if-ne p2, v0, :cond_1

    .line 254
    :cond_0
    :goto_0
    return-void

    .line 238
    :cond_1
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    .line 239
    iput-boolean p2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aJ:Z

    .line 241
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/HeaderView;->setVisibility(I)V

    .line 245
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/HeaderView;->a()V

    .line 246
    iput-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    .line 247
    iput-object v2, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    .line 249
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->W()V

    .line 250
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->T()V

    .line 251
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->R()V

    .line 252
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ac()V

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 502
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aH:Lcom/facebook/contacts/models/Contact;

    sget-object v1, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aI:Lcom/facebook/contacts/models/ContactDetails;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->f:Ljavax/inject/a;

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
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 511
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    .line 513
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Y()V

    .line 515
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 521
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    if-nez v0, :cond_0

    .line 534
    :goto_0
    return-void

    .line 525
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getAddEntryValue()Ljava/lang/String;

    move-result-object v0

    .line 527
    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 528
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Y()V

    goto :goto_0

    .line 533
    :cond_1
    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Z)V
    .locals 1

    .prologue
    .line 454
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->c(Z)V

    .line 455
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 461
    :cond_0
    :goto_0
    return-void

    .line 458
    :cond_1
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    if-eqz v0, :cond_0

    .line 459
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ac()V

    goto :goto_0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 537
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aM:Z

    if-eqz v0, :cond_0

    .line 538
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Y()V

    .line 540
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 258
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 260
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->S()Lcom/facebook/inject/t;

    move-result-object v6

    .line 261
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->b:Lcom/facebook/orca/f/k;

    .line 262
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->c:Lcom/facebook/analytics/av;

    .line 263
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d:Lcom/facebook/common/e/h;

    .line 264
    const-class v0, Lcom/facebook/contacts/g/c;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/g/c;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->e:Lcom/facebook/contacts/g/c;

    .line 265
    const-class v0, Lcom/facebook/contacts/data/a;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/a;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aa:Lcom/facebook/contacts/data/a;

    .line 266
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsMergeThreadsEnabled;

    invoke-virtual {v6, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->f:Ljavax/inject/a;

    .line 269
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsPartialAccount;

    invoke-virtual {v6, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->g:Ljavax/inject/a;

    .line 270
    const-class v0, Lcom/facebook/user/User;

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {v6, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->h:Ljavax/inject/a;

    .line 271
    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->i:Ljavax/inject/a;

    .line 272
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab:Lcom/facebook/fbservice/ops/k;

    .line 273
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ao:Lcom/facebook/config/a/a;

    .line 274
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aC:Lcom/facebook/c/s;

    .line 275
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsVoipEnabledForUser;

    invoke-virtual {v6, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Z:Ljavax/inject/a;

    .line 276
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ad:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 278
    const-class v0, Ljava/util/concurrent/Executor;

    const-class v1, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v6, v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->al:Ljava/util/concurrent/Executor;

    .line 279
    const-class v0, Lcom/google/common/d/a/u;

    const-class v1, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {v6, v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/u;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->am:Lcom/google/common/d/a/u;

    .line 281
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ac:Lcom/facebook/prefs/shared/d;

    .line 282
    const-class v0, Lcom/facebook/orca/fbwebrtc/i;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/i;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ae:Lcom/facebook/orca/fbwebrtc/i;

    .line 283
    new-instance v0, Lcom/facebook/contacts/contactcard/ax;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Z:Ljavax/inject/a;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsVoipWifiCallingOnly;

    invoke-virtual {v6, v2, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/e/c;

    invoke-virtual {v6, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/e/c;

    const-class v4, Lcom/facebook/common/time/a;

    invoke-virtual {v6, v4}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/time/a;

    iget-object v5, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ab:Lcom/facebook/fbservice/ops/k;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/contacts/contactcard/ax;-><init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/e/c;Lcom/facebook/common/time/a;Lcom/facebook/fbservice/ops/k;)V

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    .line 289
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->af:Lcom/facebook/contacts/contactcard/ax;

    new-instance v1, Lcom/facebook/contacts/contactcard/g;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/g;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/az;)V

    .line 295
    const-class v0, Lcom/facebook/zero/ui/l;

    invoke-virtual {v6, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/l;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ag:Lcom/facebook/zero/ui/l;

    .line 297
    sget v0, Lcom/facebook/i;->contact_card_add_contact:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ap:Landroid/widget/Button;

    .line 298
    sget v0, Lcom/facebook/i;->contact_header_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/HeaderView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aq:Lcom/facebook/contacts/contactcard/HeaderView;

    .line 299
    sget v0, Lcom/facebook/i;->contact_card_empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 300
    sget v0, Lcom/facebook/i;->contact_card_content_wrapper:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->as:Landroid/view/ViewGroup;

    .line 301
    sget v0, Lcom/facebook/i;->conversation_settings_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    .line 302
    sget v0, Lcom/facebook/i;->contact_card_view_timeline_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->at:Landroid/view/ViewGroup;

    .line 303
    sget v0, Lcom/facebook/i;->contact_card_view_timeline_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->au:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    .line 304
    sget v0, Lcom/facebook/i;->contact_card_voip_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->av:Landroid/view/ViewGroup;

    .line 305
    sget v0, Lcom/facebook/i;->contact_card_voip_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    .line 306
    sget v0, Lcom/facebook/i;->contact_entry_section_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/EntrySectionView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    .line 307
    sget v0, Lcom/facebook/i;->map_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/MapSectionView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    .line 308
    sget v0, Lcom/facebook/i;->contact_card_view_in_address_book:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aA:Landroid/widget/Button;

    .line 309
    sget v0, Lcom/facebook/i;->contact_card_block_user_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aB:Landroid/view/ViewGroup;

    .line 311
    sget v0, Lcom/facebook/i;->contact_card_block_user_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aD:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    .line 313
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->az:Lcom/facebook/contacts/contactcard/MapSectionView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/MapSectionView;->setContactCardListener(Lcom/facebook/contacts/contactcard/x;)V

    .line 315
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ay:Lcom/facebook/contacts/contactcard/ConversationSettingsView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aG:Lcom/facebook/contacts/contactcard/x;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ConversationSettingsView;->setContactCardListener(Lcom/facebook/contacts/contactcard/x;)V

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->transparent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 321
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ap:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/contacts/contactcard/p;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/p;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aA:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/contacts/contactcard/q;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/q;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 336
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->au:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    sget v1, Lcom/facebook/o;->contact_card_view_timeline:I

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setLabelText(I)V

    .line 337
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->au:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    new-instance v1, Lcom/facebook/contacts/contactcard/r;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/r;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 346
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    sget v1, Lcom/facebook/o;->contact_card_call_with_messenger:I

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setLabelText(I)V

    .line 347
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    invoke-virtual {v0, v7}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setEnabled(Z)V

    .line 348
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aw:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    new-instance v1, Lcom/facebook/contacts/contactcard/s;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/s;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 356
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aD:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    sget v1, Lcom/facebook/o;->contact_card_block_user:I

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setLabelText(I)V

    .line 357
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aD:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    new-instance v1, Lcom/facebook/contacts/contactcard/t;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/t;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 364
    new-instance v0, Lcom/facebook/contacts/contactcard/u;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/contactcard/u;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aE:Lcom/facebook/contacts/contactcard/f;

    .line 381
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ag:Lcom/facebook/zero/ui/l;

    sget-object v1, Lcom/facebook/zero/a/c;->g:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_view_timeline_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/contacts/contactcard/w;

    invoke-direct {v3, p0}, Lcom/facebook/contacts/contactcard/w;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->l:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_voip_call_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/contacts/contactcard/v;

    invoke-direct {v3, p0}, Lcom/facebook/contacts/contactcard/v;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    .line 409
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->X()V

    .line 411
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->ax:Lcom/facebook/contacts/contactcard/EntrySectionView;

    new-instance v1, Lcom/facebook/contacts/contactcard/h;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/h;-><init>(Lcom/facebook/contacts/contactcard/ContactCardFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setEntryListener(Lcom/facebook/contacts/contactcard/af;)V

    .line 436
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->am()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 437
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aB:Landroid/view/ViewGroup;

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 440
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aO:Z

    .line 441
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->W()V

    .line 442
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 465
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 466
    const-string v1, "userKey"

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    const-string v0, "showConversationSettings"

    iget-boolean v1, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->aJ:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 468
    return-void

    .line 466
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ContactCardFragment;->an:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
