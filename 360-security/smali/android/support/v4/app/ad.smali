.class Landroid/support/v4/app/ad;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method static a(Landroid/support/v4/app/ac$a;)Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 47
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 48
    const-string/jumbo v1, "resultKey"

    invoke-virtual {p0}, Landroid/support/v4/app/ac$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string/jumbo v1, "label"

    invoke-virtual {p0}, Landroid/support/v4/app/ac$a;->b()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 50
    const-string/jumbo v1, "choices"

    invoke-virtual {p0}, Landroid/support/v4/app/ac$a;->c()[Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 51
    const-string/jumbo v1, "allowFreeFormInput"

    invoke-virtual {p0}, Landroid/support/v4/app/ac$a;->d()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 52
    const-string/jumbo v1, "extras"

    invoke-virtual {p0}, Landroid/support/v4/app/ac$a;->e()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 53
    return-object v0
.end method

.method static a([Landroid/support/v4/app/ac$a;)[Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 69
    if-nez p0, :cond_0

    .line 70
    const/4 v0, 0x0

    .line 76
    :goto_0
    return-object v0

    .line 72
    :cond_0
    array-length v0, p0

    new-array v1, v0, [Landroid/os/Bundle;

    .line 73
    const/4 v0, 0x0

    :goto_1
    array-length v2, p0

    if-ge v0, v2, :cond_1

    .line 74
    aget-object v2, p0, v0

    invoke-static {v2}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/ac$a;)Landroid/os/Bundle;

    move-result-object v2

    aput-object v2, v1, v0

    .line 73
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 76
    goto :goto_0
.end method
