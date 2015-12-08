.class Lcom/roidapp/baselib/hlistview/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field final synthetic c:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 0

    .prologue
    .line 2475
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/p;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;B)V
    .locals 0

    .prologue
    .line 2475
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/p;-><init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 2480
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/p;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Lcom/roidapp/baselib/hlistview/AbsHListView;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/p;->a:I

    .line 2481
    return-void
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 2484
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/p;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/p;->c:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Lcom/roidapp/baselib/hlistview/AbsHListView;)I

    move-result v0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/p;->a:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
