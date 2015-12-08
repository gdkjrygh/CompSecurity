.class final Lkik/android/scan/a/c$c;
.super Lkik/android/scan/a/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/scan/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:S

.field final c:[B

.field final d:[B


# direct methods
.method constructor <init>([B[BLjava/lang/String;S)V
    .locals 0

    .prologue
    .line 159
    invoke-direct {p0}, Lkik/android/scan/a/c;-><init>()V

    .line 160
    iput-short p4, p0, Lkik/android/scan/a/c$c;->b:S

    .line 161
    iput-object p3, p0, Lkik/android/scan/a/c$c;->a:Ljava/lang/String;

    .line 162
    iput-object p2, p0, Lkik/android/scan/a/c$c;->d:[B

    .line 163
    iput-object p1, p0, Lkik/android/scan/a/c$c;->c:[B

    .line 164
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lkik/android/scan/a/c$c;->c:[B

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lkik/android/scan/a/c$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 181
    iget-short v0, p0, Lkik/android/scan/a/c$c;->b:S

    return v0
.end method

.method public final d()[B
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lkik/android/scan/a/c$c;->d:[B

    return-object v0
.end method
