.class public abstract Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
.super Landroid/app/Activity;
.source "BaseLockPatternActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;,
        Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;,
        Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    }
.end annotation


# static fields
.field public static final _AutoSave:Ljava/lang/String;

.field public static final _ClassName:Ljava/lang/String;

.field public static final _EncrypterClass:Ljava/lang/String;

.field public static final _MaxRetry:Ljava/lang/String;

.field public static final _Mode:Ljava/lang/String; = "lockpattern_mode"

.field public static final _Pattern:Ljava/lang/String;

.field public static final _Theme:Ljava/lang/String;


# instance fields
.field protected ELI_LockImage:Landroid/view/View;

.field protected errorCode:Ljava/lang/String;

.field protected errorMessage:Ljava/lang/String;

.field protected errorPattern:Ljava/lang/String;

.field protected headerContainer:Landroid/view/View;

.field private mAutoSave:Z

.field public mBtnConfirm:Landroid/widget/Button;

.field public mBtnPasswordSignIn:Landroid/widget/Button;

.field public mBtnPatternHelp:Landroid/widget/Button;

.field private final mBtnResetOnClickListener:Landroid/view/View$OnClickListener;

.field private mBtnRestart:Landroid/widget/Button;

.field protected mDividerLine:Landroid/view/View;

.field protected mDynamicTxtInfo:Landroid/widget/TextView;

.field private mEncrypter:Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;

.field protected mFooter:Landroid/view/View;

.field protected mLastPattern:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;"
        }
    .end annotation
.end field

.field protected mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

.field protected final mLockPatternViewReloader:Ljava/lang/Runnable;

.field protected mLoginFooter:Landroid/view/View;

.field private mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

.field private final mPatternViewListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

.field private mPrefs:Landroid/content/SharedPreferences;

.field protected mTxtInfo:Landroid/widget/TextView;

