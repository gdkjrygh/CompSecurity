.class public Lcom/facebook/orca/compose/ComposeFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ComposeFragment.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static b:I

.field private static c:I

.field private static d:I


# instance fields
.field private Z:Lcom/facebook/orca/common/a/b;

.field private aA:Landroid/view/ViewGroup;

.field private aB:Lcom/facebook/fbservice/ops/k;

.field private aC:Lcom/facebook/fbservice/ops/n;

.field private aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

.field private aF:Lcom/facebook/orca/compose/ak;

.field private aG:Landroid/location/Location;

.field private aH:Ljava/lang/Boolean;

.field private aI:Lcom/facebook/orca/compose/an;

.field private aJ:Lcom/facebook/orca/compose/am;

.field private aK:Lcom/facebook/orca/compose/av;

.field private aL:Lcom/facebook/orca/compose/ap;

.field private aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

.field private aN:Lcom/facebook/orca/compose/aq;

.field private aO:Lcom/facebook/user/UserKey;

.field private aP:Z

.field private aQ:I

.field private aR:J

.field private aS:J

.field private aT:Z

.field private aU:Z

.field private aV:Z

.field private aW:Z

.field private aX:Ljava/lang/Runnable;

.field private aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

.field private aZ:Lcom/facebook/orca/stickers/StickerPopup;

.field private aa:Lcom/facebook/l/k;

.field private ab:Lcom/facebook/orca/prefs/az;

.field private ac:Landroid/location/LocationManager;

.field private ad:Landroid/view/LayoutInflater;

.field private ae:Lcom/facebook/orca/f/n;

.field private af:Lcom/facebook/orca/emoji/z;

.field private ag:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ah:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ai:Lcom/facebook/ui/media/b/a;

.field private aj:Landroid/app/KeyguardManager;

.field private ak:Lcom/facebook/analytics/av;

.field private al:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private am:Lcom/facebook/orca/f/ac;

.field private an:Lcom/facebook/c/s;

.field private ao:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ap:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private aq:Landroid/view/View;

.field private ar:Landroid/widget/EditText;

.field private as:Landroid/widget/ImageButton;

.field private at:Landroid/widget/ImageButton;

.field private au:Landroid/widget/ImageButton;

.field private av:Landroid/view/View;

.field private aw:Landroid/widget/TextView;

.field private ax:Landroid/widget/ImageView;

.field private ay:Landroid/widget/TextView;

.field private az:Lcom/facebook/orca/compose/AudioComposerView;

.field private ba:Lcom/facebook/orca/emoji/ah;

.field private bb:Lcom/facebook/orca/compose/al;

.field private bc:Landroid/os/Handler;

.field private bd:Z

.field private be:I

.field private bf:Z

.field private bg:Z

.field private bh:Z

.field private bi:Z

.field private bj:Z

.field private bk:Z

.field private bl:Lcom/facebook/orca/stickers/Sticker;

.field private bm:Ljava/lang/String;

.field private bn:Ljava/lang/String;

.field private e:Lcom/facebook/orca/f/k;

.field private f:Lcom/facebook/ui/media/attachments/d;

.field private g:Lcom/facebook/prefs/shared/d;

.field private h:Lcom/facebook/orca/common/ui/widgets/a;

.field private i:Lcom/facebook/orca/f/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 136
    const-class v0, Lcom/facebook/orca/compose/ComposeFragment;

    sput-object v0, Lcom/facebook/orca/compose/ComposeFragment;->a:Ljava/lang/Class;

    .line 139
    const/16 v0, 0x1388

    sput v0, Lcom/facebook/orca/compose/ComposeFragment;->b:I

    .line 140
    sget v0, Lcom/facebook/orca/compose/ComposeFragment;->b:I

    add-int/lit8 v0, v0, -0x32

    sput v0, Lcom/facebook/orca/compose/ComposeFragment;->c:I

    .line 141
    sget v0, Lcom/facebook/orca/compose/ComposeFragment;->b:I

    add-int/lit8 v0, v0, -0x14

    sput v0, Lcom/facebook/orca/compose/ComposeFragment;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 263
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 267
    sget-object v0, Lcom/facebook/orca/compose/ak;->INIT:Lcom/facebook/orca/compose/ak;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    return-void
.end method

