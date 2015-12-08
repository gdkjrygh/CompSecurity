.class public final Lcom/roidapp/baselib/hlistview/c;
.super Lcom/roidapp/baselib/hlistview/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/hlistview/AdapterView",
        "<",
        "Landroid/widget/ListAdapter;",
        ">.com/roidapp/baselib/hlistview/r;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 0

    .prologue
    .line 5355
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/c;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/r;-><init>(Lcom/roidapp/baselib/hlistview/AdapterView;)V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 0

    .prologue
    .line 5362
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/r;->onChanged()V

    .line 5363
    return-void
.end method

.method public final onInvalidated()V
    .locals 0

    .prologue
    .line 5370
    invoke-super {p0}, Lcom/roidapp/baselib/hlistview/r;->onInvalidated()V

    .line 5371
    return-void
.end method
