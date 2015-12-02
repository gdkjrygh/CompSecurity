.class public Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;
.super Lcom/facebook/base/activity/i;
.source "WebrtcIncallActivity.java"


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lcom/facebook/c/s;

.field private B:Lcom/facebook/config/a/a;

.field private C:Lcom/facebook/orca/fbwebrtc/ag;

.field private D:Lcom/facebook/orca/fbwebrtc/ax;

.field private E:Lcom/facebook/appconfig/m;

.field private F:Lcom/facebook/orca/fbwebrtc/m;

.field private G:Lcom/facebook/orca/fbwebrtc/bb;

.field private H:Lcom/facebook/orca/fbwebrtc/ae;

.field private I:Landroid/app/AlertDialog;

.field private J:Lcom/facebook/zero/ui/o;

.field private K:Lcom/facebook/fbservice/ops/k;

.field private L:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private M:Landroid/view/View;

.field private N:Landroid/view/View;

.field private O:Lcom/facebook/widget/images/UrlImage;

.field private P:Landroid/widget/ImageView;

.field private Q:Landroid/widget/TextView;

.field private R:Landroid/widget/TextView;

.field private S:Landroid/view/View;

.field private T:Landroid/widget/TextView;

.field private U:Landroid/view/View;

.field private V:Landroid/widget/TextView;

.field private W:Landroid/widget/Button;

.field private X:Landroid/widget/Button;

.field private Y:Landroid/widget/Button;

.field private Z:Landroid/widget/TextView;

.field private aa:Landroid/view/View;

.field private ab:Landroid/view/ViewGroup;

.field private q:J

.field private r:Landroid/media/AudioManager;

.field private s:Landroid/telephony/TelephonyManager;

.field private t:Ljava/util/concurrent/Executor;

.field private u:Ljava/util/concurrent/ScheduledExecutorService;

.field private v:Lcom/facebook/prefs/shared/d;

.field private w:Z

.field private x:Lcom/a/a/ak;

