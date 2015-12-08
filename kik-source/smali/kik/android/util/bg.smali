.class public final Lkik/android/util/bg;
.super Lcom/kik/m/a;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/kik/m/a;-><init>(Landroid/content/Context;)V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/bg;->e:Z

    .line 20
    invoke-direct {p0}, Lkik/android/util/bg;->h()V

    .line 21
    return-void
.end method

.method private h()V
    .locals 2

    .prologue
    .line 68
    invoke-virtual {p0}, Lkik/android/util/bg;->b()Ljava/util/Properties;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    const-string v1, "branch_name"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/util/bg;->a:Ljava/lang/String;

    .line 71
    const-string v1, "build_time"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/util/bg;->b:Ljava/lang/String;

    .line 72
    const-string v1, "commit_hash"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/util/bg;->c:Ljava/lang/String;

    .line 73
    const-string v1, "hostname"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/util/bg;->d:Ljava/lang/String;

    .line 74
    const-string v1, "automation_enabled"

    invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/util/bg;->e:Z

    .line 76
    :cond_0
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/util/bg;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 27
    invoke-direct {p0}, Lkik/android/util/bg;->h()V

    .line 29
    :cond_0
    iget-object v0, p0, Lkik/android/util/bg;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/util/bg;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 36
    invoke-direct {p0}, Lkik/android/util/bg;->h()V

    .line 38
    :cond_0
    iget-object v0, p0, Lkik/android/util/bg;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/util/bg;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 45
    invoke-direct {p0}, Lkik/android/util/bg;->h()V

    .line 47
    :cond_0
    iget-object v0, p0, Lkik/android/util/bg;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/util/bg;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 54
    invoke-direct {p0}, Lkik/android/util/bg;->h()V

    .line 56
    :cond_0
    iget-object v0, p0, Lkik/android/util/bg;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lkik/android/util/bg;->e:Z

    return v0
.end method
