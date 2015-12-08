.class public final Lcom/roidapp/photogrid/common/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/roidapp/photogrid/common/ba;


# instance fields
.field public b:J

.field public c:J

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/ba;->d:Z

    .line 14
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/common/ba;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/roidapp/photogrid/common/ba;->a:Lcom/roidapp/photogrid/common/ba;

    if-nez v0, :cond_0

    .line 18
    new-instance v0, Lcom/roidapp/photogrid/common/ba;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/ba;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/ba;->a:Lcom/roidapp/photogrid/common/ba;

    .line 20
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/ba;->a:Lcom/roidapp/photogrid/common/ba;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 24
    .line 1040
    const-string v0, "DebugMode"

    invoke-virtual {p1, v0, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1041
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/ba;->d:Z

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/common/ba;->b:J

    .line 28
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/ba;->d:Z

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/common/ba;->c:J

    .line 33
    return-void
.end method
