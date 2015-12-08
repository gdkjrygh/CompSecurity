.class public final Lcom/roidapp/photogrid/b/h;
.super Lcom/cm/kinfoc/a/g;
.source "SourceFile"


# static fields
.field private static b:Lcom/roidapp/photogrid/b/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/b/h;->b:Lcom/roidapp/photogrid/b/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/cm/kinfoc/a/g;-><init>()V

    .line 25
    new-instance v0, Lcom/cm/kinfoc/a/c;

    invoke-direct {v0}, Lcom/cm/kinfoc/a/c;-><init>()V

    .line 26
    invoke-virtual {v0}, Lcom/cm/kinfoc/a/c;->b()Lcom/cm/kinfoc/a/c;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/b/i;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/b/i;-><init>(Lcom/roidapp/photogrid/b/h;)V

    invoke-virtual {v0, v1}, Lcom/cm/kinfoc/a/c;->a(Lcom/cm/kinfoc/a/d;)Lcom/cm/kinfoc/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/c;->a()Lcom/cm/kinfoc/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/b/h;->a:Lcom/cm/kinfoc/a/a;

    .line 45
    return-void
.end method

.method static synthetic b(Lcom/cm/kinfoc/a/j;)V
    .locals 12

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 10
    .line 1059
    if-nez p0, :cond_0

    .line 1106
    :goto_0
    return-void

    .line 1063
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v3

    .line 1064
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v0

    .line 2086
    const-string v4, "InfocReportAvailable"

    const-string v5, "0-1"

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/photogrid/b/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1065
    const-string v4, "-"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 1067
    array-length v0, v4

    const/4 v5, 0x2

    if-ge v0, v5, :cond_4

    move v0, v1

    .line 1071
    :goto_1
    aget-object v2, v4, v2

    const/16 v5, 0xa

    invoke-static {v2, v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v6

    .line 1072
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 1074
    sub-long v6, v8, v6

    const-wide/32 v10, 0xdbba00

    cmp-long v2, v6, v10

    if-gtz v2, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    invoke-static {v3}, Lcom/roidapp/photogrid/b/d;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1100
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v0

    const-string v2, "1"

    invoke-virtual {v0, v8, v9, v2}, Lcom/roidapp/photogrid/b/k;->a(JLjava/lang/String;)V

    .line 1101
    sget v0, Lcom/cm/kinfoc/a/i;->d:I

    invoke-interface {p0, v1}, Lcom/cm/kinfoc/a/j;->a(Z)V

    goto :goto_0

    .line 1104
    :cond_2
    if-eqz v0, :cond_3

    .line 1105
    sget v0, Lcom/cm/kinfoc/a/i;->d:I

    invoke-interface {p0, v1}, Lcom/cm/kinfoc/a/j;->a(Z)V

    .line 1106
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v8, v9, v1}, Lcom/roidapp/photogrid/b/k;->a(JLjava/lang/String;)V

    goto :goto_0

    .line 1108
    :cond_3
    aget-object v0, v4, v1

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    .line 1109
    sget v1, Lcom/cm/kinfoc/a/i;->d:I

    invoke-interface {p0, v0}, Lcom/cm/kinfoc/a/j;->a(Z)V

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_1
.end method


# virtual methods
.method public final a(Lcom/cm/kinfoc/a/j;)V
    .locals 2

    .prologue
    .line 53
    new-instance v0, Lcom/cm/kinfoc/a/h;

    invoke-direct {v0, p0, p1}, Lcom/cm/kinfoc/a/h;-><init>(Lcom/cm/kinfoc/a/g;Lcom/cm/kinfoc/a/j;)V

    .line 54
    iget-object v1, p0, Lcom/roidapp/photogrid/b/h;->a:Lcom/cm/kinfoc/a/a;

    invoke-virtual {v1, v0}, Lcom/cm/kinfoc/a/a;->a(Ljava/lang/Object;)V

    .line 55
    return-void
.end method
