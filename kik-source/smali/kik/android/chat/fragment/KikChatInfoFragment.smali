.class public Lkik/android/chat/fragment/KikChatInfoFragment;
.super Lkik/android/chat/fragment/BaseChatInfoFragment;
.source "SourceFile"

# interfaces
.implements Lkik/android/e/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikChatInfoFragment$a;
    }
.end annotation


# static fields
.field private static X:Z

.field private static Y:Z


# instance fields
.field A:Lkik/android/scan/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final B:I

.field private final C:I

.field private D:Lkik/a/d/k;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:Ljava/lang/String;

.field private K:Lkik/android/chat/fragment/ProgressDialogFragment;

.field private L:I

.field private M:Lkik/a/d/aa;

.field private N:Lkik/a/d/f;

.field private O:Lkik/a/d/k;

.field private U:Lkik/android/chat/fragment/ProgressDialogFragment;

.field private V:Z

.field private W:Z

.field private Z:Lkik/android/util/ap;

.field _notInGroupTextView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0038
    .end annotation
.end field

.field _profilePicBig:Lcom/kik/cache/ContactImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e002f
    .end annotation
.end field

.field _verifiedStar:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0031
    .end annotation
.end field

.field private aa:Landroid/widget/ImageView;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/CheckBox;

.field private ae:Ljava/lang/String;

.field private final af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

.field private ag:Lkik/android/util/ao;

.field private ah:Landroid/os/Handler;

.field private ai:Lcom/kik/g/i;

.field private aj:Lcom/kik/g/i;

.field private ak:Lcom/kik/g/i;

.field private al:Lcom/kik/g/i;

.field protected q:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field r:Lkik/a/e/i;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field s:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field t:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field x:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field y:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field z:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 138
    sput-boolean v0, Lkik/android/chat/fragment/KikChatInfoFragment;->X:Z

    .line 139
    sput-boolean v0, Lkik/android/chat/fragment/KikChatInfoFragment;->Y:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;-><init>()V

    .line 117
    iput v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->B:I

    .line 118
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->C:I

    .line 121
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->E:Z

    .line 122
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->F:Z

    .line 123
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->G:Z

    .line 124
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->H:Z

    .line 125
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->I:Z

    .line 126
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->J:Ljava/lang/String;

    .line 128
    iput v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    .line 135
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->V:Z

    .line 136
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->W:Z

    .line 159
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 161
    new-instance v0, Lkik/android/chat/fragment/gi;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/gi;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ag:Lkik/android/util/ao;

    .line 222
    new-instance v0, Lkik/android/chat/fragment/gv;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/gv;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    .line 467
    new-instance v0, Lkik/android/chat/fragment/hw;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/hw;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ai:Lcom/kik/g/i;

    .line 480
    new-instance v0, Lkik/android/chat/fragment/hx;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/hx;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->aj:Lcom/kik/g/i;

    .line 524
    new-instance v0, Lkik/android/chat/fragment/ia;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ia;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ak:Lcom/kik/g/i;

    .line 532
    new-instance v0, Lkik/android/chat/fragment/ib;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ib;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->al:Lcom/kik/g/i;

    .line 1760
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 3

    .prologue
    .line 883
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v1, 0x7f0202d2

    const v2, 0x7f0202d4

    invoke-virtual {v0, v1, v2}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    .line 884
    new-instance v1, Lkik/android/chat/fragment/gp;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/fragment/gp;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Ljava/lang/String;)V

    .line 897
    invoke-virtual {p0, p1, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    .line 898
    invoke-static {v0, p3}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 899
    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->J:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/f;)Lkik/a/d/f;
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)Lkik/a/d/k;
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)Lkik/android/chat/fragment/ProgressDialogFragment;
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->K:Lkik/android/chat/fragment/ProgressDialogFragment;

    return-object p1
.end method

