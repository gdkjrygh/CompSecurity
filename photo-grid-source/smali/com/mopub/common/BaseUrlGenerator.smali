.class public abstract Lcom/mopub/common/BaseUrlGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/StringBuilder;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Landroid/graphics/Point;)V
    .locals 3

    .prologue
    .line 99
    const-string v0, "w"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p1, Landroid/graphics/Point;->x:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "h"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    return-void
.end method

.method protected final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 22
    invoke-static {}, Lcom/mopub/network/Networking;->useHttps()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "https"

    .line 23
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "://"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/BaseUrlGenerator;->a:Ljava/lang/StringBuilder;

    .line 24
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/common/BaseUrlGenerator;->b:Z

    .line 25
    return-void

    .line 22
    :cond_0
    const-string v0, "http"

    goto :goto_0
.end method

.method protected final a(Z)V
    .locals 2

    .prologue
    .line 59
    const-string v1, "android_perms_ext_storage"

    if-eqz p1, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    return-void

    .line 59
    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method

.method protected final varargs a([Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    .line 69
    aget-object v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    :cond_0
    aget-object v0, p1, v4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    const-string v0, "dn"

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    return-void
.end method

.method protected final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/mopub/common/BaseUrlGenerator;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 51
    const-string v0, "v"

    invoke-virtual {p0, v0, p1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    return-void
.end method

.method protected final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 32
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    :goto_0
    return-void

    .line 36
    :cond_0
    iget-object v1, p0, Lcom/mopub/common/BaseUrlGenerator;->a:Ljava/lang/StringBuilder;

    .line 1043
    iget-boolean v0, p0, Lcom/mopub/common/BaseUrlGenerator;->b:Z

    if-eqz v0, :cond_1

    .line 1044
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/common/BaseUrlGenerator;->b:Z

    .line 1045
    const-string v0, "?"

    .line 36
    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    iget-object v0, p0, Lcom/mopub/common/BaseUrlGenerator;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    iget-object v0, p0, Lcom/mopub/common/BaseUrlGenerator;->a:Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    iget-object v0, p0, Lcom/mopub/common/BaseUrlGenerator;->a:Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1047
    :cond_1
    const-string v0, "&"

    goto :goto_1
.end method

.method protected final b(Z)V
    .locals 2

    .prologue
    .line 77
    const-string v1, "dnt"

    if-eqz p1, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    return-void

    .line 77
    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method

.method protected final c()V
    .locals 2

    .prologue
    .line 89
    const-string v0, "udid"

    const-string v1, "mp_tmpl_advertising_id"

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "dnt"

    const-string v1, "mp_tmpl_do_not_track"

    invoke-virtual {p0, v0, v1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    return-void
.end method

.method protected final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 55
    const-string v0, "av"

    invoke-virtual {p0, v0, p1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method protected final d(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 81
    const-string v0, "udid"

    invoke-virtual {p0, v0, p1}, Lcom/mopub/common/BaseUrlGenerator;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public abstract generateUrlString(Ljava/lang/String;)Ljava/lang/String;
.end method
