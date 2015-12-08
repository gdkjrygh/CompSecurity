.class public final Lcrittercism/android/cp;
.super Ljava/lang/Throwable;


# static fields
.field private static final serialVersionUID:J = -0x1b060f4d0d50af6bL


# instance fields
.field private a:Ljava/lang/String;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcrittercism/android/cp;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 147
    invoke-virtual {p0}, Lcrittercism/android/cp;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    .line 148
    iget-object v0, p0, Lcrittercism/android/cp;->a:Ljava/lang/String;

    .line 149
    if-nez v1, :cond_0

    .line 152
    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
