.class public Lkik/android/chat/fragment/KikChangeGroupNameFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;
    }
.end annotation


# instance fields
.field _confirmNameButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0018
    .end annotation
.end field

.field _groupNameField:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0011
    .end annotation
.end field

.field protected a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Lkik/a/d/n;

.field private e:Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 44
    new-instance v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->e:Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;

    .line 200
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->d:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->J()V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Lkik/android/chat/fragment/bt;

    invoke-direct {v0, p0, v1}, Lkik/android/chat/fragment/bt;-><init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;Ljava/lang/String;)V

    const v1, 0x7f090207

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a(Ljava/util/concurrent/Callable;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/bu;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/bu;-><init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)Lkik/a/d/n;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->d:Lkik/a/d/n;

    return-object v0
.end method


# virtual methods
.method protected final C()I
    .locals 1

    .prologue
    .line 185
    const/16 v0, 0x10

    return v0
.end method

.method protected final K()I
    .locals 1

    .prologue
    .line 197
    const v0, 0x7f0902c0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 53
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V

    .line 54
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 56
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->setResult(I)V

    .line 57
    iget-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->e:Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;->a(Landroid/os/Bundle;)V

    .line 58
    iget-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->e:Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment$a;->a()Ljava/lang/String;

    move-result-object v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b:Lkik/a/e/r;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 61
    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_0

    .line 62
    check-cast v0, Lkik/a/d/n;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->d:Lkik/a/d/n;

    .line 65
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 70
    const v0, 0x7f030004

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 72
    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 74
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    const-string v2, "AUTOMATION_GROUP_NAME_FIELD"

    invoke-static {v1, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 75
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_confirmNameButton:Landroid/view/View;

    const-string v2, "AUTOMATION_CONFIRM_NAME_BUTTON"

    invoke-static {v1, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 76
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    new-instance v2, Lkik/android/chat/fragment/br;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/br;-><init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 87
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_confirmNameButton:Landroid/view/View;

    new-instance v2, Lkik/android/chat/fragment/bs;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/bs;-><init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a(Landroid/view/View;I)V

    .line 97
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->d:Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 98
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->d:Lkik/a/d/n;

    invoke-virtual {v2}, Lkik/a/d/n;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 99
    iget-object v1, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->_groupNameField:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 102
    :cond_0
    return-object v0
.end method
