.class public final Lcrittercism/android/ed;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcrittercism/android/ed$a;
    }
.end annotation


# static fields
.field public static final a:Lcrittercism/android/ed;


# instance fields
.field private b:Lcrittercism/android/ee;

.field private c:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcrittercism/android/ed;

    invoke-direct {v0}, Lcrittercism/android/ed;-><init>()V

    sput-object v0, Lcrittercism/android/ed;->a:Lcrittercism/android/ed;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lcrittercism/android/ed$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcrittercism/android/ed$a;-><init>(Lcrittercism/android/ed;B)V

    iput-object v0, p0, Lcrittercism/android/ed;->b:Lcrittercism/android/ee;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/ed;->c:Ljava/text/SimpleDateFormat;

    .line 25
    :try_start_0
    invoke-static {}, Lcrittercism/android/ed;->b()Ljava/text/SimpleDateFormat;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/ed;->c:Ljava/text/SimpleDateFormat;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static b()Ljava/text/SimpleDateFormat;
    .locals 3

    .prologue
    .line 36
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 37
    const-string v1, "GMT"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 38
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 67
    iget-object v0, p0, Lcrittercism/android/ed;->c:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcrittercism/android/ed;->b:Lcrittercism/android/ee;

    invoke-interface {v0}, Lcrittercism/android/ee;->a()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcrittercism/android/ed;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 52
    const-string v0, ""

    .line 54
    iget-object v1, p0, Lcrittercism/android/ed;->c:Ljava/text/SimpleDateFormat;

    if-eqz v1, :cond_0

    .line 55
    iget-object v0, p0, Lcrittercism/android/ed;->c:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 63
    :goto_0
    return-object v0

    .line 60
    :cond_0
    invoke-static {}, Lcrittercism/android/ed;->b()Ljava/text/SimpleDateFormat;

    goto :goto_0
.end method