.method private a(Lkik/a/d/k;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 986
    if-nez p1, :cond_0

    .line 1023
    :goto_0
    return-void

    .line 990
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    if-nez v0, :cond_1

    .line 991
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    .line 994
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 997
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->p()J

    move-result-wide v0

    .line 998
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->aa:Landroid/widget/ImageView;

    const v3, 0x7f070025

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 999
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ad:Landroid/widget/CheckBox;

    invoke-virtual {v2, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1000
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ab:Landroid/widget/TextView;

    const v3, 0x7f0902d9

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 1001
    new-array v2, v5, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ac:Landroid/widget/TextView;

    aput-object v3, v2, v4

    invoke-static {v2}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1002
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_2

    .line 1003
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ac:Landroid/widget/TextView;

    const v1, 0x7f090166

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1013
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ab:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_TITLE_MUTED"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0

    .line 1006
    :cond_2
    invoke-static {}, Lkik/a/h/j;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 1007
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1008
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "h:mm a"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1009
    invoke-virtual {v0, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 1010
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ac:Landroid/widget/TextView;

    const v2, 0x7f090169

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1011
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ac:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AUTOMATION_MUTE_DETAIL_UNTIL_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_1

    .line 1016
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->aa:Landroid/widget/ImageView;

    const v1, 0x7f070024

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1017
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ad:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1018
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ab:Landroid/widget/TextView;

    const v1, 0x7f090019

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1019
    new-array v0, v5, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ac:Landroid/widget/TextView;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1020
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ab:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_ACTIVITY_CONVERSATIONS_MUTE_CHAT"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 89
    if-eqz p1, :cond_1

    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Ljava/lang/String;Z)V

    const-string v1, "KikPickUsersFragment.RESULT_SELECTED_USERS"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    array-length v1, v2

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v2

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v0, v2, v1

    check-cast v0, Lcom/kik/cards/util/UserDataParcelable;

    iget-object v0, v0, Lcom/kik/cards/util/UserDataParcelable;->a:Ljava/lang/String;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v5, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->n:Lkik/a/e/l;

    invoke-interface {v1, v0, v3}, Lkik/a/e/l;->a(Lkik/a/d/n;Ljava/util/List;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/gk;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/gk;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :cond_1
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;Lkik/a/d/f;)V
    .locals 6

    .prologue
    .line 89
    if-eqz p1, :cond_0

    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v2, 0x7f09016a

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    instance-of v0, p1, Lkik/a/d/n;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lkik/a/d/n;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-static {v0, v5}, Lkik/android/util/cq;->a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const v2, 0x7f090167

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f090168

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f090166

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    new-instance v2, Lkik/android/chat/fragment/hj;

    invoke-direct {v2, p0, p1, p2}, Lkik/android/chat/fragment/hj;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;Lkik/a/d/f;)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v1, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "dialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment;Z)Z
    .locals 0

    .prologue
    .line 89
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->W:Z

    return p1
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/a/d/k;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    new-instance v1, Lkik/android/chat/fragment/he;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/he;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)Lkik/a/d/k;
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    return-object p1
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/android/chat/fragment/ProgressDialogFragment;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->K:Lkik/android/chat/fragment/ProgressDialogFragment;

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    new-instance v1, Lkik/android/chat/fragment/hd;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/hd;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private c(Z)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 1654
    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v0, 0x7f090148

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v5}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 1655
    new-instance v2, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    const v0, 0x7f090294

    :goto_0
    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    invoke-static {v4}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v0, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v2

    if-eqz p1, :cond_1

    const v0, 0x7f090032

    :goto_1
    new-array v3, v5, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    invoke-static {v4}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v0, v3}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v2

    if-eqz p1, :cond_2

    const v0, 0x7f090293

    :goto_2
    new-instance v3, Lkik/android/chat/fragment/hn;

    invoke-direct {v3, p0, v1, p1}, Lkik/android/chat/fragment/hn;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;Z)V

    invoke-virtual {v2, v0, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090299

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 1727
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "build"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 1728
    return-void

    .line 1655
    :cond_0
    const v0, 0x7f0902fa

    goto :goto_0

    :cond_1
    const v0, 0x7f090036

    goto :goto_1

    :cond_2
    const v0, 0x7f0902f9

    goto :goto_2
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->f()V

    return-void
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikChatInfoFragment;)I
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x5

    iput v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    return v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 503
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    new-instance v1, Lkik/android/chat/fragment/hz;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/hz;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 522
    :cond_0
    return-void
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikChatInfoFragment;)Z
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->H:Z

    return v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikChatInfoFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ah:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 1204
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->I:Z

    if-eqz v0, :cond_0

    .line 1205
    new-instance v0, Lkik/android/chat/fragment/MissedConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/MissedConversationsFragment$a;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 1210
    :goto_0
    return-void

    .line 1208
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method private h()Z
    .locals 2

    .prologue
    .line 1400
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->M:Lkik/a/d/aa;

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikChatInfoFragment;)Z
    .locals 1

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/a/d/f;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    return-object v0
.end method

