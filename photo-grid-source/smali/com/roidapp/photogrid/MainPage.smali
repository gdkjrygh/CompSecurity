.class public Lcom/roidapp/photogrid/MainPage;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/cloudlib/sns/g/c;
.implements Lcom/roidapp/cloudlib/sns/main/a;


# static fields
.field protected static g:I

.field private static s:Z


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Landroid/widget/ImageView;

.field private C:Landroid/view/View;

.field private D:Landroid/view/View;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:Landroid/graphics/Bitmap;

.field private I:Landroid/graphics/Bitmap;

.field private J:Landroid/widget/RelativeLayout;

.field private K:Lcom/roidapp/photogrid/a/d;

.field private L:Z

.field private M:Lcom/roidapp/photogrid/f;

.field private N:Landroid/widget/ImageView;

.field private O:Landroid/widget/ImageView;

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Lcom/roidapp/photogrid/cloud/b/a;

.field private U:Landroid/content/Intent;

.field private V:Lcom/roidapp/photogrid/common/al;

.field private W:Z

.field private X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

.field private Y:Landroid/view/View;

.field private Z:Lcom/roidapp/cloudlib/sns/main/e;

.field a:Z

.field private aA:Lcom/roidapp/cloudlib/sns/main/b;

.field private aB:Z

.field private aa:I

.field private ab:Landroid/view/View;

.field private ac:Landroid/widget/ImageView;

.field private ad:Landroid/widget/ImageView;

.field private ae:Landroid/widget/ImageView;

.field private af:Landroid/widget/ImageView;

.field private ag:Landroid/view/View;

.field private ah:Landroid/view/View;

.field private ai:Landroid/view/View;

.field private aj:Landroid/view/View;

.field private ak:Lcom/roidapp/baselib/c/ai;

.field private al:Landroid/widget/ImageView;

.field private am:Landroid/view/View;

.field private an:Landroid/widget/FrameLayout;

.field private ao:Z

.field private ap:Z

.field private aq:Lcom/roidapp/cloudlib/sns/i;

.field private ar:Z

.field private as:J

.field private at:Z

.field private au:Z

.field private av:Z

.field private aw:Lcom/roidapp/cloudlib/sns/notification/p;

.field private ax:Landroid/widget/RelativeLayout;

.field private ay:Lcom/roidapp/photogrid/az;

.field private az:Z

.field public b:Ljava/lang/String;

.field protected c:Z

.field protected d:Z

.field protected e:Z

.field f:Landroid/widget/PopupWindow;

.field public final h:Lcom/roidapp/photogrid/common/w;

.field final i:Landroid/os/Handler;

.field private j:Ljava/lang/String;

.field private k:Ljava/util/concurrent/ExecutorService;

.field private l:J

.field private m:Lcom/roidapp/photogrid/ba;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Ljava/lang/String;

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 180
    sput-boolean v0, Lcom/roidapp/photogrid/MainPage;->s:Z

    .line 239
    sput v0, Lcom/roidapp/photogrid/MainPage;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 174
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    .line 175
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->n:Z

    .line 176
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->o:Z

    .line 177
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->p:Z

    .line 178
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->q:Z

    .line 185
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    .line 186
    sget v0, Lcom/roidapp/videolib/f;->c:I

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    .line 201
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->E:Z

    .line 202
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->F:Z

    .line 203
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 214
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->c:Z

    .line 215
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->d:Z

    .line 216
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->e:Z

    .line 217
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 223
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->P:Z

    .line 224
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->Q:Z

    .line 225
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->R:Z

    .line 226
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->S:Z

    .line 272
    new-instance v0, Lcom/roidapp/photogrid/common/w;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/w;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    .line 274
    new-instance v0, Lcom/roidapp/photogrid/v;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/v;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    .line 3302
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->aB:Z

    return-void
.end method

.method static synthetic A(Lcom/roidapp/photogrid/MainPage;)V
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->b(Z)V

    return-void
.end method

