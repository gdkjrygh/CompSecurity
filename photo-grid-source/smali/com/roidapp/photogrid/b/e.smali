.class public final Lcom/roidapp/photogrid/b/e;
.super Lcom/cm/kinfoc/a/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/cm/kinfoc/a/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    invoke-static {p1}, Lcom/roidapp/photogrid/b/c;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    invoke-static {p1}, Lcom/roidapp/photogrid/b/c;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 113
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v0

    .line 1191
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ifcpds_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 113
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 108
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v0

    .line 1184
    if-eqz p1, :cond_0

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p2, :cond_0

    const-string v1, ""

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1185
    :cond_0
    :goto_0
    return-void

    .line 1187
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ifcpds_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/roidapp/photogrid/b/k;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()Landroid/app/Application;
    .locals 1

    .prologue
    .line 26
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/io/File;
    .locals 1

    .prologue
    .line 54
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/b/b;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 93
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->i:Z

    return v0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 98
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v0

    .line 1113
    const-string v1, "isAllowedReportInfo"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;)Z

    move-result v0

    .line 98
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 123
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()D
    .locals 2

    .prologue
    .line 198
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->b()D

    move-result-wide v0

    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 251
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i()I
    .locals 1

    .prologue
    .line 262
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->c()I

    move-result v0

    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 277
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 282
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .prologue
    .line 287
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 297
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 302
    invoke-static {}, Lcom/roidapp/photogrid/b/a;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
