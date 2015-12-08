.class public final Lcrittercism/android/cm;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object v0, Lcrittercism/android/cn;->d:Lcrittercism/android/cn;

    invoke-virtual {v0}, Lcrittercism/android/cn;->ordinal()I

    move-result v0

    iput v0, p0, Lcrittercism/android/cm;->a:I

    .line 5
    sget-object v0, Lcrittercism/android/cl;->a:Lcrittercism/android/cl;

    invoke-virtual {v0}, Lcrittercism/android/cl;->ordinal()I

    move-result v0

    iput v0, p0, Lcrittercism/android/cm;->b:I

    .line 24
    if-eqz p1, :cond_0

    .line 25
    invoke-static {p1}, Lcrittercism/android/cn;->a(Ljava/lang/Throwable;)I

    move-result v0

    iput v0, p0, Lcrittercism/android/cm;->a:I

    .line 26
    iget v0, p0, Lcrittercism/android/cm;->a:I

    sget-object v1, Lcrittercism/android/cn;->d:Lcrittercism/android/cn;

    invoke-virtual {v1}, Lcrittercism/android/cn;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 27
    invoke-static {p1}, Lcrittercism/android/cl;->a(Ljava/lang/Throwable;)Lcrittercism/android/cl;

    move-result-object v0

    invoke-virtual {v0}, Lcrittercism/android/cl;->a()I

    move-result v0

    iput v0, p0, Lcrittercism/android/cm;->b:I

    .line 32
    :cond_0
    :goto_0
    return-void

    .line 29
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcrittercism/android/cm;->b:I

    goto :goto_0
.end method
