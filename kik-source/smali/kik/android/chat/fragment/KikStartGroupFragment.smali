.class public Lkik/android/chat/fragment/KikStartGroupFragment;
.super Lkik/android/chat/fragment/KikPickUsersFragment;
.source "SourceFile"

# interfaces
.implements Lcom/github/ksoichiro/android/observablescrollview/k;
.implements Lkik/android/e/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikStartGroupFragment$a;
    }
.end annotation


# static fields
.field private static ab:Z


# instance fields
.field protected O:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field U:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field V:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field W:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field X:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field Y:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field Z:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field _createGroupButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e007a
    .end annotation
.end field

.field _groupContactView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e006f
    .end annotation
.end field

.field _groupNameEditText:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0070
    .end annotation
.end field

.field _numGroupMembersText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0079
    .end annotation
.end field

.field _rootLayout:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e006a
    .end annotation
.end field

.field aa:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private ac:Ljava/util/Set;

.field private ad:Ljava/lang/String;

.field private ae:Ljava/lang/String;

.field private af:Z

.field private ag:Z

.field private ah:I

.field private ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

.field private aj:Landroid/view/View;

.field private ak:Landroid/view/View;

.field private al:Lkik/a/d/k;

.field private am:Lkik/a/d/n;

.field createButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e007a
    .end annotation
.end field

.field groupHeader:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e006e
    .end annotation
.end field

.field groupNameClearButton:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0071
    .end annotation
.end field

.field searchButton:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e012f
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/chat/fragment/KikStartGroupFragment;->ab:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 73
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;-><init>()V

    .line 102
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ae:Ljava/lang/String;

    .line 108
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->af:Z

    .line 109
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ag:Z

    .line 110
    iput v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ah:I

    .line 111
    new-instance v0, Lkik/android/chat/fragment/KikStartGroupFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

    .line 703
    return-void
.end method

.method private a(Landroid/widget/EditText;Landroid/view/View;)Landroid/view/View$OnFocusChangeListener;
    .locals 1

    .prologue
    .line 231
    new-instance v0, Lkik/android/chat/fragment/pv;

    invoke-direct {v0, p0, p1, p2}, Lkik/android/chat/fragment/pv;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;Landroid/widget/EditText;Landroid/view/View;)V

    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikStartGroupFragment;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikStartGroupFragment;Lkik/a/d/n;)Lkik/a/d/n;
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->am:Lkik/a/d/n;

    return-object p1
.end method

.method private a(Lkik/a/d/n;)V
    .locals 1

    .prologue
    .line 610
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    .line 611
    return-void
.end method

.method private ad()Z
    .locals 1

    .prologue
    .line 339
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ae()V
    .locals 7

    .prologue
    const/16 v6, 0x32

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 406
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 407
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_numGroupMembersText:Landroid/widget/TextView;

    const v1, 0x7f090194

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_createGroupButton:Landroid/widget/Button;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->ad()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 414
    return-void

    .line 410
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_numGroupMembersText:Landroid/widget/TextView;

    const v1, 0x7f09011e

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikStartGroupFragment;Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Lkik/a/d/n;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikStartGroupFragment;)Z
    .locals 1

    .prologue
    .line 73
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ag:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikStartGroupFragment;)Lkik/a/d/n;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->am:Lkik/a/d/n;

    return-object v0
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 419
    const v0, 0x7f09030d

    return v0
.end method

.method protected final Q()Z
    .locals 1

    .prologue
    .line 658
    const/4 v0, 0x0

    return v0
.end method

.method protected final S()Z
    .locals 1

    .prologue
    .line 652
    const/4 v0, 0x0

    return v0
.end method

.method protected final T()I
    .locals 1

    .prologue
    .line 640
    const v0, 0x7f020188

    return v0
.end method

.method protected final Z()Ljava/lang/String;
    .locals 1

    .prologue
    .line 634
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 574
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->Y:Lcom/kik/android/a;

    const-string v1, "Group Photo Changed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Was Empty"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "From Camera"

    sget-boolean v2, Lkik/android/chat/fragment/KikStartGroupFragment;->ab:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Width"

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 579
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->X:Lkik/a/e/v;

    invoke-static {p1}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->am:Lkik/a/d/n;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a([BLkik/a/d/n;)V

    .line 580
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->am:Lkik/a/d/n;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Lkik/a/d/n;)V

    .line 582
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->U:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    .line 583
    return-void
.end method

