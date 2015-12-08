.class public abstract Lkik/android/scan/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/scan/a/c$c;,
        Lkik/android/scan/a/c$b;,
        Lkik/android/scan/a/c$d;,
        Lkik/android/scan/a/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    return-void
.end method

.method public static a(Lcom/kik/scan/GroupKikCode;)Lkik/android/scan/a/c;
    .locals 1

    .prologue
    .line 41
    new-instance v0, Lkik/android/scan/a/c$b;

    invoke-direct {v0, p0}, Lkik/android/scan/a/c$b;-><init>(Lcom/kik/scan/GroupKikCode;)V

    return-object v0
.end method

.method public static a(Lcom/kik/scan/UsernameKikCode;)Lkik/android/scan/a/c;
    .locals 1

    .prologue
    .line 36
    new-instance v0, Lkik/android/scan/a/c$d;

    invoke-direct {v0, p0}, Lkik/android/scan/a/c$d;-><init>(Lcom/kik/scan/UsernameKikCode;)V

    return-object v0
.end method

.method public static a(Lkik/android/scan/a/a;)Lkik/android/scan/a/c;
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lkik/android/scan/a/c$a;

    invoke-direct {v0, p0}, Lkik/android/scan/a/c$a;-><init>(Lkik/android/scan/a/a;)V

    return-object v0
.end method

.method public static a([B[BLjava/lang/String;S)Lkik/android/scan/a/c;
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lkik/android/scan/a/c$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lkik/android/scan/a/c$c;-><init>([B[BLjava/lang/String;S)V

    return-object v0
.end method


# virtual methods
.method public abstract a()[B
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    return v0
.end method

.method public d()[B
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    return-object v0
.end method
