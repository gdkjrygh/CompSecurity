.class public Lcom/facebook/common/n/b;
.super Lcom/facebook/c/k;
.source "NumberTruncationUtil.java"


# static fields
.field private static b:I

.field private static c:I

.field private static d:I


# instance fields
.field private final a:Landroid/content/Context;

.field private final e:Ljava/text/DecimalFormat;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 54
    const-string v0, "android.intent.action.LOCALE_CHANGED"

    new-instance v1, Lcom/facebook/common/n/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/facebook/common/n/d;-><init>(Lcom/facebook/common/n/c;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/c/k;-><init>(Ljava/lang/String;Lcom/facebook/c/b;)V

    .line 51
    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/n/b;->e:Ljava/text/DecimalFormat;

    .line 55
    iput-object p1, p0, Lcom/facebook/common/n/b;->a:Landroid/content/Context;

    .line 56
    iget-object v0, p0, Lcom/facebook/common/n/b;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.LOCALE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 57
    invoke-static {}, Lcom/facebook/common/n/b;->d()V

    .line 58
    return-void
.end method

.method static synthetic a()V
    .locals 0

    .prologue
    .line 18
    invoke-static {}, Lcom/facebook/common/n/b;->d()V

    return-void
.end method

.method private static d()V
    .locals 1

    .prologue
    .line 61
    invoke-static {}, Lcom/facebook/common/n/b;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    const/16 v0, 0x3e8

    sput v0, Lcom/facebook/common/n/b;->b:I

    .line 63
    const/4 v0, 0x3

    sput v0, Lcom/facebook/common/n/b;->c:I

    .line 64
    const/16 v0, 0x9

    sput v0, Lcom/facebook/common/n/b;->d:I

    .line 70
    :goto_0
    return-void

    .line 66
    :cond_0
    const/16 v0, 0x2710

    sput v0, Lcom/facebook/common/n/b;->b:I

    .line 67
    const/4 v0, 0x4

    sput v0, Lcom/facebook/common/n/b;->c:I

    .line 68
    const/16 v0, 0x8

    sput v0, Lcom/facebook/common/n/b;->d:I

    goto :goto_0
.end method

.method private static e()Z
    .locals 3

    .prologue
    .line 220
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "zh"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "ja"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "ko"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
