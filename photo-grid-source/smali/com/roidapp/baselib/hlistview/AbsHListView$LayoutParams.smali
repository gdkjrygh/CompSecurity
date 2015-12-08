.class public Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;
.super Landroid/view/ViewGroup$LayoutParams;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field public c:Z

.field public d:I

.field public e:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 5417
    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5406
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->e:J

    .line 5418
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->a:I

    .line 5419
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 5409
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5406
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->e:J

    .line 5410
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 5422
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5406
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->e:J

    .line 5423
    return-void
.end method
