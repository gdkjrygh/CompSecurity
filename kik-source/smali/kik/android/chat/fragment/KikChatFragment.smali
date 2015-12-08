.class public Lkik/android/chat/fragment/KikChatFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"

# interfaces
.implements Lcom/kik/h/a;
.implements Lcom/kik/view/adapters/au$b;
.implements Lkik/android/e/f;
.implements Lkik/android/sdkutils/a;
.implements Lkik/android/util/cu;
.implements Lkik/android/widget/ImeAwareEditText$a;
.implements Lkik/android/widget/ImeAwareEditText$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikChatFragment$1;,
        Lkik/android/chat/fragment/KikChatFragment$a;,
        Lkik/android/chat/fragment/KikChatFragment$b;,
        Lkik/android/chat/fragment/KikChatFragment$e;,
        Lkik/android/chat/fragment/KikChatFragment$d;,
        Lkik/android/chat/fragment/KikChatFragment$f;,
        Lkik/android/chat/fragment/KikChatFragment$c;
    }
.end annotation


# static fields
.field private static final B:I

.field private static J:Z

.field private static K:Ljava/lang/String;

.field private static L:I

.field private static M:Landroid/text/Spannable;

.field private static N:Lkik/a/d/s;

.field private static O:Z

.field private static P:Ljava/util/UUID;

.field private static Q:Lkik/a/d/k;

.field private static final z:Lorg/c/b;


# instance fields
.field private final A:Lkik/android/chat/fragment/KikChatFragment$a;

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:I

.field private G:Z

.field private H:Z

.field private I:Lkik/android/chat/fragment/KikChatFragment$f;

.field private final R:Ljava/util/UUID;

.field private S:Ljava/lang/String;

.field private final U:Ljava/util/ArrayList;

.field private final V:Ljava/util/ArrayList;

.field private final W:Ljava/util/ArrayList;

.field private final X:Landroid/view/View$OnClickListener;

.field private final Y:Lkik/android/util/bw$a;

.field private final Z:Landroid/view/View$OnClickListener;

.field protected _contentAttachFrame:Landroid/widget/RelativeLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a7
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected _contentButton:Lkik/android/widget/DarkFrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00d8
    .end annotation
.end field

.field protected _contentButtonSpacer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01ad
    .end annotation
.end field

.field protected _contentFrame:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0019
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected _mediaItemArea:Landroid/support/v4/view/ViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01b3
    .end annotation
.end field

.field protected _mediaLayout:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a8
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected _mediaModeButton:Lkik/android/widget/TabIconImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01ac
    .end annotation
.end field

.field protected _mediaShadow:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a4
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected _mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a5
    .end annotation
.end field

.field protected _newMessagesButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e002b
    .end annotation
.end field

.field protected _scrollToLastReadButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e002a
    .end annotation
.end field

.field protected _suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a6
    .end annotation
.end field

.field protected _textLayout:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a9
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected _topBar:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e001c
    .end annotation
.end field

.field protected a:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private aA:Lkik/android/b/g;

.field private aB:Ljava/io/File;

.field private aC:Lkik/android/widget/ResizeEventList;

.field private aD:Landroid/view/View;

.field private aE:Landroid/content/Context;

.field private aF:I

.field private aG:I

.field private aH:I

.field private aI:Z

.field private aJ:Ljava/lang/String;

.field private aK:Lkik/a/d/s;

.field private aL:Z

.field private aM:I

.field private aN:I

.field private aO:I

.field private aP:I

.field private aQ:Z

.field private aR:Z

.field private aS:I

.field private aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

.field private aU:Z

.field private aV:Z

.field private aW:Z

.field private aX:Z

.field private aY:I

.field private aZ:I

.field private final aa:Lcom/kik/g/i;

.field private final ab:Landroid/os/Handler;

.field private final ac:Ljava/util/Vector;

.field private ad:Lkik/android/widget/dl;

.field private ae:Landroid/view/View$OnClickListener;

.field private af:Lkik/android/chat/fragment/KikChatFragment$b;

.field private ag:Lcom/kik/view/adapters/au;

.field private ah:Lkik/a/d/k;

.field private ai:Lkik/a/d/f;

.field private aj:Lkik/android/util/ad;

.field private ak:Z

.field private al:Z

.field private am:Z

.field private an:Z

.field private ao:Z

.field private ap:Z

.field private aq:Lkik/android/widget/ImeAwareEditText;

.field private ar:Landroid/widget/LinearLayout;

.field private as:Landroid/view/View;

.field private at:Landroid/view/View;

.field private au:Lkik/android/widget/RobotoTextView;

.field private av:Lkik/android/widget/BugmeBarView;

.field private aw:Lkik/android/widget/ContentLinkView;

.field private ax:Lkik/android/chat/fragment/SendToFragment;

.field private ay:Lkik/a/d/a/a;

.field private az:Ljava/util/List;

.field protected b:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContentImageLoader"
    .end annotation
.end field

.field private bA:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private bB:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private bC:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private bD:Landroid/view/View$OnClickListener;

.field private bE:Ljava/lang/Runnable;

.field private bF:Lkik/android/chat/am;

.field private bG:Landroid/widget/AbsListView$OnScrollListener;

.field private bH:Landroid/view/View$OnClickListener;

.field private bI:Landroid/view/View$OnClickListener;

.field private ba:Lkik/android/widget/bn;

.field private bb:I

.field private bc:I

.field private bd:I

.field private be:I

.field private bf:Z

.field private bg:Landroid/widget/FrameLayout;

.field private bh:Lkik/android/f/a/f;

.field private volatile bi:Z

.field private bj:I

.field private bk:Z

.field private bl:Z

.field private bm:Landroid/view/View$OnClickListener;

.field private bn:Z

.field private bo:Lcom/kik/g/i;

.field private bp:Lcom/kik/g/i;

.field private bq:Lcom/kik/g/i;

.field private br:Lcom/kik/g/i;

.field private bs:Lcom/kik/g/i;

.field private bt:Lcom/kik/g/i;

.field private bu:Lcom/kik/g/i;

.field private bv:Lcom/kik/g/i;

.field private bw:Lcom/kik/g/i;

.field private bx:Lcom/kik/g/i;

.field private by:Lcom/kik/g/i;

.field private bz:Lcom/kik/g/i;

.field protected c:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CardImageLoader"
    .end annotation
.end field

.field protected contentButtonImage:Lkik/android/widget/TabIconImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01b2
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected d:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected j:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected k:Lkik/a/e/i;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected l:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected m:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected n:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected o:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected p:Lkik/a/e/t;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected q:Lcom/kik/android/c/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected r:Lkik/android/chat/b/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rootLayout:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e001a
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected s:Lkik/android/chat/a/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected sendButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01b1
    .end annotation
.end field

.field protected t:Lkik/android/util/bj;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tabs:Lkik/android/widget/PagerIconTabs;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01aa
    .end annotation
.end field

.field protected talkToCover:Lkik/android/widget/TalkToCoverView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0025
    .end annotation

    .annotation build Lbutterknife/Optional;
    .end annotation
.end field

.field protected tray:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01a3
    .end annotation
.end field