.method private i()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 1571
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1572
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lkik/android/chat/fragment/KikChatInfoFragment;->Y:Z

    .line 1574
    :cond_0
    new-instance v0, Lkik/android/util/p$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->y:Lkik/a/f/k;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->z:Lkik/a/e/n;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->t:Lkik/a/e/w;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->x:Lkik/a/e/v;

    invoke-direct/range {v0 .. v5}, Lkik/android/util/p$a;-><init>(Ljava/lang/String;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;)V

    .line 1575
    new-array v1, v6, [Lkik/android/e/d;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 1576
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1577
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    .line 1580
    :cond_1
    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v2, 0x7f090207

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v6}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 1581
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v2, Lkik/android/chat/fragment/hk;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/hk;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/util/p$a;)V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1588
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 1589
    return-void
.end method

.method private j()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1732
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_notInGroupTextView:Landroid/widget/TextView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1733
    const/16 v0, 0xb

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    aput-object v1, v0, v3

    const/4 v1, 0x2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->m:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_verifiedStar:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->e:Landroid/widget/LinearLayout;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->g:Landroid/view/ViewGroup;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->i:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->j:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->k:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1734
    return-void
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 4

    .prologue
    .line 89
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-interface {v1, v2}, Lkik/a/e/r;->b(Lkik/a/d/j;)Lcom/kik/g/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/g/p;->g()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getView()Landroid/view/View;

    move-result-object v2

    new-instance v3, Lkik/android/chat/fragment/hf;

    invoke-direct {v3, p0, v0}, Lkik/android/chat/fragment/hf;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-static {v2, v3}, Lcom/kik/sdkutils/d;->a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method private k()V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1738
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_notInGroupTextView:Landroid/widget/TextView;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1739
    const/16 v0, 0x8

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    aput-object v4, v0, v1

    const/4 v1, 0x3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->e:Landroid/widget/LinearLayout;

    aput-object v4, v0, v1

    const/4 v1, 0x4

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    aput-object v4, v0, v1

    const/4 v1, 0x5

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->g:Landroid/view/ViewGroup;

    aput-object v4, v0, v1

    const/4 v1, 0x6

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->i:Landroid/widget/TextView;

    aput-object v4, v0, v1

    const/4 v1, 0x7

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->j:Landroid/widget/TextView;

    aput-object v4, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1740
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_0

    move v1, v2

    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    :goto_1
    if-nez v1, :cond_2

    if-nez v4, :cond_2

    if-nez v0, :cond_2

    move v0, v2

    :goto_2
    if-nez v0, :cond_3

    .line 1741
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->m:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1746
    :goto_3
    return-void

    :cond_0
    move v1, v3

    .line 1740
    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v3

    goto :goto_2

    .line 1744
    :cond_3
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->m:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_3
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->j()V

    return-void
.end method

