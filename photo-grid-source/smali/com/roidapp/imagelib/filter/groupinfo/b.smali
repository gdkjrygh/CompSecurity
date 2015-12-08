.class public final Lcom/roidapp/imagelib/filter/groupinfo/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 5
    if-nez p0, :cond_1

    .line 9
    :cond_0
    :goto_0
    return v0

    .line 7
    :cond_1
    invoke-interface {p0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    const/4 v0, 0x1

    goto :goto_0
.end method
