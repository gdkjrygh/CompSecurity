.class public abstract Lkik/android/gifs/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lkik/a/d/a/a$c;

.field public static b:Lkik/a/d/a/a$c;

.field public static c:Lkik/android/gifs/a/f$a;

.field public static d:Lkik/android/gifs/a/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lkik/a/d/a/a$c;->b:Lkik/a/d/a/a$c;

    sput-object v0, Lkik/android/gifs/a;->a:Lkik/a/d/a/a$c;

    .line 16
    sget-object v0, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    sput-object v0, Lkik/android/gifs/a;->b:Lkik/a/d/a/a$c;

    .line 17
    sget-object v0, Lkik/android/gifs/a/f$a;->c:Lkik/android/gifs/a/f$a;

    sput-object v0, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    .line 18
    sget-object v0, Lkik/android/gifs/a/f$a;->g:Lkik/android/gifs/a/f$a;

    sput-object v0, Lkik/android/gifs/a;->d:Lkik/android/gifs/a/f$a;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 21
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 22
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    .line 23
    const/16 v1, 0x40

    if-gt v0, v1, :cond_0

    .line 24
    sget-object v0, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    sput-object v0, Lkik/android/gifs/a;->a:Lkik/a/d/a/a$c;

    .line 27
    :cond_0
    return-void
.end method

.method public static a(Lkik/a/d/a/a;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 34
    sget-object v2, Lkik/android/gifs/a;->a:Lkik/a/d/a/a$c;

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->b(Lkik/a/d/a/a$c;)Z

    move-result v3

    .line 35
    sget-object v2, Lkik/android/gifs/a;->b:Lkik/a/d/a/a$c;

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->b(Lkik/a/d/a/a$c;)Z

    move-result v4

    .line 36
    invoke-virtual {p0}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    move v2, v1

    .line 38
    :goto_0
    if-nez v3, :cond_0

    if-eqz v4, :cond_1

    :cond_0
    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    return v0

    :cond_2
    move v2, v0

    .line 36
    goto :goto_0
.end method
