.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.super Lcom/qihoo/security/ui/main/BaseHomeFragment;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$14;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$l;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/content/Context;

.field private C:Landroid/app/Activity;

.field private D:Lcom/qihoo/security/enginehelper/clean/a;

.field private E:Z

.field private F:Z

.field private final G:[B

.field private H:Z

.field private I:Z

.field private J:Landroid/view/animation/ScaleAnimation;

.field private K:Landroid/view/animation/ScaleAnimation;

.field private L:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private M:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private N:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private O:Landroid/view/View;

.field private P:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

.field private Q:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

.field private R:Z

.field private S:Ljava/lang/String;

.field private T:Ljava/lang/String;

.field private U:Ljava/lang/String;

.field private V:Ljava/lang/String;

.field private W:Ljava/lang/String;

.field private X:Ljava/lang/String;

.field private Y:Ljava/lang/String;

.field private Z:[Ljava/lang/String;

.field a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

.field private final aA:Lcom/qihoo/security/enginehelper/clean/a$b;

.field private final aB:Lcom/qihoo/security/alasticbutton/a;

.field private aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

.field private ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

.field private ac:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

.field private ad:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

.field private ae:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

.field private af:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

.field private ag:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

.field private ah:Lcom/qihoo/security/opti/trashclear/d;

.field private ai:J

.field private aj:Landroid/os/PowerManager$WakeLock;

.field private ak:Z

.field private al:I

.field private am:Lcom/qihoo/security/ui/main/b;

.field private final an:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;

.field private ao:Lcom/qihoo/security/opti/trashclear/d;

.field private ap:J

.field private aq:J

.field private ar:Z

.field private as:Z

.field private final at:Lcom/qihoo/security/malware/widget/RadarProgressBar$a;

.field private final au:Landroid/content/BroadcastReceiver;

.field private final av:Lcom/qihoo/security/ui/main/c$a;

.field private final aw:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

.field private final ax:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

.field private final ay:Landroid/view/View$OnClickListener;

.field private final az:Lcom/qihoo/security/enginehelper/clean/a$b;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Lcom/qihoo/security/ui/b/a$f;

.field private n:Landroid/view/View;

.field private o:Lcom/qihoo/security/widget/CircleProgress;

.field private p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

.field private q:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

.field private r:Landroid/view/View;

.field private s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

.field private t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

.field private u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

.field private v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

.field private w:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

.field private x:Lcom/qihoo/security/widget/RevealPanel;

.field private y:Lcom/qihoo/security/widget/RevealPanel;

.field private z:Lcom/qihoo/security/widget/RevealPanel;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;-><init>()V

    .line 159
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 194
    new-array v0, v2, [B

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    .line 236
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ai:J

    .line 253
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->an:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;

    .line 261
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ar:Z

    .line 264
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->as:Z

    .line 266
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->at:Lcom/qihoo/security/malware/widget/RadarProgressBar$a;

    .line 288
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->au:Landroid/content/BroadcastReceiver;

    .line 314
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->av:Lcom/qihoo/security/ui/main/c$a;

    .line 342
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aw:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

    .line 364
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ax:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    .line 408
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$18;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$18;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ay:Landroid/view/View$OnClickListener;

    .line 423
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->az:Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 582
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aA:Lcom/qihoo/security/enginehelper/clean/a$b;

    .line 965
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$21;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$21;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aB:Lcom/qihoo/security/alasticbutton/a;

    .line 2670
    return-void
.end method

.method static synthetic A(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    return-object v0
.end method

.method private A()V
    .locals 8

    .prologue
    .line 1932
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F()V

    .line 1934
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    if-eqz v0, :cond_0

    .line 1935
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b()V

    .line 1938
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    if-eqz v0, :cond_1

    .line 1939
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a()V

    .line 1942
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    monitor-enter v2

    .line 1943
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    .line 1945
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d()V

    .line 1947
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 1948
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Z)V

    .line 1951
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_4

    .line 1953
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1959
    const/16 v3, 0x478e

    const-string/jumbo v4, "0"

    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ai:J

    sub-long/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ao:Lcom/qihoo/security/opti/trashclear/d;

    if-nez v0, :cond_3

    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v5, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1963
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->c()V

    .line 1964
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    .line 1968
    monitor-exit v2

    .line 1970
    :goto_1
    return-void

    .line 1959
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ao:Lcom/qihoo/security/opti/trashclear/d;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v0

    goto :goto_0

    .line 1966
    :cond_4
    monitor-exit v2

    goto :goto_1

    .line 1968
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic B(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    return-object v0
.end method

.method private B()V
    .locals 2

    .prologue
    .line 1973
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Q:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    if-eqz v0, :cond_0

    .line 1974
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Q:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->a()V

    .line 1975
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Q:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->removeMessages(I)V

    .line 1978
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    monitor-enter v1

    .line 1979
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I:Z

    .line 1980
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_1

    .line 1981
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->c()V

    .line 1982
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H:Z

    .line 1984
    :cond_1
    monitor-exit v1

    .line 1986
    return-void

    .line 1984
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic C(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    return-object v0
.end method

.method private C()V
    .locals 4

    .prologue
    .line 2125
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 2126
    :cond_0
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->P:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    .line 2127
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->P:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->sendEmptyMessageDelayed(IJ)Z

    .line 2130
    :cond_1
    return-void
.end method

.method static synthetic D(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->al:I

    return v0
.end method

.method private D()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 2133
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2147
    :cond_0
    :goto_0
    return-void

    .line 2136
    :cond_1
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 2137
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 2138
    const/4 v0, 0x0

    invoke-direct {p0, v3, v3, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZLjava/lang/String;)V

    goto :goto_0

    .line 2139
    :cond_2
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 2140
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 2141
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2142
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-static {v3, v1, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(ZLcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)Landroid/os/Bundle;

    move-result-object v1

    .line 2143
    const-string/jumbo v2, "memorySize"

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ap:J

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 2144
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2145
    const/16 v1, 0xb

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method static synthetic E(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    return-object v0
.end method

.method private E()V
    .locals 1

    .prologue
    .line 2646
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F()V

    .line 2647
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aj:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 2648
    return-void
.end method

.method static synthetic F(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/widget/RevealPanel;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    return-object v0
.end method

.method private F()V
    .locals 2

    .prologue
    .line 2651
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aj:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 2652
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aj:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 2653
    return-void
.end method

.method static synthetic G(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    return-object v0
.end method

.method private G()V
    .locals 2

    .prologue
    .line 2700
    const-wide/16 v0, 0x15e

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(J)V

    .line 2701
    return-void
.end method

.method static synthetic H(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    return-object v0
.end method

.method private H()V
    .locals 1

    .prologue
    .line 2795
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    if-eqz v0, :cond_0

    .line 2796
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b()V

    .line 2798
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    if-eqz v0, :cond_1

    .line 2799
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a()V

    .line 2801
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d()V

    .line 2802
    return-void
.end method

.method static synthetic I(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J
    .locals 2

    .prologue
    .line 93
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ap:J

    return-wide v0
.end method

.method private I()V
    .locals 8

    .prologue
    const/4 v2, 0x1

    .line 2808
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F()V

    .line 2810
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 2813
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    monitor-enter v2

    .line 2814
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    .line 2816
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    if-eqz v0, :cond_0

    .line 2817
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a()V

    .line 2818
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d()V

    .line 2821
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_2

    .line 2823
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2829
    const/16 v3, 0x478e

    const-string/jumbo v4, "1"

    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ai:J

    sub-long/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ao:Lcom/qihoo/security/opti/trashclear/d;

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v5, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2833
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->c()V

    .line 2834
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    .line 2838
    monitor-exit v2

    .line 2839
    :goto_1
    return-void

    .line 2829
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ao:Lcom/qihoo/security/opti/trashclear/d;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v0

    goto :goto_0

    .line 2836
    :cond_2
    monitor-exit v2

    goto :goto_1

    .line 2838
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic J(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d()V

    return-void
.end method

.method static synthetic K(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F()V

    return-void
.end method

.method static synthetic L(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J
    .locals 2

    .prologue
    .line 93
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ai:J

    return-wide v0
.end method

.method static synthetic M(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t()V

    return-void
.end method

.method static synthetic N(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->az:Lcom/qihoo/security/enginehelper/clean/a$b;

    return-object v0
.end method

.method static synthetic O(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/enginehelper/clean/a;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    return-object v0
.end method

.method static synthetic P(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic Q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic R(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n:Landroid/view/View;

    return-object v0
.end method

.method static synthetic S(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic T(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A:Landroid/view/View;

    return-object v0
.end method

.method static synthetic U(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v()V

    return-void
.end method

.method static synthetic V(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aw:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

    return-object v0
.end method

.method static synthetic W(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Z:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic X(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->S:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic Y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r:Landroid/view/View;

    return-object v0
.end method

.method static synthetic Z(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s()V

    return-void
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 2

    .prologue
    .line 1590
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 1591
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1595
    :goto_0
    return v0

    .line 1592
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 1593
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 1595
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)J
    .locals 1

    .prologue
    .line 93
    iput-wide p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ap:J

    return-wide p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ac:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    return-object p1
.end method

.method static synthetic a(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    invoke-static {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(I)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    .line 1032
    const v0, 0xffffff

    and-int/2addr v0, p1

    const/high16 v1, 0x66000000

    or-int/2addr v0, v1

    .line 1033
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setAboveWaveColor(I)V

    .line 1034
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setBelowWaveColor(I)V

    .line 1035
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setTextColor(I)V

    .line 1036
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setTextColor(I)V

    .line 1037
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setTextColor(I)V

    .line 1038
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->setColor(I)V

    .line 1039
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->M:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 1041
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    monitor-enter v1

    .line 1043
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    .line 1044
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f080056

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1049
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 1050
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1051
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1052
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1054
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    monitor-enter v1

    .line 1056
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    .line 1057
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f080056

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1062
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 1063
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1064
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1065
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1067
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    monitor-enter v1

    .line 1069
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    .line 1071
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f080056

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    .line 1076
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 1077
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1078
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1079
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1081
    return-void

    :cond_1
    move v0, p1

    .line 1046
    goto/16 :goto_0

    .line 1052
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_2
    move v0, p1

    .line 1059
    goto :goto_1

    .line 1065
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 1079
    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method private a(J)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 2711
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2712
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->setVisibility(I)V

    .line 2713
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    const-string/jumbo v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    invoke-virtual {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    aput v3, v2, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    aput v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 2715
    invoke-virtual {v0, p1, p2}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 2716
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 2717
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$11;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$11;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 2723
    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 2724
    return-void
.end method

.method private a(JLcom/nineoldandroids/a/b;)V
    .locals 5

    .prologue
    .line 2744
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    const-string/jumbo v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    invoke-virtual {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->getHeight()I

    move-result v4

    int-to-float v4, v4

    aput v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 2746
    invoke-virtual {v0, p1, p2}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 2747
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 2748
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;

    invoke-direct {v1, p0, p3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$13;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/nineoldandroids/a/b;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 2759
    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 2760
    return-void
.end method

.method private a(Lcom/nineoldandroids/a/b;)V
    .locals 2

    .prologue
    .line 2734
    const-wide/16 v0, 0x15e

    invoke-direct {p0, v0, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(JLcom/nineoldandroids/a/b;)V

    .line 2735
    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v8, 0x0

    .line 2842
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2843
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/e$a;->b()J

    move-result-wide v2

    .line 2844
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/e$a;->c()J

    move-result-wide v4

    .line 2846
    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aq:J

    cmp-long v1, v6, v10

    if-lez v1, :cond_0

    .line 2847
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aq:J

    invoke-static {v1, v6, v7, v8}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    .line 2848
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2849
    const-string/jumbo v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2852
    :cond_0
    cmp-long v1, v2, v10

    if-lez v1, :cond_1

    .line 2853
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1, v2, v3, v8}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    .line 2854
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2855
    const-string/jumbo v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2858
    :cond_1
    cmp-long v1, v4, v10

    if-lez v1, :cond_2

    .line 2859
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1, v4, v5, v8}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    .line 2860
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2863
    :cond_2
    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aq:J

    add-long/2addr v2, v6

    add-long/2addr v2, v4

    .line 2864
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    .line 2866
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v3, "sp_key_clear_prescan_count"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2867
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_clear_prescan_total_count"

    invoke-static {v0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2868
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(I)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/d;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 2051
    const/16 v0, 0xa

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->b(I)V

    .line 2052
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->a()V

    .line 2053
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ah:Lcom/qihoo/security/opti/trashclear/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ah:Lcom/qihoo/security/opti/trashclear/d;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 2054
    :cond_0
    if-eqz p1, :cond_1

    .line 2058
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w()V

    .line 2079
    :goto_0
    return-void

    .line 2060
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isResumed()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    .line 2061
    :cond_2
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 2062
    const/4 v0, 0x0

    invoke-direct {p0, v4, p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZLjava/lang/String;)V

    goto :goto_0

    .line 2064
    :cond_3
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    goto :goto_0

    .line 2068
    :cond_4
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isResumed()Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_6

    .line 2069
    :cond_5
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 2070
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2071
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-static {v4, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(ZLcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)Landroid/os/Bundle;

    move-result-object v1

    .line 2072
    const-string/jumbo v2, "memorySize"

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ap:J

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 2073
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2074
    const/16 v1, 0xb

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 2076
    :cond_6
    const/4 v0, 0x6

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    goto :goto_0
.end method

.method private a(ZZ)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1795
    const/16 v0, 0x478f

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 1799
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1800
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a_(Ljava/lang/String;)V

    .line 1802
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 1804
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x()V

    .line 1805
    if-eqz p1, :cond_0

    .line 1806
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->an:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;->a(Z)V

    .line 1807
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->an:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$j;

    invoke-virtual {p0, v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1821
    :goto_0
    return-void

    .line 1809
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    .line 1810
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1811
    if-eqz p2, :cond_2

    .line 1812
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1813
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(J)V

    goto :goto_0

    .line 1815
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G()V

    goto :goto_0

    .line 1818
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G()V

    goto :goto_0
.end method

.method private a(ZZLjava/lang/String;)V
    .locals 3

    .prologue
    .line 2157
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2160
    new-instance v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;-><init>()V

    .line 2161
    iput-boolean p1, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->isDeepClean:Z

    .line 2162
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ar:Z

    .line 2163
    iput-object p3, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->cleanSize:Ljava/lang/String;

    .line 2164
    iput-boolean p2, v0, Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;->isCancel:Z

    .line 2166
    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/CleanResultFragment;->a(Lcom/qihoo/security/ui/result/view/CleanResultFragment$CleanData;)Lcom/qihoo/security/ui/result/view/CleanResultFragment;

    move-result-object v0

    .line 2168
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->e()Landroid/support/v4/app/f;

    move-result-object v1

    .line 2169
    invoke-virtual {v1}, Landroid/support/v4/app/f;->a()Landroid/support/v4/app/h;

    move-result-object v1

    .line 2170
    const v2, 0x7f0b0073

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/h;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/h;

    .line 2171
    const-string/jumbo v0, "clean_result_fragment"

    invoke-virtual {v1, v0}, Landroid/support/v4/app/h;->a(Ljava/lang/String;)Landroid/support/v4/app/h;

    .line 2172
    invoke-virtual {v1}, Landroid/support/v4/app/h;->b()I

    .line 2173
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z
    .locals 1

    .prologue
    .line 93
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    invoke-static {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic aa(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z()V

    return-void
.end method

.method static synthetic ab(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D()V

    return-void
.end method

.method static synthetic ac(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p()V

    return-void
.end method

.method static synthetic ad(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G()V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->al:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)J
    .locals 1

    .prologue
    .line 93
    iput-wide p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aq:J

    return-wide p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)Lcom/qihoo/security/opti/trashclear/d;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ah:Lcom/qihoo/security/opti/trashclear/d;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object p1
.end method

.method private static b(Landroid/content/Context;J)Ljava/lang/String;
    .locals 1

    .prologue
    .line 2223
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(J)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2766
    const-wide/32 v0, 0x3200000

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 2767
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2773
    :goto_0
    return-void

    .line 2768
    :cond_0
    const-wide/32 v0, 0xc800000

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    .line 2769
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    goto :goto_0

    .line 2771
    :cond_1
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v8, 0x0

    .line 2871
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2872
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/d;->l:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/e$a;->b()J

    move-result-wide v2

    .line 2873
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/d;->l:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/e$a;->c()J

    move-result-wide v4

    .line 2874
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/d;->l:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/e$a;->d()J

    move-result-wide v6

    .line 2875
    cmp-long v1, v2, v10

    if-lez v1, :cond_0

    .line 2876
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1, v2, v3, v8}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    .line 2877
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2878
    const-string/jumbo v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2881
    :cond_0
    cmp-long v1, v4, v10

    if-lez v1, :cond_1

    .line 2882
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1, v4, v5, v8}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    .line 2883
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2884
    const-string/jumbo v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2887
    :cond_1
    cmp-long v1, v6, v10

    if-lez v1, :cond_2

    .line 2888
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1, v6, v7, v8}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    .line 2889
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2892
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v2, "sp_key_clear_scan_count"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2893
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1387
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "RecommendType."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v1}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1388
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1389
    return-void
.end method

.method private b(Z)V
    .locals 1

    .prologue
    .line 2195
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(ZZ)V

    .line 2196
    return-void
.end method

.method private b(ZZ)V
    .locals 3

    .prologue
    .line 2176
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2177
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2179
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->e()Landroid/support/v4/app/f;

    move-result-object v0

    .line 2180
    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Landroid/support/v4/app/f;)V

    .line 2183
    const-string/jumbo v1, "clean_result_fragment"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/f;->b(Ljava/lang/String;I)Z

    .line 2187
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZ)V

    .line 2192
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->R:Z

    return p1
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 2038
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "0"

    aput-object v1, v0, v4

    aput-object p1, v0, v5

    .line 2039
    if-eqz p0, :cond_0

    .line 2040
    const-string/jumbo v1, "[a-z]*[A-Z]*+"

    const-string/jumbo v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2041
    const-string/jumbo v2, "\\d*\\.*+"

    const-string/jumbo v3, ""

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2042
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 2043
    aput-object v1, v0, v4

    .line 2044
    aput-object v2, v0, v5

    .line 2047
    :cond_0
    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)Lcom/qihoo/security/opti/trashclear/d;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ao:Lcom/qihoo/security/opti/trashclear/d;

    return-object p1
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ae:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object p1
.end method

.method private c(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1347
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)V
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(J)V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ak:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->af:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object p1
.end method

.method private d()V
    .locals 2

    .prologue
    .line 992
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 993
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ac:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    if-eqz v0, :cond_1

    .line 994
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_a

    .line 995
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ac:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b()V

    .line 1000
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    if-eqz v0, :cond_3

    .line 1001
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_b

    .line 1002
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b()V

    .line 1007
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ae:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    if-eqz v0, :cond_5

    .line 1008
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1009
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ae:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b()V

    .line 1014
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->af:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    if-eqz v0, :cond_7

    .line 1015
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_d

    .line 1016
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->af:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b()V

    .line 1022
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ag:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    if-eqz v0, :cond_9

    .line 1023
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_e

    .line 1024
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ag:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->b()V

    .line 1029
    :cond_9
    :goto_4
    return-void

    .line 997
    :cond_a
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ac:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c()V

    goto :goto_0

    .line 1004
    :cond_b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c()V

    goto :goto_1

    .line 1011
    :cond_c
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ae:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c()V

    goto :goto_2

    .line 1018
    :cond_d
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->af:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c()V

    goto :goto_3

    .line 1026
    :cond_e
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ag:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;->c()V

    goto :goto_4
.end method

.method private d(I)V
    .locals 1

    .prologue
    .line 1877
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setColor(I)V

    .line 1878
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->o:Lcom/qihoo/security/widget/CircleProgress;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/CircleProgress;->setCricleProgressColor(I)V

    .line 1879
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1880
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1881
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1882
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 1883
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->N:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 1885
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)V
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(J)V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/d;)V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H:Z

    return p1
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ag:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object p1
.end method

.method private e(I)V
    .locals 2

    .prologue
    .line 2150
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2154
    :goto_0
    return-void

    .line 2153
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->o:Lcom/qihoo/security/widget/CircleProgress;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CircleProgress;->setRealProgress(F)V

    goto :goto_0
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    return p1
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->M:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I:Z

    return p1
.end method

.method static synthetic g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar$a;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->at:Lcom/qihoo/security/malware/widget/RadarProgressBar$a;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 1183
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00bd

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A:Landroid/view/View;

    .line 1184
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00be

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RevealPanel;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    .line 1185
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00bf

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RevealPanel;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    .line 1186
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00c0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RevealPanel;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    .line 1188
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n:Landroid/view/View;

    .line 1189
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/CircleProgress;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->o:Lcom/qihoo/security/widget/CircleProgress;

    .line 1190
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    .line 1196
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r:Landroid/view/View;

    .line 1197
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00c3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/widget/RadarProgressBar;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    .line 1198
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00c4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    .line 1199
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00c5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    .line 1200
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00c6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    .line 1201
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00c7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    .line 1203
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1204
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b9

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->M:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1205
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00ba

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->N:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1207
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00b1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->O:Landroid/view/View;

    .line 1210
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00bc

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    .line 1211
    return-void
.end method

.method static synthetic m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->N:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method private m()V
    .locals 9

    .prologue
    .line 1214
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C:Landroid/app/Activity;

    .line 1215
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    .line 1217
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Landroid/content/Context;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    .line 1218
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->e()V

    .line 1220
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 1221
    const-string/jumbo v1, "action_get_data_size"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1222
    const-string/jumbo v1, "action_get_pre_data_size"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1223
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C:Landroid/app/Activity;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->au:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1225
    new-instance v0, Lcom/qihoo/security/ui/main/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/main/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->am:Lcom/qihoo/security/ui/main/b;

    .line 1227
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0123

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->S:Ljava/lang/String;

    .line 1229
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01ee

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->W:Ljava/lang/String;

    .line 1230
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01ed

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->X:Ljava/lang/String;

    .line 1231
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01ec

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Y:Ljava/lang/String;

    .line 1232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->T:Ljava/lang/String;

    .line 1233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->U:Ljava/lang/String;

    .line 1234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->V:Ljava/lang/String;

    .line 1236
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->T:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->U:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->V:Ljava/lang/String;

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Z:[Ljava/lang/String;

    .line 1238
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01e7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l:Ljava/lang/String;

    .line 1240
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J:Landroid/view/animation/ScaleAnimation;

    .line 1242
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J:Landroid/view/animation/ScaleAnimation;

    const-wide/16 v2, 0x15e

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 1243
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J:Landroid/view/animation/ScaleAnimation;

    sget-object v1, Lcom/qihoo/security/ui/b/c;->a:Landroid/view/animation/AccelerateInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1245
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K:Landroid/view/animation/ScaleAnimation;

    .line 1247
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K:Landroid/view/animation/ScaleAnimation;

    const-wide/16 v2, 0x15e

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 1248
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K:Landroid/view/animation/ScaleAnimation;

    sget-object v1, Lcom/qihoo/security/ui/b/c;->b:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1250
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string/jumbo v1, "power"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 1251
    const v1, 0x2000000a

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aj:Landroid/os/PowerManager$WakeLock;

    .line 1252
    return-void
.end method

.method static synthetic n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->am:Lcom/qihoo/security/ui/main/b;

    return-object v0
.end method

.method private n()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 1256
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;)V

    .line 1257
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;)V

    .line 1258
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->a(Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;)V

    .line 1260
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setRevertColor(I)V

    .line 1261
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setRevertColor(I)V

    .line 1262
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setRevertColor(I)V

    .line 1264
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setTopView(Landroid/view/View;)V

    .line 1265
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aB:Lcom/qihoo/security/alasticbutton/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setButtonAnimatorListener(Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;)V

    .line 1266
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ay:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1268
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setClickable(Z)V

    .line 1269
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setClickable(Z)V

    .line 1270
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/widget/RevealPanel;->setClickable(Z)V

    .line 1278
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    .line 1279
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    const v2, 0x7f02009b

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/RevealPanel;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1280
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    const v2, 0x7f020099

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/RevealPanel;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1282
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    const v2, 0x7f02009c

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1284
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    const v1, 0x7f0c003d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(I)V

    .line 1285
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    const v1, 0x7f0c003e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(I)V

    .line 1286
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    const v1, 0x7f0c0222

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(I)V

    .line 1288
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080041

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1289
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1290
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1291
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1293
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V

    .line 1308
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$3;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V

    .line 1323
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$4;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V

    .line 1342
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(I)V

    .line 1343
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->av:Lcom/qihoo/security/ui/main/c$a;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/main/c$a;)V

    .line 1344
    return-void
.end method

.method static synthetic o(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method private o()V
    .locals 12

    .prologue
    const-wide/32 v4, 0x5265c00

    const/4 v9, 0x1

    const-wide/16 v10, 0x0

    const v8, 0x7f0c0051

    const/4 v7, 0x0

    .line 1351
    const-string/jumbo v0, ""

    .line 1352
    const-string/jumbo v0, "last_trash_scan_time_complete"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1353
    invoke-direct {p0, v8}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(I)Ljava/lang/String;

    move-result-object v0

    .line 1379
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1380
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 1381
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Ljava/lang/String;)V

    .line 1382
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_clear_show_prescan"

    invoke-static {v0, v1, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1384
    :cond_0
    return-void

    .line 1355
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v1, "last_trash_scan_time_complete"

    invoke-static {v0, v1, v10, v11}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 1356
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    div-long/2addr v2, v4

    div-long/2addr v0, v4

    sub-long v0, v2, v0

    long-to-int v0, v0

    .line 1357
    const/16 v1, 0x16d

    if-le v0, v1, :cond_2

    .line 1358
    invoke-direct {p0, v8}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1360
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->e(Landroid/content/Context;)J

    move-result-wide v2

    .line 1361
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/opti/b/d;->b(Landroid/content/Context;)J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 1362
    long-to-float v1, v4

    const/high16 v6, 0x4cc80000    # 1.048576E8f

    cmpl-float v1, v1, v6

    if-lez v1, :cond_3

    cmp-long v1, v2, v10

    if-lez v1, :cond_3

    .line 1363
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0053

    new-array v2, v9, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1365
    :cond_3
    const/4 v1, 0x3

    if-le v0, v1, :cond_4

    .line 1366
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0052

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1368
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->d(Landroid/content/Context;)J

    move-result-wide v0

    .line 1369
    cmp-long v2, v0, v10

    if-nez v2, :cond_5

    .line 1370
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 1372
    :cond_5
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c0054

    new-array v4, v9, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v5, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method static synthetic p(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method private p()V
    .locals 1

    .prologue
    .line 1398
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->start()V

    .line 1523
    return-void
.end method

.method private q()V
    .locals 4

    .prologue
    .line 1526
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1527
    const v1, 0xffffff

    and-int/2addr v1, v0

    const/high16 v2, 0x66000000

    or-int/2addr v1, v2

    .line 1528
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setProgress(I)V

    .line 1529
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setAboveWaveColor(I)V

    .line 1530
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->setBelowWaveColor(I)V

    .line 1531
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setTextColor(I)V

    .line 1532
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setTextColor(I)V

    .line 1533
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setTextColor(I)V

    .line 1534
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    const-string/jumbo v2, "0"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setText(Ljava/lang/CharSequence;)V

    .line 1535
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->v:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveTextView;->setText(Ljava/lang/CharSequence;)V

    .line 1536
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->setColor(I)V

    .line 1537
    return-void
.end method

.method static synthetic q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)[B
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    return-object v0
.end method

.method private r()V
    .locals 4

    .prologue
    .line 1540
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    monitor-enter v1

    .line 1541
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->setTag(Ljava/lang/Object;)V

    .line 1542
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1543
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1544
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    monitor-enter v1

    .line 1545
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->setTag(Ljava/lang/Object;)V

    .line 1546
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1547
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1548
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    monitor-enter v1

    .line 1549
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->setTag(Ljava/lang/Object;)V

    .line 1550
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/RevealPanel;->setTitle(Ljava/lang/CharSequence;)V

    .line 1551
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1553
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1554
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 1555
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1556
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1557
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 1558
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1559
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1560
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setTitleColor(I)V

    .line 1561
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setColor(I)V

    .line 1562
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1563
    return-void

    .line 1543
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1547
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 1551
    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method static synthetic r(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I:Z

    return v0
.end method

.method private s()V
    .locals 3

    .prologue
    .line 1566
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->M:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080056

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 1567
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r()V

    .line 1568
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q()V

    .line 1569
    return-void
.end method

.method static synthetic s(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B()V

    return-void
.end method

.method static synthetic t(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)J
    .locals 2

    .prologue
    .line 93
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aq:J

    return-wide v0
.end method

.method private t()V
    .locals 4

    .prologue
    .line 1651
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1007

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 1652
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x100e

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 1656
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->al:I

    .line 1658
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-le v0, v1, :cond_0

    .line 1660
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/service/SecurityService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 1663
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/service/SecurityService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1664
    const-string/jumbo v1, "com.qihoo.security.clean.scan.status"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1665
    const-string/jumbo v1, "hasScan"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1666
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1668
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ak:Z

    .line 1670
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H:Z

    if-eqz v0, :cond_1

    .line 1671
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B()V

    .line 1673
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->u()V

    .line 1674
    return-void
.end method

.method static synthetic u(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ac:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object v0
.end method

.method private u()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1677
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/qihoo/security/recommend/RecommendHelper;->d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 1678
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 1680
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 1681
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J:Landroid/view/animation/ScaleAnimation;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$7;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1732
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0}, Landroid/view/animation/ScaleAnimation;->start()V

    .line 1734
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 1735
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1740
    :goto_0
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$8;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$8;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Landroid/view/View;)V

    .line 1748
    const-string/jumbo v2, "alpha"

    const/4 v3, 0x1

    new-array v3, v3, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v5, v3, v4

    invoke-static {v0, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 1749
    const-wide/16 v2, 0x15e

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1750
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 1752
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b:Lcom/qihoo/security/recommend/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b:Lcom/qihoo/security/recommend/a;

    invoke-virtual {v0}, Lcom/qihoo/security/recommend/a;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1753
    :cond_0
    invoke-direct {p0, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/nineoldandroids/a/b;)V

    .line 1757
    :goto_1
    sget-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdClean:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 1759
    return-void

    .line 1737
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->N:Lcom/qihoo/security/locale/widget/LocaleTextView;

    goto :goto_0

    .line 1755
    :cond_2
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(JLcom/nineoldandroids/a/b;)V

    goto :goto_1
.end method

.method static synthetic v(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ad:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object v0
.end method

.method private v()V
    .locals 2

    .prologue
    .line 1762
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 1763
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K:Landroid/view/animation/ScaleAnimation;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$9;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1787
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->K:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0}, Landroid/view/animation/ScaleAnimation;->start()V

    .line 1788
    return-void
.end method

.method static synthetic w(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ae:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object v0
.end method

.method private w()V
    .locals 2

    .prologue
    .line 1791
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZ)V

    .line 1792
    return-void
.end method

.method static synthetic x(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->af:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object v0
.end method

.method private x()V
    .locals 13

    .prologue
    const-wide/16 v4, 0x0

    const/4 v12, 0x4

    const v11, 0x7f080041

    const/4 v10, 0x0

    const/4 v3, 0x0

    .line 1824
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A:Landroid/view/View;

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1825
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/widget/RevealPanel;->a(Z)V

    .line 1826
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/widget/RevealPanel;->a(Z)V

    .line 1827
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/widget/RevealPanel;->a(Z)V

    .line 1829
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->am:Lcom/qihoo/security/ui/main/b;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->M:Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-object v6, v3

    move-object v7, v3

    move-wide v8, v4

    invoke-virtual/range {v1 .. v9}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;JLandroid/view/View;Lcom/nineoldandroids/a/a$a;J)V

    .line 1830
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ak:Z

    if-eqz v0, :cond_1

    .line 1831
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->am:Lcom/qihoo/security/ui/main/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->N:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v3, v3, v1, v3}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    .line 1835
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    if-eqz v0, :cond_0

    .line 1836
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aa:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b()V

    .line 1839
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->r:Landroid/view/View;

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1840
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->a(Z)V

    .line 1841
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->a()V

    .line 1842
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n:Landroid/view/View;

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1844
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    const v1, 0x7f0c003d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(I)V

    .line 1845
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->x:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1846
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    const v1, 0x7f0c003e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(I)V

    .line 1847
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1848
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    const v1, 0x7f0c0222

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummary(I)V

    .line 1849
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->z:Lcom/qihoo/security/widget/RevealPanel;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setSummaryColor(I)V

    .line 1851
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y()V

    .line 1852
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->o()V

    .line 1853
    return-void

    .line 1833
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->am:Lcom/qihoo/security/ui/main/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->L:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v3, v3, v1, v3}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    goto :goto_0
.end method

.method static synthetic y(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ag:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$b;

    return-object v0
.end method

.method private declared-synchronized y()V
    .locals 2

    .prologue
    .line 1856
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->R:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 1872
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 1859
    :cond_1
    :try_start_1
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    .line 1860
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;)V

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1856
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic z(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l:Ljava/lang/String;

    return-object v0
.end method

.method private z()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1891
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E()V

    .line 1893
    const/16 v0, 0xa

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;Lcom/qihoo/security/ui/b/b$b;)V

    .line 1896
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ai:J

    .line 1902
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 1904
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    if-eqz v0, :cond_0

    .line 1905
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a()V

    .line 1907
    :cond_0
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ax:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    .line 1908
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ab:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->c()V

    .line 1910
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1911
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1913
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1915
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    monitor-enter v1

    .line 1916
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ao:Lcom/qihoo/security/opti/trashclear/d;

    .line 1917
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ah:Lcom/qihoo/security/opti/trashclear/d;

    .line 1918
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->F:Z

    .line 1919
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    .line 1920
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ap:J

    .line 1921
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    sget-object v2, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->FULL:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/CleanScanType;)V

    .line 1922
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a([Lcom/qihoo/security/enginehelper/clean/CleanTrashType;)V

    .line 1923
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/ArrayList;)V

    .line 1924
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->aA:Lcom/qihoo/security/enginehelper/clean/a$b;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a$b;)V

    .line 1925
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->b()V

    .line 1926
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string/jumbo v2, "last_trash_scan_time_complete"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v0, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 1927
    monitor-exit v1

    .line 1929
    return-void

    .line 1927
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 1601
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a()V

    .line 1602
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C:Landroid/app/Activity;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$6;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1612
    return-void
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 1155
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/content/Intent;)V

    .line 1156
    const-string/jumbo v0, "com.qihoo.security.notify.ACTION_CLEAN"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1158
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    if-eqz v0, :cond_1

    .line 1159
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->performClick()Z

    .line 1162
    :cond_1
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2200
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/os/Bundle;)V

    .line 2201
    if-eqz p1, :cond_0

    .line 2205
    const-string/jumbo v0, "do_scan"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2206
    if-eqz v0, :cond_0

    .line 2207
    const-string/jumbo v0, "do_scan"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 2208
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    if-nez v0, :cond_1

    .line 2209
    invoke-direct {p0, v2, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZ)V

    .line 2220
    :cond_0
    :goto_0
    return-void

    .line 2210
    :cond_1
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2212
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 2213
    invoke-direct {p0, v2, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZ)V

    goto :goto_0

    .line 2214
    :cond_2
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 2215
    invoke-direct {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Z)V

    goto :goto_0
.end method

.method protected a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 2780
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/os/Message;)V

    .line 2781
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 2792
    :goto_0
    return-void

    .line 2783
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->I()V

    goto :goto_0

    .line 2786
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H()V

    .line 2787
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Z)V

    goto :goto_0

    .line 2781
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2083
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 2087
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$14;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2122
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 2089
    :pswitch_1
    if-eqz p2, :cond_0

    .line 2090
    const-string/jumbo v0, "color"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 2094
    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    goto :goto_0

    .line 2098
    :pswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Z)V

    goto :goto_0

    .line 2101
    :pswitch_3
    if-eqz p2, :cond_0

    .line 2102
    const-string/jumbo v0, "deepClean"

    invoke-virtual {p2, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2103
    if-eqz v0, :cond_0

    .line 2104
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2108
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2109
    const/16 v1, 0xb

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 2114
    :pswitch_4
    invoke-direct {p0, v2, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(ZZ)V

    goto :goto_0

    .line 2087
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public b()Z
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v0, 0x1

    .line 1990
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_1

    .line 2009
    :cond_0
    :goto_0
    return v0

    .line 1993
    :cond_1
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->R:Z

    if-nez v1, :cond_0

    .line 1996
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    if-eqz v1, :cond_2

    .line 1997
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A()V

    goto :goto_0

    .line 2000
    :cond_2
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    .line 2001
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ar:Z

    if-nez v1, :cond_3

    .line 2002
    const/16 v1, 0x4789

    invoke-static {v1, v4, v5}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 2006
    :goto_1
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Z)V

    goto :goto_0

    .line 2004
    :cond_3
    const/16 v1, 0x4865

    invoke-static {v1, v4, v5}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_1

    .line 2009
    :cond_4
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b()Z

    move-result v0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x1

    .line 2014
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 2035
    :cond_0
    :goto_0
    return-void

    .line 2017
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->R:Z

    if-nez v0, :cond_0

    .line 2020
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    if-eqz v0, :cond_2

    .line 2021
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A()V

    goto :goto_0

    .line 2025
    :cond_2
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 2026
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->ar:Z

    if-nez v0, :cond_3

    .line 2027
    const/16 v0, 0x4789

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 2031
    :goto_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Z)V

    goto :goto_0

    .line 2029
    :cond_3
    const/16 v0, 0x4865

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_1
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1118
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 1119
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m()V

    .line 1120
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l()V

    .line 1121
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n()V

    .line 1125
    invoke-direct {p0, v2, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZ)V

    .line 1127
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 1132
    if-eqz v0, :cond_0

    .line 1133
    const-string/jumbo v1, "do_scan"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 1137
    if-eqz v1, :cond_0

    .line 1138
    const-string/jumbo v1, "do_scan"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1141
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->as:Z

    if-eqz v0, :cond_2

    .line 1142
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->as:Z

    .line 1143
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 1144
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_CLEAN"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1146
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    if-eqz v0, :cond_2

    .line 1147
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->performClick()Z

    .line 1151
    :cond_2
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    .line 1616
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1617
    const/16 v0, 0xb

    if-ne p1, v0, :cond_3

    .line 1619
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 1622
    const/4 v0, 0x0

    .line 1623
    if-eqz p3, :cond_5

    .line 1624
    const-string/jumbo v2, "isDeep"

    invoke-virtual {p3, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v6

    .line 1625
    const-string/jumbo v2, "isCancel"

    invoke-virtual {p3, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    .line 1626
    const-string/jumbo v2, "cleanSize"

    const/4 v3, 0x0

    invoke-virtual {p3, v2, v3}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v2

    float-to-long v2, v2

    .line 1628
    :goto_0
    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    .line 1629
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v4, "clean_trash_number"

    invoke-static {v0, v4, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 1630
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    .line 1632
    :cond_0
    const/4 v2, 0x4

    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k:I

    .line 1633
    invoke-direct {p0, v6, v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(ZZLjava/lang/String;)V

    .line 1648
    :cond_1
    :goto_1
    return-void

    .line 1635
    :cond_2
    if-eqz p3, :cond_4

    .line 1636
    const-string/jumbo v0, "isDeep"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 1638
    :goto_2
    if-nez v0, :cond_1

    .line 1642
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->w()V

    goto :goto_1

    .line 1645
    :cond_3
    const/16 v0, 0xc

    if-ne p1, v0, :cond_1

    .line 1646
    invoke-direct {p0, v1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(ZZ)V

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2

    :cond_5
    move-wide v2, v4

    move v6, v1

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 1085
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onCreate(Landroid/os/Bundle;)V

    .line 1086
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 1088
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_CLEAN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1090
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "from_notify"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->as:Z

    .line 1092
    :cond_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const v3, 0x7f030033

    .line 1098
    new-instance v0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    .line 1099
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0104

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 1100
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->q:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v1

    const v2, 0x7f02009a

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1103
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    .line 1104
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    if-nez v0, :cond_0

    .line 1108
    new-instance v0, Lcom/qihoo/security/ui/b/a$f;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    .line 1109
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    const/4 v1, 0x0

    invoke-virtual {p1, v3, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 1111
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m:Lcom/qihoo/security/ui/b/a$f;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 1113
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 1166
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onDestroy()V

    .line 1167
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->t:Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/WaveView;->a(Z)V

    .line 1168
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->G:[B

    monitor-enter v1

    .line 1169
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_2

    .line 1170
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->H:Z

    if-eqz v0, :cond_0

    .line 1171
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B()V

    .line 1173
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->E:Z

    if-eqz v0, :cond_1

    .line 1174
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->A()V

    .line 1176
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->f()V

    .line 1178
    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1179
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C:Landroid/app/Activity;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->au:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1180
    return-void

    .line 1178
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onResume()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1573
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onResume()V

    .line 1574
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y()V

    .line 1575
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->o()V

    .line 1576
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v1, "clear_default_pre_is_need_run"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1577
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Q:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    .line 1578
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Q:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    const/4 v1, 0x2

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->sendEmptyMessageDelayed(IJ)Z

    .line 1579
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->B:Landroid/content/Context;

    const-string/jumbo v1, "clear_default_pre_is_need_run"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1581
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->C()V

    .line 1583
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    if-eqz v0, :cond_1

    .line 1584
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->a()V

    .line 1585
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/BottomInfoView;->b()V

    .line 1587
    :cond_1
    return-void
.end method
