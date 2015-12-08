.class public abstract Lcom/kik/cards/web/CardsWebViewFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/au;
.implements Lcom/kik/cards/web/ay;
.implements Lcom/kik/cards/web/az;
.implements Lcom/kik/cards/web/browser/BrowserPlugin$a;
.implements Lcom/kik/cards/web/iap/k;
.implements Lcom/kik/cards/web/usermedia/a;
.implements Lcom/kik/cards/web/usermedia/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/web/CardsWebViewFragment$a;
    }
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;

.field protected static final b:Landroid/view/ViewGroup$LayoutParams;

.field private static final x:Lorg/c/b;


# instance fields
.field private A:Lcom/kik/cards/web/bd;

.field private B:Z

.field private C:Ljava/util/concurrent/ScheduledExecutorService;

.field private D:Lcom/kik/cards/web/browser/BrowserPlugin;

.field private E:Lcom/kik/cards/web/volume/VolumePlugin;

.field private F:Lcom/kik/cards/web/kik/KikPlugin;

.field private G:Lcom/kik/cards/web/userdata/UserDataPlugin;

.field private H:Lcom/kik/cards/web/auth/AuthPlugin;

.field private I:Lcom/kik/cards/web/picker/PickerPlugin;

.field private J:Lcom/kik/cards/web/video/VideoPlayerPlugin;

.field private K:Lcom/kik/android/stickers/MediaItemPlugin;

.field private L:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

.field private M:Lcom/kik/cards/web/usermedia/PhotoPlugin;

.field private N:Lcom/kik/cards/web/config/ConfigurationPlugin;

.field private O:Lcom/kik/cards/web/config/XDataPlugin;

.field private P:Lcom/kik/cards/web/profile/ProfilePlugin;

.field private Q:Lcom/kik/cards/web/automation/AutomationPlugin;

.field private R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

.field private S:Ljava/lang/String;

.field private U:Landroid/widget/RelativeLayout;

.field private V:I

.field private W:Ljava/lang/String;

.field private X:Ljava/lang/String;

.field private Y:Landroid/support/v4/app/FragmentActivity;

.field private Z:Lkik/android/util/cv$c;

.field private final aA:Lcom/kik/g/k;

.field private final aB:Lcom/kik/g/k;

.field private final aC:Lcom/kik/g/k;

.field private final aD:Lcom/kik/g/k;

.field private final aE:Lcom/kik/g/k;

.field private final aF:Lcom/kik/g/k;

.field private final aG:Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;

.field private final aH:Lcom/kik/g/i;

.field private final aI:Landroid/webkit/DownloadListener;

.field private final aJ:Lcom/kik/g/i;

.field private final aK:Lcom/kik/g/i;

.field private final aL:Lcom/kik/g/i;

.field private final aM:Lcom/kik/g/i;

.field private final aN:Lcom/kik/g/i;

.field private final aO:Landroid/view/View$OnClickListener;

.field private final aP:Landroid/view/View$OnClickListener;

.field private final aQ:Lcom/kik/g/i;

.field private final aR:Lcom/kik/g/i;

.field private aS:Landroid/view/View$OnClickListener;

.field private aT:I

.field private aa:Lcom/kik/cards/web/video/b;

.field private ab:Z

.field private ac:Ljava/util/List;

.field private ad:Ljava/util/Map;

.field private ae:Lcom/kik/g/p;

.field private af:I

.field private ag:Landroid/view/View;

.field private ah:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private ai:Landroid/view/ViewGroup;

.field private aj:Landroid/view/View;

.field private ak:Landroid/widget/ImageView;

.field private al:Landroid/widget/ImageView;

.field private am:Landroid/widget/TextView;

.field private an:Landroid/view/ViewGroup;

.field private ao:Landroid/widget/TextView;

.field private ap:Landroid/view/View;

.field private aq:Landroid/widget/ProgressBar;

.field private ar:Landroid/view/ViewGroup;

.field private as:Lkik/android/widget/EllipsizingTextView;

.field private at:Landroid/widget/ImageView;

.field private au:Lcom/kik/cards/web/browser/WebHistoryPlugin;

.field private av:Lcom/kik/g/ar;

.field private aw:Landroid/view/View;

.field private final ax:Lcom/kik/g/k;

.field private final ay:Lcom/kik/g/k;

.field private final az:Lcom/kik/g/k;

.field protected c:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/j/m;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/u;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/android/c/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/a/e/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/a/i/h;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected j:Lkik/a/e/m;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected k:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected l:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected m:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected n:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected o:Lkik/a/e/q;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected p:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CardImageLoader"
    .end annotation
.end field

.field protected q:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected r:Lcom/kik/cards/web/picker/PickerRequest;

.field protected s:Lcom/kik/cards/web/kik/KikContentMessageParcelable;

.field protected t:Lkik/android/b/s;

.field private y:J

