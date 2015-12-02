.class public Lcom/facebook/contacts/contactcard/GroupMembersSectionView;
.super Lcom/facebook/contacts/contactcard/SectionView;
.source "GroupMembersSectionView.java"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Lcom/facebook/contacts/contactcard/am;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/contacts/contactcard/SectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a:Ljava/util/List;

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->b:Z

    .line 53
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->b()V

    .line 68
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 69
    new-instance v2, Lcom/facebook/contacts/contactcard/aw;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/contacts/contactcard/aw;-><init>(Landroid/content/Context;)V

    .line 70
    invoke-virtual {v2, v0}, Lcom/facebook/contacts/contactcard/aw;->setParticipant(Lcom/facebook/orca/threads/ThreadParticipant;)V

    .line 71
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v3, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    if-ne v0, v3, :cond_0

    .line 72
    new-instance v0, Lcom/facebook/contacts/contactcard/aj;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/contactcard/aj;-><init>(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;)V

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/contactcard/aw;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    :goto_1
    invoke-virtual {p0, v2}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->b(Landroid/view/View;)V

    goto :goto_0

    .line 80
    :cond_0
    new-instance v0, Lcom/facebook/contacts/contactcard/ak;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/contactcard/ak;-><init>(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;)V

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/contactcard/aw;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 92
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->b:Z

    if-eqz v0, :cond_2

    .line 93
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/m;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/contactcard/entry/m;-><init>(Landroid/content/Context;)V

    .line 94
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->contact_card_group_add_person:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/m;->setText(Ljava/lang/String;)V

    .line 95
    new-instance v1, Lcom/facebook/contacts/contactcard/al;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/al;-><init>(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/m;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->b(Landroid/view/View;)V

    .line 103
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;Lcom/facebook/orca/threads/ThreadParticipant;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a(Lcom/facebook/orca/threads/ThreadParticipant;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;Lcom/facebook/user/UserKey;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a(Lcom/facebook/user/UserKey;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadParticipant;)V
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->c:Lcom/facebook/contacts/contactcard/am;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->c:Lcom/facebook/contacts/contactcard/am;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/contacts/contactcard/am;->a(Lcom/facebook/user/UserKey;)V

    .line 117
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/user/UserKey;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 106
    sget-object v0, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v3

    if-ne v0, v3, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 107
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 108
    const-string v3, "android.intent.extra.EMAIL"

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    const-string v1, "plain/text"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 111
    return-void

    :cond_0
    move v0, v2

    .line 106
    goto :goto_0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->c:Lcom/facebook/contacts/contactcard/am;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->c:Lcom/facebook/contacts/contactcard/am;

    invoke-interface {v0}, Lcom/facebook/contacts/contactcard/am;->a()V

    .line 123
    :cond_0
    return-void
.end method


# virtual methods
.method public setGroupMembersSectionListener(Lcom/facebook/contacts/contactcard/am;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->c:Lcom/facebook/contacts/contactcard/am;

    .line 64
    return-void
.end method

.method public setThreadSummary(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->b:Z

    .line 58
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a:Ljava/util/List;

    .line 59
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a()V

    .line 60
    return-void

    .line 56
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
