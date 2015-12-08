.class public Lkik/android/chat/fragment/ViewPictureFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"

# interfaces
.implements Lkik/android/sdkutils/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/ViewPictureFragment$a;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/CharSequence;


# instance fields
.field private A:Lkik/android/util/cv$c;

.field private B:Z

.field private C:Z

.field private D:Lkik/a/d/k;

.field private E:Lkik/a/d/aa;

.field private F:Lkik/a/d/a/a;

.field private G:Ljava/io/File;

.field private H:J

.field private I:Z

.field private J:Z

.field private K:Z

.field private L:Landroid/widget/MediaController;

.field private M:I

.field private final N:Lcom/kik/g/f;

.field private O:Lcom/kik/g/i;

.field private U:Lcom/kik/g/i;

.field private V:Lcom/android/volley/r$a;

.field _saveButton:Landroid/widget/ImageButton;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e008f
    .end annotation
.end field

.field _topbar:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0089
    .end annotation
.end field

.field _videoPlayIcon:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e008c
    .end annotation
.end field

.field _videoView:Landroid/widget/VideoView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e008b
    .end annotation
.end field

.field _videoViewContainer:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0088
    .end annotation
.end field

.field b:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContentImageLoader"
    .end annotation
.end field

.field c:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field contentImageView:Lcom/kik/cache/ContentImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0090
    .end annotation
.end field

.field protected d:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected j:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field k:Landroid/view/animation/Animation$AnimationListener;

.field private l:Landroid/view/View;

.field private m:Lkik/android/chat/fragment/ProgressDialogFragment;

.field private n:Landroid/os/Handler;

.field private o:Ljava/lang/String;

.field openButton:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0092
    .end annotation
.end field

.field private p:Ljava/lang/String;

.field profImageView:Lcom/kik/cache/ProfileImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0091
    .end annotation
.end field

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:Z

.field private t:Z

.field title:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e001e
    .end annotation
.end field

.field private x:I

.field private y:Z

.field private z:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 103
    const-string v0, ""

    sput-object v0, Lkik/android/chat/fragment/ViewPictureFragment;->a:Ljava/lang/CharSequence;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 120
    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->r:Z

    .line 121
    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 122
    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->t:Z

    .line 124
    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->y:Z

    .line 128
    iput-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->A:Lkik/android/util/cv$c;

    .line 129
    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    .line 153
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->J:Z

    .line 154
    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->K:Z

    .line 155
    iput-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->L:Landroid/widget/MediaController;

    .line 158
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->N:Lcom/kik/g/f;

    .line 160
    new-instance v0, Lkik/android/chat/fragment/se;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/se;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->O:Lcom/kik/g/i;

    .line 169
    new-instance v0, Lkik/android/chat/fragment/st;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/st;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->U:Lcom/kik/g/i;

    .line 235
    new-instance v0, Lkik/android/chat/fragment/tc;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/tc;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->V:Lcom/android/volley/r$a;

    .line 865
    new-instance v0, Lkik/android/chat/fragment/su;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/su;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->k:Landroid/view/animation/Animation$AnimationListener;

    .line 1166
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/io/File;)Ljava/io/File;
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->G:Ljava/io/File;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    return-object p1
.end method