.field private z:Lcom/kik/g/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/16 v3, 0xa

    .line 152
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "kik.com"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "zynga.com"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "tresensa.com"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "cards-sticker.herokuapp.com"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "crusher.herokuapp.com"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "cards-hamster.herokuapp.com"

    aput-object v2, v0, v1

    sput-object v0, Lcom/kik/cards/web/CardsWebViewFragment;->a:[Ljava/lang/String;

    .line 154
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/kik/cards/web/CardsWebViewFragment;->b:Landroid/view/ViewGroup$LayoutParams;

    .line 155
    const-string v0, "WebViewFragment"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/CardsWebViewFragment;->x:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 619
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 175
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    .line 178
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->C:Ljava/util/concurrent/ScheduledExecutorService;

    .line 196
    const/4 v0, -0x1

    iput v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->V:I

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ac:Ljava/util/List;

    .line 210
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ad:Ljava/util/Map;

    .line 211
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ae:Lcom/kik/g/p;

    .line 213
    const/16 v0, 0x7530

    iput v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->af:I

    .line 232
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ax:Lcom/kik/g/k;

    .line 233
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ay:Lcom/kik/g/k;

    .line 234
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->az:Lcom/kik/g/k;

    .line 235
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aA:Lcom/kik/g/k;

    .line 236
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aB:Lcom/kik/g/k;

    .line 237
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aC:Lcom/kik/g/k;

    .line 238
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aD:Lcom/kik/g/k;

    .line 239
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aE:Lcom/kik/g/k;

    .line 240
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aF:Lcom/kik/g/k;

    .line 241
    new-instance v0, Lcom/kik/cards/web/a;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/a;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aG:Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;

    .line 265
    new-instance v0, Lcom/kik/cards/web/o;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/o;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aH:Lcom/kik/g/i;

    .line 354
    new-instance v0, Lcom/kik/cards/web/ai;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/ai;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aI:Landroid/webkit/DownloadListener;

    .line 367
    new-instance v0, Lcom/kik/cards/web/aj;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/aj;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aJ:Lcom/kik/g/i;

    .line 375
    new-instance v0, Lcom/kik/cards/web/ak;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/ak;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aK:Lcom/kik/g/i;

    .line 387
    new-instance v0, Lcom/kik/cards/web/al;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/al;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aL:Lcom/kik/g/i;

    .line 397
    new-instance v0, Lcom/kik/cards/web/am;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/am;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aM:Lcom/kik/g/i;

    .line 406
    new-instance v0, Lcom/kik/cards/web/an;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/an;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aN:Lcom/kik/g/i;

    .line 414
    new-instance v0, Lcom/kik/cards/web/b;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/b;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aO:Landroid/view/View$OnClickListener;

    .line 425
    new-instance v0, Lcom/kik/cards/web/c;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/c;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aP:Landroid/view/View$OnClickListener;

    .line 433
    new-instance v0, Lcom/kik/cards/web/d;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/d;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aQ:Lcom/kik/g/i;

    .line 440
    new-instance v0, Lcom/kik/cards/web/e;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/e;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aR:Lcom/kik/g/i;

    .line 452
    new-instance v0, Lcom/kik/cards/web/f;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/f;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aS:Landroid/view/View$OnClickListener;

    .line 622
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aT:I

    .line 620
    return-void
.end method

.method private Q()V
    .locals 9

    .prologue
    .line 969
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    if-nez v0, :cond_1

    .line 1080
    :cond_0
    return-void

    .line 972
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h;->c()V

    .line 974
    new-instance v0, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    .line 975
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 977
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 978
    :cond_2
    new-instance v0, Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/kik/cards/web/iap/a;

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->h:Lkik/a/e/d;

    invoke-direct {v4, v3}, Lcom/kik/cards/web/iap/a;-><init>(Lkik/a/e/d;)V

    invoke-static {}, Lcom/kik/cards/web/iap/b;->a()Lcom/kik/cards/web/iap/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kik/cards/web/iap/b;->c()Lcom/android/a/a/a;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lcom/kik/cards/web/userdata/a;

    iget-object v7, p0, Lcom/kik/cards/web/CardsWebViewFragment;->j:Lkik/a/e/m;

    move-object v3, p0

    invoke-direct/range {v0 .. v7}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kik/cards/web/iap/k;Lcom/kik/cards/web/iap/l;Lcom/android/a/a/a;Lcom/kik/cards/web/userdata/a;Lkik/a/e/m;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->L:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    .line 980
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->L:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 983
    :cond_3
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0}, Lcom/kik/cards/web/bf;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 987
    new-instance v3, Lcom/kik/cards/web/a/b;

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v3, v0}, Lcom/kik/cards/web/a/b;-><init>(Landroid/app/Activity;)V

    .line 990
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/push/PushPlugin;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-direct {v1, v2, p0}, Lcom/kik/cards/web/push/PushPlugin;-><init>(Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 993
    new-instance v0, Lcom/kik/cards/web/browser/BrowserPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->C:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    iget-object v5, p0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/kik/cards/web/browser/BrowserPlugin;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/a/a;Ljava/lang/String;Lcom/kik/cards/web/aw;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    .line 994
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 996
    new-instance v0, Lcom/kik/cards/web/browser/WebHistoryPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->i:Lkik/a/i/h;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/browser/WebHistoryPlugin;-><init>(Lkik/a/i/h;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->au:Lcom/kik/cards/web/browser/WebHistoryPlugin;

    .line 997
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->au:Lcom/kik/cards/web/browser/WebHistoryPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 999
    new-instance v0, Lcom/kik/android/stickers/MediaItemPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->e:Lkik/a/e/u;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->f:Lcom/kik/android/c/f;

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/android/stickers/MediaItemPlugin;-><init>(Lkik/a/e/u;Lcom/kik/android/c/f;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->K:Lcom/kik/android/stickers/MediaItemPlugin;

    .line 1000
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->K:Lcom/kik/android/stickers/MediaItemPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1002
    new-instance v0, Lcom/kik/cards/web/profile/ProfilePlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->g:Lkik/a/e/r;

    invoke-direct {v0, v1, p0, v2, p0}, Lcom/kik/cards/web/profile/ProfilePlugin;-><init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;Lkik/a/e/r;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->P:Lcom/kik/cards/web/profile/ProfilePlugin;

    .line 1003
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->P:Lcom/kik/cards/web/profile/ProfilePlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1005
    invoke-static {}, Lcom/kik/cards/web/video/b;->a()Lcom/kik/cards/web/video/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aa:Lcom/kik/cards/web/video/b;

    .line 1006
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aa:Lcom/kik/cards/web/video/b;

    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/video/b;->a(Landroid/support/v4/app/FragmentActivity;)V

    .line 1008
    new-instance v0, Lcom/kik/cards/web/video/VideoPlayerPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aa:Lcom/kik/cards/web/video/b;

    iget-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    move-object v5, p0

    check-cast v5, Lcom/kik/cards/web/userdata/a;

    iget-object v6, p0, Lcom/kik/cards/web/CardsWebViewFragment;->h:Lkik/a/e/d;

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/kik/cards/web/video/VideoPlayerPlugin;-><init>(Landroid/app/Activity;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/video/b;Lkik/android/b/s;Lcom/kik/cards/web/userdata/a;Lkik/a/e/d;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->J:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    .line 1009
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->J:Lcom/kik/cards/web/video/VideoPlayerPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1011
    new-instance v0, Lcom/kik/cards/web/volume/VolumePlugin;

    invoke-direct {v0}, Lcom/kik/cards/web/volume/VolumePlugin;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->E:Lcom/kik/cards/web/volume/VolumePlugin;

    .line 1013
    new-instance v0, Lcom/kik/cards/web/usermedia/PhotoPlugin;

    new-instance v1, Lcom/kik/cards/usermedia/k;

    invoke-direct {v1, p0}, Lcom/kik/cards/usermedia/k;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    new-instance v2, Lcom/kik/cards/usermedia/a;

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->k:Lkik/a/e/v;

    invoke-direct {v2, p0, v3}, Lcom/kik/cards/usermedia/a;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Lkik/a/e/v;)V

    new-instance v3, Lcom/kik/cards/usermedia/h;

    invoke-direct {v3, p0}, Lcom/kik/cards/usermedia/h;-><init>(Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    iget-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v4}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    move-object v4, p0

    move-object v5, p0

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lcom/kik/cards/web/usermedia/PhotoPlugin;-><init>(Lcom/kik/cards/web/usermedia/c;Lcom/kik/cards/web/usermedia/c;Lcom/kik/cards/web/usermedia/i;Lcom/kik/cards/web/usermedia/j;Lcom/kik/cards/web/usermedia/a;Landroid/content/Context;Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->M:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    .line 1014
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->M:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1017
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v0, :cond_7

    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kik/cards/web/bf;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1018
    new-instance v0, Lcom/kik/cards/web/picker/PickerPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    iget-object v1, v1, Lcom/kik/cards/web/picker/PickerRequest;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    invoke-direct {v0, v1, p0, v2}, Lcom/kik/cards/web/picker/PickerPlugin;-><init>(Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/picker/PickerRequest;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->I:Lcom/kik/cards/web/picker/PickerPlugin;

    .line 1023
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->I:Lcom/kik/cards/web/picker/PickerPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1025
    instance-of v0, p0, Lcom/kik/cards/web/kik/b;

    if-eqz v0, :cond_8

    .line 1026
    new-instance v0, Lcom/kik/cards/web/kik/KikPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    move-object v2, p0

    check-cast v2, Lcom/kik/cards/web/kik/b;

    iget-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->I:Lcom/kik/cards/web/picker/PickerPlugin;

    iget-object v5, p0, Lcom/kik/cards/web/CardsWebViewFragment;->f:Lcom/kik/android/c/f;

    iget-object v6, p0, Lcom/kik/cards/web/CardsWebViewFragment;->X:Ljava/lang/String;

    iget-object v7, p0, Lcom/kik/cards/web/CardsWebViewFragment;->g:Lkik/a/e/r;

    move-object v3, p0

    invoke-direct/range {v0 .. v7}, Lcom/kik/cards/web/kik/KikPlugin;-><init>(Lcom/kik/cards/web/av;Lcom/kik/cards/web/kik/b;Lcom/kik/cards/web/browser/BrowserPlugin$a;Lcom/kik/cards/web/picker/PickerPlugin;Lcom/kik/android/c/f;Ljava/lang/String;Lkik/a/e/r;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->F:Lcom/kik/cards/web/kik/KikPlugin;

    .line 1028
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->F:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1035
    instance-of v0, p0, Lcom/kik/cards/web/userdata/a;

    if-eqz v0, :cond_9

    .line 1036
    new-instance v1, Lcom/kik/cards/web/userdata/UserDataPlugin;

    move-object v0, p0

    check-cast v0, Lcom/kik/cards/web/userdata/a;

    invoke-direct {v1, v0, p0}, Lcom/kik/cards/web/userdata/UserDataPlugin;-><init>(Lcom/kik/cards/web/userdata/a;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V

    iput-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->G:Lcom/kik/cards/web/userdata/UserDataPlugin;

    .line 1037
    new-instance v1, Lcom/kik/cards/web/auth/AuthPlugin;

    move-object v0, p0

    check-cast v0, Lcom/kik/cards/web/userdata/a;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->h:Lkik/a/e/d;

    invoke-direct {v1, v0, v2, v3, p0}, Lcom/kik/cards/web/auth/AuthPlugin;-><init>(Lcom/kik/cards/web/userdata/a;Lkik/android/b/s;Lkik/a/e/d;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V

    iput-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->H:Lcom/kik/cards/web/auth/AuthPlugin;

    .line 1038
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->G:Lcom/kik/cards/web/userdata/UserDataPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1039
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->H:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1046
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1047
    instance-of v0, p0, Lcom/kik/cards/web/config/a;

    if-eqz v0, :cond_a

    .line 1048
    new-instance v1, Lcom/kik/cards/web/config/ConfigurationPlugin;

    move-object v0, p0

    check-cast v0, Lcom/kik/cards/web/config/a;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->q:Lkik/android/util/ar;

    invoke-direct {v1, v0, v2}, Lcom/kik/cards/web/config/ConfigurationPlugin;-><init>(Lcom/kik/cards/web/config/a;Lkik/android/util/ar;)V

    iput-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->N:Lcom/kik/cards/web/config/ConfigurationPlugin;

    .line 1049
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->N:Lcom/kik/cards/web/config/ConfigurationPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1055
    new-instance v0, Lcom/kik/cards/web/config/XDataPlugin;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->d:Lkik/a/j/m;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/config/XDataPlugin;-><init>(Lkik/a/j/m;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->O:Lcom/kik/cards/web/config/XDataPlugin;

    .line 1056
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->O:Lcom/kik/cards/web/config/XDataPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1059
    :cond_4
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1061
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    .line 1062
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Q:Lcom/kik/cards/web/automation/AutomationPlugin;

    if-eqz v1, :cond_5

    .line 1065
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Q:Lcom/kik/cards/web/automation/AutomationPlugin;

    invoke-virtual {v0}, Lcom/kik/cards/web/automation/AutomationPlugin;->c()Ljava/lang/String;

    move-result-object v0

    .line 1067
    :cond_5
    new-instance v1, Lcom/kik/cards/web/automation/a;

    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/kik/cards/web/automation/a;-><init>(Landroid/app/Activity;Landroid/content/Context;Lcom/kik/cards/web/bd;Ljava/lang/String;)V

    .line 1068
    new-instance v0, Lcom/kik/cards/web/automation/AutomationPlugin;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/automation/AutomationPlugin;-><init>(Lcom/kik/cards/web/automation/a;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Q:Lcom/kik/cards/web/automation/AutomationPlugin;

    .line 1069
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->r()Lcom/kik/cards/web/plugin/h;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Q:Lcom/kik/cards/web/automation/AutomationPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Lcom/kik/cards/web/plugin/d;)V

    .line 1073
    :cond_6
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kik/cards/web/bf;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1076
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ac:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/kik/KikMessageParcelable;

    .line 1077
    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->F:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-virtual {v2, v0}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V

    goto :goto_1

    .line 1021
    :cond_7
    new-instance v0, Lcom/kik/cards/web/picker/PickerPlugin;

    invoke-direct {v0, v7, p0}, Lcom/kik/cards/web/picker/PickerPlugin;-><init>(Ljava/lang/String;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->I:Lcom/kik/cards/web/picker/PickerPlugin;

    goto/16 :goto_0

    .line 1032
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "CardsWebViewFragment must provide KikInterfaceProvider Interface"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1043
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "CardsWebViewFragment must provide KikInterfaceProvider Interface"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1052
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "CardsWebViewFragment must provide ConfigurationProvider Interface"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private R()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1087
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->x()Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v0

    .line 1088
    if-eqz v0, :cond_0

    .line 1089
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a()Ljava/lang/String;

    move-result-object v0

    .line 1091
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method private S()Z
    .locals 1

    .prologue
    .line 1770
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ag:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/cards/web/CardsWebViewFragment;)Landroid/support/v4/app/FragmentActivity;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Lkik/a/e/q;)Lcom/kik/g/p;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 577
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 578
    new-instance v1, Lcom/kik/g/f;

    invoke-direct {v1}, Lcom/kik/g/f;-><init>()V

    .line 580
    new-instance v2, Lcom/kik/cards/web/j;

    invoke-direct {v2, p1, p2}, Lcom/kik/cards/web/j;-><init>(Landroid/content/Context;Lkik/a/e/q;)V

    .line 582
    invoke-virtual {v2}, Lcom/kik/cards/web/aq;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 584
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 585
    invoke-virtual {v2, p0, v4}, Lcom/kik/cards/web/aq;->a(Ljava/lang/String;Z)V

    .line 587
    invoke-virtual {v2}, Lcom/kik/cards/web/aq;->e()Lcom/kik/g/e;

    move-result-object v3

    new-instance v4, Lcom/kik/cards/web/k;

    invoke-direct {v4, v0}, Lcom/kik/cards/web/k;-><init>(Lcom/kik/g/p;)V

    invoke-virtual {v1, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 595
    invoke-virtual {v2}, Lcom/kik/cards/web/aq;->c()Lcom/kik/g/e;

    move-result-object v3

    new-instance v4, Lcom/kik/cards/web/l;

    invoke-direct {v4, v0}, Lcom/kik/cards/web/l;-><init>(Lcom/kik/g/p;)V

    invoke-virtual {v1, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 603
    const-wide/16 v4, 0x3a98

    invoke-static {v0, v4, v5}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    .line 605
    new-instance v3, Lcom/kik/cards/web/m;

    invoke-direct {v3, v1}, Lcom/kik/cards/web/m;-><init>(Lcom/kik/g/f;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 613
    invoke-virtual {v2, p0}, Lcom/kik/cards/web/aq;->loadUrl(Ljava/lang/String;)V

    .line 615
    return-object v0
.end method

.method private a(Landroid/net/Uri;Landroid/content/Context;)V
    .locals 4

    .prologue
    const v3, 0x7f0900dd

    const/4 v2, 0x1

    .line 671
    if-nez p1, :cond_0

    .line 672
    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 695
    :goto_0
    return-void

    .line 676
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 677
    if-eqz v0, :cond_2

    .line 678
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 681
    const-string v1, "mailto:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "intent:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 682
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 683
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 693
    :catch_0
    move-exception v0

    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 688
    :cond_2
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 689
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 690
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/cards/web/CardsWebViewFragment;I)V
    .locals 6

    .prologue
    const/16 v3, 0x64

    .line 142
    iget v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aT:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aT:I

    if-ge p1, v3, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    new-instance v2, Lcom/kik/cards/web/n;

    invoke-direct {v2, p0, v0}, Lcom/kik/cards/web/n;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;I)V

    const-wide/16 v4, 0xc8

    invoke-virtual {v1, v2, v4, v5}, Landroid/widget/ProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 142
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->i:Lkik/a/i/h;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->i:Lkik/a/i/h;

    invoke-interface {v0}, Lkik/a/i/h;->a()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/ac;

    invoke-direct {v1, p0, p1}, Lcom/kik/cards/web/ac;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 3

    .prologue
    .line 142
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    const-string v1, "Location"

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Share your location with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const-string v1, "Ok"

    new-instance v2, Lcom/kik/cards/web/ag;

    invoke-direct {v2, p0, p2, p1}, Lcom/kik/cards/web/ag;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const-string v1, "Cancel"

    new-instance v2, Lcom/kik/cards/web/af;

    invoke-direct {v2, p0, p2, p1}, Lcom/kik/cards/web/af;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/ae;

    invoke-direct {v1, p0, p2, p1}, Lcom/kik/cards/web/ae;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/content/DialogInterface$OnCancelListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    return-void
.end method

.method static synthetic b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 142
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aj:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    return-void
.end method

.method static synthetic c(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 142
    invoke-direct {p0, p1}, Lcom/kik/cards/web/CardsWebViewFragment;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    return-object v0
.end method

.method private e(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 923
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 924
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aw:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 925
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 931
    :goto_0
    return-void

    .line 928
    :cond_0
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 929
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aw:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1717
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ao:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1718
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0}, Lcom/kik/cards/util/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1719
    invoke-static {v0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1720
    new-array v1, v2, [Landroid/view/View;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ap:Landroid/view/View;

    aput-object v2, v1, v3

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 1726
    :goto_0
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ao:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1728
    :cond_0
    return-void

    .line 1723
    :cond_1
    new-array v1, v2, [Landroid/view/View;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ap:Landroid/view/View;

    aput-object v2, v1, v3

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ay:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic g(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/browser/BrowserPlugin;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    return-object v0
.end method

.method static synthetic h(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->a(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Z)V

    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->Q()V

    return-void
.end method

.method static synthetic i(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aD:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic j(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aC:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic k(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->L()V

    return-void
.end method

.method static synthetic l(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 3

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/cards/web/bd;->a(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->k()V

    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070080

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    :cond_0
    return-void
.end method

.method static synthetic n(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 4

    .prologue
    .line 142
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aj:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    new-instance v1, Lcom/kik/cards/web/ah;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/ah;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ImageView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ak:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ak:Landroid/widget/ImageView;

    invoke-static {}, Lkik/android/util/al;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    return-void
.end method

.method static synthetic o(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->W:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lcom/kik/cards/web/CardsWebViewFragment;)I
    .locals 1

    .prologue
    .line 142
    iget v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aT:I

    return v0
.end method

.method static synthetic q(Lcom/kik/cards/web/CardsWebViewFragment;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic r(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/kik/cards/web/aa;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/aa;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method static synthetic s(Lcom/kik/cards/web/CardsWebViewFragment;)Lkik/android/util/cv$c;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Z:Lkik/android/util/cv$c;

    return-object v0
.end method

.method static synthetic t(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aA:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic u(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->az:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic v(Lcom/kik/cards/web/CardsWebViewFragment;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic w(Lcom/kik/cards/web/CardsWebViewFragment;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic z()Lorg/c/b;
    .locals 1

    .prologue
    .line 142
    sget-object v0, Lcom/kik/cards/web/CardsWebViewFragment;->x:Lorg/c/b;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 1676
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 1677
    iget v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->af:I

    .line 1680
    :goto_0
    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ad:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1681
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1683
    :cond_0
    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ad:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1685
    invoke-virtual {p0, p1, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1687
    return-object v1
.end method

.method public final a(Landroid/content/IntentSender;)Lcom/kik/g/p;
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 1695
    new-instance v7, Lcom/kik/g/p;

    invoke-direct {v7}, Lcom/kik/g/p;-><init>()V

    .line 1697
    iput-object v7, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ae:Lcom/kik/g/p;

    .line 1700
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    if-eqz v0, :cond_0

    .line 1702
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    const v2, 0x17318

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Landroid/support/v4/app/FragmentActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    .line 1712
    :goto_0
    return-object v7

    .line 1706
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1710
    :catch_0
    move-exception v0

    invoke-virtual {v7, v8}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 1306
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->H()Lcom/kik/g/p;

    move-result-object v0

    .line 1307
    if-nez p1, :cond_1

    .line 1309
    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 1349
    :cond_0
    :goto_0
    return-object v0

    .line 1313
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 1314
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "https"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "card"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cards"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1317
    :cond_2
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->s()V

    .line 1318
    new-instance v1, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    .line 1319
    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    invoke-static {p1}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->W:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/kik/cards/web/CardsWebViewFragment$a;->c(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->X:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/kik/cards/web/CardsWebViewFragment$a;->d(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    .line 1325
    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v1, v2}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lcom/kik/cards/web/v;

    invoke-direct {v2, p0, v0}, Lcom/kik/cards/web/v;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1265
    const/4 v0, -0x1

    .line 1267
    packed-switch p1, :pswitch_data_0

    .line 1276
    :goto_0
    iput v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->V:I

    .line 1277
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    if-eqz v1, :cond_0

    .line 1278
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->setRequestedOrientation(I)V

    .line 1280
    :cond_0
    return-void

    .line 1269
    :pswitch_0
    const/4 v0, 0x0

    .line 1270
    goto :goto_0

    .line 1273
    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    .line 1267
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    .prologue
    .line 1733
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ag:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1734
    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 1766
    :goto_0
    return-void

    .line 1740
    :cond_0
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1741
    sget-object v1, Lcom/kik/cards/web/CardsWebViewFragment;->b:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1743
    iput-object p1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ag:Landroid/view/View;

    .line 1744
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->d([Landroid/view/View;)V

    .line 1745
    iput-object p2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ah:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1748
    new-instance v0, Lcom/kik/cards/web/ab;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/ab;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public final a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V
    .locals 2

    .prologue
    .line 1604
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->F:Lcom/kik/cards/web/kik/KikPlugin;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kik/cards/web/bf;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1605
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->F:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-virtual {v0, p1}, Lcom/kik/cards/web/kik/KikPlugin;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;)V

    .line 1607
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ac:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1608
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2

    .prologue
    .line 1848
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    invoke-virtual {v0, p1}, Lkik/android/b/s;->c(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    .line 1849
    new-instance v1, Lcom/kik/cards/web/ad;

    invoke-direct {v1, p0, p2, p1}, Lcom/kik/cards/web/ad;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1869
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 1286
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1288
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aB:Lcom/kik/g/k;

    new-instance v2, Lcom/kik/cards/web/aq$b;

    invoke-direct {v2, v0, p2}, Lcom/kik/cards/web/aq$b;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1289
    return-void
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 24

    .prologue
    .line 1395
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/cards/web/CardsWebViewFragment;->W:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 1396
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/cards/web/CardsWebViewFragment;->W:Ljava/lang/String;

    const-string v3, "https://kik.com/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 1403
    :goto_0
    if-eqz v2, :cond_1

    if-nez p1, :cond_1

    .line 1405
    invoke-virtual/range {p0 .. p0}, Lcom/kik/cards/web/CardsWebViewFragment;->J()V

    .line 1505
    :goto_1
    return-void

    .line 1399
    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 1409
    :cond_1
    if-eqz v2, :cond_3

    .line 1410
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1412
    const-string v3, "CardsWebViewFragment.EXTRA_PICKER_RESULT"

    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1414
    const-string v2, "title"

    const-string v3, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1415
    const-string v2, "text"

    const-string v4, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1416
    const-string v2, "image"

    const-string v5, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1417
    const-string v2, "pngImage"

    const-string v6, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 1418
    const-string v2, "attribution"

    const-string v6, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 1420
    const-string v2, "forwardable"

    const/4 v6, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v13

    .line 1421
    const-string v2, "fallbackUrl"

    const/4 v6, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1424
    const-string v2, "layout"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1426
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/kik/cards/web/CardsWebViewFragment;->X:Ljava/lang/String;

    .line 1427
    const-wide/16 v22, 0x0

    .line 1429
    const-string v2, "videoUrl"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 1430
    const-string v2, "videoShouldAutoplay"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v18

    .line 1431
    const-string v2, "videoShouldBeMuted"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v19

    .line 1432
    const-string v2, "videoShouldLoop"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v20

    .line 1433
    const-string v2, "disallowSave"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v21

    .line 1435
    new-instance v2, Lcom/kik/cards/web/kik/KikMessageParcelable;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    const/4 v12, 0x0

    invoke-static {v13}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v13

    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v21

    invoke-direct/range {v2 .. v21}, Lcom/kik/cards/web/kik/KikMessageParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1438
    const-string v3, "extras"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 1440
    if-eqz v7, :cond_2

    .line 1441
    invoke-virtual {v7}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v8

    move-wide/from16 v4, v22

    .line 1443
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1444
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1445
    const-string v6, ""

    .line 1447
    :try_start_0
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 1453
    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v9

    int-to-long v10, v9

    add-long/2addr v4, v10

    .line 1454
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    int-to-long v10, v9

    add-long/2addr v4, v10

    .line 1456
    const-wide/16 v10, 0x2800

    cmp-long v9, v4, v10

    if-gtz v9, :cond_2

    .line 1457
    iget-object v9, v2, Lcom/kik/cards/web/kik/KikMessageParcelable;->t:Ljava/util/HashMap;

    invoke-virtual {v9, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1449
    :catch_0
    move-exception v9

    invoke-virtual {v9}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3

    .line 1462
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    invoke-virtual {v3}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->a()Lcom/kik/g/p;

    move-result-object v3

    new-instance v4, Lcom/kik/cards/web/x;

    move-object/from16 v0, p0

    invoke-direct {v4, v0, v2}, Lcom/kik/cards/web/x;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Lcom/kik/cards/web/kik/KikMessageParcelable;)V

    invoke-virtual {v3, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_1

    .line 1499
    :cond_3
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1500
    if-nez p1, :cond_4

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct/range {p1 .. p1}, Lorg/json/JSONObject;-><init>()V

    .line 1501
    :cond_4
    const-string v3, "CardsWebViewFragment.EXTRA_PICKER_RESULT"

    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1502
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Landroid/os/Bundle;)V

    .line 1503
    invoke-virtual/range {p0 .. p0}, Lcom/kik/cards/web/CardsWebViewFragment;->J()V

    goto/16 :goto_1
.end method

.method public final a(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 936
    const/4 v0, 0x0

    .line 938
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 945
    :goto_0
    return v0

    .line 941
    :pswitch_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->E:Lcom/kik/cards/web/volume/VolumePlugin;

    invoke-virtual {v0, p1}, Lcom/kik/cards/web/volume/VolumePlugin;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    .line 938
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 1355
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 1356
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 1358
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1360
    :cond_0
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->s()V

    .line 1361
    new-instance v1, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    .line 1362
    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    invoke-static {p1}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/kik/cards/web/CardsWebViewFragment$a;->c(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    .line 1364
    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v1, v2}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lcom/kik/cards/web/w;

    invoke-direct {v2, p0, v0}, Lcom/kik/cards/web/w;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1388
    :cond_1
    return-object v0
.end method

.method protected abstract c()Lcom/kik/m/a;
.end method

.method protected final c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 655
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    .line 658
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 659
    if-nez v1, :cond_0

    .line 661
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Landroid/net/Uri;Landroid/content/Context;)V

    .line 667
    :goto_0
    return-void

    .line 665
    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 666
    invoke-direct {p0, v1, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Landroid/net/Uri;Landroid/content/Context;)V

    goto :goto_0
.end method

.method public final c(Z)V
    .locals 2

    .prologue
    .line 1176
    iget-boolean v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->B:Z

    if-eq p1, v0, :cond_0

    .line 1177
    iput-boolean p1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->B:Z

    .line 1178
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ax:Lcom/kik/g/k;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1179
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-virtual {v0, p1}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(Z)V

    .line 1181
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1548
    invoke-virtual {p0, p1}, Lcom/kik/cards/web/CardsWebViewFragment;->c(Ljava/lang/String;)V

    .line 1549
    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 700
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    .line 776
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->k:Lkik/a/e/v;

    const-string v1, "kik.developer.mode"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final i()Lcom/kik/cards/web/av;
    .locals 1

    .prologue
    .line 1096
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->R:Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    return-object v0
.end method

.method public final j()Lcom/kik/cards/web/bd;
    .locals 1

    .prologue
    .line 1107
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    return-object v0
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 1112
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1113
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-virtual {v0}, Lcom/kik/cards/web/browser/BrowserPlugin;->c()V

    .line 1124
    :goto_0
    return-void

    .line 1116
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1117
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->goBack()V

    goto :goto_0

    .line 1121
    :cond_1
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->q()V

    goto :goto_0
.end method

.method public final l()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 1128
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aA:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 1158
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aB:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final n()I
    .locals 2

    .prologue
    .line 1247
    const/4 v0, 0x0

    .line 1249
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getRequestedOrientation()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 1259
    :goto_0
    return v0

    .line 1251
    :pswitch_0
    const/4 v0, 0x2

    .line 1252
    goto :goto_0

    .line 1255
    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    .line 1249
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final o()V
    .locals 0

    .prologue
    .line 1294
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->J()V

    .line 1295
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const v0, 0x17318

    const/4 v2, -0x1

    .line 1633
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1635
    if-eq p1, v0, :cond_3

    .line 1636
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ad:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    .line 1639
    if-eqz v0, :cond_0

    .line 1640
    if-ne p2, v2, :cond_1

    .line 1641
    invoke-virtual {v0, p3}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 1672
    :cond_0
    :goto_0
    return-void

    .line 1643
    :cond_1
    if-nez p2, :cond_2

    .line 1644
    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_0

    .line 1647
    :cond_2
    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1651
    :cond_3
    if-ne p1, v0, :cond_0

    .line 1652
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ae:Lcom/kik/g/p;

    .line 1655
    if-eqz v0, :cond_0

    .line 1656
    if-ne p2, v2, :cond_4

    .line 1657
    invoke-virtual {v0, p3}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 1662
    :cond_4
    if-nez p2, :cond_5

    .line 1663
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1664
    const-string v2, "retry"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1665
    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 1668
    :cond_5
    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 910
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v1, :cond_0

    .line 911
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(I)V

    .line 916
    :goto_0
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    invoke-direct {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->e(I)V

    .line 918
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 919
    return-void

    .line 914
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(I)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 706
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lcom/kik/cards/web/CardsWebViewFragment;)V

    .line 707
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 708
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    .line 709
    invoke-static {}, Lcom/kik/cards/web/iap/b;->a()Lcom/kik/cards/web/iap/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/iap/b;->b()Lcom/kik/g/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->av:Lcom/kik/g/ar;

    .line 710
    new-instance v0, Lkik/android/b/s;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->d:Lkik/a/j/m;

    invoke-direct {v0, v1}, Lkik/android/b/s;-><init>(Lkik/a/j/n;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    .line 711
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->x()Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v0

    .line 712
    if-eqz v0, :cond_2

    .line 713
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->R()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    .line 714
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 715
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A url must be provided for the card"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 717
    :cond_0
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ab:Z

    .line 718
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->c()Lcom/kik/cards/web/picker/PickerRequest;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    .line 719
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->e()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->X:Ljava/lang/String;

    .line 720
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->d()Ljava/lang/String;

    move-result-object v1

    .line 722
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->f()Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    move-result-object v0

    .line 723
    if-eqz v0, :cond_1

    .line 724
    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->s:Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    .line 726
    :cond_1
    if-eqz v1, :cond_2

    .line 727
    invoke-static {v1}, Lcom/kik/cards/web/bf;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->W:Ljava/lang/String;

    .line 730
    :cond_2
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const v10, 0x7f0e00a0

    const v9, 0x7f0e0036

    const/4 v8, 0x0

    const/4 v7, -0x1

    .line 782
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 784
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 785
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    .line 879
    :goto_0
    return-object v0

    .line 788
    :cond_0
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aG:Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->addOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V

    .line 790
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    if-eqz v0, :cond_1

    .line 791
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 793
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 794
    new-instance v0, Lcom/kik/cards/web/bd;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->c()Lcom/kik/m/a;

    move-result-object v3

    iget-object v5, p0, Lcom/kik/cards/web/CardsWebViewFragment;->n:Lkik/a/f/k;

    iget-object v6, p0, Lcom/kik/cards/web/CardsWebViewFragment;->o:Lkik/a/e/q;

    move-object v2, p0

    move-object v4, p0

    invoke-direct/range {v0 .. v6}, Lcom/kik/cards/web/bd;-><init>(Landroid/content/Context;Lcom/kik/cards/web/au;Lcom/kik/m/a;Lcom/kik/cards/web/az;Lkik/a/f/k;Lkik/a/e/q;)V

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    .line 795
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0, v8}, Lcom/kik/cards/web/bd;->setScrollBarStyle(I)V

    .line 796
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aI:Landroid/webkit/DownloadListener;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/bd;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 799
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->Q()V

    .line 801
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->az:Lcom/kik/g/k;

    invoke-virtual {v1}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aJ:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 802
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->q()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aQ:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 803
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->f()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aM:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 804
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->g()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aK:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 805
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->h()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aN:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 806
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->e()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aH:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 807
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aR:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 808
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->d()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aL:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 810
    const v0, 0x7f03001c

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    .line 812
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00a7

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aj:Landroid/view/View;

    .line 813
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e01e5

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ak:Landroid/widget/ImageView;

    .line 814
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e01e7

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->al:Landroid/widget/ImageView;

    .line 815
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e01e6

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    .line 816
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/widget/TextView;)V

    .line 817
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aP:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 818
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00a6

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ai:Landroid/view/ViewGroup;

    .line 819
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e003c

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    .line 820
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    const v1, 0x7f0e0078

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ao:Landroid/widget/TextView;

    .line 821
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    const v1, 0x7f0e00a1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ap:Landroid/view/View;

    .line 823
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00a3

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aw:Landroid/view/View;

    .line 825
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ao:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aS:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 826
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aS:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 828
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aO:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 829
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "AUTOMATION_BROWSER_BAR_CLOSE"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 830
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->an:Landroid/view/ViewGroup;

    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "AUTOMATION_BROWSER_BAR_MORE"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 831
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ao:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_BROWSER_BAR_URL"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 832
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ap:Landroid/view/View;

    const-string v1, "AUTOMATION_BROWSER_BAR_URL_SECURE"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 833
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->am:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_BROWSER_ERROR_REFRESH"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 835
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00a5

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aS:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 836
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00a4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aO:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 837
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00a2

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aq:Landroid/widget/ProgressBar;

    .line 839
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e0092

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ar:Landroid/view/ViewGroup;

    .line 840
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e0094

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/EllipsizingTextView;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->as:Lkik/android/widget/EllipsizingTextView;

    .line 841
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e0093

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->at:Landroid/widget/ImageView;

    .line 843
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v7, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 845
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 846
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ai:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v3, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 848
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 850
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aE:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Lcom/kik/g/e;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/s;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/s;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 859
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ab:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/cards/web/bd;->a(Ljava/lang/String;Z)V

    .line 861
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SWITCH_TIMING: Starting to load URL "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->y:J

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->s:Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->s:Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    invoke-static {v2}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lkik/a/d/a/a;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v2, v3, v1}, Lkik/android/util/cv;->a(Lkik/a/d/a/a;Landroid/content/Context;Ljava/lang/String;)Lkik/android/util/cv$c;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Z:Lkik/android/util/cv$c;

    :cond_2
    const-string v2, "Referer"

    iget-object v3, p0, Lcom/kik/cards/web/CardsWebViewFragment;->W:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v2}, Lcom/kik/cards/web/bd;->a()V

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v2, v1, v0}, Lcom/kik/cards/web/bd;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 863
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-static {v0}, Lcom/kik/cards/web/bf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->e(Ljava/lang/String;)V

    .line 865
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Z:Lkik/android/util/cv$c;

    if-eqz v0, :cond_3

    .line 866
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ar:Landroid/view/ViewGroup;

    aput-object v1, v0, v8

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 867
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ar:Landroid/view/ViewGroup;

    new-instance v1, Lcom/kik/cards/web/t;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/t;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 874
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->as:Lkik/android/widget/EllipsizingTextView;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Z:Lkik/android/util/cv$c;

    invoke-virtual {v1}, Lkik/android/util/cv$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/widget/EllipsizingTextView;->setText(Ljava/lang/CharSequence;)V

    .line 875
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->at:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Z:Lkik/android/util/cv$c;

    invoke-virtual {v1}, Lkik/android/util/cv$c;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 879
    :cond_3
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 8

    .prologue
    .line 745
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->av:Lcom/kik/g/ar;

    if-eqz v0, :cond_0

    .line 746
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->av:Lcom/kik/g/ar;

    invoke-virtual {v0}, Lcom/kik/g/ar;->c()V

    .line 748
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    iget-object v0, v0, Lcom/kik/cards/web/picker/PickerRequest;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 749
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aF:Lcom/kik/g/k;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    iget-object v1, v1, Lcom/kik/cards/web/picker/PickerRequest;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 751
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroy()V

    .line 753
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->C:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 755
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 764
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    if-eqz v0, :cond_1

    .line 765
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    const-string v1, "Browser Screen Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Implicit"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->b(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Duration"

    iget-wide v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->y:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    const-string v0, "0"

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 770
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    .line 771
    return-void

    .line 758
    :cond_2
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aF:Lcom/kik/g/k;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 759
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroy()V

    .line 761
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->C:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 762
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    goto :goto_0

    .line 765
    :cond_3
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v3, "#.#"

    invoke-direct {v0, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/kik/cards/web/CardsWebViewFragment;->y:J

    sub-long/2addr v4, v6

    long-to-float v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    float-to-double v4, v3

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public onDestroyView()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1186
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onDestroyView()V

    .line 1188
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aG:Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->removeOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V

    .line 1189
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 1191
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1192
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1193
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1242
    :cond_0
    :goto_0
    return-void

    .line 1196
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 1216
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->z:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->g()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aK:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->b(Lcom/kik/g/e;Lcom/kik/g/i;)V

    .line 1218
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->v()V

    .line 1219
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->n()V

    .line 1221
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/kik/cards/web/u;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/u;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1237
    iput-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->U:Landroid/widget/RelativeLayout;

    .line 1238
    iput-object v4, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aa:Lcom/kik/cards/web/video/b;

    goto :goto_0
.end method

.method public onPause()V
    .locals 3

    .prologue
    .line 1812
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1813
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->u()V

    .line 1818
    :cond_0
    :try_start_0
    const-string v0, "android.webkit.WebView"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1824
    :goto_0
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onPause()V

    .line 1826
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 1792
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onResume()V

    .line 1797
    :try_start_0
    const-string v0, "android.webkit.WebView"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onResume"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1805
    :goto_0
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-direct {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment;->e(I)V

    .line 1806
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 735
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 737
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 738
    const-string v0, "CardsWebViewFragment.EXTRA_URL_KEY"

    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->S:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 1102
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onStart()V

    .line 1103
    return-void
.end method

.method public final p()Z
    .locals 1

    .prologue
    .line 1300
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()V
    .locals 4

    .prologue
    .line 1554
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->A:Lcom/kik/cards/web/bd;

    .line 1555
    if-eqz v0, :cond_0

    .line 1560
    new-instance v1, Lcom/kik/cards/web/z;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/z;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1567
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 2

    .prologue
    .line 1572
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->aE:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1574
    return-void
.end method

.method protected final s()V
    .locals 2

    .prologue
    .line 1599
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->D:Lcom/kik/cards/web/browser/BrowserPlugin;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/browser/BrowserPlugin;->a(Z)V

    .line 1600
    return-void
.end method

.method public final t()Landroid/content/Context;
    .locals 1

    .prologue
    .line 1627
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->Y:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final u()V
    .locals 2

    .prologue
    .line 1775
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->S()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1787
    :goto_0
    return-void

    .line 1778
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ah:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 1780
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1781
    iget-object v1, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ag:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1783
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/CardsWebViewFragment;->ag:Landroid/view/View;

    goto :goto_0
.end method

.method public v()Z
    .locals 2

    .prologue
    .line 1831
    const/4 v0, 0x0

    .line 1833
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->S()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1834
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->u()V

    .line 1835
    const/4 v0, 0x1

    .line 1838
    :cond_0
    if-nez v0, :cond_1

    .line 1839
    invoke-super {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->v()Z

    move-result v0

    .line 1842
    :cond_1
    return v0
.end method

.method public final w()I
    .locals 3

    .prologue
    .line 1902
    invoke-virtual {p0}, Lcom/kik/cards/web/CardsWebViewFragment;->x()Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v0

    .line 1903
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->h()I

    move-result v1

    sget v2, Lcom/kik/ui/fragment/FragmentBase$a$a;->a:I

    if-ne v1, v2, :cond_1

    .line 1905
    :cond_0
    sget v0, Lcom/kik/ui/fragment/FragmentBase$a$a;->b:I

    .line 1907
    :goto_0
    return v0

    :cond_1
    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->h()I

    move-result v0

    goto :goto_0
.end method

.method protected abstract x()Lcom/kik/cards/web/CardsWebViewFragment$a;
.end method

.method public final y()I
    .locals 1

    .prologue
    .line 1981
    const/high16 v0, -0x1000000

    return v0
.end method