.field private y:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private z:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    const-class v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 916
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 874
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->ab:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 876
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->ab:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 877
    new-instance v2, Lcom/facebook/orca/fbwebrtc/s;

    invoke-direct {v2, p0, v1, p1, p2}, Lcom/facebook/orca/fbwebrtc/s;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;IJ)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 874
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 891
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/contacts/server/FetchContactResult;)V
    .locals 3

    .prologue
    .line 534
    invoke-virtual {p1}, Lcom/facebook/contacts/server/FetchContactResult;->a()Lcom/facebook/contacts/models/Contact;

    move-result-object v0

    .line 536
    sget-object v1, Lcom/facebook/contacts/models/Contact;->a:Lcom/facebook/contacts/models/Contact;

    if-ne v0, v1, :cond_1

    .line 551
    :cond_0
    :goto_0
    return-void

    .line 540
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 541
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Q:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getName()Lcom/facebook/user/Name;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getHugePictureUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 545
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->O:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getHugePictureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    goto :goto_0

    .line 546
    :cond_3
    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getBigPictureUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 547
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->O:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getBigPictureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    goto :goto_0

    .line 548
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getSmallPictureUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 549
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->O:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/Contact;->getSmallPictureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 5

    .prologue
    .line 518
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchContactResult;

    .line 519
    sget-object v1, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v2, "Fetched contact successfully, result: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/contacts/server/FetchContactResult;)V

    .line 523
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchContactResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    if-ne v0, v1, :cond_1

    .line 525
    :cond_0
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Contact fetched from server or cache, done."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 530
    :goto_0
    return-void

    .line 527
    :cond_1
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Checking server for contact data..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 528
    sget-object v0, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/fbservice/service/s;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/s;)V
    .locals 6

    .prologue
    .line 488
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 515
    :goto_0
    return-void

    .line 493
    :cond_0
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Loading contact info. Freshness=%s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/s;->name()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 496
    new-instance v1, Lcom/facebook/contacts/server/FetchContactParams;

    new-instance v2, Lcom/facebook/user/UserKey;

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    iget-wide v4, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    invoke-direct {v1, p1, v2}, Lcom/facebook/contacts/server/FetchContactParams;-><init>(Lcom/facebook/fbservice/service/s;Lcom/facebook/user/UserKey;)V

    .line 498
    const-string v2, "fetchContactParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 499
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->K:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    .line 502
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/aa;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/aa;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->o()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;J)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(J)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Z)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->c(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 769
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->R:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 770
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->P:Landroid/widget/ImageView;

    sget-object v0, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    if-ne p2, v0, :cond_1

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 771
    sget-object v0, Lcom/facebook/orca/fbwebrtc/u;->b:[I

    invoke-virtual {p2}, Lcom/facebook/orca/fbwebrtc/ad;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 784
    :goto_1
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ad;->CONNECTING:Lcom/facebook/orca/fbwebrtc/ad;

    if-ne p2, v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    if-nez v0, :cond_2

    .line 785
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->P:Landroid/widget/ImageView;

    const-string v1, "rotation"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    .line 786
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    const-wide/16 v1, 0x4b0

    invoke-virtual {v0, v1, v2}, Lcom/a/a/ak;->c(J)Lcom/a/a/ak;

    .line 787
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    invoke-virtual {v0, v3}, Lcom/a/a/ak;->a(Landroid/view/animation/Interpolator;)V

    .line 788
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/a/a/ak;->a(I)V

    .line 789
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->a()V

    .line 794
    :cond_0
    :goto_2
    return-void

    .line 770
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 773
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->voip_connecting:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 776
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->voip_timer_phone:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 781
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->transparent:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 790
    :cond_2
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ad;->CONNECTING:Lcom/facebook/orca/fbwebrtc/ad;

    if-eq p2, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    if-eqz v0, :cond_0

    .line 791
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->c()V

    .line 792
    iput-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    goto :goto_2

    .line 771
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 785
    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 5

    .prologue
    .line 797
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->B:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/b;->DEVELOPMENT:Lcom/facebook/config/a/b;

    if-eq v0, v1, :cond_0

    .line 817
    :goto_0
    return-void

    .line 802
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->y:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 803
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 804
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->fields()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 805
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 806
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ": "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\n"

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 810
    :catch_0
    move-exception v0

    .line 811
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Z:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 814
    :goto_3
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Z:Landroid/widget/TextView;

    if-eqz p2, :cond_3

    const v0, -0xff0100

    :goto_4
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 816
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Z:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 807
    :cond_1
    :try_start_1
    const-string v0, ""

    goto :goto_2

    .line 809
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Z:Landroid/widget/TextView;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    .line 814
    :cond_3
    const/high16 v0, -0x10000

    goto :goto_4
.end method

.method private b(J)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 894
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 895
    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->F:Lcom/facebook/orca/fbwebrtc/m;

    invoke-virtual {v2}, Lcom/facebook/orca/fbwebrtc/m;->b()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 914
    :cond_0
    :goto_0
    return-void

    .line 899
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 900
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(J)V

    .line 901
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->aa:Landroid/view/View;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/q;->a()V

    .line 902
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->aa:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 903
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_2

    .line 904
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    invoke-interface {v0, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 905
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    .line 907
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/t;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/t;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    const-wide/16 v2, 0x2710

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    goto :goto_0

    .line 901
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private b(Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 273
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->c(Landroid/content/Intent;)J

    move-result-wide v1

    .line 274
    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-nez v0, :cond_1

    .line 275
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->finish()V

    .line 309
    :cond_0
    :goto_0
    return-void

    .line 280
    :cond_1
    iget-wide v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q:J

    cmp-long v0, v1, v3

    if-eqz v0, :cond_2

    .line 281
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Q:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->O:Lcom/facebook/widget/images/UrlImage;

    const/4 v0, 0x0

    check-cast v0, Landroid/net/Uri;

    invoke-virtual {v3, v0}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 283
    iput-wide v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q:J

    .line 285
    sget-object v0, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Lcom/facebook/fbservice/service/s;)V

    .line 288
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->k()V

    .line 291
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->i()V

    .line 294
    const-string v0, "com.facebook.orca.fbwebrtc.intent.action.CALL"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 295
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Starting a new call"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    iget-wide v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q:J

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/ag;->a(J)V

    .line 303
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->b()I

    move-result v0

    .line 304
    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 305
    sget v0, Lcom/facebook/o;->webrtc_incall_status_calling:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    goto :goto_0

    .line 297
    :cond_4
    const-string v0, "com.facebook.orca.fbwebrtc.intent.action.UPGRADE_ALERT"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 298
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Incoming call with upgrade alert"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 299
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->c(Z)V

    goto :goto_1

    .line 306
    :cond_5
    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 307
    sget v0, Lcom/facebook/o;->webrtc_incall_status_incoming:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p()V

    return-void
.end method

.method private b(Z)V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v0, 0x0

    .line 747
    const/4 v1, 0x5

    new-array v2, v1, [Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->S:Landroid/view/View;

    aput-object v1, v2, v0

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->U:Landroid/view/View;

    aput-object v1, v2, v5

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->X:Landroid/widget/Button;

    aput-object v1, v2, v6

    const/4 v1, 0x3

    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Y:Landroid/widget/Button;

    aput-object v3, v2, v1

    const/4 v1, 0x4

    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->W:Landroid/widget/Button;

    aput-object v3, v2, v1

    .line 754
    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 755
    invoke-virtual {v4, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 754
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 759
    :cond_0
    new-array v2, v6, [Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->T:Landroid/widget/TextView;

    aput-object v1, v2, v0

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->V:Landroid/widget/TextView;

    aput-object v1, v2, v5

    .line 763
    array-length v3, v2

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_2

    aget-object v4, v2, v1

    .line 764
    if-eqz p1, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    :goto_2
    invoke-static {v4, v0}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 763
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 764
    :cond_1
    const v0, 0x3f266666    # 0.65f

    goto :goto_2

    .line 766
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;Z)Z
    .locals 0

    .prologue
    .line 71
    iput-boolean p1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->w:Z

    return p1
.end method

.method private c(Landroid/content/Intent;)J
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const-wide/16 v0, 0x0

    .line 317
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 320
    const-string v2, "CONTACT_ID"

    invoke-virtual {p1, v2, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 321
    cmp-long v5, v2, v0

    if-nez v5, :cond_0

    .line 322
    sget-object v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v3, "Invalid CONTACT_ID in intent %s"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    :goto_0
    return-wide v0

    .line 327
    :cond_0
    const-string v5, "com.facebook.orca.fbwebrtc.intent.action.CALL"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 328
    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v4}, Lcom/facebook/orca/fbwebrtc/ag;->e()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 329
    sget-object v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v3, "Can\'t start a new call when there is a call going on"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 332
    :cond_1
    const-string v5, "com.facebook.orca.fbwebrtc.intent.action.UPGRADE_ALERT"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 333
    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v4}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 335
    sget-object v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v3, "It might be that the version site var is just updated from server."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 338
    :cond_2
    const-string v5, "com.facebook.orca.fbwebrtc.intent.action.SHOW_UI"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, "com.facebook.orca.fbwebrtc.intent.action.INCOMING_CALL"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 340
    :cond_3
    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v4}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v4

    if-nez v4, :cond_4

    .line 341
    sget-object v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v3, "Call is already finished."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 344
    :cond_4
    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v4}, Lcom/facebook/orca/fbwebrtc/bb;->a()J

    move-result-wide v4

    cmp-long v4, v2, v4

    if-eqz v4, :cond_6

    .line 345
    sget-object v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v3, "Action is targeted for a different user."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 349
    :cond_5
    sget-object v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v3, "Invalid action %s"

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v4, v5, v6

    invoke-static {v2, v3, v5}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    move-wide v0, v2

    .line 352
    goto :goto_0
.end method

.method private c(I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 614
    if-ltz p1, :cond_0

    invoke-static {}, Lcom/facebook/webrtc/a;->values()[Lcom/facebook/webrtc/a;

    move-result-object v0

    array-length v0, v0

    if-lt p1, v0, :cond_1

    .line 615
    :cond_0
    const-string v0, ""

    .line 657
    :goto_0
    return-object v0

    .line 617
    :cond_1
    invoke-static {}, Lcom/facebook/webrtc/a;->values()[Lcom/facebook/webrtc/a;

    move-result-object v0

    aget-object v0, v0, p1

    .line 618
    sget-object v1, Lcom/facebook/orca/fbwebrtc/u;->a:[I

    invoke-virtual {v0}, Lcom/facebook/webrtc/a;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 657
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_ended:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 623
    :pswitch_0
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_ended:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 630
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 631
    sget v0, Lcom/facebook/o;->webrtc_incall_status_not_available:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 633
    :cond_2
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_ended:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 642
    :pswitch_2
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_failed:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 645
    :pswitch_3
    sget v0, Lcom/facebook/o;->webrtc_incall_status_connection_lost:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 648
    :pswitch_4
    sget v0, Lcom/facebook/o;->webrtc_incall_status_in_another_call:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 651
    :pswitch_5
    sget v0, Lcom/facebook/o;->webrtc_incall_status_carrier_blocked:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 654
    :pswitch_6
    const-string v0, ""

    goto :goto_0

    .line 618
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method static synthetic c(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q()V

    return-void
.end method

.method private c(Z)V
    .locals 3

    .prologue
    .line 820
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 870
    :goto_0
    return-void

    .line 824
    :cond_0
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_ended:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    .line 828
    if-eqz p1, :cond_1

    .line 829
    sget v0, Lcom/facebook/o;->webrtc_outgoing_upgrade_alert_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 830
    sget v0, Lcom/facebook/o;->webrtc_outgoing_upgrade_alert_message:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 836
    :goto_1
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->upgrade_button:I

    new-instance v2, Lcom/facebook/orca/fbwebrtc/q;

    invoke-direct {v2, p0}, Lcom/facebook/orca/fbwebrtc/q;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_not_now:I

    new-instance v2, Lcom/facebook/orca/fbwebrtc/p;

    invoke-direct {v2, p0}, Lcom/facebook/orca/fbwebrtc/p;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    .line 862
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/r;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 869
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 832
    :cond_1
    sget v0, Lcom/facebook/o;->webrtc_incoming_upgrade_alert_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 833
    sget v0, Lcom/facebook/o;->webrtc_incoming_upgrade_alert_message:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method static synthetic d(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->u()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->v()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Lcom/facebook/orca/fbwebrtc/bb;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Z
    .locals 1

    .prologue
    .line 71
    iget-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->w:Z

    return v0
.end method

.method static synthetic h(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->s()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r()V

    return-void
.end method

.method static synthetic j()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t()V

    return-void
.end method

.method static synthetic k(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)J
    .locals 2

    .prologue
    .line 71
    iget-wide v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q:J

    return-wide v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 386
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 387
    const-string v1, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 388
    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 389
    return-void
.end method

.method static synthetic l(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Lcom/facebook/appconfig/m;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->E:Lcom/facebook/appconfig/m;

    return-object v0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 554
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 555
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->N:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 556
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->M:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 560
    :goto_0
    return-void

    .line 558
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->m()V

    goto :goto_0
.end method

.method static synthetic m(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Lcom/facebook/config/a/a;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->B:Lcom/facebook/config/a/a;

    return-object v0
.end method

.method private m()V
    .locals 2

    .prologue
    .line 563
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->M:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 564
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->N:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 565
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->n()V

    .line 566
    return-void
.end method

.method static synthetic n(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->A:Lcom/facebook/c/s;

    return-object v0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 569
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 570
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->X:Landroid/widget/Button;

    sget v1, Lcom/facebook/h;->voip_in_call_speaker_button_background_on:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 575
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 576
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Y:Landroid/widget/Button;

    sget v1, Lcom/facebook/h;->voip_in_call_mute_button_background_on:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 580
    :goto_1
    return-void

    .line 572
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->X:Landroid/widget/Button;

    sget v1, Lcom/facebook/h;->voip_in_call_speaker_button_background_off:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    .line 578
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Y:Landroid/widget/Button;

    sget v1, Lcom/facebook/h;->voip_in_call_mute_button_background_off:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_1
.end method

.method static synthetic o(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Lcom/facebook/orca/fbwebrtc/ae;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->H:Lcom/facebook/orca/fbwebrtc/ae;

    return-object v0
.end method

.method private o()V
    .locals 1

    .prologue
    .line 583
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 588
    :goto_0
    return-void

    .line 586
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->m()V

    .line 587
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->h()V

    goto :goto_0
.end method

.method static synthetic p(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->ab:Landroid/view/ViewGroup;

    return-object v0
.end method

.method private p()V
    .locals 2

    .prologue
    .line 591
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 592
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t()V

    .line 598
    :goto_0
    return-void

    .line 595
    :cond_0
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_ended:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    .line 596
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndIgnoreCall:Lcom/facebook/webrtc/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/facebook/webrtc/a;)V

    .line 597
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t()V

    goto :goto_0
.end method

.method private q()V
    .locals 2

    .prologue
    .line 601
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 602
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t()V

    .line 608
    :goto_0
    return-void

    .line 605
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndHangupCall:Lcom/facebook/webrtc/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/facebook/webrtc/a;)V

    .line 606
    sget v0, Lcom/facebook/o;->webrtc_incall_status_call_ended:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    .line 607
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t()V

    goto :goto_0
.end method

.method private r()V
    .locals 5

    .prologue
    .line 668
    iget-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 679
    :cond_0
    :goto_0
    return-void

    .line 671
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->w:Z

    .line 672
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/ab;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/ab;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    const-wide/16 v2, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0
.end method

.method private s()V
    .locals 2

    .prologue
    .line 685
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->b()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 694
    :goto_0
    return-void

    .line 689
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->f()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->IN_CALL:Lcom/facebook/orca/fbwebrtc/ad;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->a(Ljava/lang/String;Lcom/facebook/orca/fbwebrtc/ad;)V

    .line 693
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r()V

    goto :goto_0
.end method

.method private t()V
    .locals 5

    .prologue
    .line 702
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 714
    :cond_0
    :goto_0
    return-void

    .line 706
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(Z)V

    .line 708
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/ac;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/ac;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    const-wide/16 v2, 0x7d0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    goto :goto_0
.end method

.method private u()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 720
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 721
    :goto_0
    sget-object v3, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v4, "toggle speaker state to %b"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v1, v2

    invoke-static {v3, v4, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 723
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/fbwebrtc/bb;->a(Z)V

    .line 725
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->n()V

    .line 726
    return-void

    :cond_0
    move v0, v2

    .line 720
    goto :goto_0
.end method

.method private v()V
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 732
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 733
    :goto_0
    sget-object v3, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v4, "toggle microphone mute state %b"

    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    invoke-virtual {v2, v0}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    .line 735
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->n()V

    .line 738
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->s:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v2

    if-eqz v2, :cond_1

    .line 739
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/ag;->a(Z)V

    .line 743
    :goto_1
    return-void

    :cond_0
    move v0, v2

    .line 732
    goto :goto_0

    .line 741
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/fbwebrtc/ag;->a(Z)V

    goto :goto_1
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 357
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/content/Intent;)V

    .line 359
    const-string v0, "com.facebook.orca.fbwebrtc.intent.action.INCOMING_CALL"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 380
    :goto_0
    return-void

    .line 365
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->D:Lcom/facebook/orca/fbwebrtc/ax;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ax;->a()V

    .line 366
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(Z)V

    .line 367
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->aa:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 368
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Z:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    if-eqz v0, :cond_1

    .line 370
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->c()V

    .line 371
    iput-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    .line 373
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_2

    .line 374
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 375
    iput-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->z:Ljava/util/concurrent/Future;

    .line 377
    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(Landroid/content/Intent;)V

    .line 378
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->l()V

    .line 379
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Call activity recreated"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 125
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d6

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 126
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x280000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 129
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 130
    const-class v0, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/ag;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    .line 131
    const-class v0, Lcom/facebook/orca/fbwebrtc/ax;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/ax;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->D:Lcom/facebook/orca/fbwebrtc/ax;

    .line 132
    const-class v0, Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/bb;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    .line 133
    const-class v0, Lcom/facebook/orca/fbwebrtc/ae;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/ae;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->H:Lcom/facebook/orca/fbwebrtc/ae;

    .line 134
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->K:Lcom/facebook/fbservice/ops/k;

    .line 136
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->v:Lcom/facebook/prefs/shared/d;

    .line 138
    const-class v0, Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    .line 139
    const-class v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->s:Landroid/telephony/TelephonyManager;

    .line 140
    const-class v0, Ljava/util/concurrent/Executor;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->t:Ljava/util/concurrent/Executor;

    .line 141
    const-class v0, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    .line 143
    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->y:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 144
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->A:Lcom/facebook/c/s;

    .line 145
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->B:Lcom/facebook/config/a/a;

    .line 146
    const-class v0, Lcom/facebook/appconfig/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/m;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->E:Lcom/facebook/appconfig/m;

    .line 147
    const-class v0, Lcom/facebook/orca/fbwebrtc/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/m;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->F:Lcom/facebook/orca/fbwebrtc/m;

    .line 148
    const-class v0, Lcom/facebook/zero/ui/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/o;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->J:Lcom/facebook/zero/ui/o;

    .line 151
    sget v0, Lcom/facebook/k;->orca_webrtc_incall:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->setContentView(I)V

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->J:Lcom/facebook/zero/ui/o;

    sget-object v1, Lcom/facebook/zero/a/c;->l:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/o;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    sget v0, Lcom/facebook/i;->zero_incoming_call_buttons_stub:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 156
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 162
    :goto_0
    sget v0, Lcom/facebook/i;->incoming_call_buttons:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->M:Landroid/view/View;

    .line 163
    sget v0, Lcom/facebook/i;->incall_buttons:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->N:Landroid/view/View;

    .line 164
    sget v0, Lcom/facebook/i;->contact_photo:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->O:Lcom/facebook/widget/images/UrlImage;

    .line 165
    sget v0, Lcom/facebook/i;->call_status_icon:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->P:Landroid/widget/ImageView;

    .line 166
    sget v0, Lcom/facebook/i;->contact_display_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Q:Landroid/widget/TextView;

    .line 167
    sget v0, Lcom/facebook/i;->call_status:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->R:Landroid/widget/TextView;

    .line 168
    sget v0, Lcom/facebook/i;->answer_call_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->S:Landroid/view/View;

    .line 169
    sget v0, Lcom/facebook/i;->answer_call_button_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->T:Landroid/widget/TextView;

    .line 170
    sget v0, Lcom/facebook/i;->decline_call_button_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->V:Landroid/widget/TextView;

    .line 171
    sget v0, Lcom/facebook/i;->decline_call_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->U:Landroid/view/View;

    .line 172
    sget v0, Lcom/facebook/i;->end_call_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->W:Landroid/widget/Button;

    .line 173
    sget v0, Lcom/facebook/i;->incall_button_speaker:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->X:Landroid/widget/Button;

    .line 174
    sget v0, Lcom/facebook/i;->incall_button_mute:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Y:Landroid/widget/Button;

    .line 175
    sget v0, Lcom/facebook/i;->debug_info_textview:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Z:Landroid/widget/TextView;

    .line 176
    sget v0, Lcom/facebook/i;->survey_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->aa:Landroid/view/View;

    .line 177
    sget v0, Lcom/facebook/i;->survey_button_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->ab:Landroid/view/ViewGroup;

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->S:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/o;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/o;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->U:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/v;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/v;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->W:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/w;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/w;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->X:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/x;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/x;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Y:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/y;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/y;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    new-instance v1, Lcom/facebook/orca/fbwebrtc/z;

    invoke-direct {v1, p0}, Lcom/facebook/orca/fbwebrtc/z;-><init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/webrtc/IWebrtcUiInterface;)V

    .line 265
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->b(Landroid/content/Intent;)V

    .line 266
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Call activity created"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 267
    return-void

    .line 158
    :cond_0
    sget v0, Lcom/facebook/i;->incoming_call_buttons_stub:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 159
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 444
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onDestroy()V

    .line 446
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/webrtc/IWebrtcUiInterface;)V

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_1

    .line 451
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 452
    iput-object v2, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->L:Lcom/google/common/d/a/s;

    .line 454
    :cond_1
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Call activity destroyed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 455
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, -0x1

    .line 459
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 460
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v2

    .line 481
    :goto_0
    return v2

    .line 464
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 472
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/i;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v2

    goto :goto_0

    :pswitch_0
    move v0, v1

    .line 474
    :goto_1
    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->v:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/orca/prefs/f;->d:Lcom/facebook/prefs/shared/ae;

    const-string v5, "-1"

    invoke-interface {v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 476
    if-ne v3, v1, :cond_1

    .line 477
    const/4 v1, 0x0

    .line 479
    :goto_2
    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r:Landroid/media/AudioManager;

    const/4 v4, 0x5

    invoke-virtual {v3, v1, v0, v4}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    goto :goto_0

    :pswitch_1
    move v0, v2

    .line 470
    goto :goto_1

    :cond_1
    move v1, v3

    goto :goto_2

    .line 464
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onStart()V
    .locals 2

    .prologue
    .line 393
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStart()V

    .line 395
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->D:Lcom/facebook/orca/fbwebrtc/ax;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ax;->a()V

    .line 397
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 419
    :goto_0
    return-void

    .line 403
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 404
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Call is not in started mode"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 405
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->finish()V

    goto :goto_0

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->G:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 410
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->r()V

    .line 413
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    if-eqz v0, :cond_3

    .line 414
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->a()V

    .line 417
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->l()V

    .line 418
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Call activity started"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onStop()V
    .locals 4

    .prologue
    .line 423
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStop()V

    .line 425
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->I:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 440
    :goto_0
    return-void

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->C:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 432
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->D:Lcom/facebook/orca/fbwebrtc/ax;

    iget-wide v1, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->q:J

    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->Q:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/fbwebrtc/ax;->a(JLjava/lang/String;)V

    .line 436
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    if-eqz v0, :cond_2

    .line 437
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->x:Lcom/a/a/ak;

    invoke-virtual {v0}, Lcom/a/a/ak;->c()V

    .line 439
    :cond_2
    sget-object v0, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;->p:Ljava/lang/Class;

    const-string v1, "Call activity stopped"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method
