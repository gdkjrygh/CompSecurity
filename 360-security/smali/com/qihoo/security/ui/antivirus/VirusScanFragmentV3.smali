.class public Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;
.super Lcom/qihoo/security/ui/main/BaseHomeFragment;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/qihoo/security/malware/widget/RadarView$a;
.implements Lcom/qihoo360/mobilesafe/b/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$35;,
        Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;
    }
.end annotation


# static fields
.field private static k:Z


# instance fields
.field private A:Landroid/widget/LinearLayout$LayoutParams;

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private C:Lcom/qihoo360/mobilesafe/b/g;

.field private D:Z

.field private E:Z

.field private final F:Z

.field private G:Z

.field private H:Z

.field private I:Lcom/qihoo360/mobilesafe/b/e;

.field private J:[Ljava/lang/String;

.field private K:I

.field private L:Ljava/lang/String;

.field private M:Ljava/lang/String;

.field private N:Z

.field private O:I

.field private P:I

.field private Q:Lcom/qihoo/security/malware/vo/a;

.field private R:Z

.field private S:I

.field private T:I

.field private U:I

.field private V:I

.field private W:Z

.field private X:[I

.field private Y:[I

.field private final Z:I

.field a:Landroid/view/View;

.field private aA:I

.field private aB:J

.field private aC:Z

.field private aD:Z

.field private aE:I

.field private aF:J

.field private aG:Ljava/util/Random;

.field private final aH:Lcom/qihoo/security/malware/a$e;

.field private final aI:Lcom/qihoo/security/malware/a$e;

.field private aJ:Lcom/qihoo/security/ui/b/a$f;

.field private aK:J

.field private aL:J

.field private aM:Z

.field private aN:Z

.field private aO:Z

.field private final aP:I

.field private final aQ:I

.field private final aR:I

.field private final aS:I

.field private final aT:I

.field private final aU:I

.field private final aV:I

.field private final aa:I

.field private final ab:I

.field private final ac:I

.field private final ad:I

.field private final ae:I

.field private final af:I

.field private ag:I

.field private ah:I

.field private ai:I

.field private aj:I

.field private ak:I

.field private al:[F

.field private am:[F

.field private an:Lcom/qihoo/security/malware/a;

.field private ao:Z

.field private ap:I

.field private aq:I

.field private ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private as:Z

.field private at:Ljava/util/concurrent/ExecutorService;

.field private au:Ljava/util/concurrent/ExecutorService;

.field private final av:[B

.field private aw:Z

.field private ax:Z

.field private ay:Landroid/os/PowerManager$WakeLock;

.field private az:Z

.field private l:Landroid/content/Context;

.field private m:Landroid/app/Activity;

.field private n:Lcom/qihoo/security/locale/d;

.field private o:Lcom/qihoo/security/malware/widget/RadarView;

.field private p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

.field private q:Z

.field private r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

.field private s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

.field private t:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private u:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private v:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private w:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private x:Landroid/widget/LinearLayout;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/LinearLayout$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->k:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x7

    const/4 v3, 0x0

    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;-><init>()V

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C:Lcom/qihoo360/mobilesafe/b/g;

    .line 145
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    .line 146
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E:Z

    .line 147
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->F:Z

    .line 151
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G:Z

    .line 152
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H:Z

    .line 153
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I:Lcom/qihoo360/mobilesafe/b/e;

    .line 155
    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K:I

    .line 164
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->W:Z

    .line 171
    new-array v0, v4, [I

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    .line 176
    new-array v0, v4, [I

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    .line 179
    const/16 v0, 0xfc

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Z:I

    const/16 v0, 0x10e

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aa:I

    const/16 v0, 0x120

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab:I

    const/16 v0, 0x132

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ac:I

    const/16 v0, 0x144

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ad:I

    const/16 v0, 0x156

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ae:I

    const/16 v0, 0x167

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->af:I

    .line 188
    const/16 v0, 0xfc

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ag:I

    const/16 v0, 0x10e

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah:I

    const/16 v0, 0x120

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ai:I

    const/16 v0, 0x132

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aj:I

    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ak:I

    .line 191
    new-array v0, v4, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al:[F

    .line 193
    const/4 v0, 0x5

    new-array v0, v0, [F

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ag:I

    int-to-float v1, v1

    aput v1, v0, v3

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah:I

    int-to-float v1, v1

    aput v1, v0, v5

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ai:I

    int-to-float v1, v1

    aput v1, v0, v6

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aj:I

    int-to-float v1, v1

    aput v1, v0, v7

    const/4 v1, 0x4

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ak:I

    int-to-float v2, v2

    aput v2, v0, v1

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am:[F

    .line 211
    new-array v0, v3, [B

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->av:[B

    .line 214
    iput-boolean v5, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ax:Z

    .line 219
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    .line 234
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    .line 237
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aD:Z

    .line 239
    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    .line 240
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    .line 249
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aH:Lcom/qihoo/security/malware/a$e;

    .line 665
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aI:Lcom/qihoo/security/malware/a$e;

    .line 1181
    iput-boolean v5, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aM:Z

    .line 2830
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aO:Z

    .line 2890
    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aP:I

    .line 2891
    iput v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aQ:I

    .line 2892
    iput v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aR:I

    .line 2893
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aS:I

    .line 2894
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aT:I

    .line 2895
    const/4 v0, 0x6

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aU:I

    .line 2896
    iput v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aV:I

    return-void

    .line 191
    :array_0
    .array-data 4
        0x437c0000    # 252.0f
        0x43870000    # 270.0f
        0x43900000    # 288.0f
        0x43990000    # 306.0f
        0x43a20000    # 324.0f
        0x43ab0000    # 342.0f
        0x43b38000    # 359.0f
    .end array-data
.end method

.method static synthetic A(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J
    .locals 2

    .prologue
    .line 101
    iget-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    return-wide v0
.end method

.method private A()[I
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1952
    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 1956
    const-string/jumbo v0, "malware_is_scanning"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "malware_find_issue_time"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 1976
    :goto_0
    return-object v0

    .line 1960
    :cond_0
    invoke-static {}, Lcom/qihoo/security/leak/d;->a()Lcom/qihoo/security/leak/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/leak/d;->c()Ljava/util/List;

    move-result-object v0

    .line 1961
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/leak/c;

    .line 1962
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1963
    const/4 v3, 0x0

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    .line 1965
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "leak_samsung_backup"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1966
    aget v3, v1, v5

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v5

    .line 1969
    :cond_2
    sget-boolean v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->k:Z

    if-eqz v3, :cond_1

    .line 1970
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v3, "leak_samsung_backup"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1971
    aget v0, v1, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, v1, v5

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 1976
    goto :goto_0
.end method

.method private B()I
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 1981
    const/4 v1, 0x0

    .line 1982
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "setting_auto_start"

    invoke-static {v2, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1985
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method static synthetic B(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J
    .locals 2

    .prologue
    .line 101
    iget-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    return-wide v0
.end method

.method static synthetic C(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    return v0
.end method

.method private C()V
    .locals 3

    .prologue
    .line 2081
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2090
    :cond_0
    :goto_0
    return-void

    .line 2087
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2088
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "RecommendType."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v2}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2089
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic D(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    return-object v0
.end method

.method private D()V
    .locals 5

    .prologue
    .line 2294
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2296
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_0

    .line 2297
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->S:I

    .line 2307
    :goto_0
    const-string/jumbo v3, "is_deep_scan"

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v4, 0x3

    if-ne v1, v4, :cond_2

    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2308
    const-string/jumbo v1, "color"

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2309
    const/16 v0, 0xa

    invoke-virtual {p0, v2, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2310
    return-void

    .line 2298
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_1

    .line 2299
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->T:I

    goto :goto_0

    .line 2301
    :cond_1
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->U:I

    goto :goto_0

    .line 2307
    :cond_2
    const/4 v1, 0x0

    goto :goto_1
.end method

.method static synthetic E(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J
    .locals 2

    .prologue
    .line 101
    iget-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    return-wide v0
.end method

.method private E()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 2336
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->w()V

    .line 2337
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M()V

    .line 2338
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    .line 2339
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Z)V

    .line 2340
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t()V

    .line 2341
    invoke-direct {p0, v1, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V

    .line 2343
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J()V

    .line 2344
    return-void
.end method

.method static synthetic F(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)J
    .locals 2

    .prologue
    .line 101
    iget-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aB:J

    return-wide v0
.end method

.method private F()V
    .locals 1

    .prologue
    .line 2469
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2470
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2471
    return-void
.end method

.method private G()I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2499
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y()[I

    move-result-object v0

    .line 2500
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A()[I

    move-result-object v1

    .line 2501
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B()I

    move-result v2

    .line 2502
    aget v0, v0, v3

    add-int/2addr v0, v2

    aget v1, v1, v3

    add-int/2addr v0, v1

    .line 2506
    return v0
.end method

.method static synthetic G(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E()V

    return-void
.end method

.method static synthetic H(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarView;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    return-object v0
.end method

.method private H()V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2515
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H:Z

    .line 2516
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2518
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v2, v3, :cond_1

    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G()I

    move-result v2

    if-ge v2, v0, :cond_1

    .line 2520
    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    :goto_0
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->d(Z)V

    .line 2537
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/malware/widget/RadarView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2546
    return-void

    :cond_0
    move v0, v1

    .line 2520
    goto :goto_0

    .line 2523
    :cond_1
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$20;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$20;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$20;->start()V

    .line 2530
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D()V

    .line 2531
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E:Z

    goto :goto_1

    .line 2534
    :cond_2
    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H:Z

    goto :goto_1
.end method

.method private I()V
    .locals 1

    .prologue
    .line 2549
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J()V

    .line 2550
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ay:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 2551
    return-void
.end method

.method static synthetic I(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y()[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic J(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B()I

    move-result v0

    return v0
.end method

.method private J()V
    .locals 2

    .prologue
    .line 2554
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ay:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 2555
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ay:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 2556
    return-void
.end method

.method private K()V
    .locals 5

    .prologue
    .line 2709
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v1, "malware_scan_finish_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 2710
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->getProgress()F

    move-result v1

    const v2, 0x43b38000    # 359.0f

    const/16 v3, 0x12c

    new-instance v4, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    invoke-direct {v4, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->a(FFILcom/qihoo/security/malware/widget/RadarProgressBar$a;)V

    .line 2743
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J()V

    .line 2744
    return-void
.end method

.method static synthetic K(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K()V

    return-void
.end method

.method static synthetic L(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap:I

    return v0
.end method

.method private L()V
    .locals 2

    .prologue
    .line 2747
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$27;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$27;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 2774
    return-void
.end method

.method private M()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 2865
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    .line 2866
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$29;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$29;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$29;->start()V

    .line 2873
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2876
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->e()Landroid/support/v4/app/f;

    move-result-object v0

    .line 2877
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Landroid/support/v4/app/f;)V

    .line 2879
    const-string/jumbo v1, "virus_result_fragment"

    invoke-virtual {v0, v1, v3}, Landroid/support/v4/app/f;->b(Ljava/lang/String;I)Z

    .line 2880
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t()V

    .line 2881
    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V

    .line 2882
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    .line 2883
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J()V

    .line 2884
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 2885
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    .line 2886
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    .line 2888
    :cond_0
    return-void
.end method

.method static synthetic M(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->z()[I

    move-result-object v0

    return-object v0
.end method

.method private N()V
    .locals 1

    .prologue
    .line 3015
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->start()V

    .line 3028
    return-void
.end method

.method static synthetic N(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[B
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->av:[B

    return-object v0
.end method

.method static synthetic O(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private O()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const v0, 0x7f0f0003

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 3031
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x()[I

    move-result-object v1

    .line 3032
    aget v2, v1, v5

    aget v3, v1, v4

    add-int/2addr v2, v3

    const/4 v3, 0x2

    aget v3, v1, v3

    add-int/2addr v2, v3

    aget v3, v1, v6

    add-int/2addr v2, v3

    aget v3, v1, v7

    add-int/2addr v2, v3

    .line 3033
    if-nez v2, :cond_2

    .line 3035
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->R:Z

    if-eqz v0, :cond_0

    .line 3036
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3038
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0130

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 3059
    :cond_0
    :goto_0
    return-void

    .line 3040
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c012f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_0

    .line 3044
    :cond_2
    aget v3, v1, v5

    if-lez v3, :cond_4

    .line 3045
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-nez v1, :cond_3

    const v0, 0x7f0f0004

    .line 3047
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v0, v2, v3}, Lcom/qihoo/security/locale/d;->a(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3048
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 3049
    :cond_4
    aget v3, v1, v6

    aget v1, v1, v7

    add-int/2addr v1, v3

    if-nez v1, :cond_6

    .line 3050
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-eqz v1, :cond_5

    .line 3051
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v0, v2, v3}, Lcom/qihoo/security/locale/d;->a(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3052
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 3050
    :cond_5
    const v0, 0x7f0f0002

    goto :goto_1

    .line 3054
    :cond_6
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-nez v1, :cond_7

    const v0, 0x7f0f0004

    .line 3056
    :cond_7
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v0, v2, v3}, Lcom/qihoo/security/locale/d;->a(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3057
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic P(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private P()Z
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    .line 3091
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v2, "malware_find_issue_time"

    invoke-static {v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 3092
    cmp-long v1, v2, v4

    if-gtz v1, :cond_1

    .line 3095
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    const-wide/32 v4, 0x6ddd00

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic Q(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private Q()Z
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    .line 3104
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v2, "malware_scan_finish_time"

    invoke-static {v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 3105
    cmp-long v1, v2, v4

    if-gtz v1, :cond_1

    .line 3109
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    const-wide/32 v4, 0xea60

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic R(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private R()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 3119
    const/4 v1, 0x0

    .line 3121
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "ave"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 3122
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 3124
    const-string/jumbo v3, "heurmod_v2.jar"

    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string/jumbo v3, "v_sig.db"

    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 3129
    :cond_0
    :try_start_0
    invoke-static {v2}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V

    .line 3130
    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    .line 3131
    const-string/jumbo v3, "avedb.zip"

    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/io/File;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_3

    :goto_0
    move v1, v0

    .line 3147
    :cond_1
    :goto_1
    return v1

    .line 3142
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    .line 3143
    const-string/jumbo v3, "avedb.zip"

    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/io/File;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v1, v0

    .line 3144
    goto :goto_1

    .line 3134
    :catch_0
    move-exception v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method static synthetic S(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic T(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic U(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic V(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic W(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic X(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->R()Z

    move-result v0

    return v0
.end method

.method static synthetic Y(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r()V

    return-void
.end method

.method static synthetic Z(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I
    .locals 0

    .prologue
    .line 101
    iput p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    return p1
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 1

    .prologue
    .line 2777
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 2778
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->S:I

    .line 2782
    :goto_0
    return v0

    .line 2779
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 2780
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->T:I

    goto :goto_0

    .line 2782
    :cond_1
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->U:I

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;J)J
    .locals 1

    .prologue
    .line 101
    iput-wide p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    return-wide p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Lcom/qihoo/security/malware/vo/a;)Lcom/qihoo/security/malware/vo/a;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Q:Lcom/qihoo/security/malware/vo/a;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    return-object p1
.end method

.method private a(Z)V
    .locals 7

    .prologue
    const-wide/16 v4, 0x64

    const/4 v6, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v1, 0x4

    .line 1591
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1592
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1594
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarView;->a()V

    .line 1595
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarView;->clearAnimation()V

    .line 1598
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->b()V

    .line 1599
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1600
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1601
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->clearAnimation()V

    .line 1602
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->clearAnimation()V

    .line 1604
    if-eqz p1, :cond_1

    .line 1605
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 1606
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$14;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$14;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 1617
    :goto_0
    return-void

    .line 1614
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1615
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(ZLcom/qihoo/security/malware/vo/a;Z)V
    .locals 12

    .prologue
    const/4 v6, 0x3

    const/high16 v11, 0x3f800000    # 1.0f

    const/16 v10, 0x8

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 2101
    if-eqz p1, :cond_0

    .line 2104
    const-wide/16 v0, 0xc8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2109
    :cond_0
    :goto_0
    invoke-virtual {p2}, Lcom/qihoo/security/malware/vo/a;->a()[I

    move-result-object v0

    .line 2110
    invoke-virtual {p2}, Lcom/qihoo/security/malware/vo/a;->b()[I

    move-result-object v1

    .line 2111
    invoke-virtual {p2}, Lcom/qihoo/security/malware/vo/a;->c()I

    move-result v2

    .line 2112
    if-eqz p1, :cond_1

    aget v3, v0, v9

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-lez v3, :cond_1

    .line 2113
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D()V

    .line 2290
    :goto_1
    return-void

    .line 2105
    :catch_0
    move-exception v0

    .line 2106
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 2115
    :cond_1
    if-eqz p1, :cond_2

    aget v3, v0, v8

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-nez v3, :cond_2

    .line 2116
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M()V

    .line 2119
    :cond_2
    if-eqz p3, :cond_6

    .line 2125
    if-eqz p1, :cond_3

    aget v3, v0, v8

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-gtz v3, :cond_4

    :cond_3
    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->q:Z

    if-nez v3, :cond_4

    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    if-nez v3, :cond_4

    .line 2130
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v3, v9}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    .line 2138
    :cond_4
    :goto_2
    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->as:Z

    if-nez v3, :cond_7

    invoke-virtual {p0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    if-eqz v3, :cond_7

    .line 2139
    iput-boolean v8, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    .line 2144
    :goto_3
    aget v3, v0, v8

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-nez v3, :cond_11

    .line 2145
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c012a

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 2147
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v9}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2148
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "malware_scan_time"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 2150
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "malware_update_timestamp"

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 2152
    iget-boolean v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E:Z

    if-eqz v4, :cond_8

    .line 2153
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c013b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 2192
    :goto_4
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->d()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_10

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-nez v0, :cond_10

    .line 2193
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2194
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 2195
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-static {v0, v11}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 2196
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2200
    :goto_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 2289
    :cond_5
    :goto_6
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C()V

    goto/16 :goto_1

    .line 2136
    :cond_6
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v3, v8}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b(Z)V

    goto/16 :goto_2

    .line 2141
    :cond_7
    iput-boolean v8, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->as:Z

    goto :goto_3

    .line 2155
    :cond_8
    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-nez v4, :cond_b

    .line 2156
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->R:Z

    if-eqz v0, :cond_a

    .line 2157
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Q()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2159
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0130

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_4

    .line 2161
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c012f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_4

    .line 2164
    :cond_a
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c012e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_4

    .line 2167
    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/32 v6, 0x5265c00

    div-long/2addr v4, v6

    const-wide/32 v6, 0x5265c00

    div-long v6, v0, v6

    sub-long/2addr v4, v6

    .line 2170
    sub-long/2addr v0, v2

    const-wide/32 v2, 0xf731400

    cmp-long v0, v0, v2

    if-gez v0, :cond_d

    .line 2171
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Q()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2173
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0130

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_4

    .line 2175
    :cond_c
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c012f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_4

    .line 2178
    :cond_d
    const-wide/16 v0, 0x3

    cmp-long v0, v4, v0

    if-lez v0, :cond_e

    .line 2179
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c00f8

    new-array v3, v9, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 2181
    :cond_e
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Q()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 2183
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0130

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_4

    .line 2185
    :cond_f
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c012f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_4

    .line 2198
    :cond_10
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_5

    .line 2201
    :cond_11
    aget v3, v0, v9

    const/4 v4, 0x2

    aget v4, v0, v4

    add-int/2addr v3, v4

    if-lez v3, :cond_16

    .line 2202
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c00e7

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 2204
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v9}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2205
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P()Z

    move-result v3

    if-eqz v3, :cond_12

    .line 2207
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O()V

    .line 2221
    :goto_7
    invoke-direct {p0, v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a([I[II)V

    .line 2222
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2223
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2224
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_8

    .line 2210
    :cond_12
    aget v3, v0, v8

    add-int/2addr v3, v2

    aget v4, v1, v8

    add-int/2addr v3, v4

    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    .line 2211
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V

    .line 2212
    aget v3, v0, v9

    if-lez v3, :cond_13

    .line 2213
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v8}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2216
    :cond_13
    aget v3, v0, v9

    if-nez v3, :cond_14

    aget v3, v0, v6

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-lez v3, :cond_14

    .line 2217
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v8}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2219
    :cond_14
    iput-boolean v9, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    goto :goto_7

    .line 2226
    :cond_15
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-static {v0, v11}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 2227
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2228
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2229
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    goto/16 :goto_6

    .line 2230
    :cond_16
    aget v3, v1, v8

    add-int/2addr v3, v2

    if-nez v3, :cond_1b

    .line 2231
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c012a

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 2233
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v9}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2234
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P()Z

    move-result v3

    if-eqz v3, :cond_17

    .line 2236
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O()V

    .line 2250
    :goto_9
    invoke-direct {p0, v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a([I[II)V

    .line 2251
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2252
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2253
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_a

    .line 2239
    :cond_17
    aget v3, v0, v8

    add-int/2addr v3, v2

    aget v4, v1, v8

    add-int/2addr v3, v4

    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    .line 2240
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V

    .line 2241
    aget v3, v0, v9

    if-lez v3, :cond_18

    .line 2242
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v8}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2245
    :cond_18
    aget v3, v0, v9

    if-nez v3, :cond_19

    aget v3, v0, v6

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-lez v3, :cond_19

    .line 2246
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v8}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2248
    :cond_19
    iput-boolean v9, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    goto :goto_9

    .line 2255
    :cond_1a
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-static {v0, v11}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 2256
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2257
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2258
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    goto/16 :goto_6

    .line 2259
    :cond_1b
    aget v3, v0, v6

    add-int/2addr v3, v2

    aget v4, v1, v8

    add-int/2addr v3, v4

    if-lez v3, :cond_5

    .line 2260
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c00e7

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 2262
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v9}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2263
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P()Z

    move-result v3

    if-eqz v3, :cond_1c

    .line 2265
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O()V

    .line 2279
    :goto_b
    invoke-direct {p0, v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a([I[II)V

    .line 2280
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2281
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2282
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_c

    .line 2268
    :cond_1c
    aget v3, v0, v8

    add-int/2addr v3, v2

    aget v4, v1, v8

    add-int/2addr v3, v4

    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    .line 2269
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V

    .line 2270
    aget v3, v0, v9

    if-lez v3, :cond_1d

    .line 2271
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v8}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2274
    :cond_1d
    aget v3, v0, v9

    if-nez v3, :cond_1e

    aget v3, v0, v6

    aget v4, v1, v8

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    if-lez v3, :cond_1e

    .line 2275
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v3, v8}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2277
    :cond_1e
    iput-boolean v9, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    goto :goto_b

    .line 2284
    :cond_1f
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-static {v0, v11}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 2285
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2286
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2287
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    goto/16 :goto_6
.end method

.method private a(ZZ)V
    .locals 1

    .prologue
    .line 2982
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;ZZ)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$30;->start()V

    .line 3012
    return-void
.end method

.method private a([I[II)V
    .locals 6

    .prologue
    const/4 v5, 0x4

    .line 2398
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->F()V

    .line 2401
    if-lez p3, :cond_0

    .line 2402
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2403
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020151

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2404
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2405
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2409
    :cond_0
    const/4 v0, 0x0

    aget v0, p2, v0

    if-lez v0, :cond_2

    .line 2410
    invoke-static {}, Lcom/qihoo/security/leak/d;->a()Lcom/qihoo/security/leak/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/leak/d;->c()Ljava/util/List;

    move-result-object v0

    .line 2411
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/leak/c;

    .line 2412
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v2, v5, :cond_a

    .line 2426
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/a;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 2427
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 2428
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-boolean v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    if-eqz v2, :cond_3

    :cond_4
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2433
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v5, :cond_b

    .line 2444
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/a;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 2445
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 2446
    iget-boolean v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    if-eqz v2, :cond_6

    :cond_7
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2450
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v5, :cond_c

    .line 2459
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v5, :cond_9

    .line 2460
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2461
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2462
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020096

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2463
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2464
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2466
    :cond_9
    return-void

    .line 2415
    :cond_a
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v2

    if-nez v2, :cond_1

    .line 2416
    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2417
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2418
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2419
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 2436
    :cond_b
    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2437
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C:Lcom/qihoo360/mobilesafe/b/g;

    iget-object v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v3, v4, v0}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2438
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2439
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 2453
    :cond_c
    new-instance v2, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2454
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C:Lcom/qihoo360/mobilesafe/b/g;

    iget-object v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v3, v4, v0}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2455
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2456
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    return p1
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 3161
    const/4 v0, 0x0

    .line 3162
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3163
    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$33;

    invoke-direct {v1, p0, p2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$33;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)V

    .line 3173
    invoke-virtual {p1, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 3174
    if-eqz v1, :cond_0

    array-length v1, v1

    if-lez v1, :cond_0

    .line 3175
    const/4 v0, 0x1

    .line 3178
    :cond_0
    return v0
.end method

.method static synthetic aa(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D()V

    return-void
.end method

.method static synthetic ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic ac(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z
    .locals 1

    .prologue
    .line 101
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    return v0
.end method

.method static synthetic ad(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o()V

    return-void
.end method

.method static synthetic ae(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic af(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p()V

    return-void
.end method

.method static synthetic ag(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic ai(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    return-object v0
.end method

.method static synthetic aj(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic ak(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Q:Lcom/qihoo/security/malware/vo/a;

    return-object v0
.end method

.method static synthetic am(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarProgressBar;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    return-object v0
.end method

.method static synthetic an(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->F()V

    return-void
.end method

.method static synthetic ao(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    return v0
.end method

.method static synthetic ap(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z
    .locals 1

    .prologue
    .line 101
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    return v0
.end method

.method static synthetic aq(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[F
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am:[F

    return-object v0
.end method

.method static synthetic ar(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic as(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H()V

    return-void
.end method

.method static synthetic at(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L()V

    return-void
.end method

.method static synthetic au(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic av(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic aw(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic ax(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O:I

    return v0
.end method

.method static synthetic ay(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I
    .locals 0

    .prologue
    .line 101
    iput p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O:I

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;J)J
    .locals 1

    .prologue
    .line 101
    iput-wide p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    return-wide p1
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 3062
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3063
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 3064
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 3083
    :cond_1
    :goto_0
    return-void

    .line 3067
    :cond_2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3071
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)V

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const-wide/16 v4, 0x12c

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    goto :goto_0
.end method

.method private b(Z)V
    .locals 1

    .prologue
    .line 1741
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;->start()V

    .line 1752
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    return p1
.end method

.method private b(Ljava/io/File;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 3193
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3228
    :cond_0
    :goto_0
    return v0

    .line 3196
    :cond_1
    new-instance v1, Ljava/io/File;

    const-string/jumbo v2, "tmp1111"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3197
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 3199
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "avedb.zip"

    new-instance v4, Ljava/io/File;

    const-string/jumbo v5, "avedb.zip"

    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v3, v4, v0}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3203
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "cloudscan-jni-1.0.5.2002"

    invoke-static {v2, v3}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3207
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "avedb.zip"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "360"

    invoke-static {v2, v3, v4}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 3209
    if-gez v2, :cond_2

    .line 3210
    const-string/jumbo v3, "VirusScanFragmentV3"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Extract "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v4, "/"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v4, "avedb.zip"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v4, " failed, error = "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 3214
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "avedb.zip.timestamp"

    new-instance v4, Ljava/io/File;

    const-string/jumbo v5, "avedb.zip.timestamp"

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v3, v4, v0}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3218
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "vdb.cache"

    new-instance v4, Ljava/io/File;

    const-string/jumbo v5, "vdb.cache"

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v3, v4, v0}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3223
    :try_start_0
    invoke-static {v1}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3228
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 3224
    :catch_0
    move-exception v1

    .line 3225
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A()[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I
    .locals 0

    .prologue
    .line 101
    iput p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method

.method private c(I)V
    .locals 5

    .prologue
    .line 2559
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->getProgress()F

    move-result v2

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al:[F

    aget v3, v0, p1

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    aget v0, v0, p1

    :goto_0
    new-instance v4, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;

    invoke-direct {v4, p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$22;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)V

    invoke-virtual {v1, v2, v3, v0, v4}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->a(FFILcom/qihoo/security/malware/widget/RadarProgressBar$a;)V

    .line 2626
    return-void

    .line 2559
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    aget v0, v0, p1

    goto :goto_0
.end method

.method private c(Z)V
    .locals 2

    .prologue
    .line 2363
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2378
    :goto_0
    return-void

    .line 2366
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aw:Z

    .line 2368
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m:Landroid/app/Activity;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$19;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$19;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 2366
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private d(Z)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 2833
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    .line 2834
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aO:Z

    .line 2835
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$28;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$28;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$28;->start()V

    .line 2842
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    if-nez v0, :cond_0

    .line 2843
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 2844
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    .line 2846
    :cond_0
    if-eqz p1, :cond_2

    .line 2847
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0129

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    .line 2853
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2854
    invoke-static {}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->q()Lcom/qihoo/security/ui/result/view/VirusResultFragment;

    move-result-object v0

    .line 2855
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/view/VirusResultFragment;->a(Ljava/lang/Boolean;)V

    .line 2856
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->e()Landroid/support/v4/app/f;

    move-result-object v1

    .line 2857
    invoke-virtual {v1}, Landroid/support/v4/app/f;->a()Landroid/support/v4/app/h;

    move-result-object v1

    .line 2858
    const v2, 0x7f0b0073

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/h;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/h;

    .line 2859
    const-string/jumbo v0, "virus_result_fragment"

    invoke-virtual {v1, v0}, Landroid/support/v4/app/h;->a(Ljava/lang/String;)Landroid/support/v4/app/h;

    .line 2860
    invoke-virtual {v1}, Landroid/support/v4/app/h;->b()I

    .line 2862
    :cond_1
    return-void

    .line 2849
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0124

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->q:Z

    return p1
.end method

.method static synthetic e(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aM:Z

    return p1
.end method

.method static synthetic f(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V

    return-void
.end method

.method static synthetic f(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    return p1
.end method

.method static synthetic g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ax:Z

    return p1
.end method

.method static synthetic h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Z)V

    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Z)V

    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z
    .locals 1

    .prologue
    .line 101
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private l()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 992
    const/16 v0, 0x9b

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    .line 993
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m:Landroid/app/Activity;

    .line 994
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    .line 995
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aG:Ljava/util/Random;

    .line 997
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->S:I

    .line 998
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->T:I

    .line 999
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->U:I

    .line 1001
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->au:Ljava/util/concurrent/ExecutorService;

    .line 1002
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    .line 1003
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    .line 1010
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B:Ljava/util/List;

    .line 1011
    new-instance v0, Lcom/qihoo360/mobilesafe/b/g;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/b/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->C:Lcom/qihoo360/mobilesafe/b/g;

    .line 1012
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    .line 1014
    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ap:I

    .line 1015
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string/jumbo v1, "power"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 1016
    const v1, 0x2000000a

    const-string/jumbo v2, "VirusScanFragmentV3"

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ay:Landroid/os/PowerManager$WakeLock;

    .line 1017
    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1018
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "."

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const-string/jumbo v2, ".."

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string/jumbo v2, "..."

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J:[Ljava/lang/String;

    .line 1019
    iput v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K:I

    .line 1020
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c00fb

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    .line 1021
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M:Ljava/lang/String;

    .line 1022
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$23;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$23;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$23;->start()V

    .line 1039
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v1, "key_check_ave_config_over"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1040
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$34;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$34;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$34;->start()V

    .line 1050
    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private m()V
    .locals 9

    .prologue
    const/16 v8, 0x11

    const/4 v7, -0x2

    const/high16 v6, 0x41200000    # 10.0f

    const v5, 0x7f080056

    const/high16 v4, 0x42200000    # 40.0f

    .line 1081
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0231

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/widget/RadarView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    .line 1082
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0233

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1083
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0234

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1084
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0237

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1085
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0238

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->w:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1087
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0230

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/widget/RadarProgressBar;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    .line 1088
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0235

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    .line 1089
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 1090
    new-instance v1, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    .line 1091
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c012a

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setText(Ljava/lang/String;)V

    .line 1092
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v2

    const v3, 0x7f020152

    invoke-virtual {v2, v3}, Lcom/qihoo/security/ui/b/a;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1095
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setTopView(Landroid/view/View;)V

    .line 1096
    new-instance v1, Lcom/qihoo360/mobilesafe/b/e;

    invoke-direct {v1, v0}, Lcom/qihoo360/mobilesafe/b/e;-><init>(I)V

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I:Lcom/qihoo360/mobilesafe/b/e;

    .line 1097
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0, p0}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e$a;)V

    .line 1098
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/malware/widget/RadarView;->setRadarViewAnimationListener(Lcom/qihoo/security/malware/widget/RadarView$a;)V

    .line 1100
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->setButtonAnimatorListener(Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;)V

    .line 1136
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b023a

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    .line 1137
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1138
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b023c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1140
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0240

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1142
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0244

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1145
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0239

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    .line 1149
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->z:Landroid/widget/LinearLayout$LayoutParams;

    .line 1151
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->z:Landroid/widget/LinearLayout$LayoutParams;

    iput v8, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1152
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->z:Landroid/widget/LinearLayout$LayoutParams;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v1, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1153
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->z:Landroid/widget/LinearLayout$LayoutParams;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v1, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1155
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v1, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v2, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    .line 1156
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    iput v8, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1157
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v1, v6}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1158
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A:Landroid/widget/LinearLayout$LayoutParams;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v1, v6}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1159
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1160
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$37;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1177
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b00eb

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a:Landroid/view/View;

    .line 1178
    return-void
.end method

.method static synthetic n(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private n()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 1187
    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aM:Z

    .line 1188
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    .line 1189
    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    .line 1190
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0124

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    .line 1192
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$38;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$38;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$38;->start()V

    .line 1198
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1199
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    .line 1200
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I()V

    .line 1201
    const/16 v0, 0x36b2

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1202
    return-void
.end method

.method static synthetic o(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private o()V
    .locals 9

    .prologue
    const-wide/16 v0, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 1206
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    invoke-virtual {v2}, Lcom/qihoo/security/malware/widget/RadarView;->b()V

    .line 1207
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y()[I

    move-result-object v2

    .line 1208
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A()[I

    move-result-object v3

    .line 1209
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B()I

    move-result v4

    .line 1211
    aget v5, v2, v8

    aget v6, v3, v7

    add-int/2addr v5, v6

    add-int/2addr v5, v4

    if-lez v5, :cond_5

    .line 1212
    iput-boolean v8, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    .line 1213
    iget-object v5, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v5, v7}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1214
    iget-object v5, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v5, v7}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1216
    :cond_0
    aget v5, v2, v7

    add-int/2addr v5, v4

    aget v6, v3, v7

    add-int/2addr v5, v6

    iput v5, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    .line 1217
    aget v5, v2, v8

    if-lez v5, :cond_3

    .line 1218
    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v2, v7}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1224
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V

    .line 1228
    :goto_1
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u()V

    .line 1229
    new-instance v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$39;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$39;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$39;->start()V

    .line 1236
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v3, "malware_fast_scan_time"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 1238
    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    .line 1239
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    .line 1241
    :cond_2
    const/16 v2, 0x36b3

    long-to-int v0, v0

    invoke-static {v2, v0}, Lcom/qihoo/security/support/b;->b(II)V

    .line 1242
    return-void

    .line 1219
    :cond_3
    aget v5, v3, v7

    add-int/2addr v5, v4

    if-nez v5, :cond_4

    .line 1220
    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v2, v7}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    goto :goto_0

    .line 1221
    :cond_4
    const/4 v5, 0x3

    aget v2, v2, v5

    aget v3, v3, v7

    add-int/2addr v2, v3

    add-int/2addr v2, v4

    if-lez v2, :cond_1

    .line 1222
    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v2, v7}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    goto :goto_0

    .line 1226
    :cond_5
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v4, 0xa

    invoke-virtual {v2, v7, v4, v5}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1
.end method

.method static synthetic p(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private p()V
    .locals 2

    .prologue
    .line 1245
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$40;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$40;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 1260
    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Lcom/nineoldandroids/a/a$a;)V

    .line 1282
    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1283
    return-void
.end method

.method static synthetic q(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private q()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const-wide/16 v4, 0x12c

    const/4 v3, 0x0

    .line 1286
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$3;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 1301
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a:Landroid/view/View;

    const-string/jumbo v6, "alpha"

    new-array v7, v9, [F

    aput v3, v7, v8

    invoke-static {v1, v6, v7}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 1302
    invoke-virtual {v1, v4, v5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1306
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v6, "alpha"

    new-array v7, v9, [F

    aput v3, v7, v8

    invoke-static {v0, v6, v7}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 1308
    invoke-virtual {v1}, Lcom/nineoldandroids/a/k;->a()V

    .line 1309
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 1310
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1311
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$4;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 1326
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 1327
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 1342
    :cond_1
    return-void
.end method

.method static synthetic r(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 1345
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1346
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    .line 1348
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n()V

    .line 1350
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->q()V

    .line 1352
    :cond_1
    return-void
.end method

.method static synthetic s(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private s()V
    .locals 11

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const-wide/16 v4, 0x12c

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 1355
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 1356
    iput-boolean v10, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    .line 1357
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0129

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    .line 1358
    iput-boolean v9, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    .line 1360
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-class v7, Lcom/qihoo/security/service/PackageMonitorService;

    invoke-direct {v1, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 1361
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1362
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y()[I

    move-result-object v0

    .line 1363
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->A()[I

    move-result-object v1

    .line 1364
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->B()I

    move-result v6

    .line 1366
    aget v7, v0, v10

    aget v8, v1, v9

    add-int/2addr v7, v8

    add-int/2addr v7, v6

    if-lez v7, :cond_5

    .line 1367
    iput-boolean v10, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    .line 1368
    iget-object v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v7, v9}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 1369
    iget-object v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v7, v9}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1371
    :cond_0
    aget v7, v0, v9

    add-int/2addr v7, v6

    aget v8, v1, v9

    add-int/2addr v7, v8

    iput v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    .line 1372
    aget v7, v0, v10

    if-lez v7, :cond_1

    .line 1373
    sget-object v7, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v7, v9}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1376
    :cond_1
    aget v7, v0, v10

    if-nez v7, :cond_2

    const/4 v7, 0x3

    aget v0, v0, v7

    aget v1, v1, v9

    add-int/2addr v0, v1

    add-int/2addr v0, v6

    if-lez v0, :cond_2

    .line 1377
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v9}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1379
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V

    .line 1380
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    .line 1381
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$6;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 1389
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$7;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1, v4, v5}, Lcom/qihoo/security/malware/widget/RadarView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1415
    :goto_0
    iput-boolean v10, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    .line 1416
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I()V

    .line 1417
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v()V

    .line 1418
    const/16 v0, 0x36b4

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1419
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$10;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$10;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$10;->start()V

    .line 1426
    :cond_4
    return-void

    .line 1396
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v6, 0xa

    invoke-virtual {v0, v9, v6, v7}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    .line 1397
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_6

    .line 1398
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$8;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$8;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    goto :goto_0

    .line 1406
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$9;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1, v4, v5}, Lcom/qihoo/security/malware/widget/RadarView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method static synthetic t(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private t()V
    .locals 2

    .prologue
    .line 1429
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1430
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->av:[B

    monitor-enter v1

    .line 1431
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 1432
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 1433
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    .line 1435
    :cond_0
    monitor-exit v1

    .line 1436
    return-void

    .line 1435
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic u(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private u()V
    .locals 6

    .prologue
    const-wide/16 v4, -0x1

    .line 1440
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 1441
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E:Z

    .line 1442
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    .line 1443
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/service/e;->a(Landroid/content/Context;J)V

    .line 1444
    new-instance v0, Lcom/qihoo/security/malware/a;

    invoke-direct {v0}, Lcom/qihoo/security/malware/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    .line 1445
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aH:Lcom/qihoo/security/malware/a$e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a;->a(Lcom/qihoo/security/malware/a$e;)V

    .line 1446
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a;->a()V

    .line 1447
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a;->c()V

    .line 1448
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v1, "malware_last_scan_time"

    invoke-static {v0, v1, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    .line 1449
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aB:J

    .line 1451
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x6

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    .line 1452
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x7

    const-wide/32 v2, 0x249f0

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    .line 1453
    return-void
.end method

.method static synthetic v(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private v()V
    .locals 6

    .prologue
    const/4 v5, 0x6

    const/4 v4, 0x0

    .line 1457
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 1458
    iput-boolean v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E:Z

    .line 1459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    .line 1460
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/service/e;->a(Landroid/content/Context;J)V

    .line 1461
    new-instance v0, Lcom/qihoo/security/malware/a;

    invoke-direct {v0}, Lcom/qihoo/security/malware/a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    .line 1462
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aI:Lcom/qihoo/security/malware/a$e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a;->a(Lcom/qihoo/security/malware/a$e;)V

    .line 1463
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a;->a()V

    .line 1464
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a;->d()V

    .line 1465
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aB:J

    .line 1466
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v5, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    .line 1467
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1468
    return-void
.end method

.method static synthetic w(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private w()V
    .locals 11

    .prologue
    const/16 v2, 0x37eb

    const/16 v8, 0x37e4

    const/4 v3, 0x7

    const/4 v1, 0x6

    const/4 v10, 0x0

    .line 1471
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1472
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1474
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1475
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1477
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    .line 1478
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-eqz v0, :cond_2

    .line 1479
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    const/16 v1, 0x62

    if-lt v0, v1, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    sub-long/2addr v0, v4

    .line 1480
    :goto_0
    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v3, :cond_9

    .line 1481
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    if-nez v3, :cond_8

    .line 1482
    const/16 v3, 0x37fd

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v8, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v7}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "-1"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v5, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1508
    :cond_2
    :goto_1
    iput-boolean v10, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    .line 1509
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1510
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1512
    :cond_3
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 1513
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a;->g()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1514
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a;->a(Lcom/qihoo/security/malware/a$c;)V

    .line 1515
    invoke-direct {p0, v10}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Z)V

    .line 1516
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    .line 1517
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G:Z

    if-nez v0, :cond_e

    .line 1518
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    if-nez v0, :cond_c

    .line 1519
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_b

    const/16 v0, 0x37fb

    :goto_2
    iget-wide v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "-1"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    sub-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1549
    :goto_3
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$11;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$11;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$11;->start()V

    .line 1561
    :cond_5
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->start()V

    .line 1588
    :cond_6
    return-void

    .line 1479
    :cond_7
    const-wide/16 v0, -0x1

    goto/16 :goto_0

    .line 1487
    :cond_8
    const/16 v3, 0x37fd

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v8, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v7}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v7}, Lcom/qihoo/security/malware/a;->f()J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v7, "|"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v4, v5, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1494
    :cond_9
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    if-nez v3, :cond_a

    .line 1495
    iget v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v6}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "-1"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v3, v4, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1500
    :cond_a
    iget v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v6}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v6}, Lcom/qihoo/security/malware/a;->f()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string/jumbo v6, "|"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v3, v4, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_b
    move v0, v2

    .line 1519
    goto/16 :goto_2

    .line 1525
    :cond_c
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_d

    const/16 v2, 0x37fb

    :cond_d
    iget-wide v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v4}, Lcom/qihoo/security/malware/a;->f()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    sub-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v1, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 1533
    :cond_e
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    if-nez v0, :cond_10

    .line 1534
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_f

    const/16 v0, 0x37fc

    :goto_4
    iget-wide v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "-1"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    sub-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_f
    const/16 v0, 0x37ec

    goto :goto_4

    .line 1541
    :cond_10
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_11

    const/16 v0, 0x37fc

    :goto_5
    iget-wide v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aK:J

    iget-wide v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aL:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aE:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->V:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v4}, Lcom/qihoo/security/malware/a;->f()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aF:J

    sub-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_11
    const/16 v0, 0x37ec

    goto :goto_5
.end method

.method static synthetic x(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private x()[I
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 1802
    const/4 v0, 0x5

    new-array v1, v0, [I

    .line 1803
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/a;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 1804
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 1805
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1806
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1807
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1808
    if-eqz v0, :cond_0

    .line 1811
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1812
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1813
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 1816
    :cond_1
    iget-boolean v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget-object v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    if-eqz v3, :cond_0

    :cond_2
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1820
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1821
    aget v0, v1, v6

    add-int/lit8 v0, v0, 0x1

    aput v0, v1, v6

    goto :goto_0

    .line 1822
    :cond_3
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isAdvert()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1823
    aget v0, v1, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, v1, v5

    goto :goto_0

    .line 1824
    :cond_4
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1825
    const/4 v0, 0x2

    aget v3, v1, v0

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v0

    goto :goto_0

    .line 1831
    :cond_5
    invoke-static {}, Lcom/qihoo/security/leak/d;->a()Lcom/qihoo/security/leak/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/leak/d;->c()Ljava/util/List;

    move-result-object v0

    .line 1832
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/leak/c;

    .line 1833
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1834
    const/4 v0, 0x3

    aget v3, v1, v0

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v0

    goto :goto_1

    .line 1839
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v2, "setting_auto_start"

    invoke-static {v0, v2, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1840
    aput v6, v1, v7

    .line 1845
    :goto_2
    return-object v1

    .line 1842
    :cond_8
    aput v5, v1, v7

    goto :goto_2
.end method

.method static synthetic y(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    return-object v0
.end method

.method private y()[I
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1857
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/a;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 1859
    const/4 v1, 0x4

    new-array v1, v1, [I

    .line 1860
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 1861
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1862
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1863
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1864
    if-eqz v0, :cond_0

    .line 1865
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1866
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1867
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 1869
    :cond_1
    sget-boolean v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->k:Z

    if-eqz v3, :cond_2

    .line 1870
    iput-boolean v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    .line 1872
    :cond_2
    iget-boolean v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget-object v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    if-eqz v3, :cond_0

    :cond_3
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isFileExist()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1877
    const/4 v3, 0x0

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    .line 1879
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1880
    aget v3, v1, v5

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v5

    .line 1882
    iget-boolean v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v3, :cond_4

    .line 1883
    const/4 v3, 0x2

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    .line 1886
    :cond_4
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1887
    const/4 v0, 0x3

    aget v3, v1, v0

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v0

    goto :goto_0

    .line 1893
    :cond_5
    return-object v1
.end method

.method static synthetic z(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z
    .locals 1

    .prologue
    .line 101
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G:Z

    return v0
.end method

.method private z()[I
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1906
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/a;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 1908
    const/4 v1, 0x4

    new-array v1, v1, [I

    .line 1909
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 1910
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1911
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1912
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1913
    if-eqz v0, :cond_0

    .line 1914
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1915
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 1916
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 1918
    :cond_1
    sget-boolean v3, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->k:Z

    if-eqz v3, :cond_2

    .line 1919
    iput-boolean v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    .line 1921
    :cond_2
    iget-boolean v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    iget-object v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    if-eqz v3, :cond_0

    :cond_3
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1926
    const/4 v3, 0x0

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    .line 1928
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isAdvert()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1929
    aget v3, v1, v5

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v5

    .line 1931
    iget-boolean v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v3, :cond_4

    .line 1932
    const/4 v3, 0x2

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    .line 1935
    :cond_4
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1936
    const/4 v0, 0x3

    aget v3, v1, v0

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v0

    goto :goto_0

    .line 1942
    :cond_5
    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x12c

    const/4 v1, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 2028
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a()V

    .line 2029
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-eqz v0, :cond_3

    .line 2030
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2034
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H:Z

    if-eqz v0, :cond_0

    .line 2035
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H()V

    .line 2037
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-nez v0, :cond_2

    .line 2038
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2040
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$17;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$17;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 2048
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 2049
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$18;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$18;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 2059
    :cond_2
    const/16 v0, 0x36b1

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 2060
    return-void

    .line 2032
    :cond_3
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 2798
    return-void
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 1629
    const-string/jumbo v0, "custom_action"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aA:I

    .line 1630
    const-string/jumbo v0, "jump_result_page"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 1631
    if-eqz v0, :cond_0

    .line 1632
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Landroid/content/Intent;)V

    .line 1634
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2902
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2976
    :cond_0
    :goto_0
    return-void

    .line 2905
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 2907
    :pswitch_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N:Z

    if-nez v0, :cond_0

    .line 2911
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2912
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J:[Ljava/lang/String;

    iget v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K:I

    rem-int/lit8 v4, v4, 0x3

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 2918
    :goto_1
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K:I

    .line 2919
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v4, 0x3e8

    invoke-virtual {v0, v3, v4, v5}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 2914
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M:Ljava/lang/String;

    .line 2915
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J:[Ljava/lang/String;

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K:I

    rem-int/lit8 v2, v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 2923
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-ne v0, v2, :cond_3

    move v1, v2

    :goto_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/malware/vo/a;

    iget v4, p1, Landroid/os/Message;->arg2:I

    if-ne v4, v2, :cond_4

    :goto_3
    invoke-direct {p0, v1, v0, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZLcom/qihoo/security/malware/vo/a;Z)V

    goto :goto_0

    :cond_3
    move v1, v3

    goto :goto_2

    :cond_4
    move v2, v3

    goto :goto_3

    .line 2927
    :pswitch_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    .line 2928
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O:I

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->P:I

    if-gt v0, v1, :cond_0

    .line 2931
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v5, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    .line 2932
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O()V

    .line 2935
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->O:I

    goto/16 :goto_0

    .line 2939
    :pswitch_4
    invoke-direct {p0, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Z)V

    goto/16 :goto_0

    .line 2943
    :pswitch_5
    iget v0, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v1, v0, 0x1

    .line 2944
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am:[F

    array-length v0, v0

    .line 2945
    :goto_4
    if-ge v1, v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-eqz v0, :cond_0

    .line 2946
    invoke-direct {p0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(I)V

    goto/16 :goto_0

    .line 2944
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al:[F

    array-length v0, v0

    goto :goto_4

    .line 2951
    :pswitch_6
    const/16 v0, 0x37fe

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/a;->e()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 2952
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v4, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 2956
    :pswitch_7
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    .line 2957
    const/16 v0, 0x37ff

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/a;->e()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 2958
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2959
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 2961
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2962
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 2964
    :cond_7
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    if-ne v0, v5, :cond_9

    .line 2965
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    if-eqz v0, :cond_9

    .line 2966
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an:Lcom/qihoo/security/malware/a;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a;->a(Lcom/qihoo/security/malware/a$c;)V

    .line 2967
    invoke-direct {p0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Z)V

    .line 2970
    :cond_9
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K()V

    goto/16 :goto_0

    .line 2905
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V
    .locals 4

    .prologue
    .line 2064
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 2066
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-eq p1, v0, :cond_0

    .line 2067
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v1, "malware_find_issue_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 2070
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 2071
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    const-string/jumbo v1, "malware_find_issue_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 2073
    :cond_1
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 2074
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I:Lcom/qihoo360/mobilesafe/b/e;

    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    .line 2075
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 2802
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 2806
    sget-object v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$35;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2827
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 2808
    :pswitch_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    if-eqz v0, :cond_1

    .line 2809
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M()V

    .line 2811
    :cond_1
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)Z

    goto :goto_0

    .line 2814
    :pswitch_2
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    if-eqz v0, :cond_0

    .line 2815
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M()V

    goto :goto_0

    .line 2822
    :pswitch_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->W:Z

    goto :goto_0

    .line 2806
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/ui/main/FragmentsObservable;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 0

    .prologue
    .line 2482
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/FragmentsObservable;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 2483
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 2511
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H()V

    .line 2512
    return-void
.end method

.method public b()Z
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v0, 0x1

    .line 2317
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aM:Z

    if-nez v1, :cond_0

    .line 2331
    :goto_0
    return v0

    .line 2320
    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-eqz v1, :cond_1

    .line 2321
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E()V

    goto :goto_0

    .line 2324
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    if-eqz v0, :cond_2

    .line 2325
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aO:Z

    if-eqz v0, :cond_3

    .line 2326
    const/16 v0, 0x37f6

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 2331
    :cond_2
    :goto_1
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b()Z

    move-result v0

    goto :goto_0

    .line 2328
    :cond_3
    const/16 v0, 0x37f5

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_1
.end method

.method public b_()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/4 v11, 0x4

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v10, 0x0

    .line 2630
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 2631
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 2632
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->t:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    const-wide/16 v4, 0x64

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 2633
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->u:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    const-wide/16 v4, 0x64

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 2635
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2636
    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    new-instance v5, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$24;

    invoke-direct {v5, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$24;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    const-wide/16 v8, 0x12c

    move v6, v3

    move v7, v2

    invoke-static/range {v4 .. v9}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 2644
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 2645
    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->y:Landroid/widget/LinearLayout;

    new-instance v5, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$25;

    invoke-direct {v5, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$25;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    const-wide/16 v8, 0x12c

    move v6, v3

    move v7, v2

    invoke-static/range {v4 .. v9}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 2656
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->b()V

    .line 2657
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0135

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->L:Ljava/lang/String;

    .line 2659
    const/16 v0, 0xc

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;Lcom/qihoo/security/ui/b/b$b;)V

    .line 2661
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aC:Z

    if-eqz v0, :cond_3

    .line 2663
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aG:Ljava/util/Random;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    .line 2664
    rsub-int/lit8 v1, v0, 0x63

    iput v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ak:I

    .line 2665
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am:[F

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ak:I

    mul-int/lit16 v2, v2, 0x168

    div-int/lit8 v2, v2, 0x64

    int-to-float v2, v2

    aput v2, v1, v11

    .line 2679
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    const v2, 0xea60

    aput v2, v1, v10

    .line 2680
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    const/16 v2, 0x3a98

    aput v2, v1, v12

    .line 2681
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    const/4 v2, 0x2

    const/16 v3, 0x5208

    aput v3, v1, v2

    .line 2682
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    const/4 v2, 0x3

    const v3, 0x88b8

    aput v3, v1, v2

    .line 2683
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y:[I

    mul-int/lit8 v0, v0, 0x8

    mul-int/lit16 v0, v0, 0x3e8

    aput v0, v1, v11

    .line 2703
    :goto_1
    invoke-direct {p0, v10}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(I)V

    .line 2705
    return-void

    .line 2657
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0133

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2694
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const v1, 0x80e8

    aput v1, v0, v10

    .line 2695
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const/16 v1, 0x1f40

    aput v1, v0, v12

    .line 2696
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const/4 v1, 0x2

    const/16 v2, 0x2710

    aput v2, v0, v1

    .line 2697
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const/4 v1, 0x3

    const/16 v2, 0x4a38

    aput v2, v0, v1

    .line 2698
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const/16 v1, 0x6590

    aput v1, v0, v11

    .line 2699
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const/4 v1, 0x5

    const/16 v2, 0x6d60

    aput v2, v0, v1

    .line 2700
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->X:[I

    const/4 v1, 0x6

    const/16 v2, 0x5208

    aput v2, v0, v1

    goto :goto_1
.end method

.method public c()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x1

    .line 2348
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c()V

    .line 2349
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aN:Z

    if-eqz v0, :cond_0

    .line 2350
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aO:Z

    if-eqz v0, :cond_1

    .line 2351
    const/16 v0, 0x37f6

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 2356
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->E()V

    .line 2357
    return-void

    .line 2353
    :cond_1
    const/16 v0, 0x37f5

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto :goto_0
.end method

.method public d()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2487
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G:Z

    if-eqz v1, :cond_1

    .line 2495
    :cond_0
    :goto_0
    return v0

    .line 2491
    :cond_1
    invoke-virtual {p0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2492
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 980
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 984
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l()V

    .line 985
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m()V

    .line 986
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aD:Z

    if-eqz v0, :cond_0

    .line 987
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Landroid/content/Intent;)V

    .line 989
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const v2, 0x7f080056

    .line 1990
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1994
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    .line 1995
    iput-boolean v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->R:Z

    .line 1997
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1998
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ar:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 1999
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 2000
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->w:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 2001
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/widget/RadarView;->setColor(I)V

    .line 2002
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setColor(I)V

    .line 2003
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->setColor(I)V

    .line 2005
    iput-boolean v4, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->as:Z

    .line 2006
    const-string/jumbo v0, "is_deep_scan"

    invoke-virtual {p3, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->d(Z)V

    .line 2016
    :goto_0
    return-void

    .line 2008
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 2009
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->n:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    .line 2010
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->az:Z

    .line 2014
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1756
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ax:Z

    if-eqz v0, :cond_0

    .line 1757
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ax:Z

    .line 1758
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Z)V

    .line 1759
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->isResumed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1786
    :cond_0
    :goto_0
    return-void

    .line 1765
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1767
    :sswitch_0
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aw:Z

    if-nez v0, :cond_2

    .line 1768
    const/16 v0, 0x14

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->a(I)V

    .line 1769
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b()V

    .line 1770
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->d(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 1771
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/recommend/RecommendHelper;->b(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;)V

    .line 1772
    sget-object v0, Lcom/qihoo/security/ui/main/FragmentsObservable$Action;->HideRecmdAin:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    goto :goto_0

    .line 1778
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 1782
    :sswitch_1
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->q:Z

    .line 1783
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D()V

    goto :goto_0

    .line 1765
    :sswitch_data_0
    .sparse-switch
        0x7f0b0235 -> :sswitch_0
        0x7f0b0239 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 954
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onCreate(Landroid/os/Bundle;)V

    .line 955
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 957
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_MALWARE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_RISKY_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 958
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "jump_result_page"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aD:Z

    .line 961
    :cond_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    const v2, 0x7f0300ae

    .line 965
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    .line 966
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    if-nez v0, :cond_0

    .line 970
    new-instance v0, Lcom/qihoo/security/ui/b/a$f;

    invoke-direct {v0}, Lcom/qihoo/security/ui/b/a$f;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    .line 971
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    const/4 v1, 0x0

    invoke-virtual {p1, v2, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 973
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aJ:Lcom/qihoo/security/ui/b/a$f;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    .line 975
    return-object v0
.end method

.method public onDestroy()V
    .locals 5

    .prologue
    const/4 v4, 0x7

    const/4 v3, 0x6

    const/4 v2, 0x0

    .line 1723
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onDestroy()V

    .line 1724
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->av:[B

    monitor-enter v1

    .line 1725
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 1726
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at:Ljava/util/concurrent/ExecutorService;

    .line 1727
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1728
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->au:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 1729
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1730
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1732
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1733
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1735
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1736
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 1738
    :cond_2
    return-void

    .line 1727
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 1717
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onPause()V

    .line 1718
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G:Z

    .line 1719
    return-void
.end method

.method public onResume()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1638
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onResume()V

    .line 1642
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G:Z

    .line 1644
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->D:Z

    if-eqz v0, :cond_0

    .line 1702
    :goto_0
    return-void

    .line 1648
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H:Z

    if-eqz v0, :cond_1

    .line 1649
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H()V

    goto :goto_0

    .line 1653
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->W:Z

    if-eqz v0, :cond_2

    .line 1654
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->M()V

    .line 1655
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->W:Z

    .line 1658
    :cond_2
    new-instance v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->start()V

    .line 1674
    iput v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1675
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_3

    .line 1677
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ao:Z

    .line 1680
    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "custom_action"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aA:I

    .line 1681
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "custom_action"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1682
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aA:I

    if-ne v0, v3, :cond_4

    .line 1683
    invoke-direct {p0, v2, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V

    .line 1684
    iput v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1685
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r()V

    .line 1701
    :goto_1
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->R:Z

    goto :goto_0

    .line 1686
    :cond_4
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aA:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 1687
    const/16 v0, 0xa

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    .line 1690
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1691
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->getChildFragmentManager()Landroid/support/v4/app/f;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/f;->c()Z

    .line 1693
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s()V

    .line 1694
    invoke-direct {p0, v2, v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V

    goto :goto_1

    .line 1695
    :cond_5
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aA:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 1696
    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V

    .line 1697
    iput v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aq:I

    goto :goto_1

    .line 1699
    :cond_6
    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(ZZ)V

    goto :goto_1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 247
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 1621
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onStart()V

    .line 1625
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 1706
    invoke-super {p0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onStop()V

    .line 1710
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .prologue
    .line 2788
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->v:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 2789
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->w:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 2790
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->o:Lcom/qihoo/security/malware/widget/RadarView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/malware/widget/RadarView;->setColor(I)V

    .line 2791
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->r:Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->setColor(I)V

    .line 2792
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s:Lcom/qihoo/security/malware/widget/RadarProgressBar;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->setColor(I)V

    .line 2793
    return-void
.end method
