.class public final Lcom/roidapp/photogrid/social/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ZLandroid/app/Activity;)V
    .locals 2

    .prologue
    .line 14
    if-eqz p0, :cond_0

    .line 15
    const/4 v0, 0x1

    const/16 v1, 0x33d8

    invoke-static {p1, v0, v1}, Lcom/roidapp/photogrid/social/SuggestFriendPage;->a(Landroid/app/Activity;ZI)V

    .line 17
    :cond_0
    return-void
.end method
