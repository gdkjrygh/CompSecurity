.class public final Lcom/roidapp/baselib/c/ad;
.super Landroid/support/v7/widget/ax;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v7/widget/ax;"
    }
.end annotation


# instance fields
.field private final a:Lcom/roidapp/baselib/c/ac;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/k",
            "<TT;>;",
            "Lcom/bumptech/glide/l",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/support/v7/widget/ax;-><init>()V

    .line 32
    new-instance v0, Lcom/bumptech/glide/j;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/j;-><init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/l;)V

    .line 34
    new-instance v1, Lcom/roidapp/baselib/c/ac;

    invoke-direct {v1, v0}, Lcom/roidapp/baselib/c/ac;-><init>(Landroid/widget/AbsListView$OnScrollListener;)V

    iput-object v1, p0, Lcom/roidapp/baselib/c/ad;->a:Lcom/roidapp/baselib/c/ac;

    .line 35
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/baselib/c/ad;->a:Lcom/roidapp/baselib/c/ac;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/baselib/c/ac;->a(Landroid/support/v7/widget/RecyclerView;II)V

    .line 40
    return-void
.end method