.method static synthetic l(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->k()V

    return-void
.end method

.method static synthetic m(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 5

    .prologue
    .line 89
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->n:Lkik/a/e/l;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lkik/android/chat/fragment/gn;

    invoke-direct {v4, p0, v0}, Lkik/android/chat/fragment/gn;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-interface {v1, v2, v3, v4}, Lkik/a/e/l;->a(Ljava/lang/String;Ljava/lang/String;Lcom/kik/g/r;)V

    return-void
.end method

.method static synthetic n(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 10

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 89
    new-instance v9, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v0, 0x7f090148

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0, v7}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v9, v8}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    invoke-virtual {v9}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->q:Lkik/android/util/ck;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0, v1}, Lkik/android/util/ck;->a(Lkik/a/d/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lkik/android/util/ck$b;->values()[Lkik/android/util/ck$b;

    move-result-object v1

    array-length v2, v1

    move v0, v8

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->q:Lkik/android/util/ck;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v4, v5, v3}, Lkik/android/util/ck;->a(Lkik/a/d/k;Lkik/android/util/ck$b;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    iget-object v1, v3, Lkik/android/util/ck$b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Bots"

    new-array v2, v7, [Ljava/lang/String;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v8

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "explicit-username-search"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "inline-username-search"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkik/a/f/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkik/a/d/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J[B)Lkik/a/d/s;

    move-result-object v0

    new-instance v1, Lkik/a/d/a/d;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090373

    invoke-virtual {p0, v4}, Lkik/android/chat/fragment/KikChatInfoFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-static {v6}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    move v4, v8

    invoke-direct/range {v1 .. v7}, Lkik/a/d/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    invoke-virtual {v0, v1}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-interface {v2, v0}, Lkik/a/e/i;->c(Lkik/a/d/s;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-interface {v0, v2}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v0, v1}, Lkik/a/e/r;->a(Lkik/a/d/a/d;)Lcom/kik/g/p;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Lcom/kik/g/p;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v9}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    :cond_2
    new-instance v1, Lkik/android/chat/fragment/hc;

    invoke-direct {v1, p0, v9}, Lkik/android/chat/fragment/hc;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :cond_3
    return-void

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1
.end method

.method static synthetic o(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 3

    .prologue
    .line 89
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->E:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "chatContactJID"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "sessionId"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ae:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->J()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ae:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method static synthetic p(Lkik/android/chat/fragment/KikChatInfoFragment;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    return-object v0
.end method

.method static synthetic q(Lkik/android/chat/fragment/KikChatInfoFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ae:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->d(Lkik/a/d/j;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/hg;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/hg;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method static synthetic s(Lkik/android/chat/fragment/KikChatInfoFragment;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ad:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic t(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 2

    .prologue
    .line 89
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lkik/android/util/p;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;Landroid/content/Context;)V

    return-void
.end method

.method static synthetic u(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 3

    .prologue
    .line 89
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f0902ad

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f090033

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f0902a9

    new-instance v2, Lkik/android/chat/fragment/hi;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/hi;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f090299

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "dialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic v(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 3

    .prologue
    .line 89
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f0902cd

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f090034

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f0902cc

    new-instance v2, Lkik/android/chat/fragment/hh;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/hh;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f090299

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "dialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 3

    .prologue
    .line 89
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Z)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v1

    sget-object v2, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->d:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Lkik/android/chat/fragment/ScanCodeTabFragment$c;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    return-void
.end method

.method static synthetic x(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->g()V

    return-void
.end method

.method static synthetic y(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 3

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    const v1, 0x7f09036a

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Ljava/lang/String;Z)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->n:Lkik/a/e/l;

    invoke-interface {v1, v0}, Lkik/a/e/l;->a(Lkik/a/d/n;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/hb;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/hb;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :cond_0
    return-void
.end method

.method static synthetic z(Lkik/android/chat/fragment/KikChatInfoFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->i()V

    return-void
.end method


# virtual methods
.method protected final a()Landroid/view/View$OnClickListener;
    .locals 1

    .prologue
    .line 273
    new-instance v0, Lkik/android/chat/fragment/hq;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/hq;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 1627
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->V:Z

    if-eqz v0, :cond_0

    .line 1628
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    .line 1631
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_1

    .line 1632
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->x:Lkik/a/e/v;

    invoke-static {p1}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v2

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-interface {v1, v2, v0}, Lkik/a/e/v;->a([BLkik/a/d/n;)V

    .line 1633
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->f()V

    .line 1636
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    .line 1638
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Group Photo Changed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Was Empty"

    sget-boolean v2, Lkik/android/chat/fragment/KikChatInfoFragment;->Y:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "From Camera"

    sget-boolean v2, Lkik/android/chat/fragment/KikChatInfoFragment;->X:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Width"

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1640
    return-void
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 460
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->b()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->aj:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 461
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ai:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 462
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->n:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ai:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 463
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ak:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 464
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->d()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->al:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 465
    return-void
.end method

.method protected final b()V
    .locals 9

    .prologue
    const/4 v5, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 674
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    if-nez v0, :cond_0

    .line 746
    :goto_0
    return-void

    .line 677
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 678
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/android/chat/fragment/KikChatInfoFragment$a;)I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->h()I

    move-result v1

    sget v4, Lcom/kik/ui/fragment/FragmentBase$a$a;->c:I

    if-ne v1, v4, :cond_1

    if-ne v0, v2, :cond_1

    move v0, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 680
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Z)V

    goto :goto_0

    :cond_1
    move v0, v3

    .line 678
    goto :goto_1

    .line 684
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 685
    const v0, 0x7f090319

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/gr;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/gr;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v5, 0x7f020022

    const v6, 0x7f020023

    invoke-virtual {v4, v5, v6}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v4

    invoke-virtual {p0, v0, v4, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v1, "AUTOMATION_UNBLOCK"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 686
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->m:Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 745
    :cond_3
    :goto_2
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Z)V

    goto :goto_0

    .line 688
    :cond_4
    iget v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    iget v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    if-ne v0, v5, :cond_6

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->H:Z

    if-eqz v0, :cond_6

    .line 689
    :cond_5
    const v0, 0x7f0901d3

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Chat Info Send To Tapped"

    const-string v2, "AUTOMATION_SEND_TO"

    invoke-direct {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    goto :goto_2

    .line 691
    :cond_6
    iget v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    if-ne v0, v5, :cond_8

    .line 692
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->G:Z

    if-nez v0, :cond_7

    .line 693
    const v0, 0x7f090227

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v2, 0x7f020256

    const v4, 0x7f020257

    invoke-virtual {v1, v2, v4}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/gq;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/gq;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AUTOMATION_SELECT_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    goto :goto_2

    .line 696
    :cond_7
    const v0, 0x7f0901d2

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-static {v4}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v0, v1}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v8, v8}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0e00c3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-array v2, v2, [Landroid/view/View;

    aput-object v0, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "AUTOMATION_CANNOT_SELECT_"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    goto/16 :goto_2

    .line 700
    :cond_8
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->M:Lkik/a/d/aa;

    iget-object v4, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 701
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->J:Ljava/lang/String;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->J:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    move v1, v2

    .line 702
    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 703
    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v6}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v1, v2

    .line 709
    :cond_a
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 710
    const v0, 0x7f090247

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v6, 0x7f0201b1

    const v7, 0x7f0201b2

    invoke-virtual {v5, v6, v7}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v5

    new-instance v6, Lkik/android/chat/fragment/ha;

    invoke-direct {v6, p0}, Lkik/android/chat/fragment/ha;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v0, v5, v6}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v5, "AUTOMATION_SHOW_KIK_CODE"

    invoke-static {v0, v5}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 712
    :cond_b
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->A()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 713
    const v0, 0x7f090116

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v6, 0x7f020137

    const v7, 0x7f020138

    invoke-virtual {v5, v6, v7}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v5

    new-instance v6, Lkik/android/chat/fragment/gt;

    invoke-direct {v6, p0}, Lkik/android/chat/fragment/gt;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v0, v5, v6}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v5, "AUTOMATION_CHANGE_GROUP_NAME"

    invoke-static {v0, v5}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 714
    const v0, 0x7f090117

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v6, 0x7f02025f

    const v7, 0x7f020260

    invoke-virtual {v5, v6, v7}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v5

    new-instance v6, Lkik/android/chat/fragment/gu;

    invoke-direct {v6, p0}, Lkik/android/chat/fragment/gu;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v0, v5, v6}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v5, "AUTOMATION_CHANGE_GROUP_PHOTO"

    invoke-static {v0, v5}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 717
    :cond_c
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->J:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 718
    const v0, 0x7f09019c

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    const-string v5, "Chat Info Open Chat Tapped"

    const-string v6, "AUTOMATION_OPEN_CHAT"

    invoke-direct {p0, v0, v5, v6}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 720
    :cond_d
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 721
    :cond_e
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->a:Landroid/view/LayoutInflater;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    const v6, 0x7f030082

    invoke-virtual {v0, v6, v8, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    const v0, 0x7f0e0194

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->aa:Landroid/widget/ImageView;

    const v0, 0x7f0e0195

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ab:Landroid/widget/TextView;

    const v0, 0x7f0e0196

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ac:Landroid/widget/TextView;

    const v0, 0x7f0e0197

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ad:Landroid/widget/CheckBox;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ad:Landroid/widget/CheckBox;

    const-string v7, "AUTOMATION_TOGGLE_MUTE"

    invoke-static {v0, v7}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    const v0, 0x7f0e0193

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v7, Lkik/android/chat/fragment/gs;

    invoke-direct {v7, p0, v5}, Lkik/android/chat/fragment/gs;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)V

    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, v6}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 722
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/a/d/k;)V

    .line 725
    :cond_f
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    const-string v5, "popbottest_ns2@talk.kik.com"

    invoke-interface {v0, v5}, Lkik/a/e/r;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 726
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    const-string v5, "View Wall"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v7, 0x7f0202f2

    const v8, 0x7f0202f3

    invoke-virtual {v6, v7, v8}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v6

    new-instance v7, Lkik/android/chat/fragment/gw;

    invoke-direct {v7, p0, v0}, Lkik/android/chat/fragment/gw;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;Lkik/a/d/k;)V

    invoke-virtual {p0, v5, v6, v7}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 729
    :cond_10
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->F:Z

    if-nez v0, :cond_11

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 730
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    const v4, 0x7f090270

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static {v4, v2}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v5, 0x7f020061

    const v6, 0x7f020063

    invoke-virtual {v4, v5, v6}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v4

    new-instance v5, Lkik/android/chat/fragment/gx;

    invoke-direct {v5, p0}, Lkik/android/chat/fragment/gx;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v2, v4, v5}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AUTOMATION_START_A_GROUP_WITH_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 733
    :cond_11
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_12

    if-eqz v1, :cond_12

    .line 734
    const v0, 0x7f0902ad

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v2, 0x7f0200b4

    const v4, 0x7f0200b6

    invoke-virtual {v1, v2, v4}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/gy;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/gy;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v1, "AUTOMATION_DELETE_CHAT"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 737
    :cond_12
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 738
    const v0, 0x7f09014b

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->c:Lkik/android/util/cp;

    const v2, 0x7f0201bc

    const v4, 0x7f0201bd

    invoke-virtual {v1, v2, v4}, Lkik/android/util/cp;->a(II)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/gz;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/gz;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Landroid/view/View;

    move-result-object v0

    const-string v1, "AUTOMATION_LEAVE_GROUP"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    .line 741
    :cond_13
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-nez v0, :cond_3

    .line 742
    const v0, 0x7f0900f6

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Chat Info Start Chatting Tapped"

    const-string v2, "AUTOMATION_START_CHATTING"

    invoke-direct {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Landroid/view/View;)V

    goto/16 :goto_2

    :cond_14
    move v1, v3

    .line 701
    goto/16 :goto_3
.end method

.method protected final b(Z)V
    .locals 8

    .prologue
    .line 751
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 752
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    .line 753
    :goto_0
    if-eqz v0, :cond_1

    .line 754
    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    .line 755
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 756
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    const/4 v4, 0x1

    invoke-interface {v2, v0, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 752
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 759
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v4

    .line 760
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->Z:Lkik/android/util/ap;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ag:Lkik/android/util/ao;

    iget-object v7, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    move v1, p1

    invoke-virtual/range {v0 .. v7}, Lkik/android/util/ap;->a(ZLkik/a/d/k;Ljava/util/List;ZLandroid/widget/ListView;Lkik/android/util/ao;Lcom/kik/android/a;)V

    .line 761
    return-void
.end method

.method protected final c()V
    .locals 14

    .prologue
    const v13, 0x7f090202

    const/16 v12, 0x32

    const/4 v7, 0x0

    const/4 v3, 0x1

    .line 1225
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    if-nez v0, :cond_0

    .line 1269
    :goto_0
    return-void

    .line 1228
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    if-nez v0, :cond_2

    .line 1229
    :cond_1
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_verifiedStar:Landroid/widget/ImageView;

    aput-object v1, v0, v7

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1232
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1233
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    .line 1234
    invoke-virtual {v0}, Lkik/a/d/n;->E()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    .line 1236
    if-le v2, v12, :cond_6

    move v1, v2

    .line 1238
    :goto_3
    if-ne v2, v3, :cond_7

    .line 1239
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->k:Landroid/widget/TextView;

    const v2, 0x7f090194

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v2, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1245
    :goto_4
    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->k:Landroid/widget/TextView;

    aput-object v2, v1, v7

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1247
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->j:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1248
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-static {v0, v1}, Lkik/android/util/cq;->a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v0

    .line 1267
    :goto_5
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1268
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->i:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AUTOMATION_PROFILE_PHOTO_DISPLAY_NAME_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1228
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/kik/cache/ContactImageView;->b(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v2}, Lcom/kik/cache/ContactImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0c0011

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/kik/cache/ContactImageView;->setBackgroundColor(I)V

    :goto_6
    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->d:Lcom/kik/cache/SoftwareContactImageView;

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->p:Lcom/kik/cache/ad;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v9, v3

    :goto_7
    iget-object v10, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v11, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    move-object v5, v1

    move v8, v3

    invoke-virtual/range {v4 .. v11}, Lcom/kik/cache/SoftwareContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZZZLkik/a/e/r;Lcom/kik/android/a;)V

    goto/16 :goto_1

    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_profilePicBig:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->p:Lcom/kik/cache/ad;

    iget-object v8, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    iget-object v9, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    move v4, v3

    move v5, v3

    move v6, v3

    invoke-virtual/range {v0 .. v9}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZIZZZLkik/a/e/r;Lcom/kik/android/a;)V

    goto :goto_6

    :cond_4
    move v9, v7

    goto :goto_7

    .line 1229
    :cond_5
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_verifiedStar:Landroid/widget/ImageView;

    aput-object v1, v0, v7

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto/16 :goto_2

    :cond_6
    move v1, v12

    .line 1236
    goto/16 :goto_3

    .line 1242
    :cond_7
    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->k:Landroid/widget/TextView;

    const v5, 0x7f09011e

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v3

    invoke-static {v5, v6}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 1251
    :cond_8
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->k:Landroid/widget/TextView;

    aput-object v1, v0, v7

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1253
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    .line 1254
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 1255
    invoke-static {v13}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 1258
    :cond_9
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v1

    .line 1259
    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 1260
    invoke-static {v13}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    .line 1262
    :cond_a
    new-array v2, v3, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->j:Landroid/widget/TextView;

    aput-object v3, v2, v7

    invoke-static {v2}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1263
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->j:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1264
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->j:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "AUTOMATION_PROFILE_PHOTO_USERNAME_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_5
.end method

