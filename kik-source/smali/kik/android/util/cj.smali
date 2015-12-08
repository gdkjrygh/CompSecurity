.class public final Lkik/android/util/cj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lkik/android/util/cj;


# instance fields
.field a:Ljava/util/HashMap;

.field private c:Lkik/android/util/bk;

.field private d:[Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0005

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/util/cj;->d:[Ljava/lang/String;

    .line 56
    invoke-direct {p0}, Lkik/android/util/cj;->b()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/util/cj;->a:Ljava/util/HashMap;

    .line 57
    new-instance v0, Lkik/android/util/bk;

    invoke-direct {v0}, Lkik/android/util/bk;-><init>()V

    iput-object v0, p0, Lkik/android/util/cj;->c:Lkik/android/util/bk;

    .line 58
    return-void
.end method

.method public static a()Lkik/android/util/cj;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lkik/android/util/cj;->b:Lkik/android/util/cj;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lkik/android/util/cj;

    invoke-direct {v0, p0}, Lkik/android/util/cj;-><init>(Landroid/content/Context;)V

    sput-object v0, Lkik/android/util/cj;->b:Lkik/android/util/cj;

    .line 43
    return-void
.end method

.method private b()Ljava/util/HashMap;
    .locals 4

    .prologue
    .line 66
    new-instance v1, Ljava/util/HashMap;

    iget-object v0, p0, Lkik/android/util/cj;->d:[Ljava/lang/String;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 67
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lkik/android/util/cj;->d:[Ljava/lang/String;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 68
    iget-object v2, p0, Lkik/android/util/cj;->d:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    :cond_0
    return-object v1
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)I
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/util/cj;->c:Lkik/android/util/bk;

    invoke-virtual {v0, p1}, Lkik/android/util/bk;->a(Ljava/lang/CharSequence;)[Lkik/android/util/bk$a;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public final b(Ljava/lang/CharSequence;)[Lkik/android/util/bk$a;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lkik/android/util/cj;->c:Lkik/android/util/bk;

    invoke-virtual {v0, p1}, Lkik/android/util/bk;->a(Ljava/lang/CharSequence;)[Lkik/android/util/bk$a;

    move-result-object v0

    return-object v0
.end method
