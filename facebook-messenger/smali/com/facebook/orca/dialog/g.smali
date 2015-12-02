.class public Lcom/facebook/orca/dialog/g;
.super Ljava/lang/Object;
.source "MenuDialogItemUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/orca/dialog/MenuDialogItem;)Z
    .locals 1

    .prologue
    .line 13
    invoke-virtual {p0}, Lcom/facebook/orca/dialog/MenuDialogItem;->b()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/facebook/orca/dialog/MenuDialogItem;)Z
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0}, Lcom/facebook/orca/dialog/MenuDialogItem;->c()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
