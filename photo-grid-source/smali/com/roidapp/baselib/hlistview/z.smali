.class final Lcom/roidapp/baselib/hlistview/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/HListView;

.field private b:I

.field private c:I


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/hlistview/HListView;)V
    .locals 0

    .prologue
    .line 1079
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/z;->a:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/hlistview/HListView;B)V
    .locals 0

    .prologue
    .line 1079
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/z;-><init>(Lcom/roidapp/baselib/hlistview/HListView;)V

    return-void
.end method


# virtual methods
.method public final a(II)Lcom/roidapp/baselib/hlistview/z;
    .locals 0

    .prologue
    .line 1085
    iput p1, p0, Lcom/roidapp/baselib/hlistview/z;->b:I

    .line 1086
    iput p2, p0, Lcom/roidapp/baselib/hlistview/z;->c:I

    .line 1087
    return-object p0
.end method

.method public final run()V
    .locals 3

    .prologue
    .line 1092
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/z;->a:Lcom/roidapp/baselib/hlistview/HListView;

    iget v1, p0, Lcom/roidapp/baselib/hlistview/z;->b:I

    iget v2, p0, Lcom/roidapp/baselib/hlistview/z;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/baselib/hlistview/HListView;->b(II)V

    .line 1093
    return-void
.end method
