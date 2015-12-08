.class final Lkik/android/scan/a/c$a;
.super Lkik/android/scan/a/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/scan/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field a:Lkik/android/scan/a/a;


# direct methods
.method constructor <init>(Lkik/android/scan/a/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lkik/android/scan/a/c;-><init>()V

    .line 55
    iput-object p1, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    .line 56
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 2

    .prologue
    .line 61
    const/4 v0, 0x0

    .line 63
    iget-object v1, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    invoke-virtual {v1}, Lkik/android/scan/a/a;->c()Lcom/kik/scan/RemoteKikCode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 64
    iget-object v0, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    invoke-virtual {v0}, Lkik/android/scan/a/a;->c()Lcom/kik/scan/RemoteKikCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/scan/RemoteKikCode;->encode()[B

    move-result-object v0

    .line 67
    :cond_0
    if-nez v0, :cond_1

    .line 68
    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 71
    :cond_1
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    invoke-virtual {v0}, Lkik/android/scan/a/a;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/scan/a/c$a;->a:Lkik/android/scan/a/a;

    invoke-virtual {v0}, Lkik/android/scan/a/a;->a()I

    move-result v0

    goto :goto_0
.end method
