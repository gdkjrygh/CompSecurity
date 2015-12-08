.class public final Lcom/roidapp/baselib/c/w;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method

.method private static a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    const/high16 v1, 0x10000000

    .line 27
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 28
    invoke-virtual {p0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 29
    :cond_0
    return-void
.end method

.method private static a([Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 32
    if-eqz p0, :cond_0

    .line 33
    array-length v1, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p0, v0

    .line 34
    invoke-static {v2}, Lcom/roidapp/baselib/c/w;->a(Landroid/content/Intent;)V

    .line 33
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method


# virtual methods
.method public final startActivities([Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 51
    invoke-static {p1}, Lcom/roidapp/baselib/c/w;->a([Landroid/content/Intent;)V

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 53
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->startActivities([Landroid/content/Intent;)V

    .line 54
    :cond_0
    return-void
.end method

.method public final startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 57
    invoke-static {p1}, Lcom/roidapp/baselib/c/w;->a([Landroid/content/Intent;)V

    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 59
    invoke-super {p0, p1, p2}, Landroid/content/ContextWrapper;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 60
    :cond_0
    return-void
.end method

.method public final startActivity(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 40
    invoke-static {p1}, Lcom/roidapp/baselib/c/w;->a(Landroid/content/Intent;)V

    .line 41
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->startActivity(Landroid/content/Intent;)V

    .line 42
    return-void
.end method

.method public final startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 45
    invoke-static {p1}, Lcom/roidapp/baselib/c/w;->a(Landroid/content/Intent;)V

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 47
    invoke-super {p0, p1, p2}, Landroid/content/ContextWrapper;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 48
    :cond_0
    return-void
.end method