.field protected x:Lkik/a/c/c;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 252
    const-string v0, "KikChatFragment"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->z:Lorg/c/b;

    .line 260
    const/16 v0, 0x14

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/chat/fragment/KikChatFragment;->B:I

    .line 310
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    .line 311
    const/4 v0, 0x0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->K:Ljava/lang/String;

    .line 312
    const/4 v0, -0x1

    sput v0, Lkik/android/chat/fragment/KikChatFragment;->L:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/16 v4, 0x104

    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 258
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    .line 261
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->C:Z

    .line 262
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->D:Z

    .line 263
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->E:Z

    .line 264
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->F:I

    .line 265
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->G:Z

    .line 266
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->H:Z

    .line 323
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->R:Ljava/util/UUID;

    .line 325
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->U:Ljava/util/ArrayList;

    .line 326
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    .line 327
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->W:Ljava/util/ArrayList;

    .line 328
    new-instance v0, Lkik/android/chat/fragment/bw;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/bw;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->X:Landroid/view/View$OnClickListener;

    .line 337
    new-instance v0, Lkik/android/chat/fragment/ci;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ci;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->Y:Lkik/android/util/bw$a;

    .line 472
    new-instance v0, Lkik/android/chat/fragment/dn;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/dn;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->Z:Landroid/view/View$OnClickListener;

    .line 498
    new-instance v0, Lkik/android/chat/fragment/ea;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ea;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aa:Lcom/kik/g/i;

    .line 526
    new-instance v0, Lkik/android/chat/fragment/em;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/em;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    .line 577
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ac:Ljava/util/Vector;

    .line 580
    new-instance v0, Lkik/android/chat/fragment/fb;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/fb;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ae:Landroid/view/View$OnClickListener;

    .line 606
    iput-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    .line 635
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ak:Z

    .line 636
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->al:Z

    .line 637
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->am:Z

    .line 638
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->an:Z

    .line 639
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ao:Z

    .line 640
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ap:Z

    .line 661
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aG:I

    .line 662
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    .line 665
    iput-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    .line 666
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aL:Z

    .line 672
    iput v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aM:I

    .line 673
    iput v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aN:I

    .line 674
    iput v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aO:I

    .line 675
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    .line 677
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aQ:Z

    .line 679
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    .line 691
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aU:Z

    .line 692
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aV:Z

    .line 693
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aW:Z

    .line 694
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aX:Z

    .line 695
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aY:I

    .line 696
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    .line 697
    sget-object v0, Lkik/android/widget/bn;->a:Lkik/android/widget/bn;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ba:Lkik/android/widget/bn;

    .line 698
    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bb:I

    .line 699
    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    .line 700
    const/16 v0, 0xc

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bd:I

    .line 701
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->be:I

    .line 702
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bf:Z

    .line 716
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bi:Z

    .line 717
    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bj:I

    .line 718
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bk:Z

    .line 719
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    .line 725
    new-instance v0, Lkik/android/chat/fragment/fn;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/fn;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bm:Landroid/view/View$OnClickListener;

    .line 766
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bn:Z

    .line 767
    new-instance v0, Lkik/android/chat/fragment/gb;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/gb;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bo:Lcom/kik/g/i;

    .line 778
    new-instance v0, Lkik/android/chat/fragment/bx;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/bx;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bp:Lcom/kik/g/i;

    .line 788
    new-instance v0, Lkik/android/chat/fragment/by;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/by;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bq:Lcom/kik/g/i;

    .line 821
    new-instance v0, Lkik/android/chat/fragment/bz;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/bz;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->br:Lcom/kik/g/i;

    .line 833
    new-instance v0, Lkik/android/chat/fragment/ca;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ca;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bs:Lcom/kik/g/i;

    .line 861
    new-instance v0, Lkik/android/chat/fragment/cc;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cc;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bt:Lcom/kik/g/i;

    .line 869
    new-instance v0, Lkik/android/chat/fragment/cd;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cd;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bu:Lcom/kik/g/i;

    .line 877
    new-instance v0, Lkik/android/chat/fragment/ce;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ce;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bv:Lcom/kik/g/i;

    .line 887
    new-instance v0, Lkik/android/chat/fragment/cf;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cf;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bw:Lcom/kik/g/i;

    .line 901
    new-instance v0, Lkik/android/chat/fragment/cg;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cg;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bx:Lcom/kik/g/i;

    .line 909
    new-instance v0, Lkik/android/chat/fragment/ch;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ch;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->by:Lcom/kik/g/i;

    .line 923
    new-instance v0, Lkik/android/chat/fragment/cl;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cl;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bz:Lcom/kik/g/i;

    .line 951
    new-instance v0, Lkik/android/chat/fragment/cm;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cm;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bA:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 971
    new-instance v0, Lkik/android/chat/fragment/cn;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/cn;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bB:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 1009
    new-instance v0, Lkik/android/chat/fragment/co;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/co;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bC:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 2708
    new-instance v0, Lkik/android/chat/fragment/dy;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/dy;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bD:Landroid/view/View$OnClickListener;

    .line 3030
    new-instance v0, Lkik/android/chat/fragment/eh;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/eh;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bE:Ljava/lang/Runnable;

    .line 3665
    new-instance v0, Lkik/android/chat/am;

    new-instance v1, Lkik/android/chat/fragment/et;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/et;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-direct {v0, v1}, Lkik/android/chat/am;-><init>(Lkik/android/chat/al;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bF:Lkik/android/chat/am;

    .line 3679
    new-instance v0, Lkik/android/chat/fragment/eu;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/eu;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bG:Landroid/widget/AbsListView$OnScrollListener;

    .line 3747
    new-instance v0, Lkik/android/chat/fragment/ev;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ev;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bH:Landroid/view/View$OnClickListener;

    .line 3762
    new-instance v0, Lkik/android/chat/fragment/ew;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ew;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bI:Landroid/view/View$OnClickListener;

    .line 3811
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->y:Z

    .line 5673
    return-void
.end method

.method static synthetic A(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aB()V

    return-void
.end method

.method static synthetic B(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v0

    return v0
.end method

.method static synthetic C(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ar()V

    return-void
.end method

.method static synthetic D(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ap()Z

    move-result v0

    return v0
.end method

.method static synthetic E(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 2

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    return v0
.end method

.method static synthetic F(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->t()V

    return-void
.end method

.method static synthetic G(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/s;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    return-object v0
.end method

.method static synthetic H(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    return v0
.end method

.method static synthetic I(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aF:I

    return v0
.end method

.method static synthetic J(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aU:Z

    return v0
.end method

.method static synthetic K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    return-object v0
.end method

.method static synthetic L(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    return v0
.end method

.method static synthetic M(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aX:Z

    return v0
.end method

.method static synthetic N(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aY:I

    return v0
.end method

.method static synthetic O(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aY:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aY:I

    return v0
.end method

.method static synthetic P(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->an:Z

    return v0
.end method

.method private Q()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2263
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2288
    :cond_0
    :goto_0
    return-void

    .line 2267
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 2270
    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    if-nez v2, :cond_0

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2273
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v2}, Lkik/android/chat/ak;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v2

    iput-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    .line 2275
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    if-eqz v2, :cond_0

    .line 2277
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->x()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    if-eqz v2, :cond_4

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$b;->e:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {v3, v2}, Lkik/android/chat/fragment/KikChatFragment$b;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$b;->c:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {v3, v2}, Lkik/android/chat/fragment/KikChatFragment$b;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lkik/android/chat/fragment/KikChatFragment$b;->d:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {v3, v2}, Lkik/android/chat/fragment/KikChatFragment$b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    move v2, v1

    :goto_1
    if-eqz v2, :cond_5

    .line 2278
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->b:Lkik/android/chat/fragment/KikChatFragment$b;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    .line 2285
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->F()V

    .line 2286
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bk:Z

    goto :goto_0

    :cond_4
    move v2, v0

    .line 2277
    goto :goto_1

    .line 2280
    :cond_5
    sget-object v2, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-ne v2, v3, :cond_6

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v2}, Lkik/android/f/a/f;->i()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    move v0, v1

    :cond_6
    if-eqz v0, :cond_3

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->a:Lkik/android/chat/fragment/KikChatFragment$b;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatFragment$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2283
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->b:Lkik/android/chat/fragment/KikChatFragment$b;

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    goto :goto_2
.end method

.method static synthetic Q(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->af()V

    return-void
.end method

.method static synthetic R(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    return-object v0
.end method

.method private R()V
    .locals 2

    .prologue
    .line 2335
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    .line 2336
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v1}, Lkik/android/f/a/f;->f()[B

    move-result-object v1

    .line 2338
    if-eqz v0, :cond_0

    .line 2339
    invoke-direct {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/a/a;[B)V

    .line 2340
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->b()V

    .line 2342
    :cond_0
    return-void
.end method

.method private S()V
    .locals 3

    .prologue
    .line 2347
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->i()Ljava/util/List;

    move-result-object v0

    .line 2348
    if-eqz v0, :cond_0

    .line 2350
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v2, Lkik/android/chat/fragment/ds;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/ds;-><init>(Lkik/android/chat/fragment/KikChatFragment;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lkik/android/widget/ImeAwareEditText;->post(Ljava/lang/Runnable;)Z

    .line 2358
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->b(Ljava/util/List;)V

    .line 2359
    return-void
.end method

.method static synthetic S(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    if-nez v0, :cond_0

    new-instance v0, Lkik/android/widget/dl;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aj:Lkik/android/util/ad;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->q:Lcom/kik/android/c/f;

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/dl;-><init>(Lkik/android/util/ad;Landroid/content/Context;Landroid/view/View;Landroid/view/View;Lcom/kik/android/a;Lcom/kik/android/c/f;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    new-instance v1, Lkik/android/chat/fragment/ej;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ej;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/dl;->a(Lkik/android/widget/dl$c;)V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    invoke-virtual {v0}, Lkik/android/widget/dl;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Smiley Tray Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Smiley Tray Help Visible"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    invoke-virtual {v2}, Lkik/android/widget/dl;->a()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Closed"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Smiley Tray Opened"

    invoke-virtual {v0, v1, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Session Ended"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Smiley Tray Opened"

    invoke-virtual {v0, v1, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setSelected(Z)V

    :cond_1
    return-void
.end method

.method private T()V
    .locals 2

    .prologue
    .line 2739
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 2740
    if-eqz v0, :cond_0

    .line 2741
    const/16 v1, 0xb

    invoke-static {v1}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2742
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x30

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 2748
    :cond_0
    :goto_0
    return-void

    .line 2745
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    goto :goto_0
.end method

.method static synthetic T(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ak:Z

    return v0
.end method

.method static synthetic U(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bi:Z

    return v0
.end method

.method static synthetic V(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bi:Z

    return v0
.end method

.method static synthetic W(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ak:Z

    return v0
.end method

.method private X()Z
    .locals 3

    .prologue
    .line 2752
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->a([Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method static synthetic X(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->al:Z

    return v0
.end method

.method private Y()V
    .locals 2

    .prologue
    .line 2757
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 2758
    if-eqz v0, :cond_0

    .line 2759
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 2761
    :cond_0
    return-void
.end method

.method static synthetic Y(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 1

    .prologue
    .line 228
    sget v0, Lkik/a/d/s$a;->a:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->g(I)V

    return-void
.end method

.method private Z()V
    .locals 1

    .prologue
    .line 2765
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 2766
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    .line 2767
    if-eqz v0, :cond_0

    .line 2768
    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 2771
    :cond_0
    return-void
.end method

.method static synthetic Z(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->am:Z

    return v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->c(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 228
    invoke-static {p0}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/k;)Lkik/a/d/k;
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/widget/bn;)Lkik/android/widget/bn;
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lkik/android/chat/fragment/KikChatFragment;->ba:Lkik/android/widget/bn;

    return-object p1
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 1132
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aY:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aY:I

    .line 1133
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0, p1}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/kik/h/b;

    new-instance v2, Lkik/android/chat/fragment/cp;

    invoke-direct {v2, p0, v1}, Lkik/android/chat/fragment/cp;-><init>(Lkik/android/chat/fragment/KikChatFragment;I)V

    invoke-interface {v0, v2}, Lcom/kik/h/b;->a(Lkik/a/e/g;)V

    .line 1146
    return-void
.end method

.method private a(IZ)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 2057
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aG:I

    if-eq v0, p1, :cond_0

    .line 2058
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aG:I

    .line 2059
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2081
    :cond_0
    :goto_0
    return-void

    .line 2063
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->contentButtonImage:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0}, Lkik/android/widget/TabIconImageView;->clearAnimation()V

    .line 2064
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aG:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 2065
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f040010

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 2066
    if-nez p2, :cond_2

    .line 2067
    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 2069
    :cond_2
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->contentButtonImage:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v1, v0}, Lkik/android/widget/TabIconImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2070
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    const-string v1, "AUTOMATION_MEDIA_BAR_X"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0

    .line 2073
    :cond_3
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f040011

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 2074
    if-nez p2, :cond_4

    .line 2075
    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 2077
    :cond_4
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->contentButtonImage:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v1, v0}, Lkik/android/widget/TabIconImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2078
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    const-string v1, "AUTOMATION_MEDIA_BAR_PLUS"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Landroid/text/Editable;Ljava/lang/String;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 4152
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0, v2}, Lkik/android/widget/ResizeEventList;->setVerticalScrollBarEnabled(Z)V

    .line 4153
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lkik/android/widget/ResizeEventList;->setOverScrollMode(I)V

    .line 4155
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4156
    new-instance v0, Lkik/android/chat/fragment/fe;

    invoke-direct {v0, p0, p1, p2, p3}, Lkik/android/chat/fragment/fe;-><init>(Lkik/android/chat/fragment/KikChatFragment;Landroid/text/Editable;Ljava/lang/String;I)V

    invoke-direct {p0, v2, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(ZLandroid/animation/Animator$AnimatorListener;)V

    .line 4167
    :goto_0
    return-void

    .line 4165
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/text/Editable;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Lkik/a/d/s;Lkik/a/d/a/a;)V
    .locals 4

    .prologue
    .line 3442
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-virtual {v0, p1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Incoming"

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lkik/a/d/s;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    .line 3443
    if-eqz p3, :cond_1

    .line 3444
    const-string v1, "App ID"

    invoke-virtual {p3}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Message Type"

    invoke-static {p3}, Lkik/android/util/ae;->c(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Card URL"

    invoke-static {p3}, Lkik/android/util/ae;->d(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 3451
    :goto_1
    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 3452
    return-void

    .line 3442
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 3449
    :cond_1
    const-string v1, "Message Type"

    const-string v2, "Text"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    goto :goto_1
.end method

.method private a(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 2110
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-virtual {v0, p1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    .line 2111
    if-eqz p2, :cond_0

    const-string v0, "Media Tray"

    .line 2112
    :goto_0
    const-string v2, "Source"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 2113
    const-string v0, "Type"

    invoke-virtual {v1, v0, p3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 2114
    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 2116
    return-void

    .line 2111
    :cond_0
    const-string v0, "Other"

    goto :goto_0
.end method

.method private a(Lkik/a/d/a/a;[B)V
    .locals 7

    .prologue
    .line 2416
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2417
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;)V

    .line 2423
    :goto_0
    sget-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    if-eqz v0, :cond_0

    .line 2424
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    .line 2425
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Media Tray Card Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Index"

    sget v2, Lkik/android/chat/fragment/KikChatFragment;->L:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Landscape"

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Card URL"

    sget-object v2, Lkik/android/chat/fragment/KikChatFragment;->K:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Attached"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 2433
    :cond_0
    new-instance v4, Lkik/a/d/a/a;

    invoke-direct {v4, p1}, Lkik/a/d/a/a;-><init>(Lkik/a/d/a/a;)V

    .line 2434
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {v4}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/net/a/e;->a(Ljava/lang/String;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    .line 2436
    if-eqz v0, :cond_1

    .line 2437
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/net/a/c;

    .line 2438
    if-eqz v0, :cond_1

    .line 2439
    invoke-virtual {v0, v4}, Lkik/android/net/a/c;->a(Lkik/a/d/a/a;)V

    .line 2444
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/d/s;->a(Ljava/lang/String;)Lkik/a/d/s;

    move-result-object v3

    .line 2446
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->f()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lkik/a/d/s;->a([B)V

    .line 2447
    invoke-virtual {v3, v4}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 2449
    sput-object v3, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    .line 2450
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->d()Z

    move-result v0

    sput-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->O:Z

    .line 2451
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    .line 2453
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f09036a

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 2455
    sget-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->O:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0, v4}, Lkik/android/f/a/f;->b(Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2456
    const-string v0, "file-size"

    invoke-virtual {v4, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2458
    if-eqz v0, :cond_2

    .line 2459
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0, v3}, Lkik/a/e/i;->b(Lkik/a/d/s;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/dt;

    invoke-direct {v1, p0, v4, v3}, Lkik/android/chat/fragment/dt;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Lkik/a/d/s;)V

    invoke-static {p0, v1}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 2600
    :cond_2
    :goto_1
    return-void

    .line 2420
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2479
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0, v3}, Lkik/a/e/i;->b(Lkik/a/d/s;)Lcom/kik/g/p;

    move-result-object v6

    new-instance v0, Lkik/android/chat/fragment/du;

    move-object v1, p0

    move-object v2, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lkik/android/chat/fragment/du;-><init>(Lkik/android/chat/fragment/KikChatFragment;[BLkik/a/d/s;Lkik/a/d/a/a;Lkik/a/d/a/a;)V

    invoke-static {p0, v0}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1
.end method

.method private a(Lkik/a/d/s;Z)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 5566
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 5567
    if-eqz v0, :cond_1

    .line 5568
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v1

    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lkik/android/net/a/e;->a(Ljava/lang/String;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    .line 5569
    if-eqz v1, :cond_0

    .line 5570
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/android/net/a/c;

    .line 5571
    if-eqz v1, :cond_0

    .line 5572
    invoke-virtual {v1, v0}, Lkik/android/net/a/c;->a(Lkik/a/d/a/a;)V

    .line 5575
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v4, "Forward Tapped"

    invoke-virtual {v1, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v4, "App ID"

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v4, "Message Type"

    invoke-static {v0}, Lkik/android/util/ae;->c(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v4, "Card URL"

    invoke-static {v0}, Lkik/android/util/ae;->d(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Is Incoming"

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v1

    if-nez v1, :cond_3

    move v1, v2

    :goto_0
    invoke-virtual {v4, v5, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v4, "From Context Menu"

    invoke-virtual {v1, v4, p2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 5584
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/s;->o()[B

    move-result-object v1

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v4, v0, v3, v1}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/SendToFragment$a;->a(Z)Lkik/android/chat/fragment/SendToFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/SendToFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    .line 5585
    :cond_2
    :goto_1
    return-void

    :cond_3
    move v1, v3

    .line 5575
    goto :goto_0

    .line 5584
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ax:Lkik/android/chat/fragment/SendToFragment;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/SendToFragment$a;->a(Z)Lkik/android/chat/fragment/SendToFragment$a;

    move-result-object v1

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_1
.end method

.method private a(Lkik/android/chat/fragment/KikChatFragment$b;)V
    .locals 1

    .prologue
    .line 5550
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5556
    :goto_0
    return-void

    .line 5554
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {p1, v0}, Lkik/android/chat/ak;->a(Lkik/android/chat/fragment/KikChatFragment$b;Lkik/a/d/k;)V

    .line 5555
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bn:Z

    goto :goto_0
.end method

.method private a(Lkik/android/chat/fragment/KikChatFragment$b;ZZ)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 3092
    const/16 v0, 0x8

    invoke-static {v0}, Lcom/kik/sdkutils/y;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3093
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(I)V

    .line 3094
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3097
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bf:Z

    .line 3098
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    .line 3126
    :goto_0
    return-void

    .line 3102
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Chat Closed"

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Media Tray Opened"

    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 3103
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Chat Session Ended"

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Media Tray Opened"

    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 3105
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Media Tray Opened"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    .line 3110
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->bE:Ljava/lang/Runnable;

    invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3112
    invoke-direct {p0, v1, p2}, Lkik/android/chat/fragment/KikChatFragment;->a(IZ)V

    .line 3113
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    aput-object v4, v0, v2

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    aput-object v4, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 3115
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v5}, Lkik/android/widget/DarkLinearLayout;->getHeight()I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v4, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3116
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->c:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3117
    :cond_1
    const-string v0, "Is Maximized"

    invoke-virtual {v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 3118
    if-nez p3, :cond_2

    move v0, v1

    :goto_1
    invoke-direct {p0, p2, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(ZZ)V

    .line 3124
    :goto_2
    invoke-virtual {v3}, Lcom/kik/android/a$f;->b()V

    .line 3125
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(I)V

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 3118
    goto :goto_1

    .line 3121
    :cond_3
    const-string v0, "Is Maximized"

    invoke-virtual {v3, v0, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 3122
    invoke-direct {p0, p2}, Lkik/android/chat/fragment/KikChatFragment;->d(Z)V

    goto :goto_2
.end method

.method private a(Lkik/android/chat/fragment/KikChatFragment$e;)V
    .locals 2

    .prologue
    .line 2702
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getCount()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2703
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/kik/h/b;

    invoke-interface {v0, p1}, Lcom/kik/h/b;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 2702
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 2706
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->f(I)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Landroid/text/Editable;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/text/Editable;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/text/Editable;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;Lkik/a/d/s;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;Lkik/a/d/s;Lkik/a/d/a/a;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Ljava/util/List;)V
    .locals 6

    .prologue
    .line 228
    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v4, "Smiley Inserted From Store"

    invoke-virtual {v2, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v4, "Smiley Category"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v4, "Smiley Identifier"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v2}, Lkik/android/widget/ImeAwareEditText;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Lcom/kik/android/c/e;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getSelectionStart()I

    move-result v2

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getSelectionEnd()I

    move-result v4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    invoke-interface/range {v0 .. v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/a/d/a/a;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;)V
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/s;Z)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;Lkik/a/d/a/a;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0, p1}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v3}, Lcom/kik/view/adapters/au;->getCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v0, v3, :cond_0

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->u()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->x()V

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(ZLandroid/animation/Animator$AnimatorListener;)V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0, p1}, Lcom/kik/view/adapters/au;->c(Lkik/a/d/s;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-virtual {v0, p1, v3}, Lkik/a/d/f;->a(Lkik/a/d/s;Lkik/a/e/v;)V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ai()V

    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v3, Lcom/kik/d/b/a$k;->V:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-virtual {v0, v3, v4, v5}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J)V

    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v3, 0x64

    if-eq v0, v3, :cond_5

    invoke-virtual {p1}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v3, 0x65

    if-eq v0, v3, :cond_5

    if-eqz p2, :cond_1

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {p2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkik/android/net/a/e;->a(Ljava/lang/String;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/net/a/b;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v4, "Content Upload Cancelled"

    invoke-virtual {v3, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kik/android/a$f;->b()V

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v4

    const/16 v5, -0x64

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-virtual {v3, v4, v5, v6}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v3

    invoke-virtual {v3, v0}, Lkik/android/net/a/e;->b(Lkik/android/net/a/b;)V

    move v0, v1

    :goto_0
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v4, "Message Delete Confirm Tapped"

    invoke-virtual {v3, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Incoming"

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v5

    if-nez v5, :cond_2

    :goto_1
    invoke-virtual {v3, v4, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Send Cancelled"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    if-eqz p2, :cond_3

    const-string v1, "App ID"

    invoke-virtual {p2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Message Type"

    invoke-static {p2}, Lkik/android/util/ae;->c(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Card URL"

    invoke-static {p2}, Lkik/android/util/ae;->d(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    :goto_2
    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :goto_3
    invoke-direct {p0, p2}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/a/d/a/a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lkik/a/e/i;->g(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    const-string v1, "Message Type"

    const-string v2, "Text"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    goto :goto_2

    :cond_4
    const-string v0, "Message Delete Confirm Tapped"

    invoke-direct {p0, v0, p1, p2}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;Lkik/a/d/s;Lkik/a/d/a/a;)V

    goto :goto_3

    :cond_5
    move v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$b;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$b;Z)V
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;ZZ)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->d(Z)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;ZZ)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1, p2}, Lkik/android/chat/fragment/KikChatFragment;->a(ZZ)V

    return-void
.end method

.method private a(Lkik/android/widget/ImeAwareEditText;)V
    .locals 1

    .prologue
    .line 1840
    if-nez p1, :cond_0

    .line 1867
    :goto_0
    return-void

    .line 1843
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->s:Lkik/android/chat/a/a;

    invoke-virtual {v0}, Lkik/android/chat/a/a;->a()Z

    move-result v0

    .line 1844
    if-eqz v0, :cond_1

    .line 1845
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lkik/android/widget/ImeAwareEditText;->setImeOptions(I)V

    .line 1846
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lkik/android/widget/ImeAwareEditText;->a(Z)V

    .line 1847
    new-instance v0, Lkik/android/chat/fragment/dj;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/dj;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {p1, v0}, Lkik/android/widget/ImeAwareEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    goto :goto_0

    .line 1863
    :cond_1
    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lkik/android/widget/ImeAwareEditText;->setImeOptions(I)V

    .line 1864
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/android/widget/ImeAwareEditText;->a(Z)V

    .line 1865
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/android/widget/ImeAwareEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    goto :goto_0
.end method

.method private a(ZLandroid/animation/Animator$AnimatorListener;)V
    .locals 6

    .prologue
    .line 5091
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->C:Z

    if-nez v0, :cond_1

    .line 5092
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->C:Z

    .line 5093
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v0

    .line 5095
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    const-wide/16 v4, 0x64

    invoke-static {v1, v2, p2, v4, v5}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/Animator$AnimatorListener;J)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 5097
    if-eqz v1, :cond_1

    .line 5098
    if-nez p1, :cond_0

    .line 5099
    new-instance v2, Lkik/android/chat/fragment/ft;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/ft;-><init>(Lkik/android/chat/fragment/KikChatFragment;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5109
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/fu;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/fu;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5118
    new-instance v0, Lkik/android/chat/fragment/fv;

    invoke-direct {v0, p0, v1}, Lkik/android/chat/fragment/fv;-><init>(Lkik/android/chat/fragment/KikChatFragment;Landroid/animation/ValueAnimator;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    .line 5129
    :cond_1
    return-void
.end method

.method private a(ZZ)V
    .locals 12

    .prologue
    const-wide/16 v4, 0x96

    const/4 v2, 0x0

    const/16 v11, 0x8

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 2892
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 2893
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Maximized Tray"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Landscape"

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Tab"

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    iget v6, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    invoke-virtual {v3, v6}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 2895
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ad()I

    move-result v1

    .line 2896
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->clearAnimation()V

    .line 2897
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2898
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2900
    if-eqz p1, :cond_4

    .line 2901
    new-instance v8, Landroid/animation/AnimatorSet;

    invoke-direct {v8}, Landroid/animation/AnimatorSet;-><init>()V

    .line 2903
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    iget v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    sub-int/2addr v1, v3

    new-instance v3, Lkik/android/chat/fragment/ef;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/ef;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const-wide/16 v6, 0x0

    invoke-static/range {v0 .. v7}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;JJ)Landroid/animation/Animator;

    move-result-object v0

    .line 2930
    if-eqz v0, :cond_1

    .line 2931
    invoke-virtual {v8, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 2934
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2935
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1, v9, v2, v4, v5}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/Animator$AnimatorListener;J)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 2936
    new-instance v2, Lkik/android/chat/fragment/eg;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/eg;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2951
    if-eqz v1, :cond_2

    .line 2952
    invoke-virtual {v8, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 2956
    :cond_2
    invoke-virtual {v8}, Landroid/animation/AnimatorSet;->start()V

    .line 2975
    :cond_3
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v11}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2976
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    invoke-static {v0, v9}, Lkik/android/util/cv;->a(Landroid/view/View;I)V

    .line 2978
    iput-boolean v10, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    .line 2979
    return-void

    .line 2959
    :cond_4
    iget v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 2960
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2961
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v9}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 2962
    invoke-direct {p0, v10}, Lkik/android/chat/fragment/KikChatFragment;->f(Z)V

    .line 2963
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    .line 2964
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2965
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0, v11}, Lkik/android/widget/TabIconImageView;->setVisibility(I)V

    .line 2967
    :cond_5
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->c:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 2968
    const-string v0, "Camera"

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    iget v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    invoke-virtual {v1, v2}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2969
    invoke-direct {p0, v10}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 2971
    :cond_6
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2972
    new-array v0, v10, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    aput-object v1, v0, v9

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method private a(Lkik/a/d/s;Lkik/a/d/a/a;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 4578
    invoke-virtual {p2}, Lkik/a/d/a/a;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4579
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 4682
    :goto_0
    return v0

    .line 4583
    :cond_0
    const-string v0, "sticker_pack_id"

    invoke-virtual {p2, v0}, Lkik/a/d/a/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4584
    const-string v0, "https://stickers.kik.com/"

    .line 4585
    invoke-virtual {p2}, Lkik/a/d/a/a;->m()Ljava/util/ArrayList;

    move-result-object v4

    .line 4587
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_1

    .line 4588
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4591
    :cond_1
    invoke-static {v0}, Lcom/kik/cards/web/bf;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4593
    if-eqz v3, :cond_2

    .line 4594
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lcom/kik/cards/web/bf;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4597
    :cond_2
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Sticker Store Opened"

    invoke-virtual {v1, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v3, "Source"

    const-string v4, "From Sticker"

    invoke-virtual {v1, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 4599
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Content Message Opened"

    invoke-virtual {v1, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v3, "Message Type"

    const-string v4, "Sticker"

    invoke-virtual {v1, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 4601
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;)V

    move v0, v2

    .line 4603
    goto :goto_0

    .line 4606
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;)V

    .line 4608
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p2}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4609
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->t:Lkik/android/util/bj;

    invoke-virtual {p2}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lkik/android/util/bj;->a(Ljava/lang/String;Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    .line 4610
    goto/16 :goto_0

    .line 4613
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aA:Lkik/android/b/g;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v4

    invoke-virtual {v0, v3, p1, v4}, Lkik/android/b/g;->a(Landroid/content/Context;Lkik/a/d/s;I)Lcom/kik/g/p;

    move-result-object v0

    .line 4615
    new-instance v3, Lkik/android/chat/fragment/fk;

    invoke-direct {v3, p0, p2}, Lkik/android/chat/fragment/fk;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 4682
    if-eqz v0, :cond_5

    move v0, v2

    goto/16 :goto_0

    :cond_5
    move v0, v1

    goto/16 :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v0

    return v0
.end method

.method static synthetic aA(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aN:I

    return v0
.end method

.method private aA()V
    .locals 7

    .prologue
    const v6, 0x7f090142

    const/4 v5, 0x0

    .line 4459
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->h()Ljava/lang/String;

    move-result-object v2

    .line 4460
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v1, 0x7f0e001f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 4461
    if-eqz v2, :cond_1

    .line 4462
    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 4463
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4465
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-interface {v3, v2, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    .line 4466
    if-eqz v2, :cond_0

    .line 4468
    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v1

    .line 4469
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4470
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4472
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v2, 0x7f0e001e

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 4473
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4485
    :goto_0
    return-void

    .line 4476
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-eqz v1, :cond_2

    .line 4477
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->w()V

    .line 4480
    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method private aB()V
    .locals 2

    .prologue
    .line 4929
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->a:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;)V

    .line 4930
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->an:Z

    if-eqz v0, :cond_1

    .line 4931
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lkik/android/chat/fragment/MissedConversationsFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/MissedConversationsFragment$a;-><init>()V

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->d()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->J()V

    .line 4936
    :cond_0
    :goto_0
    return-void

    .line 4934
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->d()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->J()V

    goto :goto_0
.end method

.method static synthetic aB(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 2

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->au()Lkik/a/d/s;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v1, v0}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getFirstVisiblePosition()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getLastVisiblePosition()I

    move-result v1

    if-gt v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->as()V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->at()V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private aC()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 4962
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-ne v0, v1, :cond_2

    .line 4963
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-eqz v0, :cond_1

    .line 4964
    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->k()Lkik/a/d/a/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/a/d/a/a;)V

    .line 4970
    :goto_0
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    if-eqz v0, :cond_0

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    invoke-interface {v0}, Landroid/text/Spannable;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 4971
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bi:Z

    .line 4972
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    invoke-virtual {v0, v1}, Lkik/android/widget/ImeAwareEditText;->setText(Ljava/lang/CharSequence;)V

    .line 4973
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-static {v0, v1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 4982
    :cond_0
    :goto_1
    return-void

    .line 4967
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aD()V

    goto :goto_0

    .line 4977
    :cond_2
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->P:Ljava/util/UUID;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->R:Ljava/util/UUID;

    if-ne v0, v1, :cond_0

    .line 4978
    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    .line 4979
    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    goto :goto_1
.end method

.method static synthetic aC(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->av()Z

    move-result v0

    return v0
.end method

.method private aD()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 5133
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0, v1}, Lkik/android/widget/ImeAwareEditText;->setVisibility(I)V

    .line 5134
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 5135
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 5136
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 5137
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    .line 5138
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->G:Z

    if-eqz v0, :cond_0

    .line 5139
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->E:Z

    .line 5140
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aE()V

    .line 5142
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 5143
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 5145
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 5146
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v2}, Lkik/android/widget/ImeAwareEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0002

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 5148
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1, v0}, Lkik/android/widget/ImeAwareEditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5149
    return-void
.end method

.method static synthetic aD(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 3

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aq()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f040019

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_0
    return-void

    :cond_1
    new-instance v2, Lkik/android/chat/fragment/ez;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/ez;-><init>(Lkik/android/chat/fragment/KikChatFragment;Landroid/view/animation/Animation;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0
.end method

.method private aE()V
    .locals 5

    .prologue
    .line 5153
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->D:Z

    if-nez v0, :cond_0

    .line 5154
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v0

    .line 5155
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    const v2, 0x7f0d0027

    invoke-static {v2}, Lkik/android/chat/KikApplication;->d(I)I

    move-result v2

    new-instance v3, Lkik/android/chat/fragment/fw;

    invoke-direct {v3, p0, v0}, Lkik/android/chat/fragment/fw;-><init>(Lkik/android/chat/fragment/KikChatFragment;Z)V

    new-instance v4, Lkik/android/chat/fragment/fx;

    invoke-direct {v4, p0, v0}, Lkik/android/chat/fragment/fx;-><init>(Lkik/android/chat/fragment/KikChatFragment;Z)V

    invoke-static {v1, v2, v3, v4}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;)V

    .line 5190
    :cond_0
    return-void
.end method

.method static synthetic aE(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aq()Z

    move-result v0

    return v0
.end method

.method private aF()V
    .locals 2

    .prologue
    .line 5196
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->P:Ljava/util/UUID;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->R:Ljava/util/UUID;

    if-ne v0, v1, :cond_0

    .line 5197
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    .line 5198
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    .line 5200
    :cond_0
    return-void
.end method

.method static synthetic aF(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->as()V

    return-void
.end method

.method static synthetic aG(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/am;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bF:Lkik/android/chat/am;

    return-object v0
.end method

.method private aG()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 5204
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->P:Ljava/util/UUID;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->R:Ljava/util/UUID;

    if-ne v0, v1, :cond_0

    .line 5205
    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    .line 5206
    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    .line 5207
    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    .line 5208
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->O:Z

    .line 5210
    :cond_0
    return-void
.end method

.method static synthetic aH(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    return v0
.end method

.method private aH()Z
    .locals 2

    .prologue
    .line 5281
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aF:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic aI(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    return v0
.end method

.method private aI()V
    .locals 1

    .prologue
    .line 5351
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bk:Z

    if-eqz v0, :cond_0

    .line 5360
    :goto_0
    return-void

    .line 5355
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aq()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5356
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->as()V

    .line 5358
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    .line 5359
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic aJ(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/s;
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->au()Lkik/a/d/s;

    move-result-object v0

    return-object v0
.end method

.method private aJ()Z
    .locals 2

    .prologue
    .line 5387
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic aK(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->at()V

    return-void
.end method

.method static synthetic aL(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aD()V

    return-void
.end method

.method static synthetic aM(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bj:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bj:I

    return v0
.end method

.method static synthetic aN(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ay()V

    return-void
.end method

.method static synthetic aO(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    if-eqz v0, :cond_0

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$1;->a:[I

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatFragment$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->D()V

    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bk:Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;)V

    goto :goto_0

    :pswitch_2
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->c:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-direct {p0, v0, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;ZZ)V

    goto :goto_0

    :pswitch_3
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->d:Lkik/android/chat/fragment/KikChatFragment$b;

    invoke-direct {p0, v0, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;ZZ)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic aP(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bn:Z

    return v0
.end method

.method static synthetic aQ(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikDialogFragment;
    .locals 3

    .prologue
    .line 228
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f09031c

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f0900be

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f09031b

    new-instance v2, Lkik/android/chat/fragment/fm;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/fm;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f090299

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    return-object v0
.end method

.method static synthetic aR(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ad()I

    move-result v0

    return v0
.end method

.method static synthetic aS(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bf:Z

    return v0
.end method

.method static synthetic aT(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    return v0
.end method

.method static synthetic aU(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bf:Z

    return v0
.end method

.method static synthetic aV(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aL:Z

    return v0
.end method

.method private aa()V
    .locals 2

    .prologue
    .line 2882
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2883
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2884
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 2885
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bm:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2887
    :cond_0
    return-void
.end method

.method static synthetic aa(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->P()V

    return-void
.end method

.method static synthetic ab(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->u()V

    return-void
.end method

.method static synthetic ac(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikDialogFragment;
    .locals 3

    .prologue
    .line 228
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f09031d

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f09033c

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f09031b

    new-instance v2, Lkik/android/chat/fragment/fq;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/fq;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v1, 0x7f090299

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    return-object v0
.end method

.method private ad()I
    .locals 3

    .prologue
    .line 2997
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3002
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bb:I

    sget v2, Lkik/android/chat/fragment/KikChatFragment;->B:I

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    .line 3003
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bb:I

    .line 3006
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method static synthetic ad(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method private ae()V
    .locals 2

    .prologue
    .line 3025
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3026
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v1}, Lkik/android/widget/DarkLinearLayout;->getMeasuredHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 3027
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3028
    return-void
.end method

.method static synthetic ae(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method private af()V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 3049
    invoke-static {v4}, Lcom/kik/sdkutils/y;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3050
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(I)V

    .line 3053
    :cond_0
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->a:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 3054
    invoke-direct {p0, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(IZ)V

    .line 3055
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    .line 3057
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 3058
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/view/View;I)V

    .line 3060
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3061
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->g(Z)V

    .line 3064
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Y()V

    .line 3065
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    .line 3066
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 3067
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ae()V

    .line 3068
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 3069
    iput-boolean v3, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    .line 3083
    :goto_0
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    .line 3085
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3086
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aE()V

    .line 3088
    :cond_1
    return-void

    .line 3074
    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->T()V

    .line 3075
    invoke-direct {p0, v3}, Lkik/android/chat/fragment/KikChatFragment;->g(Z)V

    .line 3076
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3077
    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 3078
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3081
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bE:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/ViewPager;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method static synthetic af(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aV:Z

    return v0
.end method

.method static synthetic ag(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/f/a/f;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    return-object v0
.end method

.method private ag()V
    .locals 2

    .prologue
    .line 3199
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3200
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/view/View;I)V

    .line 3201
    return-void
.end method

.method private ah()V
    .locals 2

    .prologue
    .line 3231
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    invoke-virtual {v0}, Lkik/android/widget/dl;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3232
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    invoke-virtual {v0}, Lkik/android/widget/dl;->d()V

    .line 3233
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 3238
    :cond_0
    return-void
.end method

.method static synthetic ah(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->R()V

    return-void
.end method

.method private ai()V
    .locals 12

    .prologue
    const/16 v7, 0x8

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 3456
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    monitor-enter v1

    .line 3457
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_0

    .line 3458
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/au;->setNotifyOnChange(Z)V

    .line 3460
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ak()Lkik/a/d/s;

    move-result-object v0

    .line 3462
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    .line 3464
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 3465
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3467
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3468
    const/4 v3, 0x1

    iput-boolean v3, p0, Lkik/android/chat/fragment/KikChatFragment;->H:Z

    .line 3469
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v4}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v4

    invoke-virtual {v3, v4}, Lkik/android/widget/ResizeEventList;->smoothScrollToPosition(I)V

    .line 3472
    :cond_1
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    if-eqz v4, :cond_2

    if-lez v3, :cond_6

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    invoke-virtual {v3}, Lkik/android/widget/RobotoTextView;->getVisibility()I

    move-result v3

    if-eq v3, v7, :cond_2

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Lkik/android/widget/RobotoTextView;->setVisibility(I)V

    .line 3474
    :cond_2
    :goto_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ak()Lkik/a/d/s;

    move-result-object v3

    .line 3476
    if-eq v0, v3, :cond_3

    .line 3477
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->al()V

    .line 3480
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->i()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 3481
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->j()V

    .line 3482
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    iget v3, p0, Lkik/android/chat/fragment/KikChatFragment;->F:I

    if-ne v0, v3, :cond_7

    move v0, v6

    .line 3483
    :goto_1
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->F:I

    .line 3484
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 3485
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v2, v3, v0}, Lkik/android/widget/ResizeEventList;->a(Landroid/widget/ArrayAdapter;Z)V

    .line 3504
    :cond_4
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-virtual {v0, v2, v3, v4, v7}, Lkik/android/widget/ResizeEventList;->setPadding(IIII)V

    .line 3506
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3507
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->U:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-wide/16 v2, 0x0

    move v4, v5

    :goto_3
    if-ge v4, v7, :cond_d

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v8

    sub-long/2addr v8, v2

    const-wide/32 v10, 0xdbba0

    cmp-long v1, v8, v10

    if-lez v1, :cond_c

    if-lez v4, :cond_b

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    add-int/lit8 v8, v4, -0x1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/s;

    :goto_4
    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v8

    invoke-virtual {v1}, Lkik/a/d/s;->e()J

    move-result-wide v10

    sub-long/2addr v8, v10

    const-wide/32 v10, 0x493e0

    cmp-long v1, v8, v10

    if-lez v1, :cond_c

    :cond_5
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->U:Ljava/util/ArrayList;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v0

    :goto_5
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-wide v2, v0

    goto :goto_3

    .line 3472
    :cond_6
    :try_start_1
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    invoke-virtual {v3}, Lkik/android/widget/RobotoTextView;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lkik/android/widget/RobotoTextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 3506
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_7
    move v0, v5

    .line 3482
    goto/16 :goto_1

    .line 3488
    :cond_8
    :try_start_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lkik/android/widget/ResizeEventList;->setVerticalScrollBarEnabled(Z)V

    .line 3489
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lkik/android/widget/ResizeEventList;->setOverScrollMode(I)V

    goto :goto_2

    .line 3492
    :cond_9
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    iget v3, p0, Lkik/android/chat/fragment/KikChatFragment;->F:I

    if-ge v0, v3, :cond_a

    .line 3493
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_4

    .line 3494
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->F:I

    .line 3495
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0}, Lcom/kik/view/adapters/au;->notifyDataSetChanged()V

    goto/16 :goto_2

    .line 3499
    :cond_a
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_4

    .line 3500
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0}, Lcom/kik/view/adapters/au;->notifyDataSetChanged()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_2

    .line 3507
    :cond_b
    const/4 v1, 0x0

    goto :goto_4

    :cond_c
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->U:Ljava/util/ArrayList;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v0, v2

    goto :goto_5

    .line 3508
    :cond_d
    return-void
.end method

.method static synthetic ai(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->S()V

    return-void
.end method

.method static synthetic aj(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikChatFragment$f;
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->I:Lkik/android/chat/fragment/KikChatFragment$f;

    return-object v0
.end method

.method private aj()Z
    .locals 2

    .prologue
    .line 3512
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getLastVisiblePosition()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getLastVisiblePosition()I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getLastVisiblePosition()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->H:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ak()Lkik/a/d/s;
    .locals 2

    .prologue
    .line 3518
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic ak(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->f(Z)V

    return-void
.end method

.method private al()V
    .locals 4

    .prologue
    .line 3523
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->a()Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    .line 3525
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->am()Z

    move-result v1

    if-eqz v1, :cond_4

    instance-of v1, v0, Lkik/android/chat/fragment/rl;

    if-eqz v1, :cond_4

    .line 3526
    check-cast v0, Lkik/android/chat/fragment/rl;

    .line 3527
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3528
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aE()V

    .line 3530
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->w()Ljava/util/List;

    move-result-object v1

    .line 3531
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Lkik/android/chat/fragment/rl;->a(Ljava/util/List;Landroid/content/Context;Lkik/android/e/f;)V

    .line 3532
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$a;)V

    .line 3534
    if-eqz v0, :cond_2

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v1

    instance-of v1, v1, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v1, :cond_2

    .line 3535
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/LinearLayoutManager;

    .line 3537
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 3538
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 3540
    invoke-virtual {v1}, Landroid/support/v7/widget/LinearLayoutManager;->j()I

    move-result v3

    if-ltz v3, :cond_3

    .line 3541
    invoke-virtual {v1}, Landroid/support/v7/widget/LinearLayoutManager;->j()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/rl;->a(II)V

    .line 3551
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lkik/android/chat/fragment/rl;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/16 v2, -0x1f4

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->e(II)V

    .line 3560
    :cond_2
    :goto_1
    return-void

    .line 3544
    :cond_3
    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/rl;->d(I)I

    move-result v3

    .line 3545
    if-ltz v3, :cond_1

    .line 3546
    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/rl;->a(II)V

    goto :goto_0

    .line 3556
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3557
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(ZLandroid/animation/Animator$AnimatorListener;)V

    goto :goto_1
.end method

.method static synthetic al(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Y()V

    return-void
.end method

.method private am()Z
    .locals 1

    .prologue
    .line 3564
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->w()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic am(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    return v0
.end method

.method static synthetic an(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ae()V

    return-void
.end method

.method private an()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3576
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getMeasuredHeight()I

    move-result v2

    if-gtz v2, :cond_0

    .line 3577
    new-array v2, v0, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    aput-object v3, v2, v1

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 3579
    :cond_0
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->g()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    if-nez v2, :cond_2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->i()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v2

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->E:Z

    if-eqz v2, :cond_2

    :cond_1
    iget-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->D:Z

    if-nez v2, :cond_2

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->am()Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    return v0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private ao()V
    .locals 1

    .prologue
    .line 3660
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_0

    .line 3661
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0}, Lcom/kik/view/adapters/au;->a()V

    .line 3663
    :cond_0
    return-void
.end method

.method static synthetic ao(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    return v0
.end method

.method static synthetic ap(Lkik/android/chat/fragment/KikChatFragment;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    return-object v0
.end method

.method private ap()Z
    .locals 1

    .prologue
    .line 3786
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic aq(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    return-object v0
.end method

.method private aq()Z
    .locals 1

    .prologue
    .line 3791
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic ar(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/au;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    return-object v0
.end method

.method private ar()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 3796
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ap()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->D:Z

    if-nez v0, :cond_0

    .line 3797
    iput v5, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    .line 3798
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    sget-object v1, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    invoke-virtual {v4}, Landroid/widget/Button;->getMeasuredHeight()I

    move-result v4

    int-to-float v4, v4

    aput v4, v2, v3

    const/4 v3, 0x0

    aput v3, v2, v5

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 3799
    new-instance v1, Lkik/android/chat/fragment/ex;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ex;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 3807
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 3809
    :cond_0
    return-void
.end method

.method private as()V
    .locals 2

    .prologue
    .line 3875
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aq()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3900
    :goto_0
    return-void

    .line 3878
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f04001a

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 3879
    new-instance v1, Lkik/android/chat/fragment/fa;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/fa;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 3898
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->clearAnimation()V

    .line 3899
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method static synthetic as(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v0

    return v0
.end method

.method private at()V
    .locals 2

    .prologue
    .line 3922
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->o:Lkik/android/util/ar;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3923
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 3924
    return-void
.end method

.method static synthetic at(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aE()V

    return-void
.end method

.method private au()Lkik/a/d/s;
    .locals 3

    .prologue
    .line 3929
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->o:Lkik/android/util/ar;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3930
    const-string v1, "kik.chat.LastMessageSeen"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3931
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v1, v0}, Lkik/a/d/f;->b(Ljava/lang/String;)Lkik/a/d/s;

    move-result-object v0

    return-object v0
.end method

.method static synthetic au(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aL:Z

    return v0
.end method

.method static synthetic av(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aM:I

    return v0
.end method

.method private av()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 3936
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->au()Lkik/a/d/s;

    move-result-object v1

    .line 3937
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v2, v1}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v1

    .line 3938
    if-gez v1, :cond_1

    .line 3941
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v2}, Lkik/android/widget/ResizeEventList;->getFirstVisiblePosition()I

    move-result v2

    sub-int v1, v2, v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic aw(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aO:I

    return v0
.end method

.method private aw()V
    .locals 1

    .prologue
    .line 4232
    const/4 v0, 0x0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    .line 4233
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aD()V

    .line 4234
    return-void
.end method

.method private ax()V
    .locals 2

    .prologue
    .line 4305
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bj:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 4312
    :cond_0
    :goto_0
    return-void

    .line 4308
    :cond_1
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bj:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bj:I

    if-nez v0, :cond_0

    .line 4310
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ay()V

    goto :goto_0
.end method

.method static synthetic ax(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/util/bu;->a(Landroid/widget/ListView;I)V

    return-void
.end method

.method private ay()V
    .locals 4

    .prologue
    .line 4320
    :try_start_0
    new-instance v0, Lkik/android/chat/fragment/ff;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ff;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ff;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4347
    :goto_0
    return-void

    .line 4339
    :catch_0
    move-exception v0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    new-instance v1, Lkik/android/chat/fragment/fg;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/fg;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method static synthetic ay(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 3

    .prologue
    .line 228
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aP:I

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ap()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->y:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ey;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ey;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method static synthetic az(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/util/bu;->a(Landroid/widget/ListView;I)V

    return-void
.end method

.method private az()Z
    .locals 1

    .prologue
    .line 4444
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ax:Lkik/android/chat/fragment/SendToFragment;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;I)I
    .locals 0

    .prologue
    .line 228
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    return p1
.end method

.method private b(Landroid/text/Editable;Ljava/lang/String;I)V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x1

    .line 4171
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->x()V

    .line 4173
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 4174
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 4228
    :goto_0
    return-void

    .line 4178
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v4, "Messaging Partners in Last 7 Days"

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v5}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    .line 4180
    invoke-direct {p0, v3}, Lkik/android/chat/fragment/KikChatFragment;->e(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v4

    .line 4182
    invoke-static {v4, p2}, Lkik/android/util/by;->a(Lcom/kik/android/a$f;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v5, "Network Is Connected"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->l:Lkik/a/e/f;

    invoke-interface {v6}, Lkik/a/e/f;->k()Z

    move-result v6

    invoke-virtual {v0, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v6, "Was Suggested"

    sget v0, Lkik/a/d/s$a;->b:I

    if-ne p3, v0, :cond_5

    move v0, v1

    :goto_1
    invoke-virtual {v5, v6, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 4186
    invoke-virtual {v4}, Lcom/kik/android/a$f;->b()V

    .line 4188
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->f:Lkik/android/util/ck;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0, v4}, Lkik/android/util/ck;->a(Lkik/a/d/k;)Z

    move-result v0

    .line 4189
    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Vector;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    if-eqz v0, :cond_1

    .line 4190
    invoke-static {}, Lkik/android/util/ck$b;->values()[Lkik/android/util/ck$b;

    move-result-object v4

    array-length v5, v4

    move v0, v2

    :goto_2
    if-ge v0, v5, :cond_1

    aget-object v6, v4, v0

    .line 4191
    iget-object v7, p0, Lkik/android/chat/fragment/KikChatFragment;->f:Lkik/android/util/ck;

    iget-object v8, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v7, v8, v6}, Lkik/android/util/ck;->a(Lkik/a/d/k;Lkik/android/util/ck$b;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 4192
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v4, v6, Lkik/android/util/ck$b;->f:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v4, "Bots"

    new-array v5, v1, [Ljava/lang/String;

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v6}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 4198
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Closed"

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Messages Sent"

    invoke-virtual {v0, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 4199
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Session Ended"

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Messages Sent"

    invoke-virtual {v0, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 4201
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ak:Z

    .line 4204
    sget v0, Lkik/a/d/s$a;->a:I

    if-ne p3, v0, :cond_2

    .line 4205
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    const-string v2, ""

    invoke-virtual {v0, v2}, Lkik/android/widget/ImeAwareEditText;->setText(Ljava/lang/CharSequence;)V

    .line 4206
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0, v9, v9, v9, v9}, Lkik/android/widget/ImeAwareEditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4209
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, p3}, Lkik/a/d/s;->a(Ljava/lang/String;Ljava/lang/String;I)Lkik/a/d/s;

    move-result-object v2

    .line 4210
    if-eqz p1, :cond_3

    .line 4211
    invoke-static {p1}, Lcom/kik/android/c/f;->b(Landroid/text/Spannable;)Lcom/kik/i/a/a/c;

    move-result-object v0

    .line 4212
    if-eqz v0, :cond_3

    .line 4213
    new-instance v3, Lkik/a/f/e/k;

    invoke-direct {v3, v0}, Lkik/a/f/e/k;-><init>(Lcom/kik/i/a/a/c;)V

    invoke-virtual {v2, v3}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 4216
    :cond_3
    invoke-static {}, Lkik/android/chat/KikApplication;->d()Lkik/android/util/bo;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/util/bo;->a(Lkik/a/d/s;)V

    .line 4219
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 4220
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v10, :cond_4

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->hardKeyboardHidden:I

    if-eq v0, v1, :cond_4

    .line 4222
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 4223
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 4226
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v4, 0x12c

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4227
    iput-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    goto/16 :goto_0

    :cond_5
    move v0, v2

    .line 4182
    goto/16 :goto_1

    .line 4190
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2
.end method

.method private b(Lkik/a/d/a/a;)V
    .locals 3

    .prologue
    .line 4293
    if-eqz p1, :cond_0

    .line 4294
    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    .line 4295
    if-eqz v0, :cond_0

    .line 4296
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->n:Lcom/kik/l/ab;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/kik/l/ab;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4297
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 4301
    :cond_0
    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 228
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "chatGroupJID"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v0}, Lkik/android/chat/ak;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-interface {v0, p1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v0, v1}, Lkik/android/chat/ak;->a(Lkik/android/chat/fragment/KikChatFragment$b;Lkik/a/d/k;)V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ai()V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aG()V

    :goto_0
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-eqz v0, :cond_1

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->k()Lkik/a/d/a/a;

    move-result-object v0

    if-eqz v0, :cond_1

    sput-boolean v2, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/a/a;[B)V

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aF()V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/16 v4, 0x8

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 228
    invoke-static {v4}, Lcom/kik/sdkutils/y;->c(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->c(I)V

    :cond_0
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.kik.ext.video-camera"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "com.kik.ext.camera"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "com.kik.ext.gif"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "gif-button"

    invoke-virtual {p1, v2}, Lkik/a/d/a/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_1
    move v2, v0

    :goto_0
    if-eqz v2, :cond_5

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->al:Z

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v1, p1, v0, v5}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Z)V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->x()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    sget v0, Lkik/a/d/s$a;->a:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->g(I)V

    :cond_3
    :goto_1
    return-void

    :cond_4
    move v2, v1

    goto :goto_0

    :cond_5
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v5}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Z)V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v4}, Lcom/kik/sdkutils/y;->c(I)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_6

    if-ne v2, v0, :cond_7

    :cond_6
    :goto_2
    if-nez v0, :cond_8

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;)V

    goto :goto_1

    :cond_7
    move v0, v1

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    goto :goto_1

    :cond_9
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->a:Lkik/android/chat/fragment/KikChatFragment$b;

    :goto_3
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v0, v1}, Lkik/android/chat/ak;->a(Lkik/android/chat/fragment/KikChatFragment$b;Lkik/a/d/k;)V

    goto :goto_1

    :cond_a
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->b:Lkik/android/chat/fragment/KikChatFragment$b;

    goto :goto_3
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/kik/h/b;

    invoke-interface {v0, p1}, Lcom/kik/h/b;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    return-void
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 2388
    sget-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aJ()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;Lkik/a/d/a/a;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0, p1, p2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/s;Lkik/a/d/a/a;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aU:Z

    return p1
.end method

.method private c(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 400
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 402
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->x:Lkik/a/c/c;

    invoke-virtual {v1, p1}, Lkik/a/c/c;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/cw;

    invoke-direct {v2, p0, v0, p1}, Lkik/android/chat/fragment/cw;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lcom/kik/g/p;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 469
    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    return-object v0
.end method

.method public static c()V
    .locals 1

    .prologue
    .line 2393
    const/4 v0, 0x0

    sput-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    .line 2394
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 4799
    invoke-static {v3}, Lcom/kik/sdkutils/y;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4800
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(I)V

    .line 4803
    :cond_0
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 4804
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Z()V

    .line 4805
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aa()V

    .line 4806
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    .line 4809
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->a:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 4810
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    .line 4814
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4816
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4817
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aE()V

    .line 4822
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 4823
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 4824
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4826
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 4827
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    .line 4830
    const/4 v0, 0x1

    invoke-direct {p0, v2, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(IZ)V

    .line 4831
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->g(Z)V

    .line 4832
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ae()V

    .line 4835
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Y()V

    .line 4836
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    .line 4837
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    .line 4838
    return-void
.end method

.method private c(Lkik/a/d/a/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 4994
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4995
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->E:Z

    .line 4996
    new-instance v0, Lkik/android/chat/fragment/fr;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/fragment/fr;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V

    invoke-direct {p0, v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(ZLandroid/animation/Animator$AnimatorListener;)V

    .line 5008
    :goto_0
    return-void

    .line 5006
    :cond_0
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/a/d/a/a;)V

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->a(I)V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/a/d/a/a;)V

    return-void
.end method

.method private c(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 2121
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2220
    :cond_0
    :goto_0
    return-void

    .line 2125
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2127
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ay:Lkik/a/d/a/a;

    .line 2128
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->i()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->az:Ljava/util/List;

    .line 2130
    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->x()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2132
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    .line 2133
    const-string v1, "Attachment Overwrite Prompted"

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, p1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;ZLjava/lang/String;)V

    .line 2135
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 2136
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2137
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 2138
    const v2, 0x7f0902fc

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v2

    const v3, 0x7f0901fa

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 2139
    const v0, 0x7f0902fb

    new-instance v2, Lkik/android/chat/fragment/do;

    invoke-direct {v2, p0, p1}, Lkik/android/chat/fragment/do;-><init>(Lkik/android/chat/fragment/KikChatFragment;Z)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v2, 0x7f090299

    new-instance v3, Lkik/android/chat/fragment/dm;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/dm;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 2168
    iget-object v0, v1, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    .line 2169
    new-instance v1, Lkik/android/chat/fragment/dp;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/dp;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment$c;)V

    .line 2181
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->ac()Z

    move-result v1

    if-nez v1, :cond_3

    .line 2182
    new-instance v1, Lkik/android/chat/fragment/dq;

    invoke-direct {v1, p0, v0}, Lkik/android/chat/fragment/dq;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikDialogFragment;)V

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->I:Lkik/android/chat/fragment/KikChatFragment$f;

    goto/16 :goto_0

    .line 2192
    :cond_3
    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "replace"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2197
    :cond_4
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->ac()Z

    move-result v0

    if-nez v0, :cond_5

    .line 2198
    new-instance v0, Lkik/android/chat/fragment/dr;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/dr;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->I:Lkik/android/chat/fragment/KikChatFragment$f;

    .line 2216
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0, v4}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0, v4}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lkik/android/widget/GalleryWidget;

    if-eqz v0, :cond_0

    .line 2217
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v0, v4}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GalleryWidget;

    invoke-virtual {v0}, Lkik/android/widget/GalleryWidget;->c()V

    goto/16 :goto_0

    .line 2210
    :cond_5
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->R()V

    .line 2211
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->S()V

    .line 2212
    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->k()Lkik/a/d/a/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/a/d/a/a;)V

    goto :goto_1
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aX:Z

    return p1
.end method

.method public static d()I
    .locals 1

    .prologue
    .line 2398
    sget v0, Lkik/android/chat/fragment/KikChatFragment;->L:I

    return v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatFragment;I)I
    .locals 0

    .prologue
    .line 228
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    return p1
.end method

.method private d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;
    .locals 2

    .prologue
    .line 5364
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v0, :cond_1

    .line 5365
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5366
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->c:Lkik/android/chat/fragment/KikChatFragment$b;

    .line 5382
    :goto_0
    return-object v0

    .line 5368
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aJ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5369
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->d:Lkik/android/chat/fragment/KikChatFragment$b;

    goto :goto_0

    .line 5373
    :cond_1
    if-nez p1, :cond_2

    .line 5374
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->a:Lkik/android/chat/fragment/KikChatFragment$b;

    goto :goto_0

    .line 5377
    :cond_2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 5378
    invoke-virtual {p1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 5379
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 5381
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, v1, v0

    .line 5382
    if-lez v0, :cond_3

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->b:Lkik/android/chat/fragment/KikChatFragment$b;

    goto :goto_0

    :cond_3
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$b;->a:Lkik/android/chat/fragment/KikChatFragment$b;

    goto :goto_0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikChatFragment$b;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 486
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Media Tray Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Maximized"

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Landscape"

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Last Tab"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    iget v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    invoke-virtual {v2, v3}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 488
    return-void
.end method

.method private d(Lkik/a/d/a/a;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 5012
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 5077
    :cond_0
    :goto_0
    return-void

    .line 5015
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5016
    iput-boolean v4, p0, Lkik/android/chat/fragment/KikChatFragment;->E:Z

    .line 5017
    new-instance v0, Lkik/android/chat/fragment/fs;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/fs;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-direct {p0, v4, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(ZLandroid/animation/Animator$AnimatorListener;)V

    .line 5026
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 5027
    invoke-static {p1}, Lkik/android/util/t;->a(Lkik/a/d/a/a;)Lkik/a/d/a/a$b;

    move-result-object v1

    .line 5028
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bd:I

    .line 5030
    :goto_1
    sget-object v2, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    if-ne v1, v2, :cond_4

    .line 5033
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->r:Lkik/android/chat/b/d;

    invoke-static {v1, v2, p1, v3}, Lkik/android/util/ac;->b(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;Lkik/android/chat/b/d;)Lkik/android/util/ac$a;

    move-result-object v1

    .line 5063
    :goto_2
    invoke-virtual {v1}, Lkik/android/util/ac$a;->a()Z

    move-result v2

    if-nez v2, :cond_b

    .line 5069
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1}, Lkik/android/util/ac$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 5070
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aw()V

    goto :goto_0

    .line 5028
    :cond_3
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    goto :goto_1

    .line 5035
    :cond_4
    sget-object v2, Lkik/a/d/a/a$b;->f:Lkik/a/d/a/a$b;

    if-ne v1, v2, :cond_5

    .line 5036
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->r:Lkik/android/chat/b/d;

    invoke-static {v1, v2, p1, v3}, Lkik/android/util/ac;->c(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;Lkik/android/chat/b/d;)Lkik/android/util/ac$a;

    move-result-object v1

    goto :goto_2

    .line 5038
    :cond_5
    sget-object v2, Lkik/a/d/a/a$b;->d:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 5039
    :cond_6
    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.kik.ext.gif"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 5040
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, p1}, Lkik/android/util/ac;->c(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;

    move-result-object v1

    goto :goto_2

    .line 5043
    :cond_7
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, p1}, Lkik/android/util/ac;->b(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;

    move-result-object v1

    goto :goto_2

    .line 5046
    :cond_8
    sget-object v2, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v1, v2}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 5047
    invoke-virtual {p1}, Lkik/a/d/a/a;->i()Z

    move-result v1

    if-nez v1, :cond_a

    .line 5048
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, p1}, Lkik/android/util/ac;->b(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;

    move-result-object v1

    goto :goto_2

    .line 5056
    :cond_9
    invoke-virtual {p1}, Lkik/a/d/a/a;->n()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 5057
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-static {v1, v2, p1}, Lkik/android/util/ac;->a(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;

    move-result-object v1

    goto :goto_2

    .line 5060
    :cond_a
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->r:Lkik/android/chat/b/d;

    invoke-static {v1, v2, p1, v3}, Lkik/android/util/ac;->a(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;Lkik/android/chat/b/d;)Lkik/android/util/ac$a;

    move-result-object v1

    goto/16 :goto_2

    .line 5073
    :cond_b
    invoke-virtual {v1}, Lkik/android/util/ac$a;->c()Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    .line 5074
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-static {v1}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/util/cv$b;->c(I)Lkik/android/util/cv$b;

    move-result-object v0

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bd:I

    invoke-virtual {v0, v1}, Lkik/android/util/cv$b;->a(I)Lkik/android/util/cv$b;

    move-result-object v0

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lkik/android/util/cv$b;->d(I)Lkik/android/util/cv$b;

    .line 5075
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5076
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bm:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Landroid/text/Spannable;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/a/d/a/a;)V

    return-void
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    return-void
.end method

.method private d(Z)V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x0

    .line 2775
    invoke-direct {p0, v11}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 2776
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->T()V

    .line 2777
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Z()V

    .line 2778
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aJ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2779
    invoke-direct {p0, v11}, Lkik/android/chat/fragment/KikChatFragment;->f(Z)V

    .line 2859
    :cond_0
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 2860
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2861
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 2864
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 2865
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentAttachFrame:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2867
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/ee;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ee;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2876
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    invoke-static {v0, v11}, Lkik/android/util/cv;->a(Landroid/view/View;I)V

    .line 2877
    iput-boolean v12, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    .line 2878
    return-void

    .line 2781
    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_5

    .line 2782
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->b:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    .line 2783
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v8

    .line 2784
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2785
    new-instance v10, Landroid/animation/AnimatorSet;

    invoke-direct {v10}, Landroid/animation/AnimatorSet;-><init>()V

    .line 2786
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    new-instance v2, Lkik/android/chat/fragment/dz;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/dz;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const-wide/16 v4, 0x96

    invoke-static {v0, v1, v2, v4, v5}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/Animator$AnimatorListener;J)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 2805
    if-eqz v0, :cond_3

    .line 2806
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2808
    :cond_3
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2809
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    const v1, 0x7f0d0027

    invoke-static {v1}, Lkik/android/chat/KikApplication;->d(I)I

    move-result v1

    const/4 v2, 0x0

    new-instance v3, Lkik/android/chat/fragment/eb;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/eb;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const-wide/16 v4, 0x12c

    const-wide/16 v6, 0x0

    invoke-static/range {v0 .. v7}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;JJ)Landroid/animation/Animator;

    move-result-object v0

    .line 2823
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2826
    :cond_4
    new-instance v0, Lkik/android/chat/fragment/ec;

    invoke-direct {v0, p0, v8}, Lkik/android/chat/fragment/ec;-><init>(Lkik/android/chat/fragment/KikChatFragment;Z)V

    invoke-virtual {v10, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 2843
    invoke-virtual {v10, v9}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 2844
    invoke-virtual {v10}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_0

    .line 2848
    :cond_5
    sget v0, Lkik/android/chat/fragment/KikChatFragment$c;->b:I

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    .line 2849
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v11}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2850
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 2851
    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bc:I

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 2852
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2853
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->f(Z)V

    .line 2854
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->b:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 2855
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->an()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2856
    new-array v0, v12, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    aput-object v1, v0, v11

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto/16 :goto_0
.end method

.method private e(Ljava/lang/String;)Lcom/kik/android/a$f;
    .locals 9

    .prologue
    .line 4111
    const-wide/16 v6, 0x0

    .line 4113
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 4114
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->lastElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v0

    sub-long v0, v2, v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v2

    .line 4117
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "kikteam@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    .line 4118
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v4

    .line 4119
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v3

    .line 4120
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v5

    .line 4121
    if-eqz p1, :cond_1

    invoke-static {p1}, Lkik/a/h/i;->f(Ljava/lang/String;)I

    move-result v8

    .line 4123
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Message Sent"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-static/range {v1 .. v8}, Lkik/android/util/by;->a(Lcom/kik/android/a$f;ZZZZDI)Lcom/kik/android/a$f;

    move-result-object v0

    return-object v0

    .line 4121
    :cond_1
    const/4 v8, 0x0

    goto :goto_0
.end method

.method private static e(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 5521
    if-nez p0, :cond_0

    .line 5522
    const/4 v0, 0x0

    .line 5531
    :goto_0
    return-object v0

    .line 5524
    :cond_0
    const-string v0, "com.kik.ext.camera"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5525
    const-string v0, "Camera"

    goto :goto_0

    .line 5527
    :cond_1
    const-string v0, "com.kik.ext.gallery"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5528
    const-string v0, "Gallery"

    goto :goto_0

    .line 5531
    :cond_2
    const-string v0, "Card"

    goto :goto_0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    return-object v0
.end method

.method private e(I)V
    .locals 3

    .prologue
    .line 2085
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    if-eq v0, p1, :cond_0

    .line 2086
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    .line 2087
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 2088
    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0}, Lkik/android/widget/TabIconImageView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 2106
    :cond_0
    :goto_0
    return-void

    .line 2092
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2093
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const v1, 0x7f07002e

    invoke-virtual {v0, v1}, Lkik/android/widget/TabIconImageView;->setImageResource(I)V

    .line 2094
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const-string v1, "AUTOMATION_MEDIA_TRAY_COLLAPSE"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 2096
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->av()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2097
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Lkik/a/d/f;Lkik/a/d/s;)V

    goto :goto_0

    .line 2101
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const v1, 0x7f070041

    invoke-virtual {v0, v1}, Lkik/android/widget/TabIconImageView;->setImageResource(I)V

    .line 2102
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const-string v1, "AUTOMATION_MEDIA_TRAY_EXPAND"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->e(I)V

    return-void
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 228
    new-instance v0, Lkik/android/chat/fragment/dx;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/fragment/dx;-><init>(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method private e(Z)V
    .locals 3

    .prologue
    .line 2984
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aW:Z

    if-eq v0, p1, :cond_0

    .line 2985
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aW:Z

    .line 2986
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    invoke-virtual {v0, p1}, Lkik/android/widget/DarkFrameLayout;->a(Z)V

    .line 2987
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v0, p1}, Lkik/android/widget/DarkLinearLayout;->a(Z)V

    .line 2988
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0, p1}, Lkik/android/widget/TabIconImageView;->a(Z)V

    .line 2989
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->tabs:Lkik/android/widget/PagerIconTabs;

    invoke-virtual {v0, p1}, Lkik/android/widget/PagerIconTabs;->a(Z)V

    .line 2991
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aW:Z

    if-eqz v0, :cond_1

    const/high16 v0, -0x1000000

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v2, v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    if-eqz v2, :cond_0

    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    invoke-virtual {v0, v1}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(I)V

    .line 2993
    :cond_0
    return-void

    .line 2991
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->y()I

    move-result v0

    move v1, v0

    goto :goto_0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->E:Z

    return p1
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2403
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->K:Ljava/lang/String;

    return-object v0
.end method

.method private f(I)V
    .locals 2

    .prologue
    .line 3011
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 3012
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 3013
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->rootLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3014
    return-void
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bk:Z

    return-void
.end method

.method private f(Z)V
    .locals 11

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 3130
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3131
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3132
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 3134
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3135
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 3139
    :cond_2
    if-eqz p1, :cond_5

    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3140
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    const/16 v2, 0x12c

    invoke-static {v0, v2}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    .line 3141
    iget-object v9, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    new-instance v10, Lkik/android/chat/fragment/ei;

    invoke-direct {v10, p0}, Lkik/android/chat/fragment/ei;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    if-eqz v9, :cond_3

    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/high16 v2, -0x40800000    # -1.0f

    move v3, v1

    move v5, v1

    move v6, v4

    move v7, v1

    move v8, v4

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v0, v10}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3159
    :cond_3
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-nez v0, :cond_4

    .line 3160
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const/16 v1, 0x64

    const-wide/16 v2, 0x12c

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/util/av;->a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V

    .line 3173
    :cond_4
    :goto_0
    return-void

    .line 3164
    :cond_5
    new-array v0, v1, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    aput-object v2, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 3166
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-nez v0, :cond_6

    .line 3168
    new-array v0, v1, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    aput-object v2, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 3170
    :cond_6
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikChatFragment;I)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 228
    const/16 v0, 0xaa

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    invoke-virtual {v0}, Lkik/android/widget/BugmeBarView;->b()I

    move-result v0

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    invoke-virtual {v3}, Lkik/android/widget/BugmeBarView;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v1

    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v3

    if-nez v3, :cond_1

    sub-int v0, p1, v0

    if-le v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aV:Z

    return p1
.end method

.method private g(I)V
    .locals 11

    .prologue
    const v10, 0x7f09031e

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 4133
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->u()V

    .line 4135
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-eqz v0, :cond_b

    .line 4136
    sget v6, Lkik/a/d/s$a;->a:I

    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->k()Lkik/a/d/a/a;

    move-result-object v7

    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-eqz v0, :cond_0

    if-nez v7, :cond_2

    :cond_0
    sput-object v9, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    .line 4143
    :cond_1
    :goto_0
    return-void

    .line 4136
    :cond_2
    const-string v0, "int-file-url-local"

    invoke-virtual {v7, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "file-size"

    invoke-virtual {v7, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "int-file-state"

    invoke-virtual {v7, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-boolean v3, Lkik/android/chat/fragment/KikChatFragment;->O:Z

    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    const-string v3, "1"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v7}, Lkik/a/d/a/a;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Lkik/android/util/ak;->a(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v2, v0

    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v7}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/f/a/f;->a(Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v8, 0x7f030041

    invoke-static {v0, v8, v9}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    const v0, 0x7f0e00f3

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {v1, v8}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/view/View;)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v8, 0x7f09003c

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lkik/a/h/i;->a(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v5

    invoke-static {v8, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    new-instance v2, Lkik/android/chat/fragment/fc;

    invoke-direct {v2, p0, v7, v0, v6}, Lkik/android/chat/fragment/fc;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Landroid/widget/CheckBox;I)V

    invoke-virtual {v1, v10, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    const v0, 0x7f090299

    new-instance v2, Lkik/android/chat/fragment/fd;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/fd;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {v1, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v1, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "contentUpload"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v2, v0

    goto :goto_1

    :cond_4
    invoke-virtual {v7}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v0

    sget-object v1, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v0, v1}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lkik/android/chat/KikApplication;->d()Lkik/android/util/bo;

    move-result-object v0

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    invoke-virtual {v0, v1}, Lkik/android/util/bo;->b(Lkik/a/d/s;)V

    :goto_2
    sput-object v9, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aD()V

    invoke-static {v7}, Lkik/android/util/ae;->c(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Lkik/android/util/ae;->d(Lkik/a/d/a/a;)Ljava/lang/String;

    invoke-virtual {v7}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_6

    const-string v0, "Camera"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "Gallery"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_5
    sget-object v0, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    invoke-virtual {v0}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v0

    :cond_6
    :goto_3
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_a

    move v1, v4

    :goto_4
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v3}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lkik/android/chat/fragment/KikChatFragment;->e(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    invoke-static {v3, v2, v1, v0, v7}, Lkik/android/util/by;->a(Lcom/kik/android/a$f;Ljava/lang/String;ZLjava/lang/String;Lkik/a/d/a/a;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Network Is Connected"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->l:Lkik/a/e/f;

    invoke-interface {v2}, Lkik/a/e/f;->k()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    invoke-virtual {v3}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Messaging Partners in Last 7 Days"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Messages Sent"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Session Ended"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Messages Sent"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->al:Z

    if-nez v0, :cond_7

    invoke-direct {p0, v6}, Lkik/android/chat/fragment/KikChatFragment;->g(I)V

    :cond_7
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-static {v7}, Lkik/android/f/a/f;->d(Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v7}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-static {v0, v1, v2, v3}, Lkik/android/util/ct;->a(Landroid/content/Context;Ljava/lang/String;Lkik/a/e/i;Lkik/a/e/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->n:Lcom/kik/l/ab;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-interface {v0, v7, v9, v9, v1}, Lcom/kik/l/ab;->a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    goto/16 :goto_0

    :cond_8
    invoke-static {}, Lkik/android/chat/KikApplication;->d()Lkik/android/util/bo;

    move-result-object v0

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    invoke-virtual {v0, v1}, Lkik/android/util/bo;->a(Lkik/a/d/s;)V

    goto/16 :goto_2

    :cond_9
    sget-object v0, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    invoke-virtual {v0}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    :cond_a
    move v1, v5

    goto/16 :goto_4

    .line 4140
    :cond_b
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 4141
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4142
    invoke-direct {p0, v0, v1, p1}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/text/Editable;Ljava/lang/String;I)V

    goto/16 :goto_0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 6

    .prologue
    .line 228
    if-ltz p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0}, Lcom/kik/view/adapters/au;->getCount()I

    move-result v0

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    if-nez v1, :cond_2

    const-wide/16 v2, 0x0

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-lez v1, :cond_0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0, p1}, Lcom/kik/view/adapters/au;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    invoke-virtual {v1}, Lkik/a/d/s;->e()J

    move-result-wide v2

    goto :goto_1
.end method

.method private g(Z)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 3177
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3178
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3179
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 3181
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3182
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/animation/Animation;->cancel()V

    .line 3184
    :cond_2
    if-eqz p1, :cond_4

    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3185
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0}, Lkik/android/widget/TabIconImageView;->clearAnimation()V

    .line 3186
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lkik/android/util/av;->b(Landroid/view/View;I)V

    .line 3187
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    invoke-static {v0}, Lkik/android/util/av;->b(Landroid/view/View;)V

    .line 3188
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    const/16 v1, 0x1f4

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/util/av;->a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V

    .line 3195
    :cond_3
    :goto_0
    return-void

    .line 3191
    :cond_4
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 3192
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaLayout:Landroid/view/ViewGroup;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    return v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->D:Z

    return p1
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    return v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikChatFragment;I)I
    .locals 0

    .prologue
    .line 228
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aN:I

    return p1
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->C:Z

    return p1
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikChatFragment;I)I
    .locals 0

    .prologue
    .line 228
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aO:I

    return p1
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aA()V

    return-void
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikChatFragment;Z)Z
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikChatFragment;->H:Z

    return p1
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikChatFragment;I)I
    .locals 0

    .prologue
    .line 228
    iput p1, p0, Lkik/android/chat/fragment/KikChatFragment;->aM:I

    return p1
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    return-object v0
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x64

    .line 228
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-super {p0, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->b(Landroid/view/View;)V

    const-string v0, "Attached"

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v1, Lkik/android/chat/fragment/gc;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/gc;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/widget/ImeAwareEditText;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v1, Lkik/android/chat/fragment/gd;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/gd;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/widget/ImeAwareEditText;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public static k()Lkik/a/d/a/a;
    .locals 2

    .prologue
    .line 4986
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    if-nez v0, :cond_0

    .line 4987
    const/4 v0, 0x0

    .line 4989
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    goto :goto_0
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->w()V

    return-void
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikChatFragment;I)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->g(I)V

    return-void
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/KikChatFragment;->c(Z)V

    return-void
.end method

.method static synthetic l(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ai()V

    return-void
.end method

.method static synthetic m()Lkik/a/d/k;
    .locals 1

    .prologue
    .line 228
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    return-object v0
.end method

.method static synthetic m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    return-object v0
.end method

.method static synthetic n()Landroid/text/Spannable;
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    return-object v0
.end method

.method static synthetic n(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    new-instance v1, Lkik/android/chat/fragment/ek;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ek;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/ResizeEventList;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic o()Lkik/a/d/s;
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    return-object v0
.end method

.method static synthetic o(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->X()Z

    move-result v0

    return v0
.end method

.method static synthetic p()Lkik/a/d/s;
    .locals 1

    .prologue
    .line 228
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->N:Lkik/a/d/s;

    return-object v0
.end method

.method static synthetic p(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    return-void
.end method

.method static synthetic q(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Z()V

    return-void
.end method

.method static synthetic q()Z
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x1

    sput-boolean v0, Lkik/android/chat/fragment/KikChatFragment;->O:Z

    return v0
.end method

.method static synthetic r(Lkik/android/chat/fragment/KikChatFragment;)I
    .locals 1

    .prologue
    .line 228
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aG:I

    return v0
.end method

.method private r()Z
    .locals 2

    .prologue
    .line 492
    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private s()V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    .line 1203
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aI:Z

    if-nez v0, :cond_0

    .line 1204
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aI:Z

    .line 1205
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    if-eqz v0, :cond_0

    .line 1206
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Opened"

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    .line 1208
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 1210
    :goto_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->au()Lkik/a/d/s;

    move-result-object v2

    .line 1211
    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v4

    .line 1212
    if-eqz v2, :cond_3

    if-eqz v4, :cond_3

    .line 1213
    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v5, v2}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v2

    .line 1214
    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v5, v4}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v4

    .line 1215
    sub-int v2, v4, v2

    .line 1218
    :goto_1
    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v5, "Chat Opened"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Is Kik Team"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v6}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v6

    const-string v7, "kikteam@"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Is Group"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    instance-of v6, v6, Lkik/a/d/n;

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Is Muted"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v6}, Lkik/a/d/f;->n()Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Is Contact"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v6}, Lkik/a/d/k;->l()Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Was Empty"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v6}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Vector;->isEmpty()Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "From New Message"

    iget-object v6, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    iget-object v7, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-virtual {v6, v7}, Lkik/a/d/f;->a(Lkik/a/e/r;)Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Unseen Messages"

    int-to-long v6, v2

    invoke-virtual {v4, v5, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v4, "Participants Count"

    int-to-long v6, v0

    invoke-virtual {v2, v4, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    .line 1228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->d()Lcom/kik/f/a/a/c;

    move-result-object v2

    invoke-static {v0, v2}, Lkik/android/f/a/f;->a(Landroid/content/Context;Lcom/kik/f/a/a/c;)Lcom/kik/f/a/a/a;

    move-result-object v0

    .line 1230
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->i()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    .line 1231
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Opened"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Content Link Shown"

    invoke-virtual {v0, v2, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1237
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Session Ended"

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Chat Opens"

    invoke-virtual {v0, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 1239
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Session Ended"

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1240
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Opened"

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kik/android/a;

    .line 1242
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Session Started"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Kik Team"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "kikteam@"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Group"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    instance-of v2, v2, Lkik/a/d/n;

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Muted"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->n()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Contact"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v2}, Lkik/a/d/k;->l()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Was Empty"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->isEmpty()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "From New Message"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-virtual {v2, v3}, Lkik/a/d/f;->a(Lkik/a/e/r;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1253
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 1208
    goto/16 :goto_0

    .line 1234
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Opened"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Content Link Shown"

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_2

    :cond_3
    move v2, v3

    goto/16 :goto_1
.end method

.method static synthetic s(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ax()V

    return-void
.end method

.method private t()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    .line 1257
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aI:Z

    if-eqz v0, :cond_0

    .line 1258
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aI:Z

    .line 1260
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Closed"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    .line 1261
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Closed"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Muted"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->n()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 1263
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Chat Opened"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Chat Closed"

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v4}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    .line 1265
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Closed"

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 1267
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Chat Session Ended"

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v3}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Smiley Tray Opened"

    invoke-virtual {v1, v2}, Lcom/kik/android/a$f;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Media Tray Opened"

    invoke-virtual {v1, v2}, Lcom/kik/android/a$f;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Chat Opens"

    invoke-virtual {v1, v2, v6, v7}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Messages Sent"

    invoke-virtual {v1, v2, v6, v7}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Messages Received"

    invoke-virtual {v1, v2, v6, v7}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Total Time"

    float-to-double v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Muted"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->n()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1277
    :cond_0
    return-void
.end method

.method static synthetic t(Lkik/android/chat/fragment/KikChatFragment;)Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    return v0
.end method

.method private u()V
    .locals 3

    .prologue
    .line 1833
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1834
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1833
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1836
    :cond_0
    return-void
.end method

.method static synthetic u(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aI()V

    return-void
.end method

.method static synthetic v(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aw()V

    return-void
.end method

.method static synthetic w(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/BugmeBarView;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    return-object v0
.end method

.method private w()V
    .locals 6

    .prologue
    .line 1993
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v1, 0x7f0e001e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1996
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    instance-of v1, v1, Lkik/a/d/n;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1997
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    check-cast v1, Lkik/a/d/n;

    .line 1998
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    check-cast v2, Lkik/a/d/n;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-static {v2, v3}, Lkik/android/util/cq;->a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1999
    invoke-virtual {v1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    .line 2000
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-static {v0, v1}, Lkik/android/util/cq;->a(Ljava/util/List;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v0

    .line 2007
    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    invoke-virtual {v2}, Lkik/android/widget/RobotoTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090229

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/widget/RobotoTextView;->setText(Ljava/lang/CharSequence;)V

    .line 2008
    return-void

    .line 2003
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    .line 2005
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const v1, 0x7f090202

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object v0, v2

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_1
.end method

.method static synthetic x(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ContentLinkView;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    return-object v0
.end method

.method private x()Z
    .locals 2

    .prologue
    .line 2224
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic y(Lkik/android/chat/fragment/KikChatFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic z(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/f;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    return-object v0
.end method

.method private z()Z
    .locals 2

    .prologue
    .line 2252
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v0

    sget v1, Lcom/kik/ui/fragment/FragmentBase$a$a;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final A()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 5303
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->az()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v1, :cond_2

    .line 5304
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aa()V

    .line 5305
    const-string v1, "Outside"

    invoke-direct {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->d(Ljava/lang/String;)V

    .line 5306
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5307
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    .line 5323
    :goto_0
    return v0

    .line 5309
    :cond_0
    iget-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v1, :cond_1

    const-string v1, "GIF"

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    iget v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aZ:I

    invoke-virtual {v2, v3}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ba:Lkik/android/widget/bn;

    sget-object v2, Lkik/android/widget/bn;->c:Lkik/android/widget/bn;

    if-ne v1, v2, :cond_1

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5313
    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Z)V

    goto :goto_0

    .line 5319
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;)V

    goto :goto_0

    .line 5323
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final B()Z
    .locals 2

    .prologue
    .line 2258
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v0

    sget v1, Lcom/kik/ui/fragment/FragmentBase$a$a;->a:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final C()I
    .locals 1

    .prologue
    .line 4791
    const/16 v0, 0x10

    return v0
.end method

.method protected final I()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 5215
    .line 5216
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v0, :cond_2

    .line 5217
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->hasWindowFocus()Z

    move-result v0

    .line 5219
    :goto_0
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->I()Z

    move-result v2

    if-nez v2, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 4490
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->j()V

    .line 4491
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 5225
    sub-int v0, p2, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    if-ge v0, v1, :cond_1

    .line 5233
    :cond_0
    :goto_0
    return-void

    .line 5230
    :cond_1
    if-eqz p2, :cond_0

    .line 5231
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method public final a(Landroid/content/ComponentName;)V
    .locals 3

    .prologue
    .line 5329
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;)V

    .line 5331
    new-instance v0, Landroid/content/Intent;

    const v1, 0x7f0901b5

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5332
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    .line 5333
    if-eqz v1, :cond_0

    .line 5334
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v2, v1}, Lkik/android/f/a/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5335
    const-string v2, "com.kik.platform.content.EXTRA_CONVO_ID"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5336
    const-string v1, "com.kik.platform.key.intenttype"

    const-string v2, "com.kik.platform.intent.launchrequest"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5338
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 5339
    const/high16 v1, 0x200000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 5340
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 5341
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 4772
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4786
    :cond_0
    :goto_0
    return-void

    .line 4775
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaShadow:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4776
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aa()V

    .line 4777
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    .line 4778
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v0, :cond_2

    .line 4779
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->af()V

    .line 4784
    :goto_1
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 4785
    invoke-super {p0, p1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Landroid/view/View;Z)V

    goto :goto_0

    .line 4782
    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Y()V

    goto :goto_1
.end method

.method public final a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V
    .locals 2

    .prologue
    .line 5642
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->c:Lcom/kik/cache/ad;

    invoke-static {v0, p1, v1}, Lkik/android/f/a/ae;->a(Landroid/app/Activity;Lcom/kik/cards/web/kik/KikMessageParcelable;Lcom/kik/cache/ad;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ge;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ge;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 5667
    return-void
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 2031
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lcom/kik/g/f;)V

    .line 2033
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bs:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2034
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->h()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bw:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2035
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->i()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bx:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2036
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bz:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2037
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    if-eqz v0, :cond_0

    .line 2038
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    invoke-virtual {v0}, Lkik/android/widget/TalkToCoverView;->a()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aa:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2040
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 5393
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 5395
    if-eqz v1, :cond_0

    .line 5397
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 5400
    :try_start_0
    const-string v0, "kik"

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5406
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->i(Lkik/android/chat/fragment/KikChatFragment$a;)I

    move-result v0

    .line 5407
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    .line 5408
    new-instance v3, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v3}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    .line 5409
    invoke-virtual {v3, p1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v4

    invoke-static {p1}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v4

    new-instance v5, Lcom/kik/cards/web/picker/PickerRequest;

    const-string v6, "conversations"

    invoke-direct {v5, v6, v2}, Lcom/kik/cards/web/picker/PickerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {v4, v5}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v4}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/kik/cards/web/CardsWebViewFragment$a;->d(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    const-string v4, "https://kik.com/"

    invoke-virtual {v2, v4}, Lcom/kik/cards/web/CardsWebViewFragment$a;->c(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->g()Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 5416
    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v2}, Lkik/android/widget/ImeAwareEditText;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v3, v2}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v2

    .line 5418
    sput-boolean v7, Lkik/android/chat/fragment/KikChatFragment;->J:Z

    sput v0, Lkik/android/chat/fragment/KikChatFragment;->L:I

    sput-object p1, Lkik/android/chat/fragment/KikChatFragment;->K:Ljava/lang/String;

    .line 5419
    iput-boolean v7, p0, Lkik/android/chat/fragment/KikChatFragment;->aL:Z

    .line 5424
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v3}, Lkik/android/chat/fragment/KikChatFragment;->d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v3, v4}, Lkik/android/chat/ak;->a(Lkik/android/chat/fragment/KikChatFragment$b;Lkik/a/d/k;)V

    .line 5425
    new-instance v3, Lkik/android/chat/fragment/ga;

    invoke-direct {v3, p0, v0, v1, p1}, Lkik/android/chat/fragment/ga;-><init>(Lkik/android/chat/fragment/KikChatFragment;ILandroid/support/v4/app/FragmentActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 5456
    :cond_0
    return-void

    .line 5402
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 5461
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Smiley Tapped in Conversation"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Smiley Category"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Smiley Identifier"

    invoke-virtual {v0, v1, p2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 5462
    invoke-virtual {p0, p3}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;)V

    .line 5463
    return-void
.end method

.method public final a(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 4858
    if-eqz p1, :cond_0

    .line 4859
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    iget-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->an:Z

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    .line 4861
    :cond_0
    :goto_0
    return-void

    .line 4859
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 4356
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Z)V

    .line 4358
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4359
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ax()V

    .line 4361
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 5620
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_2

    .line 5621
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    invoke-virtual {v1}, Lkik/android/widget/dl;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5622
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    .line 5636
    :goto_0
    return v0

    .line 5625
    :cond_0
    iget-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    if-eqz v1, :cond_1

    .line 5626
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    goto :goto_0

    .line 5631
    :cond_1
    iget-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v1, :cond_2

    .line 5632
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;)V

    goto :goto_0

    .line 5636
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 4759
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bk:Z

    if-eqz v0, :cond_0

    .line 4767
    :goto_0
    return-void

    .line 4762
    :cond_0
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Z)V

    .line 4763
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aa()V

    .line 4764
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bl:Z

    .line 4765
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->b(Landroid/view/View;)V

    .line 4766
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    goto :goto_0
.end method

.method protected final b(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 2013
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->b(Lcom/kik/g/f;)V

    .line 2015
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    .line 2017
    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->o()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bu:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2018
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->g()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bv:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2019
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->k()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bp:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2020
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->b()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bo:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2021
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bq:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2022
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->e:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bq:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2023
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->p()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->by:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2024
    invoke-static {}, Lcom/kik/android/c/f;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bt:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2025
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->e:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->br:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 2026
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 5468
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->q:Lcom/kik/android/c/f;

    invoke-virtual {v0, p1}, Lcom/kik/android/c/f;->b(Ljava/lang/String;)Lcom/kik/android/c/e;

    move-result-object v0

    .line 5469
    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    if-nez v1, :cond_1

    .line 5483
    :cond_0
    :goto_0
    return-void

    .line 5473
    :cond_1
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 5474
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Lcom/kik/android/c/e;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 5475
    const-string v0, " "

    invoke-virtual {v3, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 5477
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getSelectionStart()I

    move-result v2

    .line 5478
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getSelectionEnd()I

    move-result v4

    .line 5479
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 5480
    if-eqz v0, :cond_0

    .line 5481
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    invoke-interface/range {v0 .. v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    goto :goto_0
.end method

.method public final b(Z)V
    .locals 2

    .prologue
    .line 4915
    if-eqz p1, :cond_0

    const/4 v0, 0x5

    .line 4916
    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 4917
    return-void

    .line 4915
    :cond_0
    const/4 v0, 0x4

    goto :goto_0
.end method

.method public final e()V
    .locals 0

    .prologue
    .line 3655
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ao()V

    .line 3656
    return-void
.end method

.method public final g()V
    .locals 5

    .prologue
    .line 2675
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 2676
    if-eqz v0, :cond_0

    .line 2677
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;)V

    .line 2678
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aB:Ljava/io/File;

    invoke-static {v0}, Lkik/android/util/t;->b(Ljava/io/File;)Landroid/content/Intent;

    move-result-object v0

    .line 2679
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->n()Lkik/a/e/h;

    move-result-object v1

    new-instance v2, Lkik/a/d/t;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->aB:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lkik/a/d/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lkik/a/e/h;->a(Lkik/a/d/t;)V

    .line 2680
    const/16 v1, 0x11

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2682
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 5

    .prologue
    .line 2686
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 2687
    if-eqz v0, :cond_0

    .line 2688
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment$b;)V

    .line 2689
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aB:Ljava/io/File;

    invoke-static {v0}, Lkik/android/util/t;->a(Ljava/io/File;)Landroid/content/Intent;

    move-result-object v0

    .line 2690
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->n()Lkik/a/e/h;

    move-result-object v1

    new-instance v2, Lkik/a/d/t;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->aB:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lkik/a/d/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lkik/a/e/h;->a(Lkik/a/d/t;)V

    .line 2691
    const/16 v1, 0xcb

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2693
    :cond_0
    return-void
.end method

.method public final i()Lkik/a/d/k;
    .locals 1

    .prologue
    .line 4351
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    return-object v0
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 4562
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->X()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4573
    :goto_0
    return-void

    .line 4566
    :cond_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-eqz v0, :cond_1

    .line 4567
    const-string v0, "Outside"

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Ljava/lang/String;)V

    .line 4568
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Landroid/view/View;)V

    goto :goto_0

    .line 4571
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final l()V
    .locals 0

    .prologue
    .line 5346
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aI()V

    .line 5347
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 4881
    const/16 v0, 0x11

    if-ne p1, v0, :cond_0

    if-ne p2, v1, :cond_0

    .line 4882
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 4894
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 4895
    return-void

    .line 4884
    :cond_0
    const/16 v0, 0xcb

    if-ne p1, v0, :cond_1

    if-ne p2, v1, :cond_1

    .line 4885
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    .line 4888
    :cond_1
    const/16 v0, 0x285e

    if-eq p1, v0, :cond_2

    const/16 v0, 0x285f

    if-ne p1, v0, :cond_3

    :cond_2
    if-eq p2, v1, :cond_4

    :cond_3
    const/16 v0, 0x2860

    if-ne p1, v0, :cond_5

    if-ne p2, v1, :cond_5

    .line 4889
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->h:Lkik/a/e/n;

    invoke-virtual {v0, p1, p2, p3, v1}, Lkik/android/widget/BugmeBarView;->a(IILandroid/content/Intent;Lkik/a/e/n;)V

    goto :goto_0

    .line 4892
    :cond_5
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bn:Z

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1282
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 1283
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5238
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    .line 5239
    const/4 v0, 0x1

    .line 5240
    iget v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aF:I

    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v2, v3, :cond_0

    .line 5244
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    move v0, v1

    .line 5247
    :cond_0
    iget v2, p1, Landroid/content/res/Configuration;->orientation:I

    iput v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aF:I

    .line 5248
    iget-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aR:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lkik/android/chat/fragment/KikChatFragment;->bf:Z

    if-eqz v2, :cond_6

    .line 5249
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ad()I

    move-result v2

    .line 5250
    if-nez v0, :cond_4

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aH:I

    sget v3, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    if-ne v0, v3, :cond_3

    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->r()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bf:Z

    if-eqz v0, :cond_4

    .line 5251
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_contentFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v3, Lkik/android/chat/fragment/fz;

    invoke-direct {v3, p0, v2}, Lkik/android/chat/fragment/fz;-><init>(Lkik/android/chat/fragment/KikChatFragment;I)V

    invoke-virtual {v0, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 5272
    :cond_4
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v1, 0x8

    .line 5273
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    invoke-virtual {v0, v1}, Lkik/android/widget/TabIconImageView;->setVisibility(I)V

    .line 5276
    :cond_6
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 5277
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 10

    .prologue
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x1

    .line 3303
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 3304
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkik/a/d/s;

    .line 3306
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 3392
    :cond_0
    :goto_0
    return v9

    .line 3309
    :pswitch_0
    invoke-virtual {v2}, Lkik/a/d/s;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-virtual {v2}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3310
    const v0, 0x7f090056

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    .line 3315
    :goto_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2, v0}, Lcom/kik/m/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 3313
    :cond_1
    invoke-virtual {v2}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 3318
    :pswitch_1
    invoke-direct {p0, v2, v9}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/s;Z)V

    goto :goto_0

    .line 3321
    :pswitch_2
    const-class v0, Lkik/a/d/a/a;

    invoke-static {v2, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 3323
    const-string v1, "Message Delete Tapped"

    invoke-direct {p0, v1, v2, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Ljava/lang/String;Lkik/a/d/s;Lkik/a/d/a/a;)V

    .line 3324
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 3326
    new-instance v3, Lkik/android/chat/fragment/el;

    invoke-direct {v3, p0, v2, v0}, Lkik/android/chat/fragment/el;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;Lkik/a/d/a/a;)V

    .line 3340
    const v0, 0x7f0900b3

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v2

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0900b2

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v2, 0x7f090299

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v2, 0x7f0902a9

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 3346
    iget-object v0, v1, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->a:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "dialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto :goto_0

    .line 3340
    :cond_2
    const v0, 0x7f0900b1

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    new-array v4, v9, [Ljava/lang/Object;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v5}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 3349
    :pswitch_3
    const-class v0, Lkik/a/d/a/a;

    invoke-static {v2, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 3350
    if-eqz v1, :cond_0

    .line 3351
    invoke-static {v1}, Lkik/android/f/a/f;->d(Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3352
    invoke-virtual {v2}, Lkik/a/d/s;->o()[B

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->n:Lcom/kik/l/ab;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f0900c9

    invoke-virtual {p0, v4}, Lkik/android/chat/fragment/KikChatFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    :cond_3
    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->n:Lcom/kik/l/ab;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-interface {v3, v1, v0, v5, v4}, Lcom/kik/l/ab;->a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v3, Lkik/android/chat/fragment/eq;

    invoke-direct {v3, p0, v1, v2}, Lkik/android/chat/fragment/eq;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Z)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_0

    .line 3355
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lkik/a/e/v;->u(Ljava/lang/String;)Z

    move-result v8

    .line 3356
    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v0

    invoke-virtual {v2}, Lkik/a/d/s;->o()[B

    move-result-object v2

    invoke-virtual {v1}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->b:Lcom/kik/cache/ad;

    sget-object v6, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    iget-object v7, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v7}, Lkik/android/util/a;->a(Lkik/a/d/a/a;[BLjava/lang/String;Lcom/kik/cache/ad;Lcom/kik/cache/ContentImageView;Lcom/android/volley/r$a;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    .line 3359
    if-eqz v0, :cond_0

    .line 3360
    new-instance v2, Lkik/android/chat/fragment/en;

    invoke-direct {v2, p0, v1, v8}, Lkik/android/chat/fragment/en;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;Z)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_0

    .line 3306
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1164
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 1165
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 1166
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    .line 1167
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->e:Lkik/a/e/l;

    invoke-interface {v0, v1, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    .line 1169
    new-instance v0, Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/view/adapters/MediaTrayTabAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    .line 1170
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->R:Ljava/util/UUID;

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->P:Ljava/util/UUID;

    .line 1171
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aF:I

    .line 1172
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-nez v0, :cond_3

    .line 1173
    :cond_0
    :goto_1
    return-void

    .line 1167
    :cond_1
    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 1172
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/d/f;->v()V

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 19

    .prologue
    .line 1304
    const v2, 0x7f030005

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    .line 1305
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 1307
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    .line 1308
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bB:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1309
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d001c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    .line 1311
    new-instance v2, Lkik/android/b/g;

    invoke-direct {v2}, Lkik/android/b/g;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aA:Lkik/android/b/g;

    .line 1313
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1314
    const/4 v2, 0x1

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v5, 0x7f0e001b

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1317
    :cond_0
    new-instance v2, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    .line 1318
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->bg:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c001f

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1320
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e01af

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/ImeAwareEditText;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    .line 1321
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Lkik/android/widget/ImeAwareEditText;->setImeOptions(I)V

    .line 1322
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lkik/android/widget/ImeAwareEditText;->a(Lkik/android/widget/ImeAwareEditText$b;)V

    .line 1324
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lkik/android/widget/ImeAwareEditText;->a(Lkik/android/widget/ImeAwareEditText$a;)V

    .line 1325
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e01ae

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ar:Landroid/widget/LinearLayout;

    .line 1326
    new-instance v2, Lkik/android/util/ad;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    move-object/from16 v0, p0

    invoke-direct {v2, v3, v0}, Lkik/android/util/ad;-><init>(Landroid/widget/EditText;Lkik/android/e/f;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aj:Lkik/android/util/ad;

    .line 1328
    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aF:I

    .line 1331
    const-string v2, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 1333
    new-instance v2, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    const-string v4, "chatTemp"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1338
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1339
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 1341
    :cond_1
    new-instance v3, Ljava/io/File;

    const-string v4, ".noMedia"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1343
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1346
    :goto_1
    new-instance v3, Ljava/io/File;

    const-string v4, "temp"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aB:Ljava/io/File;

    .line 1350
    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v2}, Lkik/android/chat/KikApplication;->b(I)I

    move-result v2

    const/16 v3, 0x140

    if-gt v2, v3, :cond_2

    .line 1351
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v3}, Lkik/android/widget/ImeAwareEditText;->getTextSize()F

    move-result v3

    float-to-int v3, v3

    invoke-static {v3}, Lkik/android/chat/KikApplication;->b(I)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Lkik/android/widget/ImeAwareEditText;->setTextSize(F)V

    .line 1354
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v2}, Lkik/android/widget/ImeAwareEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "status_bar_height"

    const-string v4, "dimen"

    const-string v5, "android"

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/chat/fragment/KikChatFragment;->be:I

    :cond_3
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->aH()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/fragment/KikChatFragment;->be:I

    sub-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/chat/fragment/KikChatFragment;->bb:I

    .line 1355
    :goto_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e001b

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v18

    .line 1356
    if-eqz v18, :cond_4

    .line 1357
    new-instance v2, Lkik/android/chat/fragment/cq;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lkik/android/chat/fragment/cq;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1371
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e0027

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/ResizeEventList;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    .line 1372
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bG:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {v2, v3}, Lkik/android/widget/ResizeEventList;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1374
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    if-nez v2, :cond_5

    .line 1375
    new-instance v2, Lcom/kik/view/adapters/au;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->V:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/fragment/KikChatFragment;->ac:Ljava/util/Vector;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/fragment/KikChatFragment;->X:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/fragment/KikChatFragment;->Z:Landroid/view/View$OnClickListener;

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/fragment/KikChatFragment;->Y:Lkik/android/util/bw$a;

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/chat/fragment/KikChatFragment;->U:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v10, v0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    move-object/from16 v0, p0

    iget-object v11, v0, Lkik/android/chat/fragment/KikChatFragment;->a:Lcom/kik/cache/ad;

    move-object/from16 v0, p0

    iget-object v13, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v14, v0, Lkik/android/chat/fragment/KikChatFragment;->h:Lkik/a/e/n;

    move-object/from16 v0, p0

    iget-object v15, v0, Lkik/android/chat/fragment/KikChatFragment;->i:Lkik/a/f/k;

    move-object/from16 v0, p0

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->r:Lkik/android/chat/b/d;

    move-object/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->V()Lcom/kik/e/a;

    move-result-object v17

    move-object/from16 v12, p0

    invoke-direct/range {v2 .. v17}, Lcom/kik/view/adapters/au;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/Vector;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Ljava/util/ArrayList;Lkik/a/e/r;Lcom/kik/cache/ad;Lkik/android/e/f;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    .line 1376
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/au;->a(Lcom/kik/view/adapters/au$b;)V

    .line 1379
    :cond_5
    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    .line 1381
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bH:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1382
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_scrollToLastReadButton:Landroid/widget/Button;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bI:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1383
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e0020

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/RobotoTextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    .line 1384
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e0022

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/BugmeBarView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    .line 1385
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e0023

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/ContentLinkView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    .line 1386
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aA:Lkik/android/b/g;

    invoke-virtual {v2, v3}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/b/g;)V

    .line 1387
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-virtual {v2, v3}, Lkik/android/widget/ContentLinkView;->a(Lcom/kik/android/a;)V

    .line 1388
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v3

    invoke-virtual {v2, v3}, Lkik/android/widget/ContentLinkView;->a(I)V

    .line 1389
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->m:Lkik/a/e/w;

    invoke-virtual {v2, v3}, Lkik/android/widget/BugmeBarView;->a(Lkik/a/e/w;)V

    .line 1390
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-virtual {v2, v3}, Lkik/android/widget/BugmeBarView;->a(Lkik/a/e/v;)V

    .line 1391
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->h:Lkik/a/e/n;

    invoke-virtual {v2, v3}, Lkik/android/widget/BugmeBarView;->a(Lkik/a/e/n;)V

    .line 1392
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->i:Lkik/a/f/k;

    invoke-virtual {v2, v3}, Lkik/android/widget/BugmeBarView;->a(Lkik/a/f/k;)V

    .line 1393
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    new-instance v3, Lkik/android/chat/fragment/cr;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/cr;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/widget/BugmeBarView;->a(Lcom/kik/h/c;)V

    .line 1408
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-nez v2, :cond_14

    const/4 v2, 0x1

    :goto_3
    invoke-virtual {v3, v2}, Lkik/android/widget/BugmeBarView;->a(Z)V

    .line 1409
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lkik/android/widget/BugmeBarView;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 1412
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_topBar:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->bringToFront()V

    .line 1413
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    if-eqz v2, :cond_6

    .line 1414
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->m:Lkik/a/e/w;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/fragment/KikChatFragment;->l:Lkik/a/e/f;

    invoke-virtual/range {v2 .. v7}, Lkik/android/widget/TalkToCoverView;->a(Lcom/kik/android/a;Lkik/a/e/w;Lkik/a/e/r;Lkik/a/e/i;Lkik/a/e/f;)V

    .line 1415
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    invoke-virtual {v2}, Lkik/android/widget/TalkToCoverView;->bringToFront()V

    .line 1417
    :cond_6
    if-eqz v18, :cond_7

    .line 1418
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->bringToFront()V

    .line 1420
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    if-eqz v2, :cond_8

    .line 1421
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->av:Lkik/android/widget/BugmeBarView;

    invoke-virtual {v2}, Lkik/android/widget/BugmeBarView;->bringToFront()V

    .line 1423
    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    if-eqz v2, :cond_9

    .line 1424
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aw:Lkik/android/widget/ContentLinkView;

    invoke-virtual {v2}, Lkik/android/widget/ContentLinkView;->bringToFront()V

    .line 1427
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Lkik/android/widget/ResizeEventList;->a(Lkik/android/util/cu;)V

    .line 1429
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bD:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Lkik/android/widget/TabIconImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1431
    new-instance v2, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1432
    new-instance v3, Landroid/widget/AbsListView$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, 0x5

    invoke-static {v5}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1433
    new-instance v3, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1434
    new-instance v4, Landroid/widget/AbsListView$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, 0x7

    invoke-static {v6}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    invoke-direct {v4, v5, v6}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1436
    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v4, v2, v5, v6}, Lkik/android/widget/ResizeEventList;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 1437
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lkik/android/widget/ResizeEventList;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 1438
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->au:Lkik/android/widget/RobotoTextView;

    new-instance v3, Lkik/android/chat/fragment/ct;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/ct;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/widget/RobotoTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1445
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v2, v8}, Lkik/android/widget/ResizeEventList;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1446
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    new-instance v3, Lkik/android/chat/fragment/cu;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/cu;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/widget/ResizeEventList;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 1505
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-nez v2, :cond_15

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentButtonSpacer:Landroid/view/View;

    aput-object v4, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->ae:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Lkik/android/widget/DarkFrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1507
    :goto_4
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-nez v2, :cond_b

    .line 1508
    new-instance v3, Lkik/android/chat/fragment/KikChatFragment$d;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/KikChatFragment$d;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    if-eqz p3, :cond_16

    const-string v2, "CurrentTabState"

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    :goto_5
    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    const-string v5, "Gallery"

    const v6, 0x7f070049

    new-instance v7, Lkik/android/widget/GalleryWidget;

    invoke-direct {v7}, Lkik/android/widget/GalleryWidget;-><init>()V

    invoke-virtual {v4, v5, v6, v7}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(Ljava/lang/String;ILandroid/support/v4/app/Fragment;)V

    invoke-static {}, Lkik/android/util/u;->a()I

    move-result v4

    if-lez v4, :cond_a

    new-instance v4, Lkik/android/chat/fragment/CameraFragment;

    invoke-direct {v4}, Lkik/android/chat/fragment/CameraFragment;-><init>()V

    new-instance v5, Lkik/android/chat/fragment/dk;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lkik/android/chat/fragment/dk;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v4, v5}, Lkik/android/chat/fragment/CameraFragment;->a(Lkik/android/chat/fragment/CameraFragment$c;)V

    new-instance v5, Lkik/android/chat/fragment/dl;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Lkik/android/chat/fragment/dl;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v4, v5}, Lkik/android/chat/fragment/CameraFragment;->a(Lkik/android/e/c;)V

    invoke-virtual {v4, v3}, Lkik/android/chat/fragment/CameraFragment;->a(Lkik/android/chat/fragment/KikChatFragment$d;)V

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    const-string v6, "Camera"

    const v7, 0x7f070022

    invoke-virtual {v5, v6, v7, v4}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(Ljava/lang/String;ILandroid/support/v4/app/Fragment;)V

    :cond_a
    new-instance v4, Lkik/android/widget/GifWidget;

    invoke-direct {v4}, Lkik/android/widget/GifWidget;-><init>()V

    invoke-virtual {v4, v3}, Lkik/android/widget/GifWidget;->a(Lkik/android/chat/fragment/KikChatFragment$d;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    const-string v5, "GIF"

    const v6, 0x7f07004c

    invoke-virtual {v3, v5, v6, v4}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(Ljava/lang/String;ILandroid/support/v4/app/Fragment;)V

    new-instance v3, Lkik/android/widget/WebTrayWidget;

    invoke-direct {v3}, Lkik/android/widget/WebTrayWidget;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v5, 0x7f0e01b3

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkik/android/widget/WebTrayWidget;->c(Landroid/view/View;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aj:Lkik/android/util/ad;

    invoke-virtual {v3, v4}, Lkik/android/widget/WebTrayWidget;->a(Lkik/android/util/ad;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    const-string v5, "Web"

    const v6, 0x7f07009c

    invoke-virtual {v4, v5, v6, v3}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(Ljava/lang/String;ILandroid/support/v4/app/Fragment;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->aT:Lcom/kik/view/adapters/MediaTrayTabAdapter;

    invoke-virtual {v3, v4}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v3, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->tabs:Lkik/android/widget/PagerIconTabs;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v3}, Lkik/android/widget/PagerIconTabs;->a(Landroid/support/v4/view/ViewPager;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->tabs:Lkik/android/widget/PagerIconTabs;

    invoke-virtual {v2}, Lkik/android/widget/PagerIconTabs;->a()V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->tabs:Lkik/android/widget/PagerIconTabs;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bC:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v2, v3}, Lkik/android/widget/PagerIconTabs;->a(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 1511
    :cond_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    const v3, 0x7f0e01b0

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    .line 1512
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    new-instance v3, Lkik/android/chat/fragment/cv;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/cv;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1525
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/widget/ImeAwareEditText;)V

    .line 1527
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v3, Lkik/android/chat/fragment/da;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/da;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/widget/ImeAwareEditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1536
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v3, Lkik/android/chat/fragment/db;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/db;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/widget/ImeAwareEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1625
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    new-instance v3, Lkik/android/chat/fragment/dd;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/dd;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1634
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 1636
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    if-eqz v2, :cond_17

    .line 1637
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->w()V

    .line 1638
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-virtual {v3}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/i;->f(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    .line 1639
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/chat/fragment/KikChatFragment;->F:I

    .line 1647
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v2}, Lkik/android/widget/DarkLinearLayout;->getHeight()I

    move-result v2

    if-nez v2, :cond_18

    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    .line 1648
    :goto_6
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    if-eqz v3, :cond_1a

    .line 1649
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Lkik/android/widget/TalkToCoverView;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 1650
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lkik/android/chat/fragment/KikChatFragment;->ap:Z

    invoke-virtual {v3, v4}, Lkik/android/widget/TalkToCoverView;->a(Z)V

    .line 1651
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/fragment/KikChatFragment;->ar:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    invoke-virtual {v3, v4, v5, v6, v7}, Lkik/android/widget/TalkToCoverView;->a(Lkik/a/d/k;Landroid/view/View;Lkik/a/d/f;Lkik/a/e/i;)V

    .line 1652
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    invoke-virtual {v3}, Lkik/android/widget/TalkToCoverView;->b()Z

    move-result v3

    if-nez v3, :cond_19

    .line 1653
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lkik/android/chat/fragment/KikChatFragment;->f(I)V

    .line 1676
    :cond_c
    :goto_7
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lkik/android/chat/fragment/KikChatFragment;->am:Z

    if-eqz v2, :cond_1b

    .line 1677
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    const/4 v3, 0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;I)V

    .line 1683
    :goto_8
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->at:Landroid/view/View;

    .line 1684
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-nez v2, :cond_d

    .line 1686
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->aC()V

    .line 1690
    :cond_d
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->az()Z

    move-result v2

    if-nez v2, :cond_e

    .line 1691
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lkik/android/chat/fragment/KikChatFragment;->c(Z)V

    .line 1696
    :cond_e
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v3, Lkik/android/chat/fragment/de;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/de;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/widget/ImeAwareEditText;->post(Ljava/lang/Runnable;)Z

    .line 1717
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v3, Lkik/android/chat/fragment/df;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/df;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v3, v4, v5}, Lkik/android/widget/ImeAwareEditText;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1727
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->ai()V

    .line 1729
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    invoke-virtual {v2}, Lkik/android/f/a/f;->h()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->bh:Lkik/android/f/a/f;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lkik/android/f/a/f;->e(Ljava/lang/String;)V

    if-eqz v4, :cond_11

    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    if-eqz v3, :cond_f

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {v2}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    :cond_f
    const-string v3, ""

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v5

    if-eqz v5, :cond_10

    const-string v3, " "

    :cond_10
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object v2

    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->M:Landroid/text/Spannable;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    sput-object v2, Lkik/android/chat/fragment/KikChatFragment;->Q:Lkik/a/d/k;

    .line 1731
    :cond_11
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->s()V

    .line 1732
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    const-string v3, "AUTOMATION_SEND_MESSAGE"

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1733
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    const-string v3, "AUTOMATION_MESSAGE_LIST"

    invoke-virtual {v2, v3}, Lkik/android/widget/ResizeEventList;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1734
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    const-string v3, "AUTOMATION_MEDIA_BAR_TEXT_FIELD"

    invoke-static {v2, v3}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 1735
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    const-string v3, "AUTOMATION_MEDIA_BAR_SEND"

    invoke-static {v2, v3}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 1736
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    const-string v3, "AUTOMATION_MEDIA_BAR_PLUS"

    invoke-static {v2, v3}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 1737
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->as:Landroid/view/View;

    const-string v3, "AUTOMATION_MEDIA_BAR_SMILEY"

    invoke-static {v2, v3}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 1738
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaModeButton:Lkik/android/widget/TabIconImageView;

    const-string v3, "AUTOMATION_MEDIA_TRAY_EXPAND"

    invoke-static {v2, v3}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 1740
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v2}, Lkik/android/widget/DarkLinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bA:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1741
    new-instance v2, Lkik/android/chat/fragment/rl;

    invoke-direct {v2}, Lkik/android/chat/fragment/rl;-><init>()V

    new-instance v3, Lkik/android/chat/fragment/dg;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/fragment/dg;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/rl;->a(Lkik/android/chat/fragment/rl$a;)Lkik/android/chat/fragment/rl;

    invoke-virtual {v2}, Lkik/android/chat/fragment/rl;->d()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->r:Lkik/android/chat/b/d;

    invoke-virtual {v3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v3

    invoke-virtual {v3}, Lkik/android/chat/b/b;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/rl;->b(I)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->r:Lkik/android/chat/b/d;

    invoke-virtual {v3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v3

    invoke-virtual {v3}, Lkik/android/chat/b/b;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/rl;->c(I)V

    new-instance v3, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(IZ)V

    invoke-virtual {v2}, Lkik/android/chat/fragment/rl;->a()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/16 v5, -0x1f4

    invoke-static {v5}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/support/v7/widget/LinearLayoutManager;->e(II)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$i;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->_suggestedRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$a;)V

    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->al()V

    .line 1742
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    :goto_9
    return-object v2

    .line 1336
    :cond_12
    new-instance v2, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getDownloadCacheDirectory()Ljava/io/File;

    move-result-object v3

    const-string v4, "chatTemp"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1354
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/fragment/KikChatFragment;->be:I

    sub-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lkik/android/chat/fragment/KikChatFragment;->bb:I

    goto/16 :goto_2

    .line 1408
    :cond_14
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 1505
    :cond_15
    const/4 v2, 0x2

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentButton:Lkik/android/widget/DarkFrameLayout;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->_contentButtonSpacer:Landroid/view/View;

    aput-object v4, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto/16 :goto_4

    .line 1508
    :cond_16
    const/4 v2, 0x0

    goto/16 :goto_5

    .line 1642
    :cond_17
    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->J()V

    .line 1644
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    goto :goto_9

    .line 1647
    :cond_18
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v2}, Lkik/android/widget/DarkLinearLayout;->getHeight()I

    move-result v2

    goto/16 :goto_6

    .line 1656
    :cond_19
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    invoke-virtual {v2}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1657
    const/16 v3, 0xc

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 1658
    const/4 v3, 0x2

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    invoke-virtual {v4}, Lkik/android/widget/TalkToCoverView;->getId()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 1659
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    invoke-virtual {v3, v2}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1660
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->ag()V

    goto/16 :goto_7

    .line 1664
    :cond_1a
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lkik/android/chat/fragment/KikChatFragment;->f(I)V

    .line 1665
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 1667
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->tray:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/fragment/KikChatFragment;->aS:I

    invoke-static {v2, v3}, Lkik/android/util/cv;->a(Landroid/view/View;I)V

    .line 1670
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1671
    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/fragment/KikChatFragment;->bd:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1672
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/fragment/KikChatFragment;->_textLayout:Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_7

    .line 1680
    :cond_1b
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    const/4 v3, 0x2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(Landroid/view/View;I)V

    goto/16 :goto_8

    :catch_0
    move-exception v3

    goto/16 :goto_1
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    .line 3975
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3977
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aG()V

    .line 3979
    :cond_0
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment;->P:Ljava/util/UUID;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->R:Ljava/util/UUID;

    if-ne v0, v1, :cond_1

    .line 3980
    const/4 v0, 0x0

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment;->P:Ljava/util/UUID;

    .line 3982
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aE:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/gifs/view/EmojiLruCache;->a(Landroid/content/Context;)Lkik/android/gifs/view/EmojiLruCache;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/gifs/view/EmojiLruCache;->evictAll()V

    .line 3983
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Lkik/a/d/f;Lkik/a/d/s;)V

    .line 3984
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroy()V

    .line 3985
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 3959
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroyView()V

    .line 3961
    const/16 v0, 0x8

    invoke-static {v0}, Lcom/kik/sdkutils/y;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3962
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(I)V

    .line 3965
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->t()V

    .line 3967
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ad:Lkik/android/widget/dl;

    .line 3968
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aD:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bB:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 3969
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->_mediaTrayContainer:Lkik/android/widget/DarkLinearLayout;

    invoke-virtual {v0}, Lkik/android/widget/DarkLinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->bA:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 3970
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 4496
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aC:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    .line 4497
    if-nez v0, :cond_1

    .line 4554
    :cond_0
    :goto_0
    return-void

    .line 4503
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v3

    .line 4504
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lkik/a/d/k;->m()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4509
    :cond_2
    const-class v1, Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 4510
    if-eqz v1, :cond_4

    .line 4511
    const-string v2, "com.kik.cards"

    invoke-virtual {v1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {v1}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 4515
    invoke-virtual {v1}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kik/f/a/a/a;

    invoke-virtual {v2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lkik/android/chat/fragment/KikChatFragment;->c(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v2

    .line 4525
    :goto_1
    new-instance v4, Lkik/android/chat/fragment/fj;

    invoke-direct {v4, p0, v0, v1, v3}, Lkik/android/chat/fragment/fj;-><init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/s;Lkik/a/d/a/a;Lkik/a/d/k;)V

    invoke-static {p0, v4}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 4518
    :cond_3
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v2

    goto :goto_1

    .line 4522
    :cond_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v2

    goto :goto_1
.end method

.method public onPause()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 3605
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onPause()V

    .line 3608
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3609
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aF()V

    .line 3612
    :cond_0
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lkik/a/e/i;->a(Lkik/a/d/f;Z)V
    :try_end_0
    .catch Lkik/a/y; {:try_start_0 .. :try_end_0} :catch_0

    .line 3624
    :goto_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bn:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aL:Z

    if-nez v0, :cond_1

    .line 3625
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->d(Landroid/view/View;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ah:Lkik/a/d/k;

    invoke-static {v0, v1}, Lkik/android/chat/ak;->a(Lkik/android/chat/fragment/KikChatFragment$b;Lkik/a/d/k;)V

    .line 3627
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    .line 3630
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 3631
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ah()V

    .line 3634
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3635
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ap()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aQ:Z

    .line 3638
    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->av()Z

    move-result v0

    if-nez v0, :cond_3

    .line 3639
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->aK:Lkik/a/d/s;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Lkik/a/d/f;Lkik/a/d/s;)V

    .line 3642
    :cond_3
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ao()V

    .line 3643
    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->b(Lkik/android/sdkutils/a;)V

    .line 3645
    iput v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aM:I

    .line 3646
    iput v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aN:I

    .line 3647
    iput v3, p0, Lkik/android/chat/fragment/KikChatFragment;->aO:I

    .line 3648
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ag:Lcom/kik/view/adapters/au;

    invoke-virtual {v0}, Lcom/kik/view/adapters/au;->b()V

    .line 3649
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bF:Lkik/android/chat/am;

    invoke-virtual {v0}, Lkik/android/chat/am;->a()V

    .line 3650
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onResume()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 4366
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onResume()V

    .line 4368
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->s()V

    .line 4370
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ab:Landroid/os/Handler;

    const/4 v1, 0x7

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4372
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/widget/ImeAwareEditText;)V

    .line 4373
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ac:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->ac:Ljava/util/Vector;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4374
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->x:Lkik/a/c/c;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_2

    invoke-virtual {v0, v6}, Lkik/a/d/f;->b(Z)Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-static {v0}, Lcom/kik/m/m;->a(Lkik/a/d/s;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v2}, Lkik/a/c/c;->a(Ljava/util/List;)V

    .line 4375
    invoke-virtual {p0, v6}, Lkik/android/chat/fragment/KikChatFragment;->b(Z)V

    .line 4377
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->bn:Z

    if-eqz v0, :cond_3

    .line 4440
    :goto_2
    return-void

    .line 4381
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    if-eqz v0, :cond_4

    .line 4382
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v2, p0, Lkik/android/chat/fragment/KikChatFragment;->m:Lkik/a/e/w;

    iget-object v3, p0, Lkik/android/chat/fragment/KikChatFragment;->j:Lkik/a/e/r;

    iget-object v4, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v5, p0, Lkik/android/chat/fragment/KikChatFragment;->l:Lkik/a/e/f;

    invoke-virtual/range {v0 .. v5}, Lkik/android/widget/TalkToCoverView;->a(Lcom/kik/android/a;Lkik/a/e/w;Lkik/a/e/r;Lkik/a/e/i;Lkik/a/e/f;)V

    .line 4385
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->talkToCover:Lkik/android/widget/TalkToCoverView;

    invoke-virtual {v0}, Lkik/android/widget/TalkToCoverView;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4387
    iput-boolean v6, p0, Lkik/android/chat/fragment/KikChatFragment;->am:Z

    .line 4388
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ag()V

    .line 4390
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->h(Lkik/android/chat/fragment/KikChatFragment$a;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->k:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_d

    move v0, v7

    :goto_3
    if-eqz v0, :cond_e

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aB()V

    move v0, v7

    :goto_4
    if-nez v0, :cond_b

    .line 4391
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v0

    if-nez v0, :cond_6

    .line 4393
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aC()V

    .line 4395
    :cond_6
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aA()V

    .line 4397
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->I()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4398
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ax()V

    .line 4401
    :cond_7
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aQ:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->u()Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_8
    move v0, v7

    .line 4402
    :goto_5
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->v()V

    .line 4405
    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->_newMessagesButton:Landroid/widget/Button;

    new-instance v2, Lkik/android/chat/fragment/fh;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/fh;-><init>(Lkik/android/chat/fragment/KikChatFragment;Z)V

    const-wide/16 v4, 0x1f4

    invoke-virtual {v1, v2, v4, v5}, Landroid/widget/Button;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4415
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->u()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aj()Z

    move-result v0

    if-nez v0, :cond_9

    .line 4416
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->ar()V

    .line 4418
    :cond_9
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ai:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->v()V

    .line 4420
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Q()V

    .line 4421
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->af:Lkik/android/chat/fragment/KikChatFragment$b;

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aL:Z

    if-nez v0, :cond_a

    .line 4422
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aq:Lkik/android/widget/ImeAwareEditText;

    new-instance v1, Lkik/android/chat/fragment/fi;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/fi;-><init>(Lkik/android/chat/fragment/KikChatFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/widget/ImeAwareEditText;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4432
    :cond_a
    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->a(Lkik/android/sdkutils/a;)V

    .line 4436
    :cond_b
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->I:Lkik/android/chat/fragment/KikChatFragment$f;

    if-eqz v0, :cond_c

    .line 4437
    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->I:Lkik/android/chat/fragment/KikChatFragment$f;

    invoke-interface {v0}, Lkik/android/chat/fragment/KikChatFragment$f;->a()V

    .line 4439
    :cond_c
    iput-boolean v7, p0, Lkik/android/chat/fragment/KikChatFragment;->G:Z

    goto/16 :goto_2

    :cond_d
    move v0, v6

    .line 4390
    goto :goto_3

    :cond_e
    move v0, v6

    goto :goto_4

    :cond_f
    move v0, v6

    .line 4401
    goto :goto_5
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1156
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1158
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Landroid/os/Bundle;)V

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->c(Lkik/android/chat/fragment/KikChatFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->am:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->d(Lkik/android/chat/fragment/KikChatFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ao:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->e(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->S:Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->f(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->aJ:Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->g(Lkik/android/chat/fragment/KikChatFragment$a;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->an:Z

    iget-object v0, p0, Lkik/android/chat/fragment/KikChatFragment;->A:Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$a;->b()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikChatFragment;->ap:Z

    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->Q()V

    .line 1159
    :cond_0
    return-void
.end method

.method public final v()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 5287
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->az()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5288
    const/4 v0, 0x0

    .line 5297
    :goto_0
    return v0

    .line 5291
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->z()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5293
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikChatFragment;->J()V

    goto :goto_0

    .line 5296
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikChatFragment;->aB()V

    goto :goto_0
.end method
