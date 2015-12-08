.class public final Lcom/roidapp/photogrid/cloud/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/aj;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:Ljava/lang/String;

.field private g:J


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ak;->a:Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/ak;->b:Ljava/lang/String;

    .line 180
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/ak;->c:Ljava/lang/String;

    .line 181
    iput-object p4, p0, Lcom/roidapp/photogrid/cloud/ak;->d:Ljava/lang/String;

    .line 182
    iput-wide p5, p0, Lcom/roidapp/photogrid/cloud/ak;->e:J

    .line 183
    iput-object p7, p0, Lcom/roidapp/photogrid/cloud/ak;->f:Ljava/lang/String;

    .line 184
    iput-wide p8, p0, Lcom/roidapp/photogrid/cloud/ak;->g:J

    .line 185
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JB)V
    .locals 0

    .prologue
    .line 170
    invoke-direct/range {p0 .. p9}, Lcom/roidapp/photogrid/cloud/ak;-><init>(Lcom/roidapp/photogrid/cloud/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ak;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ak;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ak;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()J
    .locals 2

    .prologue
    .line 200
    iget-wide v0, p0, Lcom/roidapp/photogrid/cloud/ak;->e:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 204
    iget-wide v0, p0, Lcom/roidapp/photogrid/cloud/ak;->g:J

    return-wide v0
.end method