.method static synthetic A(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aK()V

    return-void
.end method

.method static synthetic B(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aL()V

    return-void
.end method

.method static synthetic C(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    return-void
.end method

.method static synthetic D(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/photos/picking/PickMediaOperation;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    return-object v0
.end method

.method static synthetic E(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/aq;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aN:Lcom/facebook/orca/compose/aq;

    return-object v0
.end method

.method static synthetic F(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/ui/media/attachments/d;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->f:Lcom/facebook/ui/media/attachments/d;

    return-object v0
.end method

.method static synthetic G(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method static synthetic H(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->an:Lcom/facebook/c/s;

    return-object v0
.end method

.method static synthetic I(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ay()V

    return-void
.end method

.method static synthetic J(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aJ()V

    return-void
.end method

.method static synthetic K(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/al;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bb:Lcom/facebook/orca/compose/al;

    return-object v0
.end method

.method private Z()V
    .locals 1

    .prologue
    .line 407
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    if-nez v0, :cond_1

    .line 422
    :cond_0
    :goto_0
    return-void

    .line 410
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bd:Z

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_2

    .line 416
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 421
    :goto_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->k(Z)V

    goto :goto_0

    .line 418
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a()V

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aC:Lcom/facebook/fbservice/ops/n;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/emoji/EmojiAttachmentPopup;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/orca/stickers/Sticker;)Lcom/facebook/orca/stickers/Sticker;
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    return-object p1
.end method

.method private a(II)V
    .locals 3

    .prologue
    .line 643
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->af:Lcom/facebook/orca/emoji/z;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getTextSize()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;III)V

    .line 644
    return-void
.end method

.method private a(J)V
    .locals 2

    .prologue
    .line 2197
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bb:Lcom/facebook/orca/compose/al;

    if-eqz v0, :cond_0

    .line 2198
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bc:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2199
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bc:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/compose/aa;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/aa;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2208
    :cond_0
    return-void
.end method

.method private a(Landroid/location/Location;)V
    .locals 2

    .prologue
    .line 1342
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq v0, v1, :cond_0

    .line 1343
    sget-object v0, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    .line 1345
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;I)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->f(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;II)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;J)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/orca/emoji/c;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/emoji/c;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->g(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Z)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->k(Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;ZZ)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(ZZ)V

    return-void
.end method

.method private a(Lcom/facebook/orca/compose/aj;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1939
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    .line 1940
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 1941
    invoke-virtual {v0, p3}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 1942
    if-eqz v0, :cond_0

    .line 1943
    invoke-virtual {v2, v0}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1946
    :cond_0
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 1947
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1949
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_2

    .line 1950
    invoke-virtual {p2, v1}, Landroid/support/v4/app/DialogFragment;->b(Z)V

    .line 1951
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1952
    iget-boolean v2, p1, Lcom/facebook/orca/compose/aj;->e:Z

    if-eqz v2, :cond_1

    move v3, v1

    .line 1954
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    aget v4, v4, v1

    iget v5, p1, Lcom/facebook/orca/compose/aj;->c:I

    move-object v1, p2

    move-object v2, p3

    invoke-interface/range {v0 .. v5}, Lcom/facebook/orca/emoji/ah;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;III)V

    .line 1963
    :goto_1
    return-void

    .line 1952
    :cond_1
    iget v2, p1, Lcom/facebook/orca/compose/aj;->g:I

    sub-int v3, v0, v2

    goto :goto_0

    .line 1961
    :cond_2
    invoke-virtual {p2, v2, p3}, Landroid/support/v4/app/DialogFragment;->a(Landroid/support/v4/app/ad;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1460
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    .line 1461
    iput-object p2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aG:Landroid/location/Location;

    .line 1463
    sget-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-ne p1, v0, :cond_2

    .line 1464
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    invoke-direct {p0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->j(Z)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1477
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aK:Lcom/facebook/orca/compose/av;

    if-eqz v0, :cond_1

    .line 1478
    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aK:Lcom/facebook/orca/compose/av;

    sget-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq p1, v0, :cond_5

    move v0, v1

    :goto_1
    iget-object v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aH:Ljava/lang/Boolean;

    if-eqz v4, :cond_6

    :goto_2
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->al()Z

    move-result v2

    invoke-virtual {v3, v0, v1, v2}, Lcom/facebook/orca/compose/av;->a(ZZZ)V

    .line 1483
    :cond_1
    return-void

    .line 1466
    :cond_2
    sget-object v0, Lcom/facebook/orca/compose/ak;->FINDING_LOCATION:Lcom/facebook/orca/compose/ak;

    if-ne p1, v0, :cond_3

    .line 1467
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->j(Z)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    .line 1469
    :cond_3
    sget-object v0, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    if-ne p1, v0, :cond_4

    .line 1470
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->j(Z)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    .line 1472
    :cond_4
    sget-object v0, Lcom/facebook/orca/compose/ak;->LOCATION_ERROR:Lcom/facebook/orca/compose/ak;

    if-ne p1, v0, :cond_0

    .line 1473
    sget-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    .line 1474
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->j(Z)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    :cond_5
    move v0, v2

    .line 1478
    goto :goto_1

    :cond_6
    move v1, v2

    goto :goto_2
.end method

.method private a(Lcom/facebook/orca/emoji/c;)V
    .locals 2

    .prologue
    .line 2017
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->af:Lcom/facebook/orca/emoji/z;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/orca/emoji/z;->a(Landroid/widget/EditText;Lcom/facebook/orca/emoji/c;)V

    .line 2018
    return-void
.end method

.method private a(Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V
    .locals 2

    .prologue
    .line 1497
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1498
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->h:Lcom/facebook/orca/common/ui/widgets/a;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/orca/common/ui/widgets/a;->a(Landroid/view/View;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    .line 1500
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 2220
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    .line 2221
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 2222
    invoke-virtual {v0, p2, p1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 2223
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 2224
    return-void
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1354
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq v0, v1, :cond_0

    .line 1355
    sget-object v0, Lcom/facebook/orca/compose/ak;->LOCATION_ERROR:Lcom/facebook/orca/compose/ak;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    .line 1357
    :cond_0
    return-void
.end method

.method private a(ZZ)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x2710

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1510
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ag()V

    .line 1511
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aO:Lcom/facebook/user/UserKey;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aO:Lcom/facebook/user/UserKey;

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v2

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-eq v2, v3, :cond_1

    .line 1561
    :cond_0
    :goto_0
    return-void

    .line 1515
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 1516
    if-eqz p1, :cond_2

    .line 1517
    iput-wide v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aS:J

    .line 1520
    :cond_2
    iget-object v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 1522
    if-nez p2, :cond_3

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->u()Z

    move-result v5

    if-nez v5, :cond_4

    .line 1530
    :cond_3
    :goto_1
    iget-object v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aa:Lcom/facebook/l/k;

    invoke-virtual {v4}, Lcom/facebook/l/k;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1534
    iget v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aQ:I

    if-ne v4, v0, :cond_5

    .line 1537
    iget v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aQ:I

    if-ne v4, v1, :cond_0

    .line 1538
    iget-wide v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aR:J

    sub-long v4, v2, v4

    cmp-long v4, v4, v6

    if-gez v4, :cond_5

    .line 1541
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->av()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1557
    :catch_0
    move-exception v0

    .line 1559
    sget-object v1, Lcom/facebook/orca/compose/ComposeFragment;->a:Ljava/lang/Class;

    const-string v2, "Exception sending typing notifications"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1524
    :cond_4
    :try_start_1
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v4

    if-lez v4, :cond_3

    iget-wide v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aS:J

    sub-long v4, v2, v4

    cmp-long v4, v4, v6

    if-gez v4, :cond_3

    move v0, v1

    .line 1525
    goto :goto_1

    .line 1549
    :cond_5
    iput v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aQ:I

    .line 1550
    iput-wide v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aR:J

    .line 1552
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aO:Lcom/facebook/user/UserKey;

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v2

    .line 1553
    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aa:Lcom/facebook/l/k;

    invoke-virtual {v3, v2, v0}, Lcom/facebook/l/k;->a(Ljava/lang/String;I)V

    .line 1554
    iget v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aQ:I

    if-ne v0, v1, :cond_0

    .line 1555
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->av()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method private a(Landroid/widget/ImageButton;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    .line 425
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 426
    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 427
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 428
    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->getLocationOnScreen([I)V

    .line 429
    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 430
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/widget/ImageButton;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/widget/ImageButton;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method private aA()V
    .locals 1

    .prologue
    .line 1652
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->az()V

    .line 1653
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aW:Z

    .line 1654
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 1655
    return-void
.end method

.method private aB()V
    .locals 3

    .prologue
    .line 1658
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaParams;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;-><init>(Z)V

    .line 1659
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->image_attachment_attach_image:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Ljava/lang/String;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 1660
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/PickMediaParams;)V

    .line 1661
    return-void
.end method

.method private aC()V
    .locals 1

    .prologue
    .line 1664
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    if-eqz v0, :cond_0

    .line 1665
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Z()V

    .line 1667
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->k(Z)V

    .line 1668
    return-void
.end method

.method private aD()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 1692
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1693
    sget-object v0, Lcom/facebook/orca/compose/ComposeFragment;->a:Ljava/lang/Class;

    const-string v1, "FragmentManager cannot commit transactions. Not showing sticker popup."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 1731
    :goto_0
    return-void

    .line 1697
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Z()V

    .line 1699
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aH()Lcom/facebook/orca/compose/aj;

    move-result-object v6

    .line 1701
    iget-object v0, v6, Lcom/facebook/orca/compose/aj;->a:[I

    aget v0, v0, v7

    iget v1, v6, Lcom/facebook/orca/compose/aj;->b:I

    iget v2, v6, Lcom/facebook/orca/compose/aj;->c:I

    iget v3, v6, Lcom/facebook/orca/compose/aj;->d:I

    iget-boolean v4, v6, Lcom/facebook/orca/compose/aj;->e:Z

    iget v5, v6, Lcom/facebook/orca/compose/aj;->f:I

    invoke-static/range {v0 .. v5}, Lcom/facebook/orca/stickers/StickerPopup;->a(IIIIZI)Lcom/facebook/orca/stickers/StickerPopup;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    .line 1709
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    new-instance v1, Lcom/facebook/orca/compose/x;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/x;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/StickerPopup;->a(Lcom/facebook/orca/stickers/u;)V

    .line 1726
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v7}, Lcom/facebook/orca/stickers/StickerPopup;->a(II)V

    .line 1728
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    const-string v1, "stickerKeyboard"

    invoke-direct {p0, v6, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/aj;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 1730
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->l(Z)V

    goto :goto_0
.end method

.method private aE()V
    .locals 1

    .prologue
    .line 1734
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    if-nez v0, :cond_1

    .line 1749
    :cond_0
    :goto_0
    return-void

    .line 1737
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bd:Z

    if-eqz v0, :cond_0

    .line 1742
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_2

    .line 1743
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 1748
    :goto_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->l(Z)V

    goto :goto_0

    .line 1745
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPopup;->a()V

    goto :goto_1
.end method

.method private aF()V
    .locals 0

    .prologue
    .line 1752
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aG()V

    .line 1753
    return-void
.end method

.method private aG()V
    .locals 12

    .prologue
    const/4 v8, 0x1

    const/4 v11, 0x0

    .line 1756
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1757
    sget-object v0, Lcom/facebook/orca/compose/ComposeFragment;->a:Ljava/lang/Class;

    const-string v1, "FragmentManager cannot commit transactions. bailing out"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 1838
    :goto_0
    return-void

    .line 1761
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aE()V

    .line 1763
    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 1764
    const-string v0, "openEmojiAttachmentsKeyboard"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v9

    .line 1766
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aH()Lcom/facebook/orca/compose/aj;

    move-result-object v10

    .line 1769
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    if-eqz v0, :cond_1

    .line 1770
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ao:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 1773
    :goto_1
    iget-object v0, v10, Lcom/facebook/orca/compose/aj;->a:[I

    aget v0, v0, v11

    iget v1, v10, Lcom/facebook/orca/compose/aj;->b:I

    iget v2, v10, Lcom/facebook/orca/compose/aj;->c:I

    iget v3, v10, Lcom/facebook/orca/compose/aj;->d:I

    iget-boolean v4, v10, Lcom/facebook/orca/compose/aj;->e:Z

    iget v5, v10, Lcom/facebook/orca/compose/aj;->f:I

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aI()Z

    move-result v6

    invoke-static/range {v0 .. v7}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(IIIIZIZZ)Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    .line 1782
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    new-instance v1, Lcom/facebook/orca/compose/y;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/y;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(Lcom/facebook/orca/emoji/o;)V

    .line 1830
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v11}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a(II)V

    .line 1832
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    const-string v1, "emojiKeyboard"

    invoke-direct {p0, v10, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/aj;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 1834
    invoke-direct {p0, v8}, Lcom/facebook/orca/compose/ComposeFragment;->k(Z)V

    .line 1836
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J

    .line 1837
    sget-object v0, Lcom/facebook/orca/compose/ComposeFragment;->a:Ljava/lang/Class;

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    move v7, v8

    goto :goto_1
.end method

.method private aH()Lcom/facebook/orca/compose/aj;
    .locals 13

    .prologue
    const/4 v12, 0x2

    const/4 v1, 0x1

    .line 1843
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 1844
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 1846
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getHeight()I

    move-result v3

    .line 1847
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v5

    .line 1849
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 1851
    new-array v2, v12, [I

    .line 1855
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_2

    .line 1856
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0, v4}, Lcom/facebook/orca/emoji/ah;->a(Landroid/graphics/Rect;)V

    .line 1857
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->c()I

    move-result v5

    .line 1858
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 1866
    :goto_0
    aget v9, v2, v1

    .line 1867
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int v10, v9, v0

    .line 1870
    sub-int v11, v3, v10

    .line 1874
    iget v0, v4, Landroid/graphics/Rect;->top:I

    sub-int v0, v9, v0

    .line 1880
    const/4 v6, 0x0

    .line 1882
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v7

    const/high16 v8, 0x42c80000    # 100.0f

    invoke-static {v7, v8}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v7

    .line 1883
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->b(Landroid/content/Context;)I

    move-result v8

    .line 1885
    if-gt v11, v7, :cond_3

    if-le v0, v11, :cond_3

    .line 1888
    const v7, 0x10000053

    .line 1889
    add-int v1, v9, v8

    sub-int/2addr v3, v1

    .line 1903
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v4, Lcom/facebook/g;->emoji_category_height_dp:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 1905
    new-instance v4, Lcom/facebook/orca/emoji/ae;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v9

    new-instance v10, Lcom/facebook/orca/emoji/r;

    invoke-direct {v10}, Lcom/facebook/orca/emoji/r;-><init>()V

    invoke-direct {v4, v9, v10}, Lcom/facebook/orca/emoji/ae;-><init>(Landroid/content/res/Resources;Lcom/facebook/orca/emoji/af;)V

    add-int v9, v1, v8

    sub-int v9, v0, v9

    invoke-virtual {v4, v5, v9, v6}, Lcom/facebook/orca/emoji/ae;->a(IIZ)Lcom/facebook/orca/emoji/ag;

    move-result-object v4

    .line 1910
    invoke-virtual {v4}, Lcom/facebook/orca/emoji/ag;->m()I

    move-result v4

    add-int/2addr v1, v4

    add-int v4, v1, v8

    .line 1911
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v12, :cond_0

    .line 1912
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v4, 0x43160000    # 150.0f

    invoke-static {v1, v4}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v4

    .line 1916
    :cond_0
    if-eqz v6, :cond_4

    move v4, v0

    .line 1924
    :cond_1
    :goto_2
    new-instance v0, Lcom/facebook/orca/compose/aj;

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/compose/aj;-><init>(Lcom/facebook/orca/compose/ComposeFragment;[IIIIZII)V

    return-object v0

    .line 1860
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->m()Landroid/support/v4/app/p;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/p;->c()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 1862
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationInWindow([I)V

    goto/16 :goto_0

    .line 1894
    :cond_3
    const v7, 0x10000033

    .line 1896
    iget v0, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v8

    sub-int v3, v10, v0

    .line 1898
    add-int v0, v11, v8

    move v6, v1

    .line 1899
    goto :goto_1

    .line 1918
    :cond_4
    if-gt v0, v4, :cond_1

    move v4, v0

    .line 1921
    goto :goto_2
.end method

.method private aI()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1980
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1982
    iget-boolean v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    if-eqz v1, :cond_1

    .line 1994
    :cond_0
    :goto_0
    return v0

    .line 1988
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bk:Z

    goto :goto_0

    .line 1989
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v1}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1994
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private aJ()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 2039
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->al:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2076
    :cond_0
    :goto_0
    return-void

    .line 2042
    :cond_1
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    .line 2043
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bi:Z

    .line 2046
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->R()V

    .line 2049
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    .line 2051
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2052
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/orca/emoji/q;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 2058
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_3

    .line 2059
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/i;->setRequestedOrientation(I)V

    .line 2062
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/compose/AudioComposerView;->setVisibility(I)V

    .line 2063
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/AudioComposerView;->a()V

    .line 2064
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aA:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2067
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/AudioComposerView;->setClickable(Z)V

    .line 2070
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Z()V

    .line 2071
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 2073
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 2075
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(J)V

    goto :goto_0
.end method

.method private aK()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2079
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    if-nez v0, :cond_0

    .line 2104
    :goto_0
    return-void

    .line 2082
    :cond_0
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    .line 2083
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bi:Z

    .line 2086
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    .line 2088
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2089
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/orca/emoji/q;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 2094
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->setVisibility(I)V

    .line 2095
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/AudioComposerView;->b()V

    .line 2096
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aA:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2097
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/AudioComposerView;->setClickable(Z)V

    .line 2099
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 2100
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/i;->setRequestedOrientation(I)V

    .line 2103
    :cond_2
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(J)V

    goto :goto_0
.end method

.method private aL()V
    .locals 1

    .prologue
    .line 2111
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->R()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2112
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->b()V

    .line 2114
    :cond_1
    return-void
.end method

.method private aM()Ljava/lang/String;
    .locals 2

    .prologue
    .line 2237
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2238
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    .line 2241
    :goto_0
    return-object v0

    .line 2240
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->Z:Lcom/facebook/orca/common/a/b;

    invoke-virtual {v0}, Lcom/facebook/orca/common/a/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    .line 2241
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    goto :goto_0
.end method

.method private aa()Z
    .locals 1

    .prologue
    .line 647
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ab()Z
    .locals 2

    .prologue
    .line 813
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aL:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ac()Ljava/lang/String;
    .locals 2

    .prologue
    .line 985
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    if-eqz v0, :cond_0

    .line 986
    const/4 v0, 0x0

    .line 994
    :goto_0
    return-object v0

    .line 988
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 989
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/facebook/orca/emoji/aa;->c:Lcom/facebook/orca/emoji/c;

    invoke-virtual {v1}, Lcom/facebook/orca/emoji/c;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    goto :goto_0

    .line 992
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private ad()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1000
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    if-eqz v0, :cond_0

    .line 1002
    new-instance v0, Lcom/facebook/messages/model/share/d;

    invoke-direct {v0}, Lcom/facebook/messages/model/share/d;-><init>()V

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/Sticker;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->a(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->b(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    move-result-object v0

    const-string v1, "link"

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->c(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/Sticker;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/share/d;->d(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/d;->g()Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v0

    .line 1009
    new-instance v1, Lcom/facebook/messages/model/share/b;

    invoke-direct {v1}, Lcom/facebook/messages/model/share/b;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/share/b;->a(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/share/b;->b(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/share/b;->c(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/Sticker;->b()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/share/b;->d(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/Sticker;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/share/b;->e(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;

    move-result-object v1

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/share/b;->a(Ljava/util/List;)Lcom/facebook/messages/model/share/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/b;->h()Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    .line 1017
    const/4 v1, 0x1

    new-array v1, v1, [Lcom/facebook/messages/model/share/Share;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    .line 1020
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0
.end method

.method private ae()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1024
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    if-eqz v0, :cond_0

    .line 1025
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/Sticker;->a()Ljava/lang/String;

    move-result-object v0

    .line 1028
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private af()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1032
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    if-nez v0, :cond_0

    .line 1033
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaResources()Ljava/util/List;

    move-result-object v0

    .line 1035
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0
.end method

.method private ag()V
    .locals 2

    .prologue
    .line 1073
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aP:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1074
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1075
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->i:Lcom/facebook/orca/f/z;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/z;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aO:Lcom/facebook/user/UserKey;

    .line 1082
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aP:Z

    .line 1084
    :cond_0
    return-void

    .line 1079
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->f()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aO:Lcom/facebook/user/UserKey;

    goto :goto_0
.end method

.method private ah()V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1113
    const/4 v1, 0x0

    .line 1114
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->al()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1115
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1125
    :goto_0
    if-eqz v0, :cond_1

    .line 1126
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ap()V

    .line 1130
    :goto_1
    return-void

    .line 1118
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v2

    if-nez v2, :cond_2

    .line 1119
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->am:Lcom/facebook/orca/f/ac;

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/ac;->c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/common/w/q;

    move-result-object v1

    .line 1120
    invoke-virtual {v1, v0}, Lcom/facebook/common/w/q;->asBoolean(Z)Z

    move-result v0

    goto :goto_0

    .line 1128
    :cond_1
    sget-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private ai()V
    .locals 1

    .prologue
    .line 1168
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ao()Z

    move-result v0

    invoke-static {v0}, Lcom/facebook/debug/b/a;->b(Z)V

    .line 1169
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->i(Z)V

    .line 1170
    return-void
.end method

.method private aj()V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 1211
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ad:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_location_services_composer_dialog_content:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1213
    sget v0, Lcom/facebook/i;->text_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1214
    sget v1, Lcom/facebook/o;->compose_location_services_setting_disabled_description:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1216
    new-instance v2, Lcom/facebook/orca/compose/s;

    invoke-direct {v2, p0}, Lcom/facebook/orca/compose/s;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 1227
    sget v0, Lcom/facebook/o;->compose_location_services_disabled_title:I

    sget v1, Lcom/facebook/o;->dialog_enable:I

    sget v3, Lcom/facebook/o;->dialog_not_now:I

    invoke-static/range {v0 .. v5}, Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;->a(IILcom/facebook/orca/chatheads/c;ILcom/facebook/orca/chatheads/c;Landroid/view/View;)Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;

    move-result-object v0

    .line 1230
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "ALERT_DIALOG_TAG"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    .line 1231
    return-void
.end method

.method private ak()V
    .locals 2

    .prologue
    .line 1238
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-static {v0, v1}, Lcom/facebook/common/j/a;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1239
    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->d(Ljava/lang/String;)V

    .line 1246
    :goto_0
    return-void

    .line 1241
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.settings.SETTINGS"

    invoke-static {v0, v1}, Lcom/facebook/common/j/a;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1242
    const-string v0, "android.settings.SETTINGS"

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 1244
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private al()Z
    .locals 1

    .prologue
    .line 1300
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aV:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->am()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->an()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 1305
    :goto_0
    return v0

    .line 1300
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private am()Z
    .locals 3

    .prologue
    .line 1314
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method private an()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1324
    new-instance v1, Landroid/location/Criteria;

    invoke-direct {v1}, Landroid/location/Criteria;-><init>()V

    .line 1325
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 1326
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ac:Landroid/location/LocationManager;

    invoke-virtual {v2, v1, v0}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    move-result-object v1

    .line 1327
    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private ao()Z
    .locals 2

    .prologue
    .line 1337
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1338
    const-string v1, "android.hardware.location.gps"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private ap()V
    .locals 3

    .prologue
    .line 1360
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->e:Lcom/facebook/orca/f/k;

    invoke-virtual {v0}, Lcom/facebook/orca/f/k;->d()Landroid/location/Location;

    move-result-object v0

    .line 1361
    if-eqz v0, :cond_0

    .line 1362
    sget-object v1, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    .line 1367
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aC:Lcom/facebook/fbservice/ops/n;

    if-eqz v0, :cond_1

    .line 1403
    :goto_1
    return-void

    .line 1364
    :cond_0
    sget-object v0, Lcom/facebook/orca/compose/ak;->FINDING_LOCATION:Lcom/facebook/orca/compose/ak;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    goto :goto_0

    .line 1372
    :cond_1
    invoke-static {}, Lcom/facebook/location/GetDeviceLocationParams;->newBuilder()Lcom/facebook/location/o;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {v0, v1}, Lcom/facebook/location/o;->a(F)Lcom/facebook/location/o;

    move-result-object v0

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Lcom/facebook/location/o;->a(J)Lcom/facebook/location/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/location/o;->l()Lcom/facebook/location/GetDeviceLocationParams;

    move-result-object v0

    .line 1376
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1377
    const-string v2, "getDeviceLocationParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1379
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aB:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->A:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aC:Lcom/facebook/fbservice/ops/n;

    .line 1382
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aC:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/orca/compose/u;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/u;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/n;->a(Lcom/facebook/fbservice/ops/l;)V

    .line 1389
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aC:Lcom/facebook/fbservice/ops/n;

    new-instance v1, Lcom/facebook/orca/compose/v;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/v;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_1
.end method

.method private aq()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1406
    iput-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aG:Landroid/location/Location;

    .line 1407
    sget-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    .line 1408
    return-void
.end method

.method private ar()Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1411
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ah:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 1428
    :goto_0
    return v0

    .line 1414
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1416
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aV:Z

    if-eqz v0, :cond_2

    :cond_1
    move v0, v1

    .line 1418
    goto :goto_0

    .line 1422
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bk:Z

    goto :goto_0

    .line 1423
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 1426
    goto :goto_0

    .line 1428
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private as()V
    .locals 2

    .prologue
    .line 1432
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ar()Z

    move-result v0

    .line 1433
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->at:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 1434
    return-void

    .line 1433
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method private at()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1439
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ao()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aV:Z

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    .line 1447
    :goto_0
    if-eqz v0, :cond_4

    .line 1448
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 1452
    :goto_1
    return-void

    .line 1441
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aL:Lcom/facebook/orca/compose/ap;

    sget-object v2, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    if-eq v0, v2, :cond_2

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1442
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 1444
    goto :goto_0

    .line 1450
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_1
.end method

.method private au()V
    .locals 2

    .prologue
    .line 1503
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ax()V

    .line 1504
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 1505
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(ZZ)V

    .line 1506
    return-void
.end method

.method private av()V
    .locals 4

    .prologue
    .line 1564
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aT:Z

    if-eqz v0, :cond_0

    .line 1576
    :goto_0
    return-void

    .line 1567
    :cond_0
    new-instance v0, Lcom/facebook/orca/compose/w;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/w;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aX:Ljava/lang/Runnable;

    .line 1574
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aX:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/EditText;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1575
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aT:Z

    goto :goto_0
.end method

.method private aw()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v1, 0x1

    const/4 v6, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 1579
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ap:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aW:Z

    if-eqz v0, :cond_0

    move v0, v1

    .line 1580
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v0, :cond_1

    .line 1581
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aw:Landroid/widget/TextView;

    invoke-virtual {v1, v5, v6, v5, v2}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 1582
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->av:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 1588
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 1589
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ax:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1590
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aw:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1595
    :goto_2
    return-void

    :cond_0
    move v0, v2

    .line 1579
    goto :goto_0

    .line 1584
    :cond_1
    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aw:Landroid/widget/TextView;

    sget v4, Lcom/facebook/f;->composer_button_shadow:I

    invoke-virtual {v3, v5, v6, v5, v4}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 1585
    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->av:Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 1592
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ax:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1593
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aw:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method

.method private ax()V
    .locals 4

    .prologue
    .line 1598
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1599
    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    .line 1600
    sget v1, Lcom/facebook/orca/compose/ComposeFragment;->c:I

    if-le v0, v1, :cond_1

    .line 1601
    sget v1, Lcom/facebook/orca/compose/ComposeFragment;->d:I

    if-le v0, v1, :cond_0

    .line 1602
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/f;->red_warning_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1606
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    sget v2, Lcom/facebook/orca/compose/ComposeFragment;->b:I

    sub-int v0, v2, v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1607
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1612
    :goto_1
    return-void

    .line 1604
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/f;->grey53:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 1609
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1610
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1
.end method

.method private ay()V
    .locals 1

    .prologue
    .line 1615
    const-string v0, "sticker_clicked"

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->f(Ljava/lang/String;)V

    .line 1616
    return-void
.end method

.method private az()V
    .locals 1

    .prologue
    .line 1620
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    if-eqz v0, :cond_0

    .line 1621
    const-string v0, "sms_send_clicked"

    .line 1627
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->f(Ljava/lang/String;)V

    .line 1628
    return-void

    .line 1622
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    if-eqz v0, :cond_1

    .line 1623
    const-string v0, "audio_send_triggered"

    goto :goto_0

    .line 1625
    :cond_1
    const-string v0, "send_clicked"

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/String;)Landroid/text/SpannableString;
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->e(Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/stickers/StickerPopup;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    return-object v0
.end method

.method private b(Landroid/location/Location;)V
    .locals 2

    .prologue
    .line 1348
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq v0, v1, :cond_0

    .line 1349
    sget-object v0, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    .line 1351
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/compose/ComposeFragment;Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->b(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/compose/ComposeFragment;Z)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->l(Z)V

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 1966
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 1967
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 1968
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 1971
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    aget v0, v0, v1

    int-to-float v0, v0

    sub-float v0, v4, v0

    invoke-virtual {p1, v3, v0}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 1972
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    check-cast v0, Lcom/facebook/orca/compose/ComposeRootView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeRootView;->getEmojiAttachmentTouchDelegate()Landroid/view/TouchDelegate;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/TouchDelegate;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    check-cast v0, Lcom/facebook/orca/compose/ComposeRootView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeRootView;->getStickerTouchDelegate()Landroid/view/TouchDelegate;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/TouchDelegate;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    .line 1975
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 1976
    return v0

    .line 1972
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/emoji/ah;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/compose/ComposeFragment;Z)Z
    .locals 0

    .prologue
    .line 134
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bj:Z

    return p1
.end method

.method static synthetic d(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/compose/ComposeFragment;Z)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->i(Z)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v4, 0x0

    .line 1254
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ad:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_location_services_composer_dialog_content:I

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1256
    sget v0, Lcom/facebook/i;->text_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1258
    if-eqz p1, :cond_0

    .line 1259
    sget v1, Lcom/facebook/o;->compose_location_services_phone_disabled_description:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1266
    :goto_0
    if-eqz p1, :cond_1

    .line 1267
    new-instance v2, Lcom/facebook/orca/compose/t;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/compose/t;-><init>(Lcom/facebook/orca/compose/ComposeFragment;Ljava/lang/String;)V

    .line 1276
    sget v0, Lcom/facebook/o;->compose_location_services_disabled_title:I

    sget v1, Lcom/facebook/o;->compose_location_services_phone_disabled_go_to_settings_button:I

    sget v3, Lcom/facebook/o;->dialog_cancel:I

    invoke-static/range {v0 .. v5}, Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;->a(IILcom/facebook/orca/chatheads/c;ILcom/facebook/orca/chatheads/c;Landroid/view/View;)Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;

    move-result-object v0

    .line 1288
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "ALERT_DIALOG_TAG"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    .line 1289
    return-void

    .line 1261
    :cond_0
    sget v1, Lcom/facebook/o;->compose_location_services_phone_disabled_description2:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 1282
    :cond_1
    sget v0, Lcom/facebook/o;->compose_location_services_disabled_title:I

    sget v1, Lcom/facebook/o;->dialog_ok:I

    const/4 v3, 0x0

    move-object v2, v4

    invoke-static/range {v0 .. v5}, Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;->a(IILcom/facebook/orca/chatheads/c;ILcom/facebook/orca/chatheads/c;Landroid/view/View;)Lcom/facebook/orca/chatheads/AutoDismissAlertFragment;

    move-result-object v0

    goto :goto_1
.end method

.method private e(Ljava/lang/String;)Landroid/text/SpannableString;
    .locals 4

    .prologue
    .line 1486
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    .line 1487
    new-instance v1, Lcom/facebook/common/w/o;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 1488
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    sget v3, Lcom/facebook/f;->notification_greyish_light:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v2, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v0, 0x21

    invoke-virtual {v1, v2, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 1491
    invoke-virtual {v1, p1}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 1492
    invoke-virtual {v1}, Lcom/facebook/common/w/o;->a()Lcom/facebook/common/w/o;

    .line 1493
    invoke-virtual {v1}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ap;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aL:Lcom/facebook/orca/compose/ap;

    return-object v0
.end method

.method private e(I)V
    .locals 4

    .prologue
    .line 1671
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1672
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1673
    const-string v2, "thread_view_spec"

    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1674
    const-string v2, "show_composer"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1675
    const-string v2, "composer_initial_text"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1676
    const-string v0, "trigger"

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bm:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1678
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 1679
    const-string v0, "open_media_picker_source"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1682
    :cond_0
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1684
    invoke-virtual {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/content/Intent;)V

    .line 1686
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aJ:Lcom/facebook/orca/compose/am;

    if-eqz v0, :cond_1

    .line 1687
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aJ:Lcom/facebook/orca/compose/am;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-interface {v0, v1}, Lcom/facebook/orca/compose/am;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1689
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/compose/ComposeFragment;Z)Z
    .locals 0

    .prologue
    .line 134
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aT:Z

    return p1
.end method

.method private f(Z)I
    .locals 1

    .prologue
    .line 887
    if-eqz p1, :cond_0

    .line 888
    sget v0, Lcom/facebook/h;->orca_composer_chat_head_send_sms_button:I

    .line 890
    :goto_0
    return v0

    :cond_0
    sget v0, Lcom/facebook/h;->orca_composer_chat_head_send_button:I

    goto :goto_0
.end method

.method static synthetic f(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->au:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private f(I)V
    .locals 2

    .prologue
    .line 1998
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 1999
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2000
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    invoke-virtual {v0}, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;->a()V

    .line 2001
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->k(Z)V

    .line 2003
    :cond_0
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaParams;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;-><init>(Z)V

    .line 2004
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaResources()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a(Ljava/util/List;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 2005
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-virtual {v1, v0, p1}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/PickMediaParams;I)V

    .line 2012
    :goto_0
    return-void

    .line 2010
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->e(I)V

    goto :goto_0
.end method

.method private f(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 1631
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    sget v1, Lcom/facebook/orca/compose/ComposeFragment;->b:I

    if-le v0, v1, :cond_1

    .line 1649
    :cond_0
    :goto_0
    return-void

    .line 1634
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aI:Lcom/facebook/orca/compose/an;

    if-eqz v0, :cond_0

    .line 1635
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ab:Lcom/facebook/orca/prefs/az;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/prefs/az;->c(Ljava/lang/String;)V

    .line 1636
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->HAS_LOCATION:Lcom/facebook/orca/compose/ak;

    if-ne v0, v1, :cond_2

    .line 1637
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->e:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aG:Landroid/location/Location;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/f/k;->a(Ljava/lang/String;Landroid/location/Location;J)V

    .line 1643
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aI:Lcom/facebook/orca/compose/an;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/an;->a()V

    .line 1645
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_0

    .line 1646
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    goto :goto_0
.end method

.method private g(Z)I
    .locals 1

    .prologue
    .line 895
    if-eqz p1, :cond_0

    .line 896
    sget v0, Lcom/facebook/h;->orca_composer_chat_head_popup_button_active:I

    .line 898
    :goto_0
    return v0

    :cond_0
    sget v0, Lcom/facebook/h;->orca_composer_chat_head_popup_button:I

    goto :goto_0
.end method

.method static synthetic g(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->at:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 2117
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 2118
    const-string v1, "emoji_attachment_popup"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 2119
    const-string v1, "action"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 2120
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ak:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 2121
    return-void
.end method

.method private h(Z)I
    .locals 1

    .prologue
    .line 903
    if-eqz p1, :cond_0

    sget v0, Lcom/facebook/h;->orca_stickers_on:I

    :goto_0
    return v0

    :cond_0
    sget v0, Lcom/facebook/h;->orca_stickers_off:I

    goto :goto_0
.end method

.method static synthetic h(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic i(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ai()V

    return-void
.end method

.method private i(Z)V
    .locals 4

    .prologue
    .line 1182
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->am()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1183
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aj()V

    .line 1204
    :goto_0
    return-void

    .line 1187
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->an()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1188
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ak()V

    goto :goto_0

    .line 1192
    :cond_1
    if-nez p1, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    .line 1193
    :goto_1
    invoke-static {v0}, Lcom/facebook/common/w/q;->valueOf(Z)Lcom/facebook/common/w/q;

    move-result-object v1

    .line 1194
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->am:Lcom/facebook/orca/f/ac;

    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2, v3, v1}, Lcom/facebook/orca/f/ac;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/common/w/q;)V

    .line 1195
    if-eqz v0, :cond_4

    .line 1196
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aH:Ljava/lang/Boolean;

    .line 1197
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ap()V

    .line 1198
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ab:Lcom/facebook/orca/prefs/az;

    const-string v1, "enabled_shared_location_in_message"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 1192
    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    .line 1200
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aH:Ljava/lang/Boolean;

    .line 1201
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aq()V

    .line 1202
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ab:Lcom/facebook/orca/prefs/az;

    const-string v1, "disabled_shared_location_in_message"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/prefs/az;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private j(Z)I
    .locals 1

    .prologue
    .line 1455
    if-eqz p1, :cond_0

    sget v0, Lcom/facebook/h;->orca_composer_chat_head_location_on:I

    :goto_0
    return v0

    :cond_0
    sget v0, Lcom/facebook/h;->orca_composer_chat_head_location_off:I

    goto :goto_0
.end method

.method static synthetic j(Lcom/facebook/orca/compose/ComposeFragment;)Z
    .locals 1

    .prologue
    .line 134
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bg:Z

    return v0
.end method

.method static synthetic k(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aE()V

    return-void
.end method

.method private k(Z)V
    .locals 2

    .prologue
    .line 2021
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bf:Z

    if-ne v0, p1, :cond_0

    .line 2031
    :goto_0
    return-void

    .line 2024
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bf:Z

    .line 2026
    if-eqz p1, :cond_1

    .line 2027
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->au:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->g(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    .line 2029
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->au:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->g(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0
.end method

.method static synthetic l(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aD()V

    return-void
.end method

.method private l(Z)V
    .locals 2

    .prologue
    .line 2034
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bg:Z

    .line 2035
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->at:Landroid/widget/ImageButton;

    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->h(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 2036
    return-void
.end method

.method static synthetic m(Lcom/facebook/orca/compose/ComposeFragment;)Z
    .locals 1

    .prologue
    .line 134
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bf:Z

    return v0
.end method

.method static synthetic n(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aC()V

    return-void
.end method

.method static synthetic o(Lcom/facebook/orca/compose/ComposeFragment;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ag:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic p(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aF()V

    return-void
.end method

.method static synthetic q(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aB()V

    return-void
.end method

.method static synthetic r(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aA()V

    return-void
.end method

.method static synthetic s(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->au()V

    return-void
.end method

.method static synthetic t(Lcom/facebook/orca/compose/ComposeFragment;)Z
    .locals 1

    .prologue
    .line 134
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bj:Z

    return v0
.end method

.method static synthetic u(Lcom/facebook/orca/compose/ComposeFragment;)Z
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ab()Z

    move-result v0

    return v0
.end method

.method static synthetic v(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    return-void
.end method

.method static synthetic w(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Z()V

    return-void
.end method

.method static synthetic x(Lcom/facebook/orca/compose/ComposeFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aM()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic y(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    return-object v0
.end method

.method static synthetic z(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->az()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 758
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 759
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bd:Z

    .line 760
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Z()V

    .line 761
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aE()V

    .line 763
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aj:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    .line 764
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ab()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 765
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bj:Z

    .line 766
    if-eqz v0, :cond_2

    .line 767
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bj:Z

    .line 772
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bi:Z

    if-eqz v0, :cond_1

    .line 773
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aJ()V

    .line 775
    :cond_1
    return-void

    .line 769
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    goto :goto_0
.end method

.method public B()V
    .locals 1

    .prologue
    .line 744
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 745
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bd:Z

    .line 746
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->h:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 747
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->V()V

    .line 748
    return-void
.end method

.method public C()V
    .locals 1

    .prologue
    .line 752
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->C()V

    .line 753
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    .line 754
    return-void
.end method

.method public O()Lcom/facebook/messages/model/threads/Message;
    .locals 13

    .prologue
    const-wide/16 v6, -0x1

    .line 967
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 968
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->Z:Lcom/facebook/orca/common/a/b;

    invoke-virtual {v0}, Lcom/facebook/orca/common/a/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    .line 970
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ae:Lcom/facebook/orca/f/n;

    const/16 v1, 0x384

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ac()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ae()Ljava/lang/String;

    move-result-object v5

    iget-object v8, p0, Lcom/facebook/orca/compose/ComposeFragment;->aG:Landroid/location/Location;

    invoke-static {v8}, Lcom/facebook/location/Coordinates;->a(Landroid/location/Location;)Lcom/facebook/location/Coordinates;

    move-result-object v10

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->af()Ljava/util/List;

    move-result-object v11

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ad()Ljava/util/List;

    move-result-object v12

    move-wide v8, v6

    invoke-virtual/range {v0 .. v12}, Lcom/facebook/orca/f/n;->a(ILcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;Ljava/util/List;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method public P()Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 1048
    invoke-static {}, Landroid_src/mms/c;->j()I

    move-result v0

    invoke-static {}, Landroid_src/mms/c;->i()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1049
    invoke-static {}, Landroid_src/mms/c;->b()I

    move-result v0

    add-int/lit16 v0, v0, -0x1388

    .line 1050
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaAttachments()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v4

    .line 1052
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaAttachments()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v0

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/a;

    .line 1053
    div-int v6, v1, v4

    .line 1054
    iget-object v7, p0, Lcom/facebook/orca/compose/ComposeFragment;->ai:Lcom/facebook/ui/media/b/a;

    invoke-virtual {v7, v0, v3, v3, v6}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/a;III)[B

    move-result-object v0

    .line 1060
    if-nez v0, :cond_1

    .line 1069
    :cond_0
    :goto_1
    return v2

    .line 1063
    :cond_1
    array-length v0, v0

    .line 1064
    sub-int v0, v1, v0

    .line 1065
    if-ltz v0, :cond_0

    move v1, v0

    .line 1068
    goto :goto_0

    .line 1069
    :cond_2
    if-lez v1, :cond_3

    const/4 v0, 0x1

    :goto_2
    move v2, v0

    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2
.end method

.method public Q()Z
    .locals 2

    .prologue
    .line 1087
    sget-object v0, Lcom/google/common/base/CharMatcher;->WHITESPACE:Lcom/google/common/base/CharMatcher;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/base/CharMatcher;->trimFrom(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 1088
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public R()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1095
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    if-nez v0, :cond_0

    .line 1096
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1097
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a()V

    .line 1101
    :goto_0
    iput-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    .line 1102
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 1103
    return-void

    .line 1099
    :cond_0
    iput-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->bl:Lcom/facebook/orca/stickers/Sticker;

    goto :goto_0
.end method

.method public T()V
    .locals 0

    .prologue
    .line 1106
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    .line 1107
    return-void
.end method

.method public U()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 2130
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 2131
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    .line 2132
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aV:Z

    .line 2133
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aW:Z

    .line 2134
    iput-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aH:Ljava/lang/Boolean;

    .line 2137
    iput-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aG:Landroid/location/Location;

    .line 2138
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    sget v1, Lcom/facebook/h;->orca_composer_location_off:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 2139
    sget-object v0, Lcom/facebook/orca/compose/ak;->INIT:Lcom/facebook/orca/compose/ak;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    .line 2142
    iput-boolean v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aP:Z

    .line 2143
    iput-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aO:Lcom/facebook/user/UserKey;

    .line 2145
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 2146
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a()V

    .line 2147
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aK()V

    .line 2148
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->as()V

    .line 2149
    return-void
.end method

.method public V()V
    .locals 2

    .prologue
    .line 2155
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(ZZ)V

    .line 2156
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aX:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2157
    return-void
.end method

.method public W()Z
    .locals 1

    .prologue
    .line 2165
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/AudioComposerView;->c()Z

    move-result v0

    return v0
.end method

.method public X()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 2173
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getLineCount()I

    move-result v1

    if-gt v1, v0, :cond_1

    .line 2182
    :cond_0
    :goto_0
    return v0

    .line 2177
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getScrollY()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getTotalPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getTotalPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    .line 2180
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getLayout()Landroid/text/Layout;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getLineCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v2

    .line 2182
    if-ge v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public Y()V
    .locals 1

    .prologue
    .line 2233
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/AudioComposerView;->d()V

    .line 2234
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 455
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 458
    sget v0, Lcom/facebook/p;->Theme_Orca_MessageComposer:I

    .line 459
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 460
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, Lcom/facebook/d;->messageComposerTheme:I

    invoke-virtual {v2, v3, v1, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 462
    iget v0, v1, Landroid/util/TypedValue;->resourceId:I

    .line 465
    :cond_0
    new-instance v1, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 466
    invoke-virtual {p1, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 468
    sget v1, Lcom/facebook/k;->orca_chat_thread_composer_view:I

    invoke-virtual {v0, v1, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    .line 469
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 470
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/compose/z;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/z;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 488
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_edit:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    .line 489
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_button_location:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    .line 490
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_button_stickers:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->at:Landroid/widget/ImageButton;

    .line 491
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_emoji_attachments:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->au:Landroid/widget/ImageButton;

    .line 492
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_button_send:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->av:Landroid/view/View;

    .line 493
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_button_send_text:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aw:Landroid/widget/TextView;

    .line 494
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_button_like:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ax:Landroid/widget/ImageView;

    .line 495
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_chars_left:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ay:Landroid/widget/TextView;

    .line 496
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->audio_composer:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/AudioComposerView;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    .line 497
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_text_and_attachments_root:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aA:Landroid/view/ViewGroup;

    .line 498
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    sget v1, Lcom/facebook/i;->compose_attachment_container:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    .line 500
    sget-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 502
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->as:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/compose/ab;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/ab;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 509
    invoke-direct {p0, v4}, Lcom/facebook/orca/compose/ComposeFragment;->l(Z)V

    .line 510
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->at:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/compose/ac;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/ac;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 521
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->au:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/compose/ad;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/ad;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 542
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->av:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/compose/ae;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/ae;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 549
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/compose/af;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/af;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 571
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    instance-of v0, v0, Lcom/facebook/widget/text/BetterEditTextView;

    if-eqz v0, :cond_1

    .line 572
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    check-cast v0, Lcom/facebook/widget/text/BetterEditTextView;

    new-instance v1, Lcom/facebook/orca/compose/ag;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/ag;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/BetterEditTextView;->setOnScrollListener(Lcom/facebook/widget/text/a;)V

    .line 581
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/compose/ah;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/ah;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 598
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Lcom/facebook/analytics/bp;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 600
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->az:Lcom/facebook/orca/compose/AudioComposerView;

    new-instance v1, Lcom/facebook/orca/compose/p;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/p;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->setListener(Lcom/facebook/orca/compose/g;)V

    .line 614
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    new-instance v1, Lcom/facebook/orca/compose/q;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/q;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->setListener(Lcom/facebook/orca/compose/k;)V

    .line 629
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 630
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->au:Landroid/widget/ImageButton;

    invoke-direct {p0, v4}, Lcom/facebook/orca/compose/ComposeFragment;->g(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 632
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aq:Landroid/view/View;

    return-object v0
.end method

.method public a()V
    .locals 3

    .prologue
    .line 390
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 392
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 393
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 308
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 310
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 311
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->e:Lcom/facebook/orca/f/k;

    .line 313
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aB:Lcom/facebook/fbservice/ops/k;

    .line 314
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/d;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->f:Lcom/facebook/ui/media/attachments/d;

    .line 315
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    .line 316
    const-class v0, Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/a;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->h:Lcom/facebook/orca/common/ui/widgets/a;

    .line 317
    const-class v0, Lcom/facebook/orca/f/z;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/z;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->i:Lcom/facebook/orca/f/z;

    .line 318
    const-class v0, Lcom/facebook/orca/common/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/a/b;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->Z:Lcom/facebook/orca/common/a/b;

    .line 319
    const-class v0, Lcom/facebook/l/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/k;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aa:Lcom/facebook/l/k;

    .line 320
    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/az;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ab:Lcom/facebook/orca/prefs/az;

    .line 321
    const-class v0, Landroid/location/LocationManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ac:Landroid/location/LocationManager;

    .line 322
    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ad:Landroid/view/LayoutInflater;

    .line 323
    const-class v0, Lcom/facebook/orca/f/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/n;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ae:Lcom/facebook/orca/f/n;

    .line 324
    const-class v0, Lcom/facebook/orca/emoji/z;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/z;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->af:Lcom/facebook/orca/emoji/z;

    .line 325
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsEmojiAttachmentPopupEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ag:Ljavax/inject/a;

    .line 327
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsStickersFeatureEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ah:Ljavax/inject/a;

    .line 329
    const-class v0, Lcom/facebook/ui/media/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/b/a;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ai:Lcom/facebook/ui/media/b/a;

    .line 330
    const-class v0, Landroid/app/KeyguardManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aj:Landroid/app/KeyguardManager;

    .line 331
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ak:Lcom/facebook/analytics/av;

    .line 332
    const-class v0, Lcom/facebook/orca/f/ac;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ac;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->am:Lcom/facebook/orca/f/ac;

    .line 333
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsAudioRecorderEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->al:Ljavax/inject/a;

    .line 335
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->an:Lcom/facebook/c/s;

    .line 336
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsMmsSendPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ao:Ljavax/inject/a;

    .line 338
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsEmptyComposeLikeEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ap:Ljavax/inject/a;

    .line 340
    const-class v0, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bc:Landroid/os/Handler;

    .line 341
    const-class v0, Lcom/facebook/orca/compose/aq;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/aq;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aN:Lcom/facebook/orca/compose/aq;

    .line 343
    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 344
    if-eqz v0, :cond_0

    .line 345
    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aV:Z

    .line 347
    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .prologue
    .line 931
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    .line 932
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 933
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 934
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    .line 935
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 936
    invoke-virtual {p1, v1, v3, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 937
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 862
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 863
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v2}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Z)V

    .line 867
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 868
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aD:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v2

    .line 869
    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    invoke-static {v2}, Lcom/facebook/orca/emoji/q;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v2

    invoke-interface {v3, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v2

    if-ne v2, v0, :cond_2

    .line 874
    :goto_0
    if-eqz v0, :cond_1

    .line 875
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aJ()V

    .line 879
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aL:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    if-ne v0, v1, :cond_0

    .line 880
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq v0, v1, :cond_0

    .line 881
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    .line 884
    :cond_0
    return-void

    .line 877
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aK()V

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/compose/MessageDraft;)V
    .locals 6

    .prologue
    .line 830
    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->a()Ljava/lang/String;

    move-result-object v1

    .line 833
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 835
    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->b()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->b()I

    move-result v0

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->length()I

    move-result v2

    if-gt v0, v2, :cond_0

    .line 836
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 838
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 839
    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->c()Ljava/util/List;

    move-result-object v2

    .line 840
    invoke-virtual {p1}, Lcom/facebook/orca/compose/MessageDraft;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    .line 841
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 843
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a()V

    .line 844
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 845
    iget-object v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->f:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v4, v0}, Lcom/facebook/ui/media/attachments/d;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 846
    iget-object v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    iget-object v5, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    invoke-virtual {v4, v0, v5}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/facebook/ui/media/attachments/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 848
    :catch_0
    move-exception v0

    .line 849
    sget-object v3, Lcom/facebook/orca/compose/ComposeFragment;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cannot create attachment for draft: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 852
    :cond_1
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 853
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->b()V

    .line 855
    :cond_3
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/ai;)V
    .locals 4

    .prologue
    .line 783
    if-nez p1, :cond_1

    .line 810
    :cond_0
    :goto_0
    return-void

    .line 786
    :cond_1
    iget-object v0, p1, Lcom/facebook/orca/compose/ai;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 787
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    iget-object v1, p1, Lcom/facebook/orca/compose/ai;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 790
    :cond_2
    :try_start_0
    iget-object v0, p1, Lcom/facebook/orca/compose/ai;->b:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 791
    iget-object v0, p1, Lcom/facebook/orca/compose/ai;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 792
    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 793
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->f:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v2, v0}, Lcom/facebook/ui/media/attachments/d;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 795
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aM()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->a(Lcom/facebook/ui/media/attachments/a;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/facebook/ui/media/attachments/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 798
    :catch_0
    move-exception v0

    .line 799
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/o;->image_attachment_failed_attach_type:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 801
    invoke-direct {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->e(Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    .line 804
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 806
    iget v0, p1, Lcom/facebook/orca/compose/ai;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 807
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    new-instance v1, Lcom/facebook/orca/photos/picking/PickMediaParams;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaParams;-><init>(Z)V

    iget v2, p1, Lcom/facebook/orca/compose/ai;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/PickMediaParams;I)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/compose/al;)V
    .locals 2

    .prologue
    .line 2186
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bc:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2187
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bb:Lcom/facebook/orca/compose/al;

    .line 2188
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/am;)V
    .locals 0

    .prologue
    .line 2212
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aJ:Lcom/facebook/orca/compose/am;

    .line 2213
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/an;)V
    .locals 0

    .prologue
    .line 959
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aI:Lcom/facebook/orca/compose/an;

    .line 960
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/ap;)V
    .locals 2

    .prologue
    .line 940
    sget-object v0, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    if-ne p1, v0, :cond_1

    .line 941
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    sget-object v1, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    if-eq v0, v1, :cond_0

    .line 942
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->ah()V

    .line 949
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aL:Lcom/facebook/orca/compose/ap;

    .line 950
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->as()V

    .line 951
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->at()V

    .line 952
    return-void

    .line 945
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 946
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->h:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/compose/av;)V
    .locals 0

    .prologue
    .line 963
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aK:Lcom/facebook/orca/compose/av;

    .line 964
    return-void
.end method

.method public a(Lcom/facebook/orca/emoji/ah;)V
    .locals 2

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/orca/emoji/ah;->a(Lcom/facebook/orca/emoji/ai;)V

    .line 356
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ba:Lcom/facebook/orca/emoji/ah;

    .line 358
    if-eqz p1, :cond_1

    .line 359
    new-instance v0, Lcom/facebook/orca/compose/o;

    invoke-direct {v0, p0}, Lcom/facebook/orca/compose/o;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-interface {p1, v0}, Lcom/facebook/orca/emoji/ah;->a(Lcom/facebook/orca/emoji/ai;)V

    .line 387
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1141
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aH:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 1142
    invoke-static {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1143
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aH:Ljava/lang/Boolean;

    invoke-static {v1}, Lcom/facebook/common/w/q;->valueOf(Ljava/lang/Boolean;)Lcom/facebook/common/w/q;

    move-result-object v1

    .line 1144
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->am:Lcom/facebook/orca/f/ac;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/f/ac;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/common/w/q;)V

    .line 1146
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    .line 907
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aU:Z

    .line 910
    if-eqz p1, :cond_0

    .line 911
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->f(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 912
    sget v0, Lcom/facebook/o;->composer_hint_new_thread_sms:I

    .line 917
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->setComposingSmsThread(Z)V

    .line 918
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->as()V

    .line 919
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->at()V

    .line 920
    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->av:Landroid/view/View;

    invoke-virtual {p0, v2, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 921
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setHint(I)V

    .line 922
    return-void

    .line 914
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->f(Z)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 915
    sget v0, Lcom/facebook/o;->composer_hint_new_thread:I

    goto :goto_0
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 2227
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/common/t/a/b;->a(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/Rect;

    move-result-object v0

    .line 2229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 654
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aa()Z

    move-result v0

    if-nez v0, :cond_0

    .line 662
    :goto_0
    return-void

    .line 658
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 659
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 661
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1157
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->g:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/orca/emoji/q;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v2

    iget-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bh:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 1161
    return-void

    .line 1157
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Z)V
    .locals 0

    .prologue
    .line 925
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aW:Z

    .line 926
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aw()V

    .line 927
    return-void
.end method

.method public c()Lcom/facebook/orca/compose/MessageDraft;
    .locals 5

    .prologue
    .line 817
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 818
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 819
    const/4 v0, 0x0

    .line 821
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/orca/compose/MessageDraft;

    iget-object v2, p0, Lcom/facebook/orca/compose/ComposeFragment;->ar:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/orca/compose/ComposeFragment;->aM:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v3}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaResources()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/compose/ComposeFragment;->bn:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/orca/compose/MessageDraft;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 2216
    iput-object p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bm:Ljava/lang/String;

    .line 2217
    return-void
.end method

.method public d()Lcom/facebook/orca/compose/ap;
    .locals 1

    .prologue
    .line 955
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aL:Lcom/facebook/orca/compose/ap;

    return-object v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 666
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 668
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 669
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "pickPhotoOperation"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    .line 671
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    if-nez v0, :cond_0

    .line 672
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-direct {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    .line 673
    const-string v0, "pickPhotoOperation"

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 675
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aE:Lcom/facebook/orca/photos/picking/PickMediaOperation;

    new-instance v1, Lcom/facebook/orca/compose/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/compose/r;-><init>(Lcom/facebook/orca/compose/ComposeFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/i;)V

    .line 704
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->h:Lcom/facebook/orca/common/ui/widgets/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/a;->a(Z)V

    .line 705
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->be:I

    .line 711
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "emojiKeyboard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aY:Lcom/facebook/orca/emoji/EmojiAttachmentPopup;

    .line 713
    invoke-virtual {p0}, Lcom/facebook/orca/compose/ComposeFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "stickerKeyboard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPopup;

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->aZ:Lcom/facebook/orca/stickers/StickerPopup;

    .line 716
    if-eqz p1, :cond_3

    .line 717
    sget-object v0, Lcom/facebook/orca/compose/ak;->NO_LOCATION:Lcom/facebook/orca/compose/ak;

    .line 718
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->al()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 719
    const-string v0, "locationState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/compose/ak;->valueOf(Ljava/lang/String;)Lcom/facebook/orca/compose/ak;

    move-result-object v0

    .line 723
    :cond_2
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ak;Landroid/location/Location;)V

    .line 725
    const-string v0, "shouldShowAudioComposerOnResume"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->bi:Z

    .line 728
    const-string v0, "trigger"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 729
    const-string v0, "trigger"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeFragment;->c(Ljava/lang/String;)V

    .line 732
    :cond_3
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 736
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 737
    const-string v0, "locationState"

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->aF:Lcom/facebook/orca/compose/ak;

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ak;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    const-string v0, "shouldShowAudioComposerOnResume"

    iget-boolean v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bi:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 739
    const-string v0, "trigger"

    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bm:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    return-void
.end method

.method public e(Z)V
    .locals 0

    .prologue
    .line 2160
    iput-boolean p1, p0, Lcom/facebook/orca/compose/ComposeFragment;->bk:Z

    .line 2161
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->as()V

    .line 2162
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 397
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 399
    iget v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->be:I

    iget v1, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v1, :cond_0

    .line 400
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->Z()V

    .line 401
    invoke-direct {p0}, Lcom/facebook/orca/compose/ComposeFragment;->aE()V

    .line 403
    :cond_0
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/facebook/orca/compose/ComposeFragment;->be:I

    .line 404
    return-void
.end method