.method public static a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lkik/a/d/a/a;
    .locals 8

    .prologue
    .line 1134
    if-eqz p0, :cond_1

    .line 1135
    new-instance v5, Ljava/util/Hashtable;

    invoke-direct {v5}, Ljava/util/Hashtable;-><init>()V

    .line 1136
    new-instance v7, Ljava/util/Hashtable;

    invoke-direct {v7}, Ljava/util/Hashtable;-><init>()V

    .line 1137
    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6}, Ljava/util/Hashtable;-><init>()V

    .line 1139
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->f:Ljava/util/Hashtable;

    invoke-virtual {v7, v0}, Ljava/util/Hashtable;->putAll(Ljava/util/Map;)V

    .line 1140
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->g:Ljava/util/Hashtable;

    invoke-virtual {v5, v0}, Ljava/util/Hashtable;->putAll(Ljava/util/Map;)V

    .line 1142
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->a:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1144
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1145
    new-instance v1, Lkik/a/d/d;

    invoke-static {v0}, Lcom/kik/m/e;->c([B)[B

    move-result-object v0

    invoke-direct {v1, v0}, Lkik/a/d/d;-><init>([B)V

    .line 1146
    const-string v0, "icon"

    invoke-virtual {v6, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1154
    :cond_0
    :goto_0
    new-instance v0, Lkik/a/d/a/a;

    iget-object v1, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;->e:Ljava/util/ArrayList;

    invoke-direct/range {v0 .. v7}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    .line 1157
    :goto_1
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 1062
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    if-nez v0, :cond_0

    .line 1086
    :goto_0
    return-void

    .line 1067
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/ta;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ta;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    .line 1076
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v2, 0x7f0902bc

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090193

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->c(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    .line 1077
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->setCancelable(Z)V

    .line 1078
    new-instance v1, Lkik/android/chat/fragment/tb;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/tb;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1085
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 1

    .prologue
    .line 92
    const v0, 0x7f09001f

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(I)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/io/File;Lkik/a/d/a/a;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, v2}, Lkik/android/chat/fragment/ViewPictureFragment;->c(Z)V

    iput-boolean v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->a(Lkik/android/sdkutils/a;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/a/e/v;->x(Ljava/lang/String;)[B

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/android/util/ct;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v1, v0}, Lcom/kik/cache/ContentImageView;->d(Landroid/graphics/Bitmap;)V

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-static {p1}, Lkik/android/VideoContentProvider;->a(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    const-string v0, "com.kik.ext.gif"

    invoke-virtual {p2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lkik/android/chat/fragment/sn;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v1}, Landroid/widget/VideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lkik/android/chat/fragment/sn;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->L:Landroid/widget/MediaController;

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->L:Landroid/widget/MediaController;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoViewContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->L:Landroid/widget/MediaController;

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V

    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    new-instance v1, Lkik/android/chat/fragment/so;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/fragment/so;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    new-instance v1, Lkik/android/chat/fragment/sp;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/fragment/sp;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    new-instance v1, Lkik/android/chat/fragment/sq;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sq;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoViewContainer:Landroid/widget/FrameLayout;

    new-instance v1, Lkik/android/chat/fragment/sr;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sr;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    new-instance v1, Lkik/android/chat/fragment/ss;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/fragment/ss;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/a/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    goto/16 :goto_0

    :cond_4
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 712
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v0, :cond_0

    .line 713
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v0

    sget-object v1, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    invoke-virtual {v0, v1}, Lkik/a/d/a/a$b;->a(Lkik/a/d/a/a$b;)Z

    move-result v0

    .line 715
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/ViewPictureFragment;Z)Z
    .locals 0

    .prologue
    .line 92
    iput-boolean p1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    return p1
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 905
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 906
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    aput-object v1, v0, v2

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    aput-object v1, v0, v3

    const/4 v1, 0x2

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoViewContainer:Landroid/widget/FrameLayout;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 907
    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/io/File;)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->b(Ljava/io/File;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/ViewPictureFragment;Z)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/ViewPictureFragment;->c(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/16 v5, 0xb

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v2, 0xe

    .line 204
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 205
    if-nez v0, :cond_1

    .line 225
    :cond_0
    :goto_0
    return-void

    .line 209
    :cond_1
    if-eqz p1, :cond_3

    .line 210
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v5, :cond_2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v2, :cond_2

    .line 211
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 213
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v2, :cond_0

    .line 214
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 218
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v5, :cond_4

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v2, :cond_4

    .line 219
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 221
    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v2, :cond_0

    .line 222
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/chat/fragment/ViewPictureFragment;)Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/android/chat/fragment/ProgressDialogFragment;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 911
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 912
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 913
    return-void
.end method

.method private c(Z)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 258
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Z)V

    .line 259
    if-eqz p1, :cond_1

    .line 260
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_topbar:Landroid/view/ViewGroup;

    invoke-static {v0}, Lkik/android/util/av;->c(Landroid/view/View;)V

    .line 269
    :cond_0
    new-array v0, v6, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    aput-object v1, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 273
    :goto_0
    iput-boolean p1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    .line 274
    return-void

    .line 264
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_topbar:Landroid/view/ViewGroup;

    const/16 v1, 0x1f4

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/util/av;->a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V

    .line 265
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->C:Z

    if-eqz v0, :cond_0

    .line 266
    new-array v0, v6, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    aput-object v1, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic d(Lkik/android/chat/fragment/ViewPictureFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->n:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    const/16 v1, 0x96

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->k:Landroid/view/animation/Animation$AnimationListener;

    invoke-static {v0, v1, v2}, Lkik/android/util/av;->a(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V

    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    if-nez v0, :cond_0

    invoke-direct {p0, v3}, Lkik/android/chat/fragment/ViewPictureFragment;->c(Z)V

    :cond_0
    iput-boolean v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    return-void
.end method

.method static synthetic g(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 1

    .prologue
    .line 92
    const v0, 0x7f09014d

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(I)V

    return-void
.end method

.method static synthetic h(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 1

    .prologue
    .line 92
    const v0, 0x7f0900e3

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(I)V

    return-void
.end method

.method static synthetic i(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/android/util/cv$c;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->A:Lkik/android/util/cv$c;

    return-object v0
.end method

.method static synthetic j(Lkik/android/chat/fragment/ViewPictureFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lkik/android/chat/fragment/ViewPictureFragment;)Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    return v0
.end method

.method static synthetic l(Lkik/android/chat/fragment/ViewPictureFragment;)I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    return v0
.end method

.method static synthetic m(Lkik/android/chat/fragment/ViewPictureFragment;)Ljava/io/File;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->G:Ljava/io/File;

    return-object v0
.end method

.method static synthetic n(Lkik/android/chat/fragment/ViewPictureFragment;)Z
    .locals 1

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic o(Lkik/android/chat/fragment/ViewPictureFragment;)[B
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->z:[B

    return-object v0
.end method

.method static synthetic p(Lkik/android/chat/fragment/ViewPictureFragment;)Lcom/android/volley/r$a;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->V:Lcom/android/volley/r$a;

    return-object v0
.end method

.method static synthetic q(Lkik/android/chat/fragment/ViewPictureFragment;)Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->J:Z

    return v0
.end method

.method static synthetic r(Lkik/android/chat/fragment/ViewPictureFragment;)Z
    .locals 1

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->I:Z

    return v0
.end method

.method static synthetic s(Lkik/android/chat/fragment/ViewPictureFragment;)J
    .locals 2

    .prologue
    .line 92
    iget-wide v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->H:J

    return-wide v0
.end method

.method static synthetic t(Lkik/android/chat/fragment/ViewPictureFragment;)Z
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->J:Z

    return v0
.end method

.method static synthetic u(Lkik/android/chat/fragment/ViewPictureFragment;)Landroid/widget/MediaController;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->L:Landroid/widget/MediaController;

    return-object v0
.end method

.method static synthetic v(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->b()V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->bringToFront()V

    invoke-direct {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->c(Z)V

    iput-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    invoke-static {}, Lkik/android/HeadphoneUnpluggedReceiver;->a()Lkik/android/HeadphoneUnpluggedReceiver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lkik/android/HeadphoneUnpluggedReceiver;->b(Lkik/android/sdkutils/a;)V

    return-void
.end method


# virtual methods
.method protected final C()I
    .locals 1

    .prologue
    .line 289
    const/16 v0, 0x20

    return v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 898
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 899
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    .line 901
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 179
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/ViewPictureFragment;)V

    .line 180
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lkik/android/chat/fragment/ViewPictureFragment;->H:J

    .line 183
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "PHOTOURL"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    const-string v3, "MESSAGING_KEY"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v3

    iput-object v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->z:[B

    const-string v3, "JID"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->p:Ljava/lang/String;

    const-string v3, "VIEW_PICTURE_TYPE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const-string v3, "ALLOW_TO_ATTACH_MESSAGE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->K:Z

    const-string v3, "CONTENT_MESSAGE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lkik/a/d/a/a;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    invoke-static {v0, v3, v4}, Lkik/android/util/cv;->a(Lkik/a/d/a/a;Landroid/content/Context;Ljava/lang/String;)Lkik/android/util/cv$c;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->A:Lkik/android/util/cv$c;

    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->K:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->K:Z

    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->j:Lcom/kik/l/ab;

    iget-object v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v3}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_1
    iput-boolean v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->I:Z

    .line 187
    :cond_2
    :try_start_0
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 188
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->E:Lkik/a/d/aa;

    .line 199
    :goto_2
    return-void

    :cond_3
    move v0, v1

    .line 183
    goto :goto_0

    :cond_4
    move v2, v1

    goto :goto_1

    .line 191
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->d:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->p:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 196
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    goto :goto_2
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v9, 0x2

    const v5, 0x7f09001f

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 305
    const v0, 0x7f030016

    invoke-virtual {p1, v0, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    .line 307
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 309
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->n:Landroid/os/Handler;

    .line 311
    invoke-virtual {p0, v5}, Lkik/android/chat/fragment/ViewPictureFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/ViewPictureFragment;->a:Ljava/lang/CharSequence;

    .line 315
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->N:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    invoke-virtual {v1}, Lcom/kik/cache/ProfileImageView;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->O:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 316
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->N:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    invoke-virtual {v1}, Lcom/kik/cache/ProfileImageView;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->U:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 318
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    new-instance v1, Lkik/android/chat/fragment/td;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/td;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/cache/ProfileImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    new-instance v1, Lkik/android/chat/fragment/te;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/te;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContentImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 341
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-static {v0}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "PREVIEW"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->q:Ljava/lang/String;

    .line 345
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    if-nez v0, :cond_6

    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    if-eq v0, v9, :cond_1

    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_6

    .line 348
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 349
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->J()V

    .line 350
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    .line 707
    :goto_1
    return-object v0

    .line 341
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->d:Lkik/a/e/r;

    invoke-static {v0, v2}, Lkik/android/util/cq;->a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    const v0, 0x7f090202

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->E:Lkik/a/d/aa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->E:Lkik/a/d/aa;

    iget-object v2, v2, Lkik/a/d/aa;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->E:Lkik/a/d/aa;

    iget-object v2, v2, Lkik/a/d/aa;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 353
    :cond_6
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 354
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0, v6}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 355
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    .line 357
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v1, Lkik/android/chat/fragment/tf;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/tf;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 368
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 370
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 371
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->c()V

    .line 372
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->E:Lkik/a/d/aa;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->c:Lcom/kik/cache/ad;

    new-instance v3, Lkik/android/chat/fragment/tg;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/tg;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    new-instance v4, Lkik/android/chat/fragment/ti;

    invoke-direct {v4, p0}, Lkik/android/chat/fragment/ti;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/cache/ProfileImageView;->a(Lkik/a/d/aa;Lcom/kik/cache/ad;Lcom/android/volley/r$b;Lcom/kik/cache/ad$d;)V

    .line 418
    iput-boolean v6, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 420
    :cond_7
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    if-ne v0, v9, :cond_d

    .line 421
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->c()V

    .line 422
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->profImageView:Lcom/kik/cache/ProfileImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->D:Lkik/a/d/k;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->b:Lcom/kik/cache/ad;

    invoke-virtual {v0, v1, v2}, Lcom/kik/cache/ProfileImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;)V

    .line 423
    iput-boolean v6, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 542
    :cond_8
    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    const v1, 0x7f0e0094

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/EllipsizingTextView;

    .line 543
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    const v2, 0x7f0e0093

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 545
    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->A:Lkik/android/util/cv$c;

    if-eqz v2, :cond_12

    .line 546
    iput-boolean v6, p0, Lkik/android/chat/fragment/ViewPictureFragment;->C:Z

    .line 547
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->a()Z

    move-result v2

    if-nez v2, :cond_9

    .line 548
    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 550
    :cond_9
    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    new-instance v3, Lkik/android/chat/fragment/sf;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/sf;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 571
    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->A:Lkik/android/util/cv$c;

    invoke-virtual {v2}, Lkik/android/util/cv$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/widget/EllipsizingTextView;->setText(Ljava/lang/CharSequence;)V

    .line 572
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->A:Lkik/android/util/cv$c;

    invoke-virtual {v0}, Lkik/android/util/cv$c;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 586
    :goto_4
    new-instance v0, Lkik/a/d/d;

    invoke-direct {v0, v7}, Lkik/a/d/d;-><init>([B)V

    .line 587
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v1, :cond_a

    .line 588
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/d;->a(Ljava/lang/String;)V

    .line 590
    :cond_a
    iget v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_b

    .line 591
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    invoke-static {v1}, Lkik/android/util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/d;->a(Ljava/lang/String;)V

    .line 595
    :cond_b
    iget v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_c

    iget v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    if-eq v1, v9, :cond_c

    iget v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_c

    iget-boolean v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->K:Z

    if-eqz v1, :cond_13

    .line 596
    :cond_c
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 707
    :goto_5
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->l:Landroid/view/View;

    goto/16 :goto_1

    .line 425
    :cond_d
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v0, :cond_f

    .line 426
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 428
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 429
    iget v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    iget v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    const/16 v5, 0x41

    invoke-static {v5}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 431
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 433
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->j:Lcom/kik/l/ab;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->z:[B

    iget-object v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/ProgressDialogFragment;->f()Lkik/a/e/s;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/kik/l/ab;->a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    .line 434
    new-instance v1, Lkik/android/chat/fragment/tl;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/tl;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_3

    .line 475
    :cond_e
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->b()V

    .line 476
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    const-string v1, "int-file-url-local"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 478
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->g:Lkik/a/e/n;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lkik/a/e/n;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 479
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v1, v0}, Lcom/kik/cache/ContentImageView;->d(Landroid/graphics/Bitmap;)V

    .line 480
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 481
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    .line 483
    :catch_0
    move-exception v0

    .line 484
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v1}, Lcom/kik/cache/ContentImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 485
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 490
    :cond_f
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_10

    .line 491
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->b()V

    .line 493
    :try_start_1
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lcom/kik/m/k;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 494
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v1, v0}, Lcom/kik/cache/ContentImageView;->d(Landroid/graphics/Bitmap;)V

    .line 495
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 496
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 497
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    const v1, 0x7f0901cc

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 500
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 501
    const-string v1, "photoUrl"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Landroid/os/Bundle;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_3

    .line 504
    :catch_1
    move-exception v0

    .line 505
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v1}, Lcom/kik/cache/ContentImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 506
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 509
    :cond_10
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_11

    .line 510
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->b()V

    .line 512
    :try_start_2
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContentImageView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 513
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 514
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 515
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    const v1, 0x7f0901cc

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_3

    .line 517
    :catch_2
    move-exception v0

    .line 518
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 519
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 522
    :cond_11
    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_8

    .line 523
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->b()V

    .line 525
    :try_start_3
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->o:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v1}, Lcom/kik/cache/ContentImageView;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    invoke-virtual {v2}, Lcom/kik/cache/ContentImageView;->getMeasuredHeight()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v0

    .line 526
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->b:Lcom/kik/cache/ad;

    invoke-virtual {v1, v0, v2}, Lcom/kik/cache/ContentImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;)V

    .line 527
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    .line 528
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 529
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->title:Landroid/widget/TextView;

    const v1, 0x7f0901cc

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 532
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 533
    const-string v1, "photoUrl"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Landroid/os/Bundle;)V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_3

    .line 536
    :catch_3
    move-exception v0

    .line 537
    invoke-virtual {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 538
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 575
    :cond_12
    iput-boolean v8, p0, Lkik/android/chat/fragment/ViewPictureFragment;->C:Z

    .line 576
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_4

    .line 598
    :cond_13
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/a/h/e;->a(Lkik/a/d/d;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 599
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const v1, 0x7f02024d

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 600
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v8}, Landroid/widget/ImageButton;->setClickable(Z)V

    goto/16 :goto_5

    .line 602
    :cond_14
    iget v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_15

    .line 603
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const v1, 0x7f02026e

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 604
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    new-instance v1, Lkik/android/chat/fragment/sh;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sh;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 616
    :cond_15
    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->a()Z

    move-result v1

    if-eqz v1, :cond_19

    .line 618
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->G:Ljava/io/File;

    if-eqz v0, :cond_16

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->G:Ljava/io/File;

    invoke-interface {v0, v1}, Lkik/a/e/v;->c(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-static {v0, v1}, Lkik/android/util/a;->a(Lkik/a/e/v;Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 620
    :cond_17
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const v1, 0x7f02024d

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 621
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v8}, Landroid/widget/ImageButton;->setClickable(Z)V

    goto/16 :goto_5

    .line 624
    :cond_18
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    new-instance v1, Lkik/android/chat/fragment/si;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/si;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 650
    :cond_19
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v1, :cond_1b

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-static {v1, v2}, Lkik/android/util/a;->a(Lkik/a/e/v;Lkik/a/d/a/a;)Z

    move-result v1

    if-nez v1, :cond_1a

    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/util/a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1b

    .line 652
    :cond_1a
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const v1, 0x7f02024d

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 653
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v8}, Landroid/widget/ImageButton;->setClickable(Z)V

    goto/16 :goto_5

    .line 656
    :cond_1b
    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    new-instance v2, Lkik/android/chat/fragment/sj;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/sj;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/d;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 1096
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 1097
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 966
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 967
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Z)V

    .line 968
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    if-lez v0, :cond_0

    .line 969
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    .line 970
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->M:I

    .line 973
    :cond_0
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->B:Z

    if-eqz v0, :cond_1

    .line 974
    invoke-direct {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->c(Z)V

    .line 976
    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 1102
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 1104
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->s:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->t:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->r:Z

    if-nez v0, :cond_1

    .line 1105
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/sv;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/sv;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Lkik/android/chat/fragment/ProgressDialogFragment$a;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0, v9}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v1, Lkik/android/chat/fragment/sw;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sw;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->m:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->x:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lkik/android/chat/fragment/ViewPictureFragment;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/chat/fragment/ViewPictureFragment;->z:[B

    iget-object v3, p0, Lkik/android/chat/fragment/ViewPictureFragment;->b:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    iget-object v5, p0, Lkik/android/chat/fragment/ViewPictureFragment;->h:Lkik/a/f/k;

    iget-object v6, p0, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    invoke-static {v6}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v6

    new-instance v7, Lkik/android/chat/fragment/sx;

    invoke-direct {v7, p0}, Lkik/android/chat/fragment/sx;-><init>(Lkik/android/chat/fragment/ViewPictureFragment;)V

    invoke-virtual/range {v0 .. v7}, Lcom/kik/cache/ContentImageView;->a(Lkik/a/d/a/a;[BLcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/f/k;Lkik/a/z;Lcom/kik/cache/ad$d;)V

    .line 1106
    :cond_0
    iput-boolean v9, p0, Lkik/android/chat/fragment/ViewPictureFragment;->t:Z

    .line 1108
    :cond_1
    iget-boolean v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->y:Z

    if-eqz v0, :cond_2

    .line 1109
    iput-boolean v8, p0, Lkik/android/chat/fragment/ViewPictureFragment;->y:Z

    .line 1110
    const v0, 0x7f09001f

    invoke-direct {p0, v0}, Lkik/android/chat/fragment/ViewPictureFragment;->a(I)V

    .line 1112
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_3

    iget v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->M:I

    if-eqz v0, :cond_3

    .line 1113
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    iget v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->M:I

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 1114
    iput v8, p0, Lkik/android/chat/fragment/ViewPictureFragment;->M:I

    .line 1117
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    if-eqz v0, :cond_4

    const-string v0, "com.kik.ext.gif"

    iget-object v1, p0, Lkik/android/chat/fragment/ViewPictureFragment;->F:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1118
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    if-eqz v0, :cond_4

    .line 1119
    iget-object v0, p0, Lkik/android/chat/fragment/ViewPictureFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 1122
    :cond_4
    return-void
.end method

.method public final y()I
    .locals 1

    .prologue
    .line 1163
    const/high16 v0, -0x1000000

    return v0
.end method
