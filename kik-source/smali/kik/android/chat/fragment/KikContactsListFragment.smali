.class public abstract Lkik/android/chat/fragment/KikContactsListFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikContactsListFragment$a;
    }
.end annotation


# instance fields
.field protected A:Z

.field protected B:Z

.field protected C:Ljava/util/LinkedHashSet;

.field protected D:Lcom/kik/view/adapters/ContactsCursorAdapter;

.field protected E:Ljava/util/Map;

.field protected F:Lkik/android/chat/fragment/KikContactsListFragment$a;

.field protected G:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected H:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected I:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected J:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected K:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private L:Ljava/lang/String;

.field private M:Ljava/lang/String;

.field private N:Z

.field private O:Lcom/kik/g/f;

.field private U:J

.field private V:Z

.field private W:Ljava/lang/String;

.field private X:Z

.field private Y:Lcom/kik/view/adapters/k;

.field private Z:Lcom/kik/view/adapters/ContactsCursorAdapter;

.field private a:Ljava/lang/String;

.field private aa:Lcom/kik/view/adapters/a;

.field private ab:Lcom/kik/view/adapters/bd;

.field private ac:Ljava/lang/String;

.field private ad:Ljava/lang/String;

.field private ae:Ljava/lang/String;

.field private af:Lcom/kik/g/r;

.field private ag:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;

.field private ah:Lcom/kik/g/i;

.field private ai:Lcom/kik/g/i;

.field private aj:Lcom/kik/g/i;

.field protected b:Ljava/lang/String;

.field protected c:Landroid/widget/ListView;

.field protected d:Landroid/widget/FrameLayout;

.field protected e:Landroid/widget/LinearLayout;

.field protected f:Landroid/net/Uri;

.field protected g:Landroid/view/View;

.field protected h:Landroid/view/View;

.field protected i:Landroid/view/View;

.field protected j:Landroid/view/View;

.field protected k:Landroid/view/View;

.field protected l:Landroid/view/View;

.field protected m:Landroid/view/View;

.field protected n:Landroid/widget/TextView;

.field protected o:Landroid/graphics/drawable/AnimationDrawable;

.field protected p:Landroid/widget/TextView;

.field protected q:Landroid/widget/TextView;

.field protected r:Landroid/widget/TextView;

.field protected s:Landroid/widget/EditText;

.field protected t:Landroid/widget/LinearLayout;

.field protected x:Lkik/android/sdkutils/concurrent/c;

.field protected y:Lkik/android/sdkutils/concurrent/d;

.field protected z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 72
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 76
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    .line 80
    sget-object v0, Lkik/android/KikDataProvider;->a:Landroid/net/Uri;

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->f:Landroid/net/Uri;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->z:Ljava/util/ArrayList;

    .line 100
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->a:Ljava/lang/String;

    .line 103
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->N:Z

    .line 104
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->O:Lcom/kik/g/f;

    .line 106
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->V:Z

    .line 107
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->A:Z

    .line 108
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->B:Z

    .line 110
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->W:Ljava/lang/String;

    .line 111
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->X:Z

    .line 112
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->C:Ljava/util/LinkedHashSet;

    .line 122
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->E:Ljava/util/Map;

    .line 127
    new-instance v0, Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikContactsListFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    .line 252
    new-instance v0, Lkik/android/chat/fragment/jf;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/jf;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->af:Lcom/kik/g/r;

    .line 380
    new-instance v0, Lkik/android/chat/fragment/jg;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/jg;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ag:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;

    .line 690
    new-instance v0, Lkik/android/chat/fragment/ji;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ji;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ah:Lcom/kik/g/i;

    .line 709
    new-instance v0, Lkik/android/chat/fragment/jk;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/jk;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ai:Lcom/kik/g/i;

    .line 740
    new-instance v0, Lkik/android/chat/fragment/jl;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/jl;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->aj:Lcom/kik/g/i;

    .line 920
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/ContactsCursorAdapter;)Lcom/kik/view/adapters/ContactsCursorAdapter;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->Z:Lcom/kik/view/adapters/ContactsCursorAdapter;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/a;)Lcom/kik/view/adapters/a;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->aa:Lcom/kik/view/adapters/a;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikContactsListFragment;Lcom/kik/view/adapters/bd;)Lcom/kik/view/adapters/bd;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ab:Lcom/kik/view/adapters/bd;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikContactsListFragment;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->d()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikContactsListFragment;Ljava/lang/String;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 72
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->x:Lcom/kik/d/b/a$k;

    const-string v3, "s"

    const-wide/16 v4, 0x0

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/lang/String;JJ)V

    const v0, 0x7f0901ee

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->z:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v9, p0, Lkik/android/chat/fragment/KikContactsListFragment;->X:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->c()V

    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->n:Landroid/widget/TextView;

    aput-object v1, v0, v8

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->g:Landroid/view/View;

    aput-object v1, v0, v9

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    new-array v0, v9, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->j:Landroid/view/View;

    aput-object v1, v0, v8

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->z()V

    :goto_0
    return-void

    :cond_0
    iput-boolean v8, p0, Lkik/android/chat/fragment/KikContactsListFragment;->X:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->g:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    :cond_1
    iput-boolean v9, p0, Lkik/android/chat/fragment/KikContactsListFragment;->V:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->c()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0, p1}, Lkik/android/sdkutils/concurrent/c;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->b()Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->af:Lcom/kik/g/r;

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    :cond_2
    iput-boolean v9, p0, Lkik/android/chat/fragment/KikContactsListFragment;->X:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->c()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->i:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->z()V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikContactsListFragment;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->V:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikContactsListFragment;)Z
    .locals 1

    .prologue
    .line 72
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->X:Z

    return v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->M:Ljava/lang/String;

    return-object v0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 816
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->m()Lcom/kik/g/l;

    move-result-object v0

    iget-wide v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->U:J

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/l;->a(J)I

    move-result v0

    .line 817
    if-eqz v0, :cond_1

    sget v1, Lcom/kik/g/p$a;->d:I

    if-eq v0, v1, :cond_0

    sget v1, Lcom/kik/g/p$a;->c:I

    if-ne v0, v1, :cond_1

    .line 818
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->J()V

    .line 820
    :cond_1
    return-void
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ae:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->L:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/a;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->aa:Lcom/kik/view/adapters/a;

    return-object v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/k;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->Y:Lcom/kik/view/adapters/k;

    return-object v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/bd;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ab:Lcom/kik/view/adapters/bd;

    return-object v0
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikContactsListFragment;)Z
    .locals 1

    .prologue
    .line 72
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->N:Z

    return v0
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikContactsListFragment;)Lcom/kik/view/adapters/ContactsCursorAdapter;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->Z:Lcom/kik/view/adapters/ContactsCursorAdapter;

    return-object v0