.method static synthetic B(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->C:Landroid/view/View;

    return-object v0
.end method

.method static synthetic C(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic D(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/cloudlib/sns/main/b;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    return-object v0
.end method

.method static synthetic E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->m:Lcom/roidapp/photogrid/ba;

    return-object v0
.end method

.method static synthetic F(Lcom/roidapp/photogrid/MainPage;)V
    .locals 2

    .prologue
    .line 164
    .line 18406
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    if-nez v0, :cond_0

    .line 18409
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 18410
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 18411
    const-class v1, Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 18412
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 18413
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    .line 164
    :cond_0
    return-void
.end method

.method static synthetic G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->A:Landroid/widget/ImageView;

    return-object v0
.end method

.method private G()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 573
    const-string v0, "OpenPG"

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 574
    const-string v0, "MainPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;)V

    .line 585
    invoke-static {}, Lcom/roidapp/photogrid/release/a/c;->a()Lcom/roidapp/photogrid/release/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/a/c;->b()V

    .line 588
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/MainPage;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 589
    const-string v1, "Main_Version"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 590
    iput-boolean v3, p0, Lcom/roidapp/photogrid/MainPage;->o:Z

    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->i:Z

    .line 596
    :goto_0
    const-string v1, "Main_Version"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 8938
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v2

    .line 596
    if-eq v1, v2, :cond_6

    .line 597
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Main_Version"

    .line 9938
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v2

    .line 597
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 598
    iput-boolean v4, p0, Lcom/roidapp/photogrid/MainPage;->n:Z

    .line 607
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->n:Z

    if-eqz v0, :cond_0

    .line 608
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 609
    const-string v1, "isRunning"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 610
    iget-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->o:Z

    if-nez v1, :cond_7

    .line 611
    const-string v1, "NEW_USER"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 636
    :goto_2
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 640
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/cloudlib/ads/q;->b()Lcom/roidapp/cloudlib/ads/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/a/a;->a(Lcom/roidapp/cloudlib/a/b;)V

    .line 641
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/a/a;->a()Z

    .line 642
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/w;->b()Z

    .line 646
    new-instance v0, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v0}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/cloud/aj;->a(Landroid/content/Context;)Z

    .line 9951
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/MainPage;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 9952
    const-string v1, "current_process_id"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 9954
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 9959
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-nez v0, :cond_1

    .line 9962
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->k:Ljava/util/concurrent/ExecutorService;

    .line 9964
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 9966
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->k:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/roidapp/photogrid/al;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/al;-><init>(Lcom/roidapp/photogrid/MainPage;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 654
    :cond_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "other"

    const-string v2, "enableCrittercism50"

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 655
    invoke-static {}, Lcom/roidapp/photogrid/common/ak;->a()V

    .line 660
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 671
    const-string v0, "MainPage_View"

    const-string v1, "OpenPG"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 676
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/a;->c(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    .line 678
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cmid/a;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/cmid/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cmid/a;->a()V

    .line 679
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/cmid/LoginService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->U:Landroid/content/Intent;

    .line 680
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->U:Landroid/content/Intent;

    const-string v1, "ACTION_FRESH_GOOGLE_TOKEN"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 681
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->U:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 10340
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->c:Z

    .line 684
    if-nez v0, :cond_3

    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 685
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/roidapp/photogrid/aw;

    invoke-direct {v1, v3}, Lcom/roidapp/photogrid/aw;-><init>(B)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 689
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/push/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 690
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 691
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    .line 692
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 694
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 702
    :cond_4
    :goto_3
    return-void

    .line 592
    :cond_5
    iput-boolean v4, p0, Lcom/roidapp/photogrid/MainPage;->o:Z

    sput-boolean v4, Lcom/roidapp/photogrid/common/az;->i:Z

    .line 593
    iput-boolean v4, p0, Lcom/roidapp/photogrid/MainPage;->q:Z

    iput-boolean v4, p0, Lcom/roidapp/photogrid/MainPage;->p:Z

    goto/16 :goto_0

    .line 600
    :cond_6
    iput-boolean v3, p0, Lcom/roidapp/photogrid/MainPage;->n:Z

    goto/16 :goto_1

    .line 617
    :cond_7
    const-string v1, "NEW_USER"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 618
    const-string v1, "SHOW_NEW_GRID"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 620
    const-string v1, "SHOW_NEW_FREE_2"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 623
    const-string v1, "video_new_preview"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 630
    const-string v1, "NEW_USER_SELECTOR"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 632
    const-string v1, "NEW_USER/MainPage"

    invoke-static {v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 697
    :cond_8
    if-eqz v0, :cond_4

    .line 699
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/push/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3
.end method

.method private H()V
    .locals 3

    .prologue
    .line 1432
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1433
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 1434
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1435
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 1437
    :try_start_0
    invoke-virtual {v1}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v2, 0x7f03013b

    invoke-virtual {v0, v2}, Landroid/view/Window;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1444
    const v0, 0x7f0d04f0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1445
    new-instance v2, Lcom/roidapp/photogrid/w;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/w;-><init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1454
    const v0, 0x7f0d04f1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1455
    new-instance v2, Lcom/roidapp/photogrid/x;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/x;-><init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1466
    const v0, 0x7f0d04f2

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1467
    new-instance v2, Lcom/roidapp/photogrid/y;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/y;-><init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1474
    :goto_0
    return-void

    .line 1439
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 1440
    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0
.end method

.method static synthetic H(Lcom/roidapp/photogrid/MainPage;)V
    .locals 4

    .prologue
    .line 18729
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 18730
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 18731
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 18732
    new-instance v0, Lcom/roidapp/photogrid/aj;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/aj;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 18739
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 18741
    :try_start_0
    invoke-virtual {v1}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v2, 0x7f03010a

    invoke-virtual {v0, v2}, Landroid/view/Window;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18748
    const v0, 0x7f0d041d

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 18749
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070351

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18750
    const v0, 0x7f0d041e

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 18752
    new-instance v2, Lcom/roidapp/photogrid/ak;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/ak;-><init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18745
    :goto_0
    return-void

    .line 18743
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 18744
    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0
.end method

.method static synthetic I(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    return-object v0
.end method

.method private I()V
    .locals 4

    .prologue
    .line 1478
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1479
    const v1, 0x7f07030f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 1480
    const v1, 0x7f070316

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070049

    new-instance v3, Lcom/roidapp/photogrid/aa;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/aa;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070261

    new-instance v3, Lcom/roidapp/photogrid/z;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/z;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1501
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1502
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1503
    return-void
.end method

.method static synthetic J(Lcom/roidapp/photogrid/MainPage;)Landroid/view/View;
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    return-object v0
.end method

.method private J()V
    .locals 4

    .prologue
    .line 1673
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    if-eqz v0, :cond_0

    .line 1674
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ay:Lcom/roidapp/photogrid/az;

    if-nez v0, :cond_0

    .line 1675
    new-instance v0, Lcom/roidapp/photogrid/az;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/az;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ay:Lcom/roidapp/photogrid/az;

    .line 1676
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->ay:Lcom/roidapp/photogrid/az;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1679
    :cond_0
    return-void
.end method

.method private K()V
    .locals 7

    .prologue
    const v6, 0x7f0204da

    const/16 v5, 0xff

    const/4 v4, 0x0

    const/16 v3, 0x66

    const/4 v2, 0x4

    .line 1806
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    packed-switch v0, :pswitch_data_0

    .line 1852
    :goto_0
    return-void

    .line 1808
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ac:Landroid/widget/ImageView;

    const v1, 0x7f0204db

    invoke-direct {p0, v0, v1, v5}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1809
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ad:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v6, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1810
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ae:Landroid/widget/ImageView;

    const v1, 0x7f0204de

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1811
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->af:Landroid/widget/ImageView;

    const v1, 0x7f0204dd

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1812
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ag:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1814
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ah:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1815
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ai:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1816
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aj:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 1819
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ad:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v6, v5}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1820
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ac:Landroid/widget/ImageView;

    const v1, 0x7f0204db

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1821
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ae:Landroid/widget/ImageView;

    const v1, 0x7f0204de

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1822
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->af:Landroid/widget/ImageView;

    const v1, 0x7f0204dd

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1823
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ah:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1825
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ag:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1826
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ai:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1827
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aj:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 1830
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ae:Landroid/widget/ImageView;

    const v1, 0x7f0204de

    invoke-direct {p0, v0, v1, v5}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1831
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ac:Landroid/widget/ImageView;

    const v1, 0x7f0204db

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1832
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ad:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v6, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1833
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->af:Landroid/widget/ImageView;

    const v1, 0x7f0204dd

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1834
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ai:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1836
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ag:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1837
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ah:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1838
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aj:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 1841
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->af:Landroid/widget/ImageView;

    const v1, 0x7f0204dd

    invoke-direct {p0, v0, v1, v5}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1842
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ac:Landroid/widget/ImageView;

    const v1, 0x7f0204db

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1843
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ad:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v6, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1844
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ae:Landroid/widget/ImageView;

    const v1, 0x7f0204de

    invoke-direct {p0, v0, v1, v3}, Lcom/roidapp/photogrid/MainPage;->a(Landroid/widget/ImageView;II)V

    .line 1845
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aj:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1847
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ag:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1848
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ah:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1849
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ai:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 1806
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic K(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->M()V

    return-void
.end method

.method private L()V
    .locals 8

    .prologue
    const/high16 v7, 0x44800000    # 1024.0f

    const/high16 v6, 0x42c80000    # 100.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1954
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/baselib/d/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->b(Ljava/io/File;)J

    move-result-wide v4

    .line 11347
    long-to-float v0, v4

    div-float/2addr v0, v7

    div-float/2addr v0, v7

    .line 11348
    mul-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v6

    .line 1954
    const/high16 v3, 0x41700000    # 15.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_5

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->E:Z

    .line 1955
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->F:Z

    .line 11620
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->aa:I

    .line 11621
    const v0, 0x7f0d0393

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    .line 11622
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    const v3, 0x7f0d0398

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ac:Landroid/widget/ImageView;

    .line 11623
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    const v3, 0x7f0d039a

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ad:Landroid/widget/ImageView;

    .line 11624
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    const v3, 0x7f0d039d

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ae:Landroid/widget/ImageView;

    .line 11625
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    const v3, 0x7f0d039f

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->af:Landroid/widget/ImageView;

    .line 11626
    const v0, 0x7f0d0399

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ag:Landroid/view/View;

    .line 11627
    const v0, 0x7f0d039b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ah:Landroid/view/View;

    .line 11628
    const v0, 0x7f0d039e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ai:Landroid/view/View;

    .line 11629
    const v0, 0x7f0d03a0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aj:Landroid/view/View;

    .line 11630
    const v0, 0x7f0d0395

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    .line 12135
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 12136
    const-string v3, "notification_is_click"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 11632
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    const/4 v4, 0x5

    new-array v4, v4, [Landroid/view/View;

    iget-object v5, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    aput-object v5, v4, v2

    iget-object v5, p0, Lcom/roidapp/photogrid/MainPage;->ag:Landroid/view/View;

    aput-object v5, v4, v1

    const/4 v5, 0x2

    iget-object v6, p0, Lcom/roidapp/photogrid/MainPage;->ah:Landroid/view/View;

    aput-object v6, v4, v5

    const/4 v5, 0x3

    iget-object v6, p0, Lcom/roidapp/photogrid/MainPage;->ai:Landroid/view/View;

    aput-object v6, v4, v5

    const/4 v5, 0x4

    iget-object v6, p0, Lcom/roidapp/photogrid/MainPage;->aj:Landroid/view/View;

    aput-object v6, v4, v5

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/common/w;->b([Landroid/view/View;)V

    .line 11636
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ac:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11637
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ad:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11638
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ae:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11639
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->af:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11640
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11642
    const v0, 0x7f0d0394

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    .line 11643
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11644
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 11646
    const v0, 0x7f0d0392

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    .line 11647
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 11649
    if-nez v3, :cond_0

    .line 11650
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12682
    :cond_0
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->s:Z

    if-eqz v0, :cond_1

    .line 12683
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->N()V

    .line 12685
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12686
    new-instance v3, Lcom/roidapp/photogrid/k;

    invoke-direct {v3}, Lcom/roidapp/photogrid/k;-><init>()V

    .line 12688
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12689
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v3

    .line 12690
    if-eqz v3, :cond_6

    .line 12691
    new-instance v3, Lcom/roidapp/cloudlib/sns/d/a;

    invoke-direct {v3}, Lcom/roidapp/cloudlib/sns/d/a;-><init>()V

    .line 12692
    iget-boolean v4, p0, Lcom/roidapp/photogrid/MainPage;->S:Z

    if-eqz v4, :cond_2

    .line 12693
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 12694
    const-string v5, "FromShare"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 12695
    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/d/a;->setArguments(Landroid/os/Bundle;)V

    .line 12698
    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12699
    new-instance v3, Lcom/roidapp/cloudlib/b/a;

    invoke-direct {v3}, Lcom/roidapp/cloudlib/b/a;-><init>()V

    .line 12701
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12702
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 12703
    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v6, v3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v4, v5, v6, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v3

    .line 12705
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12715
    :goto_1
    new-instance v3, Lcom/roidapp/cloudlib/sns/main/e;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lcom/roidapp/cloudlib/sns/main/e;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V

    iput-object v3, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    .line 12716
    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    iget-object v4, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 12717
    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    sget v4, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->setCurrentItem(I)V

    .line 12718
    sget v3, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    .line 12719
    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 12720
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->K()V

    .line 11661
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->J()V

    .line 13115
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->V:Lcom/roidapp/photogrid/common/al;

    if-nez v0, :cond_3

    .line 13116
    const v0, 0x7f0d0396

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 13117
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 13118
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    invoke-direct {v0, p0, v3}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->V:Lcom/roidapp/photogrid/common/al;

    .line 13119
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->V:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 13120
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    .line 1967
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;)V

    .line 1969
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "snsPush"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1971
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "snsPush"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 1973
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "snsPid"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->e(I)V

    .line 1975
    :cond_4
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->az:Z

    .line 2005
    return-void

    :cond_5
    move v0, v2

    .line 1954
    goto/16 :goto_0

    .line 12708
    :cond_6
    new-instance v3, Lcom/roidapp/cloudlib/sns/d/f;

    invoke-direct {v3}, Lcom/roidapp/cloudlib/sns/d/f;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12710
    new-instance v3, Lcom/roidapp/cloudlib/b/a;

    invoke-direct {v3}, Lcom/roidapp/cloudlib/b/a;-><init>()V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12711
    const-string v3, "Myprofile_Login_Page"

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/login/j;->a(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/login/j;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1
.end method

.method static synthetic L(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->I()V

    return-void
.end method

.method private M()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2592
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "video"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 2593
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2594
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2611
    :goto_0
    return-void

    .line 2597
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2598
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2599
    const-string v0, "MainPage"

    const-string v1, "MainPage/Video"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2601
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_video"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2602
    const-string v0, "MainPage/Video"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2603
    const/4 v0, 0x6

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2604
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 2605
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aj()V

    .line 2606
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 2607
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2608
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2609
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2610
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method static synthetic M(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->H()V

    return-void
.end method

.method private N()V
    .locals 7

    .prologue
    const v6, 0x7f0d0394

    const/4 v5, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    .line 3163
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->M:Lcom/roidapp/photogrid/f;

    if-eqz v0, :cond_0

    .line 3188
    :goto_0
    return-void

    .line 3167
    :cond_0
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->s:Z

    .line 3168
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    const v1, 0x7f0204d0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3170
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 3171
    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 3172
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 3173
    if-eqz v1, :cond_1

    .line 3174
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 3176
    :cond_1
    new-instance v1, Lcom/roidapp/photogrid/f;

    invoke-direct {v1}, Lcom/roidapp/photogrid/f;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/MainPage;->M:Lcom/roidapp/photogrid/f;

    .line 3177
    const/high16 v1, 0x7f040000

    const v2, 0x7f040001

    invoke-virtual {v0, v1, v2, v5, v5}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->M:Lcom/roidapp/photogrid/f;

    const-string v2, "fast_tools"

    invoke-virtual {v0, v6, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 3180
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    const/high16 v1, -0x60000000

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3182
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/high16 v1, 0x42340000    # 45.0f

    const/high16 v2, 0x43340000    # 180.0f

    move v5, v3

    move v6, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 3183
    const-wide/16 v4, 0x64

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 3184
    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 3185
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3186
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->M:Lcom/roidapp/photogrid/f;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/f;->g()V

    .line 3187
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0
.end method

.method static synthetic N(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    return v0
.end method

.method private O()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 3287
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    if-eqz v0, :cond_0

    .line 3288
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/c/ai;->a(Landroid/support/v4/app/Fragment;)[I

    move-result-object v0

    .line 3289
    aget v1, v0, v3

    if-eq v1, v2, :cond_0

    aget v1, v0, v4

    if-eq v1, v2, :cond_0

    .line 3290
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    aget v2, v0, v3

    aget v0, v0, v4

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/baselib/c/ai;->a(II)V

    .line 3293
    :cond_0
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3294
    new-instance v0, Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/notification/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    .line 3298
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->x()V

    .line 3299
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    sget v1, Lcom/roidapp/photogrid/common/az;->r:I

    iget-object v2, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/main/b;->b(ILcom/roidapp/cloudlib/sns/main/b;)V

    .line 3300
    return-void

    .line 3296
    :cond_1
    const-string v0, "Notification_Login_Page"

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/login/j;->a(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/login/j;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    goto :goto_0
.end method

.method static synthetic O(Lcom/roidapp/photogrid/MainPage;)V
    .locals 3

    .prologue
    .line 19942
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 19943
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 19944
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "current_process_id"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 164
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/MainPage;Lcom/roidapp/cloudlib/sns/notification/p;)Lcom/roidapp/cloudlib/sns/notification/p;
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/roidapp/photogrid/MainPage;->aw:Lcom/roidapp/cloudlib/sns/notification/p;

    return-object p1
.end method

.method private declared-synchronized a(IZ)V
    .locals 2

    .prologue
    .line 1729
    monitor-enter p0

    if-eqz p2, :cond_0

    :try_start_0
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_0

    .line 1753
    :goto_0
    monitor-exit p0

    return-void

    .line 1732
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    if-eqz v0, :cond_1

    .line 1733
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/i;->b()V

    .line 1736
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    if-eqz v0, :cond_2

    .line 1737
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->setCurrentItem(IZ)V

    .line 10473
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ap:Z

    .line 1739
    if-eqz v0, :cond_3

    .line 1740
    if-lez p1, :cond_4

    .line 1741
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/login/j;

    if-eqz v0, :cond_3

    .line 1742
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->i()V

    .line 1751
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->K()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1729
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1745
    :cond_4
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/k;

    if-eqz v0, :cond_3

    .line 1746
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ax:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method private a(Landroid/widget/ImageView;II)V
    .locals 1

    .prologue
    .line 1799
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1800
    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1801
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1802
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->G()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/MainPage;J)V
    .locals 1

    .prologue
    .line 164
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/MainPage;->c(J)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/MainPage;Z)V
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 164
    .line 17081
    invoke-virtual {p0, v8}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 17082
    invoke-virtual {p0, v7}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v2

    .line 17083
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    .line 17084
    invoke-virtual {p0, v9}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v1

    .line 17085
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 17089
    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/login/j;

    if-eqz v0, :cond_0

    .line 17090
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    new-array v4, v7, [Lcom/roidapp/cloudlib/sns/main/d;

    new-instance v5, Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-direct {v5}, Lcom/roidapp/cloudlib/sns/notification/b;-><init>()V

    invoke-virtual {v2, v8, v5}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    .line 17095
    :cond_0
    instance-of v0, v2, Lcom/roidapp/cloudlib/sns/login/j;

    if-eqz v0, :cond_4

    .line 17096
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    invoke-virtual {v0, v7}, Lcom/roidapp/baselib/c/ai;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 17097
    if-eqz v0, :cond_1

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/d/f;

    if-eqz v0, :cond_1

    .line 17098
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    new-instance v4, Lcom/roidapp/cloudlib/sns/d/a;

    invoke-direct {v4}, Lcom/roidapp/cloudlib/sns/d/a;-><init>()V

    invoke-virtual {v0, v7, v4}, Lcom/roidapp/baselib/c/ai;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;

    .line 17100
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    new-array v4, v7, [Lcom/roidapp/cloudlib/sns/main/d;

    new-instance v5, Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-direct {v5}, Lcom/roidapp/cloudlib/sns/notification/b;-><init>()V

    invoke-virtual {v2, v7, v5}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v2

    aput-object v2, v4, v8

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    .line 17120
    :goto_0
    instance-of v0, v1, Lcom/roidapp/cloudlib/sns/login/j;

    if-eqz v0, :cond_6

    move-object v0, v1

    .line 17121
    check-cast v0, Lcom/roidapp/cloudlib/sns/login/j;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/j;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 17122
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    invoke-virtual {v0, v9}, Lcom/roidapp/baselib/c/ai;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 17123
    if-eqz v0, :cond_2

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/login/j;

    if-eqz v0, :cond_2

    .line 17124
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v2, v3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v4, v5, v2, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v2

    invoke-virtual {v0, v9, v2}, Lcom/roidapp/baselib/c/ai;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;

    .line 17126
    :cond_2
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    new-array v2, v7, [Lcom/roidapp/cloudlib/sns/main/d;

    new-instance v3, Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-direct {v3}, Lcom/roidapp/cloudlib/sns/notification/b;-><init>()V

    invoke-virtual {v1, v9, v3}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v1

    aput-object v1, v2, v8

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    .line 17153
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    if-eqz v0, :cond_7

    .line 17154
    iput-boolean v8, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    .line 17157
    new-instance v0, Lcom/roidapp/cloudlib/sns/g;

    new-instance v1, Lcom/roidapp/photogrid/ap;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/ap;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/g;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/g;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void

    .line 17104
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    new-array v4, v7, [Lcom/roidapp/cloudlib/sns/main/d;

    new-instance v5, Lcom/roidapp/cloudlib/sns/d/a;

    invoke-direct {v5}, Lcom/roidapp/cloudlib/sns/d/a;-><init>()V

    invoke-virtual {v2, v7, v5}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v2

    aput-object v2, v4, v8

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    goto :goto_0

    .line 17130
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    new-array v2, v7, [Lcom/roidapp/cloudlib/sns/main/d;

    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v6, v3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v4, v5, v6, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v3

    invoke-virtual {v1, v9, v3}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v1

    aput-object v1, v2, v8

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    goto :goto_1

    .line 17135
    :cond_6
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    new-array v2, v7, [Lcom/roidapp/cloudlib/sns/main/d;

    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v6, v3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v4, v5, v6, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v3

    invoke-virtual {v1, v9, v3}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v1

    aput-object v1, v2, v8

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    goto :goto_1

    .line 17199
    :cond_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->j()V

    .line 17200
    if-eqz p1, :cond_3

    .line 17202
    new-instance v0, Lcom/roidapp/cloudlib/sns/h/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/h/a;-><init>()V

    .line 17203
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/a;->a()V

    .line 17204
    new-instance v1, Lcom/roidapp/photogrid/aq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/aq;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/h/a;->a(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 17211
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-class v2, Lcom/roidapp/cloudlib/sns/h/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    move-result v0

    .line 17214
    if-nez v0, :cond_3

    .line 17215
    invoke-static {v7, p0}, Lcom/roidapp/photogrid/social/c;->a(ZLandroid/app/Activity;)V

    goto :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/MainPage;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 164
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/MainPage;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b(I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v6, 0x0

    const/4 v5, -0x1

    const v4, 0x7f02044e

    const/4 v2, 0x0

    .line 850
    if-gtz p1, :cond_1

    .line 898
    :cond_0
    :goto_0
    return-object v2

    .line 853
    :cond_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 854
    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 855
    iput-boolean v6, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 856
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, v4, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 858
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-eq v1, v5, :cond_0

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-eq v1, v5, :cond_0

    .line 861
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 863
    int-to-float v1, v1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v1, v4

    int-to-float v4, p1

    div-float/2addr v1, v4

    float-to-int v1, v1

    .line 864
    if-gtz v1, :cond_4

    .line 867
    :goto_1
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 868
    iput-boolean v6, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 869
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 871
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f02044e

    invoke-static {v1, v4, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 880
    :goto_2
    if-nez v1, :cond_3

    .line 884
    :try_start_1
    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->c(I)I

    move-result v1

    .line 885
    if-gt v1, v0, :cond_2

    .line 886
    mul-int/lit8 v0, v1, 0x2

    .line 888
    :goto_3
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 889
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02044e

    invoke-static {v0, v1, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    :goto_4
    move-object v2, v0

    .line 898
    goto :goto_0

    .line 872
    :catch_0
    move-exception v1

    .line 874
    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v1, v2

    .line 878
    goto :goto_2

    .line 875
    :catch_1
    move-exception v1

    .line 877
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v2

    goto :goto_2

    .line 890
    :catch_2
    move-exception v0

    .line 892
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v2

    .line 896
    goto :goto_4

    .line 893
    :catch_3
    move-exception v0

    .line 895
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v2

    goto :goto_4

    :cond_2
    move v0, v1

    goto :goto_3

    :cond_3
    move-object v0, v1

    goto :goto_4

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->L()V

    return-void
.end method

.method static synthetic b(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 164
    .line 18992
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18993
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18996
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 19000
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    .line 19001
    if-eqz v1, :cond_1

    .line 19003
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 19004
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v4, v1, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19005
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 19006
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 19003
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 164
    :cond_1
    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 2130
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2131
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "notification_is_click"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2132
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/MainPage;Z)Z
    .locals 0

    .prologue
    .line 164
    iput-boolean p1, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    return p1
.end method

.method private static c(I)I
    .locals 1

    .prologue
    .line 902
    const/16 v0, 0x8

    if-gt p0, v0, :cond_0

    .line 903
    const/4 v0, 0x1

    .line 904
    :goto_0
    if-ge v0, p0, :cond_1

    .line 905
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 908
    :cond_0
    add-int/lit8 v0, p0, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    .line 911
    :cond_1
    return v0
.end method

.method private c(J)V
    .locals 3

    .prologue
    .line 2125
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2126
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "notification_fresh_time"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2127
    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ar:Z

    return v0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 2922
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/photogrid/release/ap;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/Content"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2923
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2924
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 2933
    :cond_0
    :goto_0
    return v0

    .line 2928
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2929
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 14394
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 14395
    const v2, 0x7f070186

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 14396
    const v2, 0x7f070185

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 14397
    const v2, 0x7f070184

    new-instance v3, Lcom/roidapp/photogrid/au;

    invoke-direct {v3, p0, v1}, Lcom/roidapp/photogrid/au;-><init>(Lcom/roidapp/photogrid/MainPage;Ljava/io/File;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 14413
    const v2, 0x7f070049

    new-instance v3, Lcom/roidapp/photogrid/av;

    invoke-direct {v3, p0, v1}, Lcom/roidapp/photogrid/av;-><init>(Lcom/roidapp/photogrid/MainPage;Ljava/io/File;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 14422
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 14423
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 14424
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2931
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 14426
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_1
.end method

.method private c(Z)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 3057
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->at:Z

    if-nez v2, :cond_0

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v2

    const-string v3, "event"

    const-string v4, "quickpic2015_3"

    invoke-virtual {v2, v3, v4, v0}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    if-nez p1, :cond_1

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "QPicShow"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_2

    .line 3064
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "QPicShow"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 3066
    new-instance v2, Lcom/roidapp/photogrid/ax;

    invoke-direct {v2}, Lcom/roidapp/photogrid/ax;-><init>()V

    .line 3068
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    const-string v4, "QPicLogin"

    invoke-static {v3, v2, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 3069
    if-eqz p1, :cond_2

    .line 3070
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->av:Z

    .line 3076
    :cond_2
    :goto_0
    return v0

    :cond_3
    move v0, v1

    .line 3073
    goto :goto_0
.end method

.method private declared-synchronized d(I)V
    .locals 1

    .prologue
    .line 1724
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/MainPage;->a(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1725
    monitor-exit p0

    return-void

    .line 1724
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x7

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3348
    iget-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->p:Z

    if-eqz v2, :cond_1

    .line 3349
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->p:Z

    .line 3350
    iput-object p1, p0, Lcom/roidapp/photogrid/MainPage;->r:Ljava/lang/String;

    .line 3364
    :cond_0
    :goto_0
    return-void

    .line 3352
    :cond_1
    iget-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->q:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/MainPage;->r:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 3354
    new-array v3, v5, [Ljava/lang/String;

    const-string v2, "grid"

    aput-object v2, v3, v1

    const-string v2, "single"

    aput-object v2, v3, v0

    const/4 v2, 0x2

    const-string v4, "video"

    aput-object v4, v3, v2

    const/4 v2, 0x3

    const-string v4, "free"

    aput-object v4, v3, v2

    const/4 v2, 0x4

    const-string v4, "hw"

    aput-object v4, v3, v2

    const/4 v2, 0x5

    const-string v4, "template"

    aput-object v4, v3, v2

    const/4 v2, 0x6

    const-string v4, "back"

    aput-object v4, v3, v2

    move v2, v1

    :goto_1
    if-ge v2, v5, :cond_3

    aget-object v4, v3, v2

    .line 3355
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 3360
    :goto_2
    if-eqz v0, :cond_0

    .line 3361
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->q:Z

    goto :goto_0

    .line 3354
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method static synthetic d(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ar:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/MainPage;)J
    .locals 2

    .prologue
    .line 164
    iget-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->as:J

    return-wide v0
.end method

.method private e(I)V
    .locals 2

    .prologue
    .line 2091
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2092
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->O()V

    .line 2093
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2094
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2097
    :cond_0
    if-eqz p1, :cond_1

    .line 2098
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/notification/b;

    if-eqz v0, :cond_1

    .line 2099
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aA:Lcom/roidapp/cloudlib/sns/main/b;

    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/b;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/cloudlib/sns/notification/b;->a(IZ)V

    .line 2103
    :cond_1
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/MainPage;)J
    .locals 2

    .prologue
    .line 164
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->as:J

    return-wide v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->V:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/MainPage;)V
    .locals 1

    .prologue
    .line 164
    .line 16029
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->c(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16032
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->T:Lcom/roidapp/photogrid/cloud/b/a;

    if-nez v0, :cond_0

    .line 16033
    new-instance v0, Lcom/roidapp/photogrid/cloud/b/a;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/b/a;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->T:Lcom/roidapp/photogrid/cloud/b/a;

    .line 16034
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->T:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/b/a;->b()Z

    .line 164
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->N:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->O:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->I:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/MainPage;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->I:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->J()V

    return-void
.end method

.method static synthetic q(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->n:Z

    return v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/MainPage;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 16121
    .line 16123
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v3, "update"

    const-string v4, "force_update"

    invoke-virtual {v0, v3, v4, v2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16126
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v3, "update"

    const-string v4, "update_package"

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16127
    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 16128
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v3

    const-string v4, "update"

    const-string v5, "update_url"

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 16130
    if-nez v0, :cond_1

    if-eqz v3, :cond_1

    .line 16133
    new-instance v0, Lcom/roidapp/photogrid/release/bo;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/bo;-><init>()V

    invoke-virtual {v0, p0, v3}, Lcom/roidapp/photogrid/release/bo;->a(Landroid/app/Activity;Ljava/lang/String;)V

    move v0, v1

    .line 16138
    :goto_0
    if-nez v0, :cond_0

    .line 16506
    invoke-static {p0}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v0

    .line 16507
    invoke-static {p0}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 16509
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    const-string v5, "version3"

    const-string v6, "version_code"

    invoke-virtual {v4, v5, v6, v2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    .line 16510
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    const-string v5, "version3"

    const-string v6, "version_name"

    invoke-virtual {v4, v5, v6}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 16512
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "_show_update_tips"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 16513
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6, v5, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 16515
    if-eqz v1, :cond_0

    if-ge v0, v2, :cond_0

    if-eqz v3, :cond_0

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16516
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v0

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/bq;->a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->b()V

    .line 164
    :cond_0
    return-void

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method static synthetic s(Lcom/roidapp/photogrid/MainPage;)V
    .locals 2

    .prologue
    .line 164
    .line 16979
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->k:Ljava/util/concurrent/ExecutorService;

    .line 16980
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->k:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/photogrid/am;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/am;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 164
    return-void
.end method

.method static synthetic t(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    return v0
.end method

.method static synthetic u(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->c(Z)Z

    move-result v0

    return v0
.end method

.method static synthetic v(Lcom/roidapp/photogrid/MainPage;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->av:Z

    return v0
.end method

.method static synthetic w(Lcom/roidapp/photogrid/MainPage;)V
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    return-void
.end method

.method static synthetic x(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/a/d;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->K:Lcom/roidapp/photogrid/a/d;

    return-object v0
.end method

.method static synthetic y(Lcom/roidapp/photogrid/MainPage;)V
    .locals 4

    .prologue
    .line 164
    .line 17883
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17884
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 17885
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 17886
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v1, Lcom/roidapp/photogrid/ab;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/ab;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-static {v0, v2, v3, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 17930
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 17932
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 164
    :cond_0
    return-void
.end method

.method static synthetic z(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/cloudlib/sns/notification/p;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aw:Lcom/roidapp/cloudlib/sns/notification/p;

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 3440
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    return-object v0
.end method

.method public final a(I)Lcom/roidapp/cloudlib/sns/main/b;
    .locals 1

    .prologue
    .line 3431
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(ILcom/roidapp/cloudlib/sns/main/b;)V
    .locals 1

    .prologue
    .line 1763
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_0

    .line 1764
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/cloudlib/sns/main/e;->a(ILcom/roidapp/cloudlib/sns/main/b;)V

    .line 1766
    :cond_0
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 3486
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/MainPage;->c(J)V

    .line 3487
    return-void
.end method

.method public final a(Landroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 3368
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    if-eqz v0, :cond_0

    .line 3369
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/baselib/c/ai;->b(ILandroid/support/v4/app/Fragment;)V

    .line 3371
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1856
    if-eqz p1, :cond_1

    .line 1857
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 1858
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1866
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->l_()V

    .line 1868
    return-void

    .line 1861
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->am:Landroid/view/View;

    if-eq v0, v1, :cond_0

    .line 1862
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 1863
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->am:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 3305
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->aB:Z

    if-eqz v0, :cond_1

    .line 3337
    :cond_0
    :goto_0
    return-void

    .line 3308
    :cond_1
    if-nez p1, :cond_2

    .line 3309
    const v0, 0x7f0d02b6

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object p1, v0

    .line 3310
    :cond_2
    if-nez p2, :cond_4

    .line 3311
    const v0, 0x7f0d02bb

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3313
    :goto_1
    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 3317
    const v1, 0x7f0d02b7

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 3318
    const v2, 0x7f0d02b9

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 3319
    const v3, 0x7f0d02bc

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 3320
    const v4, 0x7f0d02be

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 3322
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    .line 3326
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 3327
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 3329
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3330
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3331
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3332
    invoke-virtual {v0, v2, v7, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 15155
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 15156
    const v4, 0x7f0d0394

    invoke-virtual {v0, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 15157
    if-eqz v0, :cond_3

    instance-of v4, v0, Lcom/roidapp/photogrid/f;

    if-eqz v4, :cond_3

    .line 15158
    check-cast v0, Lcom/roidapp/photogrid/f;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/f;->f()V

    .line 3335
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    const/4 v4, 0x4

    new-array v4, v4, [Landroid/view/View;

    aput-object v1, v4, v7

    aput-object v2, v4, v8

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    const/4 v2, 0x0

    aput-object v2, v4, v1

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/common/w;->a([Landroid/view/View;)V

    .line 3336
    iput-boolean v8, p0, Lcom/roidapp/photogrid/MainPage;->aB:Z

    goto :goto_0

    :cond_4
    move-object v0, p2

    goto :goto_1
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 371
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->e:Lcom/roidapp/cloudlib/sns/g/e;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/g/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 373
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 374
    invoke-virtual {v0, v7}, Lcom/roidapp/cloudlib/sns/main/b;->b(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v1

    .line 375
    invoke-virtual {v0, v8}, Lcom/roidapp/cloudlib/sns/main/b;->b(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v2

    .line 376
    invoke-virtual {v0, v9}, Lcom/roidapp/cloudlib/sns/main/b;->b(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v3

    .line 378
    new-array v4, v9, [Lcom/roidapp/cloudlib/sns/main/d;

    new-instance v5, Lcom/roidapp/cloudlib/sns/d/f;

    invoke-direct {v5}, Lcom/roidapp/cloudlib/sns/d/f;-><init>()V

    invoke-virtual {v1, v7, v5, v6}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;Z)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v1

    aput-object v1, v4, v6

    new-instance v1, Lcom/roidapp/cloudlib/b/a;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/b/a;-><init>()V

    invoke-virtual {v2, v8, v1, v6}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;Z)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v1

    aput-object v1, v4, v7

    const-string v1, "Myprofile_Login_Page"

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/login/j;->a(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/login/j;

    move-result-object v1

    invoke-virtual {v3, v9, v1, v6}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;Z)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v1

    aput-object v1, v4, v8

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    .line 4390
    invoke-virtual {p0, v6}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 4391
    :cond_0
    instance-of v1, v0, Lcom/roidapp/photogrid/k;

    if-nez v1, :cond_1

    .line 4392
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    invoke-virtual {v0, v6}, Lcom/roidapp/baselib/c/ai;->b(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 4393
    if-nez v0, :cond_0

    .line 4394
    new-instance v0, Lcom/roidapp/photogrid/k;

    invoke-direct {v0}, Lcom/roidapp/photogrid/k;-><init>()V

    .line 4398
    :cond_1
    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {p0, v6, v0}, Lcom/roidapp/photogrid/MainPage;->a(ILcom/roidapp/cloudlib/sns/main/b;)V

    .line 4756
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_2

    .line 4757
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/e;->notifyDataSetChanged()V

    .line 4400
    :cond_2
    invoke-direct {p0, v6, v6}, Lcom/roidapp/photogrid/MainPage;->a(IZ)V

    .line 4401
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5375
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    if-eqz v0, :cond_3

    .line 5376
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/ai;->a()V

    .line 389
    :cond_3
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 2461
    const-string v0, "single"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2462
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2463
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2482
    :goto_0
    return-void

    .line 2466
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2467
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->H:Z

    .line 2468
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2469
    const-string v0, "MainPage"

    const-string v1, "MainPage/single"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2471
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_single"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2472
    const-string v0, "MainPage/single"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2473
    const/4 v0, 0x5

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2474
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 2475
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-array v1, v2, [Lcom/roidapp/photogrid/release/ig;

    const/4 v2, 0x0

    new-instance v3, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v3, p1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 2476
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 2477
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2479
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2480
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2481
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method protected final a(Z)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 712
    if-eqz p1, :cond_1

    .line 713
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 714
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 715
    new-instance v1, Lcom/roidapp/photogrid/ag;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/ag;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 817
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    if-eqz v1, :cond_0

    .line 818
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 840
    :cond_0
    :goto_0
    return-void

    .line 821
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    .line 822
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 823
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 825
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->N:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 826
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->N:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 828
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->O:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    .line 829
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->O:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 831
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 832
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 834
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->I:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->I:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 835
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->I:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 837
    :cond_6
    iput-object v2, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    .line 838
    iput-object v2, p0, Lcom/roidapp/photogrid/MainPage;->I:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public final b()Landroid/view/View;
    .locals 1

    .prologue
    .line 1872
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final b(J)V
    .locals 7

    .prologue
    const/4 v5, 0x1

    .line 2811
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "template"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 2812
    const-string v0, "template"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2813
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2814
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2839
    :goto_0
    return-void

    .line 2817
    :cond_0
    iput-boolean v5, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2818
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2819
    const-string v0, "MainPage"

    const-string v1, "MainPage/template"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2821
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_template"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2822
    const-string v0, "MainPage/template"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2823
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2824
    const/4 v1, 0x4

    sput v1, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2825
    sput-boolean v5, Lcom/roidapp/photogrid/common/az;->x:Z

    .line 2826
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 2827
    const-string v2, "template_tip"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702e4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2828
    iget-object v2, p0, Lcom/roidapp/photogrid/MainPage;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 2829
    const-string v2, "fromEvent"

    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2831
    :cond_1
    const-class v2, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2832
    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-lez v2, :cond_2

    .line 2833
    const-string v2, "cmlTid"

    invoke-virtual {v1, v2, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 2835
    :cond_2
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2836
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2837
    const-string v1, "template_enter"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2838
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method public final d()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 3450
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Show/Profile"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3451
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Show/Profile"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3452
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->N()V

    .line 3453
    return-void
.end method

.method public final f()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 3416
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 3417
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3418
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 3419
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3421
    :cond_0
    return-void
.end method

.method public final g()Landroid/support/v4/app/Fragment;
    .locals 2

    .prologue
    .line 3382
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    if-eqz v0, :cond_0

    .line 3383
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/c/ai;->b(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 3385
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 3457
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ap:Z

    .line 3458
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ax:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3459
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ax:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3461
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 3465
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ap:Z

    .line 3466
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ax:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 3467
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ax:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3469
    :cond_0
    return-void
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 3473
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ap:Z

    return v0
.end method

.method public final l()Lcom/roidapp/cloudlib/sns/i;
    .locals 2

    .prologue
    .line 3478
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    if-nez v0, :cond_0

    .line 3479
    new-instance v0, Lcom/roidapp/cloudlib/sns/i;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/sns/i;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    .line 3481
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    return-object v0
.end method

.method public final l_()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1877
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getY(Landroid/view/View;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 1878
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    .line 1880
    :cond_0
    return-void
.end method

.method public final m()V
    .locals 2

    .prologue
    .line 3490
    new-instance v0, Lcom/roidapp/photogrid/social/a;

    invoke-direct {v0}, Lcom/roidapp/photogrid/social/a;-><init>()V

    .line 3491
    invoke-virtual {v0}, Lcom/roidapp/photogrid/social/a;->x()V

    .line 3492
    sget v1, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/main/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 3493
    return-void
.end method

.method public final m_()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 3407
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 3408
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ab:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3409
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 3410
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3412
    :cond_0
    return-void
.end method

.method public final n()I
    .locals 1

    .prologue
    .line 1329
    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    return v0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 1333
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v1, -0x1

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 915
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 916
    const/16 v0, 0x33d9

    if-ne p1, v0, :cond_3

    .line 919
    invoke-static {}, Lcom/roidapp/cloudlib/sns/af;->b()I

    move-result v0

    if-ne v0, v4, :cond_0

    .line 920
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->c(Landroid/content/Context;)V

    .line 922
    :cond_0
    if-eq p2, v1, :cond_2

    .line 923
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->j()V

    .line 926
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    if-eqz v0, :cond_1

    .line 927
    iput-boolean v3, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    .line 929
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/MainPage;->c(Z)Z

    .line 1077
    :cond_1
    :goto_0
    return-void

    .line 934
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->i()V

    .line 936
    new-instance v0, Lcom/roidapp/photogrid/an;

    invoke-direct {v0, p0, p3}, Lcom/roidapp/photogrid/an;-><init>(Lcom/roidapp/photogrid/MainPage;Landroid/content/Intent;)V

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/w;)Z

    goto :goto_0

    .line 1028
    :cond_3
    const/16 v0, 0x4936

    if-ne p1, v0, :cond_1

    if-ne p2, v1, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1029
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->j:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1030
    const-string v0, "FilterPage_View"

    const-string v1, "_Filter"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1031
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->j:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 1032
    new-array v1, v4, [Lcom/roidapp/photogrid/release/ig;

    .line 1033
    aput-object v0, v1, v3

    .line 1034
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1035
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1036
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1037
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 1038
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 1039
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 1041
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1042
    const-class v1, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1043
    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1044
    const-string v1, "entry_from"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1045
    const-string v1, "entry_type"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1046
    const-string v1, "edit_suppot_filter"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1047
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 1048
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    .line 1050
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "camera"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const-wide/16 v4, 0x1

    .line 3216
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 15146
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 3218
    :sswitch_1
    const-string v0, "setting"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 15106
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->m:Lcom/roidapp/photogrid/ba;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 3220
    const-string v0, "Settings"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    goto :goto_0

    .line 3226
    :sswitch_2
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Home"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3227
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Home"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3228
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    goto :goto_0

    .line 3231
    :sswitch_3
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Feed"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3232
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Feed"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3233
    invoke-direct {p0, v6}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    goto :goto_0

    .line 3236
    :sswitch_4
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Notification"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3237
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Notification"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3238
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    goto :goto_0

    .line 3241
    :sswitch_5
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Profile"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3242
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Tab/Profile"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3243
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    goto/16 :goto_0

    .line 3246
    :sswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aw:Lcom/roidapp/cloudlib/sns/notification/p;

    if-eqz v0, :cond_1

    .line 3247
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aw:Lcom/roidapp/cloudlib/sns/notification/p;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/p;->a()V

    .line 15143
    :cond_1
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->s:Z

    if-nez v0, :cond_2

    .line 15144
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Show/Fast"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15145
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Show/Fast"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 15146
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->N()V

    goto/16 :goto_0

    .line 15148
    :cond_2
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Close/Fast"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15149
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Close/Fast"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 15150
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->y()V

    goto/16 :goto_0

    .line 3251
    :sswitch_7
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Close/Layout"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3252
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "Main/Create/Close/Layout"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3253
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->y()V

    goto/16 :goto_0

    .line 3256
    :sswitch_8
    invoke-direct {p0, v6}, Lcom/roidapp/photogrid/MainPage;->b(Z)V

    .line 3257
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3258
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->O()V

    goto/16 :goto_0

    .line 3261
    :sswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_0

    .line 3262
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 3263
    if-eqz v0, :cond_0

    .line 3264
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->i_()V

    goto/16 :goto_0

    .line 3216
    :sswitch_data_0
    .sparse-switch
        0x7f0d01d9 -> :sswitch_9
        0x7f0d0394 -> :sswitch_7
        0x7f0d0395 -> :sswitch_6
        0x7f0d0397 -> :sswitch_0
        0x7f0d0398 -> :sswitch_2
        0x7f0d039a -> :sswitch_3
        0x7f0d039d -> :sswitch_4
        0x7f0d039f -> :sswitch_5
        0x7f0d03a2 -> :sswitch_8
        0x7f0d03a4 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 14

    .prologue
    const v13, 0x7f070310

    const v12, 0x7f07030f

    const v11, 0x7f07030e

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 393
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Ljava/lang/Object;)V

    .line 394
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 395
    new-instance v0, Lcom/roidapp/photogrid/common/bk;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/bk;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 396
    new-instance v0, Lcom/roidapp/baselib/c/ai;

    invoke-direct {v0}, Lcom/roidapp/baselib/c/ai;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ak:Lcom/roidapp/baselib/c/ai;

    .line 398
    const v0, 0x7f0300da

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->v:Z

    if-nez v0, :cond_5

    .line 405
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->e:Lcom/roidapp/cloudlib/sns/g/e;

    invoke-virtual {v0, v1, p0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/e;Lcom/roidapp/cloudlib/sns/g/c;)V

    .line 407
    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->W:Z

    .line 408
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/Window;->setFormat(I)V

    .line 6241
    const-string v0, "com.android.vending"

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ao:Z

    .line 6242
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->ao:Z

    if-eqz v0, :cond_1

    .line 6245
    invoke-static {p0}, Lcom/roidapp/photogrid/a/m;->b(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v10, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/a/m;->c(Landroid/content/Context;)I

    move-result v0

    if-ne v0, v10, :cond_6

    :cond_0
    move v0, v10

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->c:Z

    .line 6246
    new-instance v0, Lcom/roidapp/photogrid/a/d;

    const-string v1, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3hDBUTqCFEy0ee8FVgMli9SgoFAEwh6LplNMMRM3GMnUIZMapwISgCeyVeoX1d3idHCG3hSEd3t6ukuBvsiyTi3UYryPl9SvECTpaQLnyjJLxNdZB/a1h5Bwbk+4ugKWuKXMKTI8MpKmDD/wx1EexO7PntgM1Y28CFUeJD93C9qVRGQNKqjVdNm/jImEQeZcCEDXDw9j03psvXyE02Xj6HIcMBVvRbUynXWl8KtAY8fNHgGvb0JYRLnmz8ei14m6wqrXHPTpe5lZ4zHTEd7nsjTAUNfvdNqn2p662IWemg7h1Q34DaIZlVycqKy/URffwgNrixRKN3AY/Y2YD0O0GQIDAQAB"

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/a/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->K:Lcom/roidapp/photogrid/a/d;

    .line 6249
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->K:Lcom/roidapp/photogrid/a/d;

    new-instance v1, Lcom/roidapp/photogrid/ar;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/ar;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Lcom/roidapp/photogrid/a/j;)V

    .line 412
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "gcm_page"

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 426
    :goto_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "cmlTid"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->as:J

    .line 428
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isFromShareGallery"

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->P:Z

    .line 429
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isFilterFromShareGallery"

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->Q:Z

    .line 430
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isFromShareGalleryVideoNotReady"

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->R:Z

    .line 431
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "jump_from_sharepage"

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->S:Z

    .line 6573
    const v0, 0x7f0d01d9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    .line 6574
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300dc

    iget-object v2, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->am:Landroid/view/View;

    .line 6575
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->am:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 6576
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6577
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->am:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/common/w;->b(Landroid/view/View;)V

    .line 6580
    const v0, 0x7f0d03a2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->C:Landroid/view/View;

    .line 6581
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->C:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6582
    const v0, 0x7f0d03a3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->B:Landroid/widget/ImageView;

    .line 6583
    const v0, 0x7f0d03a5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->A:Landroid/widget/ImageView;

    .line 6584
    const v0, 0x7f0d01ab

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ax:Landroid/widget/RelativeLayout;

    .line 6593
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 7521
    iput-boolean v9, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    .line 7522
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 7523
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v3

    const-string v4, "opengl"

    const-string v5, "gpu_white_list"

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/gl/c;->a(Ljava/util/List;)V

    .line 7525
    if-nez v0, :cond_7

    .line 7527
    sget v0, Lcom/roidapp/videolib/f;->b:I

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    .line 7528
    iput-boolean v9, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    .line 6606
    :cond_2
    :goto_3
    const-string v0, "show_new_premium"

    invoke-interface {v1, v0, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 6607
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-eqz v0, :cond_3

    move v2, v9

    .line 6610
    :cond_3
    if-eqz v2, :cond_4

    .line 6611
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->A:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6614
    :cond_4
    const v0, 0x7f0d03a4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 6615
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6616
    new-instance v0, Lcom/roidapp/photogrid/ba;

    .line 8009
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 8011
    new-instance v4, Lcom/roidapp/photogrid/ac;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/ac;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    .line 6616
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v5

    iget-boolean v6, p0, Lcom/roidapp/photogrid/MainPage;->ao:Z

    invoke-static {p0}, Lcom/roidapp/photogrid/a/m;->b(Landroid/content/Context;)I

    move-result v7

    invoke-static {p0}, Lcom/roidapp/photogrid/a/m;->c(Landroid/content/Context;)I

    move-result v8

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/roidapp/photogrid/ba;-><init>(Landroid/content/Context;ZLandroid/view/View;Lcom/roidapp/photogrid/bh;ZZII)V

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->m:Lcom/roidapp/photogrid/ba;

    .line 434
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->z:Z

    if-eqz v0, :cond_e

    .line 437
    sput-boolean v9, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 441
    const v0, 0x7f0d0397

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 442
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    .line 443
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 444
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d0264

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->N:Landroid/widget/ImageView;

    .line 445
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d0265

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    .line 447
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d0263

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->O:Landroid/widget/ImageView;

    .line 448
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->N:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->b(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    .line 461
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    if-nez v0, :cond_d

    .line 462
    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    .line 463
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->G()V

    .line 464
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->L()V

    .line 510
    :cond_5
    :goto_4
    return-void

    .line 400
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 401
    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->v:Z

    .line 402
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    :cond_6
    move v0, v9

    .line 6245
    goto/16 :goto_1

    .line 415
    :pswitch_0
    sput v10, Lcom/roidapp/photogrid/common/az;->y:I

    goto/16 :goto_2

    .line 419
    :pswitch_1
    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->ar:Z

    goto/16 :goto_2

    .line 423
    :pswitch_2
    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->at:Z

    goto/16 :goto_2

    .line 7532
    :cond_7
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 7534
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    iget-object v2, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v2, p0, v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/os/Handler;Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 7537
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v2

    const-string v3, "video"

    const-string v4, "black_list"

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    .line 7538
    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    sget v2, Lcom/roidapp/videolib/f;->b:I

    if-ne v0, v2, :cond_8

    .line 7540
    iput-boolean v9, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    goto/16 :goto_3

    .line 7542
    :cond_8
    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    sget v2, Lcom/roidapp/videolib/f;->a:I

    if-ne v0, v2, :cond_2

    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    goto/16 :goto_3

    .line 7548
    :cond_9
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/gl/c;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 7550
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v2

    const-string v3, "video"

    const-string v4, "black_list"

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    .line 7551
    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    sget v2, Lcom/roidapp/videolib/f;->c:I

    if-ne v0, v2, :cond_a

    .line 7558
    iput-boolean v9, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    goto/16 :goto_3

    .line 7561
    :cond_a
    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    sget v2, Lcom/roidapp/videolib/f;->a:I

    if-ne v0, v2, :cond_b

    move v0, v10

    :goto_5
    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    goto/16 :goto_3

    :cond_b
    move v0, v9

    goto :goto_5

    .line 7565
    :cond_c
    iput-boolean v9, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    .line 7566
    sget v0, Lcom/roidapp/videolib/f;->b:I

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    goto/16 :goto_3

    .line 467
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->N:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->H:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 476
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    const v1, 0x7f0c00cf

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 479
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 481
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_4

    .line 485
    :cond_e
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->P:Z

    if-eqz v0, :cond_f

    .line 8664
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 8665
    invoke-virtual {v0, v12}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 8666
    const v1, 0x7f07018b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/af;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/af;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v13, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/ae;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/ae;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v11, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 8691
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 8692
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 488
    :cond_f
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->Q:Z

    if-eqz v0, :cond_10

    .line 8697
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 8698
    invoke-virtual {v0, v12}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 8699
    const-string v1, "Sorry, Filter function is not available on your device for the limitation of hardware performance."

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/ai;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/ai;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v13, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/ah;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/ah;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v1, v11, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 8724
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 8725
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 491
    :cond_10
    iput-boolean v10, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    .line 492
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->L()V

    .line 494
    iget-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->as:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_11

    .line 496
    iget-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->as:J

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/MainPage;->b(J)V

    .line 497
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->as:J

    goto/16 :goto_4

    .line 499
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    const/16 v1, 0xa

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_4

    .line 412
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2369
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->k:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 2370
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->k:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 2372
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2374
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->K:Lcom/roidapp/photogrid/a/d;

    if-eqz v0, :cond_1

    .line 2375
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->K:Lcom/roidapp/photogrid/a/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/a/d;->a()V

    .line 2376
    iput-object v2, p0, Lcom/roidapp/photogrid/MainPage;->K:Lcom/roidapp/photogrid/a/d;

    .line 2378
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    if-eqz v0, :cond_2

    .line 2379
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->aq:Lcom/roidapp/cloudlib/sns/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/i;->c()V

    .line 2381
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->ay:Lcom/roidapp/photogrid/az;

    if-eqz v0, :cond_3

    .line 2382
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->ay:Lcom/roidapp/photogrid/az;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2383
    iput-object v2, p0, Lcom/roidapp/photogrid/MainPage;->ay:Lcom/roidapp/photogrid/az;

    .line 2385
    :cond_3
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 2387
    invoke-static {}, Lcom/roidapp/cloudlib/sns/b/k;->a()V

    .line 2388
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    if-eqz v0, :cond_4

    .line 2389
    invoke-static {p0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2391
    sget-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->setResult(I)V

    .line 2392
    sget-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->finish()V

    .line 14042
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->T:Lcom/roidapp/photogrid/cloud/b/a;

    if-eqz v0, :cond_5

    .line 14043
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->T:Lcom/roidapp/photogrid/cloud/b/a;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/b/a;->a()V

    .line 14045
    :cond_5
    iput-object v2, p0, Lcom/roidapp/photogrid/MainPage;->T:Lcom/roidapp/photogrid/cloud/b/a;

    .line 2399
    invoke-static {}, Lcom/roidapp/cloudlib/sns/u;->a()Lcom/roidapp/cloudlib/sns/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/u;->b()V

    .line 2400
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/g/b;->b()V

    .line 2401
    invoke-static {p0}, Lcom/roidapp/baselib/c/ae;->a(Ljava/lang/Object;)V

    .line 2403
    return-void

    .line 2394
    :cond_6
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x1

    .line 2244
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 2245
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->s:Z

    if-eqz v0, :cond_0

    .line 2246
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v3, "Main/Create/Close/Back"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2247
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v3, "Main/Create/Close/Back"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v0, v1, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2248
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->y()V

    move v0, v2

    .line 2338
    :goto_0
    return v0

    .line 2252
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_3

    .line 2253
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v1

    .line 2254
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    instance-of v0, v1, Lcom/roidapp/cloudlib/b/a;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 2255
    check-cast v0, Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    .line 2256
    goto :goto_0

    .line 2259
    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/b;->h_()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    .line 2260
    goto :goto_0

    .line 2274
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v0

    if-eqz v0, :cond_3

    .line 2275
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    move v0, v2

    .line 2276
    goto :goto_0

    .line 2281
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 2282
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2283
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    move v0, v2

    .line 2284
    goto :goto_0

    .line 2286
    :cond_4
    const-string v0, "back"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 13344
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/roidapp/photogrid/MainPage;->l:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    sub-long/2addr v0, v4

    const-wide/16 v4, 0xbb8

    cmp-long v0, v0, v4

    if-gez v0, :cond_5

    .line 13347
    :try_start_1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "isRunning"

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13358
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 13359
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    move v0, v2

    .line 2323
    goto :goto_0

    .line 13356
    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 13358
    const/4 v0, 0x1

    :try_start_4
    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 13359
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 2290
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 2292
    :try_start_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->G()V

    .line 2293
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "isRunning"

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2294
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 2298
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 2299
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_1

    .line 13358
    :catchall_0
    move-exception v0

    const/4 v1, 0x1

    :try_start_6
    iput-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 13359
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    throw v0

    .line 13362
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/MainPage;->l:J

    .line 13364
    const v0, 0x7f07014b

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    .line 2296
    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 2298
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 2299
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_1

    .line 2298
    :catchall_1
    move-exception v0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->L:Z

    .line 2299
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    throw v0

    .line 2325
    :cond_6
    const/16 v0, 0x52

    if-ne p1, v0, :cond_7

    .line 2326
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    if-eqz v0, :cond_7

    .line 2327
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    if-eqz v0, :cond_7

    .line 2328
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 2329
    if-eqz v0, :cond_7

    instance-of v0, v0, Lcom/roidapp/photogrid/k;

    if-eqz v0, :cond_7

    .line 2330
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->m:Lcom/roidapp/photogrid/ba;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    move v0, v2

    .line 2331
    goto/16 :goto_0

    .line 2338
    :cond_7
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1940
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 1941
    if-eqz p1, :cond_0

    const-string v0, "snsPush"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1942
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->az:Z

    if-eqz v0, :cond_1

    .line 1943
    const-string v0, "snsPid"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->e(I)V

    .line 1951
    :cond_0
    :goto_0
    return-void

    .line 1945
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1946
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "snsPush"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1947
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "snsPid"

    const-string v2, "snsPid"

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_0
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .prologue
    .line 1770
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .prologue
    .line 1774
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .prologue
    .line 1778
    sput p1, Lcom/roidapp/photogrid/common/az;->r:I

    .line 1779
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    if-eqz v0, :cond_1

    .line 1780
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    sget v1, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 1781
    if-eqz v0, :cond_0

    .line 1782
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, v0}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 1783
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->an:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 1789
    :cond_0
    if-eqz p1, :cond_1

    .line 1790
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Z:Lcom/roidapp/cloudlib/sns/main/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 1791
    instance-of v1, v0, Lcom/roidapp/photogrid/k;

    if-eqz v1, :cond_1

    .line 1792
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->h:Lcom/roidapp/photogrid/common/w;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/common/w;->b(Landroid/view/ViewGroup;)V

    .line 1796
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 2149
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->G()V

    .line 2150
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 2152
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1231
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 1232
    if-eqz p1, :cond_0

    .line 1233
    const-string v0, "wqpel"

    iget-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    .line 1234
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 2181
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 2189
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->a:Z

    if-eqz v0, :cond_1

    .line 2190
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v1

    .line 2191
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->S:Z

    if-eqz v0, :cond_4

    .line 2192
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->S:Z

    .line 2193
    invoke-direct {p0, v6}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    .line 2202
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/main/b;->w()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2203
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->f()V

    .line 2208
    :cond_1
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->W:Z

    if-eqz v0, :cond_2

    .line 2209
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->W:Z

    .line 2212
    :cond_2
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->s:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->N()V

    .line 2216
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.facebook.samples.hellofacebook"

    const/16 v3, 0x40

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 2217
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v3, v1

    move v0, v2

    :goto_2
    if-ge v0, v3, :cond_7

    aget-object v4, v1, v0

    .line 2218
    const-string v5, "SHA"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    .line 2219
    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 2220
    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2217
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2194
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v3

    if-eq v0, v3, :cond_5

    .line 2195
    sget v0, Lcom/roidapp/photogrid/common/az;->r:I

    .line 2196
    iget-object v3, p0, Lcom/roidapp/photogrid/MainPage;->X:Lcom/roidapp/cloudlib/sns/main/MainViewPager;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/main/MainViewPager;->getCurrentItem()I

    move-result v3

    sput v3, Lcom/roidapp/photogrid/common/az;->r:I

    .line 2197
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(I)V

    goto :goto_0

    .line 2198
    :cond_5
    if-eqz v1, :cond_0

    instance-of v0, v1, Lcom/roidapp/cloudlib/b/a;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 2199
    check-cast v0, Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/a;->c()V

    .line 2200
    invoke-virtual {v1, p0}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0, v1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0

    .line 2205
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->m_()V

    goto :goto_1

    :catch_0
    move-exception v0

    .line 2229
    :cond_7
    :goto_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->av:Z

    if-eqz v0, :cond_8

    .line 2230
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->av:Z

    .line 2232
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2233
    const-string v1, "QPicCode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 2235
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "QPicCode"

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d;->a(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)Z

    .line 2240
    :cond_8
    :goto_4
    return-void

    .line 2237
    :cond_9
    invoke-direct {p0, v6}, Lcom/roidapp/photogrid/MainPage;->c(Z)Z

    goto :goto_4

    .line 2226
    :catch_1
    move-exception v0

    goto :goto_3
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1224
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1225
    if-eqz p1, :cond_0

    .line 1226
    const-string v0, "wqpel"

    iget-boolean v1, p0, Lcom/roidapp/photogrid/MainPage;->au:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1227
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 2156
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 2157
    const-string v0, "MainPage"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2161
    const-string v0, "MainPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 2162
    return-void
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 2165
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 2166
    const-string v0, "MainPage"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 2167
    return-void
.end method

.method public final p()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2110
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/MainPage;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2111
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final q()V
    .locals 2

    .prologue
    .line 2417
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "single"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 2418
    const-string v0, "single"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2419
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2420
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2436
    :goto_0
    return-void

    .line 2423
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2424
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2426
    const-string v0, "MainPage"

    const-string v1, "MainPage/single"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2428
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_single"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2429
    const-string v0, "MainPage/single"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2430
    const/4 v0, 0x5

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2431
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 2432
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2433
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2434
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2435
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method public final r()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2485
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "grid"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 2486
    const-string v0, "grid"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2487
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2488
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2504
    :goto_0
    return-void

    .line 2491
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2492
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2493
    const-string v0, "MainPage"

    const-string v1, "MainPage/releaseGrid"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2495
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_grid"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2496
    const-string v0, "MainPage/releaseGrid"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2497
    const/4 v0, 0x0

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2498
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 2499
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 2500
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2501
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2502
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2503
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method public final s()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2508
    const-string v0, "video"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2509
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/c;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2511
    iput-boolean v3, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    .line 2512
    sget v0, Lcom/roidapp/videolib/f;->b:I

    iput v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    .line 2514
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    if-nez v0, :cond_8

    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    sget v1, Lcom/roidapp/videolib/f;->c:I

    if-ne v0, v1, :cond_8

    .line 2516
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2517
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2589
    :goto_0
    return-void

    .line 2521
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/g;->a(Landroid/content/Context;)Lcom/roidapp/videolib/g;

    move-result-object v0

    .line 2522
    invoke-virtual {v0}, Lcom/roidapp/videolib/g;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2525
    invoke-virtual {v0}, Lcom/roidapp/videolib/g;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2526
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->I()V

    goto :goto_0

    .line 2528
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->H()V

    goto :goto_0

    .line 2533
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/gl/c;->c(Landroid/content/Context;)Z

    move-result v1

    .line 2534
    if-nez v1, :cond_4

    .line 2537
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->H()V

    goto :goto_0

    .line 2543
    :cond_4
    new-instance v1, Lcom/roidapp/photogrid/ad;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/ad;-><init>(Lcom/roidapp/photogrid/MainPage;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/k;)V

    .line 2572
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    if-nez v0, :cond_5

    .line 2573
    const v0, 0x7f0d019e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    .line 2574
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_7

    .line 2575
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2576
    if-eqz v0, :cond_6

    .line 2577
    const v1, 0x7f070306

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2578
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->D:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 2581
    :cond_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/g;->a(Landroid/content/Context;)Lcom/roidapp/videolib/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/videolib/g;->c()V

    goto :goto_0

    .line 2584
    :cond_8
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->y:Z

    if-nez v0, :cond_9

    iget v0, p0, Lcom/roidapp/photogrid/MainPage;->z:I

    sget v1, Lcom/roidapp/videolib/f;->b:I

    if-ne v0, v1, :cond_9

    .line 2585
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->H()V

    goto/16 :goto_0

    .line 2587
    :cond_9
    invoke-direct {p0}, Lcom/roidapp/photogrid/MainPage;->M()V

    goto/16 :goto_0
.end method

.method public final t()V
    .locals 8

    .prologue
    const/4 v7, 0x7

    const/4 v5, 0x0

    .line 2614
    const-string v0, "MainPage"

    const-string v1, "MainPage/Click/camera"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2616
    sget-object v0, Lcom/roidapp/photogrid/b/g;->g:Lcom/roidapp/photogrid/b/g;

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 2617
    const-string v0, "Camera"

    sget v1, Lcom/roidapp/photogrid/MainPage;->g:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/MainPage;->g:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;I)V

    .line 2618
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2619
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2620
    const-string v1, "cameraFilterDarkCorner"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 2621
    const-string v1, "cameraFilterGroupId"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 2622
    const-string v2, "cameraFilterFilterId"

    invoke-interface {v0, v2, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 2623
    const-string v4, "cameraFilterIsCloudFilter"

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 2624
    const-string v5, "cameraFilterCloudFilterPkgName"

    const-string v6, ""

    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 2625
    invoke-static/range {v0 .. v5}, Lcom/roidapp/imagelib/a/h;->a(Landroid/content/Context;IIZZLjava/lang/String;)V

    .line 2627
    sput v7, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2628
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2629
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2630
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f07002e

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2632
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2633
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 2634
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 2636
    :cond_0
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "camera_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2637
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/MainPage;->j:Ljava/lang/String;

    .line 2638
    const-string v1, "output"

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2640
    const/16 v1, 0x4936

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/MainPage;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2660
    :goto_0
    return-void

    .line 2643
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 2646
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/CameraPreviewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2647
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2648
    const-string v2, "current_mode"

    const-string v3, "MainPage"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2649
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2650
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2651
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    .line 2652
    const-string v0, "Selfie_Page"

    const-string v1, "_Selfie"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2656
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final u()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2762
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "hw"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 2763
    const-string v0, "hw"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2764
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2765
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2781
    :goto_0
    return-void

    .line 2768
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2769
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2770
    const-string v0, "MainPage"

    const-string v1, "MainPage/high&wide"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2772
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_highwide"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2773
    const-string v0, "MainPage/high&wide"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2774
    const/4 v0, 0x3

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2775
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 2776
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 2777
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2778
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2779
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2780
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method public final v()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2784
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "free"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 2785
    const-string v0, "free"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/MainPage;->d(Ljava/lang/String;)V

    .line 2786
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2787
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/MainPage;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 2804
    :goto_0
    return-void

    .line 2790
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/MainPage;->G:Z

    .line 2791
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 2792
    const-string v0, "MainPage"

    const-string v1, "MainPage/free"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2794
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v0

    const-string v1, "mainpage_free"

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/photogrid/common/ag;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2795
    const-string v0, "MainPage/free"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2796
    sput v2, Lcom/roidapp/photogrid/common/az;->q:I

    .line 2797
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 2798
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 2799
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 2800
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2801
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2802
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2803
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->finish()V

    goto :goto_0
.end method

.method public final w()V
    .locals 2

    .prologue
    .line 2807
    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/MainPage;->b(J)V

    .line 2808
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 3019
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/MainPage;->t:Ljava/lang/String;

    .line 3021
    return-void
.end method

.method public final y()V
    .locals 8

    .prologue
    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    const/4 v7, 0x0

    .line 3191
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->M:Lcom/roidapp/photogrid/f;

    if-eqz v0, :cond_0

    .line 3212
    :goto_0
    return-void

    .line 3195
    :cond_0
    sput-boolean v7, Lcom/roidapp/photogrid/common/az;->s:Z

    .line 3196
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    const v1, 0x7f0204d9

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3197
    invoke-virtual {p0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 3198
    const v1, 0x7f0d0394

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 3199
    if-eqz v1, :cond_1

    .line 3200
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const/high16 v2, 0x7f040000

    const v5, 0x7f040001

    invoke-virtual {v0, v2, v5, v7, v7}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 3204
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3207
    :cond_1
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/high16 v1, 0x43070000    # 135.0f

    const/4 v2, 0x0

    move v5, v3

    move v6, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 3208
    const-wide/16 v4, 0x64

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 3209
    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 3210
    iget-object v1, p0, Lcom/roidapp/photogrid/MainPage;->al:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3211
    iget-object v0, p0, Lcom/roidapp/photogrid/MainPage;->Y:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0
.end method

.method public final z()Z
    .locals 1

    .prologue
    .line 3340
    iget-boolean v0, p0, Lcom/roidapp/photogrid/MainPage;->c:Z

    return v0
.end method