.field protected userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 55
    const-class v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_ClassName:Ljava/lang/String;

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_ClassName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".theme"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_Theme:Ljava/lang/String;

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_ClassName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".auto_save"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_AutoSave:Ljava/lang/String;

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_ClassName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".max_retry"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_MaxRetry:Ljava/lang/String;

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_ClassName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".pattern"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_Pattern:Ljava/lang/String;

    .line 176
    const-class v0, Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_EncrypterClass:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 593
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;

    invoke-direct {v0, p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$4;-><init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V

    iput-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPatternViewListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    .line 702
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;

    invoke-direct {v0, p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$5;-><init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V

    iput-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnResetOnClickListener:Landroid/view/View$OnClickListener;

    .line 792
    new-instance v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;

    invoke-direct {v0, p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$6;-><init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V

    iput-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternViewReloader:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$100(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;
    .locals 1
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    .prologue
    .line 53
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPatternViewListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    return-object v0
.end method

.method static synthetic access$200(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Landroid/widget/Button;
    .locals 1
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    .prologue
    .line 53
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$300(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V
    .locals 0
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
    .param p1, "x1"    # Landroid/widget/Button;

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    return-void
.end method

.method static synthetic access$400(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;
    .locals 1
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    .prologue
    .line 53
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    return-object v0
.end method

.method static synthetic access$500(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Landroid/widget/Button;)V
    .locals 0
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
    .param p1, "x1"    # Landroid/widget/Button;

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    return-void
.end method

.method static synthetic access$600(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Ljava/util/List;)V
    .locals 0
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
    .param p1, "x1"    # Ljava/util/List;

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->doCreatePattern(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$700(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;Ljava/util/List;)V
    .locals 0
    .param p0, "x0"    # Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;
    .param p1, "x1"    # Ljava/util/List;

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->doComparePattern(Ljava/util/List;)V

    return-void
.end method

.method private final disableButton(Landroid/widget/Button;)V
    .locals 4
    .param p1, "button"    # Landroid/widget/Button;

    .prologue
    .line 762
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 767
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 768
    .local v0, "alpha":Landroid/view/animation/AlphaAnimation;
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 769
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 770
    invoke-virtual {p1, v0}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    .line 771
    return-void
.end method

.method private doComparePattern(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 438
    .local p1, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    if-nez p1, :cond_0

    .line 454
    :goto_0
    return-void

    .line 441
    :cond_0
    iget-object v2, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setTag(Ljava/lang/Object;)V

    .line 442
    invoke-static {p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToStringValue(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 444
    .local v1, "patternVal":Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 446
    .local v0, "i":Landroid/content/Intent;
    const-string v2, "mypattern"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 447
    const-string v2, "maskedUserName"

    iget-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 448
    const-string v2, "LockPatternAction"

    const-string v3, "compare"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 451
    const/16 v2, 0x15b3

    invoke-virtual {p0, v2, v0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->setResult(ILandroid/content/Intent;)V

    .line 452
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->finish()V

    goto :goto_0
.end method

.method private doCreatePattern(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    const/16 v10, 0x11

    const/4 v9, 0x5

    const/16 v7, 0x14

    const/16 v6, 0xa

    const/4 v8, 0x0

    .line 461
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 463
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v1, v8}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 465
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 466
    .local v4, "title":Landroid/widget/TextView;
    const/high16 v5, 0x41b00000    # 22.0f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 467
    invoke-virtual {v4, v6, v6, v6, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 468
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 470
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 471
    .local v2, "message":Landroid/widget/TextView;
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 472
    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 473
    invoke-virtual {v2, v7, v9, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 475
    sget v5, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_next:I

    invoke-virtual {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v6}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 476
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x4

    if-ge v5, v6, :cond_0

    .line 477
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget-object v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V

    .line 483
    const-string v5, "Invalid Pattern"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 484
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 485
    sget v5, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_alert_pattern_length_short:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(I)V

    .line 486
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v5

    const-string v6, "Try Again"

    new-instance v7, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;

    invoke-direct {v7, p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$1;-><init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V

    invoke-virtual {v5, v6, v7}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 496
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 497
    .local v0, "alertDialog":Landroid/app/AlertDialog;
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 499
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 591
    .end local v0    # "alertDialog":Landroid/app/AlertDialog;
    :goto_0
    return-void

    .line 503
    :cond_0
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setTag(Ljava/lang/Object;)V

    .line 505
    invoke-static {p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToStringValue(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    .line 507
    .local v3, "patternClearTxtVal":Ljava/lang/String;
    if-eqz v3, :cond_2

    .line 509
    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Z_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->getPatternVal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Z_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->getPatternReverseVal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->getPatternVal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->getPatternReverseVal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Inv_L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->getPatternVal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->Inv_L_Pattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern;->getPatternReverseVal()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 517
    :cond_1
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget-object v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V

    .line 520
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    .line 522
    const-string v5, "Invalid Pattern"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 524
    sget v5, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_alert_pattern_too_common:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(I)V

    .line 525
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v5

    const-string v6, "Try Again"

    new-instance v7, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$2;

    invoke-direct {v7, p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$2;-><init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V

    invoke-virtual {v5, v6, v7}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 535
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 536
    .restart local v0    # "alertDialog":Landroid/app/AlertDialog;
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 538
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 547
    .end local v0    # "alertDialog":Landroid/app/AlertDialog;
    .end local v3    # "patternClearTxtVal":Ljava/lang/String;
    :cond_2
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    if-nez v5, :cond_3

    .line 548
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setTag(Ljava/lang/Object;)V

    .line 549
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    .line 550
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 552
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_pattern_recorded:I

    invoke-virtual {v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->sendAccessEvent(I)V

    .line 553
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    .line 554
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-direct {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    .line 555
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->disableInput()V

    goto/16 :goto_0

    .line 558
    :cond_3
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLastPattern:Ljava/util/List;

    invoke-virtual {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->encodePattern(Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, p1}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->encodePattern(Ljava/util/List;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 559
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v6, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_patterns_match:I

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(I)V

    .line 560
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    .line 561
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-direct {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    .line 562
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v5}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->disableInput()V

    goto/16 :goto_0

    .line 565
    :cond_4
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    .line 566
    const-string v5, "Pattern Mismatch"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 567
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 568
    sget v5, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_alert_pattern_mismatch:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(I)V

    .line 569
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v5

    const-string v6, "Try Again"

    new-instance v7, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;

    invoke-direct {v7, p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$3;-><init>(Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;)V

    invoke-virtual {v5, v6, v7}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 580
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 581
    .restart local v0    # "alertDialog":Landroid/app/AlertDialog;
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 583
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 588
    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget-object v6, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;->Wrong:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    invoke-virtual {v5, v6}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setDisplayMode(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;)V

    goto/16 :goto_0
.end method

.method private final enableButton(Landroid/widget/Button;)V
    .locals 5
    .param p1, "button"    # Landroid/widget/Button;

    .prologue
    const/4 v4, 0x1

    .line 741
    invoke-virtual {p1, v4}, Landroid/widget/Button;->setEnabled(Z)V

    .line 746
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const v1, 0x3ecccccd    # 0.4f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 747
    .local v0, "alpha":Landroid/view/animation/AlphaAnimation;
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 748
    invoke-virtual {v0, v4}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 749
    invoke-virtual {p1, v0}, Landroid/widget/Button;->startAnimation(Landroid/view/animation/Animation;)V

    .line 751
    return-void
.end method


# virtual methods
.method protected encodePattern(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 426
    .local p1, "pattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mEncrypter:Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;

    if-nez v1, :cond_0

    .line 427
    invoke-static {p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToSha1(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 430
    :goto_0
    return-object v1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mEncrypter:Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;

    invoke-static {p1}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternUtils;->patternToSha1(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p0, v2}, Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;->encrypt(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 431
    :catch_0
    move-exception v0

    .line 432
    .local v0, "t":Ljava/lang/Throwable;
    new-instance v1, Lgroup/pals/android/lib/ui/lockpattern/util/InvalidEncrypterException;

    invoke-direct {v1}, Lgroup/pals/android/lib/ui/lockpattern/util/InvalidEncrypterException;-><init>()V

    throw v1
.end method

.method protected getELI_LockImage(Landroid/view/View;)Landroid/view/View;
    .locals 0
    .param p1, "LockImage"    # Landroid/view/View;

    .prologue
    .line 403
    return-object p1
.end method

.method protected getHeaderContainer(Landroid/view/View;)Landroid/view/View;
    .locals 0
    .param p1, "View"    # Landroid/view/View;

    .prologue
    .line 408
    return-object p1
.end method

.method protected init()V
    .locals 12

    .prologue
    .line 273
    const-string v9, "BaseLockPatternActivity"

    const-string v10, "BaseLockPatternActivity init() called!!"

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    if-eqz v9, :cond_4

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 276
    .local v4, "info":Ljava/lang/CharSequence;
    :goto_0
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    if-eqz v9, :cond_5

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 278
    .local v2, "dynamicInfo":Ljava/lang/CharSequence;
    :goto_1
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    if-eqz v9, :cond_6

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v9}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 279
    .local v0, "btnConfirmText":Ljava/lang/CharSequence;
    :goto_2
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    if-eqz v9, :cond_7

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v9}, Landroid/widget/Button;->isEnabled()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 281
    .local v5, "isConfirmButtonEnabled":Ljava/lang/Boolean;
    :goto_3
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    if-eqz v9, :cond_8

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-virtual {v9}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 282
    .local v1, "btnResetText":Ljava/lang/CharSequence;
    :goto_4
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    if-eqz v9, :cond_9

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-virtual {v9}, Landroid/widget/Button;->isEnabled()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 284
    .local v6, "isResetButtonEnabled":Ljava/lang/Boolean;
    :goto_5
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    if-eqz v9, :cond_a

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v9}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getDisplayMode()Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;

    move-result-object v7

    .line 286
    .local v7, "lastDisplayMode":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;
    :goto_6
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    if-eqz v9, :cond_b

    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v9}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->getPattern()Ljava/util/List;

    move-result-object v8

    .line 289
    .local v8, "lastPattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :goto_7
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_text_info:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    .line 290
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_lockPattern:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    .line 292
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_dynamic_text_info:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    .line 293
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    const/16 v10, 0x10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->sendAccessibilityEvent(I)V

    .line 295
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_layout_footer:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mFooter:Landroid/view/View;

    .line 296
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_layout_login_footer:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLoginFooter:Landroid/view/View;

    .line 297
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->divider_line:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDividerLine:Landroid/view/View;

    .line 298
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_button_confirm:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    .line 299
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_button_restart:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    .line 300
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_button_passwordsignin:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnPasswordSignIn:Landroid/widget/Button;

    .line 301
    sget v9, Lgroup/pals/android/lib/ui/lockpattern/R$id;->alp_lpa_button_patternhelp:I

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnPatternHelp:Landroid/widget/Button;

    .line 303
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->headerContainer:Landroid/view/View;

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getHeaderContainer(Landroid/view/View;)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->headerContainer:Landroid/view/View;

    .line 304
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->ELI_LockImage:Landroid/view/View;

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getELI_LockImage(Landroid/view/View;)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->ELI_LockImage:Landroid/view/View;

    .line 306
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v9}, Landroid/widget/Button;->isEnabled()Z

    move-result v9

    if-nez v9, :cond_0

    .line 307
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    .line 308
    :cond_0
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-virtual {v9}, Landroid/widget/Button;->isEnabled()Z

    move-result v9

    if-nez v9, :cond_1

    .line 309
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-direct {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    .line 314
    :cond_1
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    const/4 v10, 0x1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v10}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setTag(Ljava/lang/Object;)V

    .line 319
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    sget v10, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_ELI_pattern_container_info:I

    invoke-virtual {p0, v10}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 322
    const/4 v3, 0x0

    .line 324
    .local v3, "hapticFeedbackEnabled":Z
    :try_start_0
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    const-string v10, "haptic_feedback_enabled"

    const/4 v11, 0x0

    invoke-static {v9, v10, v11}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v9

    if-eqz v9, :cond_c

    const/4 v3, 0x1

    .line 329
    :goto_8
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v9, v3}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setTactileFeedbackEnabled(Z)V

    .line 331
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPatternViewListener:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;

    invoke-virtual {v9, v10}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setOnPatternListener(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$OnPatternListener;)V

    .line 332
    if-eqz v8, :cond_2

    if-eqz v7, :cond_2

    .line 333
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v9, v7, v8}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->setPattern(Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;Ljava/util/List;)V

    .line 336
    :cond_2
    const-string v9, "BaseLockPatternActivity"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "info = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 337
    sget-object v9, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$7;->$SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode:[I

    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v10}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ordinal()I

    move-result v10

    aget v9, v9, v10

    packed-switch v9, :pswitch_data_0

    .line 398
    :cond_3
    :goto_9
    const/4 v9, 0x0

    invoke-virtual {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->setResult(I)V

    .line 399
    return-void

    .line 274
    .end local v0    # "btnConfirmText":Ljava/lang/CharSequence;
    .end local v1    # "btnResetText":Ljava/lang/CharSequence;
    .end local v2    # "dynamicInfo":Ljava/lang/CharSequence;
    .end local v3    # "hapticFeedbackEnabled":Z
    .end local v4    # "info":Ljava/lang/CharSequence;
    .end local v5    # "isConfirmButtonEnabled":Ljava/lang/Boolean;
    .end local v6    # "isResetButtonEnabled":Ljava/lang/Boolean;
    .end local v7    # "lastDisplayMode":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;
    .end local v8    # "lastPattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :cond_4
    const/4 v4, 0x0

    goto/16 :goto_0

    .line 276
    .restart local v4    # "info":Ljava/lang/CharSequence;
    :cond_5
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 278
    .restart local v2    # "dynamicInfo":Ljava/lang/CharSequence;
    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 279
    .restart local v0    # "btnConfirmText":Ljava/lang/CharSequence;
    :cond_7
    const/4 v5, 0x0

    goto/16 :goto_3

    .line 281
    .restart local v5    # "isConfirmButtonEnabled":Ljava/lang/Boolean;
    :cond_8
    const/4 v1, 0x0

    goto/16 :goto_4

    .line 282
    .restart local v1    # "btnResetText":Ljava/lang/CharSequence;
    :cond_9
    const/4 v6, 0x0

    goto/16 :goto_5

    .line 284
    .restart local v6    # "isResetButtonEnabled":Ljava/lang/Boolean;
    :cond_a
    const/4 v7, 0x0

    goto/16 :goto_6

    .line 286
    .restart local v7    # "lastDisplayMode":Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$DisplayMode;
    :cond_b
    const/4 v8, 0x0

    goto/16 :goto_7

    .line 324
    .restart local v3    # "hapticFeedbackEnabled":Z
    .restart local v8    # "lastPattern":Ljava/util/List;, "Ljava/util/List<Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView$Cell;>;"
    :cond_c
    const/4 v3, 0x0

    goto :goto_8

    .line 339
    :pswitch_0
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLoginFooter:Landroid/view/View;

    const/16 v10, 0x8

    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 340
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDividerLine:Landroid/view/View;

    const/16 v10, 0x8

    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 344
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    iget-object v10, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnResetOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v9, v10}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mFooter:Landroid/view/View;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 347
    if-eqz v4, :cond_f

    .line 348
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    :goto_a
    if-eqz v2, :cond_d

    .line 358
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    :cond_d
    if-eqz v0, :cond_e

    .line 362
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 364
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_10

    .line 365
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    .line 371
    :cond_e
    :goto_b
    if-eqz v1, :cond_3

    .line 372
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-virtual {v9, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 373
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_11

    .line 374
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-direct {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->enableButton(Landroid/widget/Button;)V

    goto :goto_9

    .line 350
    :cond_f
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    sget v10, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_an_unlock_pattern:I

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(I)V

    .line 351
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v10, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_an_unlock_pattern_inital_text:I

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(I)V

    goto :goto_a

    .line 367
    :cond_10
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    goto :goto_b

    .line 376
    :cond_11
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-direct {p0, v9}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    goto/16 :goto_9

    .line 382
    :pswitch_1
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mFooter:Landroid/view/View;

    const/16 v10, 0x8

    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 383
    if-eqz v4, :cond_12

    .line 384
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 385
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget v11, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_pattern_to_unlock:I

    invoke-virtual {p0, v11}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const/16 v11, 0x20

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 387
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_9

    .line 390
    :cond_12
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    sget v10, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_ELI_compare_title:I

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(I)V

    .line 391
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget v11, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_draw_pattern_to_unlock:I

    invoke-virtual {p0, v11}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const/16 v11, 0x20

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    iget-object v9, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_9

    .line 326
    :catch_0
    move-exception v9

    goto/16 :goto_8

    .line 337
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected initConfirmPattern()V
    .locals 2

    .prologue
    .line 776
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->clearPattern()V

    .line 778
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_confirm_pattern:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 780
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mDynamicTxtInfo:Landroid/widget/TextView;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_msg_redraw_pattern_to_confirm:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 782
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    sget v1, Lgroup/pals/android/lib/ui/lockpattern/R$string;->alp_cmd_save:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 784
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnConfirm:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    .line 785
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mBtnRestart:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->disableButton(Landroid/widget/Button;)V

    .line 786
    iget-object v0, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mLockPatternView:Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;

    invoke-virtual {v0}, Lgroup/pals/android/lib/ui/lockpattern/widget/LockPatternView;->enableInput()V

    .line 787
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 262
    sget-object v0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_ClassName:Ljava/lang/String;

    const-string v1, "onConfigurationChanged()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 264
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->init()V

    .line 265
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v5, 0x0

    .line 222
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 224
    const-class v3, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v5}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPrefs:Landroid/content/SharedPreferences;

    .line 227
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "lockpattern_mode"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 228
    .local v1, "strMode":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 229
    sget-object v3, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v3}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v1

    .line 231
    :cond_0
    sget-object v3, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v3}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 232
    sget-object v3, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    .line 237
    :goto_0
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    sget-object v4, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_AutoSave:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mAutoSave:Z

    .line 239
    iget-boolean v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mAutoSave:Z

    if-nez v3, :cond_1

    .line 240
    iget-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 243
    :cond_1
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    sget-object v4, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->_EncrypterClass:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 244
    .local v0, "encrypterClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-eqz v0, :cond_2

    .line 246
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mEncrypter:Lgroup/pals/android/lib/ui/lockpattern/util/IEncrypter;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    :cond_2
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "pattern"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorPattern:Ljava/lang/String;

    .line 253
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "errorcode"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorCode:Ljava/lang/String;

    .line 254
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "userName"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->userName:Ljava/lang/String;

    .line 255
    invoke-virtual {p0}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "errorMessage"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    .line 256
    const-string v3, "BaseLockPatternActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "errorCode = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorCode:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    const-string v3, "BaseLockPatternActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BaseLockPatternActivity ErrorMessage = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->errorMessage:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    return-void

    .line 234
    .end local v0    # "encrypterClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_3
    sget-object v3, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->ComparePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    iput-object v3, p0, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity;->mMode:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    goto/16 :goto_0

    .line 247
    .restart local v0    # "encrypterClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_0
    move-exception v2

    .line 248
    .local v2, "t":Ljava/lang/Throwable;
    new-instance v3, Lgroup/pals/android/lib/ui/lockpattern/util/InvalidEncrypterException;

    invoke-direct {v3}, Lgroup/pals/android/lib/ui/lockpattern/util/InvalidEncrypterException;-><init>()V

    throw v3
.end method
