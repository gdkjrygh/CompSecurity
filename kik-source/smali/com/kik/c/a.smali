.class public final Lcom/kik/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/c/d;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lkik/a/e/v;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/a/e/v;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/c/a;->c:Ljava/lang/String;

    .line 24
    iput-object p1, p0, Lcom/kik/c/a;->a:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/kik/c/a;->b:Lkik/a/e/v;

    .line 26
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    invoke-static {}, Lkik/android/chat/KikApplication;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/kik/c/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/kik/c/a;->c:Ljava/lang/String;

    .line 49
    :goto_0
    return-object v0

    .line 41
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/kik/c/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 43
    iput-object v0, p0, Lcom/kik/c/a;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 49
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    invoke-static {}, Lkik/android/chat/KikApplication;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lkik/a/d/j;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/kik/c/a;->b:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_0

    .line 68
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