.method public final d()V
    .locals 7

    .prologue
    const/4 v2, 0x1

    .line 542
    new-instance v3, Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-direct {v3}, Lkik/android/chat/fragment/KikPickUsersFragment$a;-><init>()V

    .line 545
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 546
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    .line 547
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lkik/a/d/n;->E()I

    move-result v1

    invoke-virtual {v0}, Lkik/a/d/n;->D()I

    move-result v5

    add-int/2addr v1, v5

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 548
    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 549
    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v6, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 551
    :cond_0
    invoke-virtual {v0}, Lkik/a/d/n;->y()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 552
    iget-object v6, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v6, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 554
    :cond_1
    invoke-virtual {v3, v4}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    .line 555
    invoke-virtual {v0}, Lkik/a/d/n;->E()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 562
    :goto_2
    rsub-int/lit8 v0, v0, 0x32

    invoke-virtual {v3, v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->c(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    .line 564
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/gj;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/gj;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 571
    return-void

    .line 558
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 559
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    invoke-virtual {v3, v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->a(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    move v0, v2

    goto :goto_2
.end method

.method public final k_()V
    .locals 3

    .prologue
    .line 1595
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->V:Z

    if-eqz v0, :cond_0

    .line 1596
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->U:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    .line 1598
    :cond_0
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1599
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->f:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f0901d0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090300

    new-instance v2, Lkik/android/chat/fragment/hm;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/hm;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090299

    new-instance v2, Lkik/android/chat/fragment/hl;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/hl;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 1613
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "build"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 1615
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Group Photo Change Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1616
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .prologue
    const/16 v2, 0x285e

    const/4 v1, -0x1

    .line 1549
    if-eq p1, v2, :cond_0

    const/16 v0, 0x285f

    if-ne p1, v0, :cond_3

    :cond_0
    if-ne p2, v1, :cond_3

    .line 1550
    if-ne p1, v2, :cond_2

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lkik/android/chat/fragment/KikChatInfoFragment;->X:Z

    .line 1551
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->z:Lkik/a/e/n;

    move-object v1, p0

    move v3, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lkik/android/util/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Context;ILandroid/content/Intent;Lkik/a/e/n;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1552
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    const/4 v0, -0x4

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->d(I)V

    .line 1567
    :cond_1
    :goto_1
    return-void

    .line 1550
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 1555
    :cond_3
    const/16 v0, 0x2860

    if-ne p1, v0, :cond_4

    if-ne p2, v1, :cond_4

    .line 1557
    :try_start_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1560
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

    .line 1565
    :cond_4
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_1
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 794
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 834
    :goto_0
    return v0

    .line 796
    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    .line 797
    if-nez v0, :cond_0

    iget-boolean v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->W:Z

    if-eqz v3, :cond_0

    .line 798
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->x:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 799
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 800
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v3, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 802
    :cond_0
    new-instance v2, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move v0, v1

    .line 803
    goto :goto_0

    .line 805
    :pswitch_1
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v0, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 806
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    invoke-static {v3}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v3

    .line 807
    const v4, 0x7f0902f5

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v3, v5, v1

    invoke-static {v4, v5}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 808
    const v4, 0x7f090035

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v3, v5, v1

    invoke-static {v4, v5}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 809
    const v1, 0x7f0902f4

    new-instance v3, Lkik/android/chat/fragment/gl;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/gl;-><init>(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    invoke-virtual {v0, v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 822
    const v1, 0x7f090299

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 823
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    .line 824
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    move v0, v2

    .line 825
    goto :goto_0

    .line 827
    :pswitch_2
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Z)V

    move v0, v2

    .line 828
    goto :goto_0

    .line 831
    :pswitch_3
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment;->c(Z)V

    move v0, v2

    .line 832
    goto :goto_0

    .line 794
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 408
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    .line 409
    invoke-super {p0, p1}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onCreate(Landroid/os/Bundle;)V

    .line 410
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->af:Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Landroid/os/Bundle;)V

    .line 411
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Chat Info Shown"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 414
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentActivity;->setResult(I)V

    .line 416
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 419
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->t:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->M:Lkik/a/d/aa;

    .line 421
    const/4 v0, 0x0

    .line 422
    if-eqz p1, :cond_0

    .line 423
    const-string v0, "kik.prof.extra.jid"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 426
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 427
    if-nez v0, :cond_1

    .line 428
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "kik.prof.extra.jid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 431
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "sessionId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->ae:Ljava/lang/String;

    .line 432
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "kik.prof.extra.actiontype"

    invoke-virtual {v1, v2, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    .line 433
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "kik.prof.extra.finishpromise"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->E:Z

    .line 434
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "fromConversationId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->J:Ljava/lang/String;

    .line 435
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "groupExtraRestrictAdd"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->F:Z

    .line 436
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "isFiltered"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->G:Z

    .line 437
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "returnToMissedConvos"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->I:Z

    .line 438
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "showSelectAsSendTo"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->H:Z

    .line 441
    :cond_2
    new-instance v1, Lkik/android/util/ap;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->p:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->t:Lkik/a/e/w;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-direct {v1, v2, v3, v4, v5}, Lkik/android/util/ap;-><init>(Landroid/content/Context;Lcom/kik/cache/ad;Lkik/a/e/w;Lkik/a/e/r;)V

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->Z:Lkik/android/util/ap;

    .line 443
    if-eqz v0, :cond_4

    .line 444
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->s:Lkik/a/e/r;

    invoke-interface {v1, v0, v6}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    .line 445
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    invoke-interface {v1, v0}, Lkik/a/e/i;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    .line 452
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->r:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->N:Lkik/a/d/f;

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 453
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->g()V

    .line 455
    :cond_3
    return-void

    .line 448
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "KikProfileActivity: No jid provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 766
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 767
    const-string v0, ""

    .line 768
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    if-eqz v3, :cond_2

    .line 769
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    invoke-static {v0}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    .line 774
    :cond_0
    :goto_0
    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 775
    const v0, 0x7f09035f

    invoke-interface {p1, v2, v2, v2, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 778
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->A()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 780
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->W:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->O:Lkik/a/d/k;

    invoke-virtual {v0, v3}, Lkik/a/d/n;->d(Lkik/a/d/k;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    .line 784
    :goto_1
    if-eqz v0, :cond_1

    .line 785
    const v0, 0x7f0901d7

    invoke-interface {p1, v2, v1, v2, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 786
    const/4 v0, 0x2

    const v1, 0x7f0901f9

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 787
    const/4 v0, 0x3

    const v1, 0x7f09004c

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 789
    :cond_1
    return-void

    .line 771
    :cond_2
    iget-boolean v3, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->W:Z

    if-eqz v3, :cond_0

    .line 772
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->M:Lkik/a/d/aa;

    iget-object v0, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    goto :goto_0

    :cond_3
    move v0, v2

    .line 780
    goto :goto_1

    :cond_4
    move v0, v2

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 660
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 662
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 663
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->j()V

    .line 668
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->_notInGroupTextView:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_YOU_ARE_NOT_A_MEMBER_LABEL"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 669
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->b:Landroid/view/View;

    return-object v0

    .line 666
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->k()V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 402
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->V:Z

    .line 403
    invoke-super {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onPause()V

    .line 404
    return-void
.end method

.method protected onPictureClick()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e0030
        }
    .end annotation

    .prologue
    .line 215
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    new-instance v0, Lkik/android/chat/fragment/ViewPictureFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;-><init>()V

    .line 217
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->D:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ViewPictureFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->d()Lkik/android/chat/fragment/ViewPictureFragment$a;

    .line 218
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 220
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 394
    invoke-super {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->onResume()V

    .line 395
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->V:Z

    .line 396
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->f()V

    .line 397
    return-void
.end method

.method public final v()Z
    .locals 2

    .prologue
    .line 1450
    iget v0, p0, Lkik/android/chat/fragment/KikChatInfoFragment;->L:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1451
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatInfoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 1452
    const/4 v0, 0x1

    .line 1454
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lkik/android/chat/fragment/BaseChatInfoFragment;->v()Z

    move-result v0

    goto :goto_0
.end method
