.class final Lcom/roidapp/baselib/hlistview/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AdapterView;


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/hlistview/AdapterView;)V
    .locals 0

    .prologue
    .line 877
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/v;->a:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/hlistview/AdapterView;B)V
    .locals 0

    .prologue
    .line 877
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/v;-><init>(Lcom/roidapp/baselib/hlistview/AdapterView;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 881
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/v;->a:Lcom/roidapp/baselib/hlistview/AdapterView;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/AdapterView;->aj:Z

    if-eqz v0, :cond_1

    .line 885
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/v;->a:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 886
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/v;->a:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->post(Ljava/lang/Runnable;)Z

    .line 892
    :cond_0
    :goto_0
    return-void

    .line 889
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/v;->a:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->b(Lcom/roidapp/baselib/hlistview/AdapterView;)V

    .line 890
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/v;->a:Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->c(Lcom/roidapp/baselib/hlistview/AdapterView;)V

    goto :goto_0
.end method
