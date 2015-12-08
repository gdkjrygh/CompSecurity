.class public final Lcom/roidapp/videolib/b/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lcom/roidapp/videolib/b/l;->a:I

    .line 13
    iput-wide p2, p0, Lcom/roidapp/videolib/b/l;->b:J

    .line 14
    iput-wide p4, p0, Lcom/roidapp/videolib/b/l;->c:J

    .line 15
    return-void
.end method
