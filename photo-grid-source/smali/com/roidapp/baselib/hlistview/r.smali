.class Lcom/roidapp/baselib/hlistview/r;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Parcelable;

.field final synthetic b:Lcom/roidapp/baselib/hlistview/AdapterView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/hlistview/AdapterView;)V
    .locals 1

    .prologue
    .line 807
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 809
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->a:Landroid/os/Parcelable;

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .prologue
    .line 816
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->aj:Z

    .line 817
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget v1, v1, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ap:I

    .line 818
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    .line 823
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->a:Landroid/os/Parcelable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ap:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    if-lez v0, :cond_0

    .line 828
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/r;->a:Landroid/os/Parcelable;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/hlistview/AdapterView;->a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/os/Parcelable;)V

    .line 829
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->a:Landroid/os/Parcelable;

    .line 836
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->v()V

    .line 837
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->requestLayout()V

    .line 838
    return-void

    .line 834
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->y()V

    goto :goto_0
.end method

.method public onInvalidated()V
    .locals 6

    .prologue
    const-wide/high16 v4, -0x8000000000000000L

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 845
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->aj:Z

    .line 847
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 850
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->a(Lcom/roidapp/baselib/hlistview/AdapterView;)Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->a:Landroid/os/Parcelable;

    .line 854
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget v1, v1, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    iput v1, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ap:I

    .line 855
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iput v3, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    .line 856
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iput v2, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    .line 857
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iput-wide v4, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    .line 858
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iput v2, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 859
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iput-wide v4, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    .line 860
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    iput-boolean v3, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 862
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->v()V

    .line 863
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/r;->b:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->requestLayout()V

    .line 864
    return-void
.end method