.end method

.method static synthetic l(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ac:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lkik/android/chat/fragment/KikContactsListFragment;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->X:Z

    return v0
.end method

.method static synthetic o(Lkik/android/chat/fragment/KikContactsListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ad:Ljava/lang/String;

    return-object v0
.end method

.method protected static q()I
    .locals 1

    .prologue
    .line 157
    const v0, 0x7f020161

    return v0
.end method

.method protected static r()I
    .locals 1

    .prologue
    .line 161
    const v0, 0x7f020163

    return v0
.end method


# virtual methods
.method protected C()I
    .locals 1

    .prologue
    .line 167
    const/16 v0, 0x20

    return v0
.end method

.method protected Q()Z
    .locals 1

    .prologue
    .line 893
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract R()Ljava/lang/String;
.end method

.method protected abstract a()Ljava/lang/String;
.end method

.method protected final a(Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->f:Landroid/net/Uri;

    .line 138
    return-void
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 200
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lcom/kik/g/f;)V

    .line 201
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->d()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ai:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 202
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->G:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->d()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ai:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 203
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 785
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 786
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 789
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    .line 790
    return-void
.end method

.method protected a(Ljava/lang/String;Z)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 643
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 644
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->M:Ljava/lang/String;

    .line 645
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->M:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->htmlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 646
    const-string v1, " "

    const-string v3, "&nbsp;"

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 648
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->W:Ljava/lang/String;

    move-object v1, v0

    .line 649
    :goto_0
    if-eqz v2, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 651
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ae:Ljava/lang/String;

    .line 652
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->r:Landroid/widget/TextView;

    const v1, 0x7f09010c

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v3, v4, v5

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 653
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->q:Landroid/widget/TextView;

    const v1, 0x7f09010b

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v3, v4, v5

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 654
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->k:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->M:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 657
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->c()V

    .line 659
    iput-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ac:Ljava/lang/String;

    .line 660
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ad:Ljava/lang/String;

    .line 662
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getLoaderManager()Landroid/support/v4/app/LoaderManager;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ag:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;

    invoke-virtual {v0, v6, v7, v1}, Landroid/support/v4/app/LoaderManager;->restartLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;

    .line 664
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 665
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getLoaderManager()Landroid/support/v4/app/LoaderManager;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ag:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;

    invoke-virtual {v0, v5, v7, v1}, Landroid/support/v4/app/LoaderManager;->restartLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;

    .line 668
    :cond_0
    return-void

    .line 648
    :cond_1
    const-string v0, ""

    move-object v1, v0

    goto/16 :goto_0

    .line 649
    :cond_2
    const-string v0, ""

    goto :goto_1
.end method

.method protected final a(Ljava/util/ArrayList;)V
    .locals 5

    .prologue
    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 149
    iget-object v3, p0, Lkik/android/chat/fragment/KikContactsListFragment;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ";"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 153
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->W:Ljava/lang/String;

    .line 154
    return-void
.end method

.method public a(Landroid/database/Cursor;)Z
    .locals 1

    .prologue
    .line 795
    const/4 v0, 0x0

    return v0
.end method

.method protected final b(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 208
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->b(Lcom/kik/g/f;)V

    .line 209
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->d()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->aj:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 210
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->G:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->d()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->aj:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 211
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->a()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->ah:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 212
    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 682
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->a:Ljava/lang/String;

    .line 683
    return-void
.end method

.method protected final b(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 750
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-direct {v0, p1, p2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 751
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 752
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 801
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract c()Ljava/lang/String;
.end method

.method protected final c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 767
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    .line 768
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->u()Z

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 771
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/jm;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jm;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 781
    return-void
.end method

.method protected final d(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 806
    iput-object p1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    .line 807
    return-void
.end method

.method protected e()V
    .locals 4

    .prologue
    .line 862
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->y:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J)V

    .line 863
    return-void
.end method

.method protected abstract g()Z
.end method

.method protected abstract h()Ljava/lang/String;
.end method

.method protected abstract i()Z
.end method

.method protected abstract j()Z
.end method

.method protected k()Z
    .locals 1

    .prologue
    .line 762
    const/4 v0, 0x1

    return v0
.end method

.method protected m()Z
    .locals 1

    .prologue
    .line 888
    const/4 v0, 0x1

    return v0
.end method

.method protected n()Z
    .locals 1

    .prologue
    .line 878
    const/4 v0, 0x0

    return v0
.end method

.method protected o()Z
    .locals 1

    .prologue
    .line 883
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 173
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikContactsListFragment;)V

    .line 174
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 176
    if-eqz p1, :cond_0

    .line 177
    const-string v0, "kik.contacts.current_filter"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    .line 180
    :cond_0
    new-instance v0, Lcom/kik/view/adapters/k;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/view/adapters/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->Y:Lcom/kik/view/adapters/k;

    .line 181
    const v0, 0x7f0901e7

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->L:Ljava/lang/String;

    .line 182
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment$a;->a(Landroid/os/Bundle;)V

    .line 184
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment$a;->a(Lkik/android/chat/fragment/KikContactsListFragment$a;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 185
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikContactsListFragment$a;->a(Lkik/android/chat/fragment/KikContactsListFragment$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->U:J

    .line 186
    invoke-direct {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->d()V

    .line 187
    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->O:Lcom/kik/g/f;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->m()Lcom/kik/g/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/l;->a()Lcom/kik/g/e;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/je;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/je;-><init>(Lkik/android/chat/fragment/KikContactsListFragment;)V

    invoke-virtual {v1, v0, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 195
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 248
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 249
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->O:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 250
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 217
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 219
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 222
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->I:Lkik/android/util/ck;

    sget-object v1, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    invoke-virtual {v0, v1}, Lkik/android/util/ck;->b(Lkik/android/util/ck$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 224
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->I:Lkik/android/util/ck;

    sget-object v2, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    invoke-virtual {v0, v2}, Lkik/android/util/ck;->c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 225
    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 227
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    const-string v2, "Premium Promoted Chat View"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Bots"

    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 235
    :goto_1
    return-void

    .line 232
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->J:Lcom/kik/android/a;

    const-string v1, "Premium Promoted Chat Slow Response"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 241
    const-string v0, "kik.contacts.current_filter"

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    :cond_0
    return-void
.end method

.method protected final p()V
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->N:Z

    .line 143
    return-void
.end method

.method protected final s()V
    .locals 3

    .prologue
    .line 619
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0023

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    mul-int/2addr v0, v1

    .line 620
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v1, v2, Landroid/graphics/Point;->y:I

    sub-int v0, v1, v0

    const/16 v1, 0x12

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 622
    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->d:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikContactsListFragment;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidate()V

    .line 623
    :cond_0
    return-void
.end method

.method protected final t()V
    .locals 3

    .prologue
    .line 672
    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->n:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->h:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->i:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->j:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->k:Landroid/view/View;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/chat/fragment/KikContactsListFragment;->g:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 673
    return-void
.end method

.method protected u()Z
    .locals 1

    .prologue
    .line 687
    const/4 v0, 0x0

    return v0
.end method

.method protected final w()V
    .locals 1

    .prologue
    .line 756
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 757
    return-void
.end method

.method protected x()Z
    .locals 1

    .prologue
    .line 811
    const/4 v0, 0x0

    return v0
.end method

.method protected final z()V
    .locals 1

    .prologue
    .line 867
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 868
    iget-object v0, p0, Lkik/android/chat/fragment/KikContactsListFragment;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->requestLayout()V

    .line 869
    return-void
.end method