.method public final b(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 616
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikPickUsersFragment;->b(Lkik/a/d/k;)V

    .line 618
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 619
    invoke-direct {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->ae()V

    .line 620
    return-void
.end method

.method public final c(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 625
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikPickUsersFragment;->c(Lkik/a/d/k;)V

    .line 627
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 628
    invoke-direct {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->ae()V

    .line 629
    return-void
.end method

.method public clearComposeTo()V
    .locals 1
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e0075
        }
    .end annotation

    .prologue
    .line 400
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->l()V

    .line 401
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Landroid/view/View;)V

    .line 402
    return-void
.end method

.method public clearGroupName()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e0071
        }
    .end annotation

    .prologue
    .line 700
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 701
    return-void
.end method

.method protected final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 670
    const v0, 0x7f0900e0

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method handleGroupCreate()V
    .locals 8
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e007a
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 446
    invoke-direct {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->ad()Z

    move-result v0

    if-nez v0, :cond_0

    .line 447
    const v0, 0x7f090115

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0901cf

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    :goto_0
    return-void

    .line 451
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 453
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->Y:Lcom/kik/android/a;

    const-string v1, "Group Create Attempt"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v6, "Name Length"

    if-nez v4, :cond_3

    const-wide/16 v0, 0x0

    :goto_1
    invoke-virtual {v5, v6, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Has Picture"

    iget-boolean v5, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ag:Z

    invoke-virtual {v0, v1, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    iget-object v5, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    int-to-long v6, v5

    invoke-virtual {v0, v1, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 458
    const v0, 0x7f090148

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(Ljava/lang/String;Z)V

    .line 462
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ae:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 463
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->U:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ae:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    .line 464
    if-eqz v0, :cond_4

    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x1

    :goto_2
    if-eqz v1, :cond_1

    move-object v0, v2

    .line 468
    :cond_1
    if-eqz v0, :cond_2

    .line 469
    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 473
    :cond_2
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 476
    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->V:Lkik/a/e/l;

    invoke-interface {v2, v4, v0, v1}, Lkik/a/e/l;->a(Ljava/lang/String;Lkik/a/d/k;Ljava/util/List;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/pw;

    invoke-direct {v2, p0, v4, v1, p0}, Lkik/android/chat/fragment/pw;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;Ljava/lang/String;Ljava/util/List;Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 453
    :cond_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    goto :goto_1

    :cond_4
    move v1, v3

    .line 464
    goto :goto_2

    :cond_5
    move-object v0, v2

    goto :goto_3
.end method

.method public final j_()V
    .locals 3

    .prologue
    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 291
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v1

    neg-int v1, v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    mul-int/2addr v0, v2

    add-int/2addr v0, v1

    .line 293
    neg-int v0, v0

    int-to-float v0, v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ak:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 294
    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->aj:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 295
    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->aj:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 296
    return-void
.end method

.method public final k_()V
    .locals 3

    .prologue
    .line 588
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_rootLayout:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 606
    :goto_0
    return-void

    .line 591
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_rootLayout:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f090337

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f09001f

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090193

    new-instance v2, Lkik/android/chat/fragment/px;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/px;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 603
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "build"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 605
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->Y:Lcom/kik/android/a;

    const-string v1, "Group Photo Change Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0
.end method

.method protected final l()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 678
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->b:Ljava/lang/String;

    iput-boolean v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->A:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->s:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 679
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Z)V

    .line 680
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->s:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 682
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    if-eqz v0, :cond_1

    .line 684
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v1

    const/16 v2, 0x71

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 686
    :cond_1
    return-void
.end method

.method protected final m()Z
    .locals 1

    .prologue
    .line 664
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->D:Lcom/kik/view/adapters/ContactsCursorAdapter;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .prologue
    const/16 v3, 0x285e

    const/4 v0, 0x1

    const/4 v6, 0x0

    const/4 v2, -0x1

    .line 364
    invoke-static {}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$b;->b()V

    .line 365
    if-eq p1, v3, :cond_0

    const/16 v1, 0x285f

    if-ne p1, v1, :cond_3

    :cond_0
    if-ne p2, v2, :cond_3

    .line 366
    if-ne p1, v3, :cond_2

    :goto_0
    sput-boolean v0, Lkik/android/chat/fragment/KikStartGroupFragment;->ab:Z

    .line 367
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v5, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->aa:Lkik/a/e/n;

    move-object v1, p0

    move v3, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lkik/android/util/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Context;ILandroid/content/Intent;Lkik/a/e/n;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 368
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    const/4 v0, -0x4

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->d(I)V

    .line 386
    :cond_1
    :goto_1
    iput-boolean v6, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->B:Z

    .line 387
    return-void

    :cond_2
    move v0, v6

    .line 366
    goto :goto_0

    .line 371
    :cond_3
    const/16 v0, 0x2860

    if-ne p1, v0, :cond_4

    if-ne p2, v2, :cond_4

    .line 374
    :try_start_0
    new-instance v0, Lkik/android/widget/p;

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/widget/p;-><init>(Landroid/graphics/Bitmap;)V

    .line 375
    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupContactView:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 376
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ag:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->g()V

    throw v0

    .line 384
    :cond_4
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 357
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikPickUsersFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 358
    invoke-direct {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->ae()V

    .line 359
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 271
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 283
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 273
    :pswitch_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 274
    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    .line 275
    if-eqz v0, :cond_0

    .line 277
    const-string v2, "suggest_intent_data_id"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 278
    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->U:Lkik/a/e/r;

    invoke-interface {v2, v0, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 279
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->e(Lkik/a/d/k;)V

    :cond_0
    move v0, v1

    .line 281
    goto :goto_0

    .line 271
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 122
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    .line 123
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikPickUsersFragment;->onCreate(Landroid/os/Bundle;)V

    .line 124
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->a(Landroid/os/Bundle;)V

    .line 125
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ae:Ljava/lang/String;

    .line 126
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

    const-string v1, "kik.android.chat.fragment.StartGroupFragment.PreselectedUsers"

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 127
    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 129
    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->U:Lkik/a/e/r;

    const/4 v3, 0x1

    invoke-interface {v2, v0, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 130
    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->f()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->af:Z

    .line 135
    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ai:Lkik/android/chat/fragment/KikStartGroupFragment$a;

    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string v0, "KikPickUsersFragment.EXTRA_PRESELECTED_USERS"

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    const/16 v0, 0x31

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->c(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    .line 136
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 248
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikPickUsersFragment;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 256
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    if-ne p2, v0, :cond_0

    .line 257
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->al:Lkik/a/d/k;

    .line 260
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->al:Lkik/a/d/k;

    if-eqz v0, :cond_1

    .line 263
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->al:Lkik/a/d/k;

    invoke-static {v0}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 264
    const v0, 0x7f0901f9

    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 266
    :cond_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 141
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikPickUsersFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 143
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 146
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment;->registerForContextMenu(Landroid/view/View;)V

    .line 148
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    const-string v2, "AUTOMATION_CREATE_GROUP_NAME"

    invoke-static {v0, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_createGroupButton:Landroid/widget/Button;

    const-string v2, "AUTOMATION_CREATE_GROUP"

    invoke-static {v0, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_numGroupMembersText:Landroid/widget/TextView;

    const-string v2, "AUTOMATION_GROUP_MEMBER_COUNT_LABEL"

    invoke-static {v0, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ad:Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ad:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 156
    :cond_0
    new-array v0, v3, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->searchButton:Landroid/view/ViewGroup;

    aput-object v2, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 157
    new-array v0, v5, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->createButton:Landroid/widget/Button;

    aput-object v2, v0, v4

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->groupHeader:Landroid/view/View;

    aput-object v2, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 159
    const v0, 0x7f0e006c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->aj:Landroid/view/View;

    .line 160
    const v0, 0x7f0e006e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ak:Landroid/view/View;

    .line 161
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    check-cast v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;

    invoke-virtual {v0, p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;->a(Lcom/github/ksoichiro/android/observablescrollview/k;)V

    .line 163
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    const v2, 0x7f030052

    iget-object v3, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 165
    const v0, 0x7f03002c

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->d:Landroid/widget/FrameLayout;

    .line 166
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 168
    const v0, 0x7f0e0075

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->m:Landroid/view/View;

    .line 170
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->s:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->s:Landroid/widget/EditText;

    iget-object v3, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->m:Landroid/view/View;

    invoke-direct {p0, v2, v3}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Landroid/widget/EditText;Landroid/view/View;)Landroid/view/View$OnFocusChangeListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 172
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    new-instance v2, Lkik/android/chat/fragment/pt;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/pt;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 195
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    iget-object v3, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->groupNameClearButton:Landroid/widget/ImageView;

    invoke-direct {p0, v2, v3}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Landroid/widget/EditText;Landroid/view/View;)Landroid/view/View$OnFocusChangeListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 197
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->s:Landroid/widget/EditText;

    new-instance v2, Lkik/android/chat/fragment/pu;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/pu;-><init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 215
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 216
    iget-boolean v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ag:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    .line 217
    new-instance v2, Lkik/android/widget/p;

    invoke-direct {v2, v0}, Lkik/android/widget/p;-><init>(Landroid/graphics/Bitmap;)V

    .line 218
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupContactView:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 221
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    invoke-virtual {p0, v0, v5}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Landroid/view/View;I)V

    .line 223
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    invoke-direct {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->ae()V

    .line 225
    return-object v1
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 350
    invoke-super {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->onDestroyView()V

    .line 351
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ad:Ljava/lang/String;

    .line 352
    return-void
.end method

.method public setGroupPicture()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e006f
        }
    .end annotation

    .prologue
    .line 392
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 393
    invoke-static {}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$b;->a()V

    .line 394
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lkik/android/util/p;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;Landroid/content/Context;)V

    .line 395
    return-void
.end method

.method public final v()Z
    .locals 4

    .prologue
    .line 425
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->h()V

    .line 426
    iget-object v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->_groupNameEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 428
    iget-object v1, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->Y:Lcom/kik/android/a;

    const-string v2, "Start a Group Cancelled"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Name Length"

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {v2, v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Has Picture"

    iget-boolean v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ag:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Participants Count"

    iget-object v2, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->ac:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 434
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikStartGroupFragment;->af:Z

    if-eqz v0, :cond_1

    .line 435
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikStartGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 440
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 428
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    .line 438
    :cond_1
    invoke-super {p0}, Lkik/android/chat/fragment/KikPickUsersFragment;->v()Z

    move-result v0

    goto :goto_1
.end method
