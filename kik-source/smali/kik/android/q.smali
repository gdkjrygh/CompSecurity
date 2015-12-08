.class public final Lkik/android/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/q$a;
    }
.end annotation


# static fields
.field private static a:Lkik/android/q;


# instance fields
.field private b:Lkik/android/q$a;

.field private c:Lcom/kik/g/p;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    return-void
.end method

.method static synthetic a(Lkik/android/q;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/q;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static a()Lkik/android/q;
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lkik/android/q;->a:Lkik/android/q;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lkik/android/q;

    invoke-direct {v0}, Lkik/android/q;-><init>()V

    sput-object v0, Lkik/android/q;->a:Lkik/android/q;

    .line 33
    :cond_0
    sget-object v0, Lkik/android/q;->a:Lkik/android/q;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/net/Uri;Landroid/content/Context;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Lkik/android/q;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/q;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lkik/android/q;->c:Lcom/kik/g/p;

    .line 54
    :goto_0
    return-object v0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lkik/android/q;->b()V

    .line 43
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/q;->c:Lcom/kik/g/p;

    .line 44
    iget-object v0, p0, Lkik/android/q;->c:Lcom/kik/g/p;

    new-instance v1, Lkik/android/r;

    invoke-direct {v1, p0}, Lkik/android/r;-><init>(Lkik/android/q;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 51
    new-instance v0, Lkik/android/q$a;

    iget-object v1, p0, Lkik/android/q;->c:Lcom/kik/g/p;

    invoke-direct {v0, p2, p1, v1}, Lkik/android/q$a;-><init>(Landroid/content/Context;Landroid/net/Uri;Lcom/kik/g/p;)V

    iput-object v0, p0, Lkik/android/q;->b:Lkik/android/q$a;

    .line 52
    iget-object v0, p0, Lkik/android/q;->b:Lkik/android/q$a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/q$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 53
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/q;->d:Ljava/lang/String;

    .line 54
    iget-object v0, p0, Lkik/android/q;->c:Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 59
    iget-object v0, p0, Lkik/android/q;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/q;->d:Ljava/lang/String;

    .line 61
    iget-object v0, p0, Lkik/android/q;->b:Lkik/android/q$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/q$a;->cancel(Z)Z

    .line 62
    iget-object v0, p0, Lkik/android/q;->c:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Throwable;

    const-string v2, "task canceled"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 64
    :cond_0
    return-void
.end method
