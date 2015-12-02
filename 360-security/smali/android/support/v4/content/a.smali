.class public Landroid/support/v4/content/a;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 99
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    .line 101
    invoke-static {p0, p1, p2}, Landroid/support/v4/content/c;->a(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 107
    :goto_0
    return v0

    .line 103
    :cond_0
    const/16 v2, 0xb

    if-lt v1, v2, :cond_1

    .line 104
    invoke-static {p0, p1}, Landroid/support/v4/content/b;->a(Landroid/content/Context;[Landroid/content/Intent;)V

    goto :goto_0

    .line 107
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
