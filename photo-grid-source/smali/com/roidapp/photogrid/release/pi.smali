.class public final Lcom/roidapp/photogrid/release/pi;
.super Lcom/roidapp/photogrid/release/oi;
.source "SourceFile"


# instance fields
.field private r:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;I)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;-><init>()V

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/pi;->r:I

    .line 15
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pi;->b:Landroid/app/Activity;

    .line 16
    iput-object p2, p0, Lcom/roidapp/photogrid/release/pi;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 17
    iput-object p3, p0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    .line 18
    iput p4, p0, Lcom/roidapp/photogrid/release/pi;->r:I

    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/high16 v2, 0x3f400000    # 0.75f

    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pi;->c:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 1084
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pi;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 1089
    iget v1, p0, Lcom/roidapp/photogrid/release/pi;->r:I

    if-ne v1, v10, :cond_1

    .line 1090
    iget v6, p0, Lcom/roidapp/photogrid/release/pi;->f:I

    .line 1091
    int-to-float v1, v6

    mul-float/2addr v1, v2

    float-to-int v5, v1

    .line 1092
    iget v1, p0, Lcom/roidapp/photogrid/release/pi;->f:I

    add-int/lit8 v3, v1, 0xa

    .line 1093
    mul-int v1, v5, v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x5

    add-int v2, v1, v0

    .line 1100
    :goto_0
    new-instance v0, Lcom/roidapp/photogrid/release/rm;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pi;->b:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/pi;->c:[Lcom/roidapp/photogrid/release/ig;

    iget v7, p0, Lcom/roidapp/photogrid/release/pi;->r:I

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/pi;->c()I

    move-result v8

    iget-object v9, p0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-direct/range {v0 .. v9}, Lcom/roidapp/photogrid/release/rm;-><init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;IIIILcom/roidapp/photogrid/release/ml;)V

    .line 27
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x8

    invoke-virtual {v1, v2, v10}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 28
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pi;->b:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/content/Context;)I

    .line 29
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rm;->b()V

    .line 31
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/release/pj;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/pj;-><init>(Lcom/roidapp/photogrid/release/pi;Lcom/roidapp/photogrid/release/rm;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 81
    return-void

    .line 1095
    :cond_1
    iget v5, p0, Lcom/roidapp/photogrid/release/pi;->f:I

    .line 1096
    int-to-float v1, v5

    mul-float/2addr v1, v2

    float-to-int v6, v1

    .line 1097
    iget v1, p0, Lcom/roidapp/photogrid/release/pi;->f:I

    add-int/lit8 v2, v1, 0xa

    .line 1098
    mul-int v1, v6, v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x5

    add-int v3, v1, v0

    goto :goto_0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 107
    return-void
.end method
