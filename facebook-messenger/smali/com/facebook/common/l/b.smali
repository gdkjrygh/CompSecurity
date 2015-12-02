.class public Lcom/facebook/common/l/b;
.super Ljava/lang/Object;
.source "AppBuildInfoReader.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/common/l/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-string v0, "^[0-9]+L$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/l/b;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/l/h;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/common/l/b;->a:Landroid/content/Context;

    .line 39
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/l/h;

    iput-object v0, p0, Lcom/facebook/common/l/b;->c:Lcom/facebook/common/l/h;

    .line 40
    iget-object v0, p0, Lcom/facebook/common/l/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/l/b;->b:Ljava/lang/String;

    .line 41
    return-void
.end method

.method static a(J)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 83
    const/4 v0, 0x1

    const/4 v1, 0x0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, v1, v2}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v0

    .line 85
    const-string v1, "PST8PDT"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 86
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/common/l/b;->c:Lcom/facebook/common/l/h;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/common/l/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 103
    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method static b(Ljava/lang/String;)Z
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 91
    if-eqz p0, :cond_0

    sget-object v0, Lcom/facebook/common/l/b;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 95
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a()Lcom/facebook/common/l/a;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/common/l/b;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/common/l/b;->a(Ljava/lang/String;)Lcom/facebook/common/l/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/common/l/a;
    .locals 7

    .prologue
    .line 57
    const-string v0, "com.facebook.versioncontrol.revision"

    invoke-direct {p0, v0, p1}, Lcom/facebook/common/l/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    const-string v0, "com.facebook.versioncontrol.branch"

    invoke-direct {p0, v0, p1}, Lcom/facebook/common/l/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 65
    const-string v0, "com.facebook.build_time"

    invoke-direct {p0, v0, p1}, Lcom/facebook/common/l/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 67
    const-wide/16 v3, 0x0

    .line 68
    const-string v5, ""

    .line 72
    invoke-static {v0}, Lcom/facebook/common/l/b;->b(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 73
    invoke-static {v0}, Lcom/facebook/common/l/b;->c(Ljava/lang/String;)J

    move-result-wide v3

    .line 74
    invoke-static {v3, v4}, Lcom/facebook/common/l/b;->a(J)Ljava/lang/String;

    move-result-object v5

    .line 77
    :cond_0
    new-instance v0, Lcom/facebook/common/l/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/common/l/a;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object v0
.end method
