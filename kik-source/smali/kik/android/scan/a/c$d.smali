.class final Lkik/android/scan/a/c$d;
.super Lkik/android/scan/a/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/scan/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field a:Lcom/kik/scan/UsernameKikCode;


# direct methods
.method constructor <init>(Lcom/kik/scan/UsernameKikCode;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/scan/a/c;-><init>()V

    .line 93
    iput-object p1, p0, Lkik/android/scan/a/c$d;->a:Lcom/kik/scan/UsernameKikCode;

    .line 94
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 2

    .prologue
    .line 99
    const/4 v0, 0x0

    .line 101
    iget-object v1, p0, Lkik/android/scan/a/c$d;->a:Lcom/kik/scan/UsernameKikCode;

    if-eqz v1, :cond_0

    .line 102
    iget-object v0, p0, Lkik/android/scan/a/c$d;->a:Lcom/kik/scan/UsernameKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/UsernameKikCode;->encode()[B

    move-result-object v0

    .line 105
    :cond_0
    if-nez v0, :cond_1

    .line 106
    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 109
    :cond_1
    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lkik/android/scan/a/c$d;->a:Lcom/kik/scan/UsernameKikCode;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/scan/a/c$d;->a:Lcom/kik/scan/UsernameKikCode;

    invoke-virtual {v0}, Lcom/kik/scan/UsernameKikCode;->getNonce()I

    move-result v0

    goto :goto_0
.end method
